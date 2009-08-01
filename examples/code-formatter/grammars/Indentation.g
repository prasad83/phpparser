//Todo: Labels and goto have been disabled, need to test on 5.3 

grammar Indentation;

options {
    backtrack = true; 
    memoize = true;
    k=2;
    rewrite=true;
}


tokens{
    SemiColon = ';';
    Comma = ',';
    OpenBrace = '(';
    CloseBrace = ')';
    OpenSquareBrace = '[';
    CloseSquareBrace = ']';
    OpenCurlyBrace = '{';
    CloseCurlyBrace = '}';
    ArrayAssign = '=>';
    LogicalOr = '||';
    LogicalAnd = '&&';
    ClassMember = '::';
    InstanceMember = '->';
    SuppressWarnings = '@';
    QuestionMark = '?';
    Dollar = '$';
    Colon = ':';
    Dot = '.';
    Ampersand = '&';
    Pipe = '|';
    Bang = '!';
    Plus = '+';
    Minus = '-';
    Asterisk = '*';
    Percent = '%';
    Forwardslash = '/'; 
    Tilde = '~';
    Equals = '=';
    New = 'new';
    Clone = 'clone';
    Echo = 'echo';
    If = 'if';
    Else = 'else';
    ElseIf = 'elseif';
    For = 'for';
    Foreach = 'foreach';
    While = 'while';
    Do = 'do';
    Switch = 'switch';
    Case = 'case';
    Default = 'default';
    Function = 'function';
    Break = 'break';
    Continue = 'continue';
    //Goto = 'goto';
    Return = 'return';
    Global = 'global';
    Static = 'static';
    And = 'and';
    Or = 'or';
    Xor = 'xor';
    Instanceof = 'instanceof';
    
    Class = 'class';
    Interface = 'interface';
    Extends = 'extends';
    Implements = 'implements';
    Abstract = 'abstract';
    Var = 'var';
    Const = 'const';
    Modifiers;
    ClassDefinition;
    
    Block;
    Params;
    Apply;
    Member;
    Reference;
    Empty;
    Prefix;
    Postfix;
    IfExpression;
    Label;
    Cast;
    ForInit;
    ForCondition;
    ForUpdate;
    Field;
    Method;
}


@header{
package net.kuruvila.php.parser; 
}

@members{
    public List<Level> levels = new ArrayList<Level>();
    
    private void emit(String text){
        ((TokenRewriteStream)input).insertBefore(input.LT(1), text);
    }
    
    /**
     * This function deletes all hidden tokens before the current token and not just the spaces.
     */
    private void eatPreviousSpaces(){
        TokenRewriteStream trs = ((TokenRewriteStream)input);
        Token current = trs.LT(0);
        int idx = current.getTokenIndex();
        while(idx != -1){
            Token token = trs.get(idx);
            if(token.getChannel()==Token.HIDDEN_CHANNEL){
                trs.delete(token);
            }else{
                break;
            }
            idx-=1;
        }
    }
}
@lexer::header{
package net.kuruvila.php.parser;
}
@lexer::members{
    // Handle the first token, which will always be a BodyString.
    public Token nextToken(){
        //The following code was pulled out from super.nextToken()
        if (input.index() == 0) {
            try {
                state.token = null;
                state.channel = Token.DEFAULT_CHANNEL;
                state.tokenStartCharIndex = input.index();
                state.tokenStartCharPositionInLine = input.getCharPositionInLine();
                state.tokenStartLine = input.getLine();
                state.text = null;
                mFirstBodyString();
                state.type = BodyString;
                emit();
                return state.token;
            } catch (NoViableAltException nva) {
                reportError(nva);
                recover(nva); // throw out current char and try again
            } catch (RecognitionException re) {
                reportError(re);
                // match() routine has already called recover()
            }    
        }
        return super.nextToken();
    }
}

prog : statement*;

