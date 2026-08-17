grammar ExpSimple;

start: exp EOF;

exp
    : INT                                 #IntLiteral
    | '(' exp ')'                         # ParenExp
    | e1=exp ( '*' | '/' | '%') e2=exp    #BinaryOp
    | e1=exp ( '+' | '-' )      e2=exp    #BinaryOp
    ;

   INT : '0' | ('1' .. '9') ('0' .. '9') *;
   WS : [ \t\n\r]+ -> skip;
   ErrorChar: . ;