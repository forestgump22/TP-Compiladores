#ifndef DRIVER_H
#define DRIVER_H

#include "ExprBaseVisitor.h"
#include "llvm/IR/IRBuilder.h"
#include "llvm/IR/LLVMContext.h"
#include "llvm/IR/Module.h"
#include <string>
#include <map>

using namespace antlr4;
using namespace llvm;
using namespace std;

class Driver : public ExprBaseVisitor {
private:
    LLVMContext &C;
    unique_ptr<Module> M;
    unique_ptr<IRBuilder<>> builder;
    map<string, Value *> variables; // Mapa de variables declaradas

    IntegerType *i32Ty;

    // Crear una constante entera
    Value *ConstI32(int val) {
        return ConstantInt::get(i32Ty, val);
    }

    // Crear una constante de cadena
    Value *ConstString(const string &str) {
        return builder->CreateGlobalString(str);
    }

    // Obtener o crear la función printf
    Function *getOrCreatePrintf() {
        Function *printfFn = M->getFunction("printf");
        if (!printfFn) {
            FunctionType *printfTy = FunctionType::get(
                Type::getInt32Ty(C),
                PointerType::get(Type::getInt8Ty(C), 0), true);
            printfFn = Function::Create(printfTy, Function::ExternalLinkage, "printf", M.get());
        }
        return printfFn;
    }

public:
    Driver(const string &sourceFileName, LLVMContext &C)
        : C(C), M(make_unique<Module>(sourceFileName, C)), builder(make_unique<IRBuilder<>>(C)) {
        i32Ty = IntegerType::getInt32Ty(C);
    }

    Module *getModule() {
        return M.get();
    }

    // Función principal
    virtual std::any visitPrincipal(ExprParser::PrincipalContext *ctx) override {
        FunctionType *mainFnTy = FunctionType::get(i32Ty, false);
        Function *mainFn = Function::Create(mainFnTy, Function::ExternalLinkage, "language", M.get());
        BasicBlock *entryBB = BasicBlock::Create(C, "language.0", mainFn);
        builder->SetInsertPoint(entryBB);

        visit(ctx->mainBody());

        builder->CreateRet(ConstI32(0));
        return nullptr;
    }

    // Declaración de variables
    virtual std::any visitVarDeclaracionStmt(ExprParser::VarDeclaracionStmtContext *ctx) override {
        string varName = ctx->ID()->getText();
        Value *initVal = std::any_cast<Value *>(visit(ctx->exp()));
        AllocaInst * alloc = builder->CreateAlloca(i32Ty, nullptr, varName.c_str());
        variables[varName] = alloc;
        builder->CreateStore(initVal, variables[varName]);
        return nullptr;
    }

    // Asignación de variables
    virtual std::any visitVarAsignacionStmt(ExprParser::VarAsignacionStmtContext *ctx) override {
        string varName = ctx->ID()->getText();
        Value *newVal = std::any_cast<Value *>(visit(ctx->exp()));
        if (!variables.count(varName)) {
            cerr << "Error: Variable no declarada: " << varName << endl;
            exit(1);
        }
        builder->CreateStore(newVal, variables[varName]);
        return nullptr;
    }

    // Manejo de identificadores (variables)
    virtual std::any visitID(ExprParser::IDContext *ctx) override {
        string varName = ctx->getText();
        if (!variables.count(varName)) {
            cerr << "Error: Variable no declarada: " << varName << endl;
            exit(1);
        }
        AllocaInst *varPtr = cast<AllocaInst>(variables[varName]);

        Value *varValue = builder->CreateLoad(i32Ty, varPtr, varName.c_str());

        return varValue;
    }

    virtual std::any visitParenthesis(ExprParser::ParenthesisContext *ctx) override {
        return std::any_cast<Value *>(visit(ctx->exp()));
    }

    // Operaciones aritméticas
    virtual std::any visitAddition(ExprParser::AdditionContext *ctx) override {
        Value *lhs = std::any_cast<Value *>(visit(ctx->exp(0)));
        Value *rhs = std::any_cast<Value *>(visit(ctx->exp(1)));
        return builder->CreateAdd(lhs, rhs, "addtmp");
    }

    virtual std::any visitSubtraction(ExprParser::SubtractionContext *ctx) override {
        Value *lhs = std::any_cast<Value *>(visit(ctx->exp(0)));
        Value *rhs = std::any_cast<Value *>(visit(ctx->exp(1)));
        return builder->CreateSub(lhs, rhs, "subtmp");
    }

