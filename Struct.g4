grammar SimpleCpp;

// Programa principal
program : stat*;

// Declaraciones y expresiones
stat
    : structDeclaration           // declaración de estructura
    | varDeclaration               // declaración de variables
    | assignment                   // asignaciones
    | expr ';'                     // expresiones
    ;

// Declaración de estructuras
structDeclaration
    : 'estructura' ID '{' structField* '}' ';'
    ;

// Campos de la estructura
structField
    : type ID ';'
    ;

// Declaración de variables que incluye tipos personalizados y múltiples variables
varDeclaration
    : (type | ID) ID (',' ID)* ';'   // permite declarar múltiples variables
    ;

// Asignaciones (incluyendo acceso a miembros)
assignment
    : ID ('.' ID)* '=' expr ';'
    ;

// Expresiones
expr
    : expr ('*' | '/' | '+' | '-') expr          // Operadores aritméticos
    | expr ('<' | '>' | '==' | '!=') expr        // Operadores relacionales
    | expr ('&&' | '||') expr                    // Operadores lógicos
    | '(' expr ')'                              // Paréntesis
    | ID ('.' ID)*                              // Acceso a miembros
    | NUM
    | STRING
    ;

// Tipos de datos
type
    : 'entero'    // Cambiado de 'int' a 'entero'
    | 'flotante'
    | 'char'
    | 'bool'
    | 'cadena'
    ;

// Tokens
ID  : [a-zA-Z_ñÑ][a-zA-Z0-9_ñÑ]* ;           // Identificadores (ahora admite ñ y Ñ)
NUM : [0-9]+ ('.' [0-9]+)? ;                  // Números
STRING : '"' (~["\\] | '\\' .)* '"' ;          // Literales de cadena
WS  : [ \t\n\r]+ -> skip ;                    // Espacios en blanco

