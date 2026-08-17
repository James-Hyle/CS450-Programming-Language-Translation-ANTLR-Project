grammar ExtendedStaticJava;

compilationUnit
  : simpleClassDeclaration* classDefinition simpleClassDeclaration*  EOF   #EntryPoint
  ;

classDefinition
  : 'public' 'class' ID '{'
        mainMethodDeclaration?
        memberDeclaration*
    '}'                                                         #ClassDeclaration
  ;

simpleClassDeclaration
  : 'class' ID '{'
        publicFieldDeclaration*
    '}'                                                         #CustomClassDeclaration
  ;

publicFieldDeclaration
  : 'public' type ID SEMICOLON                                  #PublicDecLaration
  ;

memberDeclaration
  : fieldDeclaration                                            #FieldMemberDeclaration
  | methodDeclaration                                           #MethodMemberDeclaration
  ;

mainMethodDeclaration
  : 'public' 'static' 'void'
    id1=ID                   { "main".equals($id1.text) }?
    '(' id2=ID               { "String".equals($id2.text) }?
    '[' ']' id3=ID ')'
    '{' methodBody '}'                                          #MainStatement
  ;

fieldDeclaration
  : 'static' type ID SEMICOLON                                  #ClassFieldDeclaration
  ;

methodDeclaration
  : 'static' returnType ID '(' params? ')' '{' methodBody '}'   #MethodDec
  ;

returnType
  : 'void'                                                      #VoidType
  | type                                                        #NonVoidReturnType
  ;

type
  : (basicType | ID) ('[' ']')?                                 #TypeDec
  ;

basicType
  : 'boolean'                                                   #BooleanType
  | 'int'                                                       #IntType
  ;

params
  : param ( ',' param )*                                        #ParamList
  ;

param
  : type ID                                                     #Parameter
  ;

methodBody
  : localDeclaration* statement*                                #Method
  ;

localDeclaration
  : type ID SEMICOLON                                           #Declaration
  ;

statement
  : assignStatement                                             #AssignmentState
  | ifStatement                                                 #IfState
  | whileStatement                                              #WhileState
  | invokeExpStatement                                          #InvocationState
  | returnStatement                                             #ReturnState
  | forStatement                                                #ForState
  | doWhileStatement                                            #DoWhileState
  | incDecStatement                                             #IncDecState
  ;

incDecStatement
  : incDec SEMICOLON?                                          #IncDecDeclaration
  ;

assignStatement
  : assign SEMICOLON?                                           #Assignment
  ;

assign
  : lhs '=' exp                                                 #AssignOperator
  ;

incDec
  : exp ('++' | '--')                                           #IncDecOperator
  ;

lhs
  : ID                                                          #LhsState
  | exp '.' ID                                                  #AccessState
  | exp '[' exp ']'                                             #ArrayAccessState
  ;

ifStatement
  : 'if' '(' exp ')' '{' ts+=statement* '}'
   ('else' '{' fs+=statement* '}')?                             #IfDeclaration
  ;

whileStatement
  : 'while' '(' exp ')' '{' statement* '}'                      #WhileDeclaration
  ;

forStatement
  : 'for' '(' forInits? SEMICOLON exp* SEMICOLON forUpdates? ')' '{'
        statement*
    '}'                                                         #ForDeclaration
  ;

forInits
  : assignStatement (',' assignStatement)*                      #ForInitStatement
  ;

forUpdates
  : incDecStatement (',' incDecStatement)*                      #ForUpdateStatement
  ;

invokeExpStatement
  : invoke SEMICOLON                                            #InvokeDeclaration
  ;

doWhileStatement
  : 'do' '{' statement* '}' 'while' '(' exp ')' SEMICOLON       #DoWhileDeclaration
  ;

returnStatement
  : 'return' ( exp )? SEMICOLON                                 #ReturnDeclaration
  ;

exp
  : INT                      { new java.math.BigInteger($INT.text).bitLength() < 32 }?
                                                    #IntLiteral
  | 'true'                                          #TrueLiteral
  | 'false'                                         #FalseLiteral
  | 'null'                                          #NullLiteral

  | '(' exp ')'                                     #ParenExp
  | invoke                                          #InvokeExp
  | ID                                              #IdExp

  | op=( '-' | '+' ) exp                            #UnaryExp
  | op=('!' | '~') exp                              #UnaryExp

  | e1=exp op=( '*' | '/' | '%' ) e2=exp            #BinaryExp
  | e1=exp op=( '+' | '-' ) e2=exp                  #BinaryExp
  | e1=exp op=( '<' | '>' | '<=' | '>=' ) e2=exp    #BinaryExp
  | e1=exp op=( '==' | '!=' ) e2=exp                #BinaryExp
  | e1=exp op='&&' e2=exp                           #BinaryExp
  | e1=exp op='||' e2=exp                           #BinaryExp
  | e1=exp op=('>>'|'<<'|'>>>') e2=exp              #BinaryExp

  | 'new' ID '(' ')'                                #New
  | 'new' type '[' exp? ']'                         #New
  | 'new' type '[' ']' arrayInit                    #New

  | e1=exp '[' e2=exp ']'                           #ArrayAccess
  | exp '.' ID                                      #FieldAccess
  | e1=exp op1='?' e2=exp ':' e3=exp                #TernaryExp
  ;

invoke
  : ( id1=ID '.' )? id2=ID '(' args? ')'            #InvokeStatement
  ;

arrayInit
  : '{' e1=exp (',' e2=exp)* '}'                    #ArrayInitilizationStatement
  ;

args
  : e1=exp ( ',' d2=exp )*                          #ArgStatement
  ;

ID
  : ( 'a'..'z' | 'A'..'Z' | '_' | '$' )
    ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '$' )*
  ;

INT
  : '0' | ('1'..'9') ('0'..'9')*
  ;

SEMICOLON
  : ';'
  ;

// Whitespace -- ignored
WS
  : [ \r\t\u000C\n]+ -> skip
  ;

// Any other character is an error character
ERROR
  : .
  ;