    virtual std::any visitMultiplication(ExprParser::MultiplicationContext *ctx) override {
        Value *lhs = std::any_cast<Value *>(visit(ctx->exp(0)));
        Value *rhs = std::any_cast<Value *>(visit(ctx->exp(1)));
        return builder->CreateMul(lhs, rhs, "multmp");
    }

    virtual std::any visitDivision(ExprParser::DivisionContext *ctx) override {
        Value *lhs = std::any_cast<Value *>(visit(ctx->exp(0)));
        Value *rhs = std::any_cast<Value *>(visit(ctx->exp(1)));
        return builder->CreateSDiv(lhs, rhs, "divtmp");
    }

    // Salida de valores
    virtual std::any visitOutputStmt(ExprParser::OutputStmtContext *ctx) override {
        Value *output = std::any_cast<Value *>(visit(ctx->exp()));

        Function *printfFn = getOrCreatePrintf();
        Value *formatStr;

        if (output->getType()->isIntegerTy()) {
            formatStr = ConstString("%d\n");
        } else if (output->getType()->isPointerTy()) {
            formatStr = ConstString("%s\n");
        } else {
            cerr << "Error: Tipo no soportado en salida." << endl;
            exit(1);
        }

        builder->CreateCall(printfFn, {formatStr, output});
        return nullptr;
    }

// Comparaciones lógicas
    virtual std::any visitGreaterThan(ExprParser::GreaterThanContext *ctx) override {
        Value *lhs = std::any_cast<Value *>(visit(ctx->exp(0)));
        Value *rhs = std::any_cast<Value *>(visit(ctx->exp(1)));
        return builder->CreateICmpSGT(lhs, rhs, "gttmp"); // Mayor que
    }

    virtual std::any visitLessThan(ExprParser::LessThanContext *ctx) override {
        Value *lhs = std::any_cast<Value *>(visit(ctx->exp(0)));
        Value *rhs = std::any_cast<Value *>(visit(ctx->exp(1)));
        return builder->CreateICmpSLT(lhs, rhs, "lttmp"); // Menor que
    }

    virtual std::any visitEqualityCheck(ExprParser::EqualityCheckContext *ctx) override {
        Value *lhs = std::any_cast<Value *>(visit(ctx->exp(0)));
        Value *rhs = std::any_cast<Value *>(visit(ctx->exp(1)));
        return builder->CreateICmpEQ(lhs, rhs, "eqtmp"); // Igualdad
    }

    virtual std::any visitInequalityCheck(ExprParser::InequalityCheckContext *ctx) override {
        Value *lhs = std::any_cast<Value *>(visit(ctx->exp(0)));
        Value *rhs = std::any_cast<Value *>(visit(ctx->exp(1)));
        return builder->CreateICmpNE(lhs, rhs, "netmp"); // Desigualdad
    }
// Declaración de condiciones (if-else)
    virtual std::any visitIfElseStmt(ExprParser::IfElseStmtContext *ctx) override {
        Value *cond = std::any_cast<Value *>(visit(ctx->exp()));
        cond = builder->CreateICmpNE(cond, ConstI32(0), "ifcond");

        Function *fn = builder->GetInsertBlock()->getParent();
        BasicBlock *thenBB = BasicBlock::Create(C, "then", fn);
        BasicBlock *elseBB = BasicBlock::Create(C, "else");
        BasicBlock *mergeBB = BasicBlock::Create(C, "merge");

        builder->CreateCondBr(cond, thenBB, elseBB);

        builder->SetInsertPoint(thenBB);
        visit(ctx->statement(0));
        builder->CreateBr(mergeBB);

        elseBB->insertInto(fn);
        builder->SetInsertPoint(elseBB);

        if (ctx->statement(1)) {
            visit(ctx->statement(1));
        }
        builder->CreateBr(mergeBB);

        mergeBB->insertInto(fn);
        builder->SetInsertPoint(mergeBB);
        return nullptr;
    }
    
    // Manejo de números
    virtual std::any visitNumber(ExprParser::NumberContext *ctx) override {
        return ConstI32(stoi(ctx->getText()));
    }

    // Manejo de cadenas literales
    virtual std::any visitStringLiteral(ExprParser::StringLiteralContext *ctx) override {
        string str = ctx->STRING()->getText();
        str = str.substr(1, str.length() - 2); // Remover comillas
        return ConstString(str);
    }
};

#endif // DRIVER_H