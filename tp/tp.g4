grammar CombinedParser;

// Reglas principales
program : (claseDecl | principal | ioStatement | body | vectorInstruccion)* EOF ;

// ----------- GRAMÁTICA DE CLASES -----------
claseDecl
    : 'clase' ID '{' classBody '}'
    ;

classBody
    : (accessModifier memberDeclaration*)*
    ;

accessModifier
    : 'publico' ':'
    | 'privado' ':'
    ;

memberDeclaration
    : 'entero' ID ('=' exp)? ';'
    | 'entero' ID '(' ')' '{' statement* '}' 
    ;

statement
    : ID '=' INT ';'
    | 'retorno' ID ';'
    | ID '.' ID '(' ')' ';'
    | createObj
    | ID '.' ID '=' INT ';'
    | 'entero' ID '=' ID '.' ID '(' ')' ';'
    | returnMain
    ;

createObj
    : ID ID ';'
    ;

returnMain
    : 'retorno' INT ';'
    ;

// ----------- GRAMÁTICA DE I/O -----------
ioStatement
    : varDeclaracion | varAsignacion | entrada | salida
    ;

varDeclaracion
    : tipo ID '=' expr ';'
    ;

varAsignacion
    : ID '=' expr ';'
    ;

entrada
    : 'entrada' '(' ID ')' ';'
    ;

salida
    : 'salida' '(' expr ')' ';'
    ;

tipo
    : 'entero'
    | 'flotante'
    | 'cadena'
    ;

// ----------- GRAMÁTICA DE CONDICIONALES -----------
body
    : 'si' '(' exp ')' '{' body* '}' ('sino' '{' body* '}')?
    | 'salida' '(' (CADENA | ID) ')' ';'
    | 'entero' ID ('=' exp)? ';'
    | ID '=' exp ';'
    | 'mientras' '(' exp ')' '{' body* '}'
    | exp ';'
    ;



exp
    : ID
    | NUM
    | exp '&&' exp
    | exp '||' exp
    | exp '==' exp
    | exp '!=' exp
    | exp '>' exp
    | exp '<' exp
    | '(' exp ')'
    | '-' exp
    | exp '+' exp
    | exp '-' exp
    | exp '<=' exp
    | exp '>=' exp
    ;

// ----------- GRAMÁTICA DE FUNCIONES Y CICLOS -----------
principal
    : 'entero' 'principal' '(' ')' '{' mainBody '}'
    ;

mainBody
    : statement*
    ;

// ----------- GRAMÁTICA DE VECTORES -----------
vectorInstruccion
    : declararVector
    | accederVector
    | sumarVectores
    | agregarElemento
    | obtenerTamanio
    | cambiarTamanio
    | vaciarVector
    | eliminarUltimo
    ;

declararVector
    : 'vector' NOMBRE '=' '[' elementos ']' ';'
    ;

elementos
    : ENTERO (',' ENTERO)*
    ;

accederVector
    : NOMBRE '[' expr ']' ';'
    ;

sumarVectores
    : NOMBRE '=' NOMBRE '+' NOMBRE ';'
    ;

agregarElemento
    : NOMBRE '.' 'agregar' '(' ENTERO ')' ';'
    ;

obtenerTamanio
    : NOMBRE '.' 'tamanio' '(' ')' ';'
    ;

cambiarTamanio
    : NOMBRE '.' 'cambiar_tamanio' '(' ENTERO ')' ';'
    ;

vaciarVector
    : NOMBRE '.' 'vaciar' '(' ')' ';'
    ;

eliminarUltimo
    : NOMBRE '.' 'eliminar_ultimo' '(' ')' ';'
    ;

// ----------- REGLAS COMUNES -----------
expr
    : expr op=('*'|'/') expr
    | expr op=('+'|'-') expr
    | '(' expr ')'
    | INT
    | FLOAT
    | STRING
    | ID
    ;

ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
INT     : [0-9]+ ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
STRING  : '"' (~["\r\n])* '"' ;
NUM     : [0-9]+('.'[0-9]+)? ;
CADENA  : '"' (~["])* '"' ;
NOMBRE  : [a-zA-ZñÑ_][a-zA-ZñÑ_0-9]* ;
ENTERO  : [0-9]+ ;
WS      : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;