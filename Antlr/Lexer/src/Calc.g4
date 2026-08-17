grammar Calc;

// Parser Rules
expr: t1=term (('+' | '-') t2=term)*;
term: f1=factor (('*' | '/') f2=factor)*;
factor : NUMBER | '(' expr ')' | ('-' | '+') factor;

// Lexer Rules
NUMBER: [0-9]+ ('.' [0-9]+)?;
WS : [ \t\n\r]+ -> skip;