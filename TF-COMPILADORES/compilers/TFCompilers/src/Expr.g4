
grammar Expr;

// Regla de inicio
program : (principal | ioStatement | statement)* EOF ;

// ----------- GRAMÁTICA DE STATEMENTS -----------

statement
    : varDeclaracionStmt # VarDeStmt
    | varAsignacionStmt  # VarAsStmt
    | 'retorno' exp ';' # ReturnStmt
    | 'salida' '(' exp ')' ';' # OutputStmt
    | 'si' '(' exp ')' '{' statement* '}' ('sino' '{' statement* '}')? # IfElseStmt
    | 'mientras' '(' exp ')' '{' statement* '}' # WhileStmt
    ;


varDeclaracionStmt
    : tipo ID '=' exp ';' 
    ;

varAsignacionStmt
    : ID '=' exp ';' 
    ;

ioStatement
    : 'entrada' '(' ID ')' ';' # InputStatement
    | 'salida' '(' exp ')' ';' # OutputStatement
    ;

tipo
    : 'entero'  # Integer
    | 'flotante' # Float
    | 'cadena' # String
    ;

exp
    : ID                          # ID
    | NUM                         # Number
    | STRING                      # StringLiteral
    | '(' exp ')'                 # Parenthesis
    | '-' exp                     # Negation 
    | exp '*' exp                 # Multiplication
    | exp '/' exp                 # Division
    | exp '+' exp                 # Addition
    | exp '-' exp                 # Subtraction
    | exp '&&' exp                # LogicalAnd
    | exp '||' exp                # LogicalOr
    | exp '==' exp                # EqualityCheck
    | exp '!=' exp                # InequalityCheck
    | exp '>' exp                 # GreaterThan
    | exp '<' exp                 # LessThan
    ;

principal
    : 'entero' 'principal' '(' ')' '{' mainBody '}'
    ;

mainBody
    : statement* # StatementList
    ;

// ----------- REGLAS COMUNES ----------- 
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
NUM     : [-]?[0-9]+('.'[0-9]+)? ;  // Acepta tanto enteros como flotantes
STRING  : '"' (~["\r\n])* '"' ;
WS      : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]*->skip ;