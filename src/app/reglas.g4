grammar reglas;

@header {
    package app;
}

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

WS : [ \n\t] -> skip;
OTRO : '.' ;

//Simbolos de apertura
PA: '(';
PC: ')';
LA : '{';
LC : '}';
CA : '[';
CC: ']';

/*OPERACIONES ARITMETICAS */
SUM : '+';
RES : '-';
MUL : '*';
DIV : '/';
MOD : '%';
INCREMENT : '++';
DECREMENT : '--';

/*OPERACIONES DE COMPARACION */
EQ : '==';
MAY : '>';
MEN : '<';
MAYIG: '=>';
MENIG : '<=';
DIS : '!=';

/* OPERADORES LOGICOS */
OR : '||';
AND : '&&';
NOT : '!';
TRUE  : 'true' ;
FALSE : 'false';

/* ASIGNACIONES */
MASIGUAL : '+=';
MENOSIGUAL : '-=';
PORIGUAL : '*=';
BARRAIGUAL : '/=';
MODULOIGUAL : '%=';
IGUAL : '=';

/*TIPO DE DATOS MAS COMUNES */
INT 	: 'int'    ;
DOUBLE 	: 'double' ;
CHAR 	: 'char'   ;
VOID    : 'void'   ;

/*CICLOS */
FOR : 'for';
IF : 'if';
WHILE : 'while'; 
ELSE : 'else';

/*VARIOS */
COMA : ',';
PYC : ';';
RETURN : 'return';

/* ID Y NUMERO */
ID:(LETRA|'_')((LETRA|DIGITO|'_')+)?;
INTEGER : DIGITO+;
DECIMAL : INTEGER'.'INTEGER;
CHARACTER: '\''(LETRA|OTRO|DIGITO)'\'';

//-------------------------------------
prog : instrucciones EOF;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : bloque
            | declaracion PYC
            | asignacion
            | prototipoFuncion PYC
            | funcion
            | llamadaFuncion PYC
            | cicloFor
            | cicloWhile
            | cicloIf
            | returnD PYC      
            ;

bloque : LA instrucciones LC 
        ;

tipodato : INT 
        | CHAR 
        | DOUBLE 
        | VOID 
        ;

asignacion : ID asignacionValor//x = 0
            ;

declaracion : tipodato ID
            | tipodato ID asignacion
            ;

// = += -= *= /= %=
asignacionValor : IGUAL operacion
                ;

operacion: exprLog
         ;

exprLog : exprOR
        |
        ;

//OR
exprOR : exprAND disy
           ;

disy : OR exprAND disy
     |
     ;

exprAND : exprIgualdad conj
           ;

conj : AND exprIgualdad conj
     |
     ;

exprIgualdad: expresion comp
        ;

comp : comparaciones expresion comp
        |
        ;

// == > < >= <= !=
comparaciones : EQ 
            | MAY 
            | MEN 
            | MAYIG 
            | MENIG 
            | DIS 
            ;

expresion : termino exp
          ;

exp: SUM termino exp
    | RES termino exp
    |
    ;

termino: factor term
        ;

term: MUL factor term
    | DIV factor term
    | MOD factor term
    |
    ; 

factor : f PA exprLog PC
       | f llamadaFuncion
       | f INTEGER
       | f ID
       | f DECIMAL 
       | f CHARACTER
       | ID f
       ;

f : SUM
  | RES
  | NOT
  | INCREMENT
  | DECREMENT
  |
  ;

/* Funciones */

/* Defincion de la funcion */
funcion : tipodato ID PA parametrosFuncion PC bloque
        ;

prototipoFuncion : tipodato ID PA parametrosFuncion PC
                ;


parametrosFuncion: tipodato ID
        | tipodato ID COMA parametrosFuncion
        |
        ;


/* nombreFuncion(p1) */
llamadaFuncion : ID PA parametrosLlamada PC
               ;

parametrosLlamada : operacion COMA parametrosLlamada
                | operacion
                |
                ;

/* Ciclos */

cicloFor : FOR PA asignacion operacion PYC operacion PC instruccion
        ;

cicloWhile : WHILE PA operacion PC bloque
            ;
 
cicloIf : IF PA operacion PC instruccion
        | IF PA operacion PC bloque ELSE bloque
        | IF PA operacion PC instruccion ELSE instruccion
        ;

/* Return */
returnD: RETURN (operacion | )
        ;