statement
    : simpleStatement? BodyString
    | bracketedBlock["block"]
    //| UnquotedString Colon statement -> ^(Label UnquotedString statement)
    | classDefinition
    | interfaceDefinition
    | complexStatement
    | simpleStatement ';' 
    ;
    
bracketedBlock[String blockType]
@init{
    Level level = new Level();
    level.name=blockType;
}
@after{
    levels.add(level);
}
    : { level.start=input.LT(1).getTokenIndex(); } '{' 
        statement* 
        { level.end=input.LT(-1).getTokenIndex(); } '}'
    ;

interfaceDefinition
@init{
    Level level = new Level();
    level.name="interface";
}
@after{
    levels.add(level);
}
    : Interface interfaceName=UnquotedString interfaceExtends?
        {level.start=input.LT(1).getTokenIndex();}OpenCurlyBrace
        interfaceMember*
        {level.end=input.LT(-1).getTokenIndex();}CloseCurlyBrace    
    ;

interfaceExtends
    : Extends  UnquotedString (Comma  UnquotedString)*
    ;
interfaceMember
    : Const UnquotedString (Equals atom)? ';' 
         
    | fieldModifier* Function UnquotedString parametersDefinition ';'
         
    ;

classDefinition
@init{
    Level level = new Level();
    level.name="class";
}
@after{
    levels.add(level);
}
    :   classModifier? 
        Class className=UnquotedString 
        (Extends extendsclass=UnquotedString)? 
        classImplements?
        {level.start=input.LT(1).getTokenIndex();}OpenCurlyBrace
        classMember*
        {level.end=input.LT(-1).getTokenIndex();}CloseCurlyBrace 
         
    ;
    
classImplements
    :  Implements  (UnquotedString (Comma  UnquotedString)*)
    ;

classMember
    : fieldModifier* Function UnquotedString parametersDefinition 
        (bracketedBlock["methoddefinition"] | ';')
         
    | Var Dollar UnquotedString (Equals atom)? ';' 
          
    | Const UnquotedString (Equals atom)? ';' 
         
    | fieldModifier* (Dollar UnquotedString) (Equals atom)? ';' 
         
    ;
    

fieldDefinition
    : Dollar UnquotedString (Equals atom)? ';' 
    ;
    
classModifier
    : 'abstract';
    
fieldModifier
    : AccessModifier | 'abstract' | 'static' 
    ;


complexStatement
    : If '(' ifCondition=expression ')' ifTrue=curlyBraceCheck conditional?
         
    | For '(' forInit forCondition forUpdate ')' curlyBraceCheck  
    | Foreach '(' variable 'as' arrayEntry ')' curlyBraceCheck  
    | While '(' whileCondition=expression? ')' curlyBraceCheck  
    | Do curlyBraceCheck While '(' doCondition=expression ')' ';'  
    | Switch '(' expression ')' '{'cases'}'  
    | functionDefinition
    ;

curlyBraceCheck
    : bracketedBlock["complexstatement"]
    | statement
    ;

simpleStatement
@init{
    Level level = new Level();
    level.name="simplestatement";
    { level.start=input.LT(1).getTokenIndex(); } 
}
@after{
    { level.end=input.LT(-1).getTokenIndex(); } 
    levels.add(level);
}
    : Echo  commaList
    | Global  name (','  name)*
    | Static  variable Equals  atom
    | Break  Integer?
    | Continue  Integer?
    //| Goto^ UnquotedString
    | Return  expression?
    | RequireOperator  expression
    | expression
    ;


conditional
    : ElseIf '(' ifCondition=expression ')' ifTrue=statement conditional?  
    | Else statement  
    ;

forInit
    : commaList? ';'  
    ;

forCondition
    : commaList? ';'  
    ;
    
forUpdate
    : commaList?  
    ;

cases 
    : casestatement*  defaultcase
    ;

casestatement
    : Case  expression ':'  statement*
    ;

defaultcase 
    : (Default  ':'  statement*)
    ;

