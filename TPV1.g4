grammar SimpleCpp;

// Programa principal
program : stat*;

// Declaraciones
stat
    : declaration ';'                     // declaración de variables
    | assignment (';')?                    // asignación de variables
    | expr ';'                             // expresión
    | ifStatement                          // declaración if
    | forStatement                         // declaración for
    | whileStatement                       // declaración while
    | funcDeclaration                      // declaración de función
    | ioStatement ';'                      // entrada/salida
    | structDeclaration                    // declaración de struct
    | operatorOverload                     // sobrecarga de operadores
    | 'return' expr ';'                    // expresión de retorno
    ;

// Declaración de variables
declaration
    : type ID ('=' expr)? (',' ID ('=' expr)?)*
    ;

// Asignación de variables
assignment
    : ID ('.' ID)* '=' expr                 // Asignación con acceso a miembros de estructuras
    ;

// Expresiones (con precedencia de operadores)
expr
    : logicalExpr
    ;

logicalExpr
    : relationalExpr ('&&' | '||' | 'and' | 'or' relationalExpr)*
    ;

relationalExpr
    : addSubExpr ('<' | '>' | '==' | '!=') addSubExpr*
    ;

addSubExpr
    : mulDivExpr ('+' | '-') mulDivExpr*
    ;

mulDivExpr
    : primaryExpr ('*' | '/') primaryExpr*
    ;

primaryExpr
    : memberAccess                    // acceso a miembros de estructuras
    | '(' expr ')'                    // paréntesis
    | '<<' expr                       // operador de desplazamiento
    | funCall                         // llamada a función
    | ID                              // identificador
    | NUM                             // número
    | STRING                          // cadena de texto
    ;

// Acceso a miembros de estructuras
memberAccess
    : ID ('.' ID)*                    // acceso a miembros de estructuras
    ;

// Declaraciones de control de flujo
ifStatement
    : 'if' '(' expr ')' block ('else' block)?
    ;

forStatement
    : 'for' '(' (stat | expr)? ';' (expr)? ';' (expr)? ')' block
    ;

whileStatement
    : 'while' '(' expr ')' block
    ;

// Declaración de funciones
funcDeclaration
    : type ID '(' parameterList ')' block
    ;

funCall
    : ID '(' parameterListCallFun ')'
    ;

// Sobrecarga de operadores
operatorOverload
    : 'operator' overloadableOperator '(' parameterList ')' block
    ;

overloadableOperator
    : '+' | '-' | '*' | '/' | '==' | '!=' | '<' | '>' | '<<' | '>>'
    ;

// Declaración de estructuras
structDeclaration
    : 'struct' ID '{' structField* '}' ';'
    ;

structField
    : type ID ';'
    ;

// Parámetros en funciones
parameterList
    : (type ID (',' type ID)*)?
    ;

parameterListCallFun
    : (expr (',' expr)*)?
    ;

// Entrada/Salida
ioStatement
    : 'cin' '>>' ID                           // entrada de datos
    | 'cout' '<<' expr*                        // salida de datos
    ;

// Bloque de código
block
    : '{' stat* '}'
    ;

// Tipos de datos
type
    : 'int'
    | 'float'
    | 'char'
    | 'bool'
    | 'void'
    | 'string'
    | ID        // Permite structs definidos por el usuario como tipos
    ;

// Tokens
COMMENT_SINGLE : '//' ~[\r\n]* -> skip ;       // comentarios de una línea
COMMENT_MULTI  : '/*' .*? '*/' -> skip ;       // comentarios de múltiples líneas
ID  : [a-zA-Z_][a-zA-Z0-9_]* ;                // identificadores
NUM : [0-9]+ ('.' [0-9]+)? ;                  // números
STRING : '"' (~["\\] | '\\' .)* '"' ;          // literales de cadena
WS  : [ \t\n\r]+ -> skip ;                    // espacios en blanco
