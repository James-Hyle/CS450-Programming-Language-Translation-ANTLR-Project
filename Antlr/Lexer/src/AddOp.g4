grammar AddOp;
expr : (ADDOP)+;
ADDOP : ADD EQUAL INT | INT '+';
ADD : INT WS PLUS WS INT;
INT : [0-9]+;
// INT : [0] | [1-9][0-9]*;
PLUS : '+';
EQUAL: '=';
WS : [ \t\n\r]+ -> channel(HIDDEN);