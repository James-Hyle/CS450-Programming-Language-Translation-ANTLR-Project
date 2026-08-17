grammar Palindrome;

start : exp EOF;

exp
    : (A (ANY|WS) A)+
    | (B (ANY|WS) B)+;


ANY : .+;
A : 'A'+;
B : 'B'+;

WS : [ \t\n\r]+;