functionDefinition
    : Function UnquotedString parametersDefinition bracketedBlock["functiondefinition"]  
    ;
    
parametersDefinition
@init{
    Level level = new Level();
    level.name="parameterdefinition";
}
@after{
    levels.add(level);
}
    : {level.start=input.LT(1).getTokenIndex();} OpenBrace 
        (paramDef (Comma paramDef)*)? 
        {level.end=input.LT(1).getTokenIndex();} CloseBrace
    ;

paramDef
    : paramName (Equals  atom)?
    ;

paramName
    : Dollar  UnquotedString
    | Ampersand Dollar UnquotedString  
    ;

commaList
    : expression (','  expression)* 
    ;
    
expression
    : weakLogicalOr
    ;

weakLogicalOr
    : weakLogicalXor (Or  weakLogicalXor)*
    ;

weakLogicalXor
    : weakLogicalAnd (Xor  weakLogicalAnd)*
    ;
    
weakLogicalAnd
    : assignment (And  assignment)*
    ;

assignment
    : name ((Equals | AsignmentOperator)  assignment)
    | ternary
    ;

ternary
    : logicalOr QuestionMark expression Colon expression  
    | logicalOr
    ;
    
logicalOr
    : logicalAnd (LogicalOr  logicalAnd)*
    ;

logicalAnd
    : bitwiseOr (LogicalAnd  bitwiseOr)*
    ;
    
bitwiseOr
    : bitWiseAnd (Pipe  bitWiseAnd)*
    ;

bitWiseAnd
    : equalityCheck (Ampersand  equalityCheck)*
    ;

equalityCheck
    : comparisionCheck (EqualityOperator  comparisionCheck)?
    ;
    
comparisionCheck
    : bitWiseShift (ComparisionOperator  bitWiseShift)?
    ;

bitWiseShift
    : addition (ShiftOperator  addition)*
    ;
    
addition
    : multiplication ((Plus | Minus | Dot)  multiplication)*
    ;

multiplication
    : logicalNot ((Asterisk | Forwardslash | Percent)  logicalNot)*
    ;

logicalNot
    : Bang  logicalNot
    | instanceOf
    ;

instanceOf
    : negateOrCast (Instanceof  negateOrCast)?
    ;

negateOrCast
    : (Tilde | Minus | SuppressWarnings)  increment
    | OpenBrace PrimitiveType CloseBrace increment  
    | OpenBrace  weakLogicalAnd CloseBrace 
    | increment
    ;

increment
    : IncrementOperator name  
    | name IncrementOperator  
    | newOrClone
    ;

newOrClone
    : New  nameOrFunctionCall
    | Clone  name
    | atomOrReference
    ;

atomOrReference
    : atom
    | reference
    ;

arrayDeclaration
    : Array OpenBrace (arrayEntry (Comma arrayEntry)*)? CloseBrace  
    ;

arrayEntry
    : (keyValuePair | expression)
    ;

keyValuePair
    : (expression ArrayAssign expression)  
    ;

atom: SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration
    ;

//Need to be smarter with references, they have their own tower of application.
reference
    : Ampersand  nameOrFunctionCall
    | nameOrFunctionCall
    ;

nameOrFunctionCall
    : name functionCallParameters
          
    | name
    ;

functionCallParameters
@init{
    Level level = new Level();
    level.name="parameters";
}
@after{
    levels.add(level);
}
    : {level.start=input.LT(1).getTokenIndex();}OpenBrace 
        (expression (Comma expression)*)? 
        {level.end=input.LT(1).getTokenIndex();}CloseBrace
    ;

name: staticMemberAccess
    | memberAccess
    | variable
    ;
    
staticMemberAccess
    : UnquotedString '::'  variable
    ;

memberAccess
    : variable 
        ( OpenSquareBrace  expression CloseSquareBrace 
        | '->'  UnquotedString)*
    ;
    
variable
    : Dollar  variable
    | UnquotedString
    ;

BodyString 
    : '?>' (('<' ~ '?')=> '<' | ~'<' )* ('<?' ('php'?))?
    ;

