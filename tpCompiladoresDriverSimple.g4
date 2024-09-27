grammar tpCompiladores;

program : stat* EOF;

stat 
    : declaration ';'          // declarationStatement
    | assignment (';')?           // assignmentStatement
    | funcDeclaration          // functionDeclaration
    | ifStatement              // ifStatement
    | forStatement             // forStatement
    | whileStatement           // whileStatement
    | expr ';'                 // expressionStatement
    | ternarioOper ';'?
    | ioStatement ';'          // ioStatement
    | 'return' (expr)? ';'                //returnExpression
    ;
    
ternaCall
    : ioStatement
    | funCall
    ;

declaration 
    : type ID ('=' (expr| ternarioOper))? (',' (assignment|ID))* // variableDeclaration
    {
        if ($expr.v != 0) {
            memory[$ID->getText()] = $expr.v;  // Almacenamos la variable 
        } else {
            memory[$ID->getText()] = 0;  // Valor por defecto es 0
        }
    }
    ;

assignment 
    : ID op=('=' | '+=' | '-=') expr // variableAssignment
    {
        std::string var = $ID->getText();
        if (memory.find(var) != memory.end()) {
            if ($op.text == "="){
                memory[var] = $expr.v;
            } else if ($op.text == "+="){
                memory[var] += $expr.v;
            } else if ($op.text == "-="){
                memory[var] -= $expr.v;
            }
        } else {
            std::cerr << "Variable " << var << " no esta declarada.\n";
        }
    }
    | ID '=' (ternarioOper)?
    {
        std::string var = $ID->getText();
        if (memory.find(var) != memory.end()) {
            // Manejo de operadores ternarios
        } else {
            std::cerr << "Variable" << var << " no esta declarada.\n";
        }
    }
    ;

expr returns [double v]
    : '(' e=expr ')'   {$v = $e.v;}
    | operMathExpr {$v = $operMathExpr.v;}
    | operCompExpr {$v = $operCompExpr.v;}
    | operAndOr    {$v = $operAndOr.v;}
    | funCall      {$v = $funCall.v;}
    | solos        {$v = $solos.v;}
    ;

operMathExpr returns [double v]
    : '(' e=operMathExpr ')'   {$v = $e.v;}  
    | a=operMathExpr op=('*' | '/' | '^' | '%') b=operMathExpr
    {
        if ($op.text == "*")      $v = $a.v * $b.v;
        else if ($op.text == "/") $v = $a.v / $b.v;
        else if ($op.text == "^") $v = std::pow($a.v, $b.v);
        else if ($op.text == "%") $v = std::fmod($a.v, $b.v);
    }
    | a=operMathExpr op=('+' | '-') b=operMathExpr
    {
        if ($op.text == "+")      $v = $a.v + $b.v;
        else if ($op.text == "-") $v = $a.v - $b.v;
    }
    | a=operMathExpr op=('==' | '>=' | '<=' | '>' | '<') b=operMathExpr
    {
        if ($op.text == "==")      $v = $a.v == $b.v;
        else if ($op.text == ">=") $v = $a.v >= $b.v;
        else if ($op.text == "<=") $v = $a.v <= $b.v;
        else if ($op.text == ">")  $v = $a.v > $b.v;
        else if ($op.text == "<")  $v = $a.v < $b.v;
    }
    | a=operMathExpr op=('&&' | '||' | 'and' | 'or' | '&' | '|') b=operMathExpr
    {
        if ($op.text == "&&" || $op.text == "and" ) { $v = $a.v && $b.v; }
        else if ($op.text == "||" || $op.text == "or") { $v = $a.v || $b.v; }
        else if ($op.text == "&") { $v = $a.v && $b.v; }
        else if ($op.text == "|") { $v = $a.v || $b.v; }
    }
    | operMathIndiv {$v = $operMathIndiv.v;} 
    | funCall       {$v = $funCall.v;}
    | NUM {$v = std::stod($NUM->getText());}
    | ID
    {
        std::string var = $ID->getText();
        if (memory.find(var) != memory.end()){
            $v = memory[var];
            std::cerr << "Variable " << var << " esta declarada es ->" << memory[var] << ".\n";
        } else {
            std::cerr << "Variable " << var << " no esta declarada.\n";
            $v = 0;
        }
    }
    ;
    
operAndOr returns [double v]
    : a=operAndOr op=('&&' | '||' | 'and' | 'or' | '&' | '|') b=operAndOr
    {
        if ($op.text == "&&" || $op.text == "and" ) { $v = $a.v && $b.v; }
        else if ($op.text == "||" || $op.text == "or") { $v = $a.v || $b.v; }
        else if ($op.text == "&") { $v = $a.v && $b.v; }
        else if ($op.text == "|") { $v = $a.v || $b.v; }
    }
    | '(' operAndOr ')' {$v = $operAndOr.v;}
    | operCompExpr {$v = $operCompExpr.v;}
    | solos {$v = $solos.v;}
    ;
    
