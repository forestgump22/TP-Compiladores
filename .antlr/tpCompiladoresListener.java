// Generated from c:/antlr4/TP-Compiladores/tpCompiladores.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tpCompiladoresParser}.
 */
public interface tpCompiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tpCompiladoresParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tpCompiladoresParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(tpCompiladoresParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(tpCompiladoresParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#ternaCall}.
	 * @param ctx the parse tree
	 */
	void enterTernaCall(tpCompiladoresParser.TernaCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#ternaCall}.
	 * @param ctx the parse tree
	 */
	void exitTernaCall(tpCompiladoresParser.TernaCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(tpCompiladoresParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(tpCompiladoresParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(tpCompiladoresParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(tpCompiladoresParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tpCompiladoresParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tpCompiladoresParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#operMathExpr}.
	 * @param ctx the parse tree
	 */
	void enterOperMathExpr(tpCompiladoresParser.OperMathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#operMathExpr}.
	 * @param ctx the parse tree
	 */
	void exitOperMathExpr(tpCompiladoresParser.OperMathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#operAndOr}.
	 * @param ctx the parse tree
	 */
	void enterOperAndOr(tpCompiladoresParser.OperAndOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#operAndOr}.
	 * @param ctx the parse tree
	 */
	void exitOperAndOr(tpCompiladoresParser.OperAndOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#operMathIndiv}.
	 * @param ctx the parse tree
	 */
	void enterOperMathIndiv(tpCompiladoresParser.OperMathIndivContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#operMathIndiv}.
	 * @param ctx the parse tree
	 */
	void exitOperMathIndiv(tpCompiladoresParser.OperMathIndivContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#operMathIndivFor}.
	 * @param ctx the parse tree
	 */
	void enterOperMathIndivFor(tpCompiladoresParser.OperMathIndivForContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#operMathIndivFor}.
	 * @param ctx the parse tree
	 */
	void exitOperMathIndivFor(tpCompiladoresParser.OperMathIndivForContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#operCompExpr}.
	 * @param ctx the parse tree
	 */
	void enterOperCompExpr(tpCompiladoresParser.OperCompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#operCompExpr}.
	 * @param ctx the parse tree
	 */
	void exitOperCompExpr(tpCompiladoresParser.OperCompExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(tpCompiladoresParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(tpCompiladoresParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#ternarioOper}.
	 * @param ctx the parse tree
	 */
	void enterTernarioOper(tpCompiladoresParser.TernarioOperContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#ternarioOper}.
	 * @param ctx the parse tree
	 */
	void exitTernarioOper(tpCompiladoresParser.TernarioOperContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(tpCompiladoresParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(tpCompiladoresParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(tpCompiladoresParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(tpCompiladoresParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#forInterme}.
	 * @param ctx the parse tree
	 */
	void enterForInterme(tpCompiladoresParser.ForIntermeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#forInterme}.
	 * @param ctx the parse tree
	 */
	void exitForInterme(tpCompiladoresParser.ForIntermeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(tpCompiladoresParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(tpCompiladoresParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(tpCompiladoresParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(tpCompiladoresParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(tpCompiladoresParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(tpCompiladoresParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(tpCompiladoresParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(tpCompiladoresParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(tpCompiladoresParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(tpCompiladoresParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#parameterListCallFun}.
	 * @param ctx the parse tree
	 */
	void enterParameterListCallFun(tpCompiladoresParser.ParameterListCallFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#parameterListCallFun}.
	 * @param ctx the parse tree
	 */
	void exitParameterListCallFun(tpCompiladoresParser.ParameterListCallFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#ioStatement}.
	 * @param ctx the parse tree
	 */
	void enterIoStatement(tpCompiladoresParser.IoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#ioStatement}.
	 * @param ctx the parse tree
	 */
	void exitIoStatement(tpCompiladoresParser.IoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(tpCompiladoresParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(tpCompiladoresParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(tpCompiladoresParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(tpCompiladoresParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpCompiladoresParser#solos}.
	 * @param ctx the parse tree
	 */
	void enterSolos(tpCompiladoresParser.SolosContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpCompiladoresParser#solos}.
	 * @param ctx the parse tree
	 */
	void exitSolos(tpCompiladoresParser.SolosContext ctx);
}