fragment
FirstBodyString
    : (('<' ~ '?')=> '<' | ~'<' )* '<?' ('php'?)
    ;

MultilineComment    
    : '/*' (('*' ~ '/')=>'*' | ~ '*')* '*/' {$channel=HIDDEN;}
    ;

SinglelineComment
    : '//'  (('?' ~'>')=>'?' | ~('\n'|'?'))* {$channel=HIDDEN;}
    ;

UnixComment
    : '#' (('?' ~'>')=>'?' | ~('\n'|'?'))* {$channel=HIDDEN;}
    ;
    

Array
    : ('a'|'A')('r'|'R')('r'|'R')('a'|'A')('y'|'Y')
    ;

RequireOperator
    : 'require' | 'require_once' | 'include' | 'include_once'
    ;

PrimitiveType
    : 'int'|'float'|'string'|'array'|'object'|'bool'
    ;

AccessModifier
    : 'public' | 'private' | 'protected' 
    ;

fragment
Decimal	
	:('1'..'9' ('0'..'9')*)|'0'
	;
fragment
Hexadecimal
	: '0'('x'|'X')('0'..'9'|'a'..'f'|'A'..'F')+
	;
	
fragment
Octal
	: '0'('0'..'7')+
	;
Integer
	:Octal|Decimal|Hexadecimal
	;
	
fragment
Digits
	: '0'..'9'+
	;
	
fragment
DNum
	:(('.' Digits)=>('.' Digits)|(Digits '.' Digits?))
	;
	
fragment
Exponent_DNum
	:((Digits|DNum)('e'|'E')('+''-')?Digits)
	;
	
Real
    : DNum|Exponent_DNum
    ;

Boolean
    : 'true' | 'false'
    ;

SingleQuotedString
    : '\'' (('\\' '\'')=>'\\' '\''
    |         ('\\' '\\')=>'\\' '\\' 
    |         '\\' | ~ ('\'' | '\\'))* 
      '\''
    ;

fragment
EscapeCharector
    : 'n' | 'r' | 't' | '\\' | '$' | '"' | Digits | 'x'
    ;

DoubleQuotedString
    : '"'  ( ('\\' EscapeCharector)=> '\\' EscapeCharector 
    | '\\' 
    | ~('\\'|'"') )* 
      '"'
    ;

HereDoc 
    : '<<<' HereDocContents
    ;

//Todo handle '\x7f' - '\xff'
UnquotedString
   : ('a'..'z' | 'A'..'Z' | '_')  ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
   ;
   
//TODO: add error handling
fragment 
HereDocContents
    : {
        StringBuilder sb = new StringBuilder();
        while(input.LA(1)!='\n'){
            sb.append((char)input.LA(1));
            input.consume();
        }
        input.consume();
        String hereDocName = sb.toString();
        int hdnl = hereDocName.length();
        while(true){
            boolean matchEnd = true;
            for(int i = 0; i<hdnl; i++){
                if(input.LA(1)!=hereDocName.charAt(i)){
                    matchEnd=false;
                    break;
                }
                input.consume();
            }
            if(matchEnd==false){
                while(input.LA(1)!='\n'){
                    input.consume();
                }
                input.consume();
            }else{
                break;
            }
        }
    }
    ;

AsignmentOperator
    : '+='|'-='|'*='|'/='|'.='|'%='|'&='|'|='|'^='|'<<='|'>>='
    ;
    
EqualityOperator
    : '==' | '!=' | '===' | '!=='
    ;

ComparisionOperator
    : '<' | '<=' | '>' | '>=' | '<>'
    ;
    
ShiftOperator
    : '<<' | '>>'
    ;

IncrementOperator
    : '--'|'++'
    ;
    

fragment
Eol : '\n'
    ;

WhiteSpace
@init{
    $channel=HIDDEN;
}
	:	(' '| '\t'| '\n'|'\r')*
	;
	



