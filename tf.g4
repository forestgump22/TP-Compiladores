grammar tf;

program : stat* EOF;

stat
    : declaracionCaja PC
    | declaracionFuncion
    ;

declaracionCaja
    : tipo ID ('=' (exprNum | exprStr))?
    ;

declaracionFuncion
    : tipo ID '(' (parametro (',' parametro)*)? ')' '{' body+ retorno '}'
    ;

retorno 
    : 'retorno' (exprStr | exprNum) PC
    ;

modificacionCaja
    : ID '=' (exprNum | exprStr)
    | ID ('++' | '--')
    | ('++' | '--') ID
    | ID ('+='| '-=') exprNum
    ;

parametro
    : declaracionCaja
    ;

body
    : declaracionCaja PC
    | declaracionSiNo 
    | declaracionFor 
    | declaracionMientras
    | modificacionCaja PC
    ;

declaracionMientras
    : 'mientras' '(' exprBooleana')' '{' body+ '}'
    ;

exprBooleana
    : exprBooleana ('y' | 'o') exprBooleana
    | expr ('>' | '<') expr  
    | expr ('>='| '<=') expr  
    | expr ('=='| '!=') expr
    | expr
    ;

expr
    : exprStr 
    | exprNum
    ;

exprNum
    : '(' exprNum ')'
    | exprNum ('+'|'-') exprNum
    | exprNum ('*'|'/') exprNum
    | exprNum ('^'|'%') exprNum
    | NUM
    | ID
    ;

exprStr
    : exprStr '+' exprStr
    | STRING
    | ID
    ;

declaracionSiNo
    : 'si' '(' exprBooleana ')' '{' body+ '}' ('sino' '{' body+ '}')?
    ;

declaracionFor 
    :  'recorrer' '(' declaracionCaja ';' exprBooleana ';' modificacionCaja')'
        '{' body+ '}'
    ;

tipo
    : 'entero'
    | 'decimal'
    | 'texto'
    ;

PC      : ';';
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
NUM     : ('-')? [0-9]+ ('.' [0-9]+ )? ; // usamos para pruebas
INT     : ('-')?[0-9]+ ;
FLOAT   : ('-')?[0-9]+ '.' [0-9]+ ;
STRING  : '"' (~["\r\n])* '"' ;
NOMBRE  : [a-zA-ZñÑ_][a-zA-ZñÑ_0-9]* ;
COMMENTARIOS  : '/*' .*? '*/' -> skip ;
COMMENTARIO : '//' ~[\r\n]* -> skip ;
WS      : [ \t\r\n]+ -> skip ;