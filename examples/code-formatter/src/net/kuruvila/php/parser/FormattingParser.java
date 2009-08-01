// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g 2009-05-27 16:14:59

package net.kuruvila.php.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FormattingParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SemiColon", "Comma", "OpenBrace", "CloseBrace", "OpenSquareBrace", "CloseSquareBrace", "OpenCurlyBrace", "CloseCurlyBrace", "ArrayAssign", "LogicalOr", "LogicalAnd", "ClassMember", "InstanceMember", "SuppressWarnings", "QuestionMark", "Dollar", "Colon", "Dot", "Ampersand", "Pipe", "Bang", "Plus", "Minus", "Asterisk", "Percent", "Forwardslash", "Tilde", "Equals", "New", "Clone", "Echo", "If", "Else", "ElseIf", "For", "Foreach", "While", "Do", "Switch", "Case", "Default", "Function", "Break", "Continue", "Return", "Global", "Static", "And", "Or", "Xor", "Instanceof", "Class", "Interface", "Extends", "Implements", "Abstract", "Var", "Const", "Modifiers", "ClassDefinition", "Block", "Params", "Apply", "Member", "Reference", "Empty", "Prefix", "Postfix", "IfExpression", "Label", "Cast", "ForInit", "ForCondition", "ForUpdate", "Field", "Method", "BodyString", "UnquotedString", "AccessModifier", "Integer", "RequireOperator", "AsignmentOperator", "EqualityOperator", "ComparisionOperator", "ShiftOperator", "PrimitiveType", "IncrementOperator", "Array", "SingleQuotedString", "DoubleQuotedString", "HereDoc", "Real", "Boolean", "FirstBodyString", "MultilineComment", "SinglelineComment", "UnixComment", "Decimal", "Hexadecimal", "Octal", "Digits", "DNum", "Exponent_DNum", "EscapeCharector", "HereDocContents", "Eol", "WhiteSpace", "'as'"
    };
    public static final int Switch=42;
    public static final int DoubleQuotedString=93;
    public static final int New=32;
    public static final int Class=55;
    public static final int Foreach=39;
    public static final int Static=50;
    public static final int Plus=25;
    public static final int Params=65;
    public static final int Hexadecimal=102;
    public static final int Exponent_DNum=106;
    public static final int Equals=31;
    public static final int Default=44;
    public static final int Implements=58;
    public static final int Comma=5;
    public static final int MultilineComment=98;
    public static final int Integer=83;
    public static final int HereDocContents=108;
    public static final int CloseBrace=7;
    public static final int Colon=20;
    public static final int Var=60;
    public static final int EqualityOperator=86;
    public static final int ElseIf=37;
    public static final int Percent=28;
    public static final int Continue=47;
    public static final int QuestionMark=18;
    public static final int ForUpdate=77;
    public static final int Dollar=19;
    public static final int ClassDefinition=63;
    public static final int UnixComment=100;
    public static final int Prefix=70;
    public static final int Cast=74;
    public static final int Abstract=59;
    public static final int Label=73;
    public static final int ForInit=75;
    public static final int Asterisk=27;
    public static final int UnquotedString=81;
    public static final int Clone=33;
    public static final int Modifiers=62;
    public static final int Const=61;
    public static final int SinglelineComment=99;
    public static final int SingleQuotedString=92;
    public static final int Instanceof=54;
    public static final int Do=41;
    public static final int InstanceMember=16;
    public static final int Field=78;
    public static final int Reference=68;
    public static final int EscapeCharector=107;
    public static final int Ampersand=22;
    public static final int For=38;
    public static final int Octal=103;
    public static final int DNum=105;
    public static final int LogicalAnd=14;
    public static final int SemiColon=4;
    public static final int If=35;
    public static final int LogicalOr=13;
    public static final int Break=46;
    public static final int OpenCurlyBrace=10;
    public static final int ArrayAssign=12;
    public static final int Array=91;
    public static final int Apply=66;
    public static final int Postfix=71;
    public static final int RequireOperator=84;
    public static final int And=51;
    public static final int IncrementOperator=90;
    public static final int Decimal=101;
    public static final int Interface=56;
    public static final int CloseSquareBrace=9;
    public static final int CloseCurlyBrace=11;
    public static final int PrimitiveType=89;
    public static final int ClassMember=15;
    public static final int ShiftOperator=88;
    public static final int Dot=21;
    public static final int Minus=26;
    public static final int Boolean=96;
    public static final int WhiteSpace=110;
    public static final int Extends=57;
    public static final int IfExpression=72;
    public static final int Echo=34;
    public static final int Real=95;
    public static final int OpenSquareBrace=8;
    public static final int Eol=109;
    public static final int AccessModifier=82;
    public static final int Or=52;
    public static final int Forwardslash=29;
    public static final int Else=36;
    public static final int BodyString=80;
    public static final int SuppressWarnings=17;
    public static final int FirstBodyString=97;
    public static final int Xor=53;
    public static final int ForCondition=76;
    public static final int ComparisionOperator=87;
    public static final int Case=43;
    public static final int Function=45;
    public static final int Pipe=23;
    public static final int Global=49;
    public static final int Tilde=30;
    public static final int Block=64;
    public static final int T__111=111;
    public static final int Method=79;
    public static final int OpenBrace=6;
    public static final int While=40;
    public static final int Bang=24;
    public static final int EOF=-1;
    public static final int Empty=69;
    public static final int AsignmentOperator=85;
    public static final int Digits=104;
    public static final int HereDoc=94;
    public static final int Member=67;
    public static final int Return=48;

    // delegates
    // delegators


        public FormattingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FormattingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[175+1];
             
             
        }
        

    public String[] getTokenNames() { return FormattingParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g"; }


        private void emit(String text){
            ((TokenRewriteStream)input).insertBefore(input.LT(1), text);
        }
        
        /**
         * This function deletes all hidden tokens before the current token and not just the spaces.
         */
        private void eatPreviousSpaces(){
            TokenRewriteStream trs = ((TokenRewriteStream)input);
            Token next = trs.LT(1);
            int idx = next.getTokenIndex()-1;
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
        
        private void replaceLineWhiteSpaceWith(String repl){
            TokenRewriteStream trs = ((TokenRewriteStream)input);
            Token next = trs.LT(1);
            int idx = next.getTokenIndex()-1;
            while(idx != -1){
                Token token = trs.get(idx);
                if(token.getChannel()==Token.HIDDEN_CHANNEL){
                    trs.delete(token);
                    if(token.getType()==PhpLexer.WhiteSpace && token.getText().contains("\n")){
                        break;
                    }
                }else{
                    break;
                }
                idx-=1;
            }
        }
        private void replaceSpaceWith(String repl){
            eatPreviousSpaces();
            emit(repl);
        }



    // $ANTLR start "prog"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:174:1: prog : ( statement )* ;
    public final void prog() throws RecognitionException {
        int prog_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:174:6: ( ( statement )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:174:8: ( statement )*
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:174:8: ( statement )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_prog867);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "statement"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:176:1: statement : ( ( simpleStatement )? BodyString | '{' (stmts= statement )* '}' | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:177:5: ( ( simpleStatement )? BodyString | '{' (stmts= statement )* '}' | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' )
            int alt4=6;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:177:7: ( simpleStatement )? BodyString
                    {
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:177:7: ( simpleStatement )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: simpleStatement
                            {
                            pushFollow(FOLLOW_simpleStatement_in_statement880);
                            simpleStatement();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,BodyString,FOLLOW_BodyString_in_statement883); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:178:7: '{' (stmts= statement )* '}'
                    {
                    if ( state.backtracking==0 ) {
                      replaceSpaceWith("");
                    }
                    match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_statement892); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      replaceSpaceWith("\n");
                    }
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:179:14: (stmts= statement )*
                    loop3:
                    do {
                        int alt3=2;
                        alt3 = dfa3.predict(input);
                        switch (alt3) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: stmts= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement906);
                    	    statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      replaceSpaceWith("\n");
                    }
                    match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_statement917); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:182:7: classDefinition
                    {
                    pushFollow(FOLLOW_classDefinition_in_statement931);
                    classDefinition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:183:7: interfaceDefinition
                    {
                    pushFollow(FOLLOW_interfaceDefinition_in_statement939);
                    interfaceDefinition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:184:7: complexStatement
                    {
                    pushFollow(FOLLOW_complexStatement_in_statement947);
                    complexStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:185:7: simpleStatement ';'
                    {
                    pushFollow(FOLLOW_simpleStatement_in_statement955);
                    simpleStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SemiColon,FOLLOW_SemiColon_in_statement957); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, statement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "interfaceDefinition"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:188:1: interfaceDefinition : Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace ;
    public final void interfaceDefinition() throws RecognitionException {
        int interfaceDefinition_StartIndex = input.index();
        Token interfaceName=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:189:5: ( Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:189:7: Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace
            {
            match(input,Interface,FOLLOW_Interface_in_interfaceDefinition975); if (state.failed) return ;
            interfaceName=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceDefinition979); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:189:46: ( interfaceExtends )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Extends) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: interfaceExtends
                    {
                    pushFollow(FOLLOW_interfaceExtends_in_interfaceDefinition981);
                    interfaceExtends();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_interfaceDefinition992); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:191:9: ( interfaceMember )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Function||LA6_0==Static||LA6_0==Abstract||LA6_0==Const||LA6_0==AccessModifier) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: interfaceMember
            	    {
            	    pushFollow(FOLLOW_interfaceMember_in_interfaceDefinition1002);
            	    interfaceMember();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_interfaceDefinition1013); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, interfaceDefinition_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "interfaceDefinition"


    // $ANTLR start "interfaceExtends"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:196:1: interfaceExtends : Extends UnquotedString ( Comma UnquotedString )* ;
    public final void interfaceExtends() throws RecognitionException {
        int interfaceExtends_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:197:5: ( Extends UnquotedString ( Comma UnquotedString )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:197:7: Extends UnquotedString ( Comma UnquotedString )*
            {
            match(input,Extends,FOLLOW_Extends_in_interfaceExtends1040); if (state.failed) return ;
            match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1043); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:197:31: ( Comma UnquotedString )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:197:32: Comma UnquotedString
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_interfaceExtends1046); if (state.failed) return ;
            	    match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1049); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, interfaceExtends_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "interfaceExtends"


    // $ANTLR start "interfaceMember"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:199:1: interfaceMember : ( Const UnquotedString ( Equals atom )? ';' | ( fieldModifier )* Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace ';' );
    public final void interfaceMember() throws RecognitionException {
        int interfaceMember_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:200:5: ( Const UnquotedString ( Equals atom )? ';' | ( fieldModifier )* Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace ';' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Const) ) {
                alt12=1;
            }
            else if ( (LA12_0==Function||LA12_0==Static||LA12_0==Abstract||LA12_0==AccessModifier) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:200:7: Const UnquotedString ( Equals atom )? ';'
                    {
                    match(input,Const,FOLLOW_Const_in_interfaceMember1067); if (state.failed) return ;
                    match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1069); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:200:28: ( Equals atom )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Equals) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:200:29: Equals atom
                            {
                            match(input,Equals,FOLLOW_Equals_in_interfaceMember1072); if (state.failed) return ;
                            pushFollow(FOLLOW_atom_in_interfaceMember1074);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1078); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:202:7: ( fieldModifier )* Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace ';'
                    {
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:202:7: ( fieldModifier )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Static||LA9_0==Abstract||LA9_0==AccessModifier) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_interfaceMember1097);
                    	    fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,Function,FOLLOW_Function_in_interfaceMember1100); if (state.failed) return ;
                    match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1102); if (state.failed) return ;
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_interfaceMember1104); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:202:56: ( paramDef ( Comma paramDef )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Dollar||LA11_0==Ampersand) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:202:57: paramDef ( Comma paramDef )*
                            {
                            pushFollow(FOLLOW_paramDef_in_interfaceMember1107);
                            paramDef();

                            state._fsp--;
                            if (state.failed) return ;
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:202:66: ( Comma paramDef )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==Comma) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:202:67: Comma paramDef
                            	    {
                            	    match(input,Comma,FOLLOW_Comma_in_interfaceMember1110); if (state.failed) return ;
                            	    pushFollow(FOLLOW_paramDef_in_interfaceMember1112);
                            	    paramDef();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,CloseBrace,FOLLOW_CloseBrace_in_interfaceMember1118); if (state.failed) return ;
                    match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1120); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, interfaceMember_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "interfaceMember"


    // $ANTLR start "classDefinition"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:206:1: classDefinition : ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace ;
    public final void classDefinition() throws RecognitionException {
        int classDefinition_StartIndex = input.index();
        Token className=null;
        Token extendsclass=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:207:5: ( ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:207:9: ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:207:9: ( classModifier )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Abstract) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: classModifier
                    {
                    pushFollow(FOLLOW_classModifier_in_classDefinition1149);
                    classModifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,Class,FOLLOW_Class_in_classDefinition1161); if (state.failed) return ;
            className=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1165); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:209:9: ( Extends extendsclass= UnquotedString )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Extends) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:209:10: Extends extendsclass= UnquotedString
                    {
                    match(input,Extends,FOLLOW_Extends_in_classDefinition1177); if (state.failed) return ;
                    extendsclass=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1181); if (state.failed) return ;

                    }
                    break;

            }

            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:210:9: ( classImplements )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Implements) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: classImplements
                    {
                    pushFollow(FOLLOW_classImplements_in_classDefinition1194);
                    classImplements();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_classDefinition1205); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:212:9: ( classMember )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Dollar||LA16_0==Function||LA16_0==Static||(LA16_0>=Abstract && LA16_0<=Const)||LA16_0==AccessModifier) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDefinition1215);
            	    classMember();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_classDefinition1226); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, classDefinition_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classDefinition"


    // $ANTLR start "classImplements"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:217:1: classImplements : Implements ( UnquotedString ( Comma UnquotedString )* ) ;
    public final void classImplements() throws RecognitionException {
        int classImplements_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:218:5: ( Implements ( UnquotedString ( Comma UnquotedString )* ) )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:218:8: Implements ( UnquotedString ( Comma UnquotedString )* )
            {
            match(input,Implements,FOLLOW_Implements_in_classImplements1259); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:218:20: ( UnquotedString ( Comma UnquotedString )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:218:21: UnquotedString ( Comma UnquotedString )*
            {
            match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1263); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:218:36: ( Comma UnquotedString )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:218:37: Comma UnquotedString
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_classImplements1266); if (state.failed) return ;
            	    match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1269); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, classImplements_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classImplements"


    // $ANTLR start "classMember"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:221:1: classMember : ( ( fieldModifier )* Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace ( statementBlock | ';' ) | Var Dollar UnquotedString ( Equals atom )? ';' | Const UnquotedString ( Equals atom )? ';' | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' );
    public final void classMember() throws RecognitionException {
        int classMember_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:5: ( ( fieldModifier )* Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace ( statementBlock | ';' ) | Var Dollar UnquotedString ( Equals atom )? ';' | Const UnquotedString ( Equals atom )? ';' | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case Static:
            case Abstract:
            case AccessModifier:
                {
                switch ( input.LA(2) ) {
                case Dollar:
                    {
                    alt26=4;
                    }
                    break;
                case Static:
                case Abstract:
                case AccessModifier:
                    {
                    int LA26_7 = input.LA(3);

                    if ( (synpred26_Formatting()) ) {
                        alt26=1;
                    }
                    else if ( (true) ) {
                        alt26=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case Function:
                    {
                    alt26=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

                }
                break;
            case Function:
                {
                alt26=1;
                }
                break;
            case Var:
                {
                alt26=2;
                }
                break;
            case Const:
                {
                alt26=3;
                }
                break;
            case Dollar:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:7: ( fieldModifier )* Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace ( statementBlock | ';' )
                    {
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:7: ( fieldModifier )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Static||LA18_0==Abstract||LA18_0==AccessModifier) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_classMember1289);
                    	    fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match(input,Function,FOLLOW_Function_in_classMember1292); if (state.failed) return ;
                    match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1294); if (state.failed) return ;
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_classMember1296); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:56: ( paramDef ( Comma paramDef )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==Dollar||LA20_0==Ampersand) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:57: paramDef ( Comma paramDef )*
                            {
                            pushFollow(FOLLOW_paramDef_in_classMember1299);
                            paramDef();

                            state._fsp--;
                            if (state.failed) return ;
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:66: ( Comma paramDef )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==Comma) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:67: Comma paramDef
                            	    {
                            	    match(input,Comma,FOLLOW_Comma_in_classMember1302); if (state.failed) return ;
                            	    pushFollow(FOLLOW_paramDef_in_classMember1304);
                            	    paramDef();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,CloseBrace,FOLLOW_CloseBrace_in_classMember1310); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:223:9: ( statementBlock | ';' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==OpenCurlyBrace) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==SemiColon) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:223:10: statementBlock
                            {
                            pushFollow(FOLLOW_statementBlock_in_classMember1322);
                            statementBlock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:223:27: ';'
                            {
                            match(input,SemiColon,FOLLOW_SemiColon_in_classMember1326); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:225:7: Var Dollar UnquotedString ( Equals atom )? ';'
                    {
                    match(input,Var,FOLLOW_Var_in_classMember1345); if (state.failed) return ;
                    match(input,Dollar,FOLLOW_Dollar_in_classMember1347); if (state.failed) return ;
                    match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1349); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:225:33: ( Equals atom )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==Equals) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:225:34: Equals atom
                            {
                            match(input,Equals,FOLLOW_Equals_in_classMember1352); if (state.failed) return ;
                            pushFollow(FOLLOW_atom_in_classMember1354);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,SemiColon,FOLLOW_SemiColon_in_classMember1358); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:227:7: Const UnquotedString ( Equals atom )? ';'
                    {
                    match(input,Const,FOLLOW_Const_in_classMember1378); if (state.failed) return ;
                    match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1380); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:227:28: ( Equals atom )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==Equals) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:227:29: Equals atom
                            {
                            match(input,Equals,FOLLOW_Equals_in_classMember1383); if (state.failed) return ;
                            pushFollow(FOLLOW_atom_in_classMember1385);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,SemiColon,FOLLOW_SemiColon_in_classMember1389); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:229:7: ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';'
                    {
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:229:7: ( fieldModifier )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Static||LA24_0==Abstract||LA24_0==AccessModifier) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_classMember1408);
                    	    fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:229:22: ( Dollar UnquotedString )
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:229:23: Dollar UnquotedString
                    {
                    match(input,Dollar,FOLLOW_Dollar_in_classMember1412); if (state.failed) return ;
                    match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1414); if (state.failed) return ;

                    }

                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:229:46: ( Equals atom )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==Equals) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:229:47: Equals atom
                            {
                            match(input,Equals,FOLLOW_Equals_in_classMember1418); if (state.failed) return ;
                            pushFollow(FOLLOW_atom_in_classMember1420);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,SemiColon,FOLLOW_SemiColon_in_classMember1424); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, classMember_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classMember"


    // $ANTLR start "statementBlock"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:233:1: statementBlock : OpenCurlyBrace ( statement )* CloseCurlyBrace ;
    public final void statementBlock() throws RecognitionException {
        int statementBlock_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:234:5: ( OpenCurlyBrace ( statement )* CloseCurlyBrace )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:234:7: OpenCurlyBrace ( statement )* CloseCurlyBrace
            {
            match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_statementBlock1456); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:234:22: ( statement )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statementBlock1458);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_statementBlock1461); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, statementBlock_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "statementBlock"


    // $ANTLR start "fieldDefinition"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:237:1: fieldDefinition : Dollar UnquotedString ( Equals atom )? ';' ;
    public final void fieldDefinition() throws RecognitionException {
        int fieldDefinition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:238:5: ( Dollar UnquotedString ( Equals atom )? ';' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:238:7: Dollar UnquotedString ( Equals atom )? ';'
            {
            match(input,Dollar,FOLLOW_Dollar_in_fieldDefinition1480); if (state.failed) return ;
            match(input,UnquotedString,FOLLOW_UnquotedString_in_fieldDefinition1482); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:238:29: ( Equals atom )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Equals) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:238:30: Equals atom
                    {
                    match(input,Equals,FOLLOW_Equals_in_fieldDefinition1485); if (state.failed) return ;
                    pushFollow(FOLLOW_atom_in_fieldDefinition1487);
                    atom();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SemiColon,FOLLOW_SemiColon_in_fieldDefinition1491); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, fieldDefinition_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "fieldDefinition"


    // $ANTLR start "classModifier"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:241:1: classModifier : 'abstract' ;
    public final void classModifier() throws RecognitionException {
        int classModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:242:5: ( 'abstract' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:242:7: 'abstract'
            {
            match(input,Abstract,FOLLOW_Abstract_in_classModifier1513); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, classModifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classModifier"


    // $ANTLR start "fieldModifier"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:244:1: fieldModifier : ( AccessModifier | 'abstract' | 'static' );
    public final void fieldModifier() throws RecognitionException {
        int fieldModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:245:5: ( AccessModifier | 'abstract' | 'static' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:
            {
            if ( input.LA(1)==Static||input.LA(1)==Abstract||input.LA(1)==AccessModifier ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, fieldModifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "fieldModifier"


    // $ANTLR start "complexStatement"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:249:1: complexStatement : ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? | For '(' forInit forCondition forUpdate ')' statement | Foreach '(' variable 'as' arrayEntry ')' statement | While '(' (whileCondition= expression )? ')' statement | Do statement While '(' doCondition= expression ')' ';' | Switch '(' expression ')' '{' cases '}' | functionDefinition );
    public final void complexStatement() throws RecognitionException {
        int complexStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:250:5: ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? | For '(' forInit forCondition forUpdate ')' statement | Foreach '(' variable 'as' arrayEntry ')' statement | While '(' (whileCondition= expression )? ')' statement | Do statement While '(' doCondition= expression ')' ';' | Switch '(' expression ')' '{' cases '}' | functionDefinition )
            int alt31=7;
            switch ( input.LA(1) ) {
            case If:
                {
                alt31=1;
                }
                break;
            case For:
                {
                alt31=2;
                }
                break;
            case Foreach:
                {
                alt31=3;
                }
                break;
            case While:
                {
                alt31=4;
                }
                break;
            case Do:
                {
                alt31=5;
                }
                break;
            case Switch:
                {
                alt31=6;
                }
                break;
            case Function:
                {
                alt31=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:250:7: If '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
                    {
                    match(input,If,FOLLOW_If_in_complexStatement1556); if (state.failed) return ;
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1558); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_complexStatement1562);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1564); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_complexStatement1568);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:250:58: ( conditional )?
                    int alt29=2;
                    alt29 = dfa29.predict(input);
                    switch (alt29) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: conditional
                            {
                            pushFollow(FOLLOW_conditional_in_complexStatement1570);
                            conditional();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:252:7: For '(' forInit forCondition forUpdate ')' statement
                    {
                    match(input,For,FOLLOW_For_in_complexStatement1589); if (state.failed) return ;
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1591); if (state.failed) return ;
                    pushFollow(FOLLOW_forInit_in_complexStatement1593);
                    forInit();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_forCondition_in_complexStatement1595);
                    forCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_forUpdate_in_complexStatement1597);
                    forUpdate();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1599); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_complexStatement1601);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:253:7: Foreach '(' variable 'as' arrayEntry ')' statement
                    {
                    match(input,Foreach,FOLLOW_Foreach_in_complexStatement1611); if (state.failed) return ;
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1613); if (state.failed) return ;
                    pushFollow(FOLLOW_variable_in_complexStatement1615);
                    variable();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,111,FOLLOW_111_in_complexStatement1617); if (state.failed) return ;
                    pushFollow(FOLLOW_arrayEntry_in_complexStatement1619);
                    arrayEntry();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1621); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_complexStatement1623);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:254:7: While '(' (whileCondition= expression )? ')' statement
                    {
                    match(input,While,FOLLOW_While_in_complexStatement1633); if (state.failed) return ;
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1635); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:254:31: (whileCondition= expression )?
                    int alt30=2;
                    alt30 = dfa30.predict(input);
                    switch (alt30) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: whileCondition= expression
                            {
                            pushFollow(FOLLOW_expression_in_complexStatement1639);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1642); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_complexStatement1644);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:255:7: Do statement While '(' doCondition= expression ')' ';'
                    {
                    match(input,Do,FOLLOW_Do_in_complexStatement1654); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_complexStatement1656);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,While,FOLLOW_While_in_complexStatement1658); if (state.failed) return ;
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1660); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_complexStatement1664);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1666); if (state.failed) return ;
                    match(input,SemiColon,FOLLOW_SemiColon_in_complexStatement1668); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:256:7: Switch '(' expression ')' '{' cases '}'
                    {
                    match(input,Switch,FOLLOW_Switch_in_complexStatement1678); if (state.failed) return ;
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1680); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_complexStatement1682);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1684); if (state.failed) return ;
                    match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_complexStatement1686); if (state.failed) return ;
                    pushFollow(FOLLOW_cases_in_complexStatement1687);
                    cases();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_complexStatement1688); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:257:7: functionDefinition
                    {
                    pushFollow(FOLLOW_functionDefinition_in_complexStatement1698);
                    functionDefinition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, complexStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "complexStatement"


    // $ANTLR start "curlyBraceCheck"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:260:1: curlyBraceCheck : statement ;
    public final void curlyBraceCheck() throws RecognitionException {
        int curlyBraceCheck_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:261:5: ( statement )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:262:7: statement
            {
            pushFollow(FOLLOW_statement_in_curlyBraceCheck1722);
            statement();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, curlyBraceCheck_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "curlyBraceCheck"


    // $ANTLR start "simpleStatement"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:265:1: simpleStatement : ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression );
    public final void simpleStatement() throws RecognitionException {
        int simpleStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:266:5: ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression )
            int alt36=8;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:266:7: Echo commaList
                    {
                    match(input,Echo,FOLLOW_Echo_in_simpleStatement1739); if (state.failed) return ;
                    pushFollow(FOLLOW_commaList_in_simpleStatement1742);
                    commaList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:267:7: Global name ( ',' name )*
                    {
                    match(input,Global,FOLLOW_Global_in_simpleStatement1750); if (state.failed) return ;
                    pushFollow(FOLLOW_name_in_simpleStatement1753);
                    name();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:267:20: ( ',' name )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Comma) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:267:21: ',' name
                    	    {
                    	    match(input,Comma,FOLLOW_Comma_in_simpleStatement1756); if (state.failed) return ;
                    	    pushFollow(FOLLOW_name_in_simpleStatement1759);
                    	    name();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:268:7: Static variable Equals atom
                    {
                    match(input,Static,FOLLOW_Static_in_simpleStatement1769); if (state.failed) return ;
                    pushFollow(FOLLOW_variable_in_simpleStatement1772);
                    variable();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,Equals,FOLLOW_Equals_in_simpleStatement1774); if (state.failed) return ;
                    pushFollow(FOLLOW_atom_in_simpleStatement1777);
                    atom();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:269:7: Break ( Integer )?
                    {
                    match(input,Break,FOLLOW_Break_in_simpleStatement1785); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:269:14: ( Integer )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==Integer) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: Integer
                            {
                            match(input,Integer,FOLLOW_Integer_in_simpleStatement1788); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:270:7: Continue ( Integer )?
                    {
                    match(input,Continue,FOLLOW_Continue_in_simpleStatement1797); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:270:17: ( Integer )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==Integer) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: Integer
                            {
                            match(input,Integer,FOLLOW_Integer_in_simpleStatement1800); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:272:7: Return ( expression )?
                    {
                    match(input,Return,FOLLOW_Return_in_simpleStatement1814); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:272:15: ( expression )?
                    int alt35=2;
                    alt35 = dfa35.predict(input);
                    switch (alt35) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_simpleStatement1817);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:273:7: RequireOperator expression
                    {
                    match(input,RequireOperator,FOLLOW_RequireOperator_in_simpleStatement1826); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_simpleStatement1829);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:274:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_simpleStatement1837);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, simpleStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "simpleStatement"


    // $ANTLR start "conditional"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:278:1: conditional : ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? | Else statement );
    public final void conditional() throws RecognitionException {
        int conditional_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:279:5: ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? | Else statement )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ElseIf) ) {
                alt38=1;
            }
            else if ( (LA38_0==Else) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:279:7: ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
                    {
                    match(input,ElseIf,FOLLOW_ElseIf_in_conditional1855); if (state.failed) return ;
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_conditional1857); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_conditional1861);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,CloseBrace,FOLLOW_CloseBrace_in_conditional1863); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_conditional1867);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:279:62: ( conditional )?
                    int alt37=2;
                    alt37 = dfa37.predict(input);
                    switch (alt37) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: conditional
                            {
                            pushFollow(FOLLOW_conditional_in_conditional1869);
                            conditional();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:280:7: Else statement
                    {
                    match(input,Else,FOLLOW_Else_in_conditional1880); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_conditional1882);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, conditional_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "conditional"


    // $ANTLR start "forInit"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:283:1: forInit : ( commaList )? ';' ;
    public final void forInit() throws RecognitionException {
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:284:5: ( ( commaList )? ';' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:284:7: ( commaList )? ';'
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:284:7: ( commaList )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forInit1901);
                    commaList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SemiColon,FOLLOW_SemiColon_in_forInit1904); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, forInit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "forInit"


    // $ANTLR start "forCondition"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:287:1: forCondition : ( commaList )? ';' ;
    public final void forCondition() throws RecognitionException {
        int forCondition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:288:5: ( ( commaList )? ';' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:288:7: ( commaList )? ';'
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:288:7: ( commaList )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forCondition1923);
                    commaList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,SemiColon,FOLLOW_SemiColon_in_forCondition1926); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, forCondition_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "forCondition"


    // $ANTLR start "forUpdate"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:291:1: forUpdate : ( commaList )? ;
    public final void forUpdate() throws RecognitionException {
        int forUpdate_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:292:5: ( ( commaList )? )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:292:7: ( commaList )?
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:292:7: ( commaList )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forUpdate1949);
                    commaList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, forUpdate_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "forUpdate"


    // $ANTLR start "cases"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:295:1: cases : ( casestatement )* defaultcase ;
    public final void cases() throws RecognitionException {
        int cases_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:296:5: ( ( casestatement )* defaultcase )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:296:7: ( casestatement )* defaultcase
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:296:7: ( casestatement )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==Case) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: casestatement
            	    {
            	    pushFollow(FOLLOW_casestatement_in_cases1970);
            	    casestatement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            pushFollow(FOLLOW_defaultcase_in_cases1974);
            defaultcase();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, cases_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "cases"


    // $ANTLR start "casestatement"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:299:1: casestatement : Case expression ':' ( statement )* ;
    public final void casestatement() throws RecognitionException {
        int casestatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:300:5: ( Case expression ':' ( statement )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:300:7: Case expression ':' ( statement )*
            {
            match(input,Case,FOLLOW_Case_in_casestatement1991); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_casestatement1994);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,Colon,FOLLOW_Colon_in_casestatement1996); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:300:29: ( statement )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestatement1999);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, casestatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "casestatement"


    // $ANTLR start "defaultcase"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:303:1: defaultcase : ( Default ':' ( statement )* ) ;
    public final void defaultcase() throws RecognitionException {
        int defaultcase_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:304:5: ( ( Default ':' ( statement )* ) )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:304:7: ( Default ':' ( statement )* )
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:304:7: ( Default ':' ( statement )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:304:8: Default ':' ( statement )*
            {
            match(input,Default,FOLLOW_Default_in_defaultcase2019); if (state.failed) return ;
            match(input,Colon,FOLLOW_Colon_in_defaultcase2022); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:304:22: ( statement )*
            loop44:
            do {
                int alt44=2;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultcase2025);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, defaultcase_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "defaultcase"


    // $ANTLR start "functionDefinition"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:307:1: functionDefinition : Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace '{' ( statement )* '}' ;
    public final void functionDefinition() throws RecognitionException {
        int functionDefinition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:308:5: ( Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace '{' ( statement )* '}' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:308:7: Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace '{' ( statement )* '}'
            {
            match(input,Function,FOLLOW_Function_in_functionDefinition2044); if (state.failed) return ;
            match(input,UnquotedString,FOLLOW_UnquotedString_in_functionDefinition2046); if (state.failed) return ;
            match(input,OpenBrace,FOLLOW_OpenBrace_in_functionDefinition2048); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:308:41: ( paramDef ( Comma paramDef )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Dollar||LA46_0==Ampersand) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:308:42: paramDef ( Comma paramDef )*
                    {
                    pushFollow(FOLLOW_paramDef_in_functionDefinition2051);
                    paramDef();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:308:51: ( Comma paramDef )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==Comma) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:308:52: Comma paramDef
                    	    {
                    	    match(input,Comma,FOLLOW_Comma_in_functionDefinition2054); if (state.failed) return ;
                    	    pushFollow(FOLLOW_paramDef_in_functionDefinition2056);
                    	    paramDef();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,CloseBrace,FOLLOW_CloseBrace_in_functionDefinition2062); if (state.failed) return ;
            match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_functionDefinition2064); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:308:86: ( statement )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_functionDefinition2066);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_functionDefinition2069); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, functionDefinition_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "functionDefinition"


    // $ANTLR start "paramDef"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:311:1: paramDef : paramName ( Equals atom )? ;
    public final void paramDef() throws RecognitionException {
        int paramDef_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:312:5: ( paramName ( Equals atom )? )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:312:7: paramName ( Equals atom )?
            {
            pushFollow(FOLLOW_paramName_in_paramDef2092);
            paramName();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:312:17: ( Equals atom )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Equals) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:312:18: Equals atom
                    {
                    match(input,Equals,FOLLOW_Equals_in_paramDef2095); if (state.failed) return ;
                    pushFollow(FOLLOW_atom_in_paramDef2098);
                    atom();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, paramDef_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "paramDef"


    // $ANTLR start "paramName"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:315:1: paramName : ( Dollar UnquotedString | Ampersand Dollar UnquotedString );
    public final void paramName() throws RecognitionException {
        int paramName_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:316:5: ( Dollar UnquotedString | Ampersand Dollar UnquotedString )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Dollar) ) {
                alt49=1;
            }
            else if ( (LA49_0==Ampersand) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:316:7: Dollar UnquotedString
                    {
                    match(input,Dollar,FOLLOW_Dollar_in_paramName2117); if (state.failed) return ;
                    match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2120); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:317:7: Ampersand Dollar UnquotedString
                    {
                    match(input,Ampersand,FOLLOW_Ampersand_in_paramName2128); if (state.failed) return ;
                    match(input,Dollar,FOLLOW_Dollar_in_paramName2130); if (state.failed) return ;
                    match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2132); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, paramName_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "paramName"


    // $ANTLR start "commaList"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:320:1: commaList : expression ( ',' expression )* ;
    public final void commaList() throws RecognitionException {
        int commaList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:321:5: ( expression ( ',' expression )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:321:7: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_commaList2151);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:321:18: ( ',' expression )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==Comma) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:321:19: ',' expression
            	    {
            	    match(input,Comma,FOLLOW_Comma_in_commaList2154); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_commaList2157);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, commaList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "commaList"


    // $ANTLR start "expression"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:324:1: expression : weakLogicalOr ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:325:5: ( weakLogicalOr )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:325:7: weakLogicalOr
            {
            pushFollow(FOLLOW_weakLogicalOr_in_expression2181);
            weakLogicalOr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "weakLogicalOr"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:328:1: weakLogicalOr : weakLogicalXor ( Or weakLogicalXor )* ;
    public final void weakLogicalOr() throws RecognitionException {
        int weakLogicalOr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:329:5: ( weakLogicalXor ( Or weakLogicalXor )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:329:7: weakLogicalXor ( Or weakLogicalXor )*
            {
            pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2198);
            weakLogicalXor();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:329:22: ( Or weakLogicalXor )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:329:23: Or weakLogicalXor
            	    {
            	    match(input,Or,FOLLOW_Or_in_weakLogicalOr2201); if (state.failed) return ;
            	    pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2204);
            	    weakLogicalXor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, weakLogicalOr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "weakLogicalOr"


    // $ANTLR start "weakLogicalXor"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:332:1: weakLogicalXor : weakLogicalAnd ( Xor weakLogicalAnd )* ;
    public final void weakLogicalXor() throws RecognitionException {
        int weakLogicalXor_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:333:5: ( weakLogicalAnd ( Xor weakLogicalAnd )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:333:7: weakLogicalAnd ( Xor weakLogicalAnd )*
            {
            pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2223);
            weakLogicalAnd();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:333:22: ( Xor weakLogicalAnd )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:333:23: Xor weakLogicalAnd
            	    {
            	    match(input,Xor,FOLLOW_Xor_in_weakLogicalXor2226); if (state.failed) return ;
            	    pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2229);
            	    weakLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, weakLogicalXor_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "weakLogicalXor"


    // $ANTLR start "weakLogicalAnd"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:336:1: weakLogicalAnd : assignment ( And assignment )* ;
    public final void weakLogicalAnd() throws RecognitionException {
        int weakLogicalAnd_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:337:5: ( assignment ( And assignment )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:337:7: assignment ( And assignment )*
            {
            pushFollow(FOLLOW_assignment_in_weakLogicalAnd2252);
            assignment();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:337:18: ( And assignment )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:337:19: And assignment
            	    {
            	    match(input,And,FOLLOW_And_in_weakLogicalAnd2255); if (state.failed) return ;
            	    pushFollow(FOLLOW_assignment_in_weakLogicalAnd2258);
            	    assignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, weakLogicalAnd_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "weakLogicalAnd"


    // $ANTLR start "assignment"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:340:1: assignment : ( name ( ( Equals | AsignmentOperator ) assignment ) | ternary );
    public final void assignment() throws RecognitionException {
        int assignment_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:341:5: ( name ( ( Equals | AsignmentOperator ) assignment ) | ternary )
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:341:7: name ( ( Equals | AsignmentOperator ) assignment )
                    {
                    pushFollow(FOLLOW_name_in_assignment2277);
                    name();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:341:12: ( ( Equals | AsignmentOperator ) assignment )
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:341:13: ( Equals | AsignmentOperator ) assignment
                    {
                    if ( input.LA(1)==Equals||input.LA(1)==AsignmentOperator ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_assignment_in_assignment2289);
                    assignment();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:342:7: ternary
                    {
                    pushFollow(FOLLOW_ternary_in_assignment2298);
                    ternary();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, assignment_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "ternary"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:345:1: ternary : ( logicalOr QuestionMark expression Colon expression | logicalOr );
    public final void ternary() throws RecognitionException {
        int ternary_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:346:5: ( logicalOr QuestionMark expression Colon expression | logicalOr )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:346:7: logicalOr QuestionMark expression Colon expression
                    {
                    pushFollow(FOLLOW_logicalOr_in_ternary2315);
                    logicalOr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2317); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_ternary2319);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,Colon,FOLLOW_Colon_in_ternary2321); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_ternary2323);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:347:7: logicalOr
                    {
                    pushFollow(FOLLOW_logicalOr_in_ternary2333);
                    logicalOr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, ternary_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ternary"


    // $ANTLR start "logicalOr"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:350:1: logicalOr : logicalAnd ( LogicalOr logicalAnd )* ;
    public final void logicalOr() throws RecognitionException {
        int logicalOr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:351:5: ( logicalAnd ( LogicalOr logicalAnd )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:351:7: logicalAnd ( LogicalOr logicalAnd )*
            {
            pushFollow(FOLLOW_logicalAnd_in_logicalOr2354);
            logicalAnd();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:351:18: ( LogicalOr logicalAnd )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:351:19: LogicalOr logicalAnd
            	    {
            	    match(input,LogicalOr,FOLLOW_LogicalOr_in_logicalOr2357); if (state.failed) return ;
            	    pushFollow(FOLLOW_logicalAnd_in_logicalOr2360);
            	    logicalAnd();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, logicalOr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "logicalOr"


    // $ANTLR start "logicalAnd"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:354:1: logicalAnd : bitwiseOr ( LogicalAnd bitwiseOr )* ;
    public final void logicalAnd() throws RecognitionException {
        int logicalAnd_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:355:5: ( bitwiseOr ( LogicalAnd bitwiseOr )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:355:7: bitwiseOr ( LogicalAnd bitwiseOr )*
            {
            pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2379);
            bitwiseOr();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:355:17: ( LogicalAnd bitwiseOr )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:355:18: LogicalAnd bitwiseOr
            	    {
            	    match(input,LogicalAnd,FOLLOW_LogicalAnd_in_logicalAnd2382); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2385);
            	    bitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, logicalAnd_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "logicalAnd"


    // $ANTLR start "bitwiseOr"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:358:1: bitwiseOr : bitWiseAnd ( Pipe bitWiseAnd )* ;
    public final void bitwiseOr() throws RecognitionException {
        int bitwiseOr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:359:5: ( bitWiseAnd ( Pipe bitWiseAnd )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:359:7: bitWiseAnd ( Pipe bitWiseAnd )*
            {
            pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2408);
            bitWiseAnd();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:359:18: ( Pipe bitWiseAnd )*
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:359:19: Pipe bitWiseAnd
            	    {
            	    match(input,Pipe,FOLLOW_Pipe_in_bitwiseOr2411); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2414);
            	    bitWiseAnd();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, bitwiseOr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitwiseOr"


    // $ANTLR start "bitWiseAnd"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:362:1: bitWiseAnd : equalityCheck ( Ampersand equalityCheck )* ;
    public final void bitWiseAnd() throws RecognitionException {
        int bitWiseAnd_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:363:5: ( equalityCheck ( Ampersand equalityCheck )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:363:7: equalityCheck ( Ampersand equalityCheck )*
            {
            pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2433);
            equalityCheck();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:363:21: ( Ampersand equalityCheck )*
            loop59:
            do {
                int alt59=2;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:363:22: Ampersand equalityCheck
            	    {
            	    match(input,Ampersand,FOLLOW_Ampersand_in_bitWiseAnd2436); if (state.failed) return ;
            	    pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2439);
            	    equalityCheck();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, bitWiseAnd_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitWiseAnd"


    // $ANTLR start "equalityCheck"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:366:1: equalityCheck : comparisionCheck ( EqualityOperator comparisionCheck )? ;
    public final void equalityCheck() throws RecognitionException {
        int equalityCheck_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:367:5: ( comparisionCheck ( EqualityOperator comparisionCheck )? )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:367:7: comparisionCheck ( EqualityOperator comparisionCheck )?
            {
            pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2458);
            comparisionCheck();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:367:24: ( EqualityOperator comparisionCheck )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:367:25: EqualityOperator comparisionCheck
                    {
                    match(input,EqualityOperator,FOLLOW_EqualityOperator_in_equalityCheck2461); if (state.failed) return ;
                    pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2464);
                    comparisionCheck();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, equalityCheck_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "equalityCheck"


    // $ANTLR start "comparisionCheck"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:370:1: comparisionCheck : bitWiseShift ( ComparisionOperator bitWiseShift )? ;
    public final void comparisionCheck() throws RecognitionException {
        int comparisionCheck_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:371:5: ( bitWiseShift ( ComparisionOperator bitWiseShift )? )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:371:7: bitWiseShift ( ComparisionOperator bitWiseShift )?
            {
            pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2487);
            bitWiseShift();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:371:20: ( ComparisionOperator bitWiseShift )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:371:21: ComparisionOperator bitWiseShift
                    {
                    match(input,ComparisionOperator,FOLLOW_ComparisionOperator_in_comparisionCheck2490); if (state.failed) return ;
                    pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2493);
                    bitWiseShift();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, comparisionCheck_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "comparisionCheck"


    // $ANTLR start "bitWiseShift"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:374:1: bitWiseShift : addition ( ShiftOperator addition )* ;
    public final void bitWiseShift() throws RecognitionException {
        int bitWiseShift_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:375:5: ( addition ( ShiftOperator addition )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:375:7: addition ( ShiftOperator addition )*
            {
            pushFollow(FOLLOW_addition_in_bitWiseShift2512);
            addition();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:375:16: ( ShiftOperator addition )*
            loop62:
            do {
                int alt62=2;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:375:17: ShiftOperator addition
            	    {
            	    match(input,ShiftOperator,FOLLOW_ShiftOperator_in_bitWiseShift2515); if (state.failed) return ;
            	    pushFollow(FOLLOW_addition_in_bitWiseShift2518);
            	    addition();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, bitWiseShift_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitWiseShift"


    // $ANTLR start "addition"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:378:1: addition : multiplication ( ( Plus | Minus | Dot ) multiplication )* ;
    public final void addition() throws RecognitionException {
        int addition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:379:5: ( multiplication ( ( Plus | Minus | Dot ) multiplication )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:379:7: multiplication ( ( Plus | Minus | Dot ) multiplication )*
            {
            pushFollow(FOLLOW_multiplication_in_addition2541);
            multiplication();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:379:22: ( ( Plus | Minus | Dot ) multiplication )*
            loop63:
            do {
                int alt63=2;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:379:23: ( Plus | Minus | Dot ) multiplication
            	    {
            	    if ( input.LA(1)==Dot||(input.LA(1)>=Plus && input.LA(1)<=Minus) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplication_in_addition2557);
            	    multiplication();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, addition_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "addition"


    // $ANTLR start "multiplication"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:382:1: multiplication : logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )* ;
    public final void multiplication() throws RecognitionException {
        int multiplication_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:383:5: ( logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:383:7: logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )*
            {
            pushFollow(FOLLOW_logicalNot_in_multiplication2576);
            logicalNot();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:383:18: ( ( Asterisk | Forwardslash | Percent ) logicalNot )*
            loop64:
            do {
                int alt64=2;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:383:19: ( Asterisk | Forwardslash | Percent ) logicalNot
            	    {
            	    if ( (input.LA(1)>=Asterisk && input.LA(1)<=Forwardslash) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_logicalNot_in_multiplication2592);
            	    logicalNot();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, multiplication_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "multiplication"


    // $ANTLR start "logicalNot"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:386:1: logicalNot : ( Bang logicalNot | instanceOf );
    public final void logicalNot() throws RecognitionException {
        int logicalNot_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:387:5: ( Bang logicalNot | instanceOf )
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:387:7: Bang logicalNot
                    {
                    match(input,Bang,FOLLOW_Bang_in_logicalNot2611); if (state.failed) return ;
                    pushFollow(FOLLOW_logicalNot_in_logicalNot2614);
                    logicalNot();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:388:7: instanceOf
                    {
                    pushFollow(FOLLOW_instanceOf_in_logicalNot2622);
                    instanceOf();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, logicalNot_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "logicalNot"


    // $ANTLR start "instanceOf"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:391:1: instanceOf : negateOrCast ( Instanceof negateOrCast )? ;
    public final void instanceOf() throws RecognitionException {
        int instanceOf_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:392:5: ( negateOrCast ( Instanceof negateOrCast )? )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:392:7: negateOrCast ( Instanceof negateOrCast )?
            {
            pushFollow(FOLLOW_negateOrCast_in_instanceOf2639);
            negateOrCast();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:392:20: ( Instanceof negateOrCast )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:392:21: Instanceof negateOrCast
                    {
                    match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2642); if (state.failed) return ;
                    pushFollow(FOLLOW_negateOrCast_in_instanceOf2645);
                    negateOrCast();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, instanceOf_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "instanceOf"


    // $ANTLR start "negateOrCast"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:395:1: negateOrCast : ( ( Tilde | Minus | SuppressWarnings ) increment | OpenBrace PrimitiveType CloseBrace increment | OpenBrace weakLogicalAnd CloseBrace | increment );
    public final void negateOrCast() throws RecognitionException {
        int negateOrCast_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:396:5: ( ( Tilde | Minus | SuppressWarnings ) increment | OpenBrace PrimitiveType CloseBrace increment | OpenBrace weakLogicalAnd CloseBrace | increment )
            int alt67=4;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:396:7: ( Tilde | Minus | SuppressWarnings ) increment
                    {
                    if ( input.LA(1)==SuppressWarnings||input.LA(1)==Minus||input.LA(1)==Tilde ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_increment_in_negateOrCast2677);
                    increment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:397:7: OpenBrace PrimitiveType CloseBrace increment
                    {
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_negateOrCast2685); if (state.failed) return ;
                    match(input,PrimitiveType,FOLLOW_PrimitiveType_in_negateOrCast2687); if (state.failed) return ;
                    match(input,CloseBrace,FOLLOW_CloseBrace_in_negateOrCast2689); if (state.failed) return ;
                    pushFollow(FOLLOW_increment_in_negateOrCast2691);
                    increment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:398:7: OpenBrace weakLogicalAnd CloseBrace
                    {
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_negateOrCast2701); if (state.failed) return ;
                    pushFollow(FOLLOW_weakLogicalAnd_in_negateOrCast2704);
                    weakLogicalAnd();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,CloseBrace,FOLLOW_CloseBrace_in_negateOrCast2706); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:399:7: increment
                    {
                    pushFollow(FOLLOW_increment_in_negateOrCast2715);
                    increment();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, negateOrCast_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "negateOrCast"


    // $ANTLR start "increment"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:402:1: increment : ( IncrementOperator name | name IncrementOperator | newOrClone );
    public final void increment() throws RecognitionException {
        int increment_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:403:5: ( IncrementOperator name | name IncrementOperator | newOrClone )
            int alt68=3;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:403:7: IncrementOperator name
                    {
                    match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment2732); if (state.failed) return ;
                    pushFollow(FOLLOW_name_in_increment2734);
                    name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:404:7: name IncrementOperator
                    {
                    pushFollow(FOLLOW_name_in_increment2744);
                    name();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment2746); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:405:7: newOrClone
                    {
                    pushFollow(FOLLOW_newOrClone_in_increment2756);
                    newOrClone();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, increment_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "increment"


    // $ANTLR start "newOrClone"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:408:1: newOrClone : ( New nameOrFunctionCall | Clone name | atomOrReference );
    public final void newOrClone() throws RecognitionException {
        int newOrClone_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:409:5: ( New nameOrFunctionCall | Clone name | atomOrReference )
            int alt69=3;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:409:7: New nameOrFunctionCall
                    {
                    match(input,New,FOLLOW_New_in_newOrClone2773); if (state.failed) return ;
                    pushFollow(FOLLOW_nameOrFunctionCall_in_newOrClone2776);
                    nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:410:7: Clone name
                    {
                    match(input,Clone,FOLLOW_Clone_in_newOrClone2784); if (state.failed) return ;
                    pushFollow(FOLLOW_name_in_newOrClone2787);
                    name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:411:7: atomOrReference
                    {
                    pushFollow(FOLLOW_atomOrReference_in_newOrClone2795);
                    atomOrReference();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, newOrClone_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "newOrClone"


    // $ANTLR start "atomOrReference"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:414:1: atomOrReference : ( atom | reference );
    public final void atomOrReference() throws RecognitionException {
        int atomOrReference_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:415:5: ( atom | reference )
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:415:7: atom
                    {
                    pushFollow(FOLLOW_atom_in_atomOrReference2812);
                    atom();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:416:7: reference
                    {
                    pushFollow(FOLLOW_reference_in_atomOrReference2820);
                    reference();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, atomOrReference_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "atomOrReference"


    // $ANTLR start "arrayDeclaration"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:419:1: arrayDeclaration : Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace ;
    public final void arrayDeclaration() throws RecognitionException {
        int arrayDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:420:5: ( Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:420:7: Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace
            {
            match(input,Array,FOLLOW_Array_in_arrayDeclaration2837); if (state.failed) return ;
            match(input,OpenBrace,FOLLOW_OpenBrace_in_arrayDeclaration2839); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:420:23: ( arrayEntry ( Comma arrayEntry )* )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:420:24: arrayEntry ( Comma arrayEntry )*
                    {
                    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration2842);
                    arrayEntry();

                    state._fsp--;
                    if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:420:35: ( Comma arrayEntry )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==Comma) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:420:36: Comma arrayEntry
                    	    {
                    	    match(input,Comma,FOLLOW_Comma_in_arrayDeclaration2845); if (state.failed) return ;
                    	    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration2847);
                    	    arrayEntry();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,CloseBrace,FOLLOW_CloseBrace_in_arrayDeclaration2853); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, arrayDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "arrayDeclaration"


    // $ANTLR start "arrayEntry"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:423:1: arrayEntry : ( keyValuePair | expression ) ;
    public final void arrayEntry() throws RecognitionException {
        int arrayEntry_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:424:5: ( ( keyValuePair | expression ) )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:424:7: ( keyValuePair | expression )
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:424:7: ( keyValuePair | expression )
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:424:8: keyValuePair
                    {
                    pushFollow(FOLLOW_keyValuePair_in_arrayEntry2873);
                    keyValuePair();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:424:23: expression
                    {
                    pushFollow(FOLLOW_expression_in_arrayEntry2877);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, arrayEntry_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "arrayEntry"


    // $ANTLR start "keyValuePair"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:427:1: keyValuePair : ( expression ArrayAssign expression ) ;
    public final void keyValuePair() throws RecognitionException {
        int keyValuePair_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:428:5: ( ( expression ArrayAssign expression ) )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:428:7: ( expression ArrayAssign expression )
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:428:7: ( expression ArrayAssign expression )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:428:8: expression ArrayAssign expression
            {
            pushFollow(FOLLOW_expression_in_keyValuePair2896);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,ArrayAssign,FOLLOW_ArrayAssign_in_keyValuePair2898); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_keyValuePair2900);
            expression();

            state._fsp--;
            if (state.failed) return ;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, keyValuePair_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "keyValuePair"


    // $ANTLR start "atom"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:431:1: atom : ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration );
    public final void atom() throws RecognitionException {
        int atom_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:431:5: ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration )
            int alt74=7;
            switch ( input.LA(1) ) {
            case SingleQuotedString:
                {
                alt74=1;
                }
                break;
            case DoubleQuotedString:
                {
                alt74=2;
                }
                break;
            case HereDoc:
                {
                alt74=3;
                }
                break;
            case Integer:
                {
                alt74=4;
                }
                break;
            case Real:
                {
                alt74=5;
                }
                break;
            case Boolean:
                {
                alt74=6;
                }
                break;
            case Array:
                {
                alt74=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:431:7: SingleQuotedString
                    {
                    match(input,SingleQuotedString,FOLLOW_SingleQuotedString_in_atom2915); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:431:28: DoubleQuotedString
                    {
                    match(input,DoubleQuotedString,FOLLOW_DoubleQuotedString_in_atom2919); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:431:49: HereDoc
                    {
                    match(input,HereDoc,FOLLOW_HereDoc_in_atom2923); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:431:59: Integer
                    {
                    match(input,Integer,FOLLOW_Integer_in_atom2927); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:431:69: Real
                    {
                    match(input,Real,FOLLOW_Real_in_atom2931); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:431:76: Boolean
                    {
                    match(input,Boolean,FOLLOW_Boolean_in_atom2935); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:431:86: arrayDeclaration
                    {
                    pushFollow(FOLLOW_arrayDeclaration_in_atom2939);
                    arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, atom_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "atom"


    // $ANTLR start "reference"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:435:1: reference : ( Ampersand nameOrFunctionCall | nameOrFunctionCall );
    public final void reference() throws RecognitionException {
        int reference_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:436:5: ( Ampersand nameOrFunctionCall | nameOrFunctionCall )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Ampersand) ) {
                alt75=1;
            }
            else if ( (LA75_0==Dollar||LA75_0==UnquotedString) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:436:7: Ampersand nameOrFunctionCall
                    {
                    match(input,Ampersand,FOLLOW_Ampersand_in_reference2957); if (state.failed) return ;
                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference2960);
                    nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:437:7: nameOrFunctionCall
                    {
                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference2968);
                    nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, reference_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "reference"


    // $ANTLR start "nameOrFunctionCall"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:440:1: nameOrFunctionCall : ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace | name );
    public final void nameOrFunctionCall() throws RecognitionException {
        int nameOrFunctionCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:5: ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace | name )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:7: name OpenBrace ( expression ( Comma expression )* )? CloseBrace
                    {
                    pushFollow(FOLLOW_name_in_nameOrFunctionCall2985);
                    name();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,OpenBrace,FOLLOW_OpenBrace_in_nameOrFunctionCall2987); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:22: ( expression ( Comma expression )* )?
                    int alt77=2;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:23: expression ( Comma expression )*
                            {
                            pushFollow(FOLLOW_expression_in_nameOrFunctionCall2990);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:34: ( Comma expression )*
                            loop76:
                            do {
                                int alt76=2;
                                int LA76_0 = input.LA(1);

                                if ( (LA76_0==Comma) ) {
                                    alt76=1;
                                }


                                switch (alt76) {
                            	case 1 :
                            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:35: Comma expression
                            	    {
                            	    match(input,Comma,FOLLOW_Comma_in_nameOrFunctionCall2993); if (state.failed) return ;
                            	    pushFollow(FOLLOW_expression_in_nameOrFunctionCall2995);
                            	    expression();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop76;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,CloseBrace,FOLLOW_CloseBrace_in_nameOrFunctionCall3001); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:442:7: name
                    {
                    pushFollow(FOLLOW_name_in_nameOrFunctionCall3011);
                    name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, nameOrFunctionCall_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "nameOrFunctionCall"


    // $ANTLR start "name"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:445:1: name : ( staticMemberAccess | memberAccess | variable );
    public final void name() throws RecognitionException {
        int name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:445:5: ( staticMemberAccess | memberAccess | variable )
            int alt79=3;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:445:7: staticMemberAccess
                    {
                    pushFollow(FOLLOW_staticMemberAccess_in_name3023);
                    staticMemberAccess();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:446:7: memberAccess
                    {
                    pushFollow(FOLLOW_memberAccess_in_name3031);
                    memberAccess();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:447:7: variable
                    {
                    pushFollow(FOLLOW_variable_in_name3039);
                    variable();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "name"


    // $ANTLR start "staticMemberAccess"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:450:1: staticMemberAccess : UnquotedString '::' variable ;
    public final void staticMemberAccess() throws RecognitionException {
        int staticMemberAccess_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:451:5: ( UnquotedString '::' variable )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:451:7: UnquotedString '::' variable
            {
            match(input,UnquotedString,FOLLOW_UnquotedString_in_staticMemberAccess3060); if (state.failed) return ;
            match(input,ClassMember,FOLLOW_ClassMember_in_staticMemberAccess3062); if (state.failed) return ;
            pushFollow(FOLLOW_variable_in_staticMemberAccess3065);
            variable();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, staticMemberAccess_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "staticMemberAccess"


    // $ANTLR start "memberAccess"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:454:1: memberAccess : variable ( OpenSquareBrace expression CloseSquareBrace | '->' UnquotedString )* ;
    public final void memberAccess() throws RecognitionException {
        int memberAccess_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:455:5: ( variable ( OpenSquareBrace expression CloseSquareBrace | '->' UnquotedString )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:455:7: variable ( OpenSquareBrace expression CloseSquareBrace | '->' UnquotedString )*
            {
            pushFollow(FOLLOW_variable_in_memberAccess3082);
            variable();

            state._fsp--;
            if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:456:9: ( OpenSquareBrace expression CloseSquareBrace | '->' UnquotedString )*
            loop80:
            do {
                int alt80=3;
                alt80 = dfa80.predict(input);
                switch (alt80) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:456:11: OpenSquareBrace expression CloseSquareBrace
            	    {
            	    match(input,OpenSquareBrace,FOLLOW_OpenSquareBrace_in_memberAccess3095); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_memberAccess3098);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    match(input,CloseSquareBrace,FOLLOW_CloseSquareBrace_in_memberAccess3100); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:457:11: '->' UnquotedString
            	    {
            	    match(input,InstanceMember,FOLLOW_InstanceMember_in_memberAccess3113); if (state.failed) return ;
            	    match(input,UnquotedString,FOLLOW_UnquotedString_in_memberAccess3116); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, memberAccess_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "memberAccess"


    // $ANTLR start "variable"
    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:460:1: variable : ( Dollar variable | UnquotedString );
    public final void variable() throws RecognitionException {
        int variable_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:461:5: ( Dollar variable | UnquotedString )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==Dollar) ) {
                alt81=1;
            }
            else if ( (LA81_0==UnquotedString) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:461:7: Dollar variable
                    {
                    match(input,Dollar,FOLLOW_Dollar_in_variable3139); if (state.failed) return ;
                    pushFollow(FOLLOW_variable_in_variable3142);
                    variable();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:462:7: UnquotedString
                    {
                    match(input,UnquotedString,FOLLOW_UnquotedString_in_variable3150); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, variable_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "variable"

    // $ANTLR start synpred3_Formatting
    public final void synpred3_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:177:7: ( ( simpleStatement )? BodyString )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:177:7: ( simpleStatement )? BodyString
        {
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:177:7: ( simpleStatement )?
        int alt82=2;
        alt82 = dfa82.predict(input);
        switch (alt82) {
            case 1 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: simpleStatement
                {
                pushFollow(FOLLOW_simpleStatement_in_synpred3_Formatting880);
                simpleStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,BodyString,FOLLOW_BodyString_in_synpred3_Formatting883); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Formatting

    // $ANTLR start synpred26_Formatting
    public final void synpred26_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:7: ( ( fieldModifier )* Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace ( statementBlock | ';' ) )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:7: ( fieldModifier )* Function UnquotedString OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace ( statementBlock | ';' )
        {
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:7: ( fieldModifier )*
        loop87:
        do {
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==Static||LA87_0==Abstract||LA87_0==AccessModifier) ) {
                alt87=1;
            }


            switch (alt87) {
        	case 1 :
        	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:0:0: fieldModifier
        	    {
        	    pushFollow(FOLLOW_fieldModifier_in_synpred26_Formatting1289);
        	    fieldModifier();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop87;
            }
        } while (true);

        match(input,Function,FOLLOW_Function_in_synpred26_Formatting1292); if (state.failed) return ;
        match(input,UnquotedString,FOLLOW_UnquotedString_in_synpred26_Formatting1294); if (state.failed) return ;
        match(input,OpenBrace,FOLLOW_OpenBrace_in_synpred26_Formatting1296); if (state.failed) return ;
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:56: ( paramDef ( Comma paramDef )* )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==Dollar||LA89_0==Ampersand) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:57: paramDef ( Comma paramDef )*
                {
                pushFollow(FOLLOW_paramDef_in_synpred26_Formatting1299);
                paramDef();

                state._fsp--;
                if (state.failed) return ;
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:66: ( Comma paramDef )*
                loop88:
                do {
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==Comma) ) {
                        alt88=1;
                    }


                    switch (alt88) {
                	case 1 :
                	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:222:67: Comma paramDef
                	    {
                	    match(input,Comma,FOLLOW_Comma_in_synpred26_Formatting1302); if (state.failed) return ;
                	    pushFollow(FOLLOW_paramDef_in_synpred26_Formatting1304);
                	    paramDef();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop88;
                    }
                } while (true);


                }
                break;

        }

        match(input,CloseBrace,FOLLOW_CloseBrace_in_synpred26_Formatting1310); if (state.failed) return ;
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:223:9: ( statementBlock | ';' )
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==OpenCurlyBrace) ) {
            alt90=1;
        }
        else if ( (LA90_0==SemiColon) ) {
            alt90=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 90, 0, input);

            throw nvae;
        }
        switch (alt90) {
            case 1 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:223:10: statementBlock
                {
                pushFollow(FOLLOW_statementBlock_in_synpred26_Formatting1322);
                statementBlock();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:223:27: ';'
                {
                match(input,SemiColon,FOLLOW_SemiColon_in_synpred26_Formatting1326); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred26_Formatting

    // $ANTLR start synpred37_Formatting
    public final void synpred37_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:250:58: ( conditional )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:250:58: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred37_Formatting1570);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_Formatting

    // $ANTLR start synpred56_Formatting
    public final void synpred56_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:279:62: ( conditional )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:279:62: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred56_Formatting1869);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_Formatting

    // $ANTLR start synpred70_Formatting
    public final void synpred70_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:329:23: ( Or weakLogicalXor )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:329:23: Or weakLogicalXor
        {
        match(input,Or,FOLLOW_Or_in_synpred70_Formatting2201); if (state.failed) return ;
        pushFollow(FOLLOW_weakLogicalXor_in_synpred70_Formatting2204);
        weakLogicalXor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Formatting

    // $ANTLR start synpred71_Formatting
    public final void synpred71_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:333:23: ( Xor weakLogicalAnd )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:333:23: Xor weakLogicalAnd
        {
        match(input,Xor,FOLLOW_Xor_in_synpred71_Formatting2226); if (state.failed) return ;
        pushFollow(FOLLOW_weakLogicalAnd_in_synpred71_Formatting2229);
        weakLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_Formatting

    // $ANTLR start synpred72_Formatting
    public final void synpred72_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:337:19: ( And assignment )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:337:19: And assignment
        {
        match(input,And,FOLLOW_And_in_synpred72_Formatting2255); if (state.failed) return ;
        pushFollow(FOLLOW_assignment_in_synpred72_Formatting2258);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Formatting

    // $ANTLR start synpred74_Formatting
    public final void synpred74_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:341:7: ( name ( ( Equals | AsignmentOperator ) assignment ) )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:341:7: name ( ( Equals | AsignmentOperator ) assignment )
        {
        pushFollow(FOLLOW_name_in_synpred74_Formatting2277);
        name();

        state._fsp--;
        if (state.failed) return ;
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:341:12: ( ( Equals | AsignmentOperator ) assignment )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:341:13: ( Equals | AsignmentOperator ) assignment
        {
        if ( input.LA(1)==Equals||input.LA(1)==AsignmentOperator ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_assignment_in_synpred74_Formatting2289);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred74_Formatting

    // $ANTLR start synpred75_Formatting
    public final void synpred75_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:346:7: ( logicalOr QuestionMark expression Colon expression )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:346:7: logicalOr QuestionMark expression Colon expression
        {
        pushFollow(FOLLOW_logicalOr_in_synpred75_Formatting2315);
        logicalOr();

        state._fsp--;
        if (state.failed) return ;
        match(input,QuestionMark,FOLLOW_QuestionMark_in_synpred75_Formatting2317); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred75_Formatting2319);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,Colon,FOLLOW_Colon_in_synpred75_Formatting2321); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred75_Formatting2323);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_Formatting

    // $ANTLR start synpred97_Formatting
    public final void synpred97_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:404:7: ( name IncrementOperator )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:404:7: name IncrementOperator
        {
        pushFollow(FOLLOW_name_in_synpred97_Formatting2744);
        name();

        state._fsp--;
        if (state.failed) return ;
        match(input,IncrementOperator,FOLLOW_IncrementOperator_in_synpred97_Formatting2746); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_Formatting

    // $ANTLR start synpred103_Formatting
    public final void synpred103_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:424:8: ( keyValuePair )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:424:8: keyValuePair
        {
        pushFollow(FOLLOW_keyValuePair_in_synpred103_Formatting2873);
        keyValuePair();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_Formatting

    // $ANTLR start synpred113_Formatting
    public final void synpred113_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:7: ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:7: name OpenBrace ( expression ( Comma expression )* )? CloseBrace
        {
        pushFollow(FOLLOW_name_in_synpred113_Formatting2985);
        name();

        state._fsp--;
        if (state.failed) return ;
        match(input,OpenBrace,FOLLOW_OpenBrace_in_synpred113_Formatting2987); if (state.failed) return ;
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:22: ( expression ( Comma expression )* )?
        int alt104=2;
        alt104 = dfa104.predict(input);
        switch (alt104) {
            case 1 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:23: expression ( Comma expression )*
                {
                pushFollow(FOLLOW_expression_in_synpred113_Formatting2990);
                expression();

                state._fsp--;
                if (state.failed) return ;
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:34: ( Comma expression )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==Comma) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:441:35: Comma expression
                	    {
                	    match(input,Comma,FOLLOW_Comma_in_synpred113_Formatting2993); if (state.failed) return ;
                	    pushFollow(FOLLOW_expression_in_synpred113_Formatting2995);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop103;
                    }
                } while (true);


                }
                break;

        }

        match(input,CloseBrace,FOLLOW_CloseBrace_in_synpred113_Formatting3001); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_Formatting

    // $ANTLR start synpred115_Formatting
    public final void synpred115_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:446:7: ( memberAccess )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:446:7: memberAccess
        {
        pushFollow(FOLLOW_memberAccess_in_synpred115_Formatting3031);
        memberAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_Formatting

    // Delegated rules

    public final boolean synpred26_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA104 dfa104 = new DFA104(this);
    static final String DFA1_eotS =
        "\45\uffff";
    static final String DFA1_eofS =
        "\1\1\44\uffff";
    static final String DFA1_minS =
        "\1\6\44\uffff";
    static final String DFA1_maxS =
        "\1\140\44\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\2\1\1\42\uffff";
    static final String DFA1_specialS =
        "\45\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\3\uffff\1\2\6\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\4\2\2\uffff\5\2\2\uffff"+
            "\6\2\4\uffff\2\2\2\uffff\1\2\24\uffff\2\2\1\uffff\2\2\5\uffff"+
            "\7\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 174:8: ( statement )*";
        }
    }
    static final String DFA4_eotS =
        "\u010f\uffff";
    static final String DFA4_eofS =
        "\u010f\uffff";
    static final String DFA4_minS =
        "\2\6\2\23\3\4\1\6\1\4\1\23\1\6\1\23\1\6\3\23\6\4\1\6\1\23\14\uffff"+
        "\25\0\2\uffff\1\0\2\uffff\20\0\2\uffff\44\0\2\uffff\103\0\1\uffff"+
        "\1\0\1\uffff\16\0\2\uffff\16\0\2\uffff\15\0\1\uffff\1\0\1\uffff"+
        "\15\0\2\uffff\16\0\1\uffff\1\0\1\uffff\3\0";
    static final String DFA4_maxS =
        "\2\140\2\121\2\123\2\140\1\132\1\121\3\140\3\121\6\130\1\6\1\121"+
        "\14\uffff\25\0\2\uffff\1\0\2\uffff\20\0\2\uffff\44\0\2\uffff\103"+
        "\0\1\uffff\1\0\1\uffff\16\0\2\uffff\16\0\2\uffff\15\0\1\uffff\1"+
        "\0\1\uffff\15\0\2\uffff\16\0\1\uffff\1\0\1\uffff\3\0";
    static final String DFA4_acceptS =
        "\30\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\33\uffff\1\6\u00d5\uffff";
    static final String DFA4_specialS =
        "\44\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\2\uffff\1\25\2\uffff"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
        "\1\43\1\44\1\45\2\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
        "\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72"+
        "\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1"+
        "\106\1\107\1\110\1\111\2\uffff\1\112\1\113\1\114\1\115\1\116\1\117"+
        "\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132"+
        "\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145"+
        "\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160"+
        "\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173"+
        "\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084"+
        "\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
        "\1\uffff\1\u008d\1\uffff\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092"+
        "\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a"+
        "\1\u009b\2\uffff\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1"+
        "\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9"+
        "\2\uffff\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0"+
        "\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\uffff\1\u00b7"+
        "\1\uffff\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be"+
        "\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4\2\uffff\1\u00c5"+
        "\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd"+
        "\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\uffff\1\u00d3\1\uffff"+
        "\1\u00d4\1\u00d5\1\u00d6}>";
    static final String[] DFA4_transitionS = {
            "\1\14\3\uffff\1\31\6\uffff\1\13\1\uffff\1\11\2\uffff\1\27\1"+
            "\uffff\1\12\1\uffff\1\13\3\uffff\1\13\1\uffff\1\16\1\17\1\1"+
            "\1\35\2\uffff\5\35\2\uffff\1\35\1\4\1\5\1\6\1\2\1\3\4\uffff"+
            "\1\32\1\34\2\uffff\1\32\24\uffff\1\30\1\10\1\uffff\1\23\1\7"+
            "\5\uffff\1\15\1\26\1\20\1\21\1\22\1\24\1\25",
            "\1\50\12\uffff\1\47\1\uffff\1\45\2\uffff\1\63\1\uffff\1\46"+
            "\1\uffff\1\47\3\uffff\1\47\1\uffff\1\52\1\53\57\uffff\1\44\1"+
            "\uffff\1\57\6\uffff\1\51\1\62\1\54\1\55\1\56\1\60\1\61",
            "\1\65\75\uffff\1\64",
            "\1\66\75\uffff\1\67",
            "\1\71\113\uffff\1\30\2\uffff\1\70",
            "\1\71\113\uffff\1\30\2\uffff\1\73",
            "\1\71\1\uffff\1\102\12\uffff\1\101\1\uffff\1\77\2\uffff\1\115"+
            "\1\uffff\1\100\1\uffff\1\101\3\uffff\1\101\1\uffff\1\104\1\105"+
            "\56\uffff\1\30\1\76\1\uffff\1\111\6\uffff\1\103\1\114\1\106"+
            "\1\107\1\110\1\112\1\113",
            "\1\124\12\uffff\1\123\1\uffff\1\121\2\uffff\1\137\1\uffff\1"+
            "\122\1\uffff\1\123\3\uffff\1\123\1\uffff\1\126\1\127\57\uffff"+
            "\1\120\1\uffff\1\133\6\uffff\1\125\1\136\1\130\1\131\1\132\1"+
            "\134\1\135",
            "\1\71\1\uffff\1\142\1\uffff\1\157\4\uffff\1\154\1\153\1\140"+
            "\1\160\1\uffff\1\155\2\uffff\1\145\1\151\1\152\1\uffff\2\145"+
            "\3\144\1\uffff\1\156\23\uffff\1\161\1\163\1\162\1\143\31\uffff"+
            "\1\30\4\uffff\1\156\1\150\1\147\1\146\1\uffff\1\141",
            "\1\166\75\uffff\1\167",
            "\1\172\12\uffff\1\171\1\uffff\1\175\2\uffff\1\u0087\1\uffff"+
            "\1\170\1\uffff\1\171\3\uffff\1\171\1\uffff\1\176\1\177\57\uffff"+
            "\1\174\1\uffff\1\u0083\6\uffff\1\173\1\u0086\1\u0080\1\u0081"+
            "\1\u0082\1\u0084\1\u0085",
            "\1\u008a\2\uffff\1\u0094\11\uffff\1\u008b\1\u008c\57\uffff"+
            "\1\u0089\1\uffff\1\u0090\6\uffff\1\u0088\1\u0093\1\u008d\1\u008e"+
            "\1\u008f\1\u0091\1\u0092",
            "\1\u009a\12\uffff\1\u0099\1\uffff\1\u0097\2\uffff\1\u00a5\1"+
            "\uffff\1\u0098\1\uffff\1\u0099\3\uffff\1\u0099\1\uffff\1\u009c"+
            "\1\u009d\57\uffff\1\u0096\1\uffff\1\u00a1\5\uffff\1\u0095\1"+
            "\u009b\1\u00a4\1\u009e\1\u009f\1\u00a0\1\u00a2\1\u00a3",
            "\1\u00a7\75\uffff\1\u00a6",
            "\1\u00a9\75\uffff\1\u00a8",
            "\1\u00ab\75\uffff\1\u00aa",
            "\1\71\10\uffff\1\u00b5\1\u00b4\3\uffff\1\u00ba\2\uffff\1\u00ae"+
            "\1\u00b2\1\u00b3\1\uffff\2\u00ae\3\u00ad\25\uffff\1\u00b6\1"+
            "\u00b8\1\u00b7\1\u00ac\31\uffff\1\30\5\uffff\1\u00b1\1\u00b0"+
            "\1\u00af",
            "\1\71\10\uffff\1\u00c5\1\u00c4\3\uffff\1\u00c6\2\uffff\1\u00be"+
            "\1\u00c2\1\u00c3\1\uffff\2\u00be\3\u00bd\25\uffff\1\u00c7\1"+
            "\u00c9\1\u00c8\1\u00bc\31\uffff\1\30\5\uffff\1\u00c1\1\u00c0"+
            "\1\u00bf",
            "\1\71\10\uffff\1\u00d5\1\u00d4\3\uffff\1\u00d6\2\uffff\1\u00ce"+
            "\1\u00d2\1\u00d3\1\uffff\2\u00ce\3\u00cd\25\uffff\1\u00d7\1"+
            "\u00d9\1\u00d8\1\u00cc\31\uffff\1\30\5\uffff\1\u00d1\1\u00d0"+
            "\1\u00cf",
            "\1\71\10\uffff\1\u00e5\1\u00e4\3\uffff\1\u00ea\2\uffff\1\u00de"+
            "\1\u00e2\1\u00e3\1\uffff\2\u00de\3\u00dd\25\uffff\1\u00e6\1"+
            "\u00e8\1\u00e7\1\u00dc\31\uffff\1\30\5\uffff\1\u00e1\1\u00e0"+
            "\1\u00df",
            "\1\71\10\uffff\1\u00f5\1\u00f4\3\uffff\1\u00fb\2\uffff\1\u00ee"+
            "\1\u00f2\1\u00f3\1\uffff\2\u00ee\3\u00ed\25\uffff\1\u00f6\1"+
            "\u00f8\1\u00f7\1\u00ec\31\uffff\1\30\5\uffff\1\u00f1\1\u00f0"+
            "\1\u00ef",
            "\1\71\10\uffff\1\u0105\1\u0104\3\uffff\1\u010a\2\uffff\1\u00fe"+
            "\1\u0102\1\u0103\1\uffff\2\u00fe\3\u00fd\25\uffff\1\u0106\1"+
            "\u0108\1\u0107\1\u00fc\31\uffff\1\30\5\uffff\1\u0101\1\u0100"+
            "\1\u00ff",
            "\1\u010c",
            "\1\u010e\75\uffff\1\u010d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "176:1: statement : ( ( simpleStatement )? BodyString | '{' (stmts= statement )* '}' | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_36 = input.LA(1);

                         
                        int index4_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_36);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_37 = input.LA(1);

                         
                        int index4_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_37);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_38 = input.LA(1);

                         
                        int index4_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_38);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_39 = input.LA(1);

                         
                        int index4_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_39);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_40 = input.LA(1);

                         
                        int index4_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_40);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_41 = input.LA(1);

                         
                        int index4_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_41);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_42 = input.LA(1);

                         
                        int index4_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_42);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_43 = input.LA(1);

                         
                        int index4_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_43);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_44 = input.LA(1);

                         
                        int index4_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_44);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA4_45 = input.LA(1);

                         
                        int index4_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_45);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA4_46 = input.LA(1);

                         
                        int index4_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_46);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA4_47 = input.LA(1);

                         
                        int index4_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_47);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA4_48 = input.LA(1);

                         
                        int index4_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_48);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA4_49 = input.LA(1);

                         
                        int index4_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_49);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA4_50 = input.LA(1);

                         
                        int index4_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_50);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA4_51 = input.LA(1);

                         
                        int index4_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_51);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA4_52 = input.LA(1);

                         
                        int index4_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_52);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA4_53 = input.LA(1);

                         
                        int index4_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_53);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA4_54 = input.LA(1);

                         
                        int index4_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_54);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA4_55 = input.LA(1);

                         
                        int index4_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_55);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA4_56 = input.LA(1);

                         
                        int index4_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_56);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA4_59 = input.LA(1);

                         
                        int index4_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_59);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA4_62 = input.LA(1);

                         
                        int index4_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_62);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA4_63 = input.LA(1);

                         
                        int index4_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_63);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA4_64 = input.LA(1);

                         
                        int index4_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_64);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA4_65 = input.LA(1);

                         
                        int index4_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_65);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA4_66 = input.LA(1);

                         
                        int index4_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_66);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA4_67 = input.LA(1);

                         
                        int index4_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_67);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA4_68 = input.LA(1);

                         
                        int index4_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_68);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA4_69 = input.LA(1);

                         
                        int index4_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_69);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA4_70 = input.LA(1);

                         
                        int index4_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_70);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA4_71 = input.LA(1);

                         
                        int index4_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_71);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA4_72 = input.LA(1);

                         
                        int index4_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_72);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA4_73 = input.LA(1);

                         
                        int index4_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_73);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA4_74 = input.LA(1);

                         
                        int index4_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_74);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA4_75 = input.LA(1);

                         
                        int index4_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_75);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA4_76 = input.LA(1);

                         
                        int index4_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_76);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA4_77 = input.LA(1);

                         
                        int index4_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_77);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA4_80 = input.LA(1);

                         
                        int index4_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_80);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA4_81 = input.LA(1);

                         
                        int index4_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_81);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA4_82 = input.LA(1);

                         
                        int index4_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_82);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA4_83 = input.LA(1);

                         
                        int index4_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_83);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA4_84 = input.LA(1);

                         
                        int index4_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_84);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA4_85 = input.LA(1);

                         
                        int index4_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_85);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA4_86 = input.LA(1);

                         
                        int index4_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_86);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA4_87 = input.LA(1);

                         
                        int index4_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_87);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA4_88 = input.LA(1);

                         
                        int index4_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_88);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA4_89 = input.LA(1);

                         
                        int index4_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_89);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA4_90 = input.LA(1);

                         
                        int index4_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_90);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA4_91 = input.LA(1);

                         
                        int index4_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_91);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA4_92 = input.LA(1);

                         
                        int index4_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_92);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA4_93 = input.LA(1);

                         
                        int index4_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_93);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA4_94 = input.LA(1);

                         
                        int index4_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_94);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA4_95 = input.LA(1);

                         
                        int index4_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_95);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA4_96 = input.LA(1);

                         
                        int index4_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_96);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA4_97 = input.LA(1);

                         
                        int index4_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_97);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA4_98 = input.LA(1);

                         
                        int index4_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_98);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA4_99 = input.LA(1);

                         
                        int index4_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_99);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA4_100 = input.LA(1);

                         
                        int index4_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_100);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA4_101 = input.LA(1);

                         
                        int index4_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_101);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA4_102 = input.LA(1);

                         
                        int index4_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_102);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA4_103 = input.LA(1);

                         
                        int index4_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_103);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA4_104 = input.LA(1);

                         
                        int index4_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_104);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA4_105 = input.LA(1);

                         
                        int index4_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_105);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA4_106 = input.LA(1);

                         
                        int index4_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_106);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA4_107 = input.LA(1);

                         
                        int index4_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_107);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA4_108 = input.LA(1);

                         
                        int index4_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_108);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA4_109 = input.LA(1);

                         
                        int index4_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_109);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA4_110 = input.LA(1);

                         
                        int index4_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_110);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA4_111 = input.LA(1);

                         
                        int index4_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_111);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA4_112 = input.LA(1);

                         
                        int index4_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_112);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA4_113 = input.LA(1);

                         
                        int index4_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_113);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA4_114 = input.LA(1);

                         
                        int index4_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_114);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA4_115 = input.LA(1);

                         
                        int index4_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_115);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA4_118 = input.LA(1);

                         
                        int index4_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_118);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA4_119 = input.LA(1);

                         
                        int index4_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_119);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA4_120 = input.LA(1);

                         
                        int index4_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_120);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA4_121 = input.LA(1);

                         
                        int index4_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_121);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA4_122 = input.LA(1);

                         
                        int index4_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_122);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA4_123 = input.LA(1);

                         
                        int index4_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_123);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA4_124 = input.LA(1);

                         
                        int index4_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_124);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA4_125 = input.LA(1);

                         
                        int index4_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_125);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA4_126 = input.LA(1);

                         
                        int index4_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_126);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA4_127 = input.LA(1);

                         
                        int index4_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_127);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA4_128 = input.LA(1);

                         
                        int index4_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_128);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA4_129 = input.LA(1);

                         
                        int index4_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_129);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA4_130 = input.LA(1);

                         
                        int index4_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_130);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA4_131 = input.LA(1);

                         
                        int index4_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_131);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA4_132 = input.LA(1);

                         
                        int index4_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_132);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA4_133 = input.LA(1);

                         
                        int index4_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_133);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA4_134 = input.LA(1);

                         
                        int index4_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_134);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA4_135 = input.LA(1);

                         
                        int index4_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_135);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA4_136 = input.LA(1);

                         
                        int index4_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_136);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA4_137 = input.LA(1);

                         
                        int index4_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_137);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA4_138 = input.LA(1);

                         
                        int index4_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_138);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA4_139 = input.LA(1);

                         
                        int index4_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_139);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA4_140 = input.LA(1);

                         
                        int index4_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_140);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA4_141 = input.LA(1);

                         
                        int index4_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_141);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA4_142 = input.LA(1);

                         
                        int index4_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_142);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA4_143 = input.LA(1);

                         
                        int index4_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_143);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA4_144 = input.LA(1);

                         
                        int index4_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_144);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA4_145 = input.LA(1);

                         
                        int index4_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_145);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA4_146 = input.LA(1);

                         
                        int index4_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_146);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA4_147 = input.LA(1);

                         
                        int index4_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_147);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA4_148 = input.LA(1);

                         
                        int index4_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_148);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA4_149 = input.LA(1);

                         
                        int index4_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_149);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA4_150 = input.LA(1);

                         
                        int index4_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_150);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA4_151 = input.LA(1);

                         
                        int index4_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_151);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA4_152 = input.LA(1);

                         
                        int index4_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_152);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA4_153 = input.LA(1);

                         
                        int index4_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_153);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA4_154 = input.LA(1);

                         
                        int index4_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_154);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA4_155 = input.LA(1);

                         
                        int index4_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_155);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA4_156 = input.LA(1);

                         
                        int index4_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_156);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA4_157 = input.LA(1);

                         
                        int index4_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_157);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA4_158 = input.LA(1);

                         
                        int index4_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_158);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA4_159 = input.LA(1);

                         
                        int index4_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_159);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA4_160 = input.LA(1);

                         
                        int index4_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_160);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA4_161 = input.LA(1);

                         
                        int index4_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_161);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA4_162 = input.LA(1);

                         
                        int index4_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_162);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA4_163 = input.LA(1);

                         
                        int index4_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_163);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA4_164 = input.LA(1);

                         
                        int index4_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_164);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA4_165 = input.LA(1);

                         
                        int index4_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_165);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA4_166 = input.LA(1);

                         
                        int index4_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_166);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA4_167 = input.LA(1);

                         
                        int index4_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_167);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA4_168 = input.LA(1);

                         
                        int index4_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_168);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA4_169 = input.LA(1);

                         
                        int index4_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_169);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA4_170 = input.LA(1);

                         
                        int index4_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_170);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA4_171 = input.LA(1);

                         
                        int index4_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_171);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA4_172 = input.LA(1);

                         
                        int index4_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_172);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA4_173 = input.LA(1);

                         
                        int index4_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_173);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA4_174 = input.LA(1);

                         
                        int index4_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_174);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA4_175 = input.LA(1);

                         
                        int index4_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_175);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA4_176 = input.LA(1);

                         
                        int index4_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_176);
                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA4_177 = input.LA(1);

                         
                        int index4_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_177);
                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA4_178 = input.LA(1);

                         
                        int index4_178 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_178);
                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA4_179 = input.LA(1);

                         
                        int index4_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_179);
                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA4_180 = input.LA(1);

                         
                        int index4_180 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_180);
                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA4_181 = input.LA(1);

                         
                        int index4_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_181);
                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA4_182 = input.LA(1);

                         
                        int index4_182 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_182);
                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA4_183 = input.LA(1);

                         
                        int index4_183 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_183);
                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA4_184 = input.LA(1);

                         
                        int index4_184 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_184);
                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA4_186 = input.LA(1);

                         
                        int index4_186 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_186);
                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA4_188 = input.LA(1);

                         
                        int index4_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_188);
                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA4_189 = input.LA(1);

                         
                        int index4_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_189);
                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA4_190 = input.LA(1);

                         
                        int index4_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_190);
                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA4_191 = input.LA(1);

                         
                        int index4_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_191);
                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA4_192 = input.LA(1);

                         
                        int index4_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_192);
                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA4_193 = input.LA(1);

                         
                        int index4_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_193);
                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA4_194 = input.LA(1);

                         
                        int index4_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_194);
                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA4_195 = input.LA(1);

                         
                        int index4_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_195);
                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA4_196 = input.LA(1);

                         
                        int index4_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_196);
                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA4_197 = input.LA(1);

                         
                        int index4_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_197);
                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA4_198 = input.LA(1);

                         
                        int index4_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_198);
                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA4_199 = input.LA(1);

                         
                        int index4_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_199);
                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA4_200 = input.LA(1);

                         
                        int index4_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_200);
                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA4_201 = input.LA(1);

                         
                        int index4_201 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_201);
                        if ( s>=0 ) return s;
                        break;
                    case 156 : 
                        int LA4_204 = input.LA(1);

                         
                        int index4_204 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_204);
                        if ( s>=0 ) return s;
                        break;
                    case 157 : 
                        int LA4_205 = input.LA(1);

                         
                        int index4_205 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_205);
                        if ( s>=0 ) return s;
                        break;
                    case 158 : 
                        int LA4_206 = input.LA(1);

                         
                        int index4_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_206);
                        if ( s>=0 ) return s;
                        break;
                    case 159 : 
                        int LA4_207 = input.LA(1);

                         
                        int index4_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_207);
                        if ( s>=0 ) return s;
                        break;
                    case 160 : 
                        int LA4_208 = input.LA(1);

                         
                        int index4_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_208);
                        if ( s>=0 ) return s;
                        break;
                    case 161 : 
                        int LA4_209 = input.LA(1);

                         
                        int index4_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_209);
                        if ( s>=0 ) return s;
                        break;
                    case 162 : 
                        int LA4_210 = input.LA(1);

                         
                        int index4_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_210);
                        if ( s>=0 ) return s;
                        break;
                    case 163 : 
                        int LA4_211 = input.LA(1);

                         
                        int index4_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_211);
                        if ( s>=0 ) return s;
                        break;
                    case 164 : 
                        int LA4_212 = input.LA(1);

                         
                        int index4_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_212);
                        if ( s>=0 ) return s;
                        break;
                    case 165 : 
                        int LA4_213 = input.LA(1);

                         
                        int index4_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_213);
                        if ( s>=0 ) return s;
                        break;
                    case 166 : 
                        int LA4_214 = input.LA(1);

                         
                        int index4_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_214);
                        if ( s>=0 ) return s;
                        break;
                    case 167 : 
                        int LA4_215 = input.LA(1);

                         
                        int index4_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_215);
                        if ( s>=0 ) return s;
                        break;
                    case 168 : 
                        int LA4_216 = input.LA(1);

                         
                        int index4_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_216);
                        if ( s>=0 ) return s;
                        break;
                    case 169 : 
                        int LA4_217 = input.LA(1);

                         
                        int index4_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_217);
                        if ( s>=0 ) return s;
                        break;
                    case 170 : 
                        int LA4_220 = input.LA(1);

                         
                        int index4_220 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_220);
                        if ( s>=0 ) return s;
                        break;
                    case 171 : 
                        int LA4_221 = input.LA(1);

                         
                        int index4_221 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_221);
                        if ( s>=0 ) return s;
                        break;
                    case 172 : 
                        int LA4_222 = input.LA(1);

                         
                        int index4_222 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_222);
                        if ( s>=0 ) return s;
                        break;
                    case 173 : 
                        int LA4_223 = input.LA(1);

                         
                        int index4_223 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_223);
                        if ( s>=0 ) return s;
                        break;
                    case 174 : 
                        int LA4_224 = input.LA(1);

                         
                        int index4_224 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_224);
                        if ( s>=0 ) return s;
                        break;
                    case 175 : 
                        int LA4_225 = input.LA(1);

                         
                        int index4_225 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_225);
                        if ( s>=0 ) return s;
                        break;
                    case 176 : 
                        int LA4_226 = input.LA(1);

                         
                        int index4_226 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_226);
                        if ( s>=0 ) return s;
                        break;
                    case 177 : 
                        int LA4_227 = input.LA(1);

                         
                        int index4_227 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_227);
                        if ( s>=0 ) return s;
                        break;
                    case 178 : 
                        int LA4_228 = input.LA(1);

                         
                        int index4_228 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_228);
                        if ( s>=0 ) return s;
                        break;
                    case 179 : 
                        int LA4_229 = input.LA(1);

                         
                        int index4_229 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_229);
                        if ( s>=0 ) return s;
                        break;
                    case 180 : 
                        int LA4_230 = input.LA(1);

                         
                        int index4_230 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_230);
                        if ( s>=0 ) return s;
                        break;
                    case 181 : 
                        int LA4_231 = input.LA(1);

                         
                        int index4_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_231);
                        if ( s>=0 ) return s;
                        break;
                    case 182 : 
                        int LA4_232 = input.LA(1);

                         
                        int index4_232 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_232);
                        if ( s>=0 ) return s;
                        break;
                    case 183 : 
                        int LA4_234 = input.LA(1);

                         
                        int index4_234 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_234);
                        if ( s>=0 ) return s;
                        break;
                    case 184 : 
                        int LA4_236 = input.LA(1);

                         
                        int index4_236 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_236);
                        if ( s>=0 ) return s;
                        break;
                    case 185 : 
                        int LA4_237 = input.LA(1);

                         
                        int index4_237 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_237);
                        if ( s>=0 ) return s;
                        break;
                    case 186 : 
                        int LA4_238 = input.LA(1);

                         
                        int index4_238 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_238);
                        if ( s>=0 ) return s;
                        break;
                    case 187 : 
                        int LA4_239 = input.LA(1);

                         
                        int index4_239 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_239);
                        if ( s>=0 ) return s;
                        break;
                    case 188 : 
                        int LA4_240 = input.LA(1);

                         
                        int index4_240 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_240);
                        if ( s>=0 ) return s;
                        break;
                    case 189 : 
                        int LA4_241 = input.LA(1);

                         
                        int index4_241 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_241);
                        if ( s>=0 ) return s;
                        break;
                    case 190 : 
                        int LA4_242 = input.LA(1);

                         
                        int index4_242 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_242);
                        if ( s>=0 ) return s;
                        break;
                    case 191 : 
                        int LA4_243 = input.LA(1);

                         
                        int index4_243 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_243);
                        if ( s>=0 ) return s;
                        break;
                    case 192 : 
                        int LA4_244 = input.LA(1);

                         
                        int index4_244 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_244);
                        if ( s>=0 ) return s;
                        break;
                    case 193 : 
                        int LA4_245 = input.LA(1);

                         
                        int index4_245 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_245);
                        if ( s>=0 ) return s;
                        break;
                    case 194 : 
                        int LA4_246 = input.LA(1);

                         
                        int index4_246 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_246);
                        if ( s>=0 ) return s;
                        break;
                    case 195 : 
                        int LA4_247 = input.LA(1);

                         
                        int index4_247 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_247);
                        if ( s>=0 ) return s;
                        break;
                    case 196 : 
                        int LA4_248 = input.LA(1);

                         
                        int index4_248 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_248);
                        if ( s>=0 ) return s;
                        break;
                    case 197 : 
                        int LA4_251 = input.LA(1);

                         
                        int index4_251 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_251);
                        if ( s>=0 ) return s;
                        break;
                    case 198 : 
                        int LA4_252 = input.LA(1);

                         
                        int index4_252 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_252);
                        if ( s>=0 ) return s;
                        break;
                    case 199 : 
                        int LA4_253 = input.LA(1);

                         
                        int index4_253 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_253);
                        if ( s>=0 ) return s;
                        break;
                    case 200 : 
                        int LA4_254 = input.LA(1);

                         
                        int index4_254 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_254);
                        if ( s>=0 ) return s;
                        break;
                    case 201 : 
                        int LA4_255 = input.LA(1);

                         
                        int index4_255 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_255);
                        if ( s>=0 ) return s;
                        break;
                    case 202 : 
                        int LA4_256 = input.LA(1);

                         
                        int index4_256 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_256);
                        if ( s>=0 ) return s;
                        break;
                    case 203 : 
                        int LA4_257 = input.LA(1);

                         
                        int index4_257 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_257);
                        if ( s>=0 ) return s;
                        break;
                    case 204 : 
                        int LA4_258 = input.LA(1);

                         
                        int index4_258 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_258);
                        if ( s>=0 ) return s;
                        break;
                    case 205 : 
                        int LA4_259 = input.LA(1);

                         
                        int index4_259 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_259);
                        if ( s>=0 ) return s;
                        break;
                    case 206 : 
                        int LA4_260 = input.LA(1);

                         
                        int index4_260 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_260);
                        if ( s>=0 ) return s;
                        break;
                    case 207 : 
                        int LA4_261 = input.LA(1);

                         
                        int index4_261 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_261);
                        if ( s>=0 ) return s;
                        break;
                    case 208 : 
                        int LA4_262 = input.LA(1);

                         
                        int index4_262 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_262);
                        if ( s>=0 ) return s;
                        break;
                    case 209 : 
                        int LA4_263 = input.LA(1);

                         
                        int index4_263 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_263);
                        if ( s>=0 ) return s;
                        break;
                    case 210 : 
                        int LA4_264 = input.LA(1);

                         
                        int index4_264 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_264);
                        if ( s>=0 ) return s;
                        break;
                    case 211 : 
                        int LA4_266 = input.LA(1);

                         
                        int index4_266 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_266);
                        if ( s>=0 ) return s;
                        break;
                    case 212 : 
                        int LA4_268 = input.LA(1);

                         
                        int index4_268 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_268);
                        if ( s>=0 ) return s;
                        break;
                    case 213 : 
                        int LA4_269 = input.LA(1);

                         
                        int index4_269 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_269);
                        if ( s>=0 ) return s;
                        break;
                    case 214 : 
                        int LA4_270 = input.LA(1);

                         
                        int index4_270 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Formatting()) ) {s = 24;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index4_270);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA2_eotS =
        "\31\uffff";
    static final String DFA2_eofS =
        "\31\uffff";
    static final String DFA2_minS =
        "\1\6\30\uffff";
    static final String DFA2_maxS =
        "\1\140\30\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\26\uffff\1\2";
    static final String DFA2_specialS =
        "\31\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\3\1\13\uffff\5\1\35\uffff\1\30\1\1"+
            "\1\uffff\2\1\5\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "177:7: ( simpleStatement )?";
        }
    }
    static final String DFA3_eotS =
        "\45\uffff";
    static final String DFA3_eofS =
        "\45\uffff";
    static final String DFA3_minS =
        "\1\6\44\uffff";
    static final String DFA3_maxS =
        "\1\140\44\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\2\1\1\42\uffff";
    static final String DFA3_specialS =
        "\45\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\3\uffff\1\2\1\1\5\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\4\2\2\uffff\5\2\2\uffff"+
            "\6\2\4\uffff\2\2\2\uffff\1\2\24\uffff\2\2\1\uffff\2\2\5\uffff"+
            "\7\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 179:14: (stmts= statement )*";
        }
    }
    static final String DFA27_eotS =
        "\45\uffff";
    static final String DFA27_eofS =
        "\45\uffff";
    static final String DFA27_minS =
        "\1\6\44\uffff";
    static final String DFA27_maxS =
        "\1\140\44\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\1\1\42\uffff";
    static final String DFA27_specialS =
        "\45\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\2\3\uffff\1\2\1\1\5\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\4\2\2\uffff\5\2\2\uffff"+
            "\6\2\4\uffff\2\2\2\uffff\1\2\24\uffff\2\2\1\uffff\2\2\5\uffff"+
            "\7\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 234:22: ( statement )*";
        }
    }
    static final String DFA29_eotS =
        "\117\uffff";
    static final String DFA29_eofS =
        "\1\3\116\uffff";
    static final String DFA29_minS =
        "\1\6\2\0\114\uffff";
    static final String DFA29_maxS =
        "\1\140\2\0\114\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\1\2\47\uffff\1\1\43\uffff";
    static final String DFA29_specialS =
        "\1\uffff\1\0\1\1\114\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\3\3\uffff\2\3\5\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\4\3\1\2\1\1\15\3\4\uffff"+
            "\2\3\2\uffff\1\3\24\uffff\2\3\1\uffff\2\3\5\uffff\7\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "250:58: ( conditional )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_Formatting()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_Formatting()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\22\uffff";
    static final String DFA30_eofS =
        "\22\uffff";
    static final String DFA30_minS =
        "\1\6\21\uffff";
    static final String DFA30_maxS =
        "\1\140\21\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA30_specialS =
        "\22\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\1\21\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\2\1\57\uffff\1\1\1\uffff\1\1"+
            "\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "254:31: (whileCondition= expression )?";
        }
    }
    static final String DFA36_eotS =
        "\30\uffff";
    static final String DFA36_eofS =
        "\30\uffff";
    static final String DFA36_minS =
        "\1\6\27\uffff";
    static final String DFA36_maxS =
        "\1\140\27\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\17\uffff";
    static final String DFA36_specialS =
        "\30\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\10\12\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\1"+
            "\uffff\1\10\3\uffff\1\10\1\uffff\2\10\1\1\13\uffff\1\4\1\5\1"+
            "\6\1\2\1\3\36\uffff\1\10\1\uffff\1\10\1\7\5\uffff\7\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "265:1: simpleStatement : ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression );";
        }
    }
    static final String DFA35_eotS =
        "\24\uffff";
    static final String DFA35_eofS =
        "\1\21\23\uffff";
    static final String DFA35_minS =
        "\1\4\23\uffff";
    static final String DFA35_maxS =
        "\1\140\23\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\17\uffff\1\2\2\uffff";
    static final String DFA35_specialS =
        "\24\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\21\1\uffff\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff\2\1\56\uffff\1\21\1\1\1"+
            "\uffff\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "272:15: ( expression )?";
        }
    }
    static final String DFA37_eotS =
        "\117\uffff";
    static final String DFA37_eofS =
        "\1\3\116\uffff";
    static final String DFA37_minS =
        "\1\6\2\0\114\uffff";
    static final String DFA37_maxS =
        "\1\140\2\0\114\uffff";
    static final String DFA37_acceptS =
        "\3\uffff\1\2\47\uffff\1\1\43\uffff";
    static final String DFA37_specialS =
        "\1\uffff\1\0\1\1\114\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\3\3\uffff\2\3\5\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\4\3\1\2\1\1\15\3\4\uffff"+
            "\2\3\2\uffff\1\3\24\uffff\2\3\1\uffff\2\3\5\uffff\7\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "279:62: ( conditional )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_Formatting()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_Formatting()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\22\uffff";
    static final String DFA39_eofS =
        "\22\uffff";
    static final String DFA39_minS =
        "\1\4\21\uffff";
    static final String DFA39_maxS =
        "\1\140\21\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA39_specialS =
        "\22\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\21\1\uffff\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff\2\1\57\uffff\1\1\1\uffff"+
            "\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "284:7: ( commaList )?";
        }
    }
    static final String DFA40_eotS =
        "\22\uffff";
    static final String DFA40_eofS =
        "\22\uffff";
    static final String DFA40_minS =
        "\1\4\21\uffff";
    static final String DFA40_maxS =
        "\1\140\21\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA40_specialS =
        "\22\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\21\1\uffff\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff\2\1\57\uffff\1\1\1\uffff"+
            "\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "288:7: ( commaList )?";
        }
    }
    static final String DFA41_eotS =
        "\22\uffff";
    static final String DFA41_eofS =
        "\22\uffff";
    static final String DFA41_minS =
        "\1\6\21\uffff";
    static final String DFA41_maxS =
        "\1\140\21\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA41_specialS =
        "\22\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\1\21\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\2\1\57\uffff\1\1\1\uffff\1\1"+
            "\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "292:7: ( commaList )?";
        }
    }
    static final String DFA43_eotS =
        "\47\uffff";
    static final String DFA43_eofS =
        "\1\1\46\uffff";
    static final String DFA43_minS =
        "\1\6\46\uffff";
    static final String DFA43_maxS =
        "\1\140\46\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\42\uffff";
    static final String DFA43_specialS =
        "\47\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\4\3\uffff\1\4\6\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\4\4\2\uffff\5\4\2\1\6\4"+
            "\4\uffff\2\4\2\uffff\1\4\24\uffff\2\4\1\uffff\2\4\5\uffff\7"+
            "\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()* loopback of 300:29: ( statement )*";
        }
    }
    static final String DFA44_eotS =
        "\45\uffff";
    static final String DFA44_eofS =
        "\45\uffff";
    static final String DFA44_minS =
        "\1\6\44\uffff";
    static final String DFA44_maxS =
        "\1\140\44\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\2\1\1\42\uffff";
    static final String DFA44_specialS =
        "\45\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\2\3\uffff\1\2\1\1\5\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\4\2\2\uffff\5\2\2\uffff"+
            "\6\2\4\uffff\2\2\2\uffff\1\2\24\uffff\2\2\1\uffff\2\2\5\uffff"+
            "\7\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "()* loopback of 304:22: ( statement )*";
        }
    }
    static final String DFA47_eotS =
        "\45\uffff";
    static final String DFA47_eofS =
        "\45\uffff";
    static final String DFA47_minS =
        "\1\6\44\uffff";
    static final String DFA47_maxS =
        "\1\140\44\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\1\1\42\uffff";
    static final String DFA47_specialS =
        "\45\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\2\3\uffff\1\2\1\1\5\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\4\2\2\uffff\5\2\2\uffff"+
            "\6\2\4\uffff\2\2\2\uffff\1\2\24\uffff\2\2\1\uffff\2\2\5\uffff"+
            "\7\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "()* loopback of 308:86: ( statement )*";
        }
    }
    static final String DFA51_eotS =
        "\35\uffff";
    static final String DFA51_eofS =
        "\1\1\34\uffff";
    static final String DFA51_minS =
        "\1\4\10\uffff\1\0\23\uffff";
    static final String DFA51_maxS =
        "\1\120\10\uffff\1\0\23\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\2\32\uffff\1\1";
    static final String DFA51_specialS =
        "\11\uffff\1\0\23\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\7\uffff\1\1\36\uffff"+
            "\1\1\1\11\1\1\32\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "()* loopback of 329:22: ( Or weakLogicalXor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_9 = input.LA(1);

                         
                        int index51_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Formatting()) ) {s = 28;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\35\uffff";
    static final String DFA52_eofS =
        "\1\1\34\uffff";
    static final String DFA52_minS =
        "\1\4\10\uffff\1\0\23\uffff";
    static final String DFA52_maxS =
        "\1\120\10\uffff\1\0\23\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\2\32\uffff\1\1";
    static final String DFA52_specialS =
        "\11\uffff\1\0\23\uffff}>";
    static final String[] DFA52_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\7\uffff\1\1\36\uffff"+
            "\2\1\1\11\32\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "()* loopback of 333:22: ( Xor weakLogicalAnd )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_9 = input.LA(1);

                         
                        int index52_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_Formatting()) ) {s = 28;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index52_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\35\uffff";
    static final String DFA53_eofS =
        "\1\1\34\uffff";
    static final String DFA53_minS =
        "\1\4\10\uffff\1\0\23\uffff";
    static final String DFA53_maxS =
        "\1\120\10\uffff\1\0\23\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\32\uffff\1\1";
    static final String DFA53_specialS =
        "\11\uffff\1\0\23\uffff}>";
    static final String[] DFA53_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\7\uffff\1\1\36\uffff"+
            "\1\11\2\1\32\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "()* loopback of 337:18: ( And assignment )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_9 = input.LA(1);

                         
                        int index53_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Formatting()) ) {s = 28;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\57\uffff";
    static final String DFA54_eofS =
        "\1\uffff\1\3\55\uffff";
    static final String DFA54_minS =
        "\1\6\1\4\1\23\16\uffff\1\0\1\uffff\2\0\30\uffff\2\0";
    static final String DFA54_maxS =
        "\1\140\1\132\1\121\16\uffff\1\0\1\uffff\2\0\30\uffff\2\0";
    static final String DFA54_acceptS =
        "\3\uffff\1\2\34\uffff\1\1\16\uffff";
    static final String DFA54_specialS =
        "\21\uffff\1\0\1\uffff\1\1\1\2\30\uffff\1\3\1\4}>";
    static final String[] DFA54_transitionS = {
            "\1\3\12\uffff\1\3\1\uffff\1\2\2\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\3\uffff\1\3\1\uffff\2\3\57\uffff\1\1\1\uffff\1\3\6\uffff"+
            "\7\3",
            "\4\3\1\23\1\3\2\uffff\3\3\1\21\1\24\1\uffff\1\3\1\uffff\4\3"+
            "\1\uffff\5\3\1\uffff\1\40\23\uffff\4\3\31\uffff\1\3\4\uffff"+
            "\1\40\3\3\1\uffff\1\3",
            "\1\55\75\uffff\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "340:1: assignment : ( name ( ( Equals | AsignmentOperator ) assignment ) | ternary );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_17 = input.LA(1);

                         
                        int index54_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Formatting()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index54_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_19 = input.LA(1);

                         
                        int index54_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Formatting()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index54_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_20 = input.LA(1);

                         
                        int index54_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Formatting()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index54_20);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_45 = input.LA(1);

                         
                        int index54_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Formatting()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index54_45);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_46 = input.LA(1);

                         
                        int index54_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_Formatting()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index54_46);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\u00e9\uffff";
    static final String DFA55_eofS =
        "\5\uffff\1\117\3\uffff\6\117\u00da\uffff";
    static final String DFA55_minS =
        "\2\6\1\23\1\6\1\23\1\4\3\23\6\4\1\6\1\23\76\0\13\uffff\1\0\1\uffff"+
        "\20\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14"+
        "\uffff\12\0\14\uffff\3\0";
    static final String DFA55_maxS =
        "\4\140\1\121\1\132\3\121\6\130\1\6\1\121\76\0\13\uffff\1\0\1\uffff"+
        "\20\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14"+
        "\uffff\12\0\14\uffff\3\0";
    static final String DFA55_acceptS =
        "\117\uffff\1\2\13\uffff\1\1\u008d\uffff";
    static final String DFA55_specialS =
        "\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
        "\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\13\uffff"+
        "\1\76\1\uffff\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107"+
        "\1\110\1\111\1\112\1\113\1\114\1\115\1\116\14\uffff\1\117\1\120"+
        "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\1\131"+
        "\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\14\uffff"+
        "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\14"+
        "\uffff\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166"+
        "\14\uffff\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177"+
        "\1\u0080\14\uffff\1\u0081\1\u0082\1\u0083}>";
    static final String[] DFA55_transitionS = {
            "\1\3\12\uffff\1\2\1\uffff\1\6\2\uffff\1\20\1\uffff\1\1\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\1\7\1\10\57\uffff\1\5\1\uffff\1\14"+
            "\6\uffff\1\4\1\17\1\11\1\12\1\13\1\15\1\16",
            "\1\23\12\uffff\1\22\1\uffff\1\26\2\uffff\1\40\1\uffff\1\21"+
            "\1\uffff\1\22\3\uffff\1\22\1\uffff\1\27\1\30\57\uffff\1\25\1"+
            "\uffff\1\34\6\uffff\1\24\1\37\1\31\1\32\1\33\1\35\1\36",
            "\1\43\2\uffff\1\55\11\uffff\1\44\1\45\57\uffff\1\42\1\uffff"+
            "\1\51\6\uffff\1\41\1\54\1\46\1\47\1\50\1\52\1\53",
            "\1\63\12\uffff\1\62\1\uffff\1\60\2\uffff\1\76\1\uffff\1\61"+
            "\1\uffff\1\62\3\uffff\1\62\1\uffff\1\65\1\66\57\uffff\1\57\1"+
            "\uffff\1\72\5\uffff\1\56\1\64\1\75\1\67\1\70\1\71\1\73\1\74",
            "\1\100\75\uffff\1\77",
            "\2\117\1\132\1\117\1\102\1\117\2\uffff\1\117\1\116\1\115\1"+
            "\101\1\103\1\uffff\1\133\1\uffff\1\117\1\107\1\113\1\114\1\uffff"+
            "\2\107\3\106\25\uffff\3\117\1\105\31\uffff\1\117\5\uffff\1\112"+
            "\1\111\1\110\1\uffff\1\104",
            "\1\134\75\uffff\1\135",
            "\1\137\75\uffff\1\136",
            "\1\141\75\uffff\1\140",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\153\1\152"+
            "\3\uffff\1\133\1\uffff\1\117\1\144\1\150\1\151\1\uffff\2\144"+
            "\3\143\25\uffff\3\117\1\142\31\uffff\1\117\5\uffff\1\147\1\146"+
            "\1\145",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\u0081\1"+
            "\u0080\3\uffff\1\133\1\uffff\1\117\1\172\1\176\1\177\1\uffff"+
            "\2\172\3\171\25\uffff\3\117\1\170\31\uffff\1\117\5\uffff\1\175"+
            "\1\174\1\173",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\u0097\1"+
            "\u0096\3\uffff\1\133\1\uffff\1\117\1\u0090\1\u0094\1\u0095\1"+
            "\uffff\2\u0090\3\u008f\25\uffff\3\117\1\u008e\31\uffff\1\117"+
            "\5\uffff\1\u0093\1\u0092\1\u0091",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\u00ad\1"+
            "\u00ac\3\uffff\1\133\1\uffff\1\117\1\u00a6\1\u00aa\1\u00ab\1"+
            "\uffff\2\u00a6\3\u00a5\25\uffff\3\117\1\u00a4\31\uffff\1\117"+
            "\5\uffff\1\u00a9\1\u00a8\1\u00a7",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\u00c3\1"+
            "\u00c2\3\uffff\1\133\1\uffff\1\117\1\u00bc\1\u00c0\1\u00c1\1"+
            "\uffff\2\u00bc\3\u00bb\25\uffff\3\117\1\u00ba\31\uffff\1\117"+
            "\5\uffff\1\u00bf\1\u00be\1\u00bd",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\u00d9\1"+
            "\u00d8\3\uffff\1\133\1\uffff\1\117\1\u00d2\1\u00d6\1\u00d7\1"+
            "\uffff\2\u00d2\3\u00d1\25\uffff\3\117\1\u00d0\31\uffff\1\117"+
            "\5\uffff\1\u00d5\1\u00d4\1\u00d3",
            "\1\u00e6",
            "\1\u00e8\75\uffff\1\u00e7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "345:1: ternary : ( logicalOr QuestionMark expression Colon expression | logicalOr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_17 = input.LA(1);

                         
                        int index55_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_18 = input.LA(1);

                         
                        int index55_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_19 = input.LA(1);

                         
                        int index55_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_20 = input.LA(1);

                         
                        int index55_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_20);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_21 = input.LA(1);

                         
                        int index55_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_22 = input.LA(1);

                         
                        int index55_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_23 = input.LA(1);

                         
                        int index55_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA55_24 = input.LA(1);

                         
                        int index55_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA55_25 = input.LA(1);

                         
                        int index55_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA55_26 = input.LA(1);

                         
                        int index55_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_26);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA55_27 = input.LA(1);

                         
                        int index55_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_27);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA55_28 = input.LA(1);

                         
                        int index55_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_28);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA55_29 = input.LA(1);

                         
                        int index55_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_29);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA55_30 = input.LA(1);

                         
                        int index55_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_30);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA55_31 = input.LA(1);

                         
                        int index55_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_31);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA55_32 = input.LA(1);

                         
                        int index55_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_32);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA55_33 = input.LA(1);

                         
                        int index55_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_33);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA55_34 = input.LA(1);

                         
                        int index55_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_34);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA55_35 = input.LA(1);

                         
                        int index55_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_35);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA55_36 = input.LA(1);

                         
                        int index55_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_36);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA55_37 = input.LA(1);

                         
                        int index55_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_37);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA55_38 = input.LA(1);

                         
                        int index55_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_38);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA55_39 = input.LA(1);

                         
                        int index55_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_39);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA55_40 = input.LA(1);

                         
                        int index55_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_40);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA55_41 = input.LA(1);

                         
                        int index55_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_41);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA55_42 = input.LA(1);

                         
                        int index55_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_42);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA55_43 = input.LA(1);

                         
                        int index55_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_43);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA55_44 = input.LA(1);

                         
                        int index55_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_44);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA55_45 = input.LA(1);

                         
                        int index55_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_45);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA55_46 = input.LA(1);

                         
                        int index55_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_46);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA55_47 = input.LA(1);

                         
                        int index55_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_47);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA55_48 = input.LA(1);

                         
                        int index55_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_48);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA55_49 = input.LA(1);

                         
                        int index55_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_49);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA55_50 = input.LA(1);

                         
                        int index55_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_50);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA55_51 = input.LA(1);

                         
                        int index55_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_51);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA55_52 = input.LA(1);

                         
                        int index55_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_52);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA55_53 = input.LA(1);

                         
                        int index55_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_53);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA55_54 = input.LA(1);

                         
                        int index55_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_54);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA55_55 = input.LA(1);

                         
                        int index55_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_55);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA55_56 = input.LA(1);

                         
                        int index55_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_56);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA55_57 = input.LA(1);

                         
                        int index55_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_57);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA55_58 = input.LA(1);

                         
                        int index55_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_58);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA55_59 = input.LA(1);

                         
                        int index55_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_59);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA55_60 = input.LA(1);

                         
                        int index55_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_60);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA55_61 = input.LA(1);

                         
                        int index55_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_61);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA55_62 = input.LA(1);

                         
                        int index55_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_62);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA55_63 = input.LA(1);

                         
                        int index55_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_63);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA55_64 = input.LA(1);

                         
                        int index55_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_64);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA55_65 = input.LA(1);

                         
                        int index55_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_65);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA55_66 = input.LA(1);

                         
                        int index55_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_66);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA55_67 = input.LA(1);

                         
                        int index55_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_67);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA55_68 = input.LA(1);

                         
                        int index55_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_68);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA55_69 = input.LA(1);

                         
                        int index55_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_69);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA55_70 = input.LA(1);

                         
                        int index55_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_70);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA55_71 = input.LA(1);

                         
                        int index55_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_71);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA55_72 = input.LA(1);

                         
                        int index55_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_72);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA55_73 = input.LA(1);

                         
                        int index55_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_73);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA55_74 = input.LA(1);

                         
                        int index55_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_74);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA55_75 = input.LA(1);

                         
                        int index55_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_75);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA55_76 = input.LA(1);

                         
                        int index55_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_76);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA55_77 = input.LA(1);

                         
                        int index55_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_77);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA55_78 = input.LA(1);

                         
                        int index55_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_78);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA55_90 = input.LA(1);

                         
                        int index55_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_90);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA55_92 = input.LA(1);

                         
                        int index55_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_92);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA55_93 = input.LA(1);

                         
                        int index55_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_93);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA55_94 = input.LA(1);

                         
                        int index55_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_94);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA55_95 = input.LA(1);

                         
                        int index55_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_95);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA55_96 = input.LA(1);

                         
                        int index55_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_96);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA55_97 = input.LA(1);

                         
                        int index55_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_97);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA55_98 = input.LA(1);

                         
                        int index55_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_98);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA55_99 = input.LA(1);

                         
                        int index55_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_99);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA55_100 = input.LA(1);

                         
                        int index55_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_100);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA55_101 = input.LA(1);

                         
                        int index55_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_101);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA55_102 = input.LA(1);

                         
                        int index55_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_102);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA55_103 = input.LA(1);

                         
                        int index55_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_103);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA55_104 = input.LA(1);

                         
                        int index55_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_104);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA55_105 = input.LA(1);

                         
                        int index55_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_105);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA55_106 = input.LA(1);

                         
                        int index55_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_106);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA55_107 = input.LA(1);

                         
                        int index55_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_107);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA55_120 = input.LA(1);

                         
                        int index55_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_120);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA55_121 = input.LA(1);

                         
                        int index55_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_121);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA55_122 = input.LA(1);

                         
                        int index55_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_122);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA55_123 = input.LA(1);

                         
                        int index55_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_123);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA55_124 = input.LA(1);

                         
                        int index55_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_124);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA55_125 = input.LA(1);

                         
                        int index55_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_125);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA55_126 = input.LA(1);

                         
                        int index55_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_126);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA55_127 = input.LA(1);

                         
                        int index55_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_127);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA55_128 = input.LA(1);

                         
                        int index55_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_128);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA55_129 = input.LA(1);

                         
                        int index55_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_129);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA55_142 = input.LA(1);

                         
                        int index55_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_142);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA55_143 = input.LA(1);

                         
                        int index55_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_143);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA55_144 = input.LA(1);

                         
                        int index55_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_144);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA55_145 = input.LA(1);

                         
                        int index55_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_145);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA55_146 = input.LA(1);

                         
                        int index55_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_146);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA55_147 = input.LA(1);

                         
                        int index55_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_147);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA55_148 = input.LA(1);

                         
                        int index55_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_148);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA55_149 = input.LA(1);

                         
                        int index55_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_149);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA55_150 = input.LA(1);

                         
                        int index55_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_150);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA55_151 = input.LA(1);

                         
                        int index55_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_151);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA55_164 = input.LA(1);

                         
                        int index55_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_164);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA55_165 = input.LA(1);

                         
                        int index55_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_165);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA55_166 = input.LA(1);

                         
                        int index55_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_166);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA55_167 = input.LA(1);

                         
                        int index55_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_167);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA55_168 = input.LA(1);

                         
                        int index55_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_168);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA55_169 = input.LA(1);

                         
                        int index55_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_169);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA55_170 = input.LA(1);

                         
                        int index55_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_170);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA55_171 = input.LA(1);

                         
                        int index55_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_171);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA55_172 = input.LA(1);

                         
                        int index55_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_172);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA55_173 = input.LA(1);

                         
                        int index55_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_173);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA55_186 = input.LA(1);

                         
                        int index55_186 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_186);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA55_187 = input.LA(1);

                         
                        int index55_187 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_187);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA55_188 = input.LA(1);

                         
                        int index55_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_188);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA55_189 = input.LA(1);

                         
                        int index55_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_189);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA55_190 = input.LA(1);

                         
                        int index55_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_190);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA55_191 = input.LA(1);

                         
                        int index55_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_191);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA55_192 = input.LA(1);

                         
                        int index55_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_192);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA55_193 = input.LA(1);

                         
                        int index55_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_193);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA55_194 = input.LA(1);

                         
                        int index55_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_194);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA55_195 = input.LA(1);

                         
                        int index55_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_195);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA55_208 = input.LA(1);

                         
                        int index55_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_208);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA55_209 = input.LA(1);

                         
                        int index55_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_209);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA55_210 = input.LA(1);

                         
                        int index55_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_210);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA55_211 = input.LA(1);

                         
                        int index55_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_211);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA55_212 = input.LA(1);

                         
                        int index55_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_212);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA55_213 = input.LA(1);

                         
                        int index55_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_213);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA55_214 = input.LA(1);

                         
                        int index55_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_214);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA55_215 = input.LA(1);

                         
                        int index55_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_215);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA55_216 = input.LA(1);

                         
                        int index55_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_216);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA55_217 = input.LA(1);

                         
                        int index55_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_217);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA55_230 = input.LA(1);

                         
                        int index55_230 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_230);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA55_231 = input.LA(1);

                         
                        int index55_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_231);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA55_232 = input.LA(1);

                         
                        int index55_232 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Formatting()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index55_232);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\16\uffff";
    static final String DFA56_eofS =
        "\1\1\15\uffff";
    static final String DFA56_minS =
        "\1\4\15\uffff";
    static final String DFA56_maxS =
        "\1\120\15\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA56_specialS =
        "\16\uffff}>";
    static final String[] DFA56_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\15\4\uffff\1\1\1"+
            "\uffff\1\1\36\uffff\3\1\32\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "()* loopback of 351:18: ( LogicalOr logicalAnd )*";
        }
    }
    static final String DFA57_eotS =
        "\17\uffff";
    static final String DFA57_eofS =
        "\1\1\16\uffff";
    static final String DFA57_minS =
        "\1\4\16\uffff";
    static final String DFA57_maxS =
        "\1\120\16\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\2\14\uffff\1\1";
    static final String DFA57_specialS =
        "\17\uffff}>";
    static final String[] DFA57_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\16\3\uffff\1\1\1"+
            "\uffff\1\1\36\uffff\3\1\32\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "()* loopback of 355:17: ( LogicalAnd bitwiseOr )*";
        }
    }
    static final String DFA58_eotS =
        "\20\uffff";
    static final String DFA58_eofS =
        "\1\1\17\uffff";
    static final String DFA58_minS =
        "\1\4\17\uffff";
    static final String DFA58_maxS =
        "\1\120\17\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA58_specialS =
        "\20\uffff}>";
    static final String[] DFA58_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\1\17\33\uffff\3\1\32\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "()* loopback of 359:18: ( Pipe bitWiseAnd )*";
        }
    }
    static final String DFA59_eotS =
        "\21\uffff";
    static final String DFA59_eofS =
        "\1\1\20\uffff";
    static final String DFA59_minS =
        "\1\4\20\uffff";
    static final String DFA59_maxS =
        "\1\120\20\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\2\16\uffff\1\1";
    static final String DFA59_specialS =
        "\21\uffff}>";
    static final String[] DFA59_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\20\1\1\33\uffff\3\1\32\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "()* loopback of 363:21: ( Ampersand equalityCheck )*";
        }
    }
    static final String DFA60_eotS =
        "\22\uffff";
    static final String DFA60_eofS =
        "\1\2\21\uffff";
    static final String DFA60_minS =
        "\1\4\21\uffff";
    static final String DFA60_maxS =
        "\1\126\21\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\1\1\1\2\17\uffff";
    static final String DFA60_specialS =
        "\22\uffff}>";
    static final String[] DFA60_transitionS = {
            "\2\2\1\uffff\1\2\1\uffff\1\2\2\uffff\3\2\3\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\2\2\33\uffff\3\2\32\uffff\1\2\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "367:24: ( EqualityOperator comparisionCheck )?";
        }
    }
    static final String DFA61_eotS =
        "\23\uffff";
    static final String DFA61_eofS =
        "\1\2\22\uffff";
    static final String DFA61_minS =
        "\1\4\22\uffff";
    static final String DFA61_maxS =
        "\1\127\22\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\1\2\20\uffff";
    static final String DFA61_specialS =
        "\23\uffff}>";
    static final String[] DFA61_transitionS = {
            "\2\2\1\uffff\1\2\1\uffff\1\2\2\uffff\3\2\3\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\2\2\33\uffff\3\2\32\uffff\1\2\5\uffff\1\2\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "371:20: ( ComparisionOperator bitWiseShift )?";
        }
    }
    static final String DFA62_eotS =
        "\24\uffff";
    static final String DFA62_eofS =
        "\1\1\23\uffff";
    static final String DFA62_minS =
        "\1\4\23\uffff";
    static final String DFA62_maxS =
        "\1\130\23\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\2\21\uffff\1\1";
    static final String DFA62_specialS =
        "\24\uffff}>";
    static final String[] DFA62_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\2\1\33\uffff\3\1\32\uffff\1\1\5\uffff\2\1\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "()* loopback of 375:16: ( ShiftOperator addition )*";
        }
    }
    static final String DFA63_eotS =
        "\25\uffff";
    static final String DFA63_eofS =
        "\1\1\24\uffff";
    static final String DFA63_minS =
        "\1\4\24\uffff";
    static final String DFA63_maxS =
        "\1\130\24\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\2\22\uffff\1\1";
    static final String DFA63_specialS =
        "\25\uffff}>";
    static final String[] DFA63_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\1\1\1\24\2\1\1\uffff\2\24\30\uffff\3\1\32\uffff\1\1\5\uffff"+
            "\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "()* loopback of 379:22: ( ( Plus | Minus | Dot ) multiplication )*";
        }
    }
    static final String DFA64_eotS =
        "\26\uffff";
    static final String DFA64_eofS =
        "\1\1\25\uffff";
    static final String DFA64_minS =
        "\1\4\25\uffff";
    static final String DFA64_maxS =
        "\1\130\25\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\2\23\uffff\1\1";
    static final String DFA64_specialS =
        "\26\uffff}>";
    static final String[] DFA64_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\4\1\1\uffff\2\1\3\25\25\uffff\3\1\32\uffff\1\1\5\uffff\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "()* loopback of 383:18: ( ( Asterisk | Forwardslash | Percent ) logicalNot )*";
        }
    }
    static final String DFA65_eotS =
        "\21\uffff";
    static final String DFA65_eofS =
        "\21\uffff";
    static final String DFA65_minS =
        "\1\6\20\uffff";
    static final String DFA65_maxS =
        "\1\140\20\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\16\uffff";
    static final String DFA65_specialS =
        "\21\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\2\12\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\1\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\2\2\57\uffff\1\2\1\uffff\1\2\6\uffff"+
            "\7\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "386:1: logicalNot : ( Bang logicalNot | instanceOf );";
        }
    }
    static final String DFA66_eotS =
        "\27\uffff";
    static final String DFA66_eofS =
        "\1\2\26\uffff";
    static final String DFA66_minS =
        "\1\4\26\uffff";
    static final String DFA66_maxS =
        "\1\130\26\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\1\2\24\uffff";
    static final String DFA66_specialS =
        "\27\uffff}>";
    static final String[] DFA66_transitionS = {
            "\2\2\1\uffff\1\2\1\uffff\1\2\2\uffff\3\2\3\uffff\1\2\1\uffff"+
            "\4\2\1\uffff\5\2\25\uffff\3\2\1\1\31\uffff\1\2\5\uffff\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "392:20: ( Instanceof negateOrCast )?";
        }
    }
    static final String DFA67_eotS =
        "\41\uffff";
    static final String DFA67_eofS =
        "\41\uffff";
    static final String DFA67_minS =
        "\1\6\1\uffff\1\6\36\uffff";
    static final String DFA67_maxS =
        "\1\140\1\uffff\1\140\36\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\14\uffff\1\2\1\3\17\uffff";
    static final String DFA67_specialS =
        "\41\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\2\12\uffff\1\1\1\uffff\1\3\2\uffff\1\3\3\uffff\1\1\3\uffff"+
            "\1\1\1\uffff\2\3\57\uffff\1\3\1\uffff\1\3\6\uffff\7\3",
            "",
            "\1\21\12\uffff\1\21\1\uffff\1\21\2\uffff\1\21\1\uffff\1\21"+
            "\1\uffff\1\21\3\uffff\1\21\1\uffff\2\21\57\uffff\1\21\1\uffff"+
            "\1\21\5\uffff\1\20\7\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "395:1: negateOrCast : ( ( Tilde | Minus | SuppressWarnings ) increment | OpenBrace PrimitiveType CloseBrace increment | OpenBrace weakLogicalAnd CloseBrace | increment );";
        }
    }
    static final String DFA68_eotS =
        "\53\uffff";
    static final String DFA68_eofS =
        "\2\uffff\1\4\50\uffff";
    static final String DFA68_minS =
        "\1\23\1\uffff\1\4\1\23\12\uffff\1\0\27\uffff\2\0\1\uffff\2\0";
    static final String DFA68_maxS =
        "\1\140\1\uffff\1\132\1\121\12\uffff\1\0\27\uffff\2\0\1\uffff\2\0";
    static final String DFA68_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\43\uffff\1\2\2\uffff";
    static final String DFA68_specialS =
        "\16\uffff\1\0\27\uffff\1\1\1\2\1\uffff\1\3\1\4}>";
    static final String[] DFA68_transitionS = {
            "\1\3\2\uffff\1\4\11\uffff\2\4\57\uffff\1\2\1\uffff\1\4\6\uffff"+
            "\1\1\6\4",
            "",
            "\4\4\1\46\1\4\2\uffff\3\4\1\16\1\47\1\uffff\1\4\1\uffff\4\4"+
            "\1\uffff\5\4\25\uffff\4\4\31\uffff\1\4\5\uffff\3\4\1\uffff\1"+
            "\50",
            "\1\51\75\uffff\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "402:1: increment : ( IncrementOperator name | name IncrementOperator | newOrClone );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_14 = input.LA(1);

                         
                        int index68_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_Formatting()) ) {s = 40;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index68_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_38 = input.LA(1);

                         
                        int index68_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_Formatting()) ) {s = 40;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index68_38);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_39 = input.LA(1);

                         
                        int index68_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_Formatting()) ) {s = 40;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index68_39);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA68_41 = input.LA(1);

                         
                        int index68_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_Formatting()) ) {s = 40;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index68_41);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA68_42 = input.LA(1);

                         
                        int index68_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_Formatting()) ) {s = 40;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index68_42);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\15\uffff";
    static final String DFA69_eofS =
        "\15\uffff";
    static final String DFA69_minS =
        "\1\23\14\uffff";
    static final String DFA69_maxS =
        "\1\140\14\uffff";
    static final String DFA69_acceptS =
        "\1\uffff\1\1\1\2\1\3\11\uffff";
    static final String DFA69_specialS =
        "\15\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\3\2\uffff\1\3\11\uffff\1\1\1\2\57\uffff\1\3\1\uffff\1\3\7"+
            "\uffff\6\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "408:1: newOrClone : ( New nameOrFunctionCall | Clone name | atomOrReference );";
        }
    }
    static final String DFA70_eotS =
        "\13\uffff";
    static final String DFA70_eofS =
        "\13\uffff";
    static final String DFA70_minS =
        "\1\23\12\uffff";
    static final String DFA70_maxS =
        "\1\140\12\uffff";
    static final String DFA70_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\2\uffff";
    static final String DFA70_specialS =
        "\13\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\10\2\uffff\1\10\72\uffff\1\10\1\uffff\1\1\7\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "414:1: atomOrReference : ( atom | reference );";
        }
    }
    static final String DFA72_eotS =
        "\22\uffff";
    static final String DFA72_eofS =
        "\22\uffff";
    static final String DFA72_minS =
        "\1\6\21\uffff";
    static final String DFA72_maxS =
        "\1\140\21\uffff";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA72_specialS =
        "\22\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\1\21\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\2\1\57\uffff\1\1\1\uffff\1\1"+
            "\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "420:23: ( arrayEntry ( Comma arrayEntry )* )?";
        }
    }
    static final String DFA73_eotS =
        "\u00ce\uffff";
    static final String DFA73_eofS =
        "\1\uffff\1\46\7\uffff\6\46\u00bf\uffff";
    static final String DFA73_minS =
        "\1\6\1\5\1\23\1\6\1\23\1\6\3\23\6\5\1\6\1\23\23\0\1\uffff\1\0\3"+
        "\uffff\103\0\1\uffff\1\0\3\uffff\16\0\4\uffff\15\0\3\uffff\1\0\1"+
        "\uffff\15\0\1\uffff\1\0\3\uffff\15\0\4\uffff\16\0\4\uffff\4\0";
    static final String DFA73_maxS =
        "\1\140\1\132\1\121\3\140\3\121\6\130\1\6\1\121\23\0\1\uffff\1\0"+
        "\3\uffff\103\0\1\uffff\1\0\3\uffff\16\0\4\uffff\15\0\3\uffff\1\0"+
        "\1\uffff\15\0\1\uffff\1\0\3\uffff\15\0\4\uffff\16\0\4\uffff\4\0";
    static final String DFA73_acceptS =
        "\44\uffff\1\1\1\uffff\1\2\u00a7\uffff";
    static final String DFA73_specialS =
        "\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\uffff\1\23\3\uffff\1\24\1\25"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
        "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
        "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74"+
        "\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107"+
        "\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
        "\1\123\1\124\1\125\1\126\1\uffff\1\127\3\uffff\1\130\1\131\1\132"+
        "\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145"+
        "\4\uffff\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1"+
        "\157\1\160\1\161\1\162\3\uffff\1\163\1\uffff\1\164\1\165\1\166\1"+
        "\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\uffff"+
        "\1\u0081\3\uffff\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087"+
        "\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\4\uffff"+
        "\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096"+
        "\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\4\uffff\1\u009d"+
        "\1\u009e\1\u009f\1\u00a0}>";
    static final String[] DFA73_transitionS = {
            "\1\5\12\uffff\1\4\1\uffff\1\2\2\uffff\1\20\1\uffff\1\3\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\1\7\1\10\57\uffff\1\1\1\uffff\1\14"+
            "\6\uffff\1\6\1\17\1\11\1\12\1\13\1\15\1\16",
            "\1\46\1\22\1\46\1\23\3\uffff\1\44\1\37\1\36\1\21\1\24\1\uffff"+
            "\1\40\2\uffff\1\30\1\34\1\35\1\uffff\2\30\3\27\1\uffff\1\45"+
            "\23\uffff\1\41\1\43\1\42\1\26\36\uffff\1\45\1\33\1\32\1\31\1"+
            "\uffff\1\25",
            "\1\51\75\uffff\1\52",
            "\1\55\12\uffff\1\54\1\uffff\1\60\2\uffff\1\72\1\uffff\1\53"+
            "\1\uffff\1\54\3\uffff\1\54\1\uffff\1\61\1\62\57\uffff\1\57\1"+
            "\uffff\1\66\6\uffff\1\56\1\71\1\63\1\64\1\65\1\67\1\70",
            "\1\75\2\uffff\1\107\11\uffff\1\76\1\77\57\uffff\1\74\1\uffff"+
            "\1\103\6\uffff\1\73\1\106\1\100\1\101\1\102\1\104\1\105",
            "\1\115\12\uffff\1\114\1\uffff\1\112\2\uffff\1\130\1\uffff\1"+
            "\113\1\uffff\1\114\3\uffff\1\114\1\uffff\1\117\1\120\57\uffff"+
            "\1\111\1\uffff\1\124\5\uffff\1\110\1\116\1\127\1\121\1\122\1"+
            "\123\1\125\1\126",
            "\1\132\75\uffff\1\131",
            "\1\134\75\uffff\1\133",
            "\1\136\75\uffff\1\135",
            "\1\46\1\uffff\1\46\4\uffff\1\44\1\150\1\147\3\uffff\1\155\2"+
            "\uffff\1\141\1\145\1\146\1\uffff\2\141\3\140\25\uffff\1\151"+
            "\1\153\1\152\1\137\37\uffff\1\144\1\143\1\142",
            "\1\46\1\uffff\1\46\4\uffff\1\44\1\172\1\171\3\uffff\1\173\2"+
            "\uffff\1\163\1\167\1\170\1\uffff\2\163\3\162\25\uffff\1\174"+
            "\1\176\1\175\1\161\37\uffff\1\166\1\165\1\164",
            "\1\46\1\uffff\1\46\4\uffff\1\44\1\u008c\1\u008b\3\uffff\1\u0093"+
            "\2\uffff\1\u0085\1\u0089\1\u008a\1\uffff\2\u0085\3\u0084\25"+
            "\uffff\1\u008d\1\u008f\1\u008e\1\u0083\37\uffff\1\u0088\1\u0087"+
            "\1\u0086",
            "\1\46\1\uffff\1\46\4\uffff\1\44\1\u009e\1\u009d\3\uffff\1\u00a3"+
            "\2\uffff\1\u0097\1\u009b\1\u009c\1\uffff\2\u0097\3\u0096\25"+
            "\uffff\1\u009f\1\u00a1\1\u00a0\1\u0095\37\uffff\1\u009a\1\u0099"+
            "\1\u0098",
            "\1\46\1\uffff\1\46\4\uffff\1\44\1\u00b0\1\u00af\3\uffff\1\u00b8"+
            "\2\uffff\1\u00a9\1\u00ad\1\u00ae\1\uffff\2\u00a9\3\u00a8\25"+
            "\uffff\1\u00b1\1\u00b3\1\u00b2\1\u00a7\37\uffff\1\u00ac\1\u00ab"+
            "\1\u00aa",
            "\1\46\1\uffff\1\46\4\uffff\1\44\1\u00c2\1\u00c1\3\uffff\1\u00ca"+
            "\2\uffff\1\u00bb\1\u00bf\1\u00c0\1\uffff\2\u00bb\3\u00ba\25"+
            "\uffff\1\u00c3\1\u00c5\1\u00c4\1\u00b9\37\uffff\1\u00be\1\u00bd"+
            "\1\u00bc",
            "\1\u00cb",
            "\1\u00cd\75\uffff\1\u00cc",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "424:7: ( keyValuePair | expression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_17 = input.LA(1);

                         
                        int index73_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_25 = input.LA(1);

                         
                        int index73_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_26);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_27 = input.LA(1);

                         
                        int index73_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_27);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_28 = input.LA(1);

                         
                        int index73_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_28);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_29 = input.LA(1);

                         
                        int index73_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_29);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_30 = input.LA(1);

                         
                        int index73_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_30);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_31 = input.LA(1);

                         
                        int index73_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_31);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_32 = input.LA(1);

                         
                        int index73_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_32);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_33 = input.LA(1);

                         
                        int index73_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_33);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_34 = input.LA(1);

                         
                        int index73_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_34);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_35 = input.LA(1);

                         
                        int index73_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_35);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_37 = input.LA(1);

                         
                        int index73_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_37);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA73_41 = input.LA(1);

                         
                        int index73_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_41);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA73_42 = input.LA(1);

                         
                        int index73_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_42);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA73_43 = input.LA(1);

                         
                        int index73_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_43);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA73_44 = input.LA(1);

                         
                        int index73_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_44);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA73_45 = input.LA(1);

                         
                        int index73_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_45);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA73_46 = input.LA(1);

                         
                        int index73_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_46);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA73_47 = input.LA(1);

                         
                        int index73_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_47);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA73_48 = input.LA(1);

                         
                        int index73_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_48);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA73_49 = input.LA(1);

                         
                        int index73_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_49);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA73_50 = input.LA(1);

                         
                        int index73_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_50);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA73_51 = input.LA(1);

                         
                        int index73_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_51);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA73_52 = input.LA(1);

                         
                        int index73_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_52);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA73_53 = input.LA(1);

                         
                        int index73_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_53);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA73_54 = input.LA(1);

                         
                        int index73_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_54);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA73_55 = input.LA(1);

                         
                        int index73_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_55);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA73_56 = input.LA(1);

                         
                        int index73_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_56);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA73_57 = input.LA(1);

                         
                        int index73_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_57);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA73_58 = input.LA(1);

                         
                        int index73_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_58);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA73_59 = input.LA(1);

                         
                        int index73_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_59);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA73_60 = input.LA(1);

                         
                        int index73_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_60);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA73_61 = input.LA(1);

                         
                        int index73_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_61);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA73_62 = input.LA(1);

                         
                        int index73_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_62);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA73_63 = input.LA(1);

                         
                        int index73_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_63);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA73_64 = input.LA(1);

                         
                        int index73_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_64);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA73_65 = input.LA(1);

                         
                        int index73_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_65);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA73_66 = input.LA(1);

                         
                        int index73_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_66);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA73_67 = input.LA(1);

                         
                        int index73_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_67);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA73_68 = input.LA(1);

                         
                        int index73_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_68);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA73_69 = input.LA(1);

                         
                        int index73_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_69);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA73_70 = input.LA(1);

                         
                        int index73_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_70);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA73_71 = input.LA(1);

                         
                        int index73_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_71);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA73_72 = input.LA(1);

                         
                        int index73_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_72);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA73_73 = input.LA(1);

                         
                        int index73_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_73);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA73_74 = input.LA(1);

                         
                        int index73_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_74);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA73_75 = input.LA(1);

                         
                        int index73_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_75);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA73_76 = input.LA(1);

                         
                        int index73_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_76);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA73_77 = input.LA(1);

                         
                        int index73_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_77);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA73_78 = input.LA(1);

                         
                        int index73_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_78);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA73_79 = input.LA(1);

                         
                        int index73_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_79);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA73_80 = input.LA(1);

                         
                        int index73_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_80);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA73_81 = input.LA(1);

                         
                        int index73_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_81);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA73_82 = input.LA(1);

                         
                        int index73_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_82);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA73_83 = input.LA(1);

                         
                        int index73_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_83);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA73_84 = input.LA(1);

                         
                        int index73_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_84);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA73_85 = input.LA(1);

                         
                        int index73_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_85);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA73_86 = input.LA(1);

                         
                        int index73_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_86);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA73_87 = input.LA(1);

                         
                        int index73_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_87);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA73_88 = input.LA(1);

                         
                        int index73_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_88);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA73_89 = input.LA(1);

                         
                        int index73_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_89);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA73_90 = input.LA(1);

                         
                        int index73_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_90);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA73_91 = input.LA(1);

                         
                        int index73_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_91);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA73_92 = input.LA(1);

                         
                        int index73_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_92);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA73_93 = input.LA(1);

                         
                        int index73_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_93);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA73_94 = input.LA(1);

                         
                        int index73_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_94);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA73_95 = input.LA(1);

                         
                        int index73_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_95);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA73_96 = input.LA(1);

                         
                        int index73_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_96);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA73_97 = input.LA(1);

                         
                        int index73_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_97);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA73_98 = input.LA(1);

                         
                        int index73_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_98);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA73_99 = input.LA(1);

                         
                        int index73_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_99);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA73_100 = input.LA(1);

                         
                        int index73_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_100);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA73_101 = input.LA(1);

                         
                        int index73_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_101);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA73_102 = input.LA(1);

                         
                        int index73_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_102);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA73_103 = input.LA(1);

                         
                        int index73_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_103);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA73_104 = input.LA(1);

                         
                        int index73_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_104);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA73_105 = input.LA(1);

                         
                        int index73_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_105);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA73_106 = input.LA(1);

                         
                        int index73_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_106);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA73_107 = input.LA(1);

                         
                        int index73_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_107);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA73_109 = input.LA(1);

                         
                        int index73_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_109);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA73_113 = input.LA(1);

                         
                        int index73_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_113);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA73_114 = input.LA(1);

                         
                        int index73_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_114);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA73_115 = input.LA(1);

                         
                        int index73_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_115);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA73_116 = input.LA(1);

                         
                        int index73_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_116);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA73_117 = input.LA(1);

                         
                        int index73_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_117);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA73_118 = input.LA(1);

                         
                        int index73_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_118);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA73_119 = input.LA(1);

                         
                        int index73_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_119);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA73_120 = input.LA(1);

                         
                        int index73_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_120);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA73_121 = input.LA(1);

                         
                        int index73_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_121);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA73_122 = input.LA(1);

                         
                        int index73_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_122);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA73_123 = input.LA(1);

                         
                        int index73_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_123);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA73_124 = input.LA(1);

                         
                        int index73_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_124);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA73_125 = input.LA(1);

                         
                        int index73_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_125);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA73_126 = input.LA(1);

                         
                        int index73_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_126);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA73_131 = input.LA(1);

                         
                        int index73_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_131);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA73_132 = input.LA(1);

                         
                        int index73_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_132);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA73_133 = input.LA(1);

                         
                        int index73_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_133);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA73_134 = input.LA(1);

                         
                        int index73_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_134);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA73_135 = input.LA(1);

                         
                        int index73_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_135);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA73_136 = input.LA(1);

                         
                        int index73_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_136);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA73_137 = input.LA(1);

                         
                        int index73_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_137);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA73_138 = input.LA(1);

                         
                        int index73_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_138);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA73_139 = input.LA(1);

                         
                        int index73_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_139);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA73_140 = input.LA(1);

                         
                        int index73_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_140);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA73_141 = input.LA(1);

                         
                        int index73_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_141);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA73_142 = input.LA(1);

                         
                        int index73_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_142);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA73_143 = input.LA(1);

                         
                        int index73_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_143);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA73_147 = input.LA(1);

                         
                        int index73_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_147);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA73_149 = input.LA(1);

                         
                        int index73_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_149);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA73_150 = input.LA(1);

                         
                        int index73_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_150);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA73_151 = input.LA(1);

                         
                        int index73_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_151);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA73_152 = input.LA(1);

                         
                        int index73_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_152);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA73_153 = input.LA(1);

                         
                        int index73_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_153);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA73_154 = input.LA(1);

                         
                        int index73_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_154);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA73_155 = input.LA(1);

                         
                        int index73_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_155);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA73_156 = input.LA(1);

                         
                        int index73_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_156);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA73_157 = input.LA(1);

                         
                        int index73_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_157);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA73_158 = input.LA(1);

                         
                        int index73_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_158);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA73_159 = input.LA(1);

                         
                        int index73_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_159);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA73_160 = input.LA(1);

                         
                        int index73_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_160);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA73_161 = input.LA(1);

                         
                        int index73_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_161);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA73_163 = input.LA(1);

                         
                        int index73_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_163);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA73_167 = input.LA(1);

                         
                        int index73_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_167);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA73_168 = input.LA(1);

                         
                        int index73_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_168);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA73_169 = input.LA(1);

                         
                        int index73_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_169);
                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA73_170 = input.LA(1);

                         
                        int index73_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_170);
                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA73_171 = input.LA(1);

                         
                        int index73_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_171);
                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA73_172 = input.LA(1);

                         
                        int index73_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_172);
                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA73_173 = input.LA(1);

                         
                        int index73_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_173);
                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA73_174 = input.LA(1);

                         
                        int index73_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_174);
                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA73_175 = input.LA(1);

                         
                        int index73_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_175);
                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA73_176 = input.LA(1);

                         
                        int index73_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_176);
                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA73_177 = input.LA(1);

                         
                        int index73_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_177);
                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA73_178 = input.LA(1);

                         
                        int index73_178 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_178);
                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA73_179 = input.LA(1);

                         
                        int index73_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_179);
                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA73_184 = input.LA(1);

                         
                        int index73_184 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_184);
                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA73_185 = input.LA(1);

                         
                        int index73_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_185);
                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA73_186 = input.LA(1);

                         
                        int index73_186 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_186);
                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA73_187 = input.LA(1);

                         
                        int index73_187 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_187);
                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA73_188 = input.LA(1);

                         
                        int index73_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_188);
                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA73_189 = input.LA(1);

                         
                        int index73_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_189);
                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA73_190 = input.LA(1);

                         
                        int index73_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_190);
                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA73_191 = input.LA(1);

                         
                        int index73_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_191);
                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA73_192 = input.LA(1);

                         
                        int index73_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_192);
                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA73_193 = input.LA(1);

                         
                        int index73_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_193);
                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA73_194 = input.LA(1);

                         
                        int index73_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_194);
                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA73_195 = input.LA(1);

                         
                        int index73_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_195);
                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA73_196 = input.LA(1);

                         
                        int index73_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_196);
                        if ( s>=0 ) return s;
                        break;
                    case 156 : 
                        int LA73_197 = input.LA(1);

                         
                        int index73_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_197);
                        if ( s>=0 ) return s;
                        break;
                    case 157 : 
                        int LA73_202 = input.LA(1);

                         
                        int index73_202 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_202);
                        if ( s>=0 ) return s;
                        break;
                    case 158 : 
                        int LA73_203 = input.LA(1);

                         
                        int index73_203 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_203);
                        if ( s>=0 ) return s;
                        break;
                    case 159 : 
                        int LA73_204 = input.LA(1);

                         
                        int index73_204 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_204);
                        if ( s>=0 ) return s;
                        break;
                    case 160 : 
                        int LA73_205 = input.LA(1);

                         
                        int index73_205 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Formatting()) ) {s = 36;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index73_205);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\37\uffff";
    static final String DFA78_eofS =
        "\1\uffff\1\4\35\uffff";
    static final String DFA78_minS =
        "\1\23\1\4\1\23\1\0\27\uffff\4\0";
    static final String DFA78_maxS =
        "\1\121\1\130\1\121\1\0\27\uffff\4\0";
    static final String DFA78_acceptS =
        "\4\uffff\1\2\25\uffff\1\1\4\uffff";
    static final String DFA78_specialS =
        "\3\uffff\1\0\27\uffff\1\1\1\2\1\3\1\4}>";
    static final String[] DFA78_transitionS = {
            "\1\2\75\uffff\1\1",
            "\2\4\1\32\1\4\1\33\1\4\2\uffff\3\4\1\3\1\34\1\uffff\1\4\1\uffff"+
            "\4\4\1\uffff\5\4\25\uffff\4\4\31\uffff\1\4\5\uffff\3\4",
            "\1\35\75\uffff\1\36",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "440:1: nameOrFunctionCall : ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace | name );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_3 = input.LA(1);

                         
                        int index78_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Formatting()) ) {s = 26;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index78_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_27 = input.LA(1);

                         
                        int index78_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Formatting()) ) {s = 26;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index78_27);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_28 = input.LA(1);

                         
                        int index78_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Formatting()) ) {s = 26;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index78_28);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_29 = input.LA(1);

                         
                        int index78_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Formatting()) ) {s = 26;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index78_29);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_30 = input.LA(1);

                         
                        int index78_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Formatting()) ) {s = 26;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index78_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\22\uffff";
    static final String DFA77_eofS =
        "\22\uffff";
    static final String DFA77_minS =
        "\1\6\21\uffff";
    static final String DFA77_maxS =
        "\1\140\21\uffff";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA77_specialS =
        "\22\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\1\1\21\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\2\1\57\uffff\1\1\1\uffff\1\1"+
            "\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "441:22: ( expression ( Comma expression )* )?";
        }
    }
    static final String DFA79_eotS =
        "\43\uffff";
    static final String DFA79_eofS =
        "\43\uffff";
    static final String DFA79_minS =
        "\1\23\1\17\1\23\36\uffff\2\0";
    static final String DFA79_maxS =
        "\1\121\1\17\1\121\36\uffff\2\0";
    static final String DFA79_acceptS =
        "\3\uffff\1\1\33\uffff\1\2\1\3\2\uffff";
    static final String DFA79_specialS =
        "\1\uffff\1\0\37\uffff\1\1\1\2}>";
    static final String[] DFA79_transitionS = {
            "\1\2\75\uffff\1\1",
            "\1\3",
            "\1\41\75\uffff\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "445:1: name : ( staticMemberAccess | memberAccess | variable );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA79_1==ClassMember) ) {s = 3;}

                        else if ( (synpred115_Formatting()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_33 = input.LA(1);

                         
                        int index79_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Formatting()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_33);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_34 = input.LA(1);

                         
                        int index79_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Formatting()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index79_34);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA80_eotS =
        "\34\uffff";
    static final String DFA80_eofS =
        "\1\1\33\uffff";
    static final String DFA80_minS =
        "\1\4\33\uffff";
    static final String DFA80_maxS =
        "\1\132\33\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\3\30\uffff\1\1\1\2";
    static final String DFA80_specialS =
        "\34\uffff}>";
    static final String[] DFA80_transitionS = {
            "\4\1\1\32\1\1\2\uffff\3\1\1\uffff\1\33\1\uffff\1\1\1\uffff\4"+
            "\1\1\uffff\5\1\1\uffff\1\1\23\uffff\4\1\31\uffff\1\1\4\uffff"+
            "\4\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "()* loopback of 456:9: ( OpenSquareBrace expression CloseSquareBrace | '->' UnquotedString )*";
        }
    }
    static final String DFA82_eotS =
        "\31\uffff";
    static final String DFA82_eofS =
        "\31\uffff";
    static final String DFA82_minS =
        "\1\6\30\uffff";
    static final String DFA82_maxS =
        "\1\140\30\uffff";
    static final String DFA82_acceptS =
        "\1\uffff\1\1\26\uffff\1\2";
    static final String DFA82_specialS =
        "\31\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\3\1\13\uffff\5\1\35\uffff\1\30\1\1"+
            "\1\uffff\2\1\5\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "177:7: ( simpleStatement )?";
        }
    }
    static final String DFA104_eotS =
        "\22\uffff";
    static final String DFA104_eofS =
        "\22\uffff";
    static final String DFA104_minS =
        "\1\6\21\uffff";
    static final String DFA104_maxS =
        "\1\140\21\uffff";
    static final String DFA104_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA104_specialS =
        "\22\uffff}>";
    static final String[] DFA104_transitionS = {
            "\1\1\1\21\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\2\1\57\uffff\1\1\1\uffff\1\1"+
            "\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
    static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
    static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
    static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
    static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
    static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
    static final short[][] DFA104_transition;

    static {
        int numStates = DFA104_transitionS.length;
        DFA104_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
        }
    }

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = DFA104_eot;
            this.eof = DFA104_eof;
            this.min = DFA104_min;
            this.max = DFA104_max;
            this.accept = DFA104_accept;
            this.special = DFA104_special;
            this.transition = DFA104_transition;
        }
        public String getDescription() {
            return "441:22: ( expression ( Comma expression )* )?";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_prog867 = new BitSet(new long[]{0x0987E7CF454A0442L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_simpleStatement_in_statement880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_BodyString_in_statement883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_statement892 = new BitSet(new long[]{0x0987E7CF454A0C40L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_statement906 = new BitSet(new long[]{0x0987E7CF454A0C40L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_statement917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_statement931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDefinition_in_statement939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexStatement_in_statement947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_statement955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_statement957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Interface_in_interfaceDefinition975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceDefinition979 = new BitSet(new long[]{0x0200000000000400L});
    public static final BitSet FOLLOW_interfaceExtends_in_interfaceDefinition981 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_interfaceDefinition992 = new BitSet(new long[]{0x2804200000000800L,0x0000000000040000L});
    public static final BitSet FOLLOW_interfaceMember_in_interfaceDefinition1002 = new BitSet(new long[]{0x2804200000000800L,0x0000000000040000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_interfaceDefinition1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Extends_in_interfaceExtends1040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1043 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_interfaceExtends1046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1049 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Const_in_interfaceMember1067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1069 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_interfaceMember1072 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_interfaceMember1074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_interfaceMember1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_interfaceMember1097 = new BitSet(new long[]{0x0804200000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Function_in_interfaceMember1100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_interfaceMember1104 = new BitSet(new long[]{0x0000000000480080L});
    public static final BitSet FOLLOW_paramDef_in_interfaceMember1107 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_interfaceMember1110 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_paramDef_in_interfaceMember1112 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_interfaceMember1118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_interfaceMember1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classModifier_in_classDefinition1149 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_Class_in_classDefinition1161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition1165 = new BitSet(new long[]{0x0600000000000400L});
    public static final BitSet FOLLOW_Extends_in_classDefinition1177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition1181 = new BitSet(new long[]{0x0400000000000400L});
    public static final BitSet FOLLOW_classImplements_in_classDefinition1194 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_classDefinition1205 = new BitSet(new long[]{0x3804200000080800L,0x0000000000040000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition1215 = new BitSet(new long[]{0x3804200000080800L,0x0000000000040000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_classDefinition1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Implements_in_classImplements1259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements1263 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_classImplements1266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements1269 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember1289 = new BitSet(new long[]{0x0804200000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Function_in_classMember1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_classMember1296 = new BitSet(new long[]{0x0000000000480080L});
    public static final BitSet FOLLOW_paramDef_in_classMember1299 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_classMember1302 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_paramDef_in_classMember1304 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_classMember1310 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_statementBlock_in_classMember1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_classMember1345 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dollar_in_classMember1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1349 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1352 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_classMember1354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Const_in_classMember1378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1380 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1383 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_classMember1385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember1408 = new BitSet(new long[]{0x0804000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Dollar_in_classMember1412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1414 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1418 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_classMember1420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_statementBlock1456 = new BitSet(new long[]{0x0987E7CF454A0C40L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_statementBlock1458 = new BitSet(new long[]{0x0987E7CF454A0C40L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_statementBlock1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_fieldDefinition1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_fieldDefinition1482 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_fieldDefinition1485 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_fieldDefinition1487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_fieldDefinition1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Abstract_in_classModifier1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_fieldModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_complexStatement1556 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1558 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1562 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1564 = new BitSet(new long[]{0x0987E7FF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1568 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_conditional_in_complexStatement1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_complexStatement1589 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1591 = new BitSet(new long[]{0x0007C007454A0050L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_forInit_in_complexStatement1593 = new BitSet(new long[]{0x0007C007454A0050L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_forCondition_in_complexStatement1595 = new BitSet(new long[]{0x0007C007454A00C0L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_forUpdate_in_complexStatement1597 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1599 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Foreach_in_complexStatement1611 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1613 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_variable_in_complexStatement1615 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_complexStatement1617 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_arrayEntry_in_complexStatement1619 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1621 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_complexStatement1633 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1635 = new BitSet(new long[]{0x0007C007454A00C0L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1639 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1642 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Do_in_complexStatement1654 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1656 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_While_in_complexStatement1658 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1660 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1664 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_complexStatement1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Switch_in_complexStatement1678 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1680 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1682 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1684 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_complexStatement1686 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_cases_in_complexStatement1687 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_complexStatement1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_complexStatement1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_curlyBraceCheck1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Echo_in_simpleStatement1739 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_commaList_in_simpleStatement1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Global_in_simpleStatement1750 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_name_in_simpleStatement1753 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_simpleStatement1756 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_name_in_simpleStatement1759 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Static_in_simpleStatement1769 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_variable_in_simpleStatement1772 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Equals_in_simpleStatement1774 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_simpleStatement1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Break_in_simpleStatement1785 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Continue_in_simpleStatement1797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Return_in_simpleStatement1814 = new BitSet(new long[]{0x0007C007454A0042L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_simpleStatement1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RequireOperator_in_simpleStatement1826 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_simpleStatement1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_simpleStatement1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElseIf_in_conditional1855 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_conditional1857 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_conditional1861 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_conditional1863 = new BitSet(new long[]{0x0987E7FF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_conditional1867 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_conditional_in_conditional1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_conditional1880 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_conditional1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forInit1901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_forInit1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forCondition1923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_forCondition1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forUpdate1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_casestatement_in_cases1970 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_defaultcase_in_cases1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_casestatement1991 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_casestatement1994 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_casestatement1996 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_casestatement1999 = new BitSet(new long[]{0x0987E7CF454A0442L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_Default_in_defaultcase2019 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_defaultcase2022 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_defaultcase2025 = new BitSet(new long[]{0x0987E7CF454A0442L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_Function_in_functionDefinition2044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_functionDefinition2046 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_functionDefinition2048 = new BitSet(new long[]{0x0000000000480080L});
    public static final BitSet FOLLOW_paramDef_in_functionDefinition2051 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_functionDefinition2054 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_paramDef_in_functionDefinition2056 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_functionDefinition2062 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_functionDefinition2064 = new BitSet(new long[]{0x0987E7CF454A0C40L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_functionDefinition2066 = new BitSet(new long[]{0x0987E7CF454A0C40L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_functionDefinition2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_paramDef2092 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_Equals_in_paramDef2095 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_paramDef2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_paramName2117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_paramName2128 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dollar_in_paramName2130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_commaList2151 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_commaList2154 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_commaList2157 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_weakLogicalOr_in_expression2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2198 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_Or_in_weakLogicalOr2201 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2204 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2223 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_Xor_in_weakLogicalXor2226 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2229 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2252 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_And_in_weakLogicalAnd2255 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2258 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_name_in_assignment2277 = new BitSet(new long[]{0x0000000080000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_set_in_assignment2280 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_assignment_in_assignment2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternary_in_assignment2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_ternary2315 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_QuestionMark_in_ternary2317 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_ternary2319 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_ternary2321 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_ternary2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_ternary2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr2354 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LogicalOr_in_logicalOr2357 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr2360 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2379 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_LogicalAnd_in_logicalAnd2382 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2385 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2408 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_Pipe_in_bitwiseOr2411 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2414 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2433 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_Ampersand_in_bitWiseAnd2436 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2439 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2458 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_EqualityOperator_in_equalityCheck2461 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2487 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ComparisionOperator_in_comparisionCheck2490 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addition_in_bitWiseShift2512 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ShiftOperator_in_bitWiseShift2515 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_addition_in_bitWiseShift2518 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_multiplication_in_addition2541 = new BitSet(new long[]{0x0000000006200002L});
    public static final BitSet FOLLOW_set_in_addition2544 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_multiplication_in_addition2557 = new BitSet(new long[]{0x0000000006200002L});
    public static final BitSet FOLLOW_logicalNot_in_multiplication2576 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_set_in_multiplication2579 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_logicalNot_in_multiplication2592 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_Bang_in_logicalNot2611 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_logicalNot_in_logicalNot2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceOf_in_logicalNot2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negateOrCast_in_instanceOf2639 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_Instanceof_in_instanceOf2642 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_negateOrCast_in_instanceOf2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_negateOrCast2664 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_increment_in_negateOrCast2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenBrace_in_negateOrCast2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_PrimitiveType_in_negateOrCast2687 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_negateOrCast2689 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_increment_in_negateOrCast2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenBrace_in_negateOrCast2701 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_negateOrCast2704 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_negateOrCast2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_increment_in_negateOrCast2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IncrementOperator_in_increment2732 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_name_in_increment2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_increment2744 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_IncrementOperator_in_increment2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newOrClone_in_increment2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_New_in_newOrClone2773 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_newOrClone2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Clone_in_newOrClone2784 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_name_in_newOrClone2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomOrReference_in_newOrClone2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_atomOrReference2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_atomOrReference2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_arrayDeclaration2837 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_arrayDeclaration2839 = new BitSet(new long[]{0x0007C007454A00C0L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration2842 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_arrayDeclaration2845 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration2847 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_arrayDeclaration2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_arrayEntry2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayEntry2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_keyValuePair2896 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ArrayAssign_in_keyValuePair2898 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_keyValuePair2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleQuotedString_in_atom2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleQuotedString_in_atom2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HereDoc_in_atom2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_atom2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Real_in_atom2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Boolean_in_atom2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_atom2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_reference2957 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall2985 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_nameOrFunctionCall2987 = new BitSet(new long[]{0x0007C007454A00C0L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall2990 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_nameOrFunctionCall2993 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall2995 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_nameOrFunctionCall3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticMemberAccess_in_name3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_name3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_name3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_staticMemberAccess3060 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ClassMember_in_staticMemberAccess3062 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_variable_in_staticMemberAccess3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_memberAccess3082 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_OpenSquareBrace_in_memberAccess3095 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_memberAccess3098 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CloseSquareBrace_in_memberAccess3100 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_InstanceMember_in_memberAccess3113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_memberAccess3116 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_Dollar_in_variable3139 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_variable_in_variable3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_variable3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_synpred3_Formatting880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_BodyString_in_synpred3_Formatting883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_synpred26_Formatting1289 = new BitSet(new long[]{0x0804200000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Function_in_synpred26_Formatting1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_synpred26_Formatting1294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_synpred26_Formatting1296 = new BitSet(new long[]{0x0000000000480080L});
    public static final BitSet FOLLOW_paramDef_in_synpred26_Formatting1299 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_synpred26_Formatting1302 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_paramDef_in_synpred26_Formatting1304 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_synpred26_Formatting1310 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_statementBlock_in_synpred26_Formatting1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SemiColon_in_synpred26_Formatting1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred37_Formatting1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred56_Formatting1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_synpred70_Formatting2201 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_weakLogicalXor_in_synpred70_Formatting2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_synpred71_Formatting2226 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_synpred71_Formatting2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_And_in_synpred72_Formatting2255 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_assignment_in_synpred72_Formatting2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred74_Formatting2277 = new BitSet(new long[]{0x0000000080000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_set_in_synpred74_Formatting2280 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_assignment_in_synpred74_Formatting2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_synpred75_Formatting2315 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_QuestionMark_in_synpred75_Formatting2317 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_synpred75_Formatting2319 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_synpred75_Formatting2321 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_synpred75_Formatting2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred97_Formatting2744 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_IncrementOperator_in_synpred97_Formatting2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_synpred103_Formatting2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred113_Formatting2985 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_synpred113_Formatting2987 = new BitSet(new long[]{0x0007C007454A00C0L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_synpred113_Formatting2990 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_synpred113_Formatting2993 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_synpred113_Formatting2995 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_synpred113_Formatting3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_synpred115_Formatting3031 = new BitSet(new long[]{0x0000000000000002L});

}