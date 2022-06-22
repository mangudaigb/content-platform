grammar G;

program : (typeDecl | traitDecl | varDecl)+ ;

typeDecl
    : 'type' ID typeBody
    ;

typeBody
    : '{' typeBlock+ '}'
    ;
typeBlock
    : typeType ID ';'
    ;
typeType
    : classType
    | primitiveType
    ;

traitDecl
    : 'trait' ID traitBody
    ;
traitBody
    : '{' traitBlock+ '}'
    ;
traitBlock
    : functionDecl (functionDecl)*
    ;
functionDecl
    : ID '(' funcParameters? ')' funcBody
    ;
funcParameters
    : funcParameter (',' funcParameter)*
    ;
funcParameter
    : (classType | primitiveType) ':' ID
    ;
funcBody
    : '{' funcBlock+ '}'
    ;
funcBlock
    : StringLiteral
    ;

varDecl
    : 'var' ID '=' 'new' (objDecl | primitiveDecl) ';'
    ;
primitiveDecl
    : primitiveType '(' StringLiteral ')'
    ;
objDecl
    : classType '(' exprList? ')'
    ;
exprList
    : expr (',' expr)*
    ;
expr
    : attribute '=' ID
    ;
attribute
    : ID
    ;

classType
    : ID
    ;
primitiveType
    : 'Text'
    | 'Image'
    ;

ID
    : LETTER (LETTER | [0-9])*
    ;

StringLiteral
    : '"' ~ ["\r\n]* '"'
    ;

Number
    : '1'..'9' '0'..'9'*
    ;

// Fragments
fragment LETTER
    : [a-zA-Z]
    ;
fragment StringElement
    : [A..Z][a..z]*
    ;

fragment Digit
    : '0' | NonZeroDigit
    ;

fragment NonZeroDigit
    : '1' .. '9'
    ;

fragment Opchar
    : '=' | '->' | '<-' | ':'
    ;

fragment NL
    : '\n'
    | '\r' '\n'?
    ;

// Whitespace and comments
NEWLINE
    : NL+ -> skip
    ;
WS
    : [ \t\n\r]+ -> skip
    ;
COMMENT
    : '/*' (COMMENT | .)* '*/' -> skip
    ;
LINE_COMMENT
    : '//' (~[\r\n])* -> skip
    ;