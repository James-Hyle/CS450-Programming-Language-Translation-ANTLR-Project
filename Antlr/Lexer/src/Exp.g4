grammar Exp;

start: exp EOF;

exp : INT           #IntLiteral
    | '(' exp ')'      #ParentExp
    | lhs=exp op=('*' | '/' | '%' ) rhs=exp #BinaryExp
    | lhs=exp op=('+' | '-' ) rhs=exp  #BinaryExp
    ;
 INT: '0' | ('1'..'9') ('0'..'9')*;

 //Whitespace -- ignored
 WS: [ \r\t\u000C\n]+ -> skip;

 //Any other characteris is an error character
 ErrorChar: .;