operMathIndiv returns [double v]
    : ID op=('++' | '--')
    {
        std::string var = $ID->getText();
        if (memory.find(var) != memory.end()){
            $v = memory[var];
            std::cerr << "Variable " << var << " esta declarada es ->" << memory[var] << ".\n";
            if ($op.text == "++")     { memory[var]++; }
            else if ($op.text == "--"){ memory[var]--; }
        } else {
            std::cerr << "Variable " << var << " no esta declarada.\n";
            $v = 0;
        }
    }
    | op=('++' | '--') ID
    {
        std::string var = $ID->getText();
        if (memory.find(var) != memory.end()){
            std::cerr << "Variable " << var << " esta declarada es ->" << memory[var] << ".\n";
            if ($op.text == "++")     { memory[var]++; }
            else if ($op.text == "--"){ memory[var]--; }
            $v = memory[var];
        } else {
            std::cerr << "Variable " << var << " no esta declarada.\n";
            $v = 0;
        }
        
    }
    ;
    
operMathIndivFor
    : operMathIndiv
    | assignment
    | ID ('=') b=operMathExpr
    {
        std::string var = $ID->getText();
        if (memory.find(var) != memory.end()) {
            memory[var] = $b.v;
            std::cerr << "Variable " << memory[var] << " esta declarada.\n";
        } else {
            std::cerr << "Variable " << var << " no esta declarada.\n";
        }
    }
    ;

operCompExpr returns [bool v]
    : solos op=('<' | '>' | '==' | '!=' | '>=' | '<=') operMathExpr
    {
        if ($op.text == "<"){
            $v = $solos.v < $operMathExpr.v;
        } else if ($op.text == ">"){
            $v = $solos.v > $operMathExpr.v;
        } else if ($op.text == "=="){
            $v = $solos.v == $operMathExpr.v;
        } else if ($op.text == "!="){
            $v = $solos.v != $operMathExpr.v;
        } else if ($op.text == ">="){
            $v = $solos.v >= $operMathExpr.v;
        } else if ($op.text == "<="){
            $v = $solos.v <= $operMathExpr.v;
        }
    }
    ;

ifStatement
    : 'if' '(' expr ')' block ('else' block)?  // ifElseStatement
    ;

ternarioOper
    : '(' expr ')' '?' ternaCall ':' (ternarioOper | stat)
    ;

forStatement
    : 'for' '(' forInit? ';' forInterme? ';' forUpdate? ')' block
    ;


forInit 
    : declaration  
    | assignment
    ;

forInterme returns [bool v]
    : a=operCompExpr (',' b+=operCompExpr)*
    {
        $v = $a.v;  
        for (auto bCtx : $b) {
            if (!bCtx->v) {
                $v = false; 
                break;
            }
        }
    }
    ;


forUpdate
    : operMathIndivFor (',' operMathIndivFor)*
    ;

whileStatement
    : 'while' '(' forInterme ')' block              // whileLoop
    ;

funcDeclaration 
    : type ID '(' parameterList ')' block    // functionDeclaration
    ;

funCall returns [double v]
    : ID '(' parameterListCallFun ')'         // llamada a función con parámetros
    ;

parameterList 
    : (type ID (',' type ID)*)?               // parameterList
    ;

parameterListCallFun 
    : (expr (',' expr)*)?                     // lista de parámetros en la llamada a función
    ;

ioStatement
    : 'cin' '>>' ID                           // cinStatement
    | 'mostrar' '<<' (expr) ('<<' expr)*                        // coutStatement
    {
        // Si todas las condiciones se cumplieron, procede con la impresión
        for (size_t i = 2; i < $ctx->children.size(); i += 2) {
            if ($ctx->children[i]->getText() == "<<") continue;
            if (dynamic_cast<ExprContext*>($ctx->children[i]) != nullptr) {
                std::cerr << ((ExprContext*)$ctx->children[i])->v;
            } else {
                std::cerr << $ctx->children[i]->getText();
            }
        }
    }
    ;

block
    : '{' stat* '}'                           // codeBlock
    | expr
    ;

type
    : 'entero'                                   // intType
    | 'float'                                 // floatType
    | 'double'                                 // doubleType
    | 'char'                                  // charType
    | 'bool'                                  // boolType
    | 'void'                                  // voidType
    | 'string'                                // stringType
    ;

solos returns [double v]
    : ID {
        std::string var = $ID->getText();
        if (memory.find(var) != memory.end()) {
            $v = memory[var];
            std::cerr << "Variable " << memory[var] << " esta declarada.\n";
        } else {
            std::cerr << "Variable " << var << " no esta declarada.\n";
        }
    }
    | NUM {$v = std::stod($NUM->getText());}
    ;


COMMENT_SINGLE : '//' ~[\r\n]* -> skip ;       // single line comments
COMMENT_MULTI  : '/*' .*? '*/' -> skip ;       // multi-line comments
ID  : [a-zA-Z_][a-zA-Z0-9_]* ;                // identifier
NUM : ('-')?[0-9]+ ('.' [0-9]+  ('e' ('-'[0-9]+))? )? ;                  // number
STRING : '"' (~["\\] | '\\' .)* '"' ;          // string literal
WS  : [ \t\n\r]+ -> skip ;                    // whitespace