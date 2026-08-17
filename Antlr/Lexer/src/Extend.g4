grammar Extend;
expr : ( A | B | O )+;
A : [aA]+ O*;
B : [bB]+ O*;
O : [c-zC-Z_]+ [c-zC-Z0-9_]*;
WS : [ \t\n\r]+ -> skip;
