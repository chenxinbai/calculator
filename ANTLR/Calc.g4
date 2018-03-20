grammar Calc;

prog : stat+;

stat : expr             # printExpr
     ;

expr : <assoc=right> expr op=(MUL|DIV) expr   # MulDiv
     | expr op=(ADD|SUB) expr   # AddSub
     | sign=(ADD|SUB)?NUMBER       # number
     | '(' expr ')'             # parens
     ;



NUMBER  : [0-9]+('.'([0-9]+)?)?
        | [0-9]+;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip;
WS   : [ \t\r\n]+ -> skip;
MUL  : '*';
DIV  : '/';
ADD  : '+';
SUB  : '-';