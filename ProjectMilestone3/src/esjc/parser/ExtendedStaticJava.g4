grammar ExtendedStaticJava;

compilationUnit
  : sc1=simpleClassDeclaration* cd=classDefinition sc2=simpleClassDeclaration*  EOF
  ;

classDefinition
  : 'public' 'class' ID '{'
    mainMethodDeclaration
    memberDeclaration*
    '}'
  ;

memberDeclaration
  : fieldDeclaration
  | methodDeclaration
  ;

 simpleClassDeclaration
   : 'class' id=ID '{'
         pfd=publicFieldDeclaration*
     '}'                                                  #CustomClassDeclaration
   ;

mainMethodDeclaration
  : 'public' 'static' 'void' id1=ID                   { "main".equals($id1.text) }?
    '(' id2=ID               { "String".equals($id2.text) }?
    '[' ']' id3=ID ')'
    '{' methodBody '}'
  ;

publicFieldDeclaration
  : 'public' type ID ';'                                 #PublicDecLaration
  ;

fieldDeclaration
  : 'static' t=type id=ID ';'                                            #FieldDec
  ;

methodDeclaration
  : 'static' ret=returnType id=ID '(' parameters=params? ')' '{' methBody=methodBody '}'       #MethodDec
  ;

type
  : (bt=basicType | id=ID) ('[' ']')?     #CustomType
  ;

returnType
  : 'void'          #VoidReturn
  | type            #TypeReturn
  ;

basicType
  : 'boolean'       #BooleanType
  | 'int'           #IntType
  ;

params
  : param ( ',' param )*
  ;

param
  : type ID
  ;

methodBody
  : localDeclaration* statement*
  ;

localDeclaration
  : type ID ';'
  ;

statement
  : assignStatement     #AssignStmt
  | ifStatement         #IfStmt
  | whileStatement      #WhileStmt
  | invokeExpStatement  #InvokeStmt
  | returnStatement     #RetStmt
  | forStatement        #ForStmt
  | doWhileStatement    #DoWhileStmt
  | incDecStatement     #IncDecStmt
  ;

incDecStatement
  : incDec ';'?
  ;

incDec
  : e=exp op=('++' | '--')
  ;

assignStatement
  : lh=lhs '=' e=exp ';'
  ;

lhs
  : ID
  | exp '.' ID
  | exp '[' exp ']'
  ;

ifStatement
  : 'if' '(' exp ')' '{' ts+=statement* '}'
    ( 'else' '{' fs+=statement* '}' )?
  ;

forStatement
  : 'for' '(' fi=forInits? ';' e=exp? ';' fu=forUpdates? ')' '{'
        s=statement*
    '}'                                                         #ForDeclaration
  ;

forInits
  : forInit (',' forInit)*
  ;

forInit
  : lh=lhs '=' e=exp
  ;

forUpdates
  : id=incDec ( ',' ids=incDec )*
  ;

whileStatement
  : 'while' '(' exp ')' '{' statement* '}'
  ;

invokeExpStatement
  : invoke ';'
  ;

doWhileStatement
  : 'do' '{' s=statement* '}' 'while' '(' e=exp ')' ';'
  ;

returnStatement
  : 'return' ( exp )? ';'
  ;

exp
  : INT                      { new java.math.BigInteger($INT.text).bitLength() < 32 }?
                             #IntLiteral
  | 'true'                   #TrueLiteral
  | 'false'                  #FalseLiteral
  | 'null'                   #NullLiteral

  | '(' exp ')'              #ParenExp
  | invoke                   #InvokeExp
  | ID                       #IdExp

  | op=( '-' | '+' ) exp     #UnaryExp
  | op=( '!' | '~' ) exp     #UnaryExp
  | e1=exp '[' e2=exp ']'    #ArrayAccessExp

  | e1=exp
      op=( '*' | '/' | '%' )
      e2=exp                   #BinaryExp
  | e1=exp
  op=( '+' | '-' )
  e2=exp                   #BinaryExp
  | e1=exp op=('>>'|'<<'|'>>>') e2=exp #BinaryExp
  | e1=exp
  op=( '<' | '>' | '<=' | '>=' )
  e2=exp                   #BinaryExp
  | e1=exp
  op=( '==' | '!=' )
  e2=exp                   #BinaryExp
| e1=exp op='&&' e2=exp    #BinaryExp
| e1=exp op='||' e2=exp    #BinaryExp


  | 'new' id=ID '(' ')'                             #NewExp
  | 'new' t=type '[' e=exp? ']'                     #NewExpArray
  | 'new' t=type '[' ']' a=arrayInit                #NewArrayInit
  | e=exp '.' id=ID                                 #FieldAccess
  | e1=exp op1='?' e2=exp ':' e3=exp                #TernaryExp
  ;

invoke
  : ( id1=ID '.' )? id2=ID '(' a=args? ')'
  ;

arrayInit
  : '{' e1=exp (',' e2=exp)* '}'                    #ArrayInitilizationStatement
  ;
  
args
  : exp ( ',' exp )*
  ;

ID
  : ( 'a'..'z' | 'A'..'Z' | '_' | '$' ) 
    ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '$' )*
  ;
  
INT
  : '0' | ('1'..'9') ('0'..'9')*
  ;

// Whitespace -- ignored
WS
  : [ \r\t\u000C\n]+ -> skip
  ;
  
// Any other character is an error character
ERROR
  : .
  ;