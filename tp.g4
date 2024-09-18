grammar SimpleCpp;

program : stat*;

stat 
    : declaration ';'          // declarationStatement
    | assignment (';')?           // assignmentStatement
    | expr ';'                 // expressionStatement
    | ifStatement              // ifStatement
    | forStatement             // forStatement
    | whileStatement           // whileStatement
    | funcDeclaration          // functionDeclaration
    | ioStatement ';'          // ioStatement
    | 'return' expr ';'                //returnExpression
    ;

declaration 
    : type ID ('=' expr)? (',' (assignment|ID))* // variableDeclaration
    ;

assignment 
    : ID '=' expr // variableAssignment
    ;

expr 
    : expr ('*' | '/') expr         //mulDivExpression
    | expr ('+' | '-') expr         //addSubExpression
    | expr ('<' | '>' | '==' | '!=') expr  //relationalExpression
    | expr ('&&' | '||') expr       //logicalExpression
    | '(' expr ')'                  //parenExpression
    | '<<' expr                     //operatorExpression
    | funCall                       //functionCall
    | ID                            //idExpression
    | NUM                           //numberExpression
    | STRING                        //stringExpression
    ;


ifStatement
    : 'if' '(' expr ')' block ('else' block)?  // ifElseStatement
    ;

forStatement
    : 'for' '(' stat stat stat ')' block      // forLoop
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
    | 'cout' '<<' expr*                        // coutStatement
    ;

block
    : '{' stat* '}'                           // codeBlock
    ;

type
    : 'int'                                   // intType
    | 'float'                                 // floatType
    | 'char'                                  // charType
    | 'bool'                                  // boolType
    | 'void'                                  // voidType
    | 'string'                                // stringType
    ;

COMMENT_SINGLE : '//' ~[\r\n]* -> skip ;       // single line comments
COMMENT_MULTI  : '/*' .*? '*/' -> skip ;       // multi-line comments
ID  : [a-zA-Z_][a-zA-Z0-9_]* ;                // identifier
NUM : [0-9]+ ('.' [0-9]+)? ;                  // number
STRING : '"' (~["\\] | '\\' .)* '"' ;          // string literal
WS  : [ \t\n\r]+ -> skip ;                    // whitespace
