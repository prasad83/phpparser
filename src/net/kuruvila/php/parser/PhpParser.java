// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/sidharth/Documents/code/phpparser/grammar/Php.g 2009-08-02 17:46:58

package net.kuruvila.php.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class PhpParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SemiColon", "Comma", "OpenRoundBracket", "CloseRoundBracket", "OpenSquareBracket", "CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", "ArrayAssign", "LogicalOr", "LogicalAnd", "ClassMember", "InstanceMember", "SuppressWarnings", "QuestionMark", "Dollar", "Colon", "Dot", "Ampersand", "Pipe", "Bang", "Plus", "Minus", "Asterisk", "Percent", "Forwardslash", "Tilde", "Equals", "New", "Clone", "Echo", "If", "Else", "ElseIf", "For", "Foreach", "While", "Do", "Switch", "Case", "Default", "Function", "Break", "Continue", "Return", "Global", "Static", "And", "Or", "Xor", "Instanceof", "List", "Class", "Interface", "Extends", "Implements", "Abstract", "Var", "Const", "Modifiers", "ClassDefinition", "Block", "Params", "Apply", "Member", "Reference", "Empty", "Prefix", "Postfix", "IfExpression", "Label", "Cast", "ForInit", "ForCondition", "ForUpdate", "Field", "Method", "BodyString", "UnquotedString", "AccessModifier", "Integer", "RequireOperator", "AsignmentOperator", "EqualityOperator", "ComparisionOperator", "ShiftOperator", "PrimitiveType", "IncrementOperator", "Array", "SingleQuotedString", "DoubleQuotedString", "HereDoc", "Real", "Boolean", "BodyStringRest", "BodyStringRestShortTag", "MultilineComment", "SinglelineComment", "UnixComment", "Decimal", "Hexadecimal", "Octal", "Digits", "DNum", "Exponent_DNum", "EscapeCharector", "HereDocContents", "Eol", "WhiteSpace", "'as'"
    };
    public static final int Switch=42;
    public static final int DoubleQuotedString=94;
    public static final int New=32;
    public static final int Class=56;
    public static final int Foreach=39;
    public static final int OpenSquareBracket=8;
    public static final int Static=50;
    public static final int Plus=25;
    public static final int Params=66;
    public static final int Hexadecimal=104;
    public static final int Exponent_DNum=108;
    public static final int Equals=31;
    public static final int Default=44;
    public static final int Implements=59;
    public static final int Comma=5;
    public static final int MultilineComment=100;
    public static final int Integer=84;
    public static final int HereDocContents=110;
    public static final int Colon=20;
    public static final int Var=61;
    public static final int EqualityOperator=87;
    public static final int T__113=113;
    public static final int ElseIf=37;
    public static final int Percent=28;
    public static final int Continue=47;
    public static final int QuestionMark=18;
    public static final int ForUpdate=78;
    public static final int Dollar=19;
    public static final int OpenRoundBracket=6;
    public static final int List=55;
    public static final int ClassDefinition=64;
    public static final int UnixComment=102;
    public static final int Prefix=71;
    public static final int Cast=75;
    public static final int Abstract=60;
    public static final int Label=74;
    public static final int ForInit=76;
    public static final int Asterisk=27;
    public static final int UnquotedString=82;
    public static final int Clone=33;
    public static final int Modifiers=63;
    public static final int Const=62;
    public static final int SinglelineComment=101;
    public static final int SingleQuotedString=93;
    public static final int Instanceof=54;
    public static final int Do=41;
    public static final int InstanceMember=16;
    public static final int Field=79;
    public static final int Reference=69;
    public static final int CloseSquareBracket=9;
    public static final int EscapeCharector=109;
    public static final int Ampersand=22;
    public static final int For=38;
    public static final int Octal=105;
    public static final int DNum=107;
    public static final int LogicalAnd=14;
    public static final int SemiColon=4;
    public static final int CloseRoundBracket=7;
    public static final int If=35;
    public static final int LogicalOr=13;
    public static final int Break=46;
    public static final int ArrayAssign=12;
    public static final int Array=92;
    public static final int Apply=67;
    public static final int Postfix=72;
    public static final int RequireOperator=85;
    public static final int IncrementOperator=91;
    public static final int And=51;
    public static final int Decimal=103;
    public static final int Interface=57;
    public static final int CloseCurlyBracket=11;
    public static final int BodyStringRestShortTag=99;
    public static final int PrimitiveType=90;
    public static final int ClassMember=15;
    public static final int ShiftOperator=89;
    public static final int Dot=21;
    public static final int BodyStringRest=98;
    public static final int Minus=26;
    public static final int Boolean=97;
    public static final int WhiteSpace=112;
    public static final int Extends=58;
    public static final int IfExpression=73;
    public static final int Echo=34;
    public static final int Real=96;
    public static final int Eol=111;
    public static final int AccessModifier=83;
    public static final int Or=52;
    public static final int Forwardslash=29;
    public static final int Else=36;
    public static final int BodyString=81;
    public static final int OpenCurlyBracket=10;
    public static final int SuppressWarnings=17;
    public static final int Xor=53;
    public static final int ForCondition=77;
    public static final int ComparisionOperator=88;
    public static final int Case=43;
    public static final int Function=45;
    public static final int Pipe=23;
    public static final int Global=49;
    public static final int Tilde=30;
    public static final int Block=65;
    public static final int Method=80;
    public static final int While=40;
    public static final int Bang=24;
    public static final int EOF=-1;
    public static final int Empty=70;
    public static final int AsignmentOperator=86;
    public static final int Digits=106;
    public static final int HereDoc=95;
    public static final int Member=68;
    public static final int Return=48;

    // delegates
    // delegators


        public PhpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PhpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[173+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PhpParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/sidharth/Documents/code/phpparser/grammar/Php.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:157:1: prog : ( statement )* ;
    public final PhpParser.prog_return prog() throws RecognitionException {
        PhpParser.prog_return retval = new PhpParser.prog_return();
        retval.start = input.LT(1);
        int prog_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.statement_return statement1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:157:6: ( ( statement )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:157:8: ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:157:8: ( statement )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_prog884);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:159:1: statement : ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' );
    public final PhpParser.statement_return statement() throws RecognitionException {
        PhpParser.statement_return retval = new PhpParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token BodyString3=null;
        Token char_literal4=null;
        Token char_literal6=null;
        Token char_literal12=null;
        PhpParser.simpleStatement_return simpleStatement2 = null;

        PhpParser.statement_return statement5 = null;

        PhpParser.bracketedBlock_return bracketedBlock7 = null;

        PhpParser.classDefinition_return classDefinition8 = null;

        PhpParser.interfaceDefinition_return interfaceDefinition9 = null;

        PhpParser.complexStatement_return complexStatement10 = null;

        PhpParser.simpleStatement_return simpleStatement11 = null;


        CommonTree BodyString3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBracket=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBracket");
        RewriteRuleTokenStream stream_OpenCurlyBracket=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBracket");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:160:5: ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:160:7: ( simpleStatement )? BodyString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:160:7: ( simpleStatement )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: simpleStatement
                            {
                            pushFollow(FOLLOW_simpleStatement_in_statement897);
                            simpleStatement2=simpleStatement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleStatement2.getTree());

                            }
                            break;

                    }

                    BodyString3=(Token)match(input,BodyString,FOLLOW_BodyString_in_statement900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BodyString3_tree = (CommonTree)adaptor.create(BodyString3);
                    adaptor.addChild(root_0, BodyString3_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:161:7: '{' statement '}'
                    {
                    char_literal4=(Token)match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_statement908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenCurlyBracket.add(char_literal4);

                    pushFollow(FOLLOW_statement_in_statement910);
                    statement5=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement5.getTree());
                    char_literal6=(Token)match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_statement912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseCurlyBracket.add(char_literal6);



                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 161:25: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:162:7: bracketedBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bracketedBlock_in_statement924);
                    bracketedBlock7=bracketedBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketedBlock7.getTree());

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:164:7: classDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_classDefinition_in_statement937);
                    classDefinition8=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition8.getTree());

                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:7: interfaceDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDefinition_in_statement945);
                    interfaceDefinition9=interfaceDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDefinition9.getTree());

                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:166:7: complexStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_complexStatement_in_statement953);
                    complexStatement10=complexStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, complexStatement10.getTree());

                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:167:7: simpleStatement ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_simpleStatement_in_statement961);
                    simpleStatement11=simpleStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleStatement11.getTree());
                    char_literal12=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_statement963); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class bracketedBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketedBlock"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:170:1: bracketedBlock : '{' (stmts= statement )* '}' -> ^( Block $stmts) ;
    public final PhpParser.bracketedBlock_return bracketedBlock() throws RecognitionException {
        PhpParser.bracketedBlock_return retval = new PhpParser.bracketedBlock_return();
        retval.start = input.LT(1);
        int bracketedBlock_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal13=null;
        Token char_literal14=null;
        PhpParser.statement_return stmts = null;


        CommonTree char_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBracket=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBracket");
        RewriteRuleTokenStream stream_OpenCurlyBracket=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBracket");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:171:5: ( '{' (stmts= statement )* '}' -> ^( Block $stmts) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:171:7: '{' (stmts= statement )* '}'
            {
            char_literal13=(Token)match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_bracketedBlock985); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBracket.add(char_literal13);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:171:16: (stmts= statement )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: stmts= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bracketedBlock989);
            	    stmts=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(stmts.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            char_literal14=(Token)match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_bracketedBlock992); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBracket.add(char_literal14);



            // AST REWRITE
            // elements: stmts
            // token labels: 
            // rule labels: stmts, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts",stmts!=null?stmts.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 171:32: -> ^( Block $stmts)
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:171:35: ^( Block $stmts)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Block, "Block"), root_1);

                adaptor.addChild(root_1, stream_stmts.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, bracketedBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketedBlock"

    public static class interfaceDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDefinition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:174:1: interfaceDefinition : Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBracket ( interfaceMember )* CloseCurlyBracket -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* ) ;
    public final PhpParser.interfaceDefinition_return interfaceDefinition() throws RecognitionException {
        PhpParser.interfaceDefinition_return retval = new PhpParser.interfaceDefinition_return();
        retval.start = input.LT(1);
        int interfaceDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token interfaceName=null;
        Token Interface15=null;
        Token OpenCurlyBracket17=null;
        Token CloseCurlyBracket19=null;
        PhpParser.interfaceExtends_return interfaceExtends16 = null;

        PhpParser.interfaceMember_return interfaceMember18 = null;


        CommonTree interfaceName_tree=null;
        CommonTree Interface15_tree=null;
        CommonTree OpenCurlyBracket17_tree=null;
        CommonTree CloseCurlyBracket19_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBracket=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBracket");
        RewriteRuleTokenStream stream_Interface=new RewriteRuleTokenStream(adaptor,"token Interface");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleTokenStream stream_OpenCurlyBracket=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBracket");
        RewriteRuleSubtreeStream stream_interfaceExtends=new RewriteRuleSubtreeStream(adaptor,"rule interfaceExtends");
        RewriteRuleSubtreeStream stream_interfaceMember=new RewriteRuleSubtreeStream(adaptor,"rule interfaceMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:175:5: ( Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBracket ( interfaceMember )* CloseCurlyBracket -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:175:7: Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBracket ( interfaceMember )* CloseCurlyBracket
            {
            Interface15=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDefinition1018); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Interface.add(Interface15);

            interfaceName=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceDefinition1022); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(interfaceName);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:175:46: ( interfaceExtends )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Extends) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: interfaceExtends
                    {
                    pushFollow(FOLLOW_interfaceExtends_in_interfaceDefinition1024);
                    interfaceExtends16=interfaceExtends();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interfaceExtends.add(interfaceExtends16.getTree());

                    }
                    break;

            }

            OpenCurlyBracket17=(Token)match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_interfaceDefinition1035); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBracket.add(OpenCurlyBracket17);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:177:9: ( interfaceMember )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Function||LA6_0==Static||LA6_0==Abstract||LA6_0==Const||LA6_0==AccessModifier) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: interfaceMember
            	    {
            	    pushFollow(FOLLOW_interfaceMember_in_interfaceDefinition1045);
            	    interfaceMember18=interfaceMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_interfaceMember.add(interfaceMember18.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            CloseCurlyBracket19=(Token)match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_interfaceDefinition1056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBracket.add(CloseCurlyBracket19);



            // AST REWRITE
            // elements: interfaceExtends, Interface, interfaceName, interfaceMember
            // token labels: interfaceName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_interfaceName=new RewriteRuleTokenStream(adaptor,"token interfaceName",interfaceName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 179:9: -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:179:12: ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_Interface.nextNode(), root_1);

                adaptor.addChild(root_1, stream_interfaceName.nextNode());
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:179:39: ( interfaceExtends )?
                if ( stream_interfaceExtends.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceExtends.nextTree());

                }
                stream_interfaceExtends.reset();
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:179:57: ( interfaceMember )*
                while ( stream_interfaceMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceMember.nextTree());

                }
                stream_interfaceMember.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, interfaceDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceDefinition"

    public static class interfaceExtends_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceExtends"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:182:1: interfaceExtends : Extends UnquotedString ( Comma UnquotedString )* ;
    public final PhpParser.interfaceExtends_return interfaceExtends() throws RecognitionException {
        PhpParser.interfaceExtends_return retval = new PhpParser.interfaceExtends_return();
        retval.start = input.LT(1);
        int interfaceExtends_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Extends20=null;
        Token UnquotedString21=null;
        Token Comma22=null;
        Token UnquotedString23=null;

        CommonTree Extends20_tree=null;
        CommonTree UnquotedString21_tree=null;
        CommonTree Comma22_tree=null;
        CommonTree UnquotedString23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:183:5: ( Extends UnquotedString ( Comma UnquotedString )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:183:7: Extends UnquotedString ( Comma UnquotedString )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Extends20=(Token)match(input,Extends,FOLLOW_Extends_in_interfaceExtends1096); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Extends20_tree = (CommonTree)adaptor.create(Extends20);
            root_0 = (CommonTree)adaptor.becomeRoot(Extends20_tree, root_0);
            }
            UnquotedString21=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1099); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString21_tree = (CommonTree)adaptor.create(UnquotedString21);
            adaptor.addChild(root_0, UnquotedString21_tree);
            }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:183:31: ( Comma UnquotedString )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:183:32: Comma UnquotedString
            	    {
            	    Comma22=(Token)match(input,Comma,FOLLOW_Comma_in_interfaceExtends1102); if (state.failed) return retval;
            	    UnquotedString23=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1105); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString23_tree = (CommonTree)adaptor.create(UnquotedString23);
            	    adaptor.addChild(root_0, UnquotedString23_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, interfaceExtends_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceExtends"

    public static class interfaceMember_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceMember"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:185:1: interfaceMember : ( Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* Function UnquotedString parametersDefinition ';' -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ) );
    public final PhpParser.interfaceMember_return interfaceMember() throws RecognitionException {
        PhpParser.interfaceMember_return retval = new PhpParser.interfaceMember_return();
        retval.start = input.LT(1);
        int interfaceMember_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Const24=null;
        Token UnquotedString25=null;
        Token Equals26=null;
        Token char_literal28=null;
        Token Function30=null;
        Token UnquotedString31=null;
        Token char_literal33=null;
        PhpParser.atom_return atom27 = null;

        PhpParser.fieldModifier_return fieldModifier29 = null;

        PhpParser.parametersDefinition_return parametersDefinition32 = null;


        CommonTree Const24_tree=null;
        CommonTree UnquotedString25_tree=null;
        CommonTree Equals26_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree Function30_tree=null;
        CommonTree UnquotedString31_tree=null;
        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_Const=new RewriteRuleTokenStream(adaptor,"token Const");
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleSubtreeStream stream_fieldModifier=new RewriteRuleSubtreeStream(adaptor,"rule fieldModifier");
        RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:186:5: ( Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* Function UnquotedString parametersDefinition ';' -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Const) ) {
                alt10=1;
            }
            else if ( (LA10_0==Function||LA10_0==Static||LA10_0==Abstract||LA10_0==AccessModifier) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:186:7: Const UnquotedString ( Equals atom )? ';'
                    {
                    Const24=(Token)match(input,Const,FOLLOW_Const_in_interfaceMember1123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Const.add(Const24);

                    UnquotedString25=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString25);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:186:28: ( Equals atom )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Equals) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:186:29: Equals atom
                            {
                            Equals26=(Token)match(input,Equals,FOLLOW_Equals_in_interfaceMember1128); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals26);

                            pushFollow(FOLLOW_atom_in_interfaceMember1130);
                            atom27=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom27.getTree());

                            }
                            break;

                    }

                    char_literal28=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal28);



                    // AST REWRITE
                    // elements: Const, atom, UnquotedString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 187:9: -> ^( Const UnquotedString ( atom )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:187:12: ^( Const UnquotedString ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Const.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:187:35: ( atom )?
                        if ( stream_atom.hasNext() ) {
                            adaptor.addChild(root_1, stream_atom.nextTree());

                        }
                        stream_atom.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:188:7: ( fieldModifier )* Function UnquotedString parametersDefinition ';'
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:188:7: ( fieldModifier )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Static||LA9_0==Abstract||LA9_0==AccessModifier) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_interfaceMember1162);
                    	    fieldModifier29=fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier29.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    Function30=(Token)match(input,Function,FOLLOW_Function_in_interfaceMember1165); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Function.add(Function30);

                    UnquotedString31=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString31);

                    pushFollow(FOLLOW_parametersDefinition_in_interfaceMember1169);
                    parametersDefinition32=parametersDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition32.getTree());
                    char_literal33=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal33);



                    // AST REWRITE
                    // elements: fieldModifier, UnquotedString, parametersDefinition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 189:9: -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:189:12: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Method, "Method"), root_1);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:189:21: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:189:33: ( fieldModifier )*
                        while ( stream_fieldModifier.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldModifier.nextTree());

                        }
                        stream_fieldModifier.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                        adaptor.addChild(root_1, stream_parametersDefinition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, interfaceMember_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceMember"

    public static class classDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDefinition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:192:1: classDefinition : ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBracket ( classMember )* CloseCurlyBracket -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* ) ;
    public final PhpParser.classDefinition_return classDefinition() throws RecognitionException {
        PhpParser.classDefinition_return retval = new PhpParser.classDefinition_return();
        retval.start = input.LT(1);
        int classDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token className=null;
        Token extendsclass=null;
        Token Class35=null;
        Token Extends36=null;
        Token OpenCurlyBracket38=null;
        Token CloseCurlyBracket40=null;
        PhpParser.classModifier_return classModifier34 = null;

        PhpParser.classImplements_return classImplements37 = null;

        PhpParser.classMember_return classMember39 = null;


        CommonTree className_tree=null;
        CommonTree extendsclass_tree=null;
        CommonTree Class35_tree=null;
        CommonTree Extends36_tree=null;
        CommonTree OpenCurlyBracket38_tree=null;
        CommonTree CloseCurlyBracket40_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBracket=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBracket");
        RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
        RewriteRuleTokenStream stream_Extends=new RewriteRuleTokenStream(adaptor,"token Extends");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleTokenStream stream_OpenCurlyBracket=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBracket");
        RewriteRuleSubtreeStream stream_classImplements=new RewriteRuleSubtreeStream(adaptor,"rule classImplements");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        RewriteRuleSubtreeStream stream_classModifier=new RewriteRuleSubtreeStream(adaptor,"rule classModifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:193:5: ( ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBracket ( classMember )* CloseCurlyBracket -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:193:9: ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBracket ( classMember )* CloseCurlyBracket
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:193:9: ( classModifier )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Abstract) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: classModifier
                    {
                    pushFollow(FOLLOW_classModifier_in_classDefinition1215);
                    classModifier34=classModifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classModifier.add(classModifier34.getTree());

                    }
                    break;

            }

            Class35=(Token)match(input,Class,FOLLOW_Class_in_classDefinition1227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Class.add(Class35);

            className=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1231); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(className);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:195:9: ( Extends extendsclass= UnquotedString )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Extends) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:195:10: Extends extendsclass= UnquotedString
                    {
                    Extends36=(Token)match(input,Extends,FOLLOW_Extends_in_classDefinition1243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Extends.add(Extends36);

                    extendsclass=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(extendsclass);


                    }
                    break;

            }

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:196:9: ( classImplements )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Implements) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: classImplements
                    {
                    pushFollow(FOLLOW_classImplements_in_classDefinition1260);
                    classImplements37=classImplements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classImplements.add(classImplements37.getTree());

                    }
                    break;

            }

            OpenCurlyBracket38=(Token)match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_classDefinition1271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBracket.add(OpenCurlyBracket38);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:198:9: ( classMember )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Dollar||LA14_0==Function||LA14_0==Static||(LA14_0>=Abstract && LA14_0<=Const)||LA14_0==AccessModifier) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDefinition1281);
            	    classMember39=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember39.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            CloseCurlyBracket40=(Token)match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_classDefinition1292); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBracket.add(CloseCurlyBracket40);



            // AST REWRITE
            // elements: extendsclass, Extends, classImplements, classMember, classModifier, className, Class
            // token labels: extendsclass, className
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_extendsclass=new RewriteRuleTokenStream(adaptor,"token extendsclass",extendsclass);
            RewriteRuleTokenStream stream_className=new RewriteRuleTokenStream(adaptor,"token className",className);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 200:9: -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:200:12: ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_Class.nextNode(), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:200:20: ^( Modifiers ( classModifier )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:200:32: ( classModifier )?
                if ( stream_classModifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_classModifier.nextTree());

                }
                stream_classModifier.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_className.nextNode());
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:200:59: ( ^( Extends $extendsclass) )?
                if ( stream_extendsclass.hasNext()||stream_Extends.hasNext() ) {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:200:59: ^( Extends $extendsclass)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_Extends.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_extendsclass.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_extendsclass.reset();
                stream_Extends.reset();
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:200:85: ( classImplements )?
                if ( stream_classImplements.hasNext() ) {
                    adaptor.addChild(root_1, stream_classImplements.nextTree());

                }
                stream_classImplements.reset();
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:201:13: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, classDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDefinition"

    public static class classImplements_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classImplements"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:205:1: classImplements : Implements ( UnquotedString ( Comma UnquotedString )* ) ;
    public final PhpParser.classImplements_return classImplements() throws RecognitionException {
        PhpParser.classImplements_return retval = new PhpParser.classImplements_return();
        retval.start = input.LT(1);
        int classImplements_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Implements41=null;
        Token UnquotedString42=null;
        Token Comma43=null;
        Token UnquotedString44=null;

        CommonTree Implements41_tree=null;
        CommonTree UnquotedString42_tree=null;
        CommonTree Comma43_tree=null;
        CommonTree UnquotedString44_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:206:5: ( Implements ( UnquotedString ( Comma UnquotedString )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:206:8: Implements ( UnquotedString ( Comma UnquotedString )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            Implements41=(Token)match(input,Implements,FOLLOW_Implements_in_classImplements1374); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Implements41_tree = (CommonTree)adaptor.create(Implements41);
            root_0 = (CommonTree)adaptor.becomeRoot(Implements41_tree, root_0);
            }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:206:20: ( UnquotedString ( Comma UnquotedString )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:206:21: UnquotedString ( Comma UnquotedString )*
            {
            UnquotedString42=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1378); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString42_tree = (CommonTree)adaptor.create(UnquotedString42);
            adaptor.addChild(root_0, UnquotedString42_tree);
            }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:206:36: ( Comma UnquotedString )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:206:37: Comma UnquotedString
            	    {
            	    Comma43=(Token)match(input,Comma,FOLLOW_Comma_in_classImplements1381); if (state.failed) return retval;
            	    UnquotedString44=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1384); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString44_tree = (CommonTree)adaptor.create(UnquotedString44);
            	    adaptor.addChild(root_0, UnquotedString44_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, classImplements_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classImplements"

    public static class classMember_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:209:1: classMember : ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? ) | Var Dollar UnquotedString ( Equals atom )? ';' -> ^( Var ^( Dollar UnquotedString ) ( atom )? ) | Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) );
    public final PhpParser.classMember_return classMember() throws RecognitionException {
        PhpParser.classMember_return retval = new PhpParser.classMember_return();
        retval.start = input.LT(1);
        int classMember_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Function46=null;
        Token UnquotedString47=null;
        Token char_literal50=null;
        Token Var51=null;
        Token Dollar52=null;
        Token UnquotedString53=null;
        Token Equals54=null;
        Token char_literal56=null;
        Token Const57=null;
        Token UnquotedString58=null;
        Token Equals59=null;
        Token char_literal61=null;
        Token Dollar63=null;
        Token UnquotedString64=null;
        Token Equals65=null;
        Token char_literal67=null;
        PhpParser.fieldModifier_return fieldModifier45 = null;

        PhpParser.parametersDefinition_return parametersDefinition48 = null;

        PhpParser.bracketedBlock_return bracketedBlock49 = null;

        PhpParser.atom_return atom55 = null;

        PhpParser.atom_return atom60 = null;

        PhpParser.fieldModifier_return fieldModifier62 = null;

        PhpParser.atom_return atom66 = null;


        CommonTree Function46_tree=null;
        CommonTree UnquotedString47_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree Var51_tree=null;
        CommonTree Dollar52_tree=null;
        CommonTree UnquotedString53_tree=null;
        CommonTree Equals54_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree Const57_tree=null;
        CommonTree UnquotedString58_tree=null;
        CommonTree Equals59_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree Dollar63_tree=null;
        CommonTree UnquotedString64_tree=null;
        CommonTree Equals65_tree=null;
        CommonTree char_literal67_tree=null;
        RewriteRuleTokenStream stream_Const=new RewriteRuleTokenStream(adaptor,"token Const");
        RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_Var=new RewriteRuleTokenStream(adaptor,"token Var");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleSubtreeStream stream_fieldModifier=new RewriteRuleSubtreeStream(adaptor,"rule fieldModifier");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");
        RewriteRuleSubtreeStream stream_bracketedBlock=new RewriteRuleSubtreeStream(adaptor,"rule bracketedBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:210:5: ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? ) | Var Dollar UnquotedString ( Equals atom )? ';' -> ^( Var ^( Dollar UnquotedString ) ( atom )? ) | Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case Static:
            case Abstract:
            case AccessModifier:
                {
                switch ( input.LA(2) ) {
                case Function:
                    {
                    alt22=1;
                    }
                    break;
                case Static:
                case Abstract:
                case AccessModifier:
                    {
                    int LA22_7 = input.LA(3);

                    if ( (synpred23_Php()) ) {
                        alt22=1;
                    }
                    else if ( (true) ) {
                        alt22=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case Dollar:
                    {
                    alt22=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

                }
                break;
            case Function:
                {
                alt22=1;
                }
                break;
            case Var:
                {
                alt22=2;
                }
                break;
            case Const:
                {
                alt22=3;
                }
                break;
            case Dollar:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:210:7: ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' )
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:210:7: ( fieldModifier )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Static||LA16_0==Abstract||LA16_0==AccessModifier) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_classMember1404);
                    	    fieldModifier45=fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    Function46=(Token)match(input,Function,FOLLOW_Function_in_classMember1407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Function.add(Function46);

                    UnquotedString47=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString47);

                    pushFollow(FOLLOW_parametersDefinition_in_classMember1411);
                    parametersDefinition48=parametersDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition48.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:211:9: ( bracketedBlock | ';' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==OpenCurlyBracket) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==SemiColon) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:211:10: bracketedBlock
                            {
                            pushFollow(FOLLOW_bracketedBlock_in_classMember1423);
                            bracketedBlock49=bracketedBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracketedBlock.add(bracketedBlock49.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:211:27: ';'
                            {
                            char_literal50=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1427); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal50);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: parametersDefinition, UnquotedString, bracketedBlock, fieldModifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:9: -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:212:12: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Method, "Method"), root_1);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:212:21: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:212:33: ( fieldModifier )*
                        while ( stream_fieldModifier.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldModifier.nextTree());

                        }
                        stream_fieldModifier.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                        adaptor.addChild(root_1, stream_parametersDefinition.nextTree());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:212:85: ( bracketedBlock )?
                        if ( stream_bracketedBlock.hasNext() ) {
                            adaptor.addChild(root_1, stream_bracketedBlock.nextTree());

                        }
                        stream_bracketedBlock.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:213:7: Var Dollar UnquotedString ( Equals atom )? ';'
                    {
                    Var51=(Token)match(input,Var,FOLLOW_Var_in_classMember1464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Var.add(Var51);

                    Dollar52=(Token)match(input,Dollar,FOLLOW_Dollar_in_classMember1466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar52);

                    UnquotedString53=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString53);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:213:33: ( Equals atom )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==Equals) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:213:34: Equals atom
                            {
                            Equals54=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1471); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals54);

                            pushFollow(FOLLOW_atom_in_classMember1473);
                            atom55=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom55.getTree());

                            }
                            break;

                    }

                    char_literal56=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal56);



                    // AST REWRITE
                    // elements: Dollar, Var, atom, UnquotedString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:9: -> ^( Var ^( Dollar UnquotedString ) ( atom )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:214:12: ^( Var ^( Dollar UnquotedString ) ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Var.nextNode(), root_1);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:214:18: ^( Dollar UnquotedString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_UnquotedString.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:214:43: ( atom )?
                        if ( stream_atom.hasNext() ) {
                            adaptor.addChild(root_1, stream_atom.nextTree());

                        }
                        stream_atom.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:215:7: Const UnquotedString ( Equals atom )? ';'
                    {
                    Const57=(Token)match(input,Const,FOLLOW_Const_in_classMember1510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Const.add(Const57);

                    UnquotedString58=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString58);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:215:28: ( Equals atom )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Equals) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:215:29: Equals atom
                            {
                            Equals59=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1515); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals59);

                            pushFollow(FOLLOW_atom_in_classMember1517);
                            atom60=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom60.getTree());

                            }
                            break;

                    }

                    char_literal61=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal61);



                    // AST REWRITE
                    // elements: Const, atom, UnquotedString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 216:9: -> ^( Const UnquotedString ( atom )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:216:12: ^( Const UnquotedString ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Const.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:216:35: ( atom )?
                        if ( stream_atom.hasNext() ) {
                            adaptor.addChild(root_1, stream_atom.nextTree());

                        }
                        stream_atom.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:217:7: ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';'
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:217:7: ( fieldModifier )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Static||LA20_0==Abstract||LA20_0==AccessModifier) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_classMember1549);
                    	    fieldModifier62=fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:217:22: ( Dollar UnquotedString )
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:217:23: Dollar UnquotedString
                    {
                    Dollar63=(Token)match(input,Dollar,FOLLOW_Dollar_in_classMember1553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar63);

                    UnquotedString64=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString64);


                    }

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:217:46: ( Equals atom )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Equals) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:217:47: Equals atom
                            {
                            Equals65=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1559); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals65);

                            pushFollow(FOLLOW_atom_in_classMember1561);
                            atom66=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom66.getTree());

                            }
                            break;

                    }

                    char_literal67=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1565); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal67);



                    // AST REWRITE
                    // elements: fieldModifier, atom, UnquotedString, Dollar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 218:9: -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:218:12: ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Field, "Field"), root_1);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:218:20: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:218:32: ( fieldModifier )*
                        while ( stream_fieldModifier.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldModifier.nextTree());

                        }
                        stream_fieldModifier.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:218:48: ^( Dollar UnquotedString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_UnquotedString.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:218:73: ( atom )?
                        if ( stream_atom.hasNext() ) {
                            adaptor.addChild(root_1, stream_atom.nextTree());

                        }
                        stream_atom.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, classMember_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class fieldDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDefinition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:221:1: fieldDefinition : Dollar UnquotedString ( Equals atom )? ';' -> ^( Field ^( Dollar UnquotedString ) ( atom )? ) ;
    public final PhpParser.fieldDefinition_return fieldDefinition() throws RecognitionException {
        PhpParser.fieldDefinition_return retval = new PhpParser.fieldDefinition_return();
        retval.start = input.LT(1);
        int fieldDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Dollar68=null;
        Token UnquotedString69=null;
        Token Equals70=null;
        Token char_literal72=null;
        PhpParser.atom_return atom71 = null;


        CommonTree Dollar68_tree=null;
        CommonTree UnquotedString69_tree=null;
        CommonTree Equals70_tree=null;
        CommonTree char_literal72_tree=null;
        RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:222:5: ( Dollar UnquotedString ( Equals atom )? ';' -> ^( Field ^( Dollar UnquotedString ) ( atom )? ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:222:7: Dollar UnquotedString ( Equals atom )? ';'
            {
            Dollar68=(Token)match(input,Dollar,FOLLOW_Dollar_in_fieldDefinition1613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Dollar.add(Dollar68);

            UnquotedString69=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_fieldDefinition1615); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString69);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:222:29: ( Equals atom )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Equals) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:222:30: Equals atom
                    {
                    Equals70=(Token)match(input,Equals,FOLLOW_Equals_in_fieldDefinition1618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Equals.add(Equals70);

                    pushFollow(FOLLOW_atom_in_fieldDefinition1620);
                    atom71=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom71.getTree());

                    }
                    break;

            }

            char_literal72=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_fieldDefinition1624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal72);



            // AST REWRITE
            // elements: UnquotedString, Dollar, atom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 222:47: -> ^( Field ^( Dollar UnquotedString ) ( atom )? )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:222:50: ^( Field ^( Dollar UnquotedString ) ( atom )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Field, "Field"), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:222:58: ^( Dollar UnquotedString )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);

                adaptor.addChild(root_2, stream_UnquotedString.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:222:83: ( atom )?
                if ( stream_atom.hasNext() ) {
                    adaptor.addChild(root_1, stream_atom.nextTree());

                }
                stream_atom.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, fieldDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldDefinition"

    public static class classModifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classModifier"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:225:1: classModifier : 'abstract' ;
    public final PhpParser.classModifier_return classModifier() throws RecognitionException {
        PhpParser.classModifier_return retval = new PhpParser.classModifier_return();
        retval.start = input.LT(1);
        int classModifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token string_literal73=null;

        CommonTree string_literal73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:226:5: ( 'abstract' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:226:7: 'abstract'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal73=(Token)match(input,Abstract,FOLLOW_Abstract_in_classModifier1659); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal73_tree = (CommonTree)adaptor.create(string_literal73);
            adaptor.addChild(root_0, string_literal73_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, classModifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classModifier"

    public static class fieldModifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldModifier"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:228:1: fieldModifier : ( AccessModifier | 'abstract' | 'static' );
    public final PhpParser.fieldModifier_return fieldModifier() throws RecognitionException {
        PhpParser.fieldModifier_return retval = new PhpParser.fieldModifier_return();
        retval.start = input.LT(1);
        int fieldModifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set74=null;

        CommonTree set74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:229:5: ( AccessModifier | 'abstract' | 'static' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set74=(Token)input.LT(1);
            if ( input.LA(1)==Static||input.LA(1)==Abstract||input.LA(1)==AccessModifier ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set74));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, fieldModifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldModifier"

    public static class complexStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "complexStatement"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:233:1: complexStatement : ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( 'if' expression $ifTrue ( conditional )? ) | For '(' forInit forCondition forUpdate ')' statement -> ^( For forInit forCondition forUpdate statement ) | Foreach '(' variable 'as' arrayEntry ')' statement -> ^( Foreach variable arrayEntry statement ) | While '(' (whileCondition= expression )? ')' statement -> ^( While $whileCondition statement ) | Do statement While '(' doCondition= expression ')' ';' -> ^( Do statement $doCondition) | Switch '(' expression ')' '{' cases '}' -> ^( Switch expression cases ) | functionDefinition );
    public final PhpParser.complexStatement_return complexStatement() throws RecognitionException {
        PhpParser.complexStatement_return retval = new PhpParser.complexStatement_return();
        retval.start = input.LT(1);
        int complexStatement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token If75=null;
        Token char_literal76=null;
        Token char_literal77=null;
        Token For79=null;
        Token char_literal80=null;
        Token char_literal84=null;
        Token Foreach86=null;
        Token char_literal87=null;
        Token string_literal89=null;
        Token char_literal91=null;
        Token While93=null;
        Token char_literal94=null;
        Token char_literal95=null;
        Token Do97=null;
        Token While99=null;
        Token char_literal100=null;
        Token char_literal101=null;
        Token char_literal102=null;
        Token Switch103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        PhpParser.expression_return ifCondition = null;

        PhpParser.statement_return ifTrue = null;

        PhpParser.expression_return whileCondition = null;

        PhpParser.expression_return doCondition = null;

        PhpParser.conditional_return conditional78 = null;

        PhpParser.forInit_return forInit81 = null;

        PhpParser.forCondition_return forCondition82 = null;

        PhpParser.forUpdate_return forUpdate83 = null;

        PhpParser.statement_return statement85 = null;

        PhpParser.variable_return variable88 = null;

        PhpParser.arrayEntry_return arrayEntry90 = null;

        PhpParser.statement_return statement92 = null;

        PhpParser.statement_return statement96 = null;

        PhpParser.statement_return statement98 = null;

        PhpParser.expression_return expression105 = null;

        PhpParser.cases_return cases108 = null;

        PhpParser.functionDefinition_return functionDefinition110 = null;


        CommonTree If75_tree=null;
        CommonTree char_literal76_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree For79_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree Foreach86_tree=null;
        CommonTree char_literal87_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree While93_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree char_literal95_tree=null;
        CommonTree Do97_tree=null;
        CommonTree While99_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree char_literal101_tree=null;
        CommonTree char_literal102_tree=null;
        CommonTree Switch103_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree char_literal106_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBracket=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBracket");
        RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
        RewriteRuleTokenStream stream_Foreach=new RewriteRuleTokenStream(adaptor,"token Foreach");
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleTokenStream stream_OpenCurlyBracket=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBracket");
        RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
        RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_cases=new RewriteRuleSubtreeStream(adaptor,"rule cases");
        RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forCondition=new RewriteRuleSubtreeStream(adaptor,"rule forCondition");
        RewriteRuleSubtreeStream stream_forUpdate=new RewriteRuleSubtreeStream(adaptor,"rule forUpdate");
        RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arrayEntry=new RewriteRuleSubtreeStream(adaptor,"rule arrayEntry");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:234:5: ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( 'if' expression $ifTrue ( conditional )? ) | For '(' forInit forCondition forUpdate ')' statement -> ^( For forInit forCondition forUpdate statement ) | Foreach '(' variable 'as' arrayEntry ')' statement -> ^( Foreach variable arrayEntry statement ) | While '(' (whileCondition= expression )? ')' statement -> ^( While $whileCondition statement ) | Do statement While '(' doCondition= expression ')' ';' -> ^( Do statement $doCondition) | Switch '(' expression ')' '{' cases '}' -> ^( Switch expression cases ) | functionDefinition )
            int alt26=7;
            switch ( input.LA(1) ) {
            case If:
                {
                alt26=1;
                }
                break;
            case For:
                {
                alt26=2;
                }
                break;
            case Foreach:
                {
                alt26=3;
                }
                break;
            case While:
                {
                alt26=4;
                }
                break;
            case Do:
                {
                alt26=5;
                }
                break;
            case Switch:
                {
                alt26=6;
                }
                break;
            case Function:
                {
                alt26=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:234:7: If '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
                    {
                    If75=(Token)match(input,If,FOLLOW_If_in_complexStatement1702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_If.add(If75);

                    char_literal76=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1704); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal76);

                    pushFollow(FOLLOW_expression_in_complexStatement1708);
                    ifCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifCondition.getTree());
                    char_literal77=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal77);

                    pushFollow(FOLLOW_statement_in_complexStatement1714);
                    ifTrue=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(ifTrue.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:234:58: ( conditional )?
                    int alt24=2;
                    alt24 = dfa24.predict(input);
                    switch (alt24) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: conditional
                            {
                            pushFollow(FOLLOW_conditional_in_complexStatement1716);
                            conditional78=conditional();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_conditional.add(conditional78.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: conditional, If, ifTrue, expression
                    // token labels: 
                    // rule labels: retval, ifTrue
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ifTrue=new RewriteRuleSubtreeStream(adaptor,"rule ifTrue",ifTrue!=null?ifTrue.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 235:9: -> ^( 'if' expression $ifTrue ( conditional )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:235:12: ^( 'if' expression $ifTrue ( conditional )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(If, "If"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_ifTrue.nextTree());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:235:38: ( conditional )?
                        if ( stream_conditional.hasNext() ) {
                            adaptor.addChild(root_1, stream_conditional.nextTree());

                        }
                        stream_conditional.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:236:7: For '(' forInit forCondition forUpdate ')' statement
                    {
                    For79=(Token)match(input,For,FOLLOW_For_in_complexStatement1747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_For.add(For79);

                    char_literal80=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal80);

                    pushFollow(FOLLOW_forInit_in_complexStatement1751);
                    forInit81=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forInit.add(forInit81.getTree());
                    pushFollow(FOLLOW_forCondition_in_complexStatement1753);
                    forCondition82=forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forCondition.add(forCondition82.getTree());
                    pushFollow(FOLLOW_forUpdate_in_complexStatement1755);
                    forUpdate83=forUpdate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate83.getTree());
                    char_literal84=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal84);

                    pushFollow(FOLLOW_statement_in_complexStatement1759);
                    statement85=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement85.getTree());


                    // AST REWRITE
                    // elements: forInit, For, forUpdate, statement, forCondition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 236:60: -> ^( For forInit forCondition forUpdate statement )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:236:63: ^( For forInit forCondition forUpdate statement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_For.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_forInit.nextTree());
                        adaptor.addChild(root_1, stream_forCondition.nextTree());
                        adaptor.addChild(root_1, stream_forUpdate.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:237:7: Foreach '(' variable 'as' arrayEntry ')' statement
                    {
                    Foreach86=(Token)match(input,Foreach,FOLLOW_Foreach_in_complexStatement1781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Foreach.add(Foreach86);

                    char_literal87=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal87);

                    pushFollow(FOLLOW_variable_in_complexStatement1785);
                    variable88=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable.add(variable88.getTree());
                    string_literal89=(Token)match(input,113,FOLLOW_113_in_complexStatement1787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_113.add(string_literal89);

                    pushFollow(FOLLOW_arrayEntry_in_complexStatement1789);
                    arrayEntry90=arrayEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry90.getTree());
                    char_literal91=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal91);

                    pushFollow(FOLLOW_statement_in_complexStatement1793);
                    statement92=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement92.getTree());


                    // AST REWRITE
                    // elements: Foreach, statement, arrayEntry, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 237:58: -> ^( Foreach variable arrayEntry statement )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:237:61: ^( Foreach variable arrayEntry statement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Foreach.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());
                        adaptor.addChild(root_1, stream_arrayEntry.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:238:7: While '(' (whileCondition= expression )? ')' statement
                    {
                    While93=(Token)match(input,While,FOLLOW_While_in_complexStatement1813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_While.add(While93);

                    char_literal94=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal94);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:238:31: (whileCondition= expression )?
                    int alt25=2;
                    alt25 = dfa25.predict(input);
                    switch (alt25) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: whileCondition= expression
                            {
                            pushFollow(FOLLOW_expression_in_complexStatement1819);
                            whileCondition=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(whileCondition.getTree());

                            }
                            break;

                    }

                    char_literal95=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal95);

                    pushFollow(FOLLOW_statement_in_complexStatement1824);
                    statement96=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement96.getTree());


                    // AST REWRITE
                    // elements: While, whileCondition, statement
                    // token labels: 
                    // rule labels: retval, whileCondition
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_whileCondition=new RewriteRuleSubtreeStream(adaptor,"rule whileCondition",whileCondition!=null?whileCondition.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 238:58: -> ^( While $whileCondition statement )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:238:61: ^( While $whileCondition statement )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_While.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_whileCondition.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:239:7: Do statement While '(' doCondition= expression ')' ';'
                    {
                    Do97=(Token)match(input,Do,FOLLOW_Do_in_complexStatement1843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Do.add(Do97);

                    pushFollow(FOLLOW_statement_in_complexStatement1845);
                    statement98=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement98.getTree());
                    While99=(Token)match(input,While,FOLLOW_While_in_complexStatement1847); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_While.add(While99);

                    char_literal100=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1849); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal100);

                    pushFollow(FOLLOW_expression_in_complexStatement1853);
                    doCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(doCondition.getTree());
                    char_literal101=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal101);

                    char_literal102=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_complexStatement1857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal102);



                    // AST REWRITE
                    // elements: doCondition, statement, Do
                    // token labels: 
                    // rule labels: doCondition, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_doCondition=new RewriteRuleSubtreeStream(adaptor,"rule doCondition",doCondition!=null?doCondition.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 239:61: -> ^( Do statement $doCondition)
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:239:64: ^( Do statement $doCondition)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Do.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());
                        adaptor.addChild(root_1, stream_doCondition.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:240:7: Switch '(' expression ')' '{' cases '}'
                    {
                    Switch103=(Token)match(input,Switch,FOLLOW_Switch_in_complexStatement1876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Switch.add(Switch103);

                    char_literal104=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal104);

                    pushFollow(FOLLOW_expression_in_complexStatement1880);
                    expression105=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression105.getTree());
                    char_literal106=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal106);

                    char_literal107=(Token)match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_complexStatement1884); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenCurlyBracket.add(char_literal107);

                    pushFollow(FOLLOW_cases_in_complexStatement1885);
                    cases108=cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cases.add(cases108.getTree());
                    char_literal109=(Token)match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_complexStatement1886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseCurlyBracket.add(char_literal109);



                    // AST REWRITE
                    // elements: expression, Switch, cases
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 240:45: -> ^( Switch expression cases )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:240:48: ^( Switch expression cases )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Switch.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_cases.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:241:7: functionDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_functionDefinition_in_complexStatement1904);
                    functionDefinition110=functionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDefinition110.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, complexStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "complexStatement"

    public static class simpleStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleStatement"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:244:1: simpleStatement : ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression );
    public final PhpParser.simpleStatement_return simpleStatement() throws RecognitionException {
        PhpParser.simpleStatement_return retval = new PhpParser.simpleStatement_return();
        retval.start = input.LT(1);
        int simpleStatement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Echo111=null;
        Token Global113=null;
        Token char_literal115=null;
        Token Static117=null;
        Token Equals119=null;
        Token Break121=null;
        Token Integer122=null;
        Token Continue123=null;
        Token Integer124=null;
        Token Return125=null;
        Token RequireOperator127=null;
        PhpParser.commaList_return commaList112 = null;

        PhpParser.name_return name114 = null;

        PhpParser.name_return name116 = null;

        PhpParser.variable_return variable118 = null;

        PhpParser.atom_return atom120 = null;

        PhpParser.expression_return expression126 = null;

        PhpParser.expression_return expression128 = null;

        PhpParser.expression_return expression129 = null;


        CommonTree Echo111_tree=null;
        CommonTree Global113_tree=null;
        CommonTree char_literal115_tree=null;
        CommonTree Static117_tree=null;
        CommonTree Equals119_tree=null;
        CommonTree Break121_tree=null;
        CommonTree Integer122_tree=null;
        CommonTree Continue123_tree=null;
        CommonTree Integer124_tree=null;
        CommonTree Return125_tree=null;
        CommonTree RequireOperator127_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:245:5: ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression )
            int alt31=8;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:245:7: Echo commaList
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Echo111=(Token)match(input,Echo,FOLLOW_Echo_in_simpleStatement1921); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Echo111_tree = (CommonTree)adaptor.create(Echo111);
                    root_0 = (CommonTree)adaptor.becomeRoot(Echo111_tree, root_0);
                    }
                    pushFollow(FOLLOW_commaList_in_simpleStatement1924);
                    commaList112=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, commaList112.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:246:7: Global name ( ',' name )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Global113=(Token)match(input,Global,FOLLOW_Global_in_simpleStatement1932); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Global113_tree = (CommonTree)adaptor.create(Global113);
                    root_0 = (CommonTree)adaptor.becomeRoot(Global113_tree, root_0);
                    }
                    pushFollow(FOLLOW_name_in_simpleStatement1935);
                    name114=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name114.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:246:20: ( ',' name )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:246:21: ',' name
                    	    {
                    	    char_literal115=(Token)match(input,Comma,FOLLOW_Comma_in_simpleStatement1938); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_name_in_simpleStatement1941);
                    	    name116=name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name116.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:247:7: Static variable Equals atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Static117=(Token)match(input,Static,FOLLOW_Static_in_simpleStatement1951); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Static117_tree = (CommonTree)adaptor.create(Static117);
                    root_0 = (CommonTree)adaptor.becomeRoot(Static117_tree, root_0);
                    }
                    pushFollow(FOLLOW_variable_in_simpleStatement1954);
                    variable118=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable118.getTree());
                    Equals119=(Token)match(input,Equals,FOLLOW_Equals_in_simpleStatement1956); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_simpleStatement1959);
                    atom120=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom120.getTree());

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:248:7: Break ( Integer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Break121=(Token)match(input,Break,FOLLOW_Break_in_simpleStatement1967); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Break121_tree = (CommonTree)adaptor.create(Break121);
                    root_0 = (CommonTree)adaptor.becomeRoot(Break121_tree, root_0);
                    }
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:248:14: ( Integer )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==Integer) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: Integer
                            {
                            Integer122=(Token)match(input,Integer,FOLLOW_Integer_in_simpleStatement1970); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Integer122_tree = (CommonTree)adaptor.create(Integer122);
                            adaptor.addChild(root_0, Integer122_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:249:7: Continue ( Integer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Continue123=(Token)match(input,Continue,FOLLOW_Continue_in_simpleStatement1979); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Continue123_tree = (CommonTree)adaptor.create(Continue123);
                    root_0 = (CommonTree)adaptor.becomeRoot(Continue123_tree, root_0);
                    }
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:249:17: ( Integer )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==Integer) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: Integer
                            {
                            Integer124=(Token)match(input,Integer,FOLLOW_Integer_in_simpleStatement1982); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Integer124_tree = (CommonTree)adaptor.create(Integer124);
                            adaptor.addChild(root_0, Integer124_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:251:7: Return ( expression )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Return125=(Token)match(input,Return,FOLLOW_Return_in_simpleStatement1996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Return125_tree = (CommonTree)adaptor.create(Return125);
                    root_0 = (CommonTree)adaptor.becomeRoot(Return125_tree, root_0);
                    }
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:251:15: ( expression )?
                    int alt30=2;
                    alt30 = dfa30.predict(input);
                    switch (alt30) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_simpleStatement1999);
                            expression126=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression126.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:252:7: RequireOperator expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RequireOperator127=(Token)match(input,RequireOperator,FOLLOW_RequireOperator_in_simpleStatement2008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RequireOperator127_tree = (CommonTree)adaptor.create(RequireOperator127);
                    root_0 = (CommonTree)adaptor.becomeRoot(RequireOperator127_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_simpleStatement2011);
                    expression128=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression128.getTree());

                    }
                    break;
                case 8 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:253:7: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_simpleStatement2019);
                    expression129=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression129.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, simpleStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleStatement"

    public static class conditional_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:257:1: conditional : ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( If $ifCondition $ifTrue ( conditional )? ) | Else statement -> statement );
    public final PhpParser.conditional_return conditional() throws RecognitionException {
        PhpParser.conditional_return retval = new PhpParser.conditional_return();
        retval.start = input.LT(1);
        int conditional_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ElseIf130=null;
        Token char_literal131=null;
        Token char_literal132=null;
        Token Else134=null;
        PhpParser.expression_return ifCondition = null;

        PhpParser.statement_return ifTrue = null;

        PhpParser.conditional_return conditional133 = null;

        PhpParser.statement_return statement135 = null;


        CommonTree ElseIf130_tree=null;
        CommonTree char_literal131_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree Else134_tree=null;
        RewriteRuleTokenStream stream_ElseIf=new RewriteRuleTokenStream(adaptor,"token ElseIf");
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:258:5: ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( If $ifCondition $ifTrue ( conditional )? ) | Else statement -> statement )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ElseIf) ) {
                alt33=1;
            }
            else if ( (LA33_0==Else) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:258:7: ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
                    {
                    ElseIf130=(Token)match(input,ElseIf,FOLLOW_ElseIf_in_conditional2037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ElseIf.add(ElseIf130);

                    char_literal131=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_conditional2039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal131);

                    pushFollow(FOLLOW_expression_in_conditional2043);
                    ifCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifCondition.getTree());
                    char_literal132=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_conditional2045); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal132);

                    pushFollow(FOLLOW_statement_in_conditional2049);
                    ifTrue=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(ifTrue.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:258:62: ( conditional )?
                    int alt32=2;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: conditional
                            {
                            pushFollow(FOLLOW_conditional_in_conditional2051);
                            conditional133=conditional();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_conditional.add(conditional133.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ifTrue, conditional, ifCondition
                    // token labels: 
                    // rule labels: ifCondition, retval, ifTrue
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ifCondition=new RewriteRuleSubtreeStream(adaptor,"rule ifCondition",ifCondition!=null?ifCondition.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ifTrue=new RewriteRuleSubtreeStream(adaptor,"rule ifTrue",ifTrue!=null?ifTrue.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 258:75: -> ^( If $ifCondition $ifTrue ( conditional )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:258:78: ^( If $ifCondition $ifTrue ( conditional )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(If, "If"), root_1);

                        adaptor.addChild(root_1, stream_ifCondition.nextTree());
                        adaptor.addChild(root_1, stream_ifTrue.nextTree());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:258:104: ( conditional )?
                        if ( stream_conditional.hasNext() ) {
                            adaptor.addChild(root_1, stream_conditional.nextTree());

                        }
                        stream_conditional.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:259:7: Else statement
                    {
                    Else134=(Token)match(input,Else,FOLLOW_Else_in_conditional2075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Else.add(Else134);

                    pushFollow(FOLLOW_statement_in_conditional2077);
                    statement135=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement135.getTree());


                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 259:22: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, conditional_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditional"

    public static class forInit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:262:1: forInit : ( commaList )? ';' -> ^( ForInit ( commaList )? ) ;
    public final PhpParser.forInit_return forInit() throws RecognitionException {
        PhpParser.forInit_return retval = new PhpParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal137=null;
        PhpParser.commaList_return commaList136 = null;


        CommonTree char_literal137_tree=null;
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:263:5: ( ( commaList )? ';' -> ^( ForInit ( commaList )? ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:263:7: ( commaList )? ';'
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:263:7: ( commaList )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forInit2098);
                    commaList136=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList136.getTree());

                    }
                    break;

            }

            char_literal137=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_forInit2101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal137);



            // AST REWRITE
            // elements: commaList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 263:22: -> ^( ForInit ( commaList )? )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:263:25: ^( ForInit ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForInit, "ForInit"), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:263:35: ( commaList )?
                if ( stream_commaList.hasNext() ) {
                    adaptor.addChild(root_1, stream_commaList.nextTree());

                }
                stream_commaList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forCondition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:266:1: forCondition : ( commaList )? ';' -> ^( ForCondition ( commaList )? ) ;
    public final PhpParser.forCondition_return forCondition() throws RecognitionException {
        PhpParser.forCondition_return retval = new PhpParser.forCondition_return();
        retval.start = input.LT(1);
        int forCondition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal139=null;
        PhpParser.commaList_return commaList138 = null;


        CommonTree char_literal139_tree=null;
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:5: ( ( commaList )? ';' -> ^( ForCondition ( commaList )? ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:7: ( commaList )? ';'
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:7: ( commaList )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forCondition2127);
                    commaList138=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList138.getTree());

                    }
                    break;

            }

            char_literal139=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_forCondition2130); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal139);



            // AST REWRITE
            // elements: commaList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 267:22: -> ^( ForCondition ( commaList )? )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:25: ^( ForCondition ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForCondition, "ForCondition"), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:40: ( commaList )?
                if ( stream_commaList.hasNext() ) {
                    adaptor.addChild(root_1, stream_commaList.nextTree());

                }
                stream_commaList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, forCondition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forCondition"

    public static class forUpdate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forUpdate"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:270:1: forUpdate : ( commaList )? -> ^( ForUpdate ( commaList )? ) ;
    public final PhpParser.forUpdate_return forUpdate() throws RecognitionException {
        PhpParser.forUpdate_return retval = new PhpParser.forUpdate_return();
        retval.start = input.LT(1);
        int forUpdate_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.commaList_return commaList140 = null;


        RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:271:5: ( ( commaList )? -> ^( ForUpdate ( commaList )? ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:271:7: ( commaList )?
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:271:7: ( commaList )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forUpdate2160);
                    commaList140=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList140.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: commaList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 271:18: -> ^( ForUpdate ( commaList )? )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:271:21: ^( ForUpdate ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForUpdate, "ForUpdate"), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:271:33: ( commaList )?
                if ( stream_commaList.hasNext() ) {
                    adaptor.addChild(root_1, stream_commaList.nextTree());

                }
                stream_commaList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, forUpdate_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forUpdate"

    public static class cases_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cases"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:274:1: cases : ( casestatement )* defaultcase ;
    public final PhpParser.cases_return cases() throws RecognitionException {
        PhpParser.cases_return retval = new PhpParser.cases_return();
        retval.start = input.LT(1);
        int cases_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.casestatement_return casestatement141 = null;

        PhpParser.defaultcase_return defaultcase142 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:275:5: ( ( casestatement )* defaultcase )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:275:7: ( casestatement )* defaultcase
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:275:7: ( casestatement )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Case) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: casestatement
            	    {
            	    pushFollow(FOLLOW_casestatement_in_cases2188);
            	    casestatement141=casestatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, casestatement141.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            pushFollow(FOLLOW_defaultcase_in_cases2192);
            defaultcase142=defaultcase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultcase142.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, cases_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cases"

    public static class casestatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "casestatement"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:278:1: casestatement : Case expression ':' ( statement )* ;
    public final PhpParser.casestatement_return casestatement() throws RecognitionException {
        PhpParser.casestatement_return retval = new PhpParser.casestatement_return();
        retval.start = input.LT(1);
        int casestatement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Case143=null;
        Token char_literal145=null;
        PhpParser.expression_return expression144 = null;

        PhpParser.statement_return statement146 = null;


        CommonTree Case143_tree=null;
        CommonTree char_literal145_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:279:5: ( Case expression ':' ( statement )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:279:7: Case expression ':' ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Case143=(Token)match(input,Case,FOLLOW_Case_in_casestatement2209); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Case143_tree = (CommonTree)adaptor.create(Case143);
            root_0 = (CommonTree)adaptor.becomeRoot(Case143_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_casestatement2212);
            expression144=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression144.getTree());
            char_literal145=(Token)match(input,Colon,FOLLOW_Colon_in_casestatement2214); if (state.failed) return retval;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:279:29: ( statement )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestatement2217);
            	    statement146=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement146.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, casestatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "casestatement"

    public static class defaultcase_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultcase"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:282:1: defaultcase : ( Default ':' ( statement )* ) ;
    public final PhpParser.defaultcase_return defaultcase() throws RecognitionException {
        PhpParser.defaultcase_return retval = new PhpParser.defaultcase_return();
        retval.start = input.LT(1);
        int defaultcase_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Default147=null;
        Token char_literal148=null;
        PhpParser.statement_return statement149 = null;


        CommonTree Default147_tree=null;
        CommonTree char_literal148_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:283:5: ( ( Default ':' ( statement )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:283:7: ( Default ':' ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:283:7: ( Default ':' ( statement )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:283:8: Default ':' ( statement )*
            {
            Default147=(Token)match(input,Default,FOLLOW_Default_in_defaultcase2237); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Default147_tree = (CommonTree)adaptor.create(Default147);
            root_0 = (CommonTree)adaptor.becomeRoot(Default147_tree, root_0);
            }
            char_literal148=(Token)match(input,Colon,FOLLOW_Colon_in_defaultcase2240); if (state.failed) return retval;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:283:22: ( statement )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultcase2243);
            	    statement149=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement149.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, defaultcase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultcase"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDefinition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:286:1: functionDefinition : Function UnquotedString parametersDefinition bracketedBlock -> ^( Function UnquotedString parametersDefinition bracketedBlock ) ;
    public final PhpParser.functionDefinition_return functionDefinition() throws RecognitionException {
        PhpParser.functionDefinition_return retval = new PhpParser.functionDefinition_return();
        retval.start = input.LT(1);
        int functionDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Function150=null;
        Token UnquotedString151=null;
        PhpParser.parametersDefinition_return parametersDefinition152 = null;

        PhpParser.bracketedBlock_return bracketedBlock153 = null;


        CommonTree Function150_tree=null;
        CommonTree UnquotedString151_tree=null;
        RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");
        RewriteRuleSubtreeStream stream_bracketedBlock=new RewriteRuleSubtreeStream(adaptor,"rule bracketedBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:287:5: ( Function UnquotedString parametersDefinition bracketedBlock -> ^( Function UnquotedString parametersDefinition bracketedBlock ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:287:7: Function UnquotedString parametersDefinition bracketedBlock
            {
            Function150=(Token)match(input,Function,FOLLOW_Function_in_functionDefinition2262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Function.add(Function150);

            UnquotedString151=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_functionDefinition2264); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString151);

            pushFollow(FOLLOW_parametersDefinition_in_functionDefinition2266);
            parametersDefinition152=parametersDefinition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition152.getTree());
            pushFollow(FOLLOW_bracketedBlock_in_functionDefinition2268);
            bracketedBlock153=bracketedBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketedBlock.add(bracketedBlock153.getTree());


            // AST REWRITE
            // elements: UnquotedString, bracketedBlock, parametersDefinition, Function
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 287:67: -> ^( Function UnquotedString parametersDefinition bracketedBlock )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:288:9: ^( Function UnquotedString parametersDefinition bracketedBlock )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_Function.nextNode(), root_1);

                adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                adaptor.addChild(root_1, stream_parametersDefinition.nextTree());
                adaptor.addChild(root_1, stream_bracketedBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, functionDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class parametersDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametersDefinition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:291:1: parametersDefinition : OpenRoundBracket ( paramDef ( Comma paramDef )* )? CloseRoundBracket -> ^( Params ( paramDef )* ) ;
    public final PhpParser.parametersDefinition_return parametersDefinition() throws RecognitionException {
        PhpParser.parametersDefinition_return retval = new PhpParser.parametersDefinition_return();
        retval.start = input.LT(1);
        int parametersDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OpenRoundBracket154=null;
        Token Comma156=null;
        Token CloseRoundBracket158=null;
        PhpParser.paramDef_return paramDef155 = null;

        PhpParser.paramDef_return paramDef157 = null;


        CommonTree OpenRoundBracket154_tree=null;
        CommonTree Comma156_tree=null;
        CommonTree CloseRoundBracket158_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleSubtreeStream stream_paramDef=new RewriteRuleSubtreeStream(adaptor,"rule paramDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:5: ( OpenRoundBracket ( paramDef ( Comma paramDef )* )? CloseRoundBracket -> ^( Params ( paramDef )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:7: OpenRoundBracket ( paramDef ( Comma paramDef )* )? CloseRoundBracket
            {
            OpenRoundBracket154=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_parametersDefinition2306); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenRoundBracket.add(OpenRoundBracket154);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:24: ( paramDef ( Comma paramDef )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Dollar||LA41_0==Ampersand) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:25: paramDef ( Comma paramDef )*
                    {
                    pushFollow(FOLLOW_paramDef_in_parametersDefinition2309);
                    paramDef155=paramDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramDef.add(paramDef155.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:34: ( Comma paramDef )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==Comma) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:35: Comma paramDef
                    	    {
                    	    Comma156=(Token)match(input,Comma,FOLLOW_Comma_in_parametersDefinition2312); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Comma.add(Comma156);

                    	    pushFollow(FOLLOW_paramDef_in_parametersDefinition2314);
                    	    paramDef157=paramDef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_paramDef.add(paramDef157.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            CloseRoundBracket158=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_parametersDefinition2320); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseRoundBracket.add(CloseRoundBracket158);



            // AST REWRITE
            // elements: paramDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 292:72: -> ^( Params ( paramDef )* )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:75: ^( Params ( paramDef )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Params, "Params"), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:84: ( paramDef )*
                while ( stream_paramDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramDef.nextTree());

                }
                stream_paramDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parametersDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parametersDefinition"

    public static class paramDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramDef"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:295:1: paramDef : paramName ( Equals atom )? ;
    public final PhpParser.paramDef_return paramDef() throws RecognitionException {
        PhpParser.paramDef_return retval = new PhpParser.paramDef_return();
        retval.start = input.LT(1);
        int paramDef_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Equals160=null;
        PhpParser.paramName_return paramName159 = null;

        PhpParser.atom_return atom161 = null;


        CommonTree Equals160_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:296:5: ( paramName ( Equals atom )? )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:296:7: paramName ( Equals atom )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_paramName_in_paramDef2347);
            paramName159=paramName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramName159.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:296:17: ( Equals atom )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Equals) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:296:18: Equals atom
                    {
                    Equals160=(Token)match(input,Equals,FOLLOW_Equals_in_paramDef2350); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Equals160_tree = (CommonTree)adaptor.create(Equals160);
                    root_0 = (CommonTree)adaptor.becomeRoot(Equals160_tree, root_0);
                    }
                    pushFollow(FOLLOW_atom_in_paramDef2353);
                    atom161=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom161.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, paramDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "paramDef"

    public static class paramName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramName"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:299:1: paramName : ( Dollar UnquotedString | Ampersand Dollar UnquotedString -> ^( Ampersand ^( Dollar UnquotedString ) ) );
    public final PhpParser.paramName_return paramName() throws RecognitionException {
        PhpParser.paramName_return retval = new PhpParser.paramName_return();
        retval.start = input.LT(1);
        int paramName_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Dollar162=null;
        Token UnquotedString163=null;
        Token Ampersand164=null;
        Token Dollar165=null;
        Token UnquotedString166=null;

        CommonTree Dollar162_tree=null;
        CommonTree UnquotedString163_tree=null;
        CommonTree Ampersand164_tree=null;
        CommonTree Dollar165_tree=null;
        CommonTree UnquotedString166_tree=null;
        RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
        RewriteRuleTokenStream stream_Ampersand=new RewriteRuleTokenStream(adaptor,"token Ampersand");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:300:5: ( Dollar UnquotedString | Ampersand Dollar UnquotedString -> ^( Ampersand ^( Dollar UnquotedString ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Dollar) ) {
                alt43=1;
            }
            else if ( (LA43_0==Ampersand) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:300:7: Dollar UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Dollar162=(Token)match(input,Dollar,FOLLOW_Dollar_in_paramName2372); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar162_tree = (CommonTree)adaptor.create(Dollar162);
                    root_0 = (CommonTree)adaptor.becomeRoot(Dollar162_tree, root_0);
                    }
                    UnquotedString163=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString163_tree = (CommonTree)adaptor.create(UnquotedString163);
                    adaptor.addChild(root_0, UnquotedString163_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:7: Ampersand Dollar UnquotedString
                    {
                    Ampersand164=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_paramName2383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Ampersand.add(Ampersand164);

                    Dollar165=(Token)match(input,Dollar,FOLLOW_Dollar_in_paramName2385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar165);

                    UnquotedString166=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString166);



                    // AST REWRITE
                    // elements: UnquotedString, Ampersand, Dollar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 301:39: -> ^( Ampersand ^( Dollar UnquotedString ) )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:42: ^( Ampersand ^( Dollar UnquotedString ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Ampersand.nextNode(), root_1);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:54: ^( Dollar UnquotedString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_UnquotedString.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, paramName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "paramName"

    public static class commaList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commaList"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:304:1: commaList : expression ( ',' expression )* ;
    public final PhpParser.commaList_return commaList() throws RecognitionException {
        PhpParser.commaList_return retval = new PhpParser.commaList_return();
        retval.start = input.LT(1);
        int commaList_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal168=null;
        PhpParser.expression_return expression167 = null;

        PhpParser.expression_return expression169 = null;


        CommonTree char_literal168_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:305:5: ( expression ( ',' expression )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:305:7: expression ( ',' expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_commaList2416);
            expression167=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression167.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:305:18: ( ',' expression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Comma) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:305:19: ',' expression
            	    {
            	    char_literal168=(Token)match(input,Comma,FOLLOW_Comma_in_commaList2419); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_commaList2422);
            	    expression169=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression169.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, commaList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "commaList"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:308:1: expression : weakLogicalOr ;
    public final PhpParser.expression_return expression() throws RecognitionException {
        PhpParser.expression_return retval = new PhpParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.weakLogicalOr_return weakLogicalOr170 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:309:5: ( weakLogicalOr )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:309:7: weakLogicalOr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_weakLogicalOr_in_expression2446);
            weakLogicalOr170=weakLogicalOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalOr170.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class weakLogicalOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "weakLogicalOr"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:312:1: weakLogicalOr : weakLogicalXor ( Or weakLogicalXor )* ;
    public final PhpParser.weakLogicalOr_return weakLogicalOr() throws RecognitionException {
        PhpParser.weakLogicalOr_return retval = new PhpParser.weakLogicalOr_return();
        retval.start = input.LT(1);
        int weakLogicalOr_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Or172=null;
        PhpParser.weakLogicalXor_return weakLogicalXor171 = null;

        PhpParser.weakLogicalXor_return weakLogicalXor173 = null;


        CommonTree Or172_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:313:5: ( weakLogicalXor ( Or weakLogicalXor )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:313:7: weakLogicalXor ( Or weakLogicalXor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2463);
            weakLogicalXor171=weakLogicalXor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalXor171.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:313:22: ( Or weakLogicalXor )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:313:23: Or weakLogicalXor
            	    {
            	    Or172=(Token)match(input,Or,FOLLOW_Or_in_weakLogicalOr2466); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Or172_tree = (CommonTree)adaptor.create(Or172);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Or172_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2469);
            	    weakLogicalXor173=weakLogicalXor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalXor173.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, weakLogicalOr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "weakLogicalOr"

    public static class weakLogicalXor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "weakLogicalXor"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:316:1: weakLogicalXor : weakLogicalAnd ( Xor weakLogicalAnd )* ;
    public final PhpParser.weakLogicalXor_return weakLogicalXor() throws RecognitionException {
        PhpParser.weakLogicalXor_return retval = new PhpParser.weakLogicalXor_return();
        retval.start = input.LT(1);
        int weakLogicalXor_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Xor175=null;
        PhpParser.weakLogicalAnd_return weakLogicalAnd174 = null;

        PhpParser.weakLogicalAnd_return weakLogicalAnd176 = null;


        CommonTree Xor175_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:317:5: ( weakLogicalAnd ( Xor weakLogicalAnd )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:317:7: weakLogicalAnd ( Xor weakLogicalAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2488);
            weakLogicalAnd174=weakLogicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd174.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:317:22: ( Xor weakLogicalAnd )*
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:317:23: Xor weakLogicalAnd
            	    {
            	    Xor175=(Token)match(input,Xor,FOLLOW_Xor_in_weakLogicalXor2491); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Xor175_tree = (CommonTree)adaptor.create(Xor175);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Xor175_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2494);
            	    weakLogicalAnd176=weakLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd176.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, weakLogicalXor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "weakLogicalXor"

    public static class weakLogicalAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "weakLogicalAnd"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:320:1: weakLogicalAnd : assignment ( And assignment )* ;
    public final PhpParser.weakLogicalAnd_return weakLogicalAnd() throws RecognitionException {
        PhpParser.weakLogicalAnd_return retval = new PhpParser.weakLogicalAnd_return();
        retval.start = input.LT(1);
        int weakLogicalAnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token And178=null;
        PhpParser.assignment_return assignment177 = null;

        PhpParser.assignment_return assignment179 = null;


        CommonTree And178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:321:5: ( assignment ( And assignment )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:321:7: assignment ( And assignment )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_in_weakLogicalAnd2517);
            assignment177=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment177.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:321:18: ( And assignment )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:321:19: And assignment
            	    {
            	    And178=(Token)match(input,And,FOLLOW_And_in_weakLogicalAnd2520); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    And178_tree = (CommonTree)adaptor.create(And178);
            	    root_0 = (CommonTree)adaptor.becomeRoot(And178_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_assignment_in_weakLogicalAnd2523);
            	    assignment179=assignment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment179.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, weakLogicalAnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "weakLogicalAnd"

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:324:1: assignment : ( listVariables ( ( Equals | AsignmentOperator ) assignment ) | ternary );
    public final PhpParser.assignment_return assignment() throws RecognitionException {
        PhpParser.assignment_return retval = new PhpParser.assignment_return();
        retval.start = input.LT(1);
        int assignment_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set181=null;
        PhpParser.listVariables_return listVariables180 = null;

        PhpParser.assignment_return assignment182 = null;

        PhpParser.ternary_return ternary183 = null;


        CommonTree set181_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:325:5: ( listVariables ( ( Equals | AsignmentOperator ) assignment ) | ternary )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:325:7: listVariables ( ( Equals | AsignmentOperator ) assignment )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_listVariables_in_assignment2542);
                    listVariables180=listVariables();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, listVariables180.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:325:21: ( ( Equals | AsignmentOperator ) assignment )
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:325:22: ( Equals | AsignmentOperator ) assignment
                    {
                    set181=(Token)input.LT(1);
                    set181=(Token)input.LT(1);
                    if ( input.LA(1)==Equals||input.LA(1)==AsignmentOperator ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set181), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_assignment_in_assignment2554);
                    assignment182=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment182.getTree());

                    }


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:326:7: ternary
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ternary_in_assignment2564);
                    ternary183=ternary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary183.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, assignment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class listVariables_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listVariables"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:329:1: listVariables : ( List OpenRoundBracket name ( ',' name )* CloseRoundBracket | name );
    public final PhpParser.listVariables_return listVariables() throws RecognitionException {
        PhpParser.listVariables_return retval = new PhpParser.listVariables_return();
        retval.start = input.LT(1);
        int listVariables_StartIndex = input.index();
        CommonTree root_0 = null;

        Token List184=null;
        Token OpenRoundBracket185=null;
        Token char_literal187=null;
        Token CloseRoundBracket189=null;
        PhpParser.name_return name186 = null;

        PhpParser.name_return name188 = null;

        PhpParser.name_return name190 = null;


        CommonTree List184_tree=null;
        CommonTree OpenRoundBracket185_tree=null;
        CommonTree char_literal187_tree=null;
        CommonTree CloseRoundBracket189_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:330:2: ( List OpenRoundBracket name ( ',' name )* CloseRoundBracket | name )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==List) ) {
                alt50=1;
            }
            else if ( (LA50_0==Dollar||LA50_0==UnquotedString) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:330:4: List OpenRoundBracket name ( ',' name )* CloseRoundBracket
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    List184=(Token)match(input,List,FOLLOW_List_in_listVariables2578); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    List184_tree = (CommonTree)adaptor.create(List184);
                    root_0 = (CommonTree)adaptor.becomeRoot(List184_tree, root_0);
                    }
                    OpenRoundBracket185=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_listVariables2581); if (state.failed) return retval;
                    pushFollow(FOLLOW_name_in_listVariables2584);
                    name186=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name186.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:330:33: ( ',' name )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==Comma) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:330:34: ',' name
                    	    {
                    	    char_literal187=(Token)match(input,Comma,FOLLOW_Comma_in_listVariables2587); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_name_in_listVariables2590);
                    	    name188=name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name188.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    CloseRoundBracket189=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_listVariables2594); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:331:7: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_listVariables2604);
                    name190=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name190.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, listVariables_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listVariables"

    public static class ternary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternary"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:334:1: ternary : ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr );
    public final PhpParser.ternary_return ternary() throws RecognitionException {
        PhpParser.ternary_return retval = new PhpParser.ternary_return();
        retval.start = input.LT(1);
        int ternary_StartIndex = input.index();
        CommonTree root_0 = null;

        Token QuestionMark192=null;
        Token Colon194=null;
        PhpParser.logicalOr_return logicalOr191 = null;

        PhpParser.expression_return expression193 = null;

        PhpParser.expression_return expression195 = null;

        PhpParser.logicalOr_return logicalOr196 = null;


        CommonTree QuestionMark192_tree=null;
        CommonTree Colon194_tree=null;
        RewriteRuleTokenStream stream_QuestionMark=new RewriteRuleTokenStream(adaptor,"token QuestionMark");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleSubtreeStream stream_logicalOr=new RewriteRuleSubtreeStream(adaptor,"rule logicalOr");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:335:5: ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:335:7: logicalOr QuestionMark expression Colon expression
                    {
                    pushFollow(FOLLOW_logicalOr_in_ternary2621);
                    logicalOr191=logicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalOr.add(logicalOr191.getTree());
                    QuestionMark192=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QuestionMark.add(QuestionMark192);

                    pushFollow(FOLLOW_expression_in_ternary2625);
                    expression193=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression193.getTree());
                    Colon194=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Colon.add(Colon194);

                    pushFollow(FOLLOW_expression_in_ternary2629);
                    expression195=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression195.getTree());


                    // AST REWRITE
                    // elements: logicalOr, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 335:58: -> ^( IfExpression logicalOr ( expression )* )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:335:61: ^( IfExpression logicalOr ( expression )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IfExpression, "IfExpression"), root_1);

                        adaptor.addChild(root_1, stream_logicalOr.nextTree());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:335:86: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:336:7: logicalOr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_logicalOr_in_ternary2648);
                    logicalOr196=logicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalOr196.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, ternary_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternary"

    public static class logicalOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalOr"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:339:1: logicalOr : logicalAnd ( LogicalOr logicalAnd )* ;
    public final PhpParser.logicalOr_return logicalOr() throws RecognitionException {
        PhpParser.logicalOr_return retval = new PhpParser.logicalOr_return();
        retval.start = input.LT(1);
        int logicalOr_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LogicalOr198=null;
        PhpParser.logicalAnd_return logicalAnd197 = null;

        PhpParser.logicalAnd_return logicalAnd199 = null;


        CommonTree LogicalOr198_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:340:5: ( logicalAnd ( LogicalOr logicalAnd )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:340:7: logicalAnd ( LogicalOr logicalAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalAnd_in_logicalOr2669);
            logicalAnd197=logicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd197.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:340:18: ( LogicalOr logicalAnd )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:340:19: LogicalOr logicalAnd
            	    {
            	    LogicalOr198=(Token)match(input,LogicalOr,FOLLOW_LogicalOr_in_logicalOr2672); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LogicalOr198_tree = (CommonTree)adaptor.create(LogicalOr198);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LogicalOr198_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicalAnd_in_logicalOr2675);
            	    logicalAnd199=logicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd199.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, logicalOr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalOr"

    public static class logicalAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalAnd"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:343:1: logicalAnd : bitwiseOr ( LogicalAnd bitwiseOr )* ;
    public final PhpParser.logicalAnd_return logicalAnd() throws RecognitionException {
        PhpParser.logicalAnd_return retval = new PhpParser.logicalAnd_return();
        retval.start = input.LT(1);
        int logicalAnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LogicalAnd201=null;
        PhpParser.bitwiseOr_return bitwiseOr200 = null;

        PhpParser.bitwiseOr_return bitwiseOr202 = null;


        CommonTree LogicalAnd201_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:344:5: ( bitwiseOr ( LogicalAnd bitwiseOr )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:344:7: bitwiseOr ( LogicalAnd bitwiseOr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2694);
            bitwiseOr200=bitwiseOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr200.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:344:17: ( LogicalAnd bitwiseOr )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:344:18: LogicalAnd bitwiseOr
            	    {
            	    LogicalAnd201=(Token)match(input,LogicalAnd,FOLLOW_LogicalAnd_in_logicalAnd2697); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LogicalAnd201_tree = (CommonTree)adaptor.create(LogicalAnd201);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LogicalAnd201_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2700);
            	    bitwiseOr202=bitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr202.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, logicalAnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalAnd"

    public static class bitwiseOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseOr"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:347:1: bitwiseOr : bitWiseAnd ( Pipe bitWiseAnd )* ;
    public final PhpParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
        PhpParser.bitwiseOr_return retval = new PhpParser.bitwiseOr_return();
        retval.start = input.LT(1);
        int bitwiseOr_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Pipe204=null;
        PhpParser.bitWiseAnd_return bitWiseAnd203 = null;

        PhpParser.bitWiseAnd_return bitWiseAnd205 = null;


        CommonTree Pipe204_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:348:5: ( bitWiseAnd ( Pipe bitWiseAnd )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:348:7: bitWiseAnd ( Pipe bitWiseAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2723);
            bitWiseAnd203=bitWiseAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseAnd203.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:348:18: ( Pipe bitWiseAnd )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:348:19: Pipe bitWiseAnd
            	    {
            	    Pipe204=(Token)match(input,Pipe,FOLLOW_Pipe_in_bitwiseOr2726); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Pipe204_tree = (CommonTree)adaptor.create(Pipe204);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Pipe204_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2729);
            	    bitWiseAnd205=bitWiseAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseAnd205.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, bitwiseOr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitwiseOr"

    public static class bitWiseAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitWiseAnd"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:351:1: bitWiseAnd : equalityCheck ( Ampersand equalityCheck )* ;
    public final PhpParser.bitWiseAnd_return bitWiseAnd() throws RecognitionException {
        PhpParser.bitWiseAnd_return retval = new PhpParser.bitWiseAnd_return();
        retval.start = input.LT(1);
        int bitWiseAnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Ampersand207=null;
        PhpParser.equalityCheck_return equalityCheck206 = null;

        PhpParser.equalityCheck_return equalityCheck208 = null;


        CommonTree Ampersand207_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:352:5: ( equalityCheck ( Ampersand equalityCheck )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:352:7: equalityCheck ( Ampersand equalityCheck )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2748);
            equalityCheck206=equalityCheck();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCheck206.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:352:21: ( Ampersand equalityCheck )*
            loop55:
            do {
                int alt55=2;
                alt55 = dfa55.predict(input);
                switch (alt55) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:352:22: Ampersand equalityCheck
            	    {
            	    Ampersand207=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_bitWiseAnd2751); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Ampersand207_tree = (CommonTree)adaptor.create(Ampersand207);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Ampersand207_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2754);
            	    equalityCheck208=equalityCheck();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCheck208.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, bitWiseAnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitWiseAnd"

    public static class equalityCheck_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityCheck"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:355:1: equalityCheck : comparisionCheck ( EqualityOperator comparisionCheck )? ;
    public final PhpParser.equalityCheck_return equalityCheck() throws RecognitionException {
        PhpParser.equalityCheck_return retval = new PhpParser.equalityCheck_return();
        retval.start = input.LT(1);
        int equalityCheck_StartIndex = input.index();
        CommonTree root_0 = null;

        Token EqualityOperator210=null;
        PhpParser.comparisionCheck_return comparisionCheck209 = null;

        PhpParser.comparisionCheck_return comparisionCheck211 = null;


        CommonTree EqualityOperator210_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:356:5: ( comparisionCheck ( EqualityOperator comparisionCheck )? )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:356:7: comparisionCheck ( EqualityOperator comparisionCheck )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2773);
            comparisionCheck209=comparisionCheck();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, comparisionCheck209.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:356:24: ( EqualityOperator comparisionCheck )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:356:25: EqualityOperator comparisionCheck
                    {
                    EqualityOperator210=(Token)match(input,EqualityOperator,FOLLOW_EqualityOperator_in_equalityCheck2776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EqualityOperator210_tree = (CommonTree)adaptor.create(EqualityOperator210);
                    root_0 = (CommonTree)adaptor.becomeRoot(EqualityOperator210_tree, root_0);
                    }
                    pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2779);
                    comparisionCheck211=comparisionCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comparisionCheck211.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, equalityCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityCheck"

    public static class comparisionCheck_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparisionCheck"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:359:1: comparisionCheck : bitWiseShift ( ComparisionOperator bitWiseShift )? ;
    public final PhpParser.comparisionCheck_return comparisionCheck() throws RecognitionException {
        PhpParser.comparisionCheck_return retval = new PhpParser.comparisionCheck_return();
        retval.start = input.LT(1);
        int comparisionCheck_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ComparisionOperator213=null;
        PhpParser.bitWiseShift_return bitWiseShift212 = null;

        PhpParser.bitWiseShift_return bitWiseShift214 = null;


        CommonTree ComparisionOperator213_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:360:5: ( bitWiseShift ( ComparisionOperator bitWiseShift )? )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:360:7: bitWiseShift ( ComparisionOperator bitWiseShift )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2802);
            bitWiseShift212=bitWiseShift();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseShift212.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:360:20: ( ComparisionOperator bitWiseShift )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:360:21: ComparisionOperator bitWiseShift
                    {
                    ComparisionOperator213=(Token)match(input,ComparisionOperator,FOLLOW_ComparisionOperator_in_comparisionCheck2805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ComparisionOperator213_tree = (CommonTree)adaptor.create(ComparisionOperator213);
                    root_0 = (CommonTree)adaptor.becomeRoot(ComparisionOperator213_tree, root_0);
                    }
                    pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2808);
                    bitWiseShift214=bitWiseShift();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseShift214.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, comparisionCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "comparisionCheck"

    public static class bitWiseShift_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitWiseShift"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:363:1: bitWiseShift : addition ( ShiftOperator addition )* ;
    public final PhpParser.bitWiseShift_return bitWiseShift() throws RecognitionException {
        PhpParser.bitWiseShift_return retval = new PhpParser.bitWiseShift_return();
        retval.start = input.LT(1);
        int bitWiseShift_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ShiftOperator216=null;
        PhpParser.addition_return addition215 = null;

        PhpParser.addition_return addition217 = null;


        CommonTree ShiftOperator216_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:364:5: ( addition ( ShiftOperator addition )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:364:7: addition ( ShiftOperator addition )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_addition_in_bitWiseShift2827);
            addition215=addition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addition215.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:364:16: ( ShiftOperator addition )*
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:364:17: ShiftOperator addition
            	    {
            	    ShiftOperator216=(Token)match(input,ShiftOperator,FOLLOW_ShiftOperator_in_bitWiseShift2830); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ShiftOperator216_tree = (CommonTree)adaptor.create(ShiftOperator216);
            	    root_0 = (CommonTree)adaptor.becomeRoot(ShiftOperator216_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addition_in_bitWiseShift2833);
            	    addition217=addition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addition217.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, bitWiseShift_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitWiseShift"

    public static class addition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:367:1: addition : multiplication ( ( Plus | Minus | Dot ) multiplication )* ;
    public final PhpParser.addition_return addition() throws RecognitionException {
        PhpParser.addition_return retval = new PhpParser.addition_return();
        retval.start = input.LT(1);
        int addition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set219=null;
        PhpParser.multiplication_return multiplication218 = null;

        PhpParser.multiplication_return multiplication220 = null;


        CommonTree set219_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:368:5: ( multiplication ( ( Plus | Minus | Dot ) multiplication )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:368:7: multiplication ( ( Plus | Minus | Dot ) multiplication )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplication_in_addition2856);
            multiplication218=multiplication();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplication218.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:368:22: ( ( Plus | Minus | Dot ) multiplication )*
            loop59:
            do {
                int alt59=2;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:368:23: ( Plus | Minus | Dot ) multiplication
            	    {
            	    set219=(Token)input.LT(1);
            	    set219=(Token)input.LT(1);
            	    if ( input.LA(1)==Dot||(input.LA(1)>=Plus && input.LA(1)<=Minus) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set219), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplication_in_addition2872);
            	    multiplication220=multiplication();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplication220.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, addition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addition"

    public static class multiplication_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplication"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:371:1: multiplication : logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )* ;
    public final PhpParser.multiplication_return multiplication() throws RecognitionException {
        PhpParser.multiplication_return retval = new PhpParser.multiplication_return();
        retval.start = input.LT(1);
        int multiplication_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set222=null;
        PhpParser.logicalNot_return logicalNot221 = null;

        PhpParser.logicalNot_return logicalNot223 = null;


        CommonTree set222_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:372:5: ( logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:372:7: logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalNot_in_multiplication2891);
            logicalNot221=logicalNot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot221.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:372:18: ( ( Asterisk | Forwardslash | Percent ) logicalNot )*
            loop60:
            do {
                int alt60=2;
                alt60 = dfa60.predict(input);
                switch (alt60) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:372:19: ( Asterisk | Forwardslash | Percent ) logicalNot
            	    {
            	    set222=(Token)input.LT(1);
            	    set222=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Asterisk && input.LA(1)<=Forwardslash) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set222), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_logicalNot_in_multiplication2907);
            	    logicalNot223=logicalNot();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot223.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, multiplication_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplication"

    public static class logicalNot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalNot"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:375:1: logicalNot : ( Bang logicalNot | instanceOf );
    public final PhpParser.logicalNot_return logicalNot() throws RecognitionException {
        PhpParser.logicalNot_return retval = new PhpParser.logicalNot_return();
        retval.start = input.LT(1);
        int logicalNot_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Bang224=null;
        PhpParser.logicalNot_return logicalNot225 = null;

        PhpParser.instanceOf_return instanceOf226 = null;


        CommonTree Bang224_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:376:5: ( Bang logicalNot | instanceOf )
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:376:7: Bang logicalNot
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Bang224=(Token)match(input,Bang,FOLLOW_Bang_in_logicalNot2926); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Bang224_tree = (CommonTree)adaptor.create(Bang224);
                    root_0 = (CommonTree)adaptor.becomeRoot(Bang224_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalNot_in_logicalNot2929);
                    logicalNot225=logicalNot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot225.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:377:7: instanceOf
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceOf_in_logicalNot2937);
                    instanceOf226=instanceOf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf226.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, logicalNot_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalNot"

    public static class instanceOf_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceOf"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:380:1: instanceOf : negateOrCast ( Instanceof negateOrCast )? ;
    public final PhpParser.instanceOf_return instanceOf() throws RecognitionException {
        PhpParser.instanceOf_return retval = new PhpParser.instanceOf_return();
        retval.start = input.LT(1);
        int instanceOf_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Instanceof228=null;
        PhpParser.negateOrCast_return negateOrCast227 = null;

        PhpParser.negateOrCast_return negateOrCast229 = null;


        CommonTree Instanceof228_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:381:5: ( negateOrCast ( Instanceof negateOrCast )? )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:381:7: negateOrCast ( Instanceof negateOrCast )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_negateOrCast_in_instanceOf2954);
            negateOrCast227=negateOrCast();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, negateOrCast227.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:381:20: ( Instanceof negateOrCast )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:381:21: Instanceof negateOrCast
                    {
                    Instanceof228=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2957); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Instanceof228_tree = (CommonTree)adaptor.create(Instanceof228);
                    root_0 = (CommonTree)adaptor.becomeRoot(Instanceof228_tree, root_0);
                    }
                    pushFollow(FOLLOW_negateOrCast_in_instanceOf2960);
                    negateOrCast229=negateOrCast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, negateOrCast229.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, instanceOf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "instanceOf"

    public static class negateOrCast_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negateOrCast"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:384:1: negateOrCast : ( ( Tilde | Minus | SuppressWarnings ) increment | OpenRoundBracket PrimitiveType CloseRoundBracket increment -> ^( Cast PrimitiveType increment ) | OpenRoundBracket weakLogicalAnd CloseRoundBracket | increment );
    public final PhpParser.negateOrCast_return negateOrCast() throws RecognitionException {
        PhpParser.negateOrCast_return retval = new PhpParser.negateOrCast_return();
        retval.start = input.LT(1);
        int negateOrCast_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set230=null;
        Token OpenRoundBracket232=null;
        Token PrimitiveType233=null;
        Token CloseRoundBracket234=null;
        Token OpenRoundBracket236=null;
        Token CloseRoundBracket238=null;
        PhpParser.increment_return increment231 = null;

        PhpParser.increment_return increment235 = null;

        PhpParser.weakLogicalAnd_return weakLogicalAnd237 = null;

        PhpParser.increment_return increment239 = null;


        CommonTree set230_tree=null;
        CommonTree OpenRoundBracket232_tree=null;
        CommonTree PrimitiveType233_tree=null;
        CommonTree CloseRoundBracket234_tree=null;
        CommonTree OpenRoundBracket236_tree=null;
        CommonTree CloseRoundBracket238_tree=null;
        RewriteRuleTokenStream stream_PrimitiveType=new RewriteRuleTokenStream(adaptor,"token PrimitiveType");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleSubtreeStream stream_increment=new RewriteRuleSubtreeStream(adaptor,"rule increment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:385:5: ( ( Tilde | Minus | SuppressWarnings ) increment | OpenRoundBracket PrimitiveType CloseRoundBracket increment -> ^( Cast PrimitiveType increment ) | OpenRoundBracket weakLogicalAnd CloseRoundBracket | increment )
            int alt63=4;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:385:7: ( Tilde | Minus | SuppressWarnings ) increment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set230=(Token)input.LT(1);
                    set230=(Token)input.LT(1);
                    if ( input.LA(1)==SuppressWarnings||input.LA(1)==Minus||input.LA(1)==Tilde ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set230), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_increment_in_negateOrCast2992);
                    increment231=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, increment231.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:386:7: OpenRoundBracket PrimitiveType CloseRoundBracket increment
                    {
                    OpenRoundBracket232=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_negateOrCast3000); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(OpenRoundBracket232);

                    PrimitiveType233=(Token)match(input,PrimitiveType,FOLLOW_PrimitiveType_in_negateOrCast3002); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PrimitiveType.add(PrimitiveType233);

                    CloseRoundBracket234=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_negateOrCast3004); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(CloseRoundBracket234);

                    pushFollow(FOLLOW_increment_in_negateOrCast3006);
                    increment235=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_increment.add(increment235.getTree());


                    // AST REWRITE
                    // elements: increment, PrimitiveType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 386:66: -> ^( Cast PrimitiveType increment )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:386:69: ^( Cast PrimitiveType increment )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Cast, "Cast"), root_1);

                        adaptor.addChild(root_1, stream_PrimitiveType.nextNode());
                        adaptor.addChild(root_1, stream_increment.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:387:7: OpenRoundBracket weakLogicalAnd CloseRoundBracket
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OpenRoundBracket236=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_negateOrCast3024); if (state.failed) return retval;
                    pushFollow(FOLLOW_weakLogicalAnd_in_negateOrCast3027);
                    weakLogicalAnd237=weakLogicalAnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd237.getTree());
                    CloseRoundBracket238=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_negateOrCast3029); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:388:7: increment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_increment_in_negateOrCast3038);
                    increment239=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, increment239.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, negateOrCast_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negateOrCast"

    public static class increment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "increment"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:391:1: increment : ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone );
    public final PhpParser.increment_return increment() throws RecognitionException {
        PhpParser.increment_return retval = new PhpParser.increment_return();
        retval.start = input.LT(1);
        int increment_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IncrementOperator240=null;
        Token IncrementOperator243=null;
        PhpParser.name_return name241 = null;

        PhpParser.name_return name242 = null;

        PhpParser.newOrClone_return newOrClone244 = null;


        CommonTree IncrementOperator240_tree=null;
        CommonTree IncrementOperator243_tree=null;
        RewriteRuleTokenStream stream_IncrementOperator=new RewriteRuleTokenStream(adaptor,"token IncrementOperator");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:392:5: ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone )
            int alt64=3;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:392:7: IncrementOperator name
                    {
                    IncrementOperator240=(Token)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment3055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IncrementOperator.add(IncrementOperator240);

                    pushFollow(FOLLOW_name_in_increment3057);
                    name241=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name241.getTree());


                    // AST REWRITE
                    // elements: name, IncrementOperator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 392:30: -> ^( Prefix IncrementOperator name )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:392:33: ^( Prefix IncrementOperator name )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Prefix, "Prefix"), root_1);

                        adaptor.addChild(root_1, stream_IncrementOperator.nextNode());
                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:393:7: name IncrementOperator
                    {
                    pushFollow(FOLLOW_name_in_increment3075);
                    name242=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name242.getTree());
                    IncrementOperator243=(Token)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment3077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IncrementOperator.add(IncrementOperator243);



                    // AST REWRITE
                    // elements: name, IncrementOperator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 393:30: -> ^( Postfix IncrementOperator name )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:393:33: ^( Postfix IncrementOperator name )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Postfix, "Postfix"), root_1);

                        adaptor.addChild(root_1, stream_IncrementOperator.nextNode());
                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:394:7: newOrClone
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_newOrClone_in_increment3095);
                    newOrClone244=newOrClone();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newOrClone244.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, increment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "increment"

    public static class newOrClone_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newOrClone"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:397:1: newOrClone : ( New nameOrFunctionCall | Clone name | atomOrReference );
    public final PhpParser.newOrClone_return newOrClone() throws RecognitionException {
        PhpParser.newOrClone_return retval = new PhpParser.newOrClone_return();
        retval.start = input.LT(1);
        int newOrClone_StartIndex = input.index();
        CommonTree root_0 = null;

        Token New245=null;
        Token Clone247=null;
        PhpParser.nameOrFunctionCall_return nameOrFunctionCall246 = null;

        PhpParser.name_return name248 = null;

        PhpParser.atomOrReference_return atomOrReference249 = null;


        CommonTree New245_tree=null;
        CommonTree Clone247_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:398:5: ( New nameOrFunctionCall | Clone name | atomOrReference )
            int alt65=3;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:398:7: New nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    New245=(Token)match(input,New,FOLLOW_New_in_newOrClone3112); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    New245_tree = (CommonTree)adaptor.create(New245);
                    root_0 = (CommonTree)adaptor.becomeRoot(New245_tree, root_0);
                    }
                    pushFollow(FOLLOW_nameOrFunctionCall_in_newOrClone3115);
                    nameOrFunctionCall246=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall246.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:399:7: Clone name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Clone247=(Token)match(input,Clone,FOLLOW_Clone_in_newOrClone3123); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Clone247_tree = (CommonTree)adaptor.create(Clone247);
                    root_0 = (CommonTree)adaptor.becomeRoot(Clone247_tree, root_0);
                    }
                    pushFollow(FOLLOW_name_in_newOrClone3126);
                    name248=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name248.getTree());

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:400:7: atomOrReference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atomOrReference_in_newOrClone3134);
                    atomOrReference249=atomOrReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomOrReference249.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, newOrClone_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newOrClone"

    public static class atomOrReference_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomOrReference"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:403:1: atomOrReference : ( atom | reference );
    public final PhpParser.atomOrReference_return atomOrReference() throws RecognitionException {
        PhpParser.atomOrReference_return retval = new PhpParser.atomOrReference_return();
        retval.start = input.LT(1);
        int atomOrReference_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.atom_return atom250 = null;

        PhpParser.reference_return reference251 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:404:5: ( atom | reference )
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:404:7: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_atomOrReference3151);
                    atom250=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom250.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:405:7: reference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_reference_in_atomOrReference3159);
                    reference251=reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reference251.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, atomOrReference_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atomOrReference"

    public static class arrayDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayDeclaration"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:408:1: arrayDeclaration : Array OpenRoundBracket ( arrayEntry ( Comma arrayEntry )* )? CloseRoundBracket -> ^( Array ( arrayEntry )* ) ;
    public final PhpParser.arrayDeclaration_return arrayDeclaration() throws RecognitionException {
        PhpParser.arrayDeclaration_return retval = new PhpParser.arrayDeclaration_return();
        retval.start = input.LT(1);
        int arrayDeclaration_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Array252=null;
        Token OpenRoundBracket253=null;
        Token Comma255=null;
        Token CloseRoundBracket257=null;
        PhpParser.arrayEntry_return arrayEntry254 = null;

        PhpParser.arrayEntry_return arrayEntry256 = null;


        CommonTree Array252_tree=null;
        CommonTree OpenRoundBracket253_tree=null;
        CommonTree Comma255_tree=null;
        CommonTree CloseRoundBracket257_tree=null;
        RewriteRuleTokenStream stream_Array=new RewriteRuleTokenStream(adaptor,"token Array");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleSubtreeStream stream_arrayEntry=new RewriteRuleSubtreeStream(adaptor,"rule arrayEntry");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:409:5: ( Array OpenRoundBracket ( arrayEntry ( Comma arrayEntry )* )? CloseRoundBracket -> ^( Array ( arrayEntry )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:409:7: Array OpenRoundBracket ( arrayEntry ( Comma arrayEntry )* )? CloseRoundBracket
            {
            Array252=(Token)match(input,Array,FOLLOW_Array_in_arrayDeclaration3176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Array.add(Array252);

            OpenRoundBracket253=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_arrayDeclaration3178); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenRoundBracket.add(OpenRoundBracket253);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:409:30: ( arrayEntry ( Comma arrayEntry )* )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:409:31: arrayEntry ( Comma arrayEntry )*
                    {
                    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration3181);
                    arrayEntry254=arrayEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry254.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:409:42: ( Comma arrayEntry )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==Comma) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:409:43: Comma arrayEntry
                    	    {
                    	    Comma255=(Token)match(input,Comma,FOLLOW_Comma_in_arrayDeclaration3184); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Comma.add(Comma255);

                    	    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration3186);
                    	    arrayEntry256=arrayEntry();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry256.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            CloseRoundBracket257=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_arrayDeclaration3192); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseRoundBracket.add(CloseRoundBracket257);



            // AST REWRITE
            // elements: arrayEntry, Array
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 409:82: -> ^( Array ( arrayEntry )* )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:409:85: ^( Array ( arrayEntry )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_Array.nextNode(), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:409:93: ( arrayEntry )*
                while ( stream_arrayEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayEntry.nextTree());

                }
                stream_arrayEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, arrayDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayDeclaration"

    public static class arrayEntry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayEntry"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:412:1: arrayEntry : ( keyValuePair | expression ) ;
    public final PhpParser.arrayEntry_return arrayEntry() throws RecognitionException {
        PhpParser.arrayEntry_return retval = new PhpParser.arrayEntry_return();
        retval.start = input.LT(1);
        int arrayEntry_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.keyValuePair_return keyValuePair258 = null;

        PhpParser.expression_return expression259 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:413:5: ( ( keyValuePair | expression ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:413:7: ( keyValuePair | expression )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:413:7: ( keyValuePair | expression )
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:413:8: keyValuePair
                    {
                    pushFollow(FOLLOW_keyValuePair_in_arrayEntry3219);
                    keyValuePair258=keyValuePair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyValuePair258.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:413:23: expression
                    {
                    pushFollow(FOLLOW_expression_in_arrayEntry3223);
                    expression259=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression259.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, arrayEntry_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayEntry"

    public static class keyValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePair"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:416:1: keyValuePair : ( expression ArrayAssign expression ) -> ^( ArrayAssign ( expression )+ ) ;
    public final PhpParser.keyValuePair_return keyValuePair() throws RecognitionException {
        PhpParser.keyValuePair_return retval = new PhpParser.keyValuePair_return();
        retval.start = input.LT(1);
        int keyValuePair_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ArrayAssign261=null;
        PhpParser.expression_return expression260 = null;

        PhpParser.expression_return expression262 = null;


        CommonTree ArrayAssign261_tree=null;
        RewriteRuleTokenStream stream_ArrayAssign=new RewriteRuleTokenStream(adaptor,"token ArrayAssign");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:417:5: ( ( expression ArrayAssign expression ) -> ^( ArrayAssign ( expression )+ ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:417:7: ( expression ArrayAssign expression )
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:417:7: ( expression ArrayAssign expression )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:417:8: expression ArrayAssign expression
            {
            pushFollow(FOLLOW_expression_in_keyValuePair3242);
            expression260=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression260.getTree());
            ArrayAssign261=(Token)match(input,ArrayAssign,FOLLOW_ArrayAssign_in_keyValuePair3244); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ArrayAssign.add(ArrayAssign261);

            pushFollow(FOLLOW_expression_in_keyValuePair3246);
            expression262=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression262.getTree());

            }



            // AST REWRITE
            // elements: expression, ArrayAssign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 417:43: -> ^( ArrayAssign ( expression )+ )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:417:46: ^( ArrayAssign ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ArrayAssign.nextNode(), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, keyValuePair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "keyValuePair"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:420:1: atom : ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration );
    public final PhpParser.atom_return atom() throws RecognitionException {
        PhpParser.atom_return retval = new PhpParser.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SingleQuotedString263=null;
        Token DoubleQuotedString264=null;
        Token HereDoc265=null;
        Token Integer266=null;
        Token Real267=null;
        Token Boolean268=null;
        PhpParser.arrayDeclaration_return arrayDeclaration269 = null;


        CommonTree SingleQuotedString263_tree=null;
        CommonTree DoubleQuotedString264_tree=null;
        CommonTree HereDoc265_tree=null;
        CommonTree Integer266_tree=null;
        CommonTree Real267_tree=null;
        CommonTree Boolean268_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:420:5: ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration )
            int alt70=7;
            switch ( input.LA(1) ) {
            case SingleQuotedString:
                {
                alt70=1;
                }
                break;
            case DoubleQuotedString:
                {
                alt70=2;
                }
                break;
            case HereDoc:
                {
                alt70=3;
                }
                break;
            case Integer:
                {
                alt70=4;
                }
                break;
            case Real:
                {
                alt70=5;
                }
                break;
            case Boolean:
                {
                alt70=6;
                }
                break;
            case Array:
                {
                alt70=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:420:7: SingleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SingleQuotedString263=(Token)match(input,SingleQuotedString,FOLLOW_SingleQuotedString_in_atom3268); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SingleQuotedString263_tree = (CommonTree)adaptor.create(SingleQuotedString263);
                    adaptor.addChild(root_0, SingleQuotedString263_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:420:28: DoubleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DoubleQuotedString264=(Token)match(input,DoubleQuotedString,FOLLOW_DoubleQuotedString_in_atom3272); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DoubleQuotedString264_tree = (CommonTree)adaptor.create(DoubleQuotedString264);
                    adaptor.addChild(root_0, DoubleQuotedString264_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:420:49: HereDoc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    HereDoc265=(Token)match(input,HereDoc,FOLLOW_HereDoc_in_atom3276); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HereDoc265_tree = (CommonTree)adaptor.create(HereDoc265);
                    adaptor.addChild(root_0, HereDoc265_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:420:59: Integer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Integer266=(Token)match(input,Integer,FOLLOW_Integer_in_atom3280); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Integer266_tree = (CommonTree)adaptor.create(Integer266);
                    adaptor.addChild(root_0, Integer266_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:420:69: Real
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Real267=(Token)match(input,Real,FOLLOW_Real_in_atom3284); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Real267_tree = (CommonTree)adaptor.create(Real267);
                    adaptor.addChild(root_0, Real267_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:420:76: Boolean
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Boolean268=(Token)match(input,Boolean,FOLLOW_Boolean_in_atom3288); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Boolean268_tree = (CommonTree)adaptor.create(Boolean268);
                    adaptor.addChild(root_0, Boolean268_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:420:86: arrayDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayDeclaration_in_atom3292);
                    arrayDeclaration269=arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayDeclaration269.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, atom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class reference_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reference"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:424:1: reference : ( Ampersand nameOrFunctionCall | nameOrFunctionCall );
    public final PhpParser.reference_return reference() throws RecognitionException {
        PhpParser.reference_return retval = new PhpParser.reference_return();
        retval.start = input.LT(1);
        int reference_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Ampersand270=null;
        PhpParser.nameOrFunctionCall_return nameOrFunctionCall271 = null;

        PhpParser.nameOrFunctionCall_return nameOrFunctionCall272 = null;


        CommonTree Ampersand270_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:425:5: ( Ampersand nameOrFunctionCall | nameOrFunctionCall )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Ampersand) ) {
                alt71=1;
            }
            else if ( (LA71_0==Dollar||LA71_0==UnquotedString) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:425:7: Ampersand nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Ampersand270=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_reference3310); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Ampersand270_tree = (CommonTree)adaptor.create(Ampersand270);
                    root_0 = (CommonTree)adaptor.becomeRoot(Ampersand270_tree, root_0);
                    }
                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference3313);
                    nameOrFunctionCall271=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall271.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:426:7: nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference3321);
                    nameOrFunctionCall272=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall272.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, reference_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "reference"

    public static class nameOrFunctionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameOrFunctionCall"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:429:1: nameOrFunctionCall : ( name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket -> ^( Apply name ( expression )* ) | name );
    public final PhpParser.nameOrFunctionCall_return nameOrFunctionCall() throws RecognitionException {
        PhpParser.nameOrFunctionCall_return retval = new PhpParser.nameOrFunctionCall_return();
        retval.start = input.LT(1);
        int nameOrFunctionCall_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OpenRoundBracket274=null;
        Token Comma276=null;
        Token CloseRoundBracket278=null;
        PhpParser.name_return name273 = null;

        PhpParser.expression_return expression275 = null;

        PhpParser.expression_return expression277 = null;

        PhpParser.name_return name279 = null;


        CommonTree OpenRoundBracket274_tree=null;
        CommonTree Comma276_tree=null;
        CommonTree CloseRoundBracket278_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:5: ( name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket -> ^( Apply name ( expression )* ) | name )
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:7: name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket
                    {
                    pushFollow(FOLLOW_name_in_nameOrFunctionCall3338);
                    name273=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name273.getTree());
                    OpenRoundBracket274=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_nameOrFunctionCall3340); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(OpenRoundBracket274);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:29: ( expression ( Comma expression )* )?
                    int alt73=2;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:30: expression ( Comma expression )*
                            {
                            pushFollow(FOLLOW_expression_in_nameOrFunctionCall3343);
                            expression275=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression275.getTree());
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:41: ( Comma expression )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==Comma) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:42: Comma expression
                            	    {
                            	    Comma276=(Token)match(input,Comma,FOLLOW_Comma_in_nameOrFunctionCall3346); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_Comma.add(Comma276);

                            	    pushFollow(FOLLOW_expression_in_nameOrFunctionCall3348);
                            	    expression277=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_expression.add(expression277.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop72;
                                }
                            } while (true);


                            }
                            break;

                    }

                    CloseRoundBracket278=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_nameOrFunctionCall3354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(CloseRoundBracket278);



                    // AST REWRITE
                    // elements: name, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 430:81: -> ^( Apply name ( expression )* )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:84: ^( Apply name ( expression )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Apply, "Apply"), root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:97: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:431:7: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_nameOrFunctionCall3373);
                    name279=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name279.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, nameOrFunctionCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nameOrFunctionCall"

    public static class name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:434:1: name : ( staticMemberAccess | memberAccess | variable );
    public final PhpParser.name_return name() throws RecognitionException {
        PhpParser.name_return retval = new PhpParser.name_return();
        retval.start = input.LT(1);
        int name_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.staticMemberAccess_return staticMemberAccess280 = null;

        PhpParser.memberAccess_return memberAccess281 = null;

        PhpParser.variable_return variable282 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:434:5: ( staticMemberAccess | memberAccess | variable )
            int alt75=3;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:434:7: staticMemberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_staticMemberAccess_in_name3385);
                    staticMemberAccess280=staticMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticMemberAccess280.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:435:7: memberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_memberAccess_in_name3393);
                    memberAccess281=memberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccess281.getTree());

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:436:7: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_name3401);
                    variable282=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable282.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, name_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "name"

    public static class staticMemberAccess_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticMemberAccess"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:1: staticMemberAccess : UnquotedString '::' variable ;
    public final PhpParser.staticMemberAccess_return staticMemberAccess() throws RecognitionException {
        PhpParser.staticMemberAccess_return retval = new PhpParser.staticMemberAccess_return();
        retval.start = input.LT(1);
        int staticMemberAccess_StartIndex = input.index();
        CommonTree root_0 = null;

        Token UnquotedString283=null;
        Token string_literal284=null;
        PhpParser.variable_return variable285 = null;


        CommonTree UnquotedString283_tree=null;
        CommonTree string_literal284_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:440:5: ( UnquotedString '::' variable )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:440:7: UnquotedString '::' variable
            {
            root_0 = (CommonTree)adaptor.nil();

            UnquotedString283=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_staticMemberAccess3422); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString283_tree = (CommonTree)adaptor.create(UnquotedString283);
            adaptor.addChild(root_0, UnquotedString283_tree);
            }
            string_literal284=(Token)match(input,ClassMember,FOLLOW_ClassMember_in_staticMemberAccess3424); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal284_tree = (CommonTree)adaptor.create(string_literal284);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal284_tree, root_0);
            }
            pushFollow(FOLLOW_variable_in_staticMemberAccess3427);
            variable285=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable285.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, staticMemberAccess_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticMemberAccess"

    public static class memberAccess_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberAccess"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:443:1: memberAccess : variable ( OpenSquareBracket expression CloseSquareBracket | '->' UnquotedString )* ;
    public final PhpParser.memberAccess_return memberAccess() throws RecognitionException {
        PhpParser.memberAccess_return retval = new PhpParser.memberAccess_return();
        retval.start = input.LT(1);
        int memberAccess_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OpenSquareBracket287=null;
        Token CloseSquareBracket289=null;
        Token string_literal290=null;
        Token UnquotedString291=null;
        PhpParser.variable_return variable286 = null;

        PhpParser.expression_return expression288 = null;


        CommonTree OpenSquareBracket287_tree=null;
        CommonTree CloseSquareBracket289_tree=null;
        CommonTree string_literal290_tree=null;
        CommonTree UnquotedString291_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:444:5: ( variable ( OpenSquareBracket expression CloseSquareBracket | '->' UnquotedString )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:444:7: variable ( OpenSquareBracket expression CloseSquareBracket | '->' UnquotedString )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_variable_in_memberAccess3444);
            variable286=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable286.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:445:9: ( OpenSquareBracket expression CloseSquareBracket | '->' UnquotedString )*
            loop76:
            do {
                int alt76=3;
                alt76 = dfa76.predict(input);
                switch (alt76) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:445:11: OpenSquareBracket expression CloseSquareBracket
            	    {
            	    OpenSquareBracket287=(Token)match(input,OpenSquareBracket,FOLLOW_OpenSquareBracket_in_memberAccess3457); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OpenSquareBracket287_tree = (CommonTree)adaptor.create(OpenSquareBracket287);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OpenSquareBracket287_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expression_in_memberAccess3460);
            	    expression288=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression288.getTree());
            	    CloseSquareBracket289=(Token)match(input,CloseSquareBracket,FOLLOW_CloseSquareBracket_in_memberAccess3462); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:446:11: '->' UnquotedString
            	    {
            	    string_literal290=(Token)match(input,InstanceMember,FOLLOW_InstanceMember_in_memberAccess3475); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal290_tree = (CommonTree)adaptor.create(string_literal290);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal290_tree, root_0);
            	    }
            	    UnquotedString291=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_memberAccess3478); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString291_tree = (CommonTree)adaptor.create(UnquotedString291);
            	    adaptor.addChild(root_0, UnquotedString291_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, memberAccess_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "memberAccess"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:449:1: variable : ( Dollar variable | UnquotedString );
    public final PhpParser.variable_return variable() throws RecognitionException {
        PhpParser.variable_return retval = new PhpParser.variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Dollar292=null;
        Token UnquotedString294=null;
        PhpParser.variable_return variable293 = null;


        CommonTree Dollar292_tree=null;
        CommonTree UnquotedString294_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:450:5: ( Dollar variable | UnquotedString )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==Dollar) ) {
                alt77=1;
            }
            else if ( (LA77_0==UnquotedString) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:450:7: Dollar variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Dollar292=(Token)match(input,Dollar,FOLLOW_Dollar_in_variable3501); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar292_tree = (CommonTree)adaptor.create(Dollar292);
                    root_0 = (CommonTree)adaptor.becomeRoot(Dollar292_tree, root_0);
                    }
                    pushFollow(FOLLOW_variable_in_variable3504);
                    variable293=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable293.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:451:7: UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UnquotedString294=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_variable3512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString294_tree = (CommonTree)adaptor.create(UnquotedString294);
                    adaptor.addChild(root_0, UnquotedString294_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, variable_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variable"

    // $ANTLR start synpred3_Php
    public final void synpred3_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:160:7: ( ( simpleStatement )? BodyString )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:160:7: ( simpleStatement )? BodyString
        {
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:160:7: ( simpleStatement )?
        int alt78=2;
        alt78 = dfa78.predict(input);
        switch (alt78) {
            case 1 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: simpleStatement
                {
                pushFollow(FOLLOW_simpleStatement_in_synpred3_Php897);
                simpleStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,BodyString,FOLLOW_BodyString_in_synpred3_Php900); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Php

    // $ANTLR start synpred4_Php
    public final void synpred4_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:161:7: ( '{' statement '}' )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:161:7: '{' statement '}'
        {
        match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_synpred4_Php908); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred4_Php910);
        statement();

        state._fsp--;
        if (state.failed) return ;
        match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_synpred4_Php912); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Php

    // $ANTLR start synpred5_Php
    public final void synpred5_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:162:7: ( bracketedBlock )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:162:7: bracketedBlock
        {
        pushFollow(FOLLOW_bracketedBlock_in_synpred5_Php924);
        bracketedBlock();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Php

    // $ANTLR start synpred23_Php
    public final void synpred23_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:210:7: ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:210:7: ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' )
        {
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:210:7: ( fieldModifier )*
        loop80:
        do {
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==Static||LA80_0==Abstract||LA80_0==AccessModifier) ) {
                alt80=1;
            }


            switch (alt80) {
        	case 1 :
        	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: fieldModifier
        	    {
        	    pushFollow(FOLLOW_fieldModifier_in_synpred23_Php1404);
        	    fieldModifier();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop80;
            }
        } while (true);

        match(input,Function,FOLLOW_Function_in_synpred23_Php1407); if (state.failed) return ;
        match(input,UnquotedString,FOLLOW_UnquotedString_in_synpred23_Php1409); if (state.failed) return ;
        pushFollow(FOLLOW_parametersDefinition_in_synpred23_Php1411);
        parametersDefinition();

        state._fsp--;
        if (state.failed) return ;
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:211:9: ( bracketedBlock | ';' )
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==OpenCurlyBracket) ) {
            alt81=1;
        }
        else if ( (LA81_0==SemiColon) ) {
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
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:211:10: bracketedBlock
                {
                pushFollow(FOLLOW_bracketedBlock_in_synpred23_Php1423);
                bracketedBlock();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:211:27: ';'
                {
                match(input,SemiColon,FOLLOW_SemiColon_in_synpred23_Php1427); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred23_Php

    // $ANTLR start synpred33_Php
    public final void synpred33_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:234:58: ( conditional )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:234:58: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred33_Php1716);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_Php

    // $ANTLR start synpred52_Php
    public final void synpred52_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:258:62: ( conditional )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:258:62: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred52_Php2051);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_Php

    // $ANTLR start synpred65_Php
    public final void synpred65_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:313:23: ( Or weakLogicalXor )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:313:23: Or weakLogicalXor
        {
        match(input,Or,FOLLOW_Or_in_synpred65_Php2466); if (state.failed) return ;
        pushFollow(FOLLOW_weakLogicalXor_in_synpred65_Php2469);
        weakLogicalXor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_Php

    // $ANTLR start synpred66_Php
    public final void synpred66_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:317:23: ( Xor weakLogicalAnd )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:317:23: Xor weakLogicalAnd
        {
        match(input,Xor,FOLLOW_Xor_in_synpred66_Php2491); if (state.failed) return ;
        pushFollow(FOLLOW_weakLogicalAnd_in_synpred66_Php2494);
        weakLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Php

    // $ANTLR start synpred67_Php
    public final void synpred67_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:321:19: ( And assignment )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:321:19: And assignment
        {
        match(input,And,FOLLOW_And_in_synpred67_Php2520); if (state.failed) return ;
        pushFollow(FOLLOW_assignment_in_synpred67_Php2523);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Php

    // $ANTLR start synpred69_Php
    public final void synpred69_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:325:7: ( listVariables ( ( Equals | AsignmentOperator ) assignment ) )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:325:7: listVariables ( ( Equals | AsignmentOperator ) assignment )
        {
        pushFollow(FOLLOW_listVariables_in_synpred69_Php2542);
        listVariables();

        state._fsp--;
        if (state.failed) return ;
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:325:21: ( ( Equals | AsignmentOperator ) assignment )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:325:22: ( Equals | AsignmentOperator ) assignment
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

        pushFollow(FOLLOW_assignment_in_synpred69_Php2554);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred69_Php

    // $ANTLR start synpred72_Php
    public final void synpred72_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:335:7: ( logicalOr QuestionMark expression Colon expression )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:335:7: logicalOr QuestionMark expression Colon expression
        {
        pushFollow(FOLLOW_logicalOr_in_synpred72_Php2621);
        logicalOr();

        state._fsp--;
        if (state.failed) return ;
        match(input,QuestionMark,FOLLOW_QuestionMark_in_synpred72_Php2623); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred72_Php2625);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,Colon,FOLLOW_Colon_in_synpred72_Php2627); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred72_Php2629);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Php

    // $ANTLR start synpred94_Php
    public final void synpred94_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:393:7: ( name IncrementOperator )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:393:7: name IncrementOperator
        {
        pushFollow(FOLLOW_name_in_synpred94_Php3075);
        name();

        state._fsp--;
        if (state.failed) return ;
        match(input,IncrementOperator,FOLLOW_IncrementOperator_in_synpred94_Php3077); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_Php

    // $ANTLR start synpred100_Php
    public final void synpred100_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:413:8: ( keyValuePair )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:413:8: keyValuePair
        {
        pushFollow(FOLLOW_keyValuePair_in_synpred100_Php3219);
        keyValuePair();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_Php

    // $ANTLR start synpred110_Php
    public final void synpred110_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:7: ( name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:7: name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket
        {
        pushFollow(FOLLOW_name_in_synpred110_Php3338);
        name();

        state._fsp--;
        if (state.failed) return ;
        match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_synpred110_Php3340); if (state.failed) return ;
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:29: ( expression ( Comma expression )* )?
        int alt96=2;
        alt96 = dfa96.predict(input);
        switch (alt96) {
            case 1 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:30: expression ( Comma expression )*
                {
                pushFollow(FOLLOW_expression_in_synpred110_Php3343);
                expression();

                state._fsp--;
                if (state.failed) return ;
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:41: ( Comma expression )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==Comma) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:430:42: Comma expression
                	    {
                	    match(input,Comma,FOLLOW_Comma_in_synpred110_Php3346); if (state.failed) return ;
                	    pushFollow(FOLLOW_expression_in_synpred110_Php3348);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_synpred110_Php3354); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_Php

    // $ANTLR start synpred112_Php
    public final void synpred112_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:435:7: ( memberAccess )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:435:7: memberAccess
        {
        pushFollow(FOLLOW_memberAccess_in_synpred112_Php3393);
        memberAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_Php

    // Delegated rules

    public final boolean synpred3_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_Php_fragment(); // can never throw exception
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
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA48 dfa48 = new DFA48(this);
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
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA96 dfa96 = new DFA96(this);
    static final String DFA1_eotS =
        "\46\uffff";
    static final String DFA1_eofS =
        "\1\1\45\uffff";
    static final String DFA1_minS =
        "\1\6\45\uffff";
    static final String DFA1_maxS =
        "\1\141\45\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\2\1\1\43\uffff";
    static final String DFA1_specialS =
        "\46\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\3\uffff\1\2\6\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\4\2\2\uffff\5\2\2\uffff"+
            "\6\2\4\uffff\3\2\2\uffff\1\2\24\uffff\2\2\1\uffff\2\2\5\uffff"+
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
            return "()* loopback of 157:8: ( statement )*";
        }
    }
    static final String DFA3_eotS =
        "\u013b\uffff";
    static final String DFA3_eofS =
        "\u013b\uffff";
    static final String DFA3_minS =
        "\2\6\2\23\3\4\2\6\1\4\1\23\1\6\1\23\1\6\3\23\6\4\1\6\1\23\1\uffff"+
        "\1\6\12\uffff\26\0\2\uffff\1\0\2\uffff\21\0\2\uffff\43\0\1\uffff"+
        "\2\0\1\uffff\105\0\1\uffff\1\0\1\uffff\16\0\2\uffff\15\0\1\uffff"+
        "\1\0\1\uffff\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff\47\0\2\uffff";
    static final String DFA3_maxS =
        "\2\141\2\122\2\124\2\141\1\6\1\133\1\122\3\141\3\122\6\131\1\6\1"+
        "\122\1\uffff\1\141\12\uffff\26\0\2\uffff\1\0\2\uffff\21\0\2\uffff"+
        "\43\0\1\uffff\2\0\1\uffff\105\0\1\uffff\1\0\1\uffff\16\0\2\uffff"+
        "\15\0\1\uffff\1\0\1\uffff\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff"+
        "\47\0\2\uffff";
    static final String DFA3_acceptS =
        "\31\uffff\1\1\1\uffff\1\4\1\uffff\1\5\1\6\35\uffff\1\7\u00fc\uffff"+
        "\1\3\1\2";
    static final String DFA3_specialS =
        "\45\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\2\uffff\1\26\2"+
        "\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1"+
        "\42\1\43\1\44\1\45\1\46\1\47\2\uffff\1\50\1\51\1\52\1\53\1\54\1"+
        "\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71"+
        "\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105"+
        "\1\106\1\107\1\110\1\111\1\112\1\uffff\1\113\1\114\1\uffff\1\115"+
        "\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130"+
        "\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143"+
        "\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
        "\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171"+
        "\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083"+
        "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b"+
        "\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\uffff\1\u0092"+
        "\1\uffff\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099"+
        "\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\2\uffff"+
        "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8"+
        "\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\uffff\1\u00ae\1\uffff"+
        "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6"+
        "\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc\2\uffff\1\u00bd"+
        "\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5"+
        "\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\2\uffff\1\u00cb\1\u00cc"+
        "\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4"+
        "\1\u00d5\1\u00d6\1\u00d7\1\u00d8\2\uffff\1\u00d9\1\u00da\1\u00db"+
        "\1\u00dc\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3"+
        "\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1\u00eb"+
        "\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3"+
        "\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa\1\u00fb"+
        "\1\u00fc\1\u00fd\1\u00fe\1\u00ff\2\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\15\3\uffff\1\32\6\uffff\1\14\1\uffff\1\12\2\uffff\1\30\1"+
            "\uffff\1\13\1\uffff\1\14\3\uffff\1\14\1\uffff\1\17\1\20\1\1"+
            "\1\36\2\uffff\5\36\2\uffff\1\36\1\4\1\5\1\6\1\2\1\3\4\uffff"+
            "\1\10\1\33\1\35\2\uffff\1\33\24\uffff\1\31\1\11\1\uffff\1\24"+
            "\1\7\5\uffff\1\16\1\27\1\21\1\22\1\23\1\25\1\26",
            "\1\52\12\uffff\1\51\1\uffff\1\47\2\uffff\1\65\1\uffff\1\50"+
            "\1\uffff\1\51\3\uffff\1\51\1\uffff\1\54\1\55\25\uffff\1\45\32"+
            "\uffff\1\46\1\uffff\1\61\6\uffff\1\53\1\64\1\56\1\57\1\60\1"+
            "\62\1\63",
            "\1\67\76\uffff\1\66",
            "\1\70\76\uffff\1\71",
            "\1\74\114\uffff\1\31\2\uffff\1\72",
            "\1\74\114\uffff\1\31\2\uffff\1\75",
            "\1\74\1\uffff\1\105\12\uffff\1\104\1\uffff\1\102\2\uffff\1"+
            "\120\1\uffff\1\103\1\uffff\1\104\3\uffff\1\104\1\uffff\1\107"+
            "\1\110\25\uffff\1\100\31\uffff\1\31\1\101\1\uffff\1\114\6\uffff"+
            "\1\106\1\117\1\111\1\112\1\113\1\115\1\116",
            "\1\130\12\uffff\1\127\1\uffff\1\125\2\uffff\1\143\1\uffff\1"+
            "\126\1\uffff\1\127\3\uffff\1\127\1\uffff\1\132\1\133\25\uffff"+
            "\1\123\32\uffff\1\124\1\uffff\1\137\6\uffff\1\131\1\142\1\134"+
            "\1\135\1\136\1\140\1\141",
            "\1\144",
            "\1\74\1\uffff\1\146\1\uffff\1\147\4\uffff\1\162\1\161\1\145"+
            "\1\150\1\uffff\1\167\2\uffff\1\153\1\157\1\160\1\uffff\2\153"+
            "\3\152\1\uffff\1\172\23\uffff\1\163\1\165\1\164\1\151\32\uffff"+
            "\1\31\4\uffff\1\172\1\156\1\155\1\154\1\uffff\1\170",
            "\1\173\76\uffff\1\174",
            "\1\177\12\uffff\1\176\1\uffff\1\u0082\2\uffff\1\u008c\1\uffff"+
            "\1\175\1\uffff\1\176\3\uffff\1\176\1\uffff\1\u0083\1\u0084\60"+
            "\uffff\1\u0081\1\uffff\1\u0088\6\uffff\1\u0080\1\u008b\1\u0085"+
            "\1\u0086\1\u0087\1\u0089\1\u008a",
            "\1\u008f\2\uffff\1\u0099\11\uffff\1\u0090\1\u0091\60\uffff"+
            "\1\u008e\1\uffff\1\u0095\6\uffff\1\u008d\1\u0098\1\u0092\1\u0093"+
            "\1\u0094\1\u0096\1\u0097",
            "\1\u00a0\12\uffff\1\u009f\1\uffff\1\u009d\2\uffff\1\u00ab\1"+
            "\uffff\1\u009e\1\uffff\1\u009f\3\uffff\1\u009f\1\uffff\1\u00a2"+
            "\1\u00a3\25\uffff\1\u009b\32\uffff\1\u009c\1\uffff\1\u00a7\5"+
            "\uffff\1\u009a\1\u00a1\1\u00aa\1\u00a4\1\u00a5\1\u00a6\1\u00a8"+
            "\1\u00a9",
            "\1\u00ad\76\uffff\1\u00ac",
            "\1\u00af\76\uffff\1\u00ae",
            "\1\u00b1\76\uffff\1\u00b0",
            "\1\74\10\uffff\1\u00bb\1\u00ba\3\uffff\1\u00c0\2\uffff\1\u00b4"+
            "\1\u00b8\1\u00b9\1\uffff\2\u00b4\3\u00b3\25\uffff\1\u00bc\1"+
            "\u00be\1\u00bd\1\u00b2\32\uffff\1\31\5\uffff\1\u00b7\1\u00b6"+
            "\1\u00b5",
            "\1\74\10\uffff\1\u00cb\1\u00ca\3\uffff\1\u00cc\2\uffff\1\u00c4"+
            "\1\u00c8\1\u00c9\1\uffff\2\u00c4\3\u00c3\25\uffff\1\u00cd\1"+
            "\u00cf\1\u00ce\1\u00c2\32\uffff\1\31\5\uffff\1\u00c7\1\u00c6"+
            "\1\u00c5",
            "\1\74\10\uffff\1\u00db\1\u00da\3\uffff\1\u00e0\2\uffff\1\u00d4"+
            "\1\u00d8\1\u00d9\1\uffff\2\u00d4\3\u00d3\25\uffff\1\u00dc\1"+
            "\u00de\1\u00dd\1\u00d2\32\uffff\1\31\5\uffff\1\u00d7\1\u00d6"+
            "\1\u00d5",
            "\1\74\10\uffff\1\u00eb\1\u00ea\3\uffff\1\u00ec\2\uffff\1\u00e4"+
            "\1\u00e8\1\u00e9\1\uffff\2\u00e4\3\u00e3\25\uffff\1\u00ed\1"+
            "\u00ef\1\u00ee\1\u00e2\32\uffff\1\31\5\uffff\1\u00e7\1\u00e6"+
            "\1\u00e5",
            "\1\74\10\uffff\1\u00fb\1\u00fa\3\uffff\1\u00fc\2\uffff\1\u00f4"+
            "\1\u00f8\1\u00f9\1\uffff\2\u00f4\3\u00f3\25\uffff\1\u00fd\1"+
            "\u00ff\1\u00fe\1\u00f2\32\uffff\1\31\5\uffff\1\u00f7\1\u00f6"+
            "\1\u00f5",
            "\1\74\10\uffff\1\u010b\1\u010a\3\uffff\1\u010c\2\uffff\1\u0104"+
            "\1\u0108\1\u0109\1\uffff\2\u0104\3\u0103\25\uffff\1\u010d\1"+
            "\u010f\1\u010e\1\u0102\32\uffff\1\31\5\uffff\1\u0107\1\u0106"+
            "\1\u0105",
            "\1\u0112",
            "\1\u0114\76\uffff\1\u0113",
            "",
            "\1\u0121\3\uffff\1\u012e\1\u0139\5\uffff\1\u0120\1\uffff\1"+
            "\u011e\2\uffff\1\u012c\1\uffff\1\u011f\1\uffff\1\u0120\3\uffff"+
            "\1\u0120\1\uffff\1\u0123\1\u0124\1\u0115\1\u0132\2\uffff\1\u0133"+
            "\1\u0134\1\u0135\1\u0136\1\u0137\2\uffff\1\u0138\1\u0118\1\u0119"+
            "\1\u011a\1\u0116\1\u0117\4\uffff\1\u011c\1\u0130\1\u0131\2\uffff"+
            "\1\u012f\24\uffff\1\u012d\1\u011d\1\uffff\1\u0128\1\u011b\5"+
            "\uffff\1\u0122\1\u012b\1\u0125\1\u0126\1\u0127\1\u0129\1\u012a",
            "",
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
            "",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "159:1: statement : ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_37 = input.LA(1);

                         
                        int index3_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_37);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_38 = input.LA(1);

                         
                        int index3_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_38);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_39 = input.LA(1);

                         
                        int index3_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_39);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_40 = input.LA(1);

                         
                        int index3_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_40);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_41 = input.LA(1);

                         
                        int index3_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_41);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_42 = input.LA(1);

                         
                        int index3_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_42);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_43 = input.LA(1);

                         
                        int index3_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_43);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_44 = input.LA(1);

                         
                        int index3_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_44);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_45 = input.LA(1);

                         
                        int index3_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_45);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_46 = input.LA(1);

                         
                        int index3_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_46);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_47 = input.LA(1);

                         
                        int index3_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_47);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA3_48 = input.LA(1);

                         
                        int index3_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_48);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA3_49 = input.LA(1);

                         
                        int index3_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_49);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA3_50 = input.LA(1);

                         
                        int index3_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_50);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA3_51 = input.LA(1);

                         
                        int index3_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_51);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA3_52 = input.LA(1);

                         
                        int index3_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_52);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA3_53 = input.LA(1);

                         
                        int index3_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_53);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA3_54 = input.LA(1);

                         
                        int index3_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_54);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA3_55 = input.LA(1);

                         
                        int index3_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_55);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA3_56 = input.LA(1);

                         
                        int index3_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_56);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA3_57 = input.LA(1);

                         
                        int index3_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_57);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA3_58 = input.LA(1);

                         
                        int index3_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_58);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA3_61 = input.LA(1);

                         
                        int index3_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_61);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA3_64 = input.LA(1);

                         
                        int index3_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_64);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA3_65 = input.LA(1);

                         
                        int index3_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_65);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA3_66 = input.LA(1);

                         
                        int index3_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_66);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA3_67 = input.LA(1);

                         
                        int index3_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_67);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA3_68 = input.LA(1);

                         
                        int index3_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_68);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA3_69 = input.LA(1);

                         
                        int index3_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_69);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA3_70 = input.LA(1);

                         
                        int index3_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_70);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA3_71 = input.LA(1);

                         
                        int index3_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_71);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA3_72 = input.LA(1);

                         
                        int index3_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_72);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA3_73 = input.LA(1);

                         
                        int index3_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_73);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA3_74 = input.LA(1);

                         
                        int index3_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_74);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA3_75 = input.LA(1);

                         
                        int index3_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_75);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA3_76 = input.LA(1);

                         
                        int index3_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_76);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA3_77 = input.LA(1);

                         
                        int index3_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_77);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA3_78 = input.LA(1);

                         
                        int index3_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_78);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA3_79 = input.LA(1);

                         
                        int index3_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_79);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA3_80 = input.LA(1);

                         
                        int index3_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_80);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA3_83 = input.LA(1);

                         
                        int index3_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_83);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA3_84 = input.LA(1);

                         
                        int index3_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_84);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA3_85 = input.LA(1);

                         
                        int index3_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_85);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA3_86 = input.LA(1);

                         
                        int index3_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_86);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA3_87 = input.LA(1);

                         
                        int index3_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_87);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA3_88 = input.LA(1);

                         
                        int index3_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_88);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA3_89 = input.LA(1);

                         
                        int index3_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_89);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA3_90 = input.LA(1);

                         
                        int index3_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_90);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA3_91 = input.LA(1);

                         
                        int index3_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_91);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA3_92 = input.LA(1);

                         
                        int index3_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_92);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA3_93 = input.LA(1);

                         
                        int index3_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_93);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA3_94 = input.LA(1);

                         
                        int index3_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_94);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA3_95 = input.LA(1);

                         
                        int index3_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_95);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA3_96 = input.LA(1);

                         
                        int index3_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_96);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA3_97 = input.LA(1);

                         
                        int index3_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_97);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA3_98 = input.LA(1);

                         
                        int index3_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_98);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA3_99 = input.LA(1);

                         
                        int index3_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_99);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA3_100 = input.LA(1);

                         
                        int index3_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_100);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA3_101 = input.LA(1);

                         
                        int index3_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_101);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA3_102 = input.LA(1);

                         
                        int index3_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_102);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA3_103 = input.LA(1);

                         
                        int index3_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_103);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA3_104 = input.LA(1);

                         
                        int index3_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_104);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA3_105 = input.LA(1);

                         
                        int index3_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_105);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA3_106 = input.LA(1);

                         
                        int index3_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_106);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA3_107 = input.LA(1);

                         
                        int index3_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_107);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA3_108 = input.LA(1);

                         
                        int index3_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_108);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA3_109 = input.LA(1);

                         
                        int index3_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_109);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA3_110 = input.LA(1);

                         
                        int index3_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_110);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA3_111 = input.LA(1);

                         
                        int index3_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_111);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA3_112 = input.LA(1);

                         
                        int index3_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_112);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA3_113 = input.LA(1);

                         
                        int index3_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_113);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA3_114 = input.LA(1);

                         
                        int index3_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_114);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA3_115 = input.LA(1);

                         
                        int index3_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_115);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA3_116 = input.LA(1);

                         
                        int index3_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_116);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA3_117 = input.LA(1);

                         
                        int index3_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_117);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA3_119 = input.LA(1);

                         
                        int index3_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_119);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA3_120 = input.LA(1);

                         
                        int index3_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_120);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA3_122 = input.LA(1);

                         
                        int index3_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_122);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA3_123 = input.LA(1);

                         
                        int index3_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_123);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA3_124 = input.LA(1);

                         
                        int index3_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_124);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA3_125 = input.LA(1);

                         
                        int index3_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_125);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA3_126 = input.LA(1);

                         
                        int index3_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_126);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA3_127 = input.LA(1);

                         
                        int index3_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_127);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA3_128 = input.LA(1);

                         
                        int index3_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_128);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA3_129 = input.LA(1);

                         
                        int index3_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_129);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA3_130 = input.LA(1);

                         
                        int index3_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_130);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA3_131 = input.LA(1);

                         
                        int index3_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_131);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA3_132 = input.LA(1);

                         
                        int index3_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_132);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA3_133 = input.LA(1);

                         
                        int index3_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_133);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA3_134 = input.LA(1);

                         
                        int index3_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_134);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA3_135 = input.LA(1);

                         
                        int index3_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_135);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA3_136 = input.LA(1);

                         
                        int index3_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_136);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA3_137 = input.LA(1);

                         
                        int index3_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_137);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA3_138 = input.LA(1);

                         
                        int index3_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_138);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA3_139 = input.LA(1);

                         
                        int index3_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_139);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA3_140 = input.LA(1);

                         
                        int index3_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_140);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA3_141 = input.LA(1);

                         
                        int index3_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_141);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA3_142 = input.LA(1);

                         
                        int index3_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_142);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA3_143 = input.LA(1);

                         
                        int index3_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_143);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA3_144 = input.LA(1);

                         
                        int index3_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_144);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA3_145 = input.LA(1);

                         
                        int index3_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_145);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA3_146 = input.LA(1);

                         
                        int index3_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_146);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA3_147 = input.LA(1);

                         
                        int index3_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_147);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA3_148 = input.LA(1);

                         
                        int index3_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_148);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA3_149 = input.LA(1);

                         
                        int index3_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_149);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA3_150 = input.LA(1);

                         
                        int index3_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_150);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA3_151 = input.LA(1);

                         
                        int index3_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_151);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA3_152 = input.LA(1);

                         
                        int index3_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_152);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA3_153 = input.LA(1);

                         
                        int index3_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_153);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA3_154 = input.LA(1);

                         
                        int index3_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_154);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA3_155 = input.LA(1);

                         
                        int index3_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_155);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA3_156 = input.LA(1);

                         
                        int index3_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_156);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA3_157 = input.LA(1);

                         
                        int index3_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_157);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA3_158 = input.LA(1);

                         
                        int index3_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_158);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA3_159 = input.LA(1);

                         
                        int index3_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_159);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA3_160 = input.LA(1);

                         
                        int index3_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_160);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA3_161 = input.LA(1);

                         
                        int index3_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_161);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA3_162 = input.LA(1);

                         
                        int index3_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_162);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA3_163 = input.LA(1);

                         
                        int index3_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_163);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA3_164 = input.LA(1);

                         
                        int index3_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_164);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA3_165 = input.LA(1);

                         
                        int index3_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_165);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA3_166 = input.LA(1);

                         
                        int index3_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_166);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA3_167 = input.LA(1);

                         
                        int index3_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_167);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA3_168 = input.LA(1);

                         
                        int index3_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_168);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA3_169 = input.LA(1);

                         
                        int index3_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_169);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA3_170 = input.LA(1);

                         
                        int index3_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_170);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA3_171 = input.LA(1);

                         
                        int index3_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_171);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA3_172 = input.LA(1);

                         
                        int index3_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_172);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA3_173 = input.LA(1);

                         
                        int index3_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_173);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA3_174 = input.LA(1);

                         
                        int index3_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_174);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA3_175 = input.LA(1);

                         
                        int index3_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_175);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA3_176 = input.LA(1);

                         
                        int index3_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_176);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA3_177 = input.LA(1);

                         
                        int index3_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_177);
                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA3_178 = input.LA(1);

                         
                        int index3_178 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_178);
                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA3_179 = input.LA(1);

                         
                        int index3_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_179);
                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA3_180 = input.LA(1);

                         
                        int index3_180 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_180);
                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA3_181 = input.LA(1);

                         
                        int index3_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_181);
                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA3_182 = input.LA(1);

                         
                        int index3_182 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_182);
                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA3_183 = input.LA(1);

                         
                        int index3_183 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_183);
                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA3_184 = input.LA(1);

                         
                        int index3_184 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_184);
                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA3_185 = input.LA(1);

                         
                        int index3_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_185);
                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA3_186 = input.LA(1);

                         
                        int index3_186 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_186);
                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA3_187 = input.LA(1);

                         
                        int index3_187 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_187);
                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA3_188 = input.LA(1);

                         
                        int index3_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_188);
                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA3_189 = input.LA(1);

                         
                        int index3_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_189);
                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA3_190 = input.LA(1);

                         
                        int index3_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_190);
                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA3_192 = input.LA(1);

                         
                        int index3_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_192);
                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA3_194 = input.LA(1);

                         
                        int index3_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_194);
                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA3_195 = input.LA(1);

                         
                        int index3_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_195);
                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA3_196 = input.LA(1);

                         
                        int index3_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_196);
                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA3_197 = input.LA(1);

                         
                        int index3_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_197);
                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA3_198 = input.LA(1);

                         
                        int index3_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_198);
                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA3_199 = input.LA(1);

                         
                        int index3_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_199);
                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA3_200 = input.LA(1);

                         
                        int index3_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_200);
                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA3_201 = input.LA(1);

                         
                        int index3_201 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_201);
                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA3_202 = input.LA(1);

                         
                        int index3_202 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_202);
                        if ( s>=0 ) return s;
                        break;
                    case 156 : 
                        int LA3_203 = input.LA(1);

                         
                        int index3_203 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_203);
                        if ( s>=0 ) return s;
                        break;
                    case 157 : 
                        int LA3_204 = input.LA(1);

                         
                        int index3_204 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_204);
                        if ( s>=0 ) return s;
                        break;
                    case 158 : 
                        int LA3_205 = input.LA(1);

                         
                        int index3_205 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_205);
                        if ( s>=0 ) return s;
                        break;
                    case 159 : 
                        int LA3_206 = input.LA(1);

                         
                        int index3_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_206);
                        if ( s>=0 ) return s;
                        break;
                    case 160 : 
                        int LA3_207 = input.LA(1);

                         
                        int index3_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_207);
                        if ( s>=0 ) return s;
                        break;
                    case 161 : 
                        int LA3_210 = input.LA(1);

                         
                        int index3_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_210);
                        if ( s>=0 ) return s;
                        break;
                    case 162 : 
                        int LA3_211 = input.LA(1);

                         
                        int index3_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_211);
                        if ( s>=0 ) return s;
                        break;
                    case 163 : 
                        int LA3_212 = input.LA(1);

                         
                        int index3_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_212);
                        if ( s>=0 ) return s;
                        break;
                    case 164 : 
                        int LA3_213 = input.LA(1);

                         
                        int index3_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_213);
                        if ( s>=0 ) return s;
                        break;
                    case 165 : 
                        int LA3_214 = input.LA(1);

                         
                        int index3_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_214);
                        if ( s>=0 ) return s;
                        break;
                    case 166 : 
                        int LA3_215 = input.LA(1);

                         
                        int index3_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_215);
                        if ( s>=0 ) return s;
                        break;
                    case 167 : 
                        int LA3_216 = input.LA(1);

                         
                        int index3_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_216);
                        if ( s>=0 ) return s;
                        break;
                    case 168 : 
                        int LA3_217 = input.LA(1);

                         
                        int index3_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_217);
                        if ( s>=0 ) return s;
                        break;
                    case 169 : 
                        int LA3_218 = input.LA(1);

                         
                        int index3_218 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_218);
                        if ( s>=0 ) return s;
                        break;
                    case 170 : 
                        int LA3_219 = input.LA(1);

                         
                        int index3_219 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_219);
                        if ( s>=0 ) return s;
                        break;
                    case 171 : 
                        int LA3_220 = input.LA(1);

                         
                        int index3_220 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_220);
                        if ( s>=0 ) return s;
                        break;
                    case 172 : 
                        int LA3_221 = input.LA(1);

                         
                        int index3_221 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_221);
                        if ( s>=0 ) return s;
                        break;
                    case 173 : 
                        int LA3_222 = input.LA(1);

                         
                        int index3_222 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_222);
                        if ( s>=0 ) return s;
                        break;
                    case 174 : 
                        int LA3_224 = input.LA(1);

                         
                        int index3_224 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_224);
                        if ( s>=0 ) return s;
                        break;
                    case 175 : 
                        int LA3_226 = input.LA(1);

                         
                        int index3_226 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_226);
                        if ( s>=0 ) return s;
                        break;
                    case 176 : 
                        int LA3_227 = input.LA(1);

                         
                        int index3_227 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_227);
                        if ( s>=0 ) return s;
                        break;
                    case 177 : 
                        int LA3_228 = input.LA(1);

                         
                        int index3_228 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_228);
                        if ( s>=0 ) return s;
                        break;
                    case 178 : 
                        int LA3_229 = input.LA(1);

                         
                        int index3_229 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_229);
                        if ( s>=0 ) return s;
                        break;
                    case 179 : 
                        int LA3_230 = input.LA(1);

                         
                        int index3_230 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_230);
                        if ( s>=0 ) return s;
                        break;
                    case 180 : 
                        int LA3_231 = input.LA(1);

                         
                        int index3_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_231);
                        if ( s>=0 ) return s;
                        break;
                    case 181 : 
                        int LA3_232 = input.LA(1);

                         
                        int index3_232 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_232);
                        if ( s>=0 ) return s;
                        break;
                    case 182 : 
                        int LA3_233 = input.LA(1);

                         
                        int index3_233 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_233);
                        if ( s>=0 ) return s;
                        break;
                    case 183 : 
                        int LA3_234 = input.LA(1);

                         
                        int index3_234 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_234);
                        if ( s>=0 ) return s;
                        break;
                    case 184 : 
                        int LA3_235 = input.LA(1);

                         
                        int index3_235 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_235);
                        if ( s>=0 ) return s;
                        break;
                    case 185 : 
                        int LA3_236 = input.LA(1);

                         
                        int index3_236 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_236);
                        if ( s>=0 ) return s;
                        break;
                    case 186 : 
                        int LA3_237 = input.LA(1);

                         
                        int index3_237 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_237);
                        if ( s>=0 ) return s;
                        break;
                    case 187 : 
                        int LA3_238 = input.LA(1);

                         
                        int index3_238 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_238);
                        if ( s>=0 ) return s;
                        break;
                    case 188 : 
                        int LA3_239 = input.LA(1);

                         
                        int index3_239 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_239);
                        if ( s>=0 ) return s;
                        break;
                    case 189 : 
                        int LA3_242 = input.LA(1);

                         
                        int index3_242 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_242);
                        if ( s>=0 ) return s;
                        break;
                    case 190 : 
                        int LA3_243 = input.LA(1);

                         
                        int index3_243 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_243);
                        if ( s>=0 ) return s;
                        break;
                    case 191 : 
                        int LA3_244 = input.LA(1);

                         
                        int index3_244 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_244);
                        if ( s>=0 ) return s;
                        break;
                    case 192 : 
                        int LA3_245 = input.LA(1);

                         
                        int index3_245 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_245);
                        if ( s>=0 ) return s;
                        break;
                    case 193 : 
                        int LA3_246 = input.LA(1);

                         
                        int index3_246 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_246);
                        if ( s>=0 ) return s;
                        break;
                    case 194 : 
                        int LA3_247 = input.LA(1);

                         
                        int index3_247 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_247);
                        if ( s>=0 ) return s;
                        break;
                    case 195 : 
                        int LA3_248 = input.LA(1);

                         
                        int index3_248 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_248);
                        if ( s>=0 ) return s;
                        break;
                    case 196 : 
                        int LA3_249 = input.LA(1);

                         
                        int index3_249 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_249);
                        if ( s>=0 ) return s;
                        break;
                    case 197 : 
                        int LA3_250 = input.LA(1);

                         
                        int index3_250 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_250);
                        if ( s>=0 ) return s;
                        break;
                    case 198 : 
                        int LA3_251 = input.LA(1);

                         
                        int index3_251 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_251);
                        if ( s>=0 ) return s;
                        break;
                    case 199 : 
                        int LA3_252 = input.LA(1);

                         
                        int index3_252 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_252);
                        if ( s>=0 ) return s;
                        break;
                    case 200 : 
                        int LA3_253 = input.LA(1);

                         
                        int index3_253 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_253);
                        if ( s>=0 ) return s;
                        break;
                    case 201 : 
                        int LA3_254 = input.LA(1);

                         
                        int index3_254 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_254);
                        if ( s>=0 ) return s;
                        break;
                    case 202 : 
                        int LA3_255 = input.LA(1);

                         
                        int index3_255 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_255);
                        if ( s>=0 ) return s;
                        break;
                    case 203 : 
                        int LA3_258 = input.LA(1);

                         
                        int index3_258 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_258);
                        if ( s>=0 ) return s;
                        break;
                    case 204 : 
                        int LA3_259 = input.LA(1);

                         
                        int index3_259 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_259);
                        if ( s>=0 ) return s;
                        break;
                    case 205 : 
                        int LA3_260 = input.LA(1);

                         
                        int index3_260 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_260);
                        if ( s>=0 ) return s;
                        break;
                    case 206 : 
                        int LA3_261 = input.LA(1);

                         
                        int index3_261 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_261);
                        if ( s>=0 ) return s;
                        break;
                    case 207 : 
                        int LA3_262 = input.LA(1);

                         
                        int index3_262 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_262);
                        if ( s>=0 ) return s;
                        break;
                    case 208 : 
                        int LA3_263 = input.LA(1);

                         
                        int index3_263 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_263);
                        if ( s>=0 ) return s;
                        break;
                    case 209 : 
                        int LA3_264 = input.LA(1);

                         
                        int index3_264 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_264);
                        if ( s>=0 ) return s;
                        break;
                    case 210 : 
                        int LA3_265 = input.LA(1);

                         
                        int index3_265 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_265);
                        if ( s>=0 ) return s;
                        break;
                    case 211 : 
                        int LA3_266 = input.LA(1);

                         
                        int index3_266 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_266);
                        if ( s>=0 ) return s;
                        break;
                    case 212 : 
                        int LA3_267 = input.LA(1);

                         
                        int index3_267 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_267);
                        if ( s>=0 ) return s;
                        break;
                    case 213 : 
                        int LA3_268 = input.LA(1);

                         
                        int index3_268 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_268);
                        if ( s>=0 ) return s;
                        break;
                    case 214 : 
                        int LA3_269 = input.LA(1);

                         
                        int index3_269 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_269);
                        if ( s>=0 ) return s;
                        break;
                    case 215 : 
                        int LA3_270 = input.LA(1);

                         
                        int index3_270 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_270);
                        if ( s>=0 ) return s;
                        break;
                    case 216 : 
                        int LA3_271 = input.LA(1);

                         
                        int index3_271 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_271);
                        if ( s>=0 ) return s;
                        break;
                    case 217 : 
                        int LA3_274 = input.LA(1);

                         
                        int index3_274 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_274);
                        if ( s>=0 ) return s;
                        break;
                    case 218 : 
                        int LA3_275 = input.LA(1);

                         
                        int index3_275 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_275);
                        if ( s>=0 ) return s;
                        break;
                    case 219 : 
                        int LA3_276 = input.LA(1);

                         
                        int index3_276 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 25;}

                        else if ( (true) ) {s = 60;}

                         
                        input.seek(index3_276);
                        if ( s>=0 ) return s;
                        break;
                    case 220 : 
                        int LA3_277 = input.LA(1);

                         
                        int index3_277 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_277);
                        if ( s>=0 ) return s;
                        break;
                    case 221 : 
                        int LA3_278 = input.LA(1);

                         
                        int index3_278 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_278);
                        if ( s>=0 ) return s;
                        break;
                    case 222 : 
                        int LA3_279 = input.LA(1);

                         
                        int index3_279 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_279);
                        if ( s>=0 ) return s;
                        break;
                    case 223 : 
                        int LA3_280 = input.LA(1);

                         
                        int index3_280 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_280);
                        if ( s>=0 ) return s;
                        break;
                    case 224 : 
                        int LA3_281 = input.LA(1);

                         
                        int index3_281 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_281);
                        if ( s>=0 ) return s;
                        break;
                    case 225 : 
                        int LA3_282 = input.LA(1);

                         
                        int index3_282 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_282);
                        if ( s>=0 ) return s;
                        break;
                    case 226 : 
                        int LA3_283 = input.LA(1);

                         
                        int index3_283 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_283);
                        if ( s>=0 ) return s;
                        break;
                    case 227 : 
                        int LA3_284 = input.LA(1);

                         
                        int index3_284 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_284);
                        if ( s>=0 ) return s;
                        break;
                    case 228 : 
                        int LA3_285 = input.LA(1);

                         
                        int index3_285 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_285);
                        if ( s>=0 ) return s;
                        break;
                    case 229 : 
                        int LA3_286 = input.LA(1);

                         
                        int index3_286 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_286);
                        if ( s>=0 ) return s;
                        break;
                    case 230 : 
                        int LA3_287 = input.LA(1);

                         
                        int index3_287 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_287);
                        if ( s>=0 ) return s;
                        break;
                    case 231 : 
                        int LA3_288 = input.LA(1);

                         
                        int index3_288 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_288);
                        if ( s>=0 ) return s;
                        break;
                    case 232 : 
                        int LA3_289 = input.LA(1);

                         
                        int index3_289 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_289);
                        if ( s>=0 ) return s;
                        break;
                    case 233 : 
                        int LA3_290 = input.LA(1);

                         
                        int index3_290 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_290);
                        if ( s>=0 ) return s;
                        break;
                    case 234 : 
                        int LA3_291 = input.LA(1);

                         
                        int index3_291 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_291);
                        if ( s>=0 ) return s;
                        break;
                    case 235 : 
                        int LA3_292 = input.LA(1);

                         
                        int index3_292 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_292);
                        if ( s>=0 ) return s;
                        break;
                    case 236 : 
                        int LA3_293 = input.LA(1);

                         
                        int index3_293 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_293);
                        if ( s>=0 ) return s;
                        break;
                    case 237 : 
                        int LA3_294 = input.LA(1);

                         
                        int index3_294 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_294);
                        if ( s>=0 ) return s;
                        break;
                    case 238 : 
                        int LA3_295 = input.LA(1);

                         
                        int index3_295 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_295);
                        if ( s>=0 ) return s;
                        break;
                    case 239 : 
                        int LA3_296 = input.LA(1);

                         
                        int index3_296 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_296);
                        if ( s>=0 ) return s;
                        break;
                    case 240 : 
                        int LA3_297 = input.LA(1);

                         
                        int index3_297 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_297);
                        if ( s>=0 ) return s;
                        break;
                    case 241 : 
                        int LA3_298 = input.LA(1);

                         
                        int index3_298 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_298);
                        if ( s>=0 ) return s;
                        break;
                    case 242 : 
                        int LA3_299 = input.LA(1);

                         
                        int index3_299 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_299);
                        if ( s>=0 ) return s;
                        break;
                    case 243 : 
                        int LA3_300 = input.LA(1);

                         
                        int index3_300 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_300);
                        if ( s>=0 ) return s;
                        break;
                    case 244 : 
                        int LA3_301 = input.LA(1);

                         
                        int index3_301 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_301);
                        if ( s>=0 ) return s;
                        break;
                    case 245 : 
                        int LA3_302 = input.LA(1);

                         
                        int index3_302 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_302);
                        if ( s>=0 ) return s;
                        break;
                    case 246 : 
                        int LA3_303 = input.LA(1);

                         
                        int index3_303 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_303);
                        if ( s>=0 ) return s;
                        break;
                    case 247 : 
                        int LA3_304 = input.LA(1);

                         
                        int index3_304 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_304);
                        if ( s>=0 ) return s;
                        break;
                    case 248 : 
                        int LA3_305 = input.LA(1);

                         
                        int index3_305 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_305);
                        if ( s>=0 ) return s;
                        break;
                    case 249 : 
                        int LA3_306 = input.LA(1);

                         
                        int index3_306 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_306);
                        if ( s>=0 ) return s;
                        break;
                    case 250 : 
                        int LA3_307 = input.LA(1);

                         
                        int index3_307 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_307);
                        if ( s>=0 ) return s;
                        break;
                    case 251 : 
                        int LA3_308 = input.LA(1);

                         
                        int index3_308 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_308);
                        if ( s>=0 ) return s;
                        break;
                    case 252 : 
                        int LA3_309 = input.LA(1);

                         
                        int index3_309 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_309);
                        if ( s>=0 ) return s;
                        break;
                    case 253 : 
                        int LA3_310 = input.LA(1);

                         
                        int index3_310 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_310);
                        if ( s>=0 ) return s;
                        break;
                    case 254 : 
                        int LA3_311 = input.LA(1);

                         
                        int index3_311 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_311);
                        if ( s>=0 ) return s;
                        break;
                    case 255 : 
                        int LA3_312 = input.LA(1);

                         
                        int index3_312 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 314;}

                        else if ( (synpred5_Php()) ) {s = 313;}

                         
                        input.seek(index3_312);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA2_eotS =
        "\32\uffff";
    static final String DFA2_eofS =
        "\32\uffff";
    static final String DFA2_minS =
        "\1\6\31\uffff";
    static final String DFA2_maxS =
        "\1\141\31\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\27\uffff\1\2";
    static final String DFA2_specialS =
        "\32\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\3\1\13\uffff\5\1\4\uffff\1\1\31\uffff"+
            "\1\31\1\1\1\uffff\2\1\5\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "160:7: ( simpleStatement )?";
        }
    }
    static final String DFA4_eotS =
        "\46\uffff";
    static final String DFA4_eofS =
        "\46\uffff";
    static final String DFA4_minS =
        "\1\6\45\uffff";
    static final String DFA4_maxS =
        "\1\141\45\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\2\1\1\43\uffff";
    static final String DFA4_specialS =
        "\46\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\3\uffff\1\2\1\1\5\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\4\2\2\uffff\5\2\2\uffff"+
            "\6\2\4\uffff\3\2\2\uffff\1\2\24\uffff\2\2\1\uffff\2\2\5\uffff"+
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
            "",
            ""
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
            return "()* loopback of 171:16: (stmts= statement )*";
        }
    }
    static final String DFA24_eotS =
        "\121\uffff";
    static final String DFA24_eofS =
        "\1\3\120\uffff";
    static final String DFA24_minS =
        "\1\6\2\0\116\uffff";
    static final String DFA24_maxS =
        "\1\141\2\0\116\uffff";
    static final String DFA24_acceptS =
        "\3\uffff\1\2\50\uffff\1\1\44\uffff";
    static final String DFA24_specialS =
        "\1\uffff\1\0\1\1\116\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\3\3\uffff\2\3\5\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\4\3\1\2\1\1\15\3\4\uffff"+
            "\3\3\2\uffff\1\3\24\uffff\2\3\1\uffff\2\3\5\uffff\7\3",
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
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "234:58: ( conditional )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_Php()) ) {s = 44;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_Php()) ) {s = 44;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\23\uffff";
    static final String DFA25_eofS =
        "\23\uffff";
    static final String DFA25_minS =
        "\1\6\22\uffff";
    static final String DFA25_maxS =
        "\1\141\22\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA25_specialS =
        "\23\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\22\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\32\uffff\1\1"+
            "\1\uffff\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "238:31: (whileCondition= expression )?";
        }
    }
    static final String DFA31_eotS =
        "\31\uffff";
    static final String DFA31_eofS =
        "\31\uffff";
    static final String DFA31_minS =
        "\1\6\30\uffff";
    static final String DFA31_maxS =
        "\1\141\30\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\20\uffff";
    static final String DFA31_specialS =
        "\31\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\10\12\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\1"+
            "\uffff\1\10\3\uffff\1\10\1\uffff\2\10\1\1\13\uffff\1\4\1\5\1"+
            "\6\1\2\1\3\4\uffff\1\10\32\uffff\1\10\1\uffff\1\10\1\7\5\uffff"+
            "\7\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "244:1: simpleStatement : ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression );";
        }
    }
    static final String DFA30_eotS =
        "\25\uffff";
    static final String DFA30_eofS =
        "\1\22\24\uffff";
    static final String DFA30_minS =
        "\1\4\24\uffff";
    static final String DFA30_maxS =
        "\1\141\24\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\20\uffff\1\2\2\uffff";
    static final String DFA30_specialS =
        "\25\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\22\1\uffff\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\31\uffff"+
            "\1\22\1\1\1\uffff\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "251:15: ( expression )?";
        }
    }
    static final String DFA32_eotS =
        "\121\uffff";
    static final String DFA32_eofS =
        "\1\3\120\uffff";
    static final String DFA32_minS =
        "\1\6\2\0\116\uffff";
    static final String DFA32_maxS =
        "\1\141\2\0\116\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\1\2\50\uffff\1\1\44\uffff";
    static final String DFA32_specialS =
        "\1\uffff\1\0\1\1\116\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\3\3\uffff\2\3\5\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\4\3\1\2\1\1\15\3\4\uffff"+
            "\3\3\2\uffff\1\3\24\uffff\2\3\1\uffff\2\3\5\uffff\7\3",
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
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "258:62: ( conditional )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_Php()) ) {s = 44;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_Php()) ) {s = 44;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\23\uffff";
    static final String DFA34_eofS =
        "\23\uffff";
    static final String DFA34_minS =
        "\1\4\22\uffff";
    static final String DFA34_maxS =
        "\1\141\22\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA34_specialS =
        "\23\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\22\1\uffff\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\32\uffff"+
            "\1\1\1\uffff\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "263:7: ( commaList )?";
        }
    }
    static final String DFA35_eotS =
        "\23\uffff";
    static final String DFA35_eofS =
        "\23\uffff";
    static final String DFA35_minS =
        "\1\4\22\uffff";
    static final String DFA35_maxS =
        "\1\141\22\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA35_specialS =
        "\23\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\22\1\uffff\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\32\uffff"+
            "\1\1\1\uffff\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "267:7: ( commaList )?";
        }
    }
    static final String DFA36_eotS =
        "\23\uffff";
    static final String DFA36_eofS =
        "\23\uffff";
    static final String DFA36_minS =
        "\1\6\22\uffff";
    static final String DFA36_maxS =
        "\1\141\22\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA36_specialS =
        "\23\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\1\22\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\32\uffff\1\1"+
            "\1\uffff\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "271:7: ( commaList )?";
        }
    }
    static final String DFA38_eotS =
        "\50\uffff";
    static final String DFA38_eofS =
        "\1\1\47\uffff";
    static final String DFA38_minS =
        "\1\6\47\uffff";
    static final String DFA38_maxS =
        "\1\141\47\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\43\uffff";
    static final String DFA38_specialS =
        "\50\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\4\3\uffff\1\4\6\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff\4\4\2\uffff\5\4\2\1\6\4"+
            "\4\uffff\3\4\2\uffff\1\4\24\uffff\2\4\1\uffff\2\4\5\uffff\7"+
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
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()* loopback of 279:29: ( statement )*";
        }
    }
    static final String DFA39_eotS =
        "\46\uffff";
    static final String DFA39_eofS =
        "\46\uffff";
    static final String DFA39_minS =
        "\1\6\45\uffff";
    static final String DFA39_maxS =
        "\1\141\45\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\2\1\1\43\uffff";
    static final String DFA39_specialS =
        "\46\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\2\3\uffff\1\2\1\1\5\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff\4\2\2\uffff\5\2\2\uffff"+
            "\6\2\4\uffff\3\2\2\uffff\1\2\24\uffff\2\2\1\uffff\2\2\5\uffff"+
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
            return "()* loopback of 283:22: ( statement )*";
        }
    }
    static final String DFA45_eotS =
        "\36\uffff";
    static final String DFA45_eofS =
        "\1\1\35\uffff";
    static final String DFA45_minS =
        "\1\4\10\uffff\1\0\24\uffff";
    static final String DFA45_maxS =
        "\1\121\10\uffff\1\0\24\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\2\33\uffff\1\1";
    static final String DFA45_specialS =
        "\11\uffff\1\0\24\uffff}>";
    static final String[] DFA45_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\7\uffff\1\1\36\uffff"+
            "\1\1\1\11\1\1\33\uffff\1\1",
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
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "()* loopback of 313:22: ( Or weakLogicalXor )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_9 = input.LA(1);

                         
                        int index45_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_Php()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index45_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\36\uffff";
    static final String DFA46_eofS =
        "\1\1\35\uffff";
    static final String DFA46_minS =
        "\1\4\10\uffff\1\0\24\uffff";
    static final String DFA46_maxS =
        "\1\121\10\uffff\1\0\24\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\2\33\uffff\1\1";
    static final String DFA46_specialS =
        "\11\uffff\1\0\24\uffff}>";
    static final String[] DFA46_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\7\uffff\1\1\36\uffff"+
            "\2\1\1\11\33\uffff\1\1",
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
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "()* loopback of 317:22: ( Xor weakLogicalAnd )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_9 = input.LA(1);

                         
                        int index46_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_Php()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index46_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\36\uffff";
    static final String DFA47_eofS =
        "\1\1\35\uffff";
    static final String DFA47_minS =
        "\1\4\10\uffff\1\0\24\uffff";
    static final String DFA47_maxS =
        "\1\121\10\uffff\1\0\24\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\33\uffff\1\1";
    static final String DFA47_specialS =
        "\11\uffff\1\0\24\uffff}>";
    static final String[] DFA47_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\7\uffff\1\1\36\uffff"+
            "\1\11\2\1\33\uffff\1\1",
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
            return "()* loopback of 321:18: ( And assignment )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_9 = input.LA(1);

                         
                        int index47_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_Php()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index47_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\60\uffff";
    static final String DFA48_eofS =
        "\2\uffff\1\4\55\uffff";
    static final String DFA48_minS =
        "\1\6\1\uffff\1\4\1\23\16\uffff\1\0\13\uffff\2\0\16\uffff\2\0";
    static final String DFA48_maxS =
        "\1\141\1\uffff\1\133\1\122\16\uffff\1\0\13\uffff\2\0\16\uffff\2"+
        "\0";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\53\uffff";
    static final String DFA48_specialS =
        "\22\uffff\1\0\13\uffff\1\1\1\2\16\uffff\1\3\1\4}>";
    static final String[] DFA48_transitionS = {
            "\1\4\12\uffff\1\4\1\uffff\1\3\2\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\25\uffff\1\1\32\uffff\1\2\1\uffff"+
            "\1\4\6\uffff\7\4",
            "",
            "\4\4\1\36\1\4\2\uffff\3\4\1\22\1\37\1\uffff\1\4\1\uffff\4\4"+
            "\1\uffff\5\4\1\uffff\1\1\23\uffff\4\4\32\uffff\1\4\4\uffff\1"+
            "\1\3\4\1\uffff\1\4",
            "\1\56\76\uffff\1\57",
            "",
            "",
            "",
            "",
            "",
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
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "324:1: assignment : ( listVariables ( ( Equals | AsignmentOperator ) assignment ) | ternary );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_18 = input.LA(1);

                         
                        int index48_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index48_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_30 = input.LA(1);

                         
                        int index48_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index48_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_31 = input.LA(1);

                         
                        int index48_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index48_31);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_46 = input.LA(1);

                         
                        int index48_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index48_46);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA48_47 = input.LA(1);

                         
                        int index48_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index48_47);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\u00ea\uffff";
    static final String DFA51_eofS =
        "\5\uffff\1\117\3\uffff\6\117\u00db\uffff";
    static final String DFA51_minS =
        "\2\6\1\23\1\6\1\23\1\4\3\23\6\4\1\6\1\23\76\0\13\uffff\1\0\1\uffff"+
        "\21\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14"+
        "\uffff\12\0\14\uffff\3\0";
    static final String DFA51_maxS =
        "\4\141\1\122\1\133\3\122\6\131\1\6\1\122\76\0\13\uffff\1\0\1\uffff"+
        "\21\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14"+
        "\uffff\12\0\14\uffff\3\0";
    static final String DFA51_acceptS =
        "\117\uffff\1\2\13\uffff\1\1\u008e\uffff";
    static final String DFA51_specialS =
        "\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
        "\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\13\uffff"+
        "\1\76\1\uffff\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107"+
        "\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\14\uffff\1\120"+
        "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\14\uffff"+
        "\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\14"+
        "\uffff\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155"+
        "\14\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166"+
        "\1\167\14\uffff\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177"+
        "\1\u0080\1\u0081\14\uffff\1\u0082\1\u0083\1\u0084}>";
    static final String[] DFA51_transitionS = {
            "\1\3\12\uffff\1\2\1\uffff\1\6\2\uffff\1\20\1\uffff\1\1\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\1\7\1\10\60\uffff\1\5\1\uffff\1\14"+
            "\6\uffff\1\4\1\17\1\11\1\12\1\13\1\15\1\16",
            "\1\23\12\uffff\1\22\1\uffff\1\26\2\uffff\1\40\1\uffff\1\21"+
            "\1\uffff\1\22\3\uffff\1\22\1\uffff\1\27\1\30\60\uffff\1\25\1"+
            "\uffff\1\34\6\uffff\1\24\1\37\1\31\1\32\1\33\1\35\1\36",
            "\1\43\2\uffff\1\55\11\uffff\1\44\1\45\60\uffff\1\42\1\uffff"+
            "\1\51\6\uffff\1\41\1\54\1\46\1\47\1\50\1\52\1\53",
            "\1\64\12\uffff\1\63\1\uffff\1\61\2\uffff\1\77\1\uffff\1\62"+
            "\1\uffff\1\63\3\uffff\1\63\1\uffff\1\66\1\67\25\uffff\1\57\32"+
            "\uffff\1\60\1\uffff\1\73\5\uffff\1\56\1\65\1\76\1\70\1\71\1"+
            "\72\1\74\1\75",
            "\1\101\76\uffff\1\100",
            "\2\117\1\132\1\117\1\103\1\117\2\uffff\1\117\1\116\1\115\1"+
            "\102\1\104\1\uffff\1\133\1\uffff\1\117\1\107\1\113\1\114\1\uffff"+
            "\2\107\3\106\25\uffff\3\117\1\105\32\uffff\1\117\5\uffff\1\112"+
            "\1\111\1\110\1\uffff\1\134",
            "\1\135\76\uffff\1\136",
            "\1\140\76\uffff\1\137",
            "\1\142\76\uffff\1\141",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\154\1\153"+
            "\3\uffff\1\133\1\uffff\1\117\1\145\1\151\1\152\1\uffff\2\145"+
            "\3\144\25\uffff\3\117\1\143\32\uffff\1\117\5\uffff\1\150\1\147"+
            "\1\146",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\u0082\1"+
            "\u0081\3\uffff\1\133\1\uffff\1\117\1\173\1\177\1\u0080\1\uffff"+
            "\2\173\3\172\25\uffff\3\117\1\171\32\uffff\1\117\5\uffff\1\176"+
            "\1\175\1\174",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\u0098\1"+
            "\u0097\3\uffff\1\133\1\uffff\1\117\1\u0091\1\u0095\1\u0096\1"+
            "\uffff\2\u0091\3\u0090\25\uffff\3\117\1\u008f\32\uffff\1\117"+
            "\5\uffff\1\u0094\1\u0093\1\u0092",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\u00ae\1"+
            "\u00ad\3\uffff\1\133\1\uffff\1\117\1\u00a7\1\u00ab\1\u00ac\1"+
            "\uffff\2\u00a7\3\u00a6\25\uffff\3\117\1\u00a5\32\uffff\1\117"+
            "\5\uffff\1\u00aa\1\u00a9\1\u00a8",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\u00c4\1"+
            "\u00c3\3\uffff\1\133\1\uffff\1\117\1\u00bd\1\u00c1\1\u00c2\1"+
            "\uffff\2\u00bd\3\u00bc\25\uffff\3\117\1\u00bb\32\uffff\1\117"+
            "\5\uffff\1\u00c0\1\u00bf\1\u00be",
            "\2\117\1\uffff\1\117\1\uffff\1\117\2\uffff\1\117\1\u00da\1"+
            "\u00d9\3\uffff\1\133\1\uffff\1\117\1\u00d3\1\u00d7\1\u00d8\1"+
            "\uffff\2\u00d3\3\u00d2\25\uffff\3\117\1\u00d1\32\uffff\1\117"+
            "\5\uffff\1\u00d6\1\u00d5\1\u00d4",
            "\1\u00e7",
            "\1\u00e9\76\uffff\1\u00e8",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "334:1: ternary : ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_17 = input.LA(1);

                         
                        int index51_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_18 = input.LA(1);

                         
                        int index51_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_19 = input.LA(1);

                         
                        int index51_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_20 = input.LA(1);

                         
                        int index51_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_20);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_21 = input.LA(1);

                         
                        int index51_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_22 = input.LA(1);

                         
                        int index51_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_23 = input.LA(1);

                         
                        int index51_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA51_24 = input.LA(1);

                         
                        int index51_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA51_25 = input.LA(1);

                         
                        int index51_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA51_26 = input.LA(1);

                         
                        int index51_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_26);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA51_27 = input.LA(1);

                         
                        int index51_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_27);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA51_28 = input.LA(1);

                         
                        int index51_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_28);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA51_29 = input.LA(1);

                         
                        int index51_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_29);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA51_30 = input.LA(1);

                         
                        int index51_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_30);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA51_31 = input.LA(1);

                         
                        int index51_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_31);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA51_32 = input.LA(1);

                         
                        int index51_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_32);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA51_33 = input.LA(1);

                         
                        int index51_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_33);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA51_34 = input.LA(1);

                         
                        int index51_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_34);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA51_35 = input.LA(1);

                         
                        int index51_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_35);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA51_36 = input.LA(1);

                         
                        int index51_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_36);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA51_37 = input.LA(1);

                         
                        int index51_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_37);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA51_38 = input.LA(1);

                         
                        int index51_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_38);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA51_39 = input.LA(1);

                         
                        int index51_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_39);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA51_40 = input.LA(1);

                         
                        int index51_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_40);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA51_41 = input.LA(1);

                         
                        int index51_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_41);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA51_42 = input.LA(1);

                         
                        int index51_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_42);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA51_43 = input.LA(1);

                         
                        int index51_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_43);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA51_44 = input.LA(1);

                         
                        int index51_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_44);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA51_45 = input.LA(1);

                         
                        int index51_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_45);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA51_46 = input.LA(1);

                         
                        int index51_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_46);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA51_47 = input.LA(1);

                         
                        int index51_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_47);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA51_48 = input.LA(1);

                         
                        int index51_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_48);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA51_49 = input.LA(1);

                         
                        int index51_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_49);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA51_50 = input.LA(1);

                         
                        int index51_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_50);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA51_51 = input.LA(1);

                         
                        int index51_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_51);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA51_52 = input.LA(1);

                         
                        int index51_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_52);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA51_53 = input.LA(1);

                         
                        int index51_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_53);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA51_54 = input.LA(1);

                         
                        int index51_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_54);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA51_55 = input.LA(1);

                         
                        int index51_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_55);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA51_56 = input.LA(1);

                         
                        int index51_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_56);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA51_57 = input.LA(1);

                         
                        int index51_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_57);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA51_58 = input.LA(1);

                         
                        int index51_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_58);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA51_59 = input.LA(1);

                         
                        int index51_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_59);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA51_60 = input.LA(1);

                         
                        int index51_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_60);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA51_61 = input.LA(1);

                         
                        int index51_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_61);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA51_62 = input.LA(1);

                         
                        int index51_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_62);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA51_63 = input.LA(1);

                         
                        int index51_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_63);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA51_64 = input.LA(1);

                         
                        int index51_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_64);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA51_65 = input.LA(1);

                         
                        int index51_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_65);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA51_66 = input.LA(1);

                         
                        int index51_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_66);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA51_67 = input.LA(1);

                         
                        int index51_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_67);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA51_68 = input.LA(1);

                         
                        int index51_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_68);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA51_69 = input.LA(1);

                         
                        int index51_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_69);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA51_70 = input.LA(1);

                         
                        int index51_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_70);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA51_71 = input.LA(1);

                         
                        int index51_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_71);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA51_72 = input.LA(1);

                         
                        int index51_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_72);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA51_73 = input.LA(1);

                         
                        int index51_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_73);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA51_74 = input.LA(1);

                         
                        int index51_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_74);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA51_75 = input.LA(1);

                         
                        int index51_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_75);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA51_76 = input.LA(1);

                         
                        int index51_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_76);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA51_77 = input.LA(1);

                         
                        int index51_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_77);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA51_78 = input.LA(1);

                         
                        int index51_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_78);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA51_90 = input.LA(1);

                         
                        int index51_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_90);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA51_92 = input.LA(1);

                         
                        int index51_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_92);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA51_93 = input.LA(1);

                         
                        int index51_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_93);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA51_94 = input.LA(1);

                         
                        int index51_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_94);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA51_95 = input.LA(1);

                         
                        int index51_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_95);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA51_96 = input.LA(1);

                         
                        int index51_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_96);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA51_97 = input.LA(1);

                         
                        int index51_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_97);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA51_98 = input.LA(1);

                         
                        int index51_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_98);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA51_99 = input.LA(1);

                         
                        int index51_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_99);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA51_100 = input.LA(1);

                         
                        int index51_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_100);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA51_101 = input.LA(1);

                         
                        int index51_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_101);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA51_102 = input.LA(1);

                         
                        int index51_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_102);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA51_103 = input.LA(1);

                         
                        int index51_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_103);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA51_104 = input.LA(1);

                         
                        int index51_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_104);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA51_105 = input.LA(1);

                         
                        int index51_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_105);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA51_106 = input.LA(1);

                         
                        int index51_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_106);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA51_107 = input.LA(1);

                         
                        int index51_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_107);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA51_108 = input.LA(1);

                         
                        int index51_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_108);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA51_121 = input.LA(1);

                         
                        int index51_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_121);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA51_122 = input.LA(1);

                         
                        int index51_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_122);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA51_123 = input.LA(1);

                         
                        int index51_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_123);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA51_124 = input.LA(1);

                         
                        int index51_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_124);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA51_125 = input.LA(1);

                         
                        int index51_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_125);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA51_126 = input.LA(1);

                         
                        int index51_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_126);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA51_127 = input.LA(1);

                         
                        int index51_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_127);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA51_128 = input.LA(1);

                         
                        int index51_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_128);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA51_129 = input.LA(1);

                         
                        int index51_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_129);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA51_130 = input.LA(1);

                         
                        int index51_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_130);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA51_143 = input.LA(1);

                         
                        int index51_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_143);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA51_144 = input.LA(1);

                         
                        int index51_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_144);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA51_145 = input.LA(1);

                         
                        int index51_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_145);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA51_146 = input.LA(1);

                         
                        int index51_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_146);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA51_147 = input.LA(1);

                         
                        int index51_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_147);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA51_148 = input.LA(1);

                         
                        int index51_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_148);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA51_149 = input.LA(1);

                         
                        int index51_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_149);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA51_150 = input.LA(1);

                         
                        int index51_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_150);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA51_151 = input.LA(1);

                         
                        int index51_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_151);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA51_152 = input.LA(1);

                         
                        int index51_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_152);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA51_165 = input.LA(1);

                         
                        int index51_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_165);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA51_166 = input.LA(1);

                         
                        int index51_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_166);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA51_167 = input.LA(1);

                         
                        int index51_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_167);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA51_168 = input.LA(1);

                         
                        int index51_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_168);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA51_169 = input.LA(1);

                         
                        int index51_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_169);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA51_170 = input.LA(1);

                         
                        int index51_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_170);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA51_171 = input.LA(1);

                         
                        int index51_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_171);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA51_172 = input.LA(1);

                         
                        int index51_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_172);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA51_173 = input.LA(1);

                         
                        int index51_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_173);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA51_174 = input.LA(1);

                         
                        int index51_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_174);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA51_187 = input.LA(1);

                         
                        int index51_187 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_187);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA51_188 = input.LA(1);

                         
                        int index51_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_188);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA51_189 = input.LA(1);

                         
                        int index51_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_189);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA51_190 = input.LA(1);

                         
                        int index51_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_190);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA51_191 = input.LA(1);

                         
                        int index51_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_191);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA51_192 = input.LA(1);

                         
                        int index51_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_192);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA51_193 = input.LA(1);

                         
                        int index51_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_193);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA51_194 = input.LA(1);

                         
                        int index51_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_194);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA51_195 = input.LA(1);

                         
                        int index51_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_195);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA51_196 = input.LA(1);

                         
                        int index51_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_196);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA51_209 = input.LA(1);

                         
                        int index51_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_209);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA51_210 = input.LA(1);

                         
                        int index51_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_210);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA51_211 = input.LA(1);

                         
                        int index51_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_211);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA51_212 = input.LA(1);

                         
                        int index51_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_212);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA51_213 = input.LA(1);

                         
                        int index51_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_213);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA51_214 = input.LA(1);

                         
                        int index51_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_214);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA51_215 = input.LA(1);

                         
                        int index51_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_215);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA51_216 = input.LA(1);

                         
                        int index51_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_216);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA51_217 = input.LA(1);

                         
                        int index51_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_217);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA51_218 = input.LA(1);

                         
                        int index51_218 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_218);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA51_231 = input.LA(1);

                         
                        int index51_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_231);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA51_232 = input.LA(1);

                         
                        int index51_232 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_232);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA51_233 = input.LA(1);

                         
                        int index51_233 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 79;}

                         
                        input.seek(index51_233);
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
        "\16\uffff";
    static final String DFA52_eofS =
        "\1\1\15\uffff";
    static final String DFA52_minS =
        "\1\4\15\uffff";
    static final String DFA52_maxS =
        "\1\121\15\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA52_specialS =
        "\16\uffff}>";
    static final String[] DFA52_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\15\4\uffff\1\1\1"+
            "\uffff\1\1\36\uffff\3\1\33\uffff\1\1",
            "",
            "",
            "",
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
            return "()* loopback of 340:18: ( LogicalOr logicalAnd )*";
        }
    }
    static final String DFA53_eotS =
        "\17\uffff";
    static final String DFA53_eofS =
        "\1\1\16\uffff";
    static final String DFA53_minS =
        "\1\4\16\uffff";
    static final String DFA53_maxS =
        "\1\121\16\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\14\uffff\1\1";
    static final String DFA53_specialS =
        "\17\uffff}>";
    static final String[] DFA53_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\16\3\uffff\1\1\1"+
            "\uffff\1\1\36\uffff\3\1\33\uffff\1\1",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 344:17: ( LogicalAnd bitwiseOr )*";
        }
    }
    static final String DFA54_eotS =
        "\20\uffff";
    static final String DFA54_eofS =
        "\1\1\17\uffff";
    static final String DFA54_minS =
        "\1\4\17\uffff";
    static final String DFA54_maxS =
        "\1\121\17\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA54_specialS =
        "\20\uffff}>";
    static final String[] DFA54_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\1\1\2\uffff\1\17\33\uffff\3\1\33\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 348:18: ( Pipe bitWiseAnd )*";
        }
    }
    static final String DFA55_eotS =
        "\21\uffff";
    static final String DFA55_eofS =
        "\1\1\20\uffff";
    static final String DFA55_minS =
        "\1\4\20\uffff";
    static final String DFA55_maxS =
        "\1\121\20\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\2\16\uffff\1\1";
    static final String DFA55_specialS =
        "\21\uffff}>";
    static final String[] DFA55_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\20\1\1\33\uffff\3\1\33\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 352:21: ( Ampersand equalityCheck )*";
        }
    }
    static final String DFA56_eotS =
        "\22\uffff";
    static final String DFA56_eofS =
        "\1\2\21\uffff";
    static final String DFA56_minS =
        "\1\4\21\uffff";
    static final String DFA56_maxS =
        "\1\127\21\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\1\2\17\uffff";
    static final String DFA56_specialS =
        "\22\uffff}>";
    static final String[] DFA56_transitionS = {
            "\2\2\1\uffff\1\2\1\uffff\1\2\2\uffff\3\2\3\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\2\2\33\uffff\3\2\33\uffff\1\2\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "356:24: ( EqualityOperator comparisionCheck )?";
        }
    }
    static final String DFA57_eotS =
        "\23\uffff";
    static final String DFA57_eofS =
        "\1\2\22\uffff";
    static final String DFA57_minS =
        "\1\4\22\uffff";
    static final String DFA57_maxS =
        "\1\130\22\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\1\1\2\20\uffff";
    static final String DFA57_specialS =
        "\23\uffff}>";
    static final String[] DFA57_transitionS = {
            "\2\2\1\uffff\1\2\1\uffff\1\2\2\uffff\3\2\3\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\2\2\33\uffff\3\2\33\uffff\1\2\5\uffff\1\2\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "360:20: ( ComparisionOperator bitWiseShift )?";
        }
    }
    static final String DFA58_eotS =
        "\24\uffff";
    static final String DFA58_eofS =
        "\1\1\23\uffff";
    static final String DFA58_minS =
        "\1\4\23\uffff";
    static final String DFA58_maxS =
        "\1\131\23\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\2\21\uffff\1\1";
    static final String DFA58_specialS =
        "\24\uffff}>";
    static final String[] DFA58_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\2\1\33\uffff\3\1\33\uffff\1\1\5\uffff\2\1\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 364:16: ( ShiftOperator addition )*";
        }
    }
    static final String DFA59_eotS =
        "\25\uffff";
    static final String DFA59_eofS =
        "\1\1\24\uffff";
    static final String DFA59_minS =
        "\1\4\24\uffff";
    static final String DFA59_maxS =
        "\1\131\24\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\2\22\uffff\1\1";
    static final String DFA59_specialS =
        "\25\uffff}>";
    static final String[] DFA59_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\1\1\1\24\2\1\1\uffff\2\24\30\uffff\3\1\33\uffff\1\1\5\uffff"+
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
            return "()* loopback of 368:22: ( ( Plus | Minus | Dot ) multiplication )*";
        }
    }
    static final String DFA60_eotS =
        "\26\uffff";
    static final String DFA60_eofS =
        "\1\1\25\uffff";
    static final String DFA60_minS =
        "\1\4\25\uffff";
    static final String DFA60_maxS =
        "\1\131\25\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\1\2\23\uffff\1\1";
    static final String DFA60_specialS =
        "\26\uffff}>";
    static final String[] DFA60_transitionS = {
            "\2\1\1\uffff\1\1\1\uffff\1\1\2\uffff\3\1\3\uffff\1\1\1\uffff"+
            "\4\1\1\uffff\2\1\3\25\25\uffff\3\1\33\uffff\1\1\5\uffff\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 372:18: ( ( Asterisk | Forwardslash | Percent ) logicalNot )*";
        }
    }
    static final String DFA61_eotS =
        "\21\uffff";
    static final String DFA61_eofS =
        "\21\uffff";
    static final String DFA61_minS =
        "\1\6\20\uffff";
    static final String DFA61_maxS =
        "\1\141\20\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\1\2\16\uffff";
    static final String DFA61_specialS =
        "\21\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\2\12\uffff\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff\1\1\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\2\2\60\uffff\1\2\1\uffff\1\2\6\uffff"+
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
            return "375:1: logicalNot : ( Bang logicalNot | instanceOf );";
        }
    }
    static final String DFA62_eotS =
        "\27\uffff";
    static final String DFA62_eofS =
        "\1\2\26\uffff";
    static final String DFA62_minS =
        "\1\4\26\uffff";
    static final String DFA62_maxS =
        "\1\131\26\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\1\1\2\24\uffff";
    static final String DFA62_specialS =
        "\27\uffff}>";
    static final String[] DFA62_transitionS = {
            "\2\2\1\uffff\1\2\1\uffff\1\2\2\uffff\3\2\3\uffff\1\2\1\uffff"+
            "\4\2\1\uffff\5\2\25\uffff\3\2\1\1\32\uffff\1\2\5\uffff\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "381:20: ( Instanceof negateOrCast )?";
        }
    }
    static final String DFA63_eotS =
        "\42\uffff";
    static final String DFA63_eofS =
        "\42\uffff";
    static final String DFA63_minS =
        "\1\6\1\uffff\1\6\37\uffff";
    static final String DFA63_maxS =
        "\1\141\1\uffff\1\141\37\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\14\uffff\1\2\1\3\20\uffff";
    static final String DFA63_specialS =
        "\42\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\2\12\uffff\1\1\1\uffff\1\3\2\uffff\1\3\3\uffff\1\1\3\uffff"+
            "\1\1\1\uffff\2\3\60\uffff\1\3\1\uffff\1\3\6\uffff\7\3",
            "",
            "\1\21\12\uffff\1\21\1\uffff\1\21\2\uffff\1\21\1\uffff\1\21"+
            "\1\uffff\1\21\3\uffff\1\21\1\uffff\2\21\25\uffff\1\21\32\uffff"+
            "\1\21\1\uffff\1\21\5\uffff\1\20\7\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "384:1: negateOrCast : ( ( Tilde | Minus | SuppressWarnings ) increment | OpenRoundBracket PrimitiveType CloseRoundBracket increment -> ^( Cast PrimitiveType increment ) | OpenRoundBracket weakLogicalAnd CloseRoundBracket | increment );";
        }
    }
    static final String DFA64_eotS =
        "\53\uffff";
    static final String DFA64_eofS =
        "\2\uffff\1\4\50\uffff";
    static final String DFA64_minS =
        "\1\23\1\uffff\1\4\1\23\12\uffff\1\0\1\uffff\2\0\27\uffff\2\0";
    static final String DFA64_maxS =
        "\1\141\1\uffff\1\133\1\122\12\uffff\1\0\1\uffff\2\0\27\uffff\2\0";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\15\uffff\1\2\30\uffff";
    static final String DFA64_specialS =
        "\16\uffff\1\0\1\uffff\1\1\1\2\27\uffff\1\3\1\4}>";
    static final String[] DFA64_transitionS = {
            "\1\3\2\uffff\1\4\11\uffff\2\4\60\uffff\1\2\1\uffff\1\4\6\uffff"+
            "\1\1\6\4",
            "",
            "\4\4\1\20\1\4\2\uffff\3\4\1\16\1\21\1\uffff\1\4\1\uffff\4\4"+
            "\1\uffff\5\4\25\uffff\4\4\32\uffff\1\4\5\uffff\3\4\1\uffff\1"+
            "\22",
            "\1\51\76\uffff\1\52",
            "",
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
            "\1\uffff",
            "\1\uffff"
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
            return "391:1: increment : ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_14 = input.LA(1);

                         
                        int index64_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index64_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_16 = input.LA(1);

                         
                        int index64_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index64_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_17 = input.LA(1);

                         
                        int index64_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index64_17);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA64_41 = input.LA(1);

                         
                        int index64_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index64_41);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA64_42 = input.LA(1);

                         
                        int index64_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index64_42);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\15\uffff";
    static final String DFA65_eofS =
        "\15\uffff";
    static final String DFA65_minS =
        "\1\23\14\uffff";
    static final String DFA65_maxS =
        "\1\141\14\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\1\3\11\uffff";
    static final String DFA65_specialS =
        "\15\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\3\2\uffff\1\3\11\uffff\1\1\1\2\60\uffff\1\3\1\uffff\1\3\7"+
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
            return "397:1: newOrClone : ( New nameOrFunctionCall | Clone name | atomOrReference );";
        }
    }
    static final String DFA66_eotS =
        "\13\uffff";
    static final String DFA66_eofS =
        "\13\uffff";
    static final String DFA66_minS =
        "\1\23\12\uffff";
    static final String DFA66_maxS =
        "\1\141\12\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\2\uffff";
    static final String DFA66_specialS =
        "\13\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\10\2\uffff\1\10\73\uffff\1\10\1\uffff\1\1\7\uffff\6\1",
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
            return "403:1: atomOrReference : ( atom | reference );";
        }
    }
    static final String DFA68_eotS =
        "\23\uffff";
    static final String DFA68_eofS =
        "\23\uffff";
    static final String DFA68_minS =
        "\1\6\22\uffff";
    static final String DFA68_maxS =
        "\1\141\22\uffff";
    static final String DFA68_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA68_specialS =
        "\23\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\1\1\22\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\32\uffff\1\1"+
            "\1\uffff\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "409:30: ( arrayEntry ( Comma arrayEntry )* )?";
        }
    }
    static final String DFA69_eotS =
        "\u00d1\uffff";
    static final String DFA69_eofS =
        "\2\uffff\1\44\7\uffff\6\44\u00c1\uffff";
    static final String DFA69_minS =
        "\2\6\1\5\1\23\1\6\1\23\1\6\3\23\6\5\1\6\1\23\22\0\4\uffff\107\0"+
        "\4\uffff\17\0\4\uffff\15\0\1\uffff\1\0\3\uffff\16\0\4\uffff\16\0"+
        "\4\uffff\16\0\4\uffff\3\0";
    static final String DFA69_maxS =
        "\1\141\1\6\1\133\1\122\3\141\3\122\6\131\1\6\1\122\22\0\4\uffff"+
        "\107\0\4\uffff\17\0\4\uffff\15\0\1\uffff\1\0\3\uffff\16\0\4\uffff"+
        "\16\0\4\uffff\16\0\4\uffff\3\0";
    static final String DFA69_acceptS =
        "\44\uffff\1\2\2\uffff\1\1\u00a9\uffff";
    static final String DFA69_specialS =
        "\22\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\4\uffff\1\22\1\23\1\24\1\25\1\26\1"+
        "\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
        "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
        "\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75"+
        "\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110"+
        "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123"+
        "\1\124\1\125\1\126\1\127\1\130\4\uffff\1\131\1\132\1\133\1\134\1"+
        "\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147"+
        "\4\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1"+
        "\161\1\162\1\163\1\164\1\uffff\1\165\3\uffff\1\166\1\167\1\170\1"+
        "\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082"+
        "\1\u0083\4\uffff\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089"+
        "\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091"+
        "\4\uffff\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
        "\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\4\uffff"+
        "\1\u00a0\1\u00a1\1\u00a2}>";
    static final String[] DFA69_transitionS = {
            "\1\6\12\uffff\1\5\1\uffff\1\3\2\uffff\1\21\1\uffff\1\4\1\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\10\1\11\25\uffff\1\1\32\uffff\1\2"+
            "\1\uffff\1\15\6\uffff\1\7\1\20\1\12\1\13\1\14\1\16\1\17",
            "\1\22",
            "\1\44\1\24\1\44\1\25\3\uffff\1\47\1\40\1\37\1\23\1\26\1\uffff"+
            "\1\50\2\uffff\1\31\1\35\1\36\1\uffff\2\31\3\30\1\uffff\1\51"+
            "\23\uffff\1\41\1\43\1\42\1\27\37\uffff\1\51\1\34\1\33\1\32\1"+
            "\uffff\1\52",
            "\1\53\76\uffff\1\54",
            "\1\57\12\uffff\1\56\1\uffff\1\62\2\uffff\1\74\1\uffff\1\55"+
            "\1\uffff\1\56\3\uffff\1\56\1\uffff\1\63\1\64\60\uffff\1\61\1"+
            "\uffff\1\70\6\uffff\1\60\1\73\1\65\1\66\1\67\1\71\1\72",
            "\1\77\2\uffff\1\111\11\uffff\1\100\1\101\60\uffff\1\76\1\uffff"+
            "\1\105\6\uffff\1\75\1\110\1\102\1\103\1\104\1\106\1\107",
            "\1\120\12\uffff\1\117\1\uffff\1\115\2\uffff\1\133\1\uffff\1"+
            "\116\1\uffff\1\117\3\uffff\1\117\1\uffff\1\122\1\123\25\uffff"+
            "\1\113\32\uffff\1\114\1\uffff\1\127\5\uffff\1\112\1\121\1\132"+
            "\1\124\1\125\1\126\1\130\1\131",
            "\1\135\76\uffff\1\134",
            "\1\137\76\uffff\1\136",
            "\1\141\76\uffff\1\140",
            "\1\44\1\uffff\1\44\4\uffff\1\47\1\153\1\152\3\uffff\1\163\2"+
            "\uffff\1\144\1\150\1\151\1\uffff\2\144\3\143\25\uffff\1\154"+
            "\1\156\1\155\1\142\40\uffff\1\147\1\146\1\145",
            "\1\44\1\uffff\1\44\4\uffff\1\47\1\175\1\174\3\uffff\1\176\2"+
            "\uffff\1\166\1\172\1\173\1\uffff\2\166\3\165\25\uffff\1\177"+
            "\1\u0081\1\u0080\1\164\40\uffff\1\171\1\170\1\167",
            "\1\44\1\uffff\1\44\4\uffff\1\47\1\u008f\1\u008e\3\uffff\1\u0094"+
            "\2\uffff\1\u0088\1\u008c\1\u008d\1\uffff\2\u0088\3\u0087\25"+
            "\uffff\1\u0090\1\u0092\1\u0091\1\u0086\40\uffff\1\u008b\1\u008a"+
            "\1\u0089",
            "\1\44\1\uffff\1\44\4\uffff\1\47\1\u00a1\1\u00a0\3\uffff\1\u00a2"+
            "\2\uffff\1\u009a\1\u009e\1\u009f\1\uffff\2\u009a\3\u0099\25"+
            "\uffff\1\u00a3\1\u00a5\1\u00a4\1\u0098\40\uffff\1\u009d\1\u009c"+
            "\1\u009b",
            "\1\44\1\uffff\1\44\4\uffff\1\47\1\u00b3\1\u00b2\3\uffff\1\u00b4"+
            "\2\uffff\1\u00ac\1\u00b0\1\u00b1\1\uffff\2\u00ac\3\u00ab\25"+
            "\uffff\1\u00b5\1\u00b7\1\u00b6\1\u00aa\40\uffff\1\u00af\1\u00ae"+
            "\1\u00ad",
            "\1\44\1\uffff\1\44\4\uffff\1\47\1\u00c5\1\u00c4\3\uffff\1\u00c6"+
            "\2\uffff\1\u00be\1\u00c2\1\u00c3\1\uffff\2\u00be\3\u00bd\25"+
            "\uffff\1\u00c7\1\u00c9\1\u00c8\1\u00bc\40\uffff\1\u00c1\1\u00c0"+
            "\1\u00bf",
            "\1\u00ce",
            "\1\u00d0\76\uffff\1\u00cf",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff"
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
            return "413:7: ( keyValuePair | expression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_18 = input.LA(1);

                         
                        int index69_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_19 = input.LA(1);

                         
                        int index69_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_20 = input.LA(1);

                         
                        int index69_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_20);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_21 = input.LA(1);

                         
                        int index69_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_21);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_22 = input.LA(1);

                         
                        int index69_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_22);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_23 = input.LA(1);

                         
                        int index69_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_23);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_24 = input.LA(1);

                         
                        int index69_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_24);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA69_25 = input.LA(1);

                         
                        int index69_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_25);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA69_26 = input.LA(1);

                         
                        int index69_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_26);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA69_27 = input.LA(1);

                         
                        int index69_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_27);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA69_28 = input.LA(1);

                         
                        int index69_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_28);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA69_29 = input.LA(1);

                         
                        int index69_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_29);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA69_30 = input.LA(1);

                         
                        int index69_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_30);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA69_31 = input.LA(1);

                         
                        int index69_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_31);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA69_32 = input.LA(1);

                         
                        int index69_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_32);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA69_33 = input.LA(1);

                         
                        int index69_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_33);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA69_34 = input.LA(1);

                         
                        int index69_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_34);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA69_35 = input.LA(1);

                         
                        int index69_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_35);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA69_40 = input.LA(1);

                         
                        int index69_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_40);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA69_41 = input.LA(1);

                         
                        int index69_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_41);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA69_42 = input.LA(1);

                         
                        int index69_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_42);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA69_43 = input.LA(1);

                         
                        int index69_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_43);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA69_44 = input.LA(1);

                         
                        int index69_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_44);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA69_45 = input.LA(1);

                         
                        int index69_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_45);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA69_46 = input.LA(1);

                         
                        int index69_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_46);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA69_47 = input.LA(1);

                         
                        int index69_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_47);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA69_48 = input.LA(1);

                         
                        int index69_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_48);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA69_49 = input.LA(1);

                         
                        int index69_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_49);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA69_50 = input.LA(1);

                         
                        int index69_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_50);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA69_51 = input.LA(1);

                         
                        int index69_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_51);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA69_52 = input.LA(1);

                         
                        int index69_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_52);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA69_53 = input.LA(1);

                         
                        int index69_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_53);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA69_54 = input.LA(1);

                         
                        int index69_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_54);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA69_55 = input.LA(1);

                         
                        int index69_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_55);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA69_56 = input.LA(1);

                         
                        int index69_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_56);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA69_57 = input.LA(1);

                         
                        int index69_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_57);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA69_58 = input.LA(1);

                         
                        int index69_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_58);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA69_59 = input.LA(1);

                         
                        int index69_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_59);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA69_60 = input.LA(1);

                         
                        int index69_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_60);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA69_61 = input.LA(1);

                         
                        int index69_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_61);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA69_62 = input.LA(1);

                         
                        int index69_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_62);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA69_63 = input.LA(1);

                         
                        int index69_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_63);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA69_64 = input.LA(1);

                         
                        int index69_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_64);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA69_65 = input.LA(1);

                         
                        int index69_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_65);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA69_66 = input.LA(1);

                         
                        int index69_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_66);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA69_67 = input.LA(1);

                         
                        int index69_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_67);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA69_68 = input.LA(1);

                         
                        int index69_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_68);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA69_69 = input.LA(1);

                         
                        int index69_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_69);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA69_70 = input.LA(1);

                         
                        int index69_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_70);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA69_71 = input.LA(1);

                         
                        int index69_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_71);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA69_72 = input.LA(1);

                         
                        int index69_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_72);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA69_73 = input.LA(1);

                         
                        int index69_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_73);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA69_74 = input.LA(1);

                         
                        int index69_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_74);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA69_75 = input.LA(1);

                         
                        int index69_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_75);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA69_76 = input.LA(1);

                         
                        int index69_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_76);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA69_77 = input.LA(1);

                         
                        int index69_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_77);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA69_78 = input.LA(1);

                         
                        int index69_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_78);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA69_79 = input.LA(1);

                         
                        int index69_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_79);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA69_80 = input.LA(1);

                         
                        int index69_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_80);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA69_81 = input.LA(1);

                         
                        int index69_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_81);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA69_82 = input.LA(1);

                         
                        int index69_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_82);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA69_83 = input.LA(1);

                         
                        int index69_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_83);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA69_84 = input.LA(1);

                         
                        int index69_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_84);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA69_85 = input.LA(1);

                         
                        int index69_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_85);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA69_86 = input.LA(1);

                         
                        int index69_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_86);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA69_87 = input.LA(1);

                         
                        int index69_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_87);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA69_88 = input.LA(1);

                         
                        int index69_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_88);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA69_89 = input.LA(1);

                         
                        int index69_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_89);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA69_90 = input.LA(1);

                         
                        int index69_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_90);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA69_91 = input.LA(1);

                         
                        int index69_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_91);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA69_92 = input.LA(1);

                         
                        int index69_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_92);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA69_93 = input.LA(1);

                         
                        int index69_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_93);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA69_94 = input.LA(1);

                         
                        int index69_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_94);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA69_95 = input.LA(1);

                         
                        int index69_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_95);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA69_96 = input.LA(1);

                         
                        int index69_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_96);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA69_97 = input.LA(1);

                         
                        int index69_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_97);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA69_98 = input.LA(1);

                         
                        int index69_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_98);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA69_99 = input.LA(1);

                         
                        int index69_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_99);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA69_100 = input.LA(1);

                         
                        int index69_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_100);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA69_101 = input.LA(1);

                         
                        int index69_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_101);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA69_102 = input.LA(1);

                         
                        int index69_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_102);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA69_103 = input.LA(1);

                         
                        int index69_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_103);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA69_104 = input.LA(1);

                         
                        int index69_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_104);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA69_105 = input.LA(1);

                         
                        int index69_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_105);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA69_106 = input.LA(1);

                         
                        int index69_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_106);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA69_107 = input.LA(1);

                         
                        int index69_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_107);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA69_108 = input.LA(1);

                         
                        int index69_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_108);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA69_109 = input.LA(1);

                         
                        int index69_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_109);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA69_110 = input.LA(1);

                         
                        int index69_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_110);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA69_115 = input.LA(1);

                         
                        int index69_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_115);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA69_116 = input.LA(1);

                         
                        int index69_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_116);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA69_117 = input.LA(1);

                         
                        int index69_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_117);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA69_118 = input.LA(1);

                         
                        int index69_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_118);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA69_119 = input.LA(1);

                         
                        int index69_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_119);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA69_120 = input.LA(1);

                         
                        int index69_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_120);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA69_121 = input.LA(1);

                         
                        int index69_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_121);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA69_122 = input.LA(1);

                         
                        int index69_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_122);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA69_123 = input.LA(1);

                         
                        int index69_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_123);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA69_124 = input.LA(1);

                         
                        int index69_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_124);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA69_125 = input.LA(1);

                         
                        int index69_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_125);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA69_126 = input.LA(1);

                         
                        int index69_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_126);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA69_127 = input.LA(1);

                         
                        int index69_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_127);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA69_128 = input.LA(1);

                         
                        int index69_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_128);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA69_129 = input.LA(1);

                         
                        int index69_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_129);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA69_134 = input.LA(1);

                         
                        int index69_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_134);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA69_135 = input.LA(1);

                         
                        int index69_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_135);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA69_136 = input.LA(1);

                         
                        int index69_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_136);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA69_137 = input.LA(1);

                         
                        int index69_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_137);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA69_138 = input.LA(1);

                         
                        int index69_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_138);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA69_139 = input.LA(1);

                         
                        int index69_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_139);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA69_140 = input.LA(1);

                         
                        int index69_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_140);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA69_141 = input.LA(1);

                         
                        int index69_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_141);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA69_142 = input.LA(1);

                         
                        int index69_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_142);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA69_143 = input.LA(1);

                         
                        int index69_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_143);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA69_144 = input.LA(1);

                         
                        int index69_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_144);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA69_145 = input.LA(1);

                         
                        int index69_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_145);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA69_146 = input.LA(1);

                         
                        int index69_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_146);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA69_148 = input.LA(1);

                         
                        int index69_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_148);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA69_152 = input.LA(1);

                         
                        int index69_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_152);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA69_153 = input.LA(1);

                         
                        int index69_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_153);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA69_154 = input.LA(1);

                         
                        int index69_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_154);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA69_155 = input.LA(1);

                         
                        int index69_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_155);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA69_156 = input.LA(1);

                         
                        int index69_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_156);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA69_157 = input.LA(1);

                         
                        int index69_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_157);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA69_158 = input.LA(1);

                         
                        int index69_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_158);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA69_159 = input.LA(1);

                         
                        int index69_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_159);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA69_160 = input.LA(1);

                         
                        int index69_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_160);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA69_161 = input.LA(1);

                         
                        int index69_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_161);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA69_162 = input.LA(1);

                         
                        int index69_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_162);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA69_163 = input.LA(1);

                         
                        int index69_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_163);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA69_164 = input.LA(1);

                         
                        int index69_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_164);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA69_165 = input.LA(1);

                         
                        int index69_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_165);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA69_170 = input.LA(1);

                         
                        int index69_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_170);
                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA69_171 = input.LA(1);

                         
                        int index69_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_171);
                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA69_172 = input.LA(1);

                         
                        int index69_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_172);
                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA69_173 = input.LA(1);

                         
                        int index69_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_173);
                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA69_174 = input.LA(1);

                         
                        int index69_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_174);
                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA69_175 = input.LA(1);

                         
                        int index69_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_175);
                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA69_176 = input.LA(1);

                         
                        int index69_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_176);
                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA69_177 = input.LA(1);

                         
                        int index69_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_177);
                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA69_178 = input.LA(1);

                         
                        int index69_178 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_178);
                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA69_179 = input.LA(1);

                         
                        int index69_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_179);
                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA69_180 = input.LA(1);

                         
                        int index69_180 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_180);
                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA69_181 = input.LA(1);

                         
                        int index69_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_181);
                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA69_182 = input.LA(1);

                         
                        int index69_182 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_182);
                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA69_183 = input.LA(1);

                         
                        int index69_183 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_183);
                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA69_188 = input.LA(1);

                         
                        int index69_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_188);
                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA69_189 = input.LA(1);

                         
                        int index69_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_189);
                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA69_190 = input.LA(1);

                         
                        int index69_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_190);
                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA69_191 = input.LA(1);

                         
                        int index69_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_191);
                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA69_192 = input.LA(1);

                         
                        int index69_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_192);
                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA69_193 = input.LA(1);

                         
                        int index69_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_193);
                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA69_194 = input.LA(1);

                         
                        int index69_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_194);
                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA69_195 = input.LA(1);

                         
                        int index69_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_195);
                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA69_196 = input.LA(1);

                         
                        int index69_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_196);
                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA69_197 = input.LA(1);

                         
                        int index69_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_197);
                        if ( s>=0 ) return s;
                        break;
                    case 156 : 
                        int LA69_198 = input.LA(1);

                         
                        int index69_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_198);
                        if ( s>=0 ) return s;
                        break;
                    case 157 : 
                        int LA69_199 = input.LA(1);

                         
                        int index69_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_199);
                        if ( s>=0 ) return s;
                        break;
                    case 158 : 
                        int LA69_200 = input.LA(1);

                         
                        int index69_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_200);
                        if ( s>=0 ) return s;
                        break;
                    case 159 : 
                        int LA69_201 = input.LA(1);

                         
                        int index69_201 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_201);
                        if ( s>=0 ) return s;
                        break;
                    case 160 : 
                        int LA69_206 = input.LA(1);

                         
                        int index69_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_206);
                        if ( s>=0 ) return s;
                        break;
                    case 161 : 
                        int LA69_207 = input.LA(1);

                         
                        int index69_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_207);
                        if ( s>=0 ) return s;
                        break;
                    case 162 : 
                        int LA69_208 = input.LA(1);

                         
                        int index69_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index69_208);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\37\uffff";
    static final String DFA74_eofS =
        "\1\uffff\1\7\35\uffff";
    static final String DFA74_minS =
        "\1\23\1\4\1\23\3\0\27\uffff\2\0";
    static final String DFA74_maxS =
        "\1\122\1\131\1\122\3\0\27\uffff\2\0";
    static final String DFA74_acceptS =
        "\6\uffff\1\1\1\2\27\uffff";
    static final String DFA74_specialS =
        "\3\uffff\1\0\1\1\1\2\27\uffff\1\3\1\4}>";
    static final String[] DFA74_transitionS = {
            "\1\2\76\uffff\1\1",
            "\2\7\1\6\1\7\1\4\1\7\2\uffff\3\7\1\3\1\5\1\uffff\1\7\1\uffff"+
            "\4\7\1\uffff\5\7\25\uffff\4\7\32\uffff\1\7\5\uffff\3\7",
            "\1\35\76\uffff\1\36",
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
            "",
            "",
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

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "429:1: nameOrFunctionCall : ( name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket -> ^( Apply name ( expression )* ) | name );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_Php()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_Php()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_Php()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_29 = input.LA(1);

                         
                        int index74_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_Php()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index74_29);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_30 = input.LA(1);

                         
                        int index74_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_Php()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index74_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\23\uffff";
    static final String DFA73_eofS =
        "\23\uffff";
    static final String DFA73_minS =
        "\1\6\22\uffff";
    static final String DFA73_maxS =
        "\1\141\22\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA73_specialS =
        "\23\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\1\1\22\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\32\uffff\1\1"+
            "\1\uffff\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "430:29: ( expression ( Comma expression )* )?";
        }
    }
    static final String DFA75_eotS =
        "\43\uffff";
    static final String DFA75_eofS =
        "\43\uffff";
    static final String DFA75_minS =
        "\1\23\1\17\1\23\36\uffff\2\0";
    static final String DFA75_maxS =
        "\1\122\1\17\1\122\36\uffff\2\0";
    static final String DFA75_acceptS =
        "\3\uffff\1\1\33\uffff\1\2\1\3\2\uffff";
    static final String DFA75_specialS =
        "\1\uffff\1\0\37\uffff\1\1\1\2}>";
    static final String[] DFA75_transitionS = {
            "\1\2\76\uffff\1\1",
            "\1\3",
            "\1\41\76\uffff\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "434:1: name : ( staticMemberAccess | memberAccess | variable );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA75_1==ClassMember) ) {s = 3;}

                        else if ( (synpred112_Php()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_33 = input.LA(1);

                         
                        int index75_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred112_Php()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index75_33);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA75_34 = input.LA(1);

                         
                        int index75_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred112_Php()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index75_34);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\34\uffff";
    static final String DFA76_eofS =
        "\1\1\33\uffff";
    static final String DFA76_minS =
        "\1\4\33\uffff";
    static final String DFA76_maxS =
        "\1\133\33\uffff";
    static final String DFA76_acceptS =
        "\1\uffff\1\3\30\uffff\1\1\1\2";
    static final String DFA76_specialS =
        "\34\uffff}>";
    static final String[] DFA76_transitionS = {
            "\4\1\1\32\1\1\2\uffff\3\1\1\uffff\1\33\1\uffff\1\1\1\uffff\4"+
            "\1\1\uffff\5\1\1\uffff\1\1\23\uffff\4\1\32\uffff\1\1\4\uffff"+
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

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "()* loopback of 445:9: ( OpenSquareBracket expression CloseSquareBracket | '->' UnquotedString )*";
        }
    }
    static final String DFA78_eotS =
        "\32\uffff";
    static final String DFA78_eofS =
        "\32\uffff";
    static final String DFA78_minS =
        "\1\6\31\uffff";
    static final String DFA78_maxS =
        "\1\141\31\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\27\uffff\1\2";
    static final String DFA78_specialS =
        "\32\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\3\1\13\uffff\5\1\4\uffff\1\1\31\uffff"+
            "\1\31\1\1\1\uffff\2\1\5\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "160:7: ( simpleStatement )?";
        }
    }
    static final String DFA96_eotS =
        "\23\uffff";
    static final String DFA96_eofS =
        "\23\uffff";
    static final String DFA96_minS =
        "\1\6\22\uffff";
    static final String DFA96_maxS =
        "\1\141\22\uffff";
    static final String DFA96_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA96_specialS =
        "\23\uffff}>";
    static final String[] DFA96_transitionS = {
            "\1\1\1\22\11\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\32\uffff\1\1"+
            "\1\uffff\1\1\6\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "430:29: ( expression ( Comma expression )* )?";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_prog884 = new BitSet(new long[]{0x1387E7CF454A0442L,0x00000003F8360000L});
    public static final BitSet FOLLOW_simpleStatement_in_statement897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_BodyString_in_statement900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_statement908 = new BitSet(new long[]{0x1387E7CF454A0C40L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_statement910 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_statement912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketedBlock_in_statement924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_statement937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDefinition_in_statement945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexStatement_in_statement953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_statement961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_statement963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_bracketedBlock985 = new BitSet(new long[]{0x1387E7CF454A0C40L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_bracketedBlock989 = new BitSet(new long[]{0x1387E7CF454A0C40L,0x00000003F8360000L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_bracketedBlock992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Interface_in_interfaceDefinition1018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceDefinition1022 = new BitSet(new long[]{0x0400000000000400L});
    public static final BitSet FOLLOW_interfaceExtends_in_interfaceDefinition1024 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_interfaceDefinition1035 = new BitSet(new long[]{0x5004200000000800L,0x0000000000080000L});
    public static final BitSet FOLLOW_interfaceMember_in_interfaceDefinition1045 = new BitSet(new long[]{0x5004200000000800L,0x0000000000080000L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_interfaceDefinition1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Extends_in_interfaceExtends1096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1099 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_interfaceExtends1102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1105 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Const_in_interfaceMember1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1125 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_interfaceMember1128 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_interfaceMember1130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_interfaceMember1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_interfaceMember1162 = new BitSet(new long[]{0x1004200000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Function_in_interfaceMember1165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_interfaceMember1169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_interfaceMember1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classModifier_in_classDefinition1215 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Class_in_classDefinition1227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition1231 = new BitSet(new long[]{0x0C00000000000400L});
    public static final BitSet FOLLOW_Extends_in_classDefinition1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition1247 = new BitSet(new long[]{0x0800000000000400L});
    public static final BitSet FOLLOW_classImplements_in_classDefinition1260 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_classDefinition1271 = new BitSet(new long[]{0x7004200000080800L,0x0000000000080000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition1281 = new BitSet(new long[]{0x7004200000080800L,0x0000000000080000L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_classDefinition1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Implements_in_classImplements1374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements1378 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_classImplements1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements1384 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember1404 = new BitSet(new long[]{0x1004200000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Function_in_classMember1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1409 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_classMember1411 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_bracketedBlock_in_classMember1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_classMember1464 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dollar_in_classMember1466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1468 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1471 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_classMember1473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Const_in_classMember1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1512 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1515 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_classMember1517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember1549 = new BitSet(new long[]{0x1004000000080000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Dollar_in_classMember1553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1555 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1559 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_classMember1561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_fieldDefinition1613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_fieldDefinition1615 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_fieldDefinition1618 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_fieldDefinition1620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_fieldDefinition1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Abstract_in_classModifier1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_fieldModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_complexStatement1702 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1704 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1708 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1710 = new BitSet(new long[]{0x1387E7FF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1714 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_conditional_in_complexStatement1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_complexStatement1747 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1749 = new BitSet(new long[]{0x0087C007454A0050L,0x00000003F8340000L});
    public static final BitSet FOLLOW_forInit_in_complexStatement1751 = new BitSet(new long[]{0x0087C007454A0050L,0x00000003F8340000L});
    public static final BitSet FOLLOW_forCondition_in_complexStatement1753 = new BitSet(new long[]{0x0087C007454A00C0L,0x00000003F8340000L});
    public static final BitSet FOLLOW_forUpdate_in_complexStatement1755 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1757 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Foreach_in_complexStatement1781 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1783 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_variable_in_complexStatement1785 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_complexStatement1787 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_arrayEntry_in_complexStatement1789 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1791 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_complexStatement1813 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1815 = new BitSet(new long[]{0x0087C007454A00C0L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1819 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1822 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Do_in_complexStatement1843 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1845 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_While_in_complexStatement1847 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1849 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1853 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_complexStatement1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Switch_in_complexStatement1876 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1878 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1880 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1882 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_complexStatement1884 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_cases_in_complexStatement1885 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_complexStatement1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_complexStatement1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Echo_in_simpleStatement1921 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_commaList_in_simpleStatement1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Global_in_simpleStatement1932 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_simpleStatement1935 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_simpleStatement1938 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_simpleStatement1941 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Static_in_simpleStatement1951 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_variable_in_simpleStatement1954 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Equals_in_simpleStatement1956 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_simpleStatement1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Break_in_simpleStatement1967 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Continue_in_simpleStatement1979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Return_in_simpleStatement1996 = new BitSet(new long[]{0x0087C007454A0042L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_simpleStatement1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RequireOperator_in_simpleStatement2008 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_simpleStatement2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_simpleStatement2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElseIf_in_conditional2037 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_conditional2039 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_conditional2043 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_conditional2045 = new BitSet(new long[]{0x1387E7FF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_conditional2049 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_conditional_in_conditional2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_conditional2075 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_conditional2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forInit2098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_forInit2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forCondition2127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_forCondition2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forUpdate2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_casestatement_in_cases2188 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_defaultcase_in_cases2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_casestatement2209 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_casestatement2212 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_casestatement2214 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_casestatement2217 = new BitSet(new long[]{0x1387E7CF454A0442L,0x00000003F8360000L});
    public static final BitSet FOLLOW_Default_in_defaultcase2237 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_defaultcase2240 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_defaultcase2243 = new BitSet(new long[]{0x1387E7CF454A0442L,0x00000003F8360000L});
    public static final BitSet FOLLOW_Function_in_functionDefinition2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_functionDefinition2264 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_functionDefinition2266 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bracketedBlock_in_functionDefinition2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_parametersDefinition2306 = new BitSet(new long[]{0x0000000000480080L});
    public static final BitSet FOLLOW_paramDef_in_parametersDefinition2309 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_parametersDefinition2312 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_paramDef_in_parametersDefinition2314 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_parametersDefinition2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_paramDef2347 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_Equals_in_paramDef2350 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_paramDef2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_paramName2372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_paramName2383 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dollar_in_paramName2385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_commaList2416 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_commaList2419 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_commaList2422 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_weakLogicalOr_in_expression2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2463 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_Or_in_weakLogicalOr2466 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2469 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2488 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_Xor_in_weakLogicalXor2491 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2494 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2517 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_And_in_weakLogicalAnd2520 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2523 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_listVariables_in_assignment2542 = new BitSet(new long[]{0x0000000080000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_set_in_assignment2545 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_assignment_in_assignment2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternary_in_assignment2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_List_in_listVariables2578 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_listVariables2581 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_listVariables2584 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_listVariables2587 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_listVariables2590 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_listVariables2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_listVariables2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_ternary2621 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_QuestionMark_in_ternary2623 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_ternary2625 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_ternary2627 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_ternary2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_ternary2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr2669 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LogicalOr_in_logicalOr2672 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr2675 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2694 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_LogicalAnd_in_logicalAnd2697 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2700 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2723 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_Pipe_in_bitwiseOr2726 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2729 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2748 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_Ampersand_in_bitWiseAnd2751 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2754 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2773 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_EqualityOperator_in_equalityCheck2776 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2802 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ComparisionOperator_in_comparisionCheck2805 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addition_in_bitWiseShift2827 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ShiftOperator_in_bitWiseShift2830 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_addition_in_bitWiseShift2833 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_multiplication_in_addition2856 = new BitSet(new long[]{0x0000000006200002L});
    public static final BitSet FOLLOW_set_in_addition2859 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_multiplication_in_addition2872 = new BitSet(new long[]{0x0000000006200002L});
    public static final BitSet FOLLOW_logicalNot_in_multiplication2891 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_set_in_multiplication2894 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_logicalNot_in_multiplication2907 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_Bang_in_logicalNot2926 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_logicalNot_in_logicalNot2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceOf_in_logicalNot2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negateOrCast_in_instanceOf2954 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_Instanceof_in_instanceOf2957 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_negateOrCast_in_instanceOf2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_negateOrCast2979 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_increment_in_negateOrCast2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_negateOrCast3000 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_PrimitiveType_in_negateOrCast3002 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_negateOrCast3004 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_increment_in_negateOrCast3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_negateOrCast3024 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_negateOrCast3027 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_negateOrCast3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_increment_in_negateOrCast3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IncrementOperator_in_increment3055 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_increment3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_increment3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IncrementOperator_in_increment3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newOrClone_in_increment3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_New_in_newOrClone3112 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_newOrClone3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Clone_in_newOrClone3123 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_newOrClone3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomOrReference_in_newOrClone3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_atomOrReference3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_atomOrReference3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_arrayDeclaration3176 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_arrayDeclaration3178 = new BitSet(new long[]{0x0087C007454A00C0L,0x00000003F8340000L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration3181 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_arrayDeclaration3184 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration3186 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_arrayDeclaration3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_arrayEntry3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayEntry3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_keyValuePair3242 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ArrayAssign_in_keyValuePair3244 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_keyValuePair3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleQuotedString_in_atom3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleQuotedString_in_atom3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HereDoc_in_atom3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_atom3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Real_in_atom3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Boolean_in_atom3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_atom3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_reference3310 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall3338 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_nameOrFunctionCall3340 = new BitSet(new long[]{0x0087C007454A00C0L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall3343 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_nameOrFunctionCall3346 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall3348 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_nameOrFunctionCall3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticMemberAccess_in_name3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_name3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_name3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_staticMemberAccess3422 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ClassMember_in_staticMemberAccess3424 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_variable_in_staticMemberAccess3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_memberAccess3444 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_OpenSquareBracket_in_memberAccess3457 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_memberAccess3460 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CloseSquareBracket_in_memberAccess3462 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_InstanceMember_in_memberAccess3475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_memberAccess3478 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_Dollar_in_variable3501 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_variable_in_variable3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_variable3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_synpred3_Php897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_BodyString_in_synpred3_Php900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_synpred4_Php908 = new BitSet(new long[]{0x1387E7CF454A0C40L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_synpred4_Php910 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_synpred4_Php912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketedBlock_in_synpred5_Php924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_synpred23_Php1404 = new BitSet(new long[]{0x1004200000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Function_in_synpred23_Php1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_synpred23_Php1409 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_synpred23_Php1411 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_bracketedBlock_in_synpred23_Php1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SemiColon_in_synpred23_Php1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred33_Php1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred52_Php2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_synpred65_Php2466 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_weakLogicalXor_in_synpred65_Php2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_synpred66_Php2491 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_synpred66_Php2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_And_in_synpred67_Php2520 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_assignment_in_synpred67_Php2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listVariables_in_synpred69_Php2542 = new BitSet(new long[]{0x0000000080000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_set_in_synpred69_Php2545 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_assignment_in_synpred69_Php2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_synpred72_Php2621 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_QuestionMark_in_synpred72_Php2623 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_synpred72_Php2625 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_synpred72_Php2627 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_synpred72_Php2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred94_Php3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IncrementOperator_in_synpred94_Php3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_synpred100_Php3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred110_Php3338 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_synpred110_Php3340 = new BitSet(new long[]{0x0087C007454A00C0L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_synpred110_Php3343 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_synpred110_Php3346 = new BitSet(new long[]{0x0087C007454A0040L,0x00000003F8340000L});
    public static final BitSet FOLLOW_expression_in_synpred110_Php3348 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_synpred110_Php3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_synpred112_Php3393 = new BitSet(new long[]{0x0000000000000002L});

}