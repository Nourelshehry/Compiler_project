grammar If;

prog : if_stmt+;

//stmt : if_stmt;

if_stmt : 'if' condition ;

condition : '('expr')'stmt_block ;

stmt_block : open block close;

block : if_stmt
      | print ;

print : 'print()' SEMI;

expr : VAR EQ (TRUE|FALSE)+;


TRUE : ('TRUE' | 'true');
FALSE : ('FALSE' | 'false');
VAR : [a-zA-z]+;
EQ : '==';

WS : [ \t\r] ->skip;
SEMI : ';' ;

open : '{';
close : '}';