grammar SimpleCpp;

program : stat* EOF;

stat 
    : declaration ';'          // declarationStatement
    | assignment (';')?           // assignmentStatement
    | funcDeclaration          // functionDeclaration
    | ifStatement              // ifStatement
    | forStatement             // forStatement
    | whileStatement           // whileStatement
    | expr ';'                 // expressionStatement
    | ioStatement ';'          // ioStatement
    | 'return' (expr)? ';'                //returnExpression
    ;

declaration 
    : type ID ('=' (expr| ternarioOper))? (',' (assignment|ID))* // variableDeclaration
    ;

assignment 
    : ID ('=' | '+=' | '-=') expr // variableAssignment
    | ID '=' (ternarioOper)? 
    ;

expr 
    : '(' expr ')'                  //parenExpression
    | operMathExpr
    | operCompExpr
    | operAndOr
    | funCall                       //functionCall
    | solos
    ;

operMathExpr
    : operMathExpr ('*' | '/' | '^' | '%') operMathExpr
    | operMathExpr ('+' | '-') operMathExpr
    | operMathExpr ('==' | '>=' | '<=' | '>' | '<') operMathExpr
    | operMathExpr ('&&' | '||' | 'and' | 'or' | '&' | '|') operMathExpr
    | operMathIndiv 
    | '(' operMathExpr ')'
    | funCall
    | NUM
    | ID
    ;
    
operAndOr
    : operAndOr ('&&' | '||' | 'and' | 'or' | '&' | '|') operAndOr
    | '(' operAndOr ')'
    | operCompExpr
    | solos
    ;
    
operMathIndiv
    : ID ('++' | '--')
    | ('++' | '--') ID
    ;
    
operMathIndivFor
    : operMathIndiv
    | ID ('=') operMathExpr
    ;
    
operCompExpr
    : solos ('<' | '>' | '==' | '!=' | '>=' | '<=') operMathExpr
    ;

ifStatement
    : 'if' '(' expr ')' block ('else' block)?  // ifElseStatement
    ;
    
ternarioOper
    : '(' expr ')' '?' block ':' (ternarioOper | expr)
    ;

forStatement
    : 'for' '(' (declaration)? ';' (operCompExpr (',' operCompExpr)*)? ';' (operMathIndivFor (',' operMathIndivFor)*)? ')' block      // forLoop
    ;

whileStatement
    : 'while' '(' expr ')' block              // whileLoop
    ;

funcDeclaration 
    : type ID '(' parameterList ')' block    // functionDeclaration
    ;
    
funCall
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
    | 'cout' '<<' expr ('<<' expr)*                        // coutStatement
    ;

block
    : '{' stat* '}'                           // codeBlock
    | expr*
    ;

type
    : 'int'                                   // intType
    | 'float'                                 // floatType
    | 'double'                                 // doubleType
    | 'char'                                  // charType
    | 'bool'                                  // boolType
    | 'void'                                  // voidType
    | 'string'                                // stringType
    ;

solos
    : ID
    | NUM
    | STRING
    ;


COMMENT_SINGLE : '//' ~[\r\n]* -> skip ;       // single line comments
COMMENT_MULTI  : '/*' .*? '*/' -> skip ;       // multi-line comments
ID  : [a-zA-Z_][a-zA-Z0-9_]* ;                // identifier
NUM : ('-')?[0-9]+ ('.' [0-9]+  ('e' ('-'[0-9]+))? )? ;                  // number
STRING : '"' (~["\\] | '\\' .)* '"' ;          // string literal
WS  : [ \t\n\r]+ -> skip ;                    // whitespace