grammar SimpleClassLang;

// Reglas principales
program 
    : (classDeclaration | mainFunction)* EOF;

classDeclaration
    : 'clase' ID '{' classBody '}' ';' // Declaración de clase con punto y coma al final
    ;

classBody
    : (accessModifier memberDeclaration*)*
    ;

accessModifier
    : 'publico' ':'
    | 'privado' ':'
    ;

memberDeclaration
    : 'entero' ID ';'                     // Atributos de tipo int
    | 'entero' ID '(' ')' '{' statement* '}' // Métodos que retornan int
    ;

statement
    : ID '=' INT ';'                    // Asignación de variables
    | 'retorno' ID ';'                   // Instrucción de retorno
    | ID '.' ID '(' ')' ';'             // Llamada a métodos de un objeto
    | createobj
    | ID '.' ID '=' INT ';'
    | 'entero' ID '=' ID '.' ID '('')'';'
    | returnmain
    ;

mainFunction
    : 'entero' 'principal' '(' ')' '{' mainBody '}'
    ;

mainBody
    : statement*                       // Cuerpo de la función main
    ;

createobj
    : ID ID ';'
    ;

returnmain
    :'retorno' INT ';'
    ;

ID  : [a-zA-Z_][a-zA-Z0-9_]* ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
