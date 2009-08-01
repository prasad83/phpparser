// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 Php.g 2009-05-31 23:11:29

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SemiColon", "Comma", "OpenBrace", "CloseBrace", "OpenSquareBrace", "CloseSquareBrace", "OpenCurlyBrace", "CloseCurlyBrace", "ArrayAssign", "LogicalOr", "LogicalAnd", "ClassMember", "InstanceMember", "SuppressWarnings", "QuestionMark", "Dollar", "Colon", "Dot", "Ampersand", "Pipe", "Bang", "Plus", "Minus", "Asterisk", "Percent", "Forwardslash", "Tilde", "Equals", "New", "Clone", "Echo", "If", "Else", "ElseIf", "For", "Foreach", "While", "Do", "Switch", "Case", "Default", "Function", "Break", "Continue", "Return", "Global", "Static", "And", "Or", "Xor", "Instanceof", "Class", "Interface", "Extends", "Implements", "Abstract", "Var", "Const", "Modifiers", "ClassDefinition", "Block", "Params", "Apply", "Member", "Reference", "Empty", "Prefix", "Postfix", "IfExpression", "Label", "Cast", "ForInit", "ForCondition", "ForUpdate", "Field", "Method", "BodyString", "UnquotedString", "AccessModifier", "Integer", "RequireOperator", "AsignmentOperator", "EqualityOperator", "ComparisionOperator", "ShiftOperator", "PrimitiveType", "IncrementOperator", "Array", "SingleQuotedString", "DoubleQuotedString", "HereDoc", "Real", "Boolean", "BodyStringRest", "BodyStringRestShortTag", "MultilineComment", "SinglelineComment", "UnixComment", "Decimal", "Hexadecimal", "Octal", "Digits", "DNum", "Exponent_DNum", "EscapeCharector", "HereDocContents", "Eol", "WhiteSpace", "'as'"
    };
    public static final int Switch=42;
    public static final int DoubleQuotedString=93;
    public static final int New=32;
    public static final int Class=55;
    public static final int Foreach=39;
    public static final int Static=50;
    public static final int Plus=25;
    public static final int Params=65;
    public static final int Hexadecimal=103;
    public static final int Exponent_DNum=107;
    public static final int Equals=31;
    public static final int Default=44;
    public static final int Implements=58;
    public static final int Comma=5;
    public static final int MultilineComment=99;
    public static final int Integer=83;
    public static final int T__112=112;
    public static final int HereDocContents=109;
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
    public static final int UnixComment=101;
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
    public static final int SinglelineComment=100;
    public static final int SingleQuotedString=92;
    public static final int Instanceof=54;
    public static final int Do=41;
    public static final int InstanceMember=16;
    public static final int Field=78;
    public static final int Reference=68;
    public static final int EscapeCharector=108;
    public static final int Ampersand=22;
    public static final int For=38;
    public static final int Octal=104;
    public static final int DNum=106;
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
    public static final int Decimal=102;
    public static final int Interface=56;
    public static final int BodyStringRestShortTag=98;
    public static final int CloseSquareBrace=9;
    public static final int CloseCurlyBrace=11;
    public static final int PrimitiveType=89;
    public static final int ClassMember=15;
    public static final int ShiftOperator=88;
    public static final int Dot=21;
    public static final int BodyStringRest=97;
    public static final int Minus=26;
    public static final int Boolean=96;
    public static final int WhiteSpace=111;
    public static final int Extends=57;
    public static final int IfExpression=72;
    public static final int Echo=34;
    public static final int Real=95;
    public static final int OpenSquareBrace=8;
    public static final int Eol=110;
    public static final int AccessModifier=82;
    public static final int Or=52;
    public static final int Forwardslash=29;
    public static final int Else=36;
    public static final int BodyString=80;
    public static final int SuppressWarnings=17;
    public static final int Xor=53;
    public static final int ForCondition=76;
    public static final int ComparisionOperator=87;
    public static final int Case=43;
    public static final int Function=45;
    public static final int Pipe=23;
    public static final int Global=49;
    public static final int Tilde=30;
    public static final int Block=64;
    public static final int Method=79;
    public static final int OpenBrace=6;
    public static final int While=40;
    public static final int Bang=24;
    public static final int EOF=-1;
    public static final int Empty=69;
    public static final int AsignmentOperator=85;
    public static final int Digits=105;
    public static final int HereDoc=94;
    public static final int Member=67;
    public static final int Return=48;

    // delegates
    // delegators


        public PhpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PhpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[170+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PhpParser.tokenNames; }
    public String getGrammarFileName() { return "Php.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // Php.g:155:1: prog : ( statement )* ;
    public final PhpParser.prog_return prog() throws RecognitionException {
        PhpParser.prog_return retval = new PhpParser.prog_return();
        retval.start = input.LT(1);
        int prog_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.statement_return statement1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // Php.g:155:6: ( ( statement )* )
            // Php.g:155:8: ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // Php.g:155:8: ( statement )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // Php.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_prog876);
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
    // Php.g:157:1: statement : ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' );
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
        RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
        RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // Php.g:158:5: ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // Php.g:158:7: ( simpleStatement )? BodyString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // Php.g:158:7: ( simpleStatement )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // Php.g:0:0: simpleStatement
                            {
                            pushFollow(FOLLOW_simpleStatement_in_statement889);
                            simpleStatement2=simpleStatement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleStatement2.getTree());

                            }
                            break;

                    }

                    BodyString3=(Token)match(input,BodyString,FOLLOW_BodyString_in_statement892); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BodyString3_tree = (CommonTree)adaptor.create(BodyString3);
                    adaptor.addChild(root_0, BodyString3_tree);
                    }

                    }
                    break;
                case 2 :
                    // Php.g:159:7: '{' statement '}'
                    {
                    char_literal4=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_statement900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(char_literal4);

                    pushFollow(FOLLOW_statement_in_statement902);
                    statement5=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement5.getTree());
                    char_literal6=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_statement904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(char_literal6);



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
                    // 159:25: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // Php.g:160:7: bracketedBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bracketedBlock_in_statement916);
                    bracketedBlock7=bracketedBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketedBlock7.getTree());

                    }
                    break;
                case 4 :
                    // Php.g:162:7: classDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_classDefinition_in_statement929);
                    classDefinition8=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition8.getTree());

                    }
                    break;
                case 5 :
                    // Php.g:163:7: interfaceDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDefinition_in_statement937);
                    interfaceDefinition9=interfaceDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDefinition9.getTree());

                    }
                    break;
                case 6 :
                    // Php.g:164:7: complexStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_complexStatement_in_statement945);
                    complexStatement10=complexStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, complexStatement10.getTree());

                    }
                    break;
                case 7 :
                    // Php.g:165:7: simpleStatement ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_simpleStatement_in_statement953);
                    simpleStatement11=simpleStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleStatement11.getTree());
                    char_literal12=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_statement955); if (state.failed) return retval;

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
    // Php.g:168:1: bracketedBlock : '{' (stmts= statement )* '}' -> ^( Block $stmts) ;
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
        RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
        RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // Php.g:169:5: ( '{' (stmts= statement )* '}' -> ^( Block $stmts) )
            // Php.g:169:7: '{' (stmts= statement )* '}'
            {
            char_literal13=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_bracketedBlock977); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(char_literal13);

            // Php.g:169:16: (stmts= statement )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // Php.g:0:0: stmts= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bracketedBlock981);
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

            char_literal14=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_bracketedBlock984); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(char_literal14);



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
            // 169:32: -> ^( Block $stmts)
            {
                // Php.g:169:35: ^( Block $stmts)
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
    // Php.g:172:1: interfaceDefinition : Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* ) ;
    public final PhpParser.interfaceDefinition_return interfaceDefinition() throws RecognitionException {
        PhpParser.interfaceDefinition_return retval = new PhpParser.interfaceDefinition_return();
        retval.start = input.LT(1);
        int interfaceDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token interfaceName=null;
        Token Interface15=null;
        Token OpenCurlyBrace17=null;
        Token CloseCurlyBrace19=null;
        PhpParser.interfaceExtends_return interfaceExtends16 = null;

        PhpParser.interfaceMember_return interfaceMember18 = null;


        CommonTree interfaceName_tree=null;
        CommonTree Interface15_tree=null;
        CommonTree OpenCurlyBrace17_tree=null;
        CommonTree CloseCurlyBrace19_tree=null;
        RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
        RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
        RewriteRuleTokenStream stream_Interface=new RewriteRuleTokenStream(adaptor,"token Interface");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleSubtreeStream stream_interfaceExtends=new RewriteRuleSubtreeStream(adaptor,"rule interfaceExtends");
        RewriteRuleSubtreeStream stream_interfaceMember=new RewriteRuleSubtreeStream(adaptor,"rule interfaceMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // Php.g:173:5: ( Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* ) )
            // Php.g:173:7: Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace
            {
            Interface15=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDefinition1010); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Interface.add(Interface15);

            interfaceName=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceDefinition1014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(interfaceName);

            // Php.g:173:46: ( interfaceExtends )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Extends) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Php.g:0:0: interfaceExtends
                    {
                    pushFollow(FOLLOW_interfaceExtends_in_interfaceDefinition1016);
                    interfaceExtends16=interfaceExtends();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interfaceExtends.add(interfaceExtends16.getTree());

                    }
                    break;

            }

            OpenCurlyBrace17=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_interfaceDefinition1027); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(OpenCurlyBrace17);

            // Php.g:175:9: ( interfaceMember )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Function||LA6_0==Static||LA6_0==Abstract||LA6_0==Const||LA6_0==AccessModifier) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Php.g:0:0: interfaceMember
            	    {
            	    pushFollow(FOLLOW_interfaceMember_in_interfaceDefinition1037);
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

            CloseCurlyBrace19=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_interfaceDefinition1048); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(CloseCurlyBrace19);



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
            // 177:9: -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* )
            {
                // Php.g:177:12: ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_Interface.nextNode(), root_1);

                adaptor.addChild(root_1, stream_interfaceName.nextNode());
                // Php.g:177:39: ( interfaceExtends )?
                if ( stream_interfaceExtends.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceExtends.nextTree());

                }
                stream_interfaceExtends.reset();
                // Php.g:177:57: ( interfaceMember )*
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
    // Php.g:180:1: interfaceExtends : Extends UnquotedString ( Comma UnquotedString )* ;
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
            // Php.g:181:5: ( Extends UnquotedString ( Comma UnquotedString )* )
            // Php.g:181:7: Extends UnquotedString ( Comma UnquotedString )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Extends20=(Token)match(input,Extends,FOLLOW_Extends_in_interfaceExtends1088); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Extends20_tree = (CommonTree)adaptor.create(Extends20);
            root_0 = (CommonTree)adaptor.becomeRoot(Extends20_tree, root_0);
            }
            UnquotedString21=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1091); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString21_tree = (CommonTree)adaptor.create(UnquotedString21);
            adaptor.addChild(root_0, UnquotedString21_tree);
            }
            // Php.g:181:31: ( Comma UnquotedString )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Php.g:181:32: Comma UnquotedString
            	    {
            	    Comma22=(Token)match(input,Comma,FOLLOW_Comma_in_interfaceExtends1094); if (state.failed) return retval;
            	    UnquotedString23=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1097); if (state.failed) return retval;
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
    // Php.g:183:1: interfaceMember : ( Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* Function UnquotedString parametersDefinition ';' -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ) );
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
            // Php.g:184:5: ( Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* Function UnquotedString parametersDefinition ';' -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ) )
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
                    // Php.g:184:7: Const UnquotedString ( Equals atom )? ';'
                    {
                    Const24=(Token)match(input,Const,FOLLOW_Const_in_interfaceMember1115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Const.add(Const24);

                    UnquotedString25=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString25);

                    // Php.g:184:28: ( Equals atom )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Equals) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Php.g:184:29: Equals atom
                            {
                            Equals26=(Token)match(input,Equals,FOLLOW_Equals_in_interfaceMember1120); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals26);

                            pushFollow(FOLLOW_atom_in_interfaceMember1122);
                            atom27=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom27.getTree());

                            }
                            break;

                    }

                    char_literal28=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal28);



                    // AST REWRITE
                    // elements: atom, UnquotedString, Const
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 185:9: -> ^( Const UnquotedString ( atom )? )
                    {
                        // Php.g:185:12: ^( Const UnquotedString ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Const.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                        // Php.g:185:35: ( atom )?
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
                    // Php.g:186:7: ( fieldModifier )* Function UnquotedString parametersDefinition ';'
                    {
                    // Php.g:186:7: ( fieldModifier )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Static||LA9_0==Abstract||LA9_0==AccessModifier) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Php.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_interfaceMember1154);
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

                    Function30=(Token)match(input,Function,FOLLOW_Function_in_interfaceMember1157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Function.add(Function30);

                    UnquotedString31=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString31);

                    pushFollow(FOLLOW_parametersDefinition_in_interfaceMember1161);
                    parametersDefinition32=parametersDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition32.getTree());
                    char_literal33=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1163); if (state.failed) return retval; 
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
                    // 187:9: -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition )
                    {
                        // Php.g:187:12: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Method, "Method"), root_1);

                        // Php.g:187:21: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                        // Php.g:187:33: ( fieldModifier )*
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
    // Php.g:190:1: classDefinition : ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* ) ;
    public final PhpParser.classDefinition_return classDefinition() throws RecognitionException {
        PhpParser.classDefinition_return retval = new PhpParser.classDefinition_return();
        retval.start = input.LT(1);
        int classDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token className=null;
        Token extendsclass=null;
        Token Class35=null;
        Token Extends36=null;
        Token OpenCurlyBrace38=null;
        Token CloseCurlyBrace40=null;
        PhpParser.classModifier_return classModifier34 = null;

        PhpParser.classImplements_return classImplements37 = null;

        PhpParser.classMember_return classMember39 = null;


        CommonTree className_tree=null;
        CommonTree extendsclass_tree=null;
        CommonTree Class35_tree=null;
        CommonTree Extends36_tree=null;
        CommonTree OpenCurlyBrace38_tree=null;
        CommonTree CloseCurlyBrace40_tree=null;
        RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
        RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
        RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
        RewriteRuleTokenStream stream_Extends=new RewriteRuleTokenStream(adaptor,"token Extends");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleSubtreeStream stream_classImplements=new RewriteRuleSubtreeStream(adaptor,"rule classImplements");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        RewriteRuleSubtreeStream stream_classModifier=new RewriteRuleSubtreeStream(adaptor,"rule classModifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // Php.g:191:5: ( ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* ) )
            // Php.g:191:9: ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace
            {
            // Php.g:191:9: ( classModifier )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Abstract) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Php.g:0:0: classModifier
                    {
                    pushFollow(FOLLOW_classModifier_in_classDefinition1207);
                    classModifier34=classModifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classModifier.add(classModifier34.getTree());

                    }
                    break;

            }

            Class35=(Token)match(input,Class,FOLLOW_Class_in_classDefinition1219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Class.add(Class35);

            className=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(className);

            // Php.g:193:9: ( Extends extendsclass= UnquotedString )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Extends) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Php.g:193:10: Extends extendsclass= UnquotedString
                    {
                    Extends36=(Token)match(input,Extends,FOLLOW_Extends_in_classDefinition1235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Extends.add(Extends36);

                    extendsclass=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(extendsclass);


                    }
                    break;

            }

            // Php.g:194:9: ( classImplements )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Implements) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Php.g:0:0: classImplements
                    {
                    pushFollow(FOLLOW_classImplements_in_classDefinition1252);
                    classImplements37=classImplements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classImplements.add(classImplements37.getTree());

                    }
                    break;

            }

            OpenCurlyBrace38=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_classDefinition1263); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(OpenCurlyBrace38);

            // Php.g:196:9: ( classMember )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Dollar||LA14_0==Function||LA14_0==Static||(LA14_0>=Abstract && LA14_0<=Const)||LA14_0==AccessModifier) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Php.g:0:0: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDefinition1273);
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

            CloseCurlyBrace40=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_classDefinition1284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(CloseCurlyBrace40);



            // AST REWRITE
            // elements: classModifier, Class, classImplements, className, classMember, Extends, extendsclass
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
            // 198:9: -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* )
            {
                // Php.g:198:12: ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_Class.nextNode(), root_1);

                // Php.g:198:20: ^( Modifiers ( classModifier )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                // Php.g:198:32: ( classModifier )?
                if ( stream_classModifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_classModifier.nextTree());

                }
                stream_classModifier.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_className.nextNode());
                // Php.g:198:59: ( ^( Extends $extendsclass) )?
                if ( stream_Extends.hasNext()||stream_extendsclass.hasNext() ) {
                    // Php.g:198:59: ^( Extends $extendsclass)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_Extends.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_extendsclass.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_Extends.reset();
                stream_extendsclass.reset();
                // Php.g:198:85: ( classImplements )?
                if ( stream_classImplements.hasNext() ) {
                    adaptor.addChild(root_1, stream_classImplements.nextTree());

                }
                stream_classImplements.reset();
                // Php.g:199:13: ( classMember )*
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
    // Php.g:203:1: classImplements : Implements ( UnquotedString ( Comma UnquotedString )* ) ;
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
            // Php.g:204:5: ( Implements ( UnquotedString ( Comma UnquotedString )* ) )
            // Php.g:204:8: Implements ( UnquotedString ( Comma UnquotedString )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            Implements41=(Token)match(input,Implements,FOLLOW_Implements_in_classImplements1366); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Implements41_tree = (CommonTree)adaptor.create(Implements41);
            root_0 = (CommonTree)adaptor.becomeRoot(Implements41_tree, root_0);
            }
            // Php.g:204:20: ( UnquotedString ( Comma UnquotedString )* )
            // Php.g:204:21: UnquotedString ( Comma UnquotedString )*
            {
            UnquotedString42=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1370); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString42_tree = (CommonTree)adaptor.create(UnquotedString42);
            adaptor.addChild(root_0, UnquotedString42_tree);
            }
            // Php.g:204:36: ( Comma UnquotedString )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Php.g:204:37: Comma UnquotedString
            	    {
            	    Comma43=(Token)match(input,Comma,FOLLOW_Comma_in_classImplements1373); if (state.failed) return retval;
            	    UnquotedString44=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1376); if (state.failed) return retval;
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
    // Php.g:207:1: classMember : ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? ) | Var Dollar UnquotedString ( Equals atom )? ';' -> ^( Var ^( Dollar UnquotedString ) ( atom )? ) | Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) );
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
            // Php.g:208:5: ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? ) | Var Dollar UnquotedString ( Equals atom )? ';' -> ^( Var ^( Dollar UnquotedString ) ( atom )? ) | Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) )
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
                    // Php.g:208:7: ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' )
                    {
                    // Php.g:208:7: ( fieldModifier )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Static||LA16_0==Abstract||LA16_0==AccessModifier) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Php.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_classMember1396);
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

                    Function46=(Token)match(input,Function,FOLLOW_Function_in_classMember1399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Function.add(Function46);

                    UnquotedString47=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString47);

                    pushFollow(FOLLOW_parametersDefinition_in_classMember1403);
                    parametersDefinition48=parametersDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition48.getTree());
                    // Php.g:209:9: ( bracketedBlock | ';' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==OpenCurlyBrace) ) {
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
                            // Php.g:209:10: bracketedBlock
                            {
                            pushFollow(FOLLOW_bracketedBlock_in_classMember1415);
                            bracketedBlock49=bracketedBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracketedBlock.add(bracketedBlock49.getTree());

                            }
                            break;
                        case 2 :
                            // Php.g:209:27: ';'
                            {
                            char_literal50=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1419); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal50);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: fieldModifier, bracketedBlock, parametersDefinition, UnquotedString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:9: -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? )
                    {
                        // Php.g:210:12: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Method, "Method"), root_1);

                        // Php.g:210:21: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                        // Php.g:210:33: ( fieldModifier )*
                        while ( stream_fieldModifier.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldModifier.nextTree());

                        }
                        stream_fieldModifier.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                        adaptor.addChild(root_1, stream_parametersDefinition.nextTree());
                        // Php.g:210:85: ( bracketedBlock )?
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
                    // Php.g:211:7: Var Dollar UnquotedString ( Equals atom )? ';'
                    {
                    Var51=(Token)match(input,Var,FOLLOW_Var_in_classMember1456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Var.add(Var51);

                    Dollar52=(Token)match(input,Dollar,FOLLOW_Dollar_in_classMember1458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar52);

                    UnquotedString53=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString53);

                    // Php.g:211:33: ( Equals atom )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==Equals) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Php.g:211:34: Equals atom
                            {
                            Equals54=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1463); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals54);

                            pushFollow(FOLLOW_atom_in_classMember1465);
                            atom55=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom55.getTree());

                            }
                            break;

                    }

                    char_literal56=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1469); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal56);



                    // AST REWRITE
                    // elements: atom, UnquotedString, Var, Dollar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:9: -> ^( Var ^( Dollar UnquotedString ) ( atom )? )
                    {
                        // Php.g:212:12: ^( Var ^( Dollar UnquotedString ) ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Var.nextNode(), root_1);

                        // Php.g:212:18: ^( Dollar UnquotedString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_UnquotedString.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // Php.g:212:43: ( atom )?
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
                    // Php.g:213:7: Const UnquotedString ( Equals atom )? ';'
                    {
                    Const57=(Token)match(input,Const,FOLLOW_Const_in_classMember1502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Const.add(Const57);

                    UnquotedString58=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString58);

                    // Php.g:213:28: ( Equals atom )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Equals) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Php.g:213:29: Equals atom
                            {
                            Equals59=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1507); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals59);

                            pushFollow(FOLLOW_atom_in_classMember1509);
                            atom60=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom60.getTree());

                            }
                            break;

                    }

                    char_literal61=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal61);



                    // AST REWRITE
                    // elements: atom, Const, UnquotedString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:9: -> ^( Const UnquotedString ( atom )? )
                    {
                        // Php.g:214:12: ^( Const UnquotedString ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Const.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                        // Php.g:214:35: ( atom )?
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
                    // Php.g:215:7: ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';'
                    {
                    // Php.g:215:7: ( fieldModifier )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Static||LA20_0==Abstract||LA20_0==AccessModifier) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Php.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_classMember1541);
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

                    // Php.g:215:22: ( Dollar UnquotedString )
                    // Php.g:215:23: Dollar UnquotedString
                    {
                    Dollar63=(Token)match(input,Dollar,FOLLOW_Dollar_in_classMember1545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar63);

                    UnquotedString64=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString64);


                    }

                    // Php.g:215:46: ( Equals atom )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Equals) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Php.g:215:47: Equals atom
                            {
                            Equals65=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1551); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals65);

                            pushFollow(FOLLOW_atom_in_classMember1553);
                            atom66=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom66.getTree());

                            }
                            break;

                    }

                    char_literal67=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal67);



                    // AST REWRITE
                    // elements: Dollar, atom, fieldModifier, UnquotedString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 216:9: -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
                    {
                        // Php.g:216:12: ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Field, "Field"), root_1);

                        // Php.g:216:20: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                        // Php.g:216:32: ( fieldModifier )*
                        while ( stream_fieldModifier.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldModifier.nextTree());

                        }
                        stream_fieldModifier.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // Php.g:216:48: ^( Dollar UnquotedString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_UnquotedString.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // Php.g:216:73: ( atom )?
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
    // Php.g:219:1: fieldDefinition : Dollar UnquotedString ( Equals atom )? ';' -> ^( Field ^( Dollar UnquotedString ) ( atom )? ) ;
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
            // Php.g:220:5: ( Dollar UnquotedString ( Equals atom )? ';' -> ^( Field ^( Dollar UnquotedString ) ( atom )? ) )
            // Php.g:220:7: Dollar UnquotedString ( Equals atom )? ';'
            {
            Dollar68=(Token)match(input,Dollar,FOLLOW_Dollar_in_fieldDefinition1605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Dollar.add(Dollar68);

            UnquotedString69=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_fieldDefinition1607); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString69);

            // Php.g:220:29: ( Equals atom )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Equals) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Php.g:220:30: Equals atom
                    {
                    Equals70=(Token)match(input,Equals,FOLLOW_Equals_in_fieldDefinition1610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Equals.add(Equals70);

                    pushFollow(FOLLOW_atom_in_fieldDefinition1612);
                    atom71=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom71.getTree());

                    }
                    break;

            }

            char_literal72=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_fieldDefinition1616); if (state.failed) return retval; 
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
            // 220:47: -> ^( Field ^( Dollar UnquotedString ) ( atom )? )
            {
                // Php.g:220:50: ^( Field ^( Dollar UnquotedString ) ( atom )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Field, "Field"), root_1);

                // Php.g:220:58: ^( Dollar UnquotedString )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);

                adaptor.addChild(root_2, stream_UnquotedString.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // Php.g:220:83: ( atom )?
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
    // Php.g:223:1: classModifier : 'abstract' ;
    public final PhpParser.classModifier_return classModifier() throws RecognitionException {
        PhpParser.classModifier_return retval = new PhpParser.classModifier_return();
        retval.start = input.LT(1);
        int classModifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token string_literal73=null;

        CommonTree string_literal73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // Php.g:224:5: ( 'abstract' )
            // Php.g:224:7: 'abstract'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal73=(Token)match(input,Abstract,FOLLOW_Abstract_in_classModifier1651); if (state.failed) return retval;
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
    // Php.g:226:1: fieldModifier : ( AccessModifier | 'abstract' | 'static' );
    public final PhpParser.fieldModifier_return fieldModifier() throws RecognitionException {
        PhpParser.fieldModifier_return retval = new PhpParser.fieldModifier_return();
        retval.start = input.LT(1);
        int fieldModifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set74=null;

        CommonTree set74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // Php.g:227:5: ( AccessModifier | 'abstract' | 'static' )
            // Php.g:
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
    // Php.g:231:1: complexStatement : ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( 'if' expression $ifTrue ( conditional )? ) | For '(' forInit forCondition forUpdate ')' statement -> ^( For forInit forCondition forUpdate statement ) | Foreach '(' variable 'as' arrayEntry ')' statement -> ^( Foreach variable arrayEntry statement ) | While '(' (whileCondition= expression )? ')' statement -> ^( While $whileCondition statement ) | Do statement While '(' doCondition= expression ')' ';' -> ^( Do statement $doCondition) | Switch '(' expression ')' '{' cases '}' -> ^( Switch expression cases ) | functionDefinition );
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
        RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
        RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
        RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
        RewriteRuleTokenStream stream_Foreach=new RewriteRuleTokenStream(adaptor,"token Foreach");
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
        RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
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
            // Php.g:232:5: ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( 'if' expression $ifTrue ( conditional )? ) | For '(' forInit forCondition forUpdate ')' statement -> ^( For forInit forCondition forUpdate statement ) | Foreach '(' variable 'as' arrayEntry ')' statement -> ^( Foreach variable arrayEntry statement ) | While '(' (whileCondition= expression )? ')' statement -> ^( While $whileCondition statement ) | Do statement While '(' doCondition= expression ')' ';' -> ^( Do statement $doCondition) | Switch '(' expression ')' '{' cases '}' -> ^( Switch expression cases ) | functionDefinition )
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
                    // Php.g:232:7: If '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
                    {
                    If75=(Token)match(input,If,FOLLOW_If_in_complexStatement1694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_If.add(If75);

                    char_literal76=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal76);

                    pushFollow(FOLLOW_expression_in_complexStatement1700);
                    ifCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifCondition.getTree());
                    char_literal77=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal77);

                    pushFollow(FOLLOW_statement_in_complexStatement1706);
                    ifTrue=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(ifTrue.getTree());
                    // Php.g:232:58: ( conditional )?
                    int alt24=2;
                    alt24 = dfa24.predict(input);
                    switch (alt24) {
                        case 1 :
                            // Php.g:0:0: conditional
                            {
                            pushFollow(FOLLOW_conditional_in_complexStatement1708);
                            conditional78=conditional();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_conditional.add(conditional78.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: If, ifTrue, conditional, expression
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
                    // 233:9: -> ^( 'if' expression $ifTrue ( conditional )? )
                    {
                        // Php.g:233:12: ^( 'if' expression $ifTrue ( conditional )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(If, "If"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_ifTrue.nextTree());
                        // Php.g:233:38: ( conditional )?
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
                    // Php.g:234:7: For '(' forInit forCondition forUpdate ')' statement
                    {
                    For79=(Token)match(input,For,FOLLOW_For_in_complexStatement1739); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_For.add(For79);

                    char_literal80=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal80);

                    pushFollow(FOLLOW_forInit_in_complexStatement1743);
                    forInit81=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forInit.add(forInit81.getTree());
                    pushFollow(FOLLOW_forCondition_in_complexStatement1745);
                    forCondition82=forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forCondition.add(forCondition82.getTree());
                    pushFollow(FOLLOW_forUpdate_in_complexStatement1747);
                    forUpdate83=forUpdate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate83.getTree());
                    char_literal84=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal84);

                    pushFollow(FOLLOW_statement_in_complexStatement1751);
                    statement85=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement85.getTree());


                    // AST REWRITE
                    // elements: statement, forUpdate, forCondition, forInit, For
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 234:60: -> ^( For forInit forCondition forUpdate statement )
                    {
                        // Php.g:234:63: ^( For forInit forCondition forUpdate statement )
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
                    // Php.g:235:7: Foreach '(' variable 'as' arrayEntry ')' statement
                    {
                    Foreach86=(Token)match(input,Foreach,FOLLOW_Foreach_in_complexStatement1773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Foreach.add(Foreach86);

                    char_literal87=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal87);

                    pushFollow(FOLLOW_variable_in_complexStatement1777);
                    variable88=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable.add(variable88.getTree());
                    string_literal89=(Token)match(input,112,FOLLOW_112_in_complexStatement1779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal89);

                    pushFollow(FOLLOW_arrayEntry_in_complexStatement1781);
                    arrayEntry90=arrayEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry90.getTree());
                    char_literal91=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal91);

                    pushFollow(FOLLOW_statement_in_complexStatement1785);
                    statement92=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement92.getTree());


                    // AST REWRITE
                    // elements: arrayEntry, statement, variable, Foreach
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 235:58: -> ^( Foreach variable arrayEntry statement )
                    {
                        // Php.g:235:61: ^( Foreach variable arrayEntry statement )
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
                    // Php.g:236:7: While '(' (whileCondition= expression )? ')' statement
                    {
                    While93=(Token)match(input,While,FOLLOW_While_in_complexStatement1805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_While.add(While93);

                    char_literal94=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal94);

                    // Php.g:236:31: (whileCondition= expression )?
                    int alt25=2;
                    alt25 = dfa25.predict(input);
                    switch (alt25) {
                        case 1 :
                            // Php.g:0:0: whileCondition= expression
                            {
                            pushFollow(FOLLOW_expression_in_complexStatement1811);
                            whileCondition=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(whileCondition.getTree());

                            }
                            break;

                    }

                    char_literal95=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal95);

                    pushFollow(FOLLOW_statement_in_complexStatement1816);
                    statement96=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement96.getTree());


                    // AST REWRITE
                    // elements: statement, whileCondition, While
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
                    // 236:58: -> ^( While $whileCondition statement )
                    {
                        // Php.g:236:61: ^( While $whileCondition statement )
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
                    // Php.g:237:7: Do statement While '(' doCondition= expression ')' ';'
                    {
                    Do97=(Token)match(input,Do,FOLLOW_Do_in_complexStatement1835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Do.add(Do97);

                    pushFollow(FOLLOW_statement_in_complexStatement1837);
                    statement98=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement98.getTree());
                    While99=(Token)match(input,While,FOLLOW_While_in_complexStatement1839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_While.add(While99);

                    char_literal100=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal100);

                    pushFollow(FOLLOW_expression_in_complexStatement1845);
                    doCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(doCondition.getTree());
                    char_literal101=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1847); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal101);

                    char_literal102=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_complexStatement1849); if (state.failed) return retval; 
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
                    // 237:61: -> ^( Do statement $doCondition)
                    {
                        // Php.g:237:64: ^( Do statement $doCondition)
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
                    // Php.g:238:7: Switch '(' expression ')' '{' cases '}'
                    {
                    Switch103=(Token)match(input,Switch,FOLLOW_Switch_in_complexStatement1868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Switch.add(Switch103);

                    char_literal104=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal104);

                    pushFollow(FOLLOW_expression_in_complexStatement1872);
                    expression105=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression105.getTree());
                    char_literal106=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal106);

                    char_literal107=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_complexStatement1876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(char_literal107);

                    pushFollow(FOLLOW_cases_in_complexStatement1877);
                    cases108=cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cases.add(cases108.getTree());
                    char_literal109=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_complexStatement1878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(char_literal109);



                    // AST REWRITE
                    // elements: Switch, expression, cases
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 238:45: -> ^( Switch expression cases )
                    {
                        // Php.g:238:48: ^( Switch expression cases )
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
                    // Php.g:239:7: functionDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_functionDefinition_in_complexStatement1896);
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
    // Php.g:242:1: simpleStatement : ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression );
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
            // Php.g:243:5: ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression )
            int alt31=8;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // Php.g:243:7: Echo commaList
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Echo111=(Token)match(input,Echo,FOLLOW_Echo_in_simpleStatement1913); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Echo111_tree = (CommonTree)adaptor.create(Echo111);
                    root_0 = (CommonTree)adaptor.becomeRoot(Echo111_tree, root_0);
                    }
                    pushFollow(FOLLOW_commaList_in_simpleStatement1916);
                    commaList112=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, commaList112.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:244:7: Global name ( ',' name )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Global113=(Token)match(input,Global,FOLLOW_Global_in_simpleStatement1924); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Global113_tree = (CommonTree)adaptor.create(Global113);
                    root_0 = (CommonTree)adaptor.becomeRoot(Global113_tree, root_0);
                    }
                    pushFollow(FOLLOW_name_in_simpleStatement1927);
                    name114=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name114.getTree());
                    // Php.g:244:20: ( ',' name )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // Php.g:244:21: ',' name
                    	    {
                    	    char_literal115=(Token)match(input,Comma,FOLLOW_Comma_in_simpleStatement1930); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_name_in_simpleStatement1933);
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
                    // Php.g:245:7: Static variable Equals atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Static117=(Token)match(input,Static,FOLLOW_Static_in_simpleStatement1943); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Static117_tree = (CommonTree)adaptor.create(Static117);
                    root_0 = (CommonTree)adaptor.becomeRoot(Static117_tree, root_0);
                    }
                    pushFollow(FOLLOW_variable_in_simpleStatement1946);
                    variable118=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable118.getTree());
                    Equals119=(Token)match(input,Equals,FOLLOW_Equals_in_simpleStatement1948); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_simpleStatement1951);
                    atom120=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom120.getTree());

                    }
                    break;
                case 4 :
                    // Php.g:246:7: Break ( Integer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Break121=(Token)match(input,Break,FOLLOW_Break_in_simpleStatement1959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Break121_tree = (CommonTree)adaptor.create(Break121);
                    root_0 = (CommonTree)adaptor.becomeRoot(Break121_tree, root_0);
                    }
                    // Php.g:246:14: ( Integer )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==Integer) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // Php.g:0:0: Integer
                            {
                            Integer122=(Token)match(input,Integer,FOLLOW_Integer_in_simpleStatement1962); if (state.failed) return retval;
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
                    // Php.g:247:7: Continue ( Integer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Continue123=(Token)match(input,Continue,FOLLOW_Continue_in_simpleStatement1971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Continue123_tree = (CommonTree)adaptor.create(Continue123);
                    root_0 = (CommonTree)adaptor.becomeRoot(Continue123_tree, root_0);
                    }
                    // Php.g:247:17: ( Integer )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==Integer) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // Php.g:0:0: Integer
                            {
                            Integer124=(Token)match(input,Integer,FOLLOW_Integer_in_simpleStatement1974); if (state.failed) return retval;
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
                    // Php.g:249:7: Return ( expression )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Return125=(Token)match(input,Return,FOLLOW_Return_in_simpleStatement1988); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Return125_tree = (CommonTree)adaptor.create(Return125);
                    root_0 = (CommonTree)adaptor.becomeRoot(Return125_tree, root_0);
                    }
                    // Php.g:249:15: ( expression )?
                    int alt30=2;
                    alt30 = dfa30.predict(input);
                    switch (alt30) {
                        case 1 :
                            // Php.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_simpleStatement1991);
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
                    // Php.g:250:7: RequireOperator expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RequireOperator127=(Token)match(input,RequireOperator,FOLLOW_RequireOperator_in_simpleStatement2000); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RequireOperator127_tree = (CommonTree)adaptor.create(RequireOperator127);
                    root_0 = (CommonTree)adaptor.becomeRoot(RequireOperator127_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_simpleStatement2003);
                    expression128=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression128.getTree());

                    }
                    break;
                case 8 :
                    // Php.g:251:7: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_simpleStatement2011);
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
    // Php.g:255:1: conditional : ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( If $ifCondition $ifTrue ( conditional )? ) | Else statement -> statement );
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
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // Php.g:256:5: ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( If $ifCondition $ifTrue ( conditional )? ) | Else statement -> statement )
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
                    // Php.g:256:7: ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
                    {
                    ElseIf130=(Token)match(input,ElseIf,FOLLOW_ElseIf_in_conditional2029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ElseIf.add(ElseIf130);

                    char_literal131=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_conditional2031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal131);

                    pushFollow(FOLLOW_expression_in_conditional2035);
                    ifCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifCondition.getTree());
                    char_literal132=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_conditional2037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal132);

                    pushFollow(FOLLOW_statement_in_conditional2041);
                    ifTrue=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(ifTrue.getTree());
                    // Php.g:256:62: ( conditional )?
                    int alt32=2;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // Php.g:0:0: conditional
                            {
                            pushFollow(FOLLOW_conditional_in_conditional2043);
                            conditional133=conditional();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_conditional.add(conditional133.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ifTrue, ifCondition, conditional
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
                    // 256:75: -> ^( If $ifCondition $ifTrue ( conditional )? )
                    {
                        // Php.g:256:78: ^( If $ifCondition $ifTrue ( conditional )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(If, "If"), root_1);

                        adaptor.addChild(root_1, stream_ifCondition.nextTree());
                        adaptor.addChild(root_1, stream_ifTrue.nextTree());
                        // Php.g:256:104: ( conditional )?
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
                    // Php.g:257:7: Else statement
                    {
                    Else134=(Token)match(input,Else,FOLLOW_Else_in_conditional2067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Else.add(Else134);

                    pushFollow(FOLLOW_statement_in_conditional2069);
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
                    // 257:22: -> statement
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
    // Php.g:260:1: forInit : ( commaList )? ';' -> ^( ForInit ( commaList )? ) ;
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
            // Php.g:261:5: ( ( commaList )? ';' -> ^( ForInit ( commaList )? ) )
            // Php.g:261:7: ( commaList )? ';'
            {
            // Php.g:261:7: ( commaList )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // Php.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forInit2090);
                    commaList136=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList136.getTree());

                    }
                    break;

            }

            char_literal137=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_forInit2093); if (state.failed) return retval; 
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
            // 261:22: -> ^( ForInit ( commaList )? )
            {
                // Php.g:261:25: ^( ForInit ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForInit, "ForInit"), root_1);

                // Php.g:261:35: ( commaList )?
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
    // Php.g:264:1: forCondition : ( commaList )? ';' -> ^( ForCondition ( commaList )? ) ;
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
            // Php.g:265:5: ( ( commaList )? ';' -> ^( ForCondition ( commaList )? ) )
            // Php.g:265:7: ( commaList )? ';'
            {
            // Php.g:265:7: ( commaList )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // Php.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forCondition2119);
                    commaList138=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList138.getTree());

                    }
                    break;

            }

            char_literal139=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_forCondition2122); if (state.failed) return retval; 
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
            // 265:22: -> ^( ForCondition ( commaList )? )
            {
                // Php.g:265:25: ^( ForCondition ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForCondition, "ForCondition"), root_1);

                // Php.g:265:40: ( commaList )?
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
    // Php.g:268:1: forUpdate : ( commaList )? -> ^( ForUpdate ( commaList )? ) ;
    public final PhpParser.forUpdate_return forUpdate() throws RecognitionException {
        PhpParser.forUpdate_return retval = new PhpParser.forUpdate_return();
        retval.start = input.LT(1);
        int forUpdate_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.commaList_return commaList140 = null;


        RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // Php.g:269:5: ( ( commaList )? -> ^( ForUpdate ( commaList )? ) )
            // Php.g:269:7: ( commaList )?
            {
            // Php.g:269:7: ( commaList )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // Php.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forUpdate2152);
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
            // 269:18: -> ^( ForUpdate ( commaList )? )
            {
                // Php.g:269:21: ^( ForUpdate ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForUpdate, "ForUpdate"), root_1);

                // Php.g:269:33: ( commaList )?
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
    // Php.g:272:1: cases : ( casestatement )* defaultcase ;
    public final PhpParser.cases_return cases() throws RecognitionException {
        PhpParser.cases_return retval = new PhpParser.cases_return();
        retval.start = input.LT(1);
        int cases_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.casestatement_return casestatement141 = null;

        PhpParser.defaultcase_return defaultcase142 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // Php.g:273:5: ( ( casestatement )* defaultcase )
            // Php.g:273:7: ( casestatement )* defaultcase
            {
            root_0 = (CommonTree)adaptor.nil();

            // Php.g:273:7: ( casestatement )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Case) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // Php.g:0:0: casestatement
            	    {
            	    pushFollow(FOLLOW_casestatement_in_cases2180);
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

            pushFollow(FOLLOW_defaultcase_in_cases2184);
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
    // Php.g:276:1: casestatement : Case expression ':' ( statement )* ;
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
            // Php.g:277:5: ( Case expression ':' ( statement )* )
            // Php.g:277:7: Case expression ':' ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Case143=(Token)match(input,Case,FOLLOW_Case_in_casestatement2201); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Case143_tree = (CommonTree)adaptor.create(Case143);
            root_0 = (CommonTree)adaptor.becomeRoot(Case143_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_casestatement2204);
            expression144=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression144.getTree());
            char_literal145=(Token)match(input,Colon,FOLLOW_Colon_in_casestatement2206); if (state.failed) return retval;
            // Php.g:277:29: ( statement )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // Php.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestatement2209);
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
    // Php.g:280:1: defaultcase : ( Default ':' ( statement )* ) ;
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
            // Php.g:281:5: ( ( Default ':' ( statement )* ) )
            // Php.g:281:7: ( Default ':' ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            // Php.g:281:7: ( Default ':' ( statement )* )
            // Php.g:281:8: Default ':' ( statement )*
            {
            Default147=(Token)match(input,Default,FOLLOW_Default_in_defaultcase2229); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Default147_tree = (CommonTree)adaptor.create(Default147);
            root_0 = (CommonTree)adaptor.becomeRoot(Default147_tree, root_0);
            }
            char_literal148=(Token)match(input,Colon,FOLLOW_Colon_in_defaultcase2232); if (state.failed) return retval;
            // Php.g:281:22: ( statement )*
            loop39:
            do {
                int alt39=2;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // Php.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultcase2235);
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
    // Php.g:284:1: functionDefinition : Function UnquotedString parametersDefinition bracketedBlock -> ^( Function UnquotedString parametersDefinition bracketedBlock ) ;
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
            // Php.g:285:5: ( Function UnquotedString parametersDefinition bracketedBlock -> ^( Function UnquotedString parametersDefinition bracketedBlock ) )
            // Php.g:285:7: Function UnquotedString parametersDefinition bracketedBlock
            {
            Function150=(Token)match(input,Function,FOLLOW_Function_in_functionDefinition2254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Function.add(Function150);

            UnquotedString151=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_functionDefinition2256); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString151);

            pushFollow(FOLLOW_parametersDefinition_in_functionDefinition2258);
            parametersDefinition152=parametersDefinition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition152.getTree());
            pushFollow(FOLLOW_bracketedBlock_in_functionDefinition2260);
            bracketedBlock153=bracketedBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketedBlock.add(bracketedBlock153.getTree());


            // AST REWRITE
            // elements: Function, parametersDefinition, bracketedBlock, UnquotedString
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 285:67: -> ^( Function UnquotedString parametersDefinition bracketedBlock )
            {
                // Php.g:286:9: ^( Function UnquotedString parametersDefinition bracketedBlock )
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
    // Php.g:289:1: parametersDefinition : OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace -> ^( Params ( paramDef )* ) ;
    public final PhpParser.parametersDefinition_return parametersDefinition() throws RecognitionException {
        PhpParser.parametersDefinition_return retval = new PhpParser.parametersDefinition_return();
        retval.start = input.LT(1);
        int parametersDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OpenBrace154=null;
        Token Comma156=null;
        Token CloseBrace158=null;
        PhpParser.paramDef_return paramDef155 = null;

        PhpParser.paramDef_return paramDef157 = null;


        CommonTree OpenBrace154_tree=null;
        CommonTree Comma156_tree=null;
        CommonTree CloseBrace158_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleSubtreeStream stream_paramDef=new RewriteRuleSubtreeStream(adaptor,"rule paramDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // Php.g:290:5: ( OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace -> ^( Params ( paramDef )* ) )
            // Php.g:290:7: OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace
            {
            OpenBrace154=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_parametersDefinition2298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace154);

            // Php.g:290:17: ( paramDef ( Comma paramDef )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Dollar||LA41_0==Ampersand) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Php.g:290:18: paramDef ( Comma paramDef )*
                    {
                    pushFollow(FOLLOW_paramDef_in_parametersDefinition2301);
                    paramDef155=paramDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramDef.add(paramDef155.getTree());
                    // Php.g:290:27: ( Comma paramDef )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==Comma) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // Php.g:290:28: Comma paramDef
                    	    {
                    	    Comma156=(Token)match(input,Comma,FOLLOW_Comma_in_parametersDefinition2304); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Comma.add(Comma156);

                    	    pushFollow(FOLLOW_paramDef_in_parametersDefinition2306);
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

            CloseBrace158=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_parametersDefinition2312); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace158);



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
            // 290:58: -> ^( Params ( paramDef )* )
            {
                // Php.g:290:61: ^( Params ( paramDef )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Params, "Params"), root_1);

                // Php.g:290:70: ( paramDef )*
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
    // Php.g:293:1: paramDef : paramName ( Equals atom )? ;
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
            // Php.g:294:5: ( paramName ( Equals atom )? )
            // Php.g:294:7: paramName ( Equals atom )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_paramName_in_paramDef2339);
            paramName159=paramName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramName159.getTree());
            // Php.g:294:17: ( Equals atom )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Equals) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Php.g:294:18: Equals atom
                    {
                    Equals160=(Token)match(input,Equals,FOLLOW_Equals_in_paramDef2342); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Equals160_tree = (CommonTree)adaptor.create(Equals160);
                    root_0 = (CommonTree)adaptor.becomeRoot(Equals160_tree, root_0);
                    }
                    pushFollow(FOLLOW_atom_in_paramDef2345);
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
    // Php.g:297:1: paramName : ( Dollar UnquotedString | Ampersand Dollar UnquotedString -> ^( Ampersand ^( Dollar UnquotedString ) ) );
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
            // Php.g:298:5: ( Dollar UnquotedString | Ampersand Dollar UnquotedString -> ^( Ampersand ^( Dollar UnquotedString ) ) )
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
                    // Php.g:298:7: Dollar UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Dollar162=(Token)match(input,Dollar,FOLLOW_Dollar_in_paramName2364); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar162_tree = (CommonTree)adaptor.create(Dollar162);
                    root_0 = (CommonTree)adaptor.becomeRoot(Dollar162_tree, root_0);
                    }
                    UnquotedString163=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString163_tree = (CommonTree)adaptor.create(UnquotedString163);
                    adaptor.addChild(root_0, UnquotedString163_tree);
                    }

                    }
                    break;
                case 2 :
                    // Php.g:299:7: Ampersand Dollar UnquotedString
                    {
                    Ampersand164=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_paramName2375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Ampersand.add(Ampersand164);

                    Dollar165=(Token)match(input,Dollar,FOLLOW_Dollar_in_paramName2377); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar165);

                    UnquotedString166=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString166);



                    // AST REWRITE
                    // elements: Dollar, UnquotedString, Ampersand
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 299:39: -> ^( Ampersand ^( Dollar UnquotedString ) )
                    {
                        // Php.g:299:42: ^( Ampersand ^( Dollar UnquotedString ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Ampersand.nextNode(), root_1);

                        // Php.g:299:54: ^( Dollar UnquotedString )
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
    // Php.g:302:1: commaList : expression ( ',' expression )* ;
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
            // Php.g:303:5: ( expression ( ',' expression )* )
            // Php.g:303:7: expression ( ',' expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_commaList2408);
            expression167=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression167.getTree());
            // Php.g:303:18: ( ',' expression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Comma) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // Php.g:303:19: ',' expression
            	    {
            	    char_literal168=(Token)match(input,Comma,FOLLOW_Comma_in_commaList2411); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_commaList2414);
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
    // Php.g:306:1: expression : weakLogicalOr ;
    public final PhpParser.expression_return expression() throws RecognitionException {
        PhpParser.expression_return retval = new PhpParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.weakLogicalOr_return weakLogicalOr170 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // Php.g:307:5: ( weakLogicalOr )
            // Php.g:307:7: weakLogicalOr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_weakLogicalOr_in_expression2438);
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
    // Php.g:310:1: weakLogicalOr : weakLogicalXor ( Or weakLogicalXor )* ;
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
            // Php.g:311:5: ( weakLogicalXor ( Or weakLogicalXor )* )
            // Php.g:311:7: weakLogicalXor ( Or weakLogicalXor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2455);
            weakLogicalXor171=weakLogicalXor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalXor171.getTree());
            // Php.g:311:22: ( Or weakLogicalXor )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // Php.g:311:23: Or weakLogicalXor
            	    {
            	    Or172=(Token)match(input,Or,FOLLOW_Or_in_weakLogicalOr2458); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Or172_tree = (CommonTree)adaptor.create(Or172);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Or172_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2461);
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
    // Php.g:314:1: weakLogicalXor : weakLogicalAnd ( Xor weakLogicalAnd )* ;
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
            // Php.g:315:5: ( weakLogicalAnd ( Xor weakLogicalAnd )* )
            // Php.g:315:7: weakLogicalAnd ( Xor weakLogicalAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2480);
            weakLogicalAnd174=weakLogicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd174.getTree());
            // Php.g:315:22: ( Xor weakLogicalAnd )*
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // Php.g:315:23: Xor weakLogicalAnd
            	    {
            	    Xor175=(Token)match(input,Xor,FOLLOW_Xor_in_weakLogicalXor2483); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Xor175_tree = (CommonTree)adaptor.create(Xor175);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Xor175_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2486);
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
    // Php.g:318:1: weakLogicalAnd : assignment ( And assignment )* ;
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
            // Php.g:319:5: ( assignment ( And assignment )* )
            // Php.g:319:7: assignment ( And assignment )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_in_weakLogicalAnd2509);
            assignment177=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment177.getTree());
            // Php.g:319:18: ( And assignment )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // Php.g:319:19: And assignment
            	    {
            	    And178=(Token)match(input,And,FOLLOW_And_in_weakLogicalAnd2512); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    And178_tree = (CommonTree)adaptor.create(And178);
            	    root_0 = (CommonTree)adaptor.becomeRoot(And178_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_assignment_in_weakLogicalAnd2515);
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
    // Php.g:322:1: assignment : ( name ( ( Equals | AsignmentOperator ) assignment ) | ternary );
    public final PhpParser.assignment_return assignment() throws RecognitionException {
        PhpParser.assignment_return retval = new PhpParser.assignment_return();
        retval.start = input.LT(1);
        int assignment_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set181=null;
        PhpParser.name_return name180 = null;

        PhpParser.assignment_return assignment182 = null;

        PhpParser.ternary_return ternary183 = null;


        CommonTree set181_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // Php.g:323:5: ( name ( ( Equals | AsignmentOperator ) assignment ) | ternary )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // Php.g:323:7: name ( ( Equals | AsignmentOperator ) assignment )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_assignment2534);
                    name180=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name180.getTree());
                    // Php.g:323:12: ( ( Equals | AsignmentOperator ) assignment )
                    // Php.g:323:13: ( Equals | AsignmentOperator ) assignment
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

                    pushFollow(FOLLOW_assignment_in_assignment2546);
                    assignment182=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment182.getTree());

                    }


                    }
                    break;
                case 2 :
                    // Php.g:324:7: ternary
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ternary_in_assignment2555);
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

    public static class ternary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternary"
    // Php.g:327:1: ternary : ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr );
    public final PhpParser.ternary_return ternary() throws RecognitionException {
        PhpParser.ternary_return retval = new PhpParser.ternary_return();
        retval.start = input.LT(1);
        int ternary_StartIndex = input.index();
        CommonTree root_0 = null;

        Token QuestionMark185=null;
        Token Colon187=null;
        PhpParser.logicalOr_return logicalOr184 = null;

        PhpParser.expression_return expression186 = null;

        PhpParser.expression_return expression188 = null;

        PhpParser.logicalOr_return logicalOr189 = null;


        CommonTree QuestionMark185_tree=null;
        CommonTree Colon187_tree=null;
        RewriteRuleTokenStream stream_QuestionMark=new RewriteRuleTokenStream(adaptor,"token QuestionMark");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleSubtreeStream stream_logicalOr=new RewriteRuleSubtreeStream(adaptor,"rule logicalOr");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // Php.g:328:5: ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr )
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // Php.g:328:7: logicalOr QuestionMark expression Colon expression
                    {
                    pushFollow(FOLLOW_logicalOr_in_ternary2572);
                    logicalOr184=logicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalOr.add(logicalOr184.getTree());
                    QuestionMark185=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QuestionMark.add(QuestionMark185);

                    pushFollow(FOLLOW_expression_in_ternary2576);
                    expression186=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression186.getTree());
                    Colon187=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Colon.add(Colon187);

                    pushFollow(FOLLOW_expression_in_ternary2580);
                    expression188=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression188.getTree());


                    // AST REWRITE
                    // elements: expression, logicalOr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 328:58: -> ^( IfExpression logicalOr ( expression )* )
                    {
                        // Php.g:328:61: ^( IfExpression logicalOr ( expression )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IfExpression, "IfExpression"), root_1);

                        adaptor.addChild(root_1, stream_logicalOr.nextTree());
                        // Php.g:328:86: ( expression )*
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
                    // Php.g:329:7: logicalOr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_logicalOr_in_ternary2599);
                    logicalOr189=logicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalOr189.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 32, ternary_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternary"

    public static class logicalOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalOr"
    // Php.g:332:1: logicalOr : logicalAnd ( LogicalOr logicalAnd )* ;
    public final PhpParser.logicalOr_return logicalOr() throws RecognitionException {
        PhpParser.logicalOr_return retval = new PhpParser.logicalOr_return();
        retval.start = input.LT(1);
        int logicalOr_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LogicalOr191=null;
        PhpParser.logicalAnd_return logicalAnd190 = null;

        PhpParser.logicalAnd_return logicalAnd192 = null;


        CommonTree LogicalOr191_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // Php.g:333:5: ( logicalAnd ( LogicalOr logicalAnd )* )
            // Php.g:333:7: logicalAnd ( LogicalOr logicalAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalAnd_in_logicalOr2620);
            logicalAnd190=logicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd190.getTree());
            // Php.g:333:18: ( LogicalOr logicalAnd )*
            loop50:
            do {
                int alt50=2;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // Php.g:333:19: LogicalOr logicalAnd
            	    {
            	    LogicalOr191=(Token)match(input,LogicalOr,FOLLOW_LogicalOr_in_logicalOr2623); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LogicalOr191_tree = (CommonTree)adaptor.create(LogicalOr191);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LogicalOr191_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicalAnd_in_logicalOr2626);
            	    logicalAnd192=logicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd192.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
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
            if ( state.backtracking>0 ) { memoize(input, 33, logicalOr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalOr"

    public static class logicalAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalAnd"
    // Php.g:336:1: logicalAnd : bitwiseOr ( LogicalAnd bitwiseOr )* ;
    public final PhpParser.logicalAnd_return logicalAnd() throws RecognitionException {
        PhpParser.logicalAnd_return retval = new PhpParser.logicalAnd_return();
        retval.start = input.LT(1);
        int logicalAnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LogicalAnd194=null;
        PhpParser.bitwiseOr_return bitwiseOr193 = null;

        PhpParser.bitwiseOr_return bitwiseOr195 = null;


        CommonTree LogicalAnd194_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // Php.g:337:5: ( bitwiseOr ( LogicalAnd bitwiseOr )* )
            // Php.g:337:7: bitwiseOr ( LogicalAnd bitwiseOr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2645);
            bitwiseOr193=bitwiseOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr193.getTree());
            // Php.g:337:17: ( LogicalAnd bitwiseOr )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // Php.g:337:18: LogicalAnd bitwiseOr
            	    {
            	    LogicalAnd194=(Token)match(input,LogicalAnd,FOLLOW_LogicalAnd_in_logicalAnd2648); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LogicalAnd194_tree = (CommonTree)adaptor.create(LogicalAnd194);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LogicalAnd194_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2651);
            	    bitwiseOr195=bitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr195.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
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
            if ( state.backtracking>0 ) { memoize(input, 34, logicalAnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalAnd"

    public static class bitwiseOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseOr"
    // Php.g:340:1: bitwiseOr : bitWiseAnd ( Pipe bitWiseAnd )* ;
    public final PhpParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
        PhpParser.bitwiseOr_return retval = new PhpParser.bitwiseOr_return();
        retval.start = input.LT(1);
        int bitwiseOr_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Pipe197=null;
        PhpParser.bitWiseAnd_return bitWiseAnd196 = null;

        PhpParser.bitWiseAnd_return bitWiseAnd198 = null;


        CommonTree Pipe197_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // Php.g:341:5: ( bitWiseAnd ( Pipe bitWiseAnd )* )
            // Php.g:341:7: bitWiseAnd ( Pipe bitWiseAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2674);
            bitWiseAnd196=bitWiseAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseAnd196.getTree());
            // Php.g:341:18: ( Pipe bitWiseAnd )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // Php.g:341:19: Pipe bitWiseAnd
            	    {
            	    Pipe197=(Token)match(input,Pipe,FOLLOW_Pipe_in_bitwiseOr2677); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Pipe197_tree = (CommonTree)adaptor.create(Pipe197);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Pipe197_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2680);
            	    bitWiseAnd198=bitWiseAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseAnd198.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 35, bitwiseOr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitwiseOr"

    public static class bitWiseAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitWiseAnd"
    // Php.g:344:1: bitWiseAnd : equalityCheck ( Ampersand equalityCheck )* ;
    public final PhpParser.bitWiseAnd_return bitWiseAnd() throws RecognitionException {
        PhpParser.bitWiseAnd_return retval = new PhpParser.bitWiseAnd_return();
        retval.start = input.LT(1);
        int bitWiseAnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Ampersand200=null;
        PhpParser.equalityCheck_return equalityCheck199 = null;

        PhpParser.equalityCheck_return equalityCheck201 = null;


        CommonTree Ampersand200_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // Php.g:345:5: ( equalityCheck ( Ampersand equalityCheck )* )
            // Php.g:345:7: equalityCheck ( Ampersand equalityCheck )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2699);
            equalityCheck199=equalityCheck();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCheck199.getTree());
            // Php.g:345:21: ( Ampersand equalityCheck )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // Php.g:345:22: Ampersand equalityCheck
            	    {
            	    Ampersand200=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_bitWiseAnd2702); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Ampersand200_tree = (CommonTree)adaptor.create(Ampersand200);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Ampersand200_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2705);
            	    equalityCheck201=equalityCheck();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCheck201.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 36, bitWiseAnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitWiseAnd"

    public static class equalityCheck_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityCheck"
    // Php.g:348:1: equalityCheck : comparisionCheck ( EqualityOperator comparisionCheck )? ;
    public final PhpParser.equalityCheck_return equalityCheck() throws RecognitionException {
        PhpParser.equalityCheck_return retval = new PhpParser.equalityCheck_return();
        retval.start = input.LT(1);
        int equalityCheck_StartIndex = input.index();
        CommonTree root_0 = null;

        Token EqualityOperator203=null;
        PhpParser.comparisionCheck_return comparisionCheck202 = null;

        PhpParser.comparisionCheck_return comparisionCheck204 = null;


        CommonTree EqualityOperator203_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // Php.g:349:5: ( comparisionCheck ( EqualityOperator comparisionCheck )? )
            // Php.g:349:7: comparisionCheck ( EqualityOperator comparisionCheck )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2724);
            comparisionCheck202=comparisionCheck();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, comparisionCheck202.getTree());
            // Php.g:349:24: ( EqualityOperator comparisionCheck )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // Php.g:349:25: EqualityOperator comparisionCheck
                    {
                    EqualityOperator203=(Token)match(input,EqualityOperator,FOLLOW_EqualityOperator_in_equalityCheck2727); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EqualityOperator203_tree = (CommonTree)adaptor.create(EqualityOperator203);
                    root_0 = (CommonTree)adaptor.becomeRoot(EqualityOperator203_tree, root_0);
                    }
                    pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2730);
                    comparisionCheck204=comparisionCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comparisionCheck204.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, equalityCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityCheck"

    public static class comparisionCheck_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparisionCheck"
    // Php.g:352:1: comparisionCheck : bitWiseShift ( ComparisionOperator bitWiseShift )? ;
    public final PhpParser.comparisionCheck_return comparisionCheck() throws RecognitionException {
        PhpParser.comparisionCheck_return retval = new PhpParser.comparisionCheck_return();
        retval.start = input.LT(1);
        int comparisionCheck_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ComparisionOperator206=null;
        PhpParser.bitWiseShift_return bitWiseShift205 = null;

        PhpParser.bitWiseShift_return bitWiseShift207 = null;


        CommonTree ComparisionOperator206_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // Php.g:353:5: ( bitWiseShift ( ComparisionOperator bitWiseShift )? )
            // Php.g:353:7: bitWiseShift ( ComparisionOperator bitWiseShift )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2753);
            bitWiseShift205=bitWiseShift();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseShift205.getTree());
            // Php.g:353:20: ( ComparisionOperator bitWiseShift )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // Php.g:353:21: ComparisionOperator bitWiseShift
                    {
                    ComparisionOperator206=(Token)match(input,ComparisionOperator,FOLLOW_ComparisionOperator_in_comparisionCheck2756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ComparisionOperator206_tree = (CommonTree)adaptor.create(ComparisionOperator206);
                    root_0 = (CommonTree)adaptor.becomeRoot(ComparisionOperator206_tree, root_0);
                    }
                    pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2759);
                    bitWiseShift207=bitWiseShift();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseShift207.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, comparisionCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "comparisionCheck"

    public static class bitWiseShift_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitWiseShift"
    // Php.g:356:1: bitWiseShift : addition ( ShiftOperator addition )* ;
    public final PhpParser.bitWiseShift_return bitWiseShift() throws RecognitionException {
        PhpParser.bitWiseShift_return retval = new PhpParser.bitWiseShift_return();
        retval.start = input.LT(1);
        int bitWiseShift_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ShiftOperator209=null;
        PhpParser.addition_return addition208 = null;

        PhpParser.addition_return addition210 = null;


        CommonTree ShiftOperator209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // Php.g:357:5: ( addition ( ShiftOperator addition )* )
            // Php.g:357:7: addition ( ShiftOperator addition )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_addition_in_bitWiseShift2778);
            addition208=addition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addition208.getTree());
            // Php.g:357:16: ( ShiftOperator addition )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // Php.g:357:17: ShiftOperator addition
            	    {
            	    ShiftOperator209=(Token)match(input,ShiftOperator,FOLLOW_ShiftOperator_in_bitWiseShift2781); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ShiftOperator209_tree = (CommonTree)adaptor.create(ShiftOperator209);
            	    root_0 = (CommonTree)adaptor.becomeRoot(ShiftOperator209_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addition_in_bitWiseShift2784);
            	    addition210=addition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addition210.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
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
            if ( state.backtracking>0 ) { memoize(input, 39, bitWiseShift_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitWiseShift"

    public static class addition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addition"
    // Php.g:360:1: addition : multiplication ( ( Plus | Minus | Dot ) multiplication )* ;
    public final PhpParser.addition_return addition() throws RecognitionException {
        PhpParser.addition_return retval = new PhpParser.addition_return();
        retval.start = input.LT(1);
        int addition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set212=null;
        PhpParser.multiplication_return multiplication211 = null;

        PhpParser.multiplication_return multiplication213 = null;


        CommonTree set212_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // Php.g:361:5: ( multiplication ( ( Plus | Minus | Dot ) multiplication )* )
            // Php.g:361:7: multiplication ( ( Plus | Minus | Dot ) multiplication )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplication_in_addition2807);
            multiplication211=multiplication();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplication211.getTree());
            // Php.g:361:22: ( ( Plus | Minus | Dot ) multiplication )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // Php.g:361:23: ( Plus | Minus | Dot ) multiplication
            	    {
            	    set212=(Token)input.LT(1);
            	    set212=(Token)input.LT(1);
            	    if ( input.LA(1)==Dot||(input.LA(1)>=Plus && input.LA(1)<=Minus) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set212), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplication_in_addition2823);
            	    multiplication213=multiplication();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplication213.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
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
            if ( state.backtracking>0 ) { memoize(input, 40, addition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addition"

    public static class multiplication_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplication"
    // Php.g:364:1: multiplication : logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )* ;
    public final PhpParser.multiplication_return multiplication() throws RecognitionException {
        PhpParser.multiplication_return retval = new PhpParser.multiplication_return();
        retval.start = input.LT(1);
        int multiplication_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set215=null;
        PhpParser.logicalNot_return logicalNot214 = null;

        PhpParser.logicalNot_return logicalNot216 = null;


        CommonTree set215_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // Php.g:365:5: ( logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )* )
            // Php.g:365:7: logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalNot_in_multiplication2842);
            logicalNot214=logicalNot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot214.getTree());
            // Php.g:365:18: ( ( Asterisk | Forwardslash | Percent ) logicalNot )*
            loop58:
            do {
                int alt58=2;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // Php.g:365:19: ( Asterisk | Forwardslash | Percent ) logicalNot
            	    {
            	    set215=(Token)input.LT(1);
            	    set215=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Asterisk && input.LA(1)<=Forwardslash) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set215), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_logicalNot_in_multiplication2858);
            	    logicalNot216=logicalNot();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot216.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, multiplication_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplication"

    public static class logicalNot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalNot"
    // Php.g:368:1: logicalNot : ( Bang logicalNot | instanceOf );
    public final PhpParser.logicalNot_return logicalNot() throws RecognitionException {
        PhpParser.logicalNot_return retval = new PhpParser.logicalNot_return();
        retval.start = input.LT(1);
        int logicalNot_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Bang217=null;
        PhpParser.logicalNot_return logicalNot218 = null;

        PhpParser.instanceOf_return instanceOf219 = null;


        CommonTree Bang217_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // Php.g:369:5: ( Bang logicalNot | instanceOf )
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // Php.g:369:7: Bang logicalNot
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Bang217=(Token)match(input,Bang,FOLLOW_Bang_in_logicalNot2877); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Bang217_tree = (CommonTree)adaptor.create(Bang217);
                    root_0 = (CommonTree)adaptor.becomeRoot(Bang217_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalNot_in_logicalNot2880);
                    logicalNot218=logicalNot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot218.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:370:7: instanceOf
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceOf_in_logicalNot2888);
                    instanceOf219=instanceOf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf219.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 42, logicalNot_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalNot"

    public static class instanceOf_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceOf"
    // Php.g:373:1: instanceOf : negateOrCast ( Instanceof negateOrCast )? ;
    public final PhpParser.instanceOf_return instanceOf() throws RecognitionException {
        PhpParser.instanceOf_return retval = new PhpParser.instanceOf_return();
        retval.start = input.LT(1);
        int instanceOf_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Instanceof221=null;
        PhpParser.negateOrCast_return negateOrCast220 = null;

        PhpParser.negateOrCast_return negateOrCast222 = null;


        CommonTree Instanceof221_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // Php.g:374:5: ( negateOrCast ( Instanceof negateOrCast )? )
            // Php.g:374:7: negateOrCast ( Instanceof negateOrCast )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_negateOrCast_in_instanceOf2905);
            negateOrCast220=negateOrCast();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, negateOrCast220.getTree());
            // Php.g:374:20: ( Instanceof negateOrCast )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // Php.g:374:21: Instanceof negateOrCast
                    {
                    Instanceof221=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2908); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Instanceof221_tree = (CommonTree)adaptor.create(Instanceof221);
                    root_0 = (CommonTree)adaptor.becomeRoot(Instanceof221_tree, root_0);
                    }
                    pushFollow(FOLLOW_negateOrCast_in_instanceOf2911);
                    negateOrCast222=negateOrCast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, negateOrCast222.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 43, instanceOf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "instanceOf"

    public static class negateOrCast_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negateOrCast"
    // Php.g:377:1: negateOrCast : ( ( Tilde | Minus | SuppressWarnings ) increment | OpenBrace PrimitiveType CloseBrace increment -> ^( Cast PrimitiveType increment ) | OpenBrace weakLogicalAnd CloseBrace | increment );
    public final PhpParser.negateOrCast_return negateOrCast() throws RecognitionException {
        PhpParser.negateOrCast_return retval = new PhpParser.negateOrCast_return();
        retval.start = input.LT(1);
        int negateOrCast_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set223=null;
        Token OpenBrace225=null;
        Token PrimitiveType226=null;
        Token CloseBrace227=null;
        Token OpenBrace229=null;
        Token CloseBrace231=null;
        PhpParser.increment_return increment224 = null;

        PhpParser.increment_return increment228 = null;

        PhpParser.weakLogicalAnd_return weakLogicalAnd230 = null;

        PhpParser.increment_return increment232 = null;


        CommonTree set223_tree=null;
        CommonTree OpenBrace225_tree=null;
        CommonTree PrimitiveType226_tree=null;
        CommonTree CloseBrace227_tree=null;
        CommonTree OpenBrace229_tree=null;
        CommonTree CloseBrace231_tree=null;
        RewriteRuleTokenStream stream_PrimitiveType=new RewriteRuleTokenStream(adaptor,"token PrimitiveType");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleSubtreeStream stream_increment=new RewriteRuleSubtreeStream(adaptor,"rule increment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // Php.g:378:5: ( ( Tilde | Minus | SuppressWarnings ) increment | OpenBrace PrimitiveType CloseBrace increment -> ^( Cast PrimitiveType increment ) | OpenBrace weakLogicalAnd CloseBrace | increment )
            int alt61=4;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // Php.g:378:7: ( Tilde | Minus | SuppressWarnings ) increment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set223=(Token)input.LT(1);
                    set223=(Token)input.LT(1);
                    if ( input.LA(1)==SuppressWarnings||input.LA(1)==Minus||input.LA(1)==Tilde ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set223), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_increment_in_negateOrCast2943);
                    increment224=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, increment224.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:379:7: OpenBrace PrimitiveType CloseBrace increment
                    {
                    OpenBrace225=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_negateOrCast2951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace225);

                    PrimitiveType226=(Token)match(input,PrimitiveType,FOLLOW_PrimitiveType_in_negateOrCast2953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PrimitiveType.add(PrimitiveType226);

                    CloseBrace227=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_negateOrCast2955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace227);

                    pushFollow(FOLLOW_increment_in_negateOrCast2957);
                    increment228=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_increment.add(increment228.getTree());


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
                    // 379:52: -> ^( Cast PrimitiveType increment )
                    {
                        // Php.g:379:55: ^( Cast PrimitiveType increment )
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
                    // Php.g:380:7: OpenBrace weakLogicalAnd CloseBrace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OpenBrace229=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_negateOrCast2975); if (state.failed) return retval;
                    pushFollow(FOLLOW_weakLogicalAnd_in_negateOrCast2978);
                    weakLogicalAnd230=weakLogicalAnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd230.getTree());
                    CloseBrace231=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_negateOrCast2980); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // Php.g:381:7: increment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_increment_in_negateOrCast2989);
                    increment232=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, increment232.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 44, negateOrCast_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negateOrCast"

    public static class increment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "increment"
    // Php.g:384:1: increment : ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone );
    public final PhpParser.increment_return increment() throws RecognitionException {
        PhpParser.increment_return retval = new PhpParser.increment_return();
        retval.start = input.LT(1);
        int increment_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IncrementOperator233=null;
        Token IncrementOperator236=null;
        PhpParser.name_return name234 = null;

        PhpParser.name_return name235 = null;

        PhpParser.newOrClone_return newOrClone237 = null;


        CommonTree IncrementOperator233_tree=null;
        CommonTree IncrementOperator236_tree=null;
        RewriteRuleTokenStream stream_IncrementOperator=new RewriteRuleTokenStream(adaptor,"token IncrementOperator");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // Php.g:385:5: ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone )
            int alt62=3;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // Php.g:385:7: IncrementOperator name
                    {
                    IncrementOperator233=(Token)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment3006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IncrementOperator.add(IncrementOperator233);

                    pushFollow(FOLLOW_name_in_increment3008);
                    name234=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name234.getTree());


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
                    // 385:30: -> ^( Prefix IncrementOperator name )
                    {
                        // Php.g:385:33: ^( Prefix IncrementOperator name )
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
                    // Php.g:386:7: name IncrementOperator
                    {
                    pushFollow(FOLLOW_name_in_increment3026);
                    name235=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name235.getTree());
                    IncrementOperator236=(Token)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment3028); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IncrementOperator.add(IncrementOperator236);



                    // AST REWRITE
                    // elements: IncrementOperator, name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 386:30: -> ^( Postfix IncrementOperator name )
                    {
                        // Php.g:386:33: ^( Postfix IncrementOperator name )
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
                    // Php.g:387:7: newOrClone
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_newOrClone_in_increment3046);
                    newOrClone237=newOrClone();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newOrClone237.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 45, increment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "increment"

    public static class newOrClone_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newOrClone"
    // Php.g:390:1: newOrClone : ( New nameOrFunctionCall | Clone name | atomOrReference );
    public final PhpParser.newOrClone_return newOrClone() throws RecognitionException {
        PhpParser.newOrClone_return retval = new PhpParser.newOrClone_return();
        retval.start = input.LT(1);
        int newOrClone_StartIndex = input.index();
        CommonTree root_0 = null;

        Token New238=null;
        Token Clone240=null;
        PhpParser.nameOrFunctionCall_return nameOrFunctionCall239 = null;

        PhpParser.name_return name241 = null;

        PhpParser.atomOrReference_return atomOrReference242 = null;


        CommonTree New238_tree=null;
        CommonTree Clone240_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // Php.g:391:5: ( New nameOrFunctionCall | Clone name | atomOrReference )
            int alt63=3;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // Php.g:391:7: New nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    New238=(Token)match(input,New,FOLLOW_New_in_newOrClone3063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    New238_tree = (CommonTree)adaptor.create(New238);
                    root_0 = (CommonTree)adaptor.becomeRoot(New238_tree, root_0);
                    }
                    pushFollow(FOLLOW_nameOrFunctionCall_in_newOrClone3066);
                    nameOrFunctionCall239=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall239.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:392:7: Clone name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Clone240=(Token)match(input,Clone,FOLLOW_Clone_in_newOrClone3074); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Clone240_tree = (CommonTree)adaptor.create(Clone240);
                    root_0 = (CommonTree)adaptor.becomeRoot(Clone240_tree, root_0);
                    }
                    pushFollow(FOLLOW_name_in_newOrClone3077);
                    name241=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name241.getTree());

                    }
                    break;
                case 3 :
                    // Php.g:393:7: atomOrReference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atomOrReference_in_newOrClone3085);
                    atomOrReference242=atomOrReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomOrReference242.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 46, newOrClone_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newOrClone"

    public static class atomOrReference_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomOrReference"
    // Php.g:396:1: atomOrReference : ( atom | reference );
    public final PhpParser.atomOrReference_return atomOrReference() throws RecognitionException {
        PhpParser.atomOrReference_return retval = new PhpParser.atomOrReference_return();
        retval.start = input.LT(1);
        int atomOrReference_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.atom_return atom243 = null;

        PhpParser.reference_return reference244 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // Php.g:397:5: ( atom | reference )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // Php.g:397:7: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_atomOrReference3102);
                    atom243=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom243.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:398:7: reference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_reference_in_atomOrReference3110);
                    reference244=reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reference244.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 47, atomOrReference_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atomOrReference"

    public static class arrayDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayDeclaration"
    // Php.g:401:1: arrayDeclaration : Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace -> ^( Array ( arrayEntry )* ) ;
    public final PhpParser.arrayDeclaration_return arrayDeclaration() throws RecognitionException {
        PhpParser.arrayDeclaration_return retval = new PhpParser.arrayDeclaration_return();
        retval.start = input.LT(1);
        int arrayDeclaration_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Array245=null;
        Token OpenBrace246=null;
        Token Comma248=null;
        Token CloseBrace250=null;
        PhpParser.arrayEntry_return arrayEntry247 = null;

        PhpParser.arrayEntry_return arrayEntry249 = null;


        CommonTree Array245_tree=null;
        CommonTree OpenBrace246_tree=null;
        CommonTree Comma248_tree=null;
        CommonTree CloseBrace250_tree=null;
        RewriteRuleTokenStream stream_Array=new RewriteRuleTokenStream(adaptor,"token Array");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleSubtreeStream stream_arrayEntry=new RewriteRuleSubtreeStream(adaptor,"rule arrayEntry");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // Php.g:402:5: ( Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace -> ^( Array ( arrayEntry )* ) )
            // Php.g:402:7: Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace
            {
            Array245=(Token)match(input,Array,FOLLOW_Array_in_arrayDeclaration3127); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Array.add(Array245);

            OpenBrace246=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_arrayDeclaration3129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace246);

            // Php.g:402:23: ( arrayEntry ( Comma arrayEntry )* )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // Php.g:402:24: arrayEntry ( Comma arrayEntry )*
                    {
                    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration3132);
                    arrayEntry247=arrayEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry247.getTree());
                    // Php.g:402:35: ( Comma arrayEntry )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==Comma) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // Php.g:402:36: Comma arrayEntry
                    	    {
                    	    Comma248=(Token)match(input,Comma,FOLLOW_Comma_in_arrayDeclaration3135); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Comma.add(Comma248);

                    	    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration3137);
                    	    arrayEntry249=arrayEntry();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry249.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            CloseBrace250=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_arrayDeclaration3143); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace250);



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
            // 402:68: -> ^( Array ( arrayEntry )* )
            {
                // Php.g:402:71: ^( Array ( arrayEntry )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_Array.nextNode(), root_1);

                // Php.g:402:79: ( arrayEntry )*
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
            if ( state.backtracking>0 ) { memoize(input, 48, arrayDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayDeclaration"

    public static class arrayEntry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayEntry"
    // Php.g:405:1: arrayEntry : ( keyValuePair | expression ) ;
    public final PhpParser.arrayEntry_return arrayEntry() throws RecognitionException {
        PhpParser.arrayEntry_return retval = new PhpParser.arrayEntry_return();
        retval.start = input.LT(1);
        int arrayEntry_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.keyValuePair_return keyValuePair251 = null;

        PhpParser.expression_return expression252 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // Php.g:406:5: ( ( keyValuePair | expression ) )
            // Php.g:406:7: ( keyValuePair | expression )
            {
            root_0 = (CommonTree)adaptor.nil();

            // Php.g:406:7: ( keyValuePair | expression )
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // Php.g:406:8: keyValuePair
                    {
                    pushFollow(FOLLOW_keyValuePair_in_arrayEntry3170);
                    keyValuePair251=keyValuePair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyValuePair251.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:406:23: expression
                    {
                    pushFollow(FOLLOW_expression_in_arrayEntry3174);
                    expression252=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression252.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, arrayEntry_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayEntry"

    public static class keyValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePair"
    // Php.g:409:1: keyValuePair : ( expression ArrayAssign expression ) -> ^( ArrayAssign ( expression )+ ) ;
    public final PhpParser.keyValuePair_return keyValuePair() throws RecognitionException {
        PhpParser.keyValuePair_return retval = new PhpParser.keyValuePair_return();
        retval.start = input.LT(1);
        int keyValuePair_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ArrayAssign254=null;
        PhpParser.expression_return expression253 = null;

        PhpParser.expression_return expression255 = null;


        CommonTree ArrayAssign254_tree=null;
        RewriteRuleTokenStream stream_ArrayAssign=new RewriteRuleTokenStream(adaptor,"token ArrayAssign");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // Php.g:410:5: ( ( expression ArrayAssign expression ) -> ^( ArrayAssign ( expression )+ ) )
            // Php.g:410:7: ( expression ArrayAssign expression )
            {
            // Php.g:410:7: ( expression ArrayAssign expression )
            // Php.g:410:8: expression ArrayAssign expression
            {
            pushFollow(FOLLOW_expression_in_keyValuePair3193);
            expression253=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression253.getTree());
            ArrayAssign254=(Token)match(input,ArrayAssign,FOLLOW_ArrayAssign_in_keyValuePair3195); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ArrayAssign.add(ArrayAssign254);

            pushFollow(FOLLOW_expression_in_keyValuePair3197);
            expression255=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression255.getTree());

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
            // 410:43: -> ^( ArrayAssign ( expression )+ )
            {
                // Php.g:410:46: ^( ArrayAssign ( expression )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 50, keyValuePair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "keyValuePair"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // Php.g:413:1: atom : ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration );
    public final PhpParser.atom_return atom() throws RecognitionException {
        PhpParser.atom_return retval = new PhpParser.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SingleQuotedString256=null;
        Token DoubleQuotedString257=null;
        Token HereDoc258=null;
        Token Integer259=null;
        Token Real260=null;
        Token Boolean261=null;
        PhpParser.arrayDeclaration_return arrayDeclaration262 = null;


        CommonTree SingleQuotedString256_tree=null;
        CommonTree DoubleQuotedString257_tree=null;
        CommonTree HereDoc258_tree=null;
        CommonTree Integer259_tree=null;
        CommonTree Real260_tree=null;
        CommonTree Boolean261_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // Php.g:413:5: ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration )
            int alt68=7;
            switch ( input.LA(1) ) {
            case SingleQuotedString:
                {
                alt68=1;
                }
                break;
            case DoubleQuotedString:
                {
                alt68=2;
                }
                break;
            case HereDoc:
                {
                alt68=3;
                }
                break;
            case Integer:
                {
                alt68=4;
                }
                break;
            case Real:
                {
                alt68=5;
                }
                break;
            case Boolean:
                {
                alt68=6;
                }
                break;
            case Array:
                {
                alt68=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // Php.g:413:7: SingleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SingleQuotedString256=(Token)match(input,SingleQuotedString,FOLLOW_SingleQuotedString_in_atom3219); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SingleQuotedString256_tree = (CommonTree)adaptor.create(SingleQuotedString256);
                    adaptor.addChild(root_0, SingleQuotedString256_tree);
                    }

                    }
                    break;
                case 2 :
                    // Php.g:413:28: DoubleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DoubleQuotedString257=(Token)match(input,DoubleQuotedString,FOLLOW_DoubleQuotedString_in_atom3223); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DoubleQuotedString257_tree = (CommonTree)adaptor.create(DoubleQuotedString257);
                    adaptor.addChild(root_0, DoubleQuotedString257_tree);
                    }

                    }
                    break;
                case 3 :
                    // Php.g:413:49: HereDoc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    HereDoc258=(Token)match(input,HereDoc,FOLLOW_HereDoc_in_atom3227); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HereDoc258_tree = (CommonTree)adaptor.create(HereDoc258);
                    adaptor.addChild(root_0, HereDoc258_tree);
                    }

                    }
                    break;
                case 4 :
                    // Php.g:413:59: Integer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Integer259=(Token)match(input,Integer,FOLLOW_Integer_in_atom3231); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Integer259_tree = (CommonTree)adaptor.create(Integer259);
                    adaptor.addChild(root_0, Integer259_tree);
                    }

                    }
                    break;
                case 5 :
                    // Php.g:413:69: Real
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Real260=(Token)match(input,Real,FOLLOW_Real_in_atom3235); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Real260_tree = (CommonTree)adaptor.create(Real260);
                    adaptor.addChild(root_0, Real260_tree);
                    }

                    }
                    break;
                case 6 :
                    // Php.g:413:76: Boolean
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Boolean261=(Token)match(input,Boolean,FOLLOW_Boolean_in_atom3239); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Boolean261_tree = (CommonTree)adaptor.create(Boolean261);
                    adaptor.addChild(root_0, Boolean261_tree);
                    }

                    }
                    break;
                case 7 :
                    // Php.g:413:86: arrayDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayDeclaration_in_atom3243);
                    arrayDeclaration262=arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayDeclaration262.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, atom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class reference_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reference"
    // Php.g:417:1: reference : ( Ampersand nameOrFunctionCall | nameOrFunctionCall );
    public final PhpParser.reference_return reference() throws RecognitionException {
        PhpParser.reference_return retval = new PhpParser.reference_return();
        retval.start = input.LT(1);
        int reference_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Ampersand263=null;
        PhpParser.nameOrFunctionCall_return nameOrFunctionCall264 = null;

        PhpParser.nameOrFunctionCall_return nameOrFunctionCall265 = null;


        CommonTree Ampersand263_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // Php.g:418:5: ( Ampersand nameOrFunctionCall | nameOrFunctionCall )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Ampersand) ) {
                alt69=1;
            }
            else if ( (LA69_0==Dollar||LA69_0==UnquotedString) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // Php.g:418:7: Ampersand nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Ampersand263=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_reference3261); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Ampersand263_tree = (CommonTree)adaptor.create(Ampersand263);
                    root_0 = (CommonTree)adaptor.becomeRoot(Ampersand263_tree, root_0);
                    }
                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference3264);
                    nameOrFunctionCall264=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall264.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:419:7: nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference3272);
                    nameOrFunctionCall265=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall265.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, reference_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "reference"

    public static class nameOrFunctionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameOrFunctionCall"
    // Php.g:422:1: nameOrFunctionCall : ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace -> ^( Apply name ( expression )* ) | name );
    public final PhpParser.nameOrFunctionCall_return nameOrFunctionCall() throws RecognitionException {
        PhpParser.nameOrFunctionCall_return retval = new PhpParser.nameOrFunctionCall_return();
        retval.start = input.LT(1);
        int nameOrFunctionCall_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OpenBrace267=null;
        Token Comma269=null;
        Token CloseBrace271=null;
        PhpParser.name_return name266 = null;

        PhpParser.expression_return expression268 = null;

        PhpParser.expression_return expression270 = null;

        PhpParser.name_return name272 = null;


        CommonTree OpenBrace267_tree=null;
        CommonTree Comma269_tree=null;
        CommonTree CloseBrace271_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
        RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // Php.g:423:5: ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace -> ^( Apply name ( expression )* ) | name )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // Php.g:423:7: name OpenBrace ( expression ( Comma expression )* )? CloseBrace
                    {
                    pushFollow(FOLLOW_name_in_nameOrFunctionCall3289);
                    name266=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name266.getTree());
                    OpenBrace267=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_nameOrFunctionCall3291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace267);

                    // Php.g:423:22: ( expression ( Comma expression )* )?
                    int alt71=2;
                    alt71 = dfa71.predict(input);
                    switch (alt71) {
                        case 1 :
                            // Php.g:423:23: expression ( Comma expression )*
                            {
                            pushFollow(FOLLOW_expression_in_nameOrFunctionCall3294);
                            expression268=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression268.getTree());
                            // Php.g:423:34: ( Comma expression )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==Comma) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // Php.g:423:35: Comma expression
                            	    {
                            	    Comma269=(Token)match(input,Comma,FOLLOW_Comma_in_nameOrFunctionCall3297); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_Comma.add(Comma269);

                            	    pushFollow(FOLLOW_expression_in_nameOrFunctionCall3299);
                            	    expression270=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_expression.add(expression270.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop70;
                                }
                            } while (true);


                            }
                            break;

                    }

                    CloseBrace271=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_nameOrFunctionCall3305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace271);



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
                    // 423:67: -> ^( Apply name ( expression )* )
                    {
                        // Php.g:423:70: ^( Apply name ( expression )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Apply, "Apply"), root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());
                        // Php.g:423:83: ( expression )*
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
                    // Php.g:424:7: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_nameOrFunctionCall3324);
                    name272=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name272.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, nameOrFunctionCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nameOrFunctionCall"

    public static class name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name"
    // Php.g:427:1: name : ( staticMemberAccess | memberAccess | variable );
    public final PhpParser.name_return name() throws RecognitionException {
        PhpParser.name_return retval = new PhpParser.name_return();
        retval.start = input.LT(1);
        int name_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.staticMemberAccess_return staticMemberAccess273 = null;

        PhpParser.memberAccess_return memberAccess274 = null;

        PhpParser.variable_return variable275 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // Php.g:427:5: ( staticMemberAccess | memberAccess | variable )
            int alt73=3;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // Php.g:427:7: staticMemberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_staticMemberAccess_in_name3336);
                    staticMemberAccess273=staticMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticMemberAccess273.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:428:7: memberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_memberAccess_in_name3344);
                    memberAccess274=memberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccess274.getTree());

                    }
                    break;
                case 3 :
                    // Php.g:429:7: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_name3352);
                    variable275=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable275.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 54, name_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "name"

    public static class staticMemberAccess_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticMemberAccess"
    // Php.g:432:1: staticMemberAccess : UnquotedString '::' variable ;
    public final PhpParser.staticMemberAccess_return staticMemberAccess() throws RecognitionException {
        PhpParser.staticMemberAccess_return retval = new PhpParser.staticMemberAccess_return();
        retval.start = input.LT(1);
        int staticMemberAccess_StartIndex = input.index();
        CommonTree root_0 = null;

        Token UnquotedString276=null;
        Token string_literal277=null;
        PhpParser.variable_return variable278 = null;


        CommonTree UnquotedString276_tree=null;
        CommonTree string_literal277_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // Php.g:433:5: ( UnquotedString '::' variable )
            // Php.g:433:7: UnquotedString '::' variable
            {
            root_0 = (CommonTree)adaptor.nil();

            UnquotedString276=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_staticMemberAccess3373); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString276_tree = (CommonTree)adaptor.create(UnquotedString276);
            adaptor.addChild(root_0, UnquotedString276_tree);
            }
            string_literal277=(Token)match(input,ClassMember,FOLLOW_ClassMember_in_staticMemberAccess3375); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal277_tree = (CommonTree)adaptor.create(string_literal277);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal277_tree, root_0);
            }
            pushFollow(FOLLOW_variable_in_staticMemberAccess3378);
            variable278=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable278.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, staticMemberAccess_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticMemberAccess"

    public static class memberAccess_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberAccess"
    // Php.g:436:1: memberAccess : variable ( OpenSquareBrace expression CloseSquareBrace | '->' UnquotedString )* ;
    public final PhpParser.memberAccess_return memberAccess() throws RecognitionException {
        PhpParser.memberAccess_return retval = new PhpParser.memberAccess_return();
        retval.start = input.LT(1);
        int memberAccess_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OpenSquareBrace280=null;
        Token CloseSquareBrace282=null;
        Token string_literal283=null;
        Token UnquotedString284=null;
        PhpParser.variable_return variable279 = null;

        PhpParser.expression_return expression281 = null;


        CommonTree OpenSquareBrace280_tree=null;
        CommonTree CloseSquareBrace282_tree=null;
        CommonTree string_literal283_tree=null;
        CommonTree UnquotedString284_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // Php.g:437:5: ( variable ( OpenSquareBrace expression CloseSquareBrace | '->' UnquotedString )* )
            // Php.g:437:7: variable ( OpenSquareBrace expression CloseSquareBrace | '->' UnquotedString )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_variable_in_memberAccess3395);
            variable279=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable279.getTree());
            // Php.g:438:9: ( OpenSquareBrace expression CloseSquareBrace | '->' UnquotedString )*
            loop74:
            do {
                int alt74=3;
                alt74 = dfa74.predict(input);
                switch (alt74) {
            	case 1 :
            	    // Php.g:438:11: OpenSquareBrace expression CloseSquareBrace
            	    {
            	    OpenSquareBrace280=(Token)match(input,OpenSquareBrace,FOLLOW_OpenSquareBrace_in_memberAccess3408); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OpenSquareBrace280_tree = (CommonTree)adaptor.create(OpenSquareBrace280);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OpenSquareBrace280_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expression_in_memberAccess3411);
            	    expression281=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression281.getTree());
            	    CloseSquareBrace282=(Token)match(input,CloseSquareBrace,FOLLOW_CloseSquareBrace_in_memberAccess3413); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // Php.g:439:11: '->' UnquotedString
            	    {
            	    string_literal283=(Token)match(input,InstanceMember,FOLLOW_InstanceMember_in_memberAccess3426); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal283_tree = (CommonTree)adaptor.create(string_literal283);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal283_tree, root_0);
            	    }
            	    UnquotedString284=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_memberAccess3429); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString284_tree = (CommonTree)adaptor.create(UnquotedString284);
            	    adaptor.addChild(root_0, UnquotedString284_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
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
            if ( state.backtracking>0 ) { memoize(input, 56, memberAccess_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "memberAccess"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // Php.g:442:1: variable : ( Dollar variable | UnquotedString );
    public final PhpParser.variable_return variable() throws RecognitionException {
        PhpParser.variable_return retval = new PhpParser.variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Dollar285=null;
        Token UnquotedString287=null;
        PhpParser.variable_return variable286 = null;


        CommonTree Dollar285_tree=null;
        CommonTree UnquotedString287_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // Php.g:443:5: ( Dollar variable | UnquotedString )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Dollar) ) {
                alt75=1;
            }
            else if ( (LA75_0==UnquotedString) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // Php.g:443:7: Dollar variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Dollar285=(Token)match(input,Dollar,FOLLOW_Dollar_in_variable3452); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar285_tree = (CommonTree)adaptor.create(Dollar285);
                    root_0 = (CommonTree)adaptor.becomeRoot(Dollar285_tree, root_0);
                    }
                    pushFollow(FOLLOW_variable_in_variable3455);
                    variable286=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable286.getTree());

                    }
                    break;
                case 2 :
                    // Php.g:444:7: UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UnquotedString287=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_variable3463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString287_tree = (CommonTree)adaptor.create(UnquotedString287);
                    adaptor.addChild(root_0, UnquotedString287_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 57, variable_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variable"

    // $ANTLR start synpred3_Php
    public final void synpred3_Php_fragment() throws RecognitionException {   
        // Php.g:158:7: ( ( simpleStatement )? BodyString )
        // Php.g:158:7: ( simpleStatement )? BodyString
        {
        // Php.g:158:7: ( simpleStatement )?
        int alt76=2;
        alt76 = dfa76.predict(input);
        switch (alt76) {
            case 1 :
                // Php.g:0:0: simpleStatement
                {
                pushFollow(FOLLOW_simpleStatement_in_synpred3_Php889);
                simpleStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,BodyString,FOLLOW_BodyString_in_synpred3_Php892); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Php

    // $ANTLR start synpred4_Php
    public final void synpred4_Php_fragment() throws RecognitionException {   
        // Php.g:159:7: ( '{' statement '}' )
        // Php.g:159:7: '{' statement '}'
        {
        match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_synpred4_Php900); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred4_Php902);
        statement();

        state._fsp--;
        if (state.failed) return ;
        match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_synpred4_Php904); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Php

    // $ANTLR start synpred5_Php
    public final void synpred5_Php_fragment() throws RecognitionException {   
        // Php.g:160:7: ( bracketedBlock )
        // Php.g:160:7: bracketedBlock
        {
        pushFollow(FOLLOW_bracketedBlock_in_synpred5_Php916);
        bracketedBlock();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Php

    // $ANTLR start synpred23_Php
    public final void synpred23_Php_fragment() throws RecognitionException {   
        // Php.g:208:7: ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) )
        // Php.g:208:7: ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' )
        {
        // Php.g:208:7: ( fieldModifier )*
        loop78:
        do {
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==Static||LA78_0==Abstract||LA78_0==AccessModifier) ) {
                alt78=1;
            }


            switch (alt78) {
        	case 1 :
        	    // Php.g:0:0: fieldModifier
        	    {
        	    pushFollow(FOLLOW_fieldModifier_in_synpred23_Php1396);
        	    fieldModifier();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop78;
            }
        } while (true);

        match(input,Function,FOLLOW_Function_in_synpred23_Php1399); if (state.failed) return ;
        match(input,UnquotedString,FOLLOW_UnquotedString_in_synpred23_Php1401); if (state.failed) return ;
        pushFollow(FOLLOW_parametersDefinition_in_synpred23_Php1403);
        parametersDefinition();

        state._fsp--;
        if (state.failed) return ;
        // Php.g:209:9: ( bracketedBlock | ';' )
        int alt79=2;
        int LA79_0 = input.LA(1);

        if ( (LA79_0==OpenCurlyBrace) ) {
            alt79=1;
        }
        else if ( (LA79_0==SemiColon) ) {
            alt79=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 79, 0, input);

            throw nvae;
        }
        switch (alt79) {
            case 1 :
                // Php.g:209:10: bracketedBlock
                {
                pushFollow(FOLLOW_bracketedBlock_in_synpred23_Php1415);
                bracketedBlock();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Php.g:209:27: ';'
                {
                match(input,SemiColon,FOLLOW_SemiColon_in_synpred23_Php1419); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred23_Php

    // $ANTLR start synpred33_Php
    public final void synpred33_Php_fragment() throws RecognitionException {   
        // Php.g:232:58: ( conditional )
        // Php.g:232:58: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred33_Php1708);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_Php

    // $ANTLR start synpred52_Php
    public final void synpred52_Php_fragment() throws RecognitionException {   
        // Php.g:256:62: ( conditional )
        // Php.g:256:62: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred52_Php2043);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_Php

    // $ANTLR start synpred65_Php
    public final void synpred65_Php_fragment() throws RecognitionException {   
        // Php.g:311:23: ( Or weakLogicalXor )
        // Php.g:311:23: Or weakLogicalXor
        {
        match(input,Or,FOLLOW_Or_in_synpred65_Php2458); if (state.failed) return ;
        pushFollow(FOLLOW_weakLogicalXor_in_synpred65_Php2461);
        weakLogicalXor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_Php

    // $ANTLR start synpred66_Php
    public final void synpred66_Php_fragment() throws RecognitionException {   
        // Php.g:315:23: ( Xor weakLogicalAnd )
        // Php.g:315:23: Xor weakLogicalAnd
        {
        match(input,Xor,FOLLOW_Xor_in_synpred66_Php2483); if (state.failed) return ;
        pushFollow(FOLLOW_weakLogicalAnd_in_synpred66_Php2486);
        weakLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_Php

    // $ANTLR start synpred67_Php
    public final void synpred67_Php_fragment() throws RecognitionException {   
        // Php.g:319:19: ( And assignment )
        // Php.g:319:19: And assignment
        {
        match(input,And,FOLLOW_And_in_synpred67_Php2512); if (state.failed) return ;
        pushFollow(FOLLOW_assignment_in_synpred67_Php2515);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_Php

    // $ANTLR start synpred69_Php
    public final void synpred69_Php_fragment() throws RecognitionException {   
        // Php.g:323:7: ( name ( ( Equals | AsignmentOperator ) assignment ) )
        // Php.g:323:7: name ( ( Equals | AsignmentOperator ) assignment )
        {
        pushFollow(FOLLOW_name_in_synpred69_Php2534);
        name();

        state._fsp--;
        if (state.failed) return ;
        // Php.g:323:12: ( ( Equals | AsignmentOperator ) assignment )
        // Php.g:323:13: ( Equals | AsignmentOperator ) assignment
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

        pushFollow(FOLLOW_assignment_in_synpred69_Php2546);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred69_Php

    // $ANTLR start synpred70_Php
    public final void synpred70_Php_fragment() throws RecognitionException {   
        // Php.g:328:7: ( logicalOr QuestionMark expression Colon expression )
        // Php.g:328:7: logicalOr QuestionMark expression Colon expression
        {
        pushFollow(FOLLOW_logicalOr_in_synpred70_Php2572);
        logicalOr();

        state._fsp--;
        if (state.failed) return ;
        match(input,QuestionMark,FOLLOW_QuestionMark_in_synpred70_Php2574); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred70_Php2576);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,Colon,FOLLOW_Colon_in_synpred70_Php2578); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred70_Php2580);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Php

    // $ANTLR start synpred92_Php
    public final void synpred92_Php_fragment() throws RecognitionException {   
        // Php.g:386:7: ( name IncrementOperator )
        // Php.g:386:7: name IncrementOperator
        {
        pushFollow(FOLLOW_name_in_synpred92_Php3026);
        name();

        state._fsp--;
        if (state.failed) return ;
        match(input,IncrementOperator,FOLLOW_IncrementOperator_in_synpred92_Php3028); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_Php

    // $ANTLR start synpred98_Php
    public final void synpred98_Php_fragment() throws RecognitionException {   
        // Php.g:406:8: ( keyValuePair )
        // Php.g:406:8: keyValuePair
        {
        pushFollow(FOLLOW_keyValuePair_in_synpred98_Php3170);
        keyValuePair();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_Php

    // $ANTLR start synpred108_Php
    public final void synpred108_Php_fragment() throws RecognitionException {   
        // Php.g:423:7: ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace )
        // Php.g:423:7: name OpenBrace ( expression ( Comma expression )* )? CloseBrace
        {
        pushFollow(FOLLOW_name_in_synpred108_Php3289);
        name();

        state._fsp--;
        if (state.failed) return ;
        match(input,OpenBrace,FOLLOW_OpenBrace_in_synpred108_Php3291); if (state.failed) return ;
        // Php.g:423:22: ( expression ( Comma expression )* )?
        int alt93=2;
        alt93 = dfa93.predict(input);
        switch (alt93) {
            case 1 :
                // Php.g:423:23: expression ( Comma expression )*
                {
                pushFollow(FOLLOW_expression_in_synpred108_Php3294);
                expression();

                state._fsp--;
                if (state.failed) return ;
                // Php.g:423:34: ( Comma expression )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==Comma) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // Php.g:423:35: Comma expression
                	    {
                	    match(input,Comma,FOLLOW_Comma_in_synpred108_Php3297); if (state.failed) return ;
                	    pushFollow(FOLLOW_expression_in_synpred108_Php3299);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }

        match(input,CloseBrace,FOLLOW_CloseBrace_in_synpred108_Php3305); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_Php

    // $ANTLR start synpred110_Php
    public final void synpred110_Php_fragment() throws RecognitionException {   
        // Php.g:428:7: ( memberAccess )
        // Php.g:428:7: memberAccess
        {
        pushFollow(FOLLOW_memberAccess_in_synpred110_Php3344);
        memberAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_Php

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
    public final boolean synpred98_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_Php_fragment(); // can never throw exception
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
    public final boolean synpred70_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_Php_fragment(); // can never throw exception
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
    public final boolean synpred108_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_Php_fragment(); // can never throw exception
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
    public final boolean synpred92_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_Php_fragment(); // can never throw exception
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
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA50 dfa50 = new DFA50(this);
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
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA93 dfa93 = new DFA93(this);
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
            return "()* loopback of 155:8: ( statement )*";
        }
    }
    static final String DFA3_eotS =
        "\u0134\uffff";
    static final String DFA3_eofS =
        "\u0134\uffff";
    static final String DFA3_minS =
        "\2\6\2\23\3\4\1\6\1\4\1\23\1\6\1\23\1\6\3\23\6\4\1\6\1\23\1\uffff"+
        "\1\6\12\uffff\25\0\2\uffff\1\0\2\uffff\20\0\2\uffff\44\0\2\uffff"+
        "\104\0\2\uffff\15\0\1\uffff\1\0\1\uffff\16\0\2\uffff\15\0\1\uffff"+
        "\1\0\1\uffff\16\0\2\uffff\16\0\2\uffff\46\0\2\uffff";
    static final String DFA3_maxS =
        "\2\140\2\121\2\123\2\140\1\132\1\121\3\140\3\121\6\130\1\6\1\121"+
        "\1\uffff\1\140\12\uffff\25\0\2\uffff\1\0\2\uffff\20\0\2\uffff\44"+
        "\0\2\uffff\104\0\2\uffff\15\0\1\uffff\1\0\1\uffff\16\0\2\uffff\15"+
        "\0\1\uffff\1\0\1\uffff\16\0\2\uffff\16\0\2\uffff\46\0\2\uffff";
    static final String DFA3_acceptS =
        "\30\uffff\1\1\1\uffff\1\4\1\uffff\1\5\1\6\34\uffff\1\7\u00f7\uffff"+
        "\1\3\1\2";
    static final String DFA3_specialS =
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
        "\1\u008d\2\uffff\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093"+
        "\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\uffff"+
        "\1\u009b\1\uffff\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1"+
        "\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9"+
        "\2\uffff\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0"+
        "\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\uffff\1\u00b7"+
        "\1\uffff\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be"+
        "\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\2\uffff"+
        "\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd"+
        "\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3\2\uffff\1\u00d4"+
        "\1\u00d5\1\u00d6\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db\1\u00dc"+
        "\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4"+
        "\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1\u00eb\1\u00ec"+
        "\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4"+
        "\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\2\uffff}>";
    static final String[] DFA3_transitionS = {
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
            "\1\72\113\uffff\1\30\2\uffff\1\70",
            "\1\72\113\uffff\1\30\2\uffff\1\73",
            "\1\72\1\uffff\1\102\12\uffff\1\101\1\uffff\1\77\2\uffff\1\115"+
            "\1\uffff\1\100\1\uffff\1\101\3\uffff\1\101\1\uffff\1\104\1\105"+
            "\56\uffff\1\30\1\76\1\uffff\1\111\6\uffff\1\103\1\114\1\106"+
            "\1\107\1\110\1\112\1\113",
            "\1\124\12\uffff\1\123\1\uffff\1\121\2\uffff\1\137\1\uffff\1"+
            "\122\1\uffff\1\123\3\uffff\1\123\1\uffff\1\126\1\127\57\uffff"+
            "\1\120\1\uffff\1\133\6\uffff\1\125\1\136\1\130\1\131\1\132\1"+
            "\134\1\135",
            "\1\72\1\uffff\1\157\1\uffff\1\142\4\uffff\1\155\1\154\1\140"+
            "\1\143\1\uffff\1\156\2\uffff\1\146\1\152\1\153\1\uffff\2\146"+
            "\3\145\1\uffff\1\160\23\uffff\1\161\1\163\1\162\1\144\31\uffff"+
            "\1\30\4\uffff\1\160\1\151\1\150\1\147\1\uffff\1\141",
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
            "\1\72\10\uffff\1\u00b5\1\u00b4\3\uffff\1\u00b6\2\uffff\1\u00ae"+
            "\1\u00b2\1\u00b3\1\uffff\2\u00ae\3\u00ad\25\uffff\1\u00b7\1"+
            "\u00b9\1\u00b8\1\u00ac\31\uffff\1\30\5\uffff\1\u00b1\1\u00b0"+
            "\1\u00af",
            "\1\72\10\uffff\1\u00c5\1\u00c4\3\uffff\1\u00ca\2\uffff\1\u00be"+
            "\1\u00c2\1\u00c3\1\uffff\2\u00be\3\u00bd\25\uffff\1\u00c6\1"+
            "\u00c8\1\u00c7\1\u00bc\31\uffff\1\30\5\uffff\1\u00c1\1\u00c0"+
            "\1\u00bf",
            "\1\72\10\uffff\1\u00d5\1\u00d4\3\uffff\1\u00d6\2\uffff\1\u00ce"+
            "\1\u00d2\1\u00d3\1\uffff\2\u00ce\3\u00cd\25\uffff\1\u00d7\1"+
            "\u00d9\1\u00d8\1\u00cc\31\uffff\1\30\5\uffff\1\u00d1\1\u00d0"+
            "\1\u00cf",
            "\1\72\10\uffff\1\u00e5\1\u00e4\3\uffff\1\u00ea\2\uffff\1\u00de"+
            "\1\u00e2\1\u00e3\1\uffff\2\u00de\3\u00dd\25\uffff\1\u00e6\1"+
            "\u00e8\1\u00e7\1\u00dc\31\uffff\1\30\5\uffff\1\u00e1\1\u00e0"+
            "\1\u00df",
            "\1\72\10\uffff\1\u00f5\1\u00f4\3\uffff\1\u00f6\2\uffff\1\u00ee"+
            "\1\u00f2\1\u00f3\1\uffff\2\u00ee\3\u00ed\25\uffff\1\u00f7\1"+
            "\u00f9\1\u00f8\1\u00ec\31\uffff\1\30\5\uffff\1\u00f1\1\u00f0"+
            "\1\u00ef",
            "\1\72\10\uffff\1\u0105\1\u0104\3\uffff\1\u0106\2\uffff\1\u00fe"+
            "\1\u0102\1\u0103\1\uffff\2\u00fe\3\u00fd\25\uffff\1\u0107\1"+
            "\u0109\1\u0108\1\u00fc\31\uffff\1\30\5\uffff\1\u0101\1\u0100"+
            "\1\u00ff",
            "\1\u010c",
            "\1\u010e\75\uffff\1\u010d",
            "",
            "\1\u011a\3\uffff\1\u0127\1\u0132\5\uffff\1\u0119\1\uffff\1"+
            "\u0117\2\uffff\1\u0125\1\uffff\1\u0118\1\uffff\1\u0119\3\uffff"+
            "\1\u0119\1\uffff\1\u011c\1\u011d\1\u010f\1\u012b\2\uffff\1\u012c"+
            "\1\u012d\1\u012e\1\u012f\1\u0130\2\uffff\1\u0131\1\u0112\1\u0113"+
            "\1\u0114\1\u0110\1\u0111\4\uffff\1\u0129\1\u012a\2\uffff\1\u0128"+
            "\24\uffff\1\u0126\1\u0116\1\uffff\1\u0121\1\u0115\5\uffff\1"+
            "\u011b\1\u0124\1\u011e\1\u011f\1\u0120\1\u0122\1\u0123",
            "",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "157:1: statement : ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_36 = input.LA(1);

                         
                        int index3_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_36);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_37 = input.LA(1);

                         
                        int index3_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_37);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_38 = input.LA(1);

                         
                        int index3_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_38);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_39 = input.LA(1);

                         
                        int index3_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_39);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_40 = input.LA(1);

                         
                        int index3_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_40);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_41 = input.LA(1);

                         
                        int index3_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_41);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_42 = input.LA(1);

                         
                        int index3_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_42);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_43 = input.LA(1);

                         
                        int index3_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_43);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_44 = input.LA(1);

                         
                        int index3_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_44);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_45 = input.LA(1);

                         
                        int index3_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_45);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_46 = input.LA(1);

                         
                        int index3_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_46);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA3_47 = input.LA(1);

                         
                        int index3_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_47);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA3_48 = input.LA(1);

                         
                        int index3_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_48);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA3_49 = input.LA(1);

                         
                        int index3_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_49);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA3_50 = input.LA(1);

                         
                        int index3_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_50);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA3_51 = input.LA(1);

                         
                        int index3_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_51);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA3_52 = input.LA(1);

                         
                        int index3_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_52);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA3_53 = input.LA(1);

                         
                        int index3_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_53);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA3_54 = input.LA(1);

                         
                        int index3_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_54);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA3_55 = input.LA(1);

                         
                        int index3_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_55);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA3_56 = input.LA(1);

                         
                        int index3_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_56);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA3_59 = input.LA(1);

                         
                        int index3_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_59);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA3_62 = input.LA(1);

                         
                        int index3_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_62);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA3_63 = input.LA(1);

                         
                        int index3_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_63);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA3_64 = input.LA(1);

                         
                        int index3_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_64);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA3_65 = input.LA(1);

                         
                        int index3_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_65);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA3_66 = input.LA(1);

                         
                        int index3_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_66);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA3_67 = input.LA(1);

                         
                        int index3_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_67);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA3_68 = input.LA(1);

                         
                        int index3_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_68);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA3_69 = input.LA(1);

                         
                        int index3_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_69);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA3_70 = input.LA(1);

                         
                        int index3_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_70);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA3_71 = input.LA(1);

                         
                        int index3_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_71);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA3_72 = input.LA(1);

                         
                        int index3_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_72);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA3_73 = input.LA(1);

                         
                        int index3_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_73);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA3_74 = input.LA(1);

                         
                        int index3_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_74);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA3_75 = input.LA(1);

                         
                        int index3_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_75);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA3_76 = input.LA(1);

                         
                        int index3_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_76);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA3_77 = input.LA(1);

                         
                        int index3_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_77);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA3_80 = input.LA(1);

                         
                        int index3_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_80);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA3_81 = input.LA(1);

                         
                        int index3_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_81);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA3_82 = input.LA(1);

                         
                        int index3_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_82);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA3_83 = input.LA(1);

                         
                        int index3_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_83);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA3_84 = input.LA(1);

                         
                        int index3_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_84);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA3_85 = input.LA(1);

                         
                        int index3_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_85);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA3_86 = input.LA(1);

                         
                        int index3_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_86);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA3_87 = input.LA(1);

                         
                        int index3_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_87);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA3_88 = input.LA(1);

                         
                        int index3_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_88);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA3_89 = input.LA(1);

                         
                        int index3_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_89);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA3_90 = input.LA(1);

                         
                        int index3_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_90);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA3_91 = input.LA(1);

                         
                        int index3_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_91);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA3_92 = input.LA(1);

                         
                        int index3_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_92);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA3_93 = input.LA(1);

                         
                        int index3_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_93);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA3_94 = input.LA(1);

                         
                        int index3_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_94);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA3_95 = input.LA(1);

                         
                        int index3_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_95);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA3_96 = input.LA(1);

                         
                        int index3_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_96);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA3_97 = input.LA(1);

                         
                        int index3_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_97);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA3_98 = input.LA(1);

                         
                        int index3_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_98);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA3_99 = input.LA(1);

                         
                        int index3_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_99);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA3_100 = input.LA(1);

                         
                        int index3_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_100);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA3_101 = input.LA(1);

                         
                        int index3_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_101);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA3_102 = input.LA(1);

                         
                        int index3_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_102);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA3_103 = input.LA(1);

                         
                        int index3_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_103);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA3_104 = input.LA(1);

                         
                        int index3_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_104);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA3_105 = input.LA(1);

                         
                        int index3_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_105);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA3_106 = input.LA(1);

                         
                        int index3_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_106);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA3_107 = input.LA(1);

                         
                        int index3_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_107);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA3_108 = input.LA(1);

                         
                        int index3_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_108);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA3_109 = input.LA(1);

                         
                        int index3_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_109);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA3_110 = input.LA(1);

                         
                        int index3_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_110);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA3_111 = input.LA(1);

                         
                        int index3_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_111);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA3_112 = input.LA(1);

                         
                        int index3_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_112);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA3_113 = input.LA(1);

                         
                        int index3_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_113);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA3_114 = input.LA(1);

                         
                        int index3_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_114);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA3_115 = input.LA(1);

                         
                        int index3_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_115);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA3_118 = input.LA(1);

                         
                        int index3_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_118);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA3_119 = input.LA(1);

                         
                        int index3_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_119);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA3_120 = input.LA(1);

                         
                        int index3_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_120);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA3_121 = input.LA(1);

                         
                        int index3_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_121);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA3_122 = input.LA(1);

                         
                        int index3_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_122);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA3_123 = input.LA(1);

                         
                        int index3_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_123);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA3_124 = input.LA(1);

                         
                        int index3_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_124);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA3_125 = input.LA(1);

                         
                        int index3_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_125);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA3_126 = input.LA(1);

                         
                        int index3_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_126);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA3_127 = input.LA(1);

                         
                        int index3_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_127);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA3_128 = input.LA(1);

                         
                        int index3_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_128);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA3_129 = input.LA(1);

                         
                        int index3_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_129);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA3_130 = input.LA(1);

                         
                        int index3_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_130);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA3_131 = input.LA(1);

                         
                        int index3_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_131);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA3_132 = input.LA(1);

                         
                        int index3_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_132);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA3_133 = input.LA(1);

                         
                        int index3_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_133);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA3_134 = input.LA(1);

                         
                        int index3_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_134);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA3_135 = input.LA(1);

                         
                        int index3_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_135);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA3_136 = input.LA(1);

                         
                        int index3_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_136);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA3_137 = input.LA(1);

                         
                        int index3_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_137);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA3_138 = input.LA(1);

                         
                        int index3_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_138);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA3_139 = input.LA(1);

                         
                        int index3_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_139);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA3_140 = input.LA(1);

                         
                        int index3_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_140);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA3_141 = input.LA(1);

                         
                        int index3_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_141);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA3_142 = input.LA(1);

                         
                        int index3_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_142);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA3_143 = input.LA(1);

                         
                        int index3_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_143);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA3_144 = input.LA(1);

                         
                        int index3_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_144);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA3_145 = input.LA(1);

                         
                        int index3_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_145);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA3_146 = input.LA(1);

                         
                        int index3_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_146);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA3_147 = input.LA(1);

                         
                        int index3_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_147);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA3_148 = input.LA(1);

                         
                        int index3_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_148);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA3_149 = input.LA(1);

                         
                        int index3_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_149);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA3_150 = input.LA(1);

                         
                        int index3_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_150);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA3_151 = input.LA(1);

                         
                        int index3_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_151);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA3_152 = input.LA(1);

                         
                        int index3_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_152);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA3_153 = input.LA(1);

                         
                        int index3_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_153);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA3_154 = input.LA(1);

                         
                        int index3_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_154);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA3_155 = input.LA(1);

                         
                        int index3_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_155);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA3_156 = input.LA(1);

                         
                        int index3_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_156);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA3_157 = input.LA(1);

                         
                        int index3_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_157);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA3_158 = input.LA(1);

                         
                        int index3_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_158);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA3_159 = input.LA(1);

                         
                        int index3_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_159);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA3_160 = input.LA(1);

                         
                        int index3_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_160);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA3_161 = input.LA(1);

                         
                        int index3_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_161);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA3_162 = input.LA(1);

                         
                        int index3_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_162);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA3_163 = input.LA(1);

                         
                        int index3_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_163);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA3_164 = input.LA(1);

                         
                        int index3_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_164);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA3_165 = input.LA(1);

                         
                        int index3_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_165);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA3_166 = input.LA(1);

                         
                        int index3_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_166);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA3_167 = input.LA(1);

                         
                        int index3_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_167);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA3_168 = input.LA(1);

                         
                        int index3_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_168);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA3_169 = input.LA(1);

                         
                        int index3_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_169);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA3_170 = input.LA(1);

                         
                        int index3_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_170);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA3_171 = input.LA(1);

                         
                        int index3_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_171);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA3_172 = input.LA(1);

                         
                        int index3_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_172);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA3_173 = input.LA(1);

                         
                        int index3_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_173);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA3_174 = input.LA(1);

                         
                        int index3_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_174);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA3_175 = input.LA(1);

                         
                        int index3_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_175);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA3_176 = input.LA(1);

                         
                        int index3_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_176);
                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA3_177 = input.LA(1);

                         
                        int index3_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_177);
                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA3_178 = input.LA(1);

                         
                        int index3_178 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_178);
                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA3_179 = input.LA(1);

                         
                        int index3_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_179);
                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA3_180 = input.LA(1);

                         
                        int index3_180 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_180);
                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA3_181 = input.LA(1);

                         
                        int index3_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_181);
                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA3_182 = input.LA(1);

                         
                        int index3_182 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_182);
                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA3_183 = input.LA(1);

                         
                        int index3_183 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_183);
                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA3_184 = input.LA(1);

                         
                        int index3_184 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_184);
                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA3_185 = input.LA(1);

                         
                        int index3_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_185);
                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA3_188 = input.LA(1);

                         
                        int index3_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_188);
                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA3_189 = input.LA(1);

                         
                        int index3_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_189);
                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA3_190 = input.LA(1);

                         
                        int index3_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_190);
                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA3_191 = input.LA(1);

                         
                        int index3_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_191);
                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA3_192 = input.LA(1);

                         
                        int index3_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_192);
                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA3_193 = input.LA(1);

                         
                        int index3_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_193);
                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA3_194 = input.LA(1);

                         
                        int index3_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_194);
                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA3_195 = input.LA(1);

                         
                        int index3_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_195);
                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA3_196 = input.LA(1);

                         
                        int index3_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_196);
                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA3_197 = input.LA(1);

                         
                        int index3_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_197);
                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA3_198 = input.LA(1);

                         
                        int index3_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_198);
                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA3_199 = input.LA(1);

                         
                        int index3_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_199);
                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA3_200 = input.LA(1);

                         
                        int index3_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_200);
                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA3_202 = input.LA(1);

                         
                        int index3_202 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_202);
                        if ( s>=0 ) return s;
                        break;
                    case 156 : 
                        int LA3_204 = input.LA(1);

                         
                        int index3_204 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_204);
                        if ( s>=0 ) return s;
                        break;
                    case 157 : 
                        int LA3_205 = input.LA(1);

                         
                        int index3_205 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_205);
                        if ( s>=0 ) return s;
                        break;
                    case 158 : 
                        int LA3_206 = input.LA(1);

                         
                        int index3_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_206);
                        if ( s>=0 ) return s;
                        break;
                    case 159 : 
                        int LA3_207 = input.LA(1);

                         
                        int index3_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_207);
                        if ( s>=0 ) return s;
                        break;
                    case 160 : 
                        int LA3_208 = input.LA(1);

                         
                        int index3_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_208);
                        if ( s>=0 ) return s;
                        break;
                    case 161 : 
                        int LA3_209 = input.LA(1);

                         
                        int index3_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_209);
                        if ( s>=0 ) return s;
                        break;
                    case 162 : 
                        int LA3_210 = input.LA(1);

                         
                        int index3_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_210);
                        if ( s>=0 ) return s;
                        break;
                    case 163 : 
                        int LA3_211 = input.LA(1);

                         
                        int index3_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_211);
                        if ( s>=0 ) return s;
                        break;
                    case 164 : 
                        int LA3_212 = input.LA(1);

                         
                        int index3_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_212);
                        if ( s>=0 ) return s;
                        break;
                    case 165 : 
                        int LA3_213 = input.LA(1);

                         
                        int index3_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_213);
                        if ( s>=0 ) return s;
                        break;
                    case 166 : 
                        int LA3_214 = input.LA(1);

                         
                        int index3_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_214);
                        if ( s>=0 ) return s;
                        break;
                    case 167 : 
                        int LA3_215 = input.LA(1);

                         
                        int index3_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_215);
                        if ( s>=0 ) return s;
                        break;
                    case 168 : 
                        int LA3_216 = input.LA(1);

                         
                        int index3_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_216);
                        if ( s>=0 ) return s;
                        break;
                    case 169 : 
                        int LA3_217 = input.LA(1);

                         
                        int index3_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_217);
                        if ( s>=0 ) return s;
                        break;
                    case 170 : 
                        int LA3_220 = input.LA(1);

                         
                        int index3_220 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_220);
                        if ( s>=0 ) return s;
                        break;
                    case 171 : 
                        int LA3_221 = input.LA(1);

                         
                        int index3_221 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_221);
                        if ( s>=0 ) return s;
                        break;
                    case 172 : 
                        int LA3_222 = input.LA(1);

                         
                        int index3_222 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_222);
                        if ( s>=0 ) return s;
                        break;
                    case 173 : 
                        int LA3_223 = input.LA(1);

                         
                        int index3_223 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_223);
                        if ( s>=0 ) return s;
                        break;
                    case 174 : 
                        int LA3_224 = input.LA(1);

                         
                        int index3_224 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_224);
                        if ( s>=0 ) return s;
                        break;
                    case 175 : 
                        int LA3_225 = input.LA(1);

                         
                        int index3_225 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_225);
                        if ( s>=0 ) return s;
                        break;
                    case 176 : 
                        int LA3_226 = input.LA(1);

                         
                        int index3_226 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_226);
                        if ( s>=0 ) return s;
                        break;
                    case 177 : 
                        int LA3_227 = input.LA(1);

                         
                        int index3_227 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_227);
                        if ( s>=0 ) return s;
                        break;
                    case 178 : 
                        int LA3_228 = input.LA(1);

                         
                        int index3_228 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_228);
                        if ( s>=0 ) return s;
                        break;
                    case 179 : 
                        int LA3_229 = input.LA(1);

                         
                        int index3_229 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_229);
                        if ( s>=0 ) return s;
                        break;
                    case 180 : 
                        int LA3_230 = input.LA(1);

                         
                        int index3_230 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_230);
                        if ( s>=0 ) return s;
                        break;
                    case 181 : 
                        int LA3_231 = input.LA(1);

                         
                        int index3_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_231);
                        if ( s>=0 ) return s;
                        break;
                    case 182 : 
                        int LA3_232 = input.LA(1);

                         
                        int index3_232 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_232);
                        if ( s>=0 ) return s;
                        break;
                    case 183 : 
                        int LA3_234 = input.LA(1);

                         
                        int index3_234 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_234);
                        if ( s>=0 ) return s;
                        break;
                    case 184 : 
                        int LA3_236 = input.LA(1);

                         
                        int index3_236 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_236);
                        if ( s>=0 ) return s;
                        break;
                    case 185 : 
                        int LA3_237 = input.LA(1);

                         
                        int index3_237 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_237);
                        if ( s>=0 ) return s;
                        break;
                    case 186 : 
                        int LA3_238 = input.LA(1);

                         
                        int index3_238 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_238);
                        if ( s>=0 ) return s;
                        break;
                    case 187 : 
                        int LA3_239 = input.LA(1);

                         
                        int index3_239 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_239);
                        if ( s>=0 ) return s;
                        break;
                    case 188 : 
                        int LA3_240 = input.LA(1);

                         
                        int index3_240 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_240);
                        if ( s>=0 ) return s;
                        break;
                    case 189 : 
                        int LA3_241 = input.LA(1);

                         
                        int index3_241 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_241);
                        if ( s>=0 ) return s;
                        break;
                    case 190 : 
                        int LA3_242 = input.LA(1);

                         
                        int index3_242 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_242);
                        if ( s>=0 ) return s;
                        break;
                    case 191 : 
                        int LA3_243 = input.LA(1);

                         
                        int index3_243 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_243);
                        if ( s>=0 ) return s;
                        break;
                    case 192 : 
                        int LA3_244 = input.LA(1);

                         
                        int index3_244 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_244);
                        if ( s>=0 ) return s;
                        break;
                    case 193 : 
                        int LA3_245 = input.LA(1);

                         
                        int index3_245 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_245);
                        if ( s>=0 ) return s;
                        break;
                    case 194 : 
                        int LA3_246 = input.LA(1);

                         
                        int index3_246 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_246);
                        if ( s>=0 ) return s;
                        break;
                    case 195 : 
                        int LA3_247 = input.LA(1);

                         
                        int index3_247 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_247);
                        if ( s>=0 ) return s;
                        break;
                    case 196 : 
                        int LA3_248 = input.LA(1);

                         
                        int index3_248 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_248);
                        if ( s>=0 ) return s;
                        break;
                    case 197 : 
                        int LA3_249 = input.LA(1);

                         
                        int index3_249 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_249);
                        if ( s>=0 ) return s;
                        break;
                    case 198 : 
                        int LA3_252 = input.LA(1);

                         
                        int index3_252 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_252);
                        if ( s>=0 ) return s;
                        break;
                    case 199 : 
                        int LA3_253 = input.LA(1);

                         
                        int index3_253 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_253);
                        if ( s>=0 ) return s;
                        break;
                    case 200 : 
                        int LA3_254 = input.LA(1);

                         
                        int index3_254 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_254);
                        if ( s>=0 ) return s;
                        break;
                    case 201 : 
                        int LA3_255 = input.LA(1);

                         
                        int index3_255 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_255);
                        if ( s>=0 ) return s;
                        break;
                    case 202 : 
                        int LA3_256 = input.LA(1);

                         
                        int index3_256 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_256);
                        if ( s>=0 ) return s;
                        break;
                    case 203 : 
                        int LA3_257 = input.LA(1);

                         
                        int index3_257 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_257);
                        if ( s>=0 ) return s;
                        break;
                    case 204 : 
                        int LA3_258 = input.LA(1);

                         
                        int index3_258 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_258);
                        if ( s>=0 ) return s;
                        break;
                    case 205 : 
                        int LA3_259 = input.LA(1);

                         
                        int index3_259 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_259);
                        if ( s>=0 ) return s;
                        break;
                    case 206 : 
                        int LA3_260 = input.LA(1);

                         
                        int index3_260 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_260);
                        if ( s>=0 ) return s;
                        break;
                    case 207 : 
                        int LA3_261 = input.LA(1);

                         
                        int index3_261 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_261);
                        if ( s>=0 ) return s;
                        break;
                    case 208 : 
                        int LA3_262 = input.LA(1);

                         
                        int index3_262 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_262);
                        if ( s>=0 ) return s;
                        break;
                    case 209 : 
                        int LA3_263 = input.LA(1);

                         
                        int index3_263 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_263);
                        if ( s>=0 ) return s;
                        break;
                    case 210 : 
                        int LA3_264 = input.LA(1);

                         
                        int index3_264 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_264);
                        if ( s>=0 ) return s;
                        break;
                    case 211 : 
                        int LA3_265 = input.LA(1);

                         
                        int index3_265 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_265);
                        if ( s>=0 ) return s;
                        break;
                    case 212 : 
                        int LA3_268 = input.LA(1);

                         
                        int index3_268 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_268);
                        if ( s>=0 ) return s;
                        break;
                    case 213 : 
                        int LA3_269 = input.LA(1);

                         
                        int index3_269 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_269);
                        if ( s>=0 ) return s;
                        break;
                    case 214 : 
                        int LA3_270 = input.LA(1);

                         
                        int index3_270 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Php()) ) {s = 24;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index3_270);
                        if ( s>=0 ) return s;
                        break;
                    case 215 : 
                        int LA3_271 = input.LA(1);

                         
                        int index3_271 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_271);
                        if ( s>=0 ) return s;
                        break;
                    case 216 : 
                        int LA3_272 = input.LA(1);

                         
                        int index3_272 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_272);
                        if ( s>=0 ) return s;
                        break;
                    case 217 : 
                        int LA3_273 = input.LA(1);

                         
                        int index3_273 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_273);
                        if ( s>=0 ) return s;
                        break;
                    case 218 : 
                        int LA3_274 = input.LA(1);

                         
                        int index3_274 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_274);
                        if ( s>=0 ) return s;
                        break;
                    case 219 : 
                        int LA3_275 = input.LA(1);

                         
                        int index3_275 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_275);
                        if ( s>=0 ) return s;
                        break;
                    case 220 : 
                        int LA3_276 = input.LA(1);

                         
                        int index3_276 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_276);
                        if ( s>=0 ) return s;
                        break;
                    case 221 : 
                        int LA3_277 = input.LA(1);

                         
                        int index3_277 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_277);
                        if ( s>=0 ) return s;
                        break;
                    case 222 : 
                        int LA3_278 = input.LA(1);

                         
                        int index3_278 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_278);
                        if ( s>=0 ) return s;
                        break;
                    case 223 : 
                        int LA3_279 = input.LA(1);

                         
                        int index3_279 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_279);
                        if ( s>=0 ) return s;
                        break;
                    case 224 : 
                        int LA3_280 = input.LA(1);

                         
                        int index3_280 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_280);
                        if ( s>=0 ) return s;
                        break;
                    case 225 : 
                        int LA3_281 = input.LA(1);

                         
                        int index3_281 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_281);
                        if ( s>=0 ) return s;
                        break;
                    case 226 : 
                        int LA3_282 = input.LA(1);

                         
                        int index3_282 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_282);
                        if ( s>=0 ) return s;
                        break;
                    case 227 : 
                        int LA3_283 = input.LA(1);

                         
                        int index3_283 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_283);
                        if ( s>=0 ) return s;
                        break;
                    case 228 : 
                        int LA3_284 = input.LA(1);

                         
                        int index3_284 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_284);
                        if ( s>=0 ) return s;
                        break;
                    case 229 : 
                        int LA3_285 = input.LA(1);

                         
                        int index3_285 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_285);
                        if ( s>=0 ) return s;
                        break;
                    case 230 : 
                        int LA3_286 = input.LA(1);

                         
                        int index3_286 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_286);
                        if ( s>=0 ) return s;
                        break;
                    case 231 : 
                        int LA3_287 = input.LA(1);

                         
                        int index3_287 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_287);
                        if ( s>=0 ) return s;
                        break;
                    case 232 : 
                        int LA3_288 = input.LA(1);

                         
                        int index3_288 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_288);
                        if ( s>=0 ) return s;
                        break;
                    case 233 : 
                        int LA3_289 = input.LA(1);

                         
                        int index3_289 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_289);
                        if ( s>=0 ) return s;
                        break;
                    case 234 : 
                        int LA3_290 = input.LA(1);

                         
                        int index3_290 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_290);
                        if ( s>=0 ) return s;
                        break;
                    case 235 : 
                        int LA3_291 = input.LA(1);

                         
                        int index3_291 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_291);
                        if ( s>=0 ) return s;
                        break;
                    case 236 : 
                        int LA3_292 = input.LA(1);

                         
                        int index3_292 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_292);
                        if ( s>=0 ) return s;
                        break;
                    case 237 : 
                        int LA3_293 = input.LA(1);

                         
                        int index3_293 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_293);
                        if ( s>=0 ) return s;
                        break;
                    case 238 : 
                        int LA3_294 = input.LA(1);

                         
                        int index3_294 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_294);
                        if ( s>=0 ) return s;
                        break;
                    case 239 : 
                        int LA3_295 = input.LA(1);

                         
                        int index3_295 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_295);
                        if ( s>=0 ) return s;
                        break;
                    case 240 : 
                        int LA3_296 = input.LA(1);

                         
                        int index3_296 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_296);
                        if ( s>=0 ) return s;
                        break;
                    case 241 : 
                        int LA3_297 = input.LA(1);

                         
                        int index3_297 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_297);
                        if ( s>=0 ) return s;
                        break;
                    case 242 : 
                        int LA3_298 = input.LA(1);

                         
                        int index3_298 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_298);
                        if ( s>=0 ) return s;
                        break;
                    case 243 : 
                        int LA3_299 = input.LA(1);

                         
                        int index3_299 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_299);
                        if ( s>=0 ) return s;
                        break;
                    case 244 : 
                        int LA3_300 = input.LA(1);

                         
                        int index3_300 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_300);
                        if ( s>=0 ) return s;
                        break;
                    case 245 : 
                        int LA3_301 = input.LA(1);

                         
                        int index3_301 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_301);
                        if ( s>=0 ) return s;
                        break;
                    case 246 : 
                        int LA3_302 = input.LA(1);

                         
                        int index3_302 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_302);
                        if ( s>=0 ) return s;
                        break;
                    case 247 : 
                        int LA3_303 = input.LA(1);

                         
                        int index3_303 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_303);
                        if ( s>=0 ) return s;
                        break;
                    case 248 : 
                        int LA3_304 = input.LA(1);

                         
                        int index3_304 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_304);
                        if ( s>=0 ) return s;
                        break;
                    case 249 : 
                        int LA3_305 = input.LA(1);

                         
                        int index3_305 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Php()) ) {s = 307;}

                        else if ( (synpred5_Php()) ) {s = 306;}

                         
                        input.seek(index3_305);
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
            return "158:7: ( simpleStatement )?";
        }
    }
    static final String DFA4_eotS =
        "\45\uffff";
    static final String DFA4_eofS =
        "\45\uffff";
    static final String DFA4_minS =
        "\1\6\44\uffff";
    static final String DFA4_maxS =
        "\1\140\44\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\2\1\1\42\uffff";
    static final String DFA4_specialS =
        "\45\uffff}>";
    static final String[] DFA4_transitionS = {
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
            return "()* loopback of 169:16: (stmts= statement )*";
        }
    }
    static final String DFA24_eotS =
        "\117\uffff";
    static final String DFA24_eofS =
        "\1\3\116\uffff";
    static final String DFA24_minS =
        "\1\6\2\0\114\uffff";
    static final String DFA24_maxS =
        "\1\140\2\0\114\uffff";
    static final String DFA24_acceptS =
        "\3\uffff\1\2\47\uffff\1\1\43\uffff";
    static final String DFA24_specialS =
        "\1\uffff\1\0\1\1\114\uffff}>";
    static final String[] DFA24_transitionS = {
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
            return "232:58: ( conditional )?";
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
                        if ( (synpred33_Php()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_Php()) ) {s = 43;}

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
        "\22\uffff";
    static final String DFA25_eofS =
        "\22\uffff";
    static final String DFA25_minS =
        "\1\6\21\uffff";
    static final String DFA25_maxS =
        "\1\140\21\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA25_specialS =
        "\22\uffff}>";
    static final String[] DFA25_transitionS = {
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
            return "236:31: (whileCondition= expression )?";
        }
    }
    static final String DFA31_eotS =
        "\30\uffff";
    static final String DFA31_eofS =
        "\30\uffff";
    static final String DFA31_minS =
        "\1\6\27\uffff";
    static final String DFA31_maxS =
        "\1\140\27\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\17\uffff";
    static final String DFA31_specialS =
        "\30\uffff}>";
    static final String[] DFA31_transitionS = {
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
            return "242:1: simpleStatement : ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression );";
        }
    }
    static final String DFA30_eotS =
        "\24\uffff";
    static final String DFA30_eofS =
        "\1\21\23\uffff";
    static final String DFA30_minS =
        "\1\4\23\uffff";
    static final String DFA30_maxS =
        "\1\140\23\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\17\uffff\1\2\2\uffff";
    static final String DFA30_specialS =
        "\24\uffff}>";
    static final String[] DFA30_transitionS = {
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
            return "249:15: ( expression )?";
        }
    }
    static final String DFA32_eotS =
        "\117\uffff";
    static final String DFA32_eofS =
        "\1\3\116\uffff";
    static final String DFA32_minS =
        "\1\6\2\0\114\uffff";
    static final String DFA32_maxS =
        "\1\140\2\0\114\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\1\2\47\uffff\1\1\43\uffff";
    static final String DFA32_specialS =
        "\1\uffff\1\0\1\1\114\uffff}>";
    static final String[] DFA32_transitionS = {
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
            return "256:62: ( conditional )?";
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
                        if ( (synpred52_Php()) ) {s = 43;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_Php()) ) {s = 43;}

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
        "\22\uffff";
    static final String DFA34_eofS =
        "\22\uffff";
    static final String DFA34_minS =
        "\1\4\21\uffff";
    static final String DFA34_maxS =
        "\1\140\21\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA34_specialS =
        "\22\uffff}>";
    static final String[] DFA34_transitionS = {
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
            return "261:7: ( commaList )?";
        }
    }
    static final String DFA35_eotS =
        "\22\uffff";
    static final String DFA35_eofS =
        "\22\uffff";
    static final String DFA35_minS =
        "\1\4\21\uffff";
    static final String DFA35_maxS =
        "\1\140\21\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA35_specialS =
        "\22\uffff}>";
    static final String[] DFA35_transitionS = {
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
            return "265:7: ( commaList )?";
        }
    }
    static final String DFA36_eotS =
        "\22\uffff";
    static final String DFA36_eofS =
        "\22\uffff";
    static final String DFA36_minS =
        "\1\6\21\uffff";
    static final String DFA36_maxS =
        "\1\140\21\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA36_specialS =
        "\22\uffff}>";
    static final String[] DFA36_transitionS = {
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
            return "269:7: ( commaList )?";
        }
    }
    static final String DFA38_eotS =
        "\47\uffff";
    static final String DFA38_eofS =
        "\1\1\46\uffff";
    static final String DFA38_minS =
        "\1\6\46\uffff";
    static final String DFA38_maxS =
        "\1\140\46\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\42\uffff";
    static final String DFA38_specialS =
        "\47\uffff}>";
    static final String[] DFA38_transitionS = {
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
            return "()* loopback of 277:29: ( statement )*";
        }
    }
    static final String DFA39_eotS =
        "\45\uffff";
    static final String DFA39_eofS =
        "\45\uffff";
    static final String DFA39_minS =
        "\1\6\44\uffff";
    static final String DFA39_maxS =
        "\1\140\44\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\2\1\1\42\uffff";
    static final String DFA39_specialS =
        "\45\uffff}>";
    static final String[] DFA39_transitionS = {
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
            return "()* loopback of 281:22: ( statement )*";
        }
    }
    static final String DFA45_eotS =
        "\35\uffff";
    static final String DFA45_eofS =
        "\1\1\34\uffff";
    static final String DFA45_minS =
        "\1\4\10\uffff\1\0\23\uffff";
    static final String DFA45_maxS =
        "\1\120\10\uffff\1\0\23\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\2\32\uffff\1\1";
    static final String DFA45_specialS =
        "\11\uffff\1\0\23\uffff}>";
    static final String[] DFA45_transitionS = {
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
            return "()* loopback of 311:22: ( Or weakLogicalXor )*";
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
                        if ( (synpred65_Php()) ) {s = 28;}

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
        "\35\uffff";
    static final String DFA46_eofS =
        "\1\1\34\uffff";
    static final String DFA46_minS =
        "\1\4\10\uffff\1\0\23\uffff";
    static final String DFA46_maxS =
        "\1\120\10\uffff\1\0\23\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\2\32\uffff\1\1";
    static final String DFA46_specialS =
        "\11\uffff\1\0\23\uffff}>";
    static final String[] DFA46_transitionS = {
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
            return "()* loopback of 315:22: ( Xor weakLogicalAnd )*";
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
                        if ( (synpred66_Php()) ) {s = 28;}

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
        "\35\uffff";
    static final String DFA47_eofS =
        "\1\1\34\uffff";
    static final String DFA47_minS =
        "\1\4\10\uffff\1\0\23\uffff";
    static final String DFA47_maxS =
        "\1\120\10\uffff\1\0\23\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\32\uffff\1\1";
    static final String DFA47_specialS =
        "\11\uffff\1\0\23\uffff}>";
    static final String[] DFA47_transitionS = {
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
            return "()* loopback of 319:18: ( And assignment )*";
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
                        if ( (synpred67_Php()) ) {s = 28;}

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
        "\57\uffff";
    static final String DFA48_eofS =
        "\1\uffff\1\3\55\uffff";
    static final String DFA48_minS =
        "\1\6\1\4\1\23\16\uffff\1\0\1\uffff\2\0\30\uffff\2\0";
    static final String DFA48_maxS =
        "\1\140\1\132\1\121\16\uffff\1\0\1\uffff\2\0\30\uffff\2\0";
    static final String DFA48_acceptS =
        "\3\uffff\1\2\34\uffff\1\1\16\uffff";
    static final String DFA48_specialS =
        "\21\uffff\1\0\1\uffff\1\1\1\2\30\uffff\1\3\1\4}>";
    static final String[] DFA48_transitionS = {
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
            return "322:1: assignment : ( name ( ( Equals | AsignmentOperator ) assignment ) | ternary );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_17 = input.LA(1);

                         
                        int index48_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index48_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_19 = input.LA(1);

                         
                        int index48_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index48_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_20 = input.LA(1);

                         
                        int index48_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index48_20);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_45 = input.LA(1);

                         
                        int index48_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index48_45);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA48_46 = input.LA(1);

                         
                        int index48_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 32;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index48_46);
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
    static final String DFA49_eotS =
        "\u00e9\uffff";
    static final String DFA49_eofS =
        "\5\uffff\1\120\3\uffff\6\120\u00da\uffff";
    static final String DFA49_minS =
        "\2\6\1\23\1\6\1\23\1\4\3\23\6\4\1\6\1\23\77\0\14\uffff\20\0\14\uffff"+
        "\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14"+
        "\uffff\3\0";
    static final String DFA49_maxS =
        "\4\140\1\121\1\132\3\121\6\130\1\6\1\121\77\0\14\uffff\20\0\14\uffff"+
        "\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14"+
        "\uffff\3\0";
    static final String DFA49_acceptS =
        "\120\uffff\1\2\12\uffff\1\1\u008d\uffff";
    static final String DFA49_specialS =
        "\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
        "\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14"+
        "\uffff\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110"+
        "\1\111\1\112\1\113\1\114\1\115\1\116\14\uffff\1\117\1\120\1\121"+
        "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\1\131\1\132"+
        "\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\14\uffff\1\143"+
        "\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\14\uffff"+
        "\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\14"+
        "\uffff\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080"+
        "\14\uffff\1\u0081\1\u0082\1\u0083}>";
    static final String[] DFA49_transitionS = {
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
            "\2\120\1\104\1\120\1\102\1\120\2\uffff\1\120\1\117\1\116\1"+
            "\101\1\103\1\uffff\1\133\1\uffff\1\120\1\110\1\114\1\115\1\uffff"+
            "\2\110\3\107\25\uffff\3\120\1\106\31\uffff\1\120\5\uffff\1\113"+
            "\1\112\1\111\1\uffff\1\105",
            "\1\134\75\uffff\1\135",
            "\1\137\75\uffff\1\136",
            "\1\141\75\uffff\1\140",
            "\2\120\1\uffff\1\120\1\uffff\1\120\2\uffff\1\120\1\153\1\152"+
            "\3\uffff\1\133\1\uffff\1\120\1\144\1\150\1\151\1\uffff\2\144"+
            "\3\143\25\uffff\3\120\1\142\31\uffff\1\120\5\uffff\1\147\1\146"+
            "\1\145",
            "\2\120\1\uffff\1\120\1\uffff\1\120\2\uffff\1\120\1\u0081\1"+
            "\u0080\3\uffff\1\133\1\uffff\1\120\1\172\1\176\1\177\1\uffff"+
            "\2\172\3\171\25\uffff\3\120\1\170\31\uffff\1\120\5\uffff\1\175"+
            "\1\174\1\173",
            "\2\120\1\uffff\1\120\1\uffff\1\120\2\uffff\1\120\1\u0097\1"+
            "\u0096\3\uffff\1\133\1\uffff\1\120\1\u0090\1\u0094\1\u0095\1"+
            "\uffff\2\u0090\3\u008f\25\uffff\3\120\1\u008e\31\uffff\1\120"+
            "\5\uffff\1\u0093\1\u0092\1\u0091",
            "\2\120\1\uffff\1\120\1\uffff\1\120\2\uffff\1\120\1\u00ad\1"+
            "\u00ac\3\uffff\1\133\1\uffff\1\120\1\u00a6\1\u00aa\1\u00ab\1"+
            "\uffff\2\u00a6\3\u00a5\25\uffff\3\120\1\u00a4\31\uffff\1\120"+
            "\5\uffff\1\u00a9\1\u00a8\1\u00a7",
            "\2\120\1\uffff\1\120\1\uffff\1\120\2\uffff\1\120\1\u00c3\1"+
            "\u00c2\3\uffff\1\133\1\uffff\1\120\1\u00bc\1\u00c0\1\u00c1\1"+
            "\uffff\2\u00bc\3\u00bb\25\uffff\3\120\1\u00ba\31\uffff\1\120"+
            "\5\uffff\1\u00bf\1\u00be\1\u00bd",
            "\2\120\1\uffff\1\120\1\uffff\1\120\2\uffff\1\120\1\u00d9\1"+
            "\u00d8\3\uffff\1\133\1\uffff\1\120\1\u00d2\1\u00d6\1\u00d7\1"+
            "\uffff\2\u00d2\3\u00d1\25\uffff\3\120\1\u00d0\31\uffff\1\120"+
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

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "327:1: ternary : ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_17 = input.LA(1);

                         
                        int index49_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_18 = input.LA(1);

                         
                        int index49_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_19 = input.LA(1);

                         
                        int index49_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA49_20 = input.LA(1);

                         
                        int index49_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_20);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA49_21 = input.LA(1);

                         
                        int index49_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA49_22 = input.LA(1);

                         
                        int index49_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA49_23 = input.LA(1);

                         
                        int index49_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA49_24 = input.LA(1);

                         
                        int index49_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA49_25 = input.LA(1);

                         
                        int index49_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA49_26 = input.LA(1);

                         
                        int index49_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_26);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA49_27 = input.LA(1);

                         
                        int index49_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_27);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA49_28 = input.LA(1);

                         
                        int index49_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_28);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA49_29 = input.LA(1);

                         
                        int index49_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_29);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA49_30 = input.LA(1);

                         
                        int index49_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_30);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA49_31 = input.LA(1);

                         
                        int index49_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_31);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA49_32 = input.LA(1);

                         
                        int index49_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_32);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA49_33 = input.LA(1);

                         
                        int index49_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_33);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA49_34 = input.LA(1);

                         
                        int index49_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_34);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA49_35 = input.LA(1);

                         
                        int index49_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_35);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA49_36 = input.LA(1);

                         
                        int index49_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_36);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA49_37 = input.LA(1);

                         
                        int index49_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_37);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA49_38 = input.LA(1);

                         
                        int index49_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_38);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA49_39 = input.LA(1);

                         
                        int index49_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_39);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA49_40 = input.LA(1);

                         
                        int index49_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_40);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA49_41 = input.LA(1);

                         
                        int index49_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_41);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA49_42 = input.LA(1);

                         
                        int index49_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_42);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA49_43 = input.LA(1);

                         
                        int index49_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_43);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA49_44 = input.LA(1);

                         
                        int index49_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_44);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA49_45 = input.LA(1);

                         
                        int index49_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_45);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA49_46 = input.LA(1);

                         
                        int index49_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_46);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA49_47 = input.LA(1);

                         
                        int index49_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_47);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA49_48 = input.LA(1);

                         
                        int index49_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_48);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA49_49 = input.LA(1);

                         
                        int index49_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_49);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA49_50 = input.LA(1);

                         
                        int index49_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_50);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA49_51 = input.LA(1);

                         
                        int index49_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_51);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA49_52 = input.LA(1);

                         
                        int index49_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_52);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA49_53 = input.LA(1);

                         
                        int index49_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_53);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA49_54 = input.LA(1);

                         
                        int index49_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_54);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA49_55 = input.LA(1);

                         
                        int index49_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_55);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA49_56 = input.LA(1);

                         
                        int index49_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_56);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA49_57 = input.LA(1);

                         
                        int index49_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_57);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA49_58 = input.LA(1);

                         
                        int index49_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_58);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA49_59 = input.LA(1);

                         
                        int index49_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_59);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA49_60 = input.LA(1);

                         
                        int index49_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_60);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA49_61 = input.LA(1);

                         
                        int index49_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_61);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA49_62 = input.LA(1);

                         
                        int index49_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_62);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA49_63 = input.LA(1);

                         
                        int index49_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_63);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA49_64 = input.LA(1);

                         
                        int index49_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_64);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA49_65 = input.LA(1);

                         
                        int index49_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_65);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA49_66 = input.LA(1);

                         
                        int index49_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_66);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA49_67 = input.LA(1);

                         
                        int index49_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_67);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA49_68 = input.LA(1);

                         
                        int index49_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_68);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA49_69 = input.LA(1);

                         
                        int index49_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_69);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA49_70 = input.LA(1);

                         
                        int index49_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_70);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA49_71 = input.LA(1);

                         
                        int index49_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_71);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA49_72 = input.LA(1);

                         
                        int index49_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_72);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA49_73 = input.LA(1);

                         
                        int index49_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_73);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA49_74 = input.LA(1);

                         
                        int index49_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_74);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA49_75 = input.LA(1);

                         
                        int index49_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_75);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA49_76 = input.LA(1);

                         
                        int index49_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_76);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA49_77 = input.LA(1);

                         
                        int index49_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_77);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA49_78 = input.LA(1);

                         
                        int index49_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_78);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA49_79 = input.LA(1);

                         
                        int index49_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_79);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA49_92 = input.LA(1);

                         
                        int index49_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_92);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA49_93 = input.LA(1);

                         
                        int index49_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_93);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA49_94 = input.LA(1);

                         
                        int index49_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_94);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA49_95 = input.LA(1);

                         
                        int index49_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_95);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA49_96 = input.LA(1);

                         
                        int index49_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_96);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA49_97 = input.LA(1);

                         
                        int index49_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_97);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA49_98 = input.LA(1);

                         
                        int index49_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_98);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA49_99 = input.LA(1);

                         
                        int index49_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_99);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA49_100 = input.LA(1);

                         
                        int index49_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_100);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA49_101 = input.LA(1);

                         
                        int index49_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_101);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA49_102 = input.LA(1);

                         
                        int index49_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_102);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA49_103 = input.LA(1);

                         
                        int index49_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_103);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA49_104 = input.LA(1);

                         
                        int index49_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_104);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA49_105 = input.LA(1);

                         
                        int index49_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_105);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA49_106 = input.LA(1);

                         
                        int index49_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_106);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA49_107 = input.LA(1);

                         
                        int index49_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_107);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA49_120 = input.LA(1);

                         
                        int index49_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_120);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA49_121 = input.LA(1);

                         
                        int index49_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_121);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA49_122 = input.LA(1);

                         
                        int index49_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_122);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA49_123 = input.LA(1);

                         
                        int index49_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_123);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA49_124 = input.LA(1);

                         
                        int index49_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_124);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA49_125 = input.LA(1);

                         
                        int index49_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_125);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA49_126 = input.LA(1);

                         
                        int index49_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_126);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA49_127 = input.LA(1);

                         
                        int index49_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_127);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA49_128 = input.LA(1);

                         
                        int index49_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_128);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA49_129 = input.LA(1);

                         
                        int index49_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_129);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA49_142 = input.LA(1);

                         
                        int index49_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_142);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA49_143 = input.LA(1);

                         
                        int index49_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_143);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA49_144 = input.LA(1);

                         
                        int index49_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_144);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA49_145 = input.LA(1);

                         
                        int index49_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_145);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA49_146 = input.LA(1);

                         
                        int index49_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_146);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA49_147 = input.LA(1);

                         
                        int index49_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_147);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA49_148 = input.LA(1);

                         
                        int index49_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_148);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA49_149 = input.LA(1);

                         
                        int index49_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_149);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA49_150 = input.LA(1);

                         
                        int index49_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_150);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA49_151 = input.LA(1);

                         
                        int index49_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_151);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA49_164 = input.LA(1);

                         
                        int index49_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_164);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA49_165 = input.LA(1);

                         
                        int index49_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_165);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA49_166 = input.LA(1);

                         
                        int index49_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_166);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA49_167 = input.LA(1);

                         
                        int index49_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_167);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA49_168 = input.LA(1);

                         
                        int index49_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_168);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA49_169 = input.LA(1);

                         
                        int index49_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_169);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA49_170 = input.LA(1);

                         
                        int index49_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_170);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA49_171 = input.LA(1);

                         
                        int index49_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_171);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA49_172 = input.LA(1);

                         
                        int index49_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_172);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA49_173 = input.LA(1);

                         
                        int index49_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_173);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA49_186 = input.LA(1);

                         
                        int index49_186 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_186);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA49_187 = input.LA(1);

                         
                        int index49_187 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_187);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA49_188 = input.LA(1);

                         
                        int index49_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_188);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA49_189 = input.LA(1);

                         
                        int index49_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_189);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA49_190 = input.LA(1);

                         
                        int index49_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_190);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA49_191 = input.LA(1);

                         
                        int index49_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_191);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA49_192 = input.LA(1);

                         
                        int index49_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_192);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA49_193 = input.LA(1);

                         
                        int index49_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_193);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA49_194 = input.LA(1);

                         
                        int index49_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_194);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA49_195 = input.LA(1);

                         
                        int index49_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_195);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA49_208 = input.LA(1);

                         
                        int index49_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_208);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA49_209 = input.LA(1);

                         
                        int index49_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_209);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA49_210 = input.LA(1);

                         
                        int index49_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_210);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA49_211 = input.LA(1);

                         
                        int index49_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_211);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA49_212 = input.LA(1);

                         
                        int index49_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_212);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA49_213 = input.LA(1);

                         
                        int index49_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_213);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA49_214 = input.LA(1);

                         
                        int index49_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_214);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA49_215 = input.LA(1);

                         
                        int index49_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_215);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA49_216 = input.LA(1);

                         
                        int index49_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_216);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA49_217 = input.LA(1);

                         
                        int index49_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_217);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA49_230 = input.LA(1);

                         
                        int index49_230 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_230);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA49_231 = input.LA(1);

                         
                        int index49_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_231);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA49_232 = input.LA(1);

                         
                        int index49_232 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 91;}

                        else if ( (true) ) {s = 80;}

                         
                        input.seek(index49_232);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\16\uffff";
    static final String DFA50_eofS =
        "\1\1\15\uffff";
    static final String DFA50_minS =
        "\1\4\15\uffff";
    static final String DFA50_maxS =
        "\1\120\15\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA50_specialS =
        "\16\uffff}>";
    static final String[] DFA50_transitionS = {
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

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "()* loopback of 333:18: ( LogicalOr logicalAnd )*";
        }
    }
    static final String DFA51_eotS =
        "\17\uffff";
    static final String DFA51_eofS =
        "\1\1\16\uffff";
    static final String DFA51_minS =
        "\1\4\16\uffff";
    static final String DFA51_maxS =
        "\1\120\16\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\2\14\uffff\1\1";
    static final String DFA51_specialS =
        "\17\uffff}>";
    static final String[] DFA51_transitionS = {
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
            return "()* loopback of 337:17: ( LogicalAnd bitwiseOr )*";
        }
    }
    static final String DFA52_eotS =
        "\20\uffff";
    static final String DFA52_eofS =
        "\1\1\17\uffff";
    static final String DFA52_minS =
        "\1\4\17\uffff";
    static final String DFA52_maxS =
        "\1\120\17\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA52_specialS =
        "\20\uffff}>";
    static final String[] DFA52_transitionS = {
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
            return "()* loopback of 341:18: ( Pipe bitWiseAnd )*";
        }
    }
    static final String DFA53_eotS =
        "\21\uffff";
    static final String DFA53_eofS =
        "\1\1\20\uffff";
    static final String DFA53_minS =
        "\1\4\20\uffff";
    static final String DFA53_maxS =
        "\1\120\20\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\2\16\uffff\1\1";
    static final String DFA53_specialS =
        "\21\uffff}>";
    static final String[] DFA53_transitionS = {
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
            return "()* loopback of 345:21: ( Ampersand equalityCheck )*";
        }
    }
    static final String DFA54_eotS =
        "\22\uffff";
    static final String DFA54_eofS =
        "\1\2\21\uffff";
    static final String DFA54_minS =
        "\1\4\21\uffff";
    static final String DFA54_maxS =
        "\1\126\21\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\1\1\2\17\uffff";
    static final String DFA54_specialS =
        "\22\uffff}>";
    static final String[] DFA54_transitionS = {
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
            return "349:24: ( EqualityOperator comparisionCheck )?";
        }
    }
    static final String DFA55_eotS =
        "\23\uffff";
    static final String DFA55_eofS =
        "\1\2\22\uffff";
    static final String DFA55_minS =
        "\1\4\22\uffff";
    static final String DFA55_maxS =
        "\1\127\22\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\1\2\20\uffff";
    static final String DFA55_specialS =
        "\23\uffff}>";
    static final String[] DFA55_transitionS = {
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
            return "353:20: ( ComparisionOperator bitWiseShift )?";
        }
    }
    static final String DFA56_eotS =
        "\24\uffff";
    static final String DFA56_eofS =
        "\1\1\23\uffff";
    static final String DFA56_minS =
        "\1\4\23\uffff";
    static final String DFA56_maxS =
        "\1\130\23\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\2\21\uffff\1\1";
    static final String DFA56_specialS =
        "\24\uffff}>";
    static final String[] DFA56_transitionS = {
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
            return "()* loopback of 357:16: ( ShiftOperator addition )*";
        }
    }
    static final String DFA57_eotS =
        "\25\uffff";
    static final String DFA57_eofS =
        "\1\1\24\uffff";
    static final String DFA57_minS =
        "\1\4\24\uffff";
    static final String DFA57_maxS =
        "\1\130\24\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\2\22\uffff\1\1";
    static final String DFA57_specialS =
        "\25\uffff}>";
    static final String[] DFA57_transitionS = {
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
            return "()* loopback of 361:22: ( ( Plus | Minus | Dot ) multiplication )*";
        }
    }
    static final String DFA58_eotS =
        "\26\uffff";
    static final String DFA58_eofS =
        "\1\1\25\uffff";
    static final String DFA58_minS =
        "\1\4\25\uffff";
    static final String DFA58_maxS =
        "\1\130\25\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\2\23\uffff\1\1";
    static final String DFA58_specialS =
        "\26\uffff}>";
    static final String[] DFA58_transitionS = {
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
            return "()* loopback of 365:18: ( ( Asterisk | Forwardslash | Percent ) logicalNot )*";
        }
    }
    static final String DFA59_eotS =
        "\21\uffff";
    static final String DFA59_eofS =
        "\21\uffff";
    static final String DFA59_minS =
        "\1\6\20\uffff";
    static final String DFA59_maxS =
        "\1\140\20\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\1\1\2\16\uffff";
    static final String DFA59_specialS =
        "\21\uffff}>";
    static final String[] DFA59_transitionS = {
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
            return "368:1: logicalNot : ( Bang logicalNot | instanceOf );";
        }
    }
    static final String DFA60_eotS =
        "\27\uffff";
    static final String DFA60_eofS =
        "\1\2\26\uffff";
    static final String DFA60_minS =
        "\1\4\26\uffff";
    static final String DFA60_maxS =
        "\1\130\26\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\1\1\1\2\24\uffff";
    static final String DFA60_specialS =
        "\27\uffff}>";
    static final String[] DFA60_transitionS = {
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
            return "374:20: ( Instanceof negateOrCast )?";
        }
    }
    static final String DFA61_eotS =
        "\41\uffff";
    static final String DFA61_eofS =
        "\41\uffff";
    static final String DFA61_minS =
        "\1\6\1\uffff\1\6\36\uffff";
    static final String DFA61_maxS =
        "\1\140\1\uffff\1\140\36\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\14\uffff\1\2\1\3\17\uffff";
    static final String DFA61_specialS =
        "\41\uffff}>";
    static final String[] DFA61_transitionS = {
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
            return "377:1: negateOrCast : ( ( Tilde | Minus | SuppressWarnings ) increment | OpenBrace PrimitiveType CloseBrace increment -> ^( Cast PrimitiveType increment ) | OpenBrace weakLogicalAnd CloseBrace | increment );";
        }
    }
    static final String DFA62_eotS =
        "\53\uffff";
    static final String DFA62_eofS =
        "\2\uffff\1\4\50\uffff";
    static final String DFA62_minS =
        "\1\23\1\uffff\1\4\1\23\12\uffff\3\0\30\uffff\2\0";
    static final String DFA62_maxS =
        "\1\140\1\uffff\1\132\1\121\12\uffff\3\0\30\uffff\2\0";
    static final String DFA62_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\42\uffff\1\2\3\uffff";
    static final String DFA62_specialS =
        "\16\uffff\1\0\1\1\1\2\30\uffff\1\3\1\4}>";
    static final String[] DFA62_transitionS = {
            "\1\3\2\uffff\1\4\11\uffff\2\4\57\uffff\1\2\1\uffff\1\4\6\uffff"+
            "\1\1\6\4",
            "",
            "\4\4\1\17\1\4\2\uffff\3\4\1\16\1\20\1\uffff\1\4\1\uffff\4\4"+
            "\1\uffff\5\4\25\uffff\4\4\31\uffff\1\4\5\uffff\3\4\1\uffff\1"+
            "\47",
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
            return "384:1: increment : ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_14 = input.LA(1);

                         
                        int index62_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index62_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_15 = input.LA(1);

                         
                        int index62_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index62_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_16 = input.LA(1);

                         
                        int index62_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index62_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA62_41 = input.LA(1);

                         
                        int index62_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index62_41);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA62_42 = input.LA(1);

                         
                        int index62_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_Php()) ) {s = 39;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index62_42);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\15\uffff";
    static final String DFA63_eofS =
        "\15\uffff";
    static final String DFA63_minS =
        "\1\23\14\uffff";
    static final String DFA63_maxS =
        "\1\140\14\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\1\2\1\3\11\uffff";
    static final String DFA63_specialS =
        "\15\uffff}>";
    static final String[] DFA63_transitionS = {
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
            return "390:1: newOrClone : ( New nameOrFunctionCall | Clone name | atomOrReference );";
        }
    }
    static final String DFA64_eotS =
        "\13\uffff";
    static final String DFA64_eofS =
        "\13\uffff";
    static final String DFA64_minS =
        "\1\23\12\uffff";
    static final String DFA64_maxS =
        "\1\140\12\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\2\uffff";
    static final String DFA64_specialS =
        "\13\uffff}>";
    static final String[] DFA64_transitionS = {
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
            return "396:1: atomOrReference : ( atom | reference );";
        }
    }
    static final String DFA66_eotS =
        "\22\uffff";
    static final String DFA66_eofS =
        "\22\uffff";
    static final String DFA66_minS =
        "\1\6\21\uffff";
    static final String DFA66_maxS =
        "\1\140\21\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA66_specialS =
        "\22\uffff}>";
    static final String[] DFA66_transitionS = {
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
            return "402:23: ( arrayEntry ( Comma arrayEntry )* )?";
        }
    }
    static final String DFA67_eotS =
        "\u00ce\uffff";
    static final String DFA67_eofS =
        "\1\uffff\1\44\7\uffff\6\44\u00bf\uffff";
    static final String DFA67_minS =
        "\1\6\1\5\1\23\1\6\1\23\1\6\3\23\6\5\1\6\1\23\23\0\3\uffff\1\0\1"+
        "\uffff\103\0\3\uffff\1\0\1\uffff\16\0\4\uffff\15\0\1\uffff\1\0\3"+
        "\uffff\15\0\3\uffff\1\0\1\uffff\16\0\4\uffff\16\0\4\uffff\3\0";
    static final String DFA67_maxS =
        "\1\140\1\132\1\121\3\140\3\121\6\130\1\6\1\121\23\0\3\uffff\1\0"+
        "\1\uffff\103\0\3\uffff\1\0\1\uffff\16\0\4\uffff\15\0\1\uffff\1\0"+
        "\3\uffff\15\0\3\uffff\1\0\1\uffff\16\0\4\uffff\16\0\4\uffff\3\0";
    static final String DFA67_acceptS =
        "\44\uffff\1\2\3\uffff\1\1\u00a5\uffff";
    static final String DFA67_specialS =
        "\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\3\uffff\1\23\1\uffff\1\24\1\25"+
        "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
        "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
        "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74"+
        "\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107"+
        "\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
        "\1\123\1\124\1\125\1\126\3\uffff\1\127\1\uffff\1\130\1\131\1\132"+
        "\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145"+
        "\4\uffff\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1"+
        "\157\1\160\1\161\1\162\1\uffff\1\163\3\uffff\1\164\1\165\1\166\1"+
        "\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\3\uffff"+
        "\1\u0081\1\uffff\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087"+
        "\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f"+
        "\4\uffff\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096"+
        "\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\4\uffff"+
        "\1\u009e\1\u009f\1\u00a0}>";
    static final String[] DFA67_transitionS = {
            "\1\5\12\uffff\1\4\1\uffff\1\2\2\uffff\1\20\1\uffff\1\3\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\1\7\1\10\57\uffff\1\1\1\uffff\1\14"+
            "\6\uffff\1\6\1\17\1\11\1\12\1\13\1\15\1\16",
            "\1\44\1\37\1\44\1\22\3\uffff\1\50\1\35\1\34\1\21\1\23\1\uffff"+
            "\1\36\2\uffff\1\26\1\32\1\33\1\uffff\2\26\3\25\1\uffff\1\47"+
            "\23\uffff\1\41\1\43\1\42\1\24\36\uffff\1\47\1\31\1\30\1\27\1"+
            "\uffff\1\40",
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
            "\1\44\1\uffff\1\44\4\uffff\1\50\1\150\1\147\3\uffff\1\157\2"+
            "\uffff\1\141\1\145\1\146\1\uffff\2\141\3\140\25\uffff\1\151"+
            "\1\153\1\152\1\137\37\uffff\1\144\1\143\1\142",
            "\1\44\1\uffff\1\44\4\uffff\1\50\1\172\1\171\3\uffff\1\173\2"+
            "\uffff\1\163\1\167\1\170\1\uffff\2\163\3\162\25\uffff\1\174"+
            "\1\176\1\175\1\161\37\uffff\1\166\1\165\1\164",
            "\1\44\1\uffff\1\44\4\uffff\1\50\1\u008c\1\u008b\3\uffff\1\u0091"+
            "\2\uffff\1\u0085\1\u0089\1\u008a\1\uffff\2\u0085\3\u0084\25"+
            "\uffff\1\u008d\1\u008f\1\u008e\1\u0083\37\uffff\1\u0088\1\u0087"+
            "\1\u0086",
            "\1\44\1\uffff\1\44\4\uffff\1\50\1\u009e\1\u009d\3\uffff\1\u00a5"+
            "\2\uffff\1\u0097\1\u009b\1\u009c\1\uffff\2\u0097\3\u0096\25"+
            "\uffff\1\u009f\1\u00a1\1\u00a0\1\u0095\37\uffff\1\u009a\1\u0099"+
            "\1\u0098",
            "\1\44\1\uffff\1\44\4\uffff\1\50\1\u00b0\1\u00af\3\uffff\1\u00b1"+
            "\2\uffff\1\u00a9\1\u00ad\1\u00ae\1\uffff\2\u00a9\3\u00a8\25"+
            "\uffff\1\u00b2\1\u00b4\1\u00b3\1\u00a7\37\uffff\1\u00ac\1\u00ab"+
            "\1\u00aa",
            "\1\44\1\uffff\1\44\4\uffff\1\50\1\u00c2\1\u00c1\3\uffff\1\u00c3"+
            "\2\uffff\1\u00bb\1\u00bf\1\u00c0\1\uffff\2\u00bb\3\u00ba\25"+
            "\uffff\1\u00c4\1\u00c6\1\u00c5\1\u00b9\37\uffff\1\u00be\1\u00bd"+
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "406:7: ( keyValuePair | expression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_17 = input.LA(1);

                         
                        int index67_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_18 = input.LA(1);

                         
                        int index67_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_19 = input.LA(1);

                         
                        int index67_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_20 = input.LA(1);

                         
                        int index67_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_20);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_21 = input.LA(1);

                         
                        int index67_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_22 = input.LA(1);

                         
                        int index67_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_23 = input.LA(1);

                         
                        int index67_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_24 = input.LA(1);

                         
                        int index67_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_25 = input.LA(1);

                         
                        int index67_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_26 = input.LA(1);

                         
                        int index67_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_26);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA67_27 = input.LA(1);

                         
                        int index67_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_27);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA67_28 = input.LA(1);

                         
                        int index67_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_28);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA67_29 = input.LA(1);

                         
                        int index67_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_29);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA67_30 = input.LA(1);

                         
                        int index67_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_30);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA67_31 = input.LA(1);

                         
                        int index67_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_31);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA67_32 = input.LA(1);

                         
                        int index67_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_32);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA67_33 = input.LA(1);

                         
                        int index67_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_33);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA67_34 = input.LA(1);

                         
                        int index67_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_34);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA67_35 = input.LA(1);

                         
                        int index67_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_35);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA67_39 = input.LA(1);

                         
                        int index67_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_39);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA67_41 = input.LA(1);

                         
                        int index67_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_41);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA67_42 = input.LA(1);

                         
                        int index67_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_42);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA67_43 = input.LA(1);

                         
                        int index67_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_43);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA67_44 = input.LA(1);

                         
                        int index67_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_44);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA67_45 = input.LA(1);

                         
                        int index67_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_45);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA67_46 = input.LA(1);

                         
                        int index67_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_46);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA67_47 = input.LA(1);

                         
                        int index67_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_47);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA67_48 = input.LA(1);

                         
                        int index67_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_48);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA67_49 = input.LA(1);

                         
                        int index67_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_49);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA67_50 = input.LA(1);

                         
                        int index67_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_50);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA67_51 = input.LA(1);

                         
                        int index67_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_51);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA67_52 = input.LA(1);

                         
                        int index67_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_52);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA67_53 = input.LA(1);

                         
                        int index67_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_53);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA67_54 = input.LA(1);

                         
                        int index67_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_54);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA67_55 = input.LA(1);

                         
                        int index67_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_55);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA67_56 = input.LA(1);

                         
                        int index67_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_56);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA67_57 = input.LA(1);

                         
                        int index67_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_57);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA67_58 = input.LA(1);

                         
                        int index67_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_58);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA67_59 = input.LA(1);

                         
                        int index67_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_59);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA67_60 = input.LA(1);

                         
                        int index67_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_60);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA67_61 = input.LA(1);

                         
                        int index67_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_61);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA67_62 = input.LA(1);

                         
                        int index67_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_62);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA67_63 = input.LA(1);

                         
                        int index67_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_63);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA67_64 = input.LA(1);

                         
                        int index67_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_64);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA67_65 = input.LA(1);

                         
                        int index67_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_65);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA67_66 = input.LA(1);

                         
                        int index67_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_66);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA67_67 = input.LA(1);

                         
                        int index67_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_67);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA67_68 = input.LA(1);

                         
                        int index67_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_68);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA67_69 = input.LA(1);

                         
                        int index67_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_69);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA67_70 = input.LA(1);

                         
                        int index67_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_70);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA67_71 = input.LA(1);

                         
                        int index67_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_71);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA67_72 = input.LA(1);

                         
                        int index67_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_72);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA67_73 = input.LA(1);

                         
                        int index67_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_73);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA67_74 = input.LA(1);

                         
                        int index67_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_74);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA67_75 = input.LA(1);

                         
                        int index67_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_75);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA67_76 = input.LA(1);

                         
                        int index67_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_76);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA67_77 = input.LA(1);

                         
                        int index67_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_77);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA67_78 = input.LA(1);

                         
                        int index67_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_78);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA67_79 = input.LA(1);

                         
                        int index67_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_79);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA67_80 = input.LA(1);

                         
                        int index67_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_80);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA67_81 = input.LA(1);

                         
                        int index67_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_81);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA67_82 = input.LA(1);

                         
                        int index67_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_82);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA67_83 = input.LA(1);

                         
                        int index67_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_83);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA67_84 = input.LA(1);

                         
                        int index67_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_84);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA67_85 = input.LA(1);

                         
                        int index67_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_85);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA67_86 = input.LA(1);

                         
                        int index67_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_86);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA67_87 = input.LA(1);

                         
                        int index67_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_87);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA67_88 = input.LA(1);

                         
                        int index67_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_88);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA67_89 = input.LA(1);

                         
                        int index67_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_89);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA67_90 = input.LA(1);

                         
                        int index67_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_90);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA67_91 = input.LA(1);

                         
                        int index67_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_91);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA67_92 = input.LA(1);

                         
                        int index67_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_92);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA67_93 = input.LA(1);

                         
                        int index67_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_93);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA67_94 = input.LA(1);

                         
                        int index67_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_94);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA67_95 = input.LA(1);

                         
                        int index67_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_95);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA67_96 = input.LA(1);

                         
                        int index67_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_96);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA67_97 = input.LA(1);

                         
                        int index67_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_97);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA67_98 = input.LA(1);

                         
                        int index67_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_98);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA67_99 = input.LA(1);

                         
                        int index67_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_99);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA67_100 = input.LA(1);

                         
                        int index67_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_100);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA67_101 = input.LA(1);

                         
                        int index67_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_101);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA67_102 = input.LA(1);

                         
                        int index67_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_102);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA67_103 = input.LA(1);

                         
                        int index67_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_103);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA67_104 = input.LA(1);

                         
                        int index67_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_104);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA67_105 = input.LA(1);

                         
                        int index67_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_105);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA67_106 = input.LA(1);

                         
                        int index67_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_106);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA67_107 = input.LA(1);

                         
                        int index67_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_107);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA67_111 = input.LA(1);

                         
                        int index67_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_111);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA67_113 = input.LA(1);

                         
                        int index67_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_113);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA67_114 = input.LA(1);

                         
                        int index67_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_114);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA67_115 = input.LA(1);

                         
                        int index67_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_115);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA67_116 = input.LA(1);

                         
                        int index67_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_116);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA67_117 = input.LA(1);

                         
                        int index67_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_117);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA67_118 = input.LA(1);

                         
                        int index67_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_118);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA67_119 = input.LA(1);

                         
                        int index67_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_119);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA67_120 = input.LA(1);

                         
                        int index67_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_120);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA67_121 = input.LA(1);

                         
                        int index67_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_121);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA67_122 = input.LA(1);

                         
                        int index67_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_122);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA67_123 = input.LA(1);

                         
                        int index67_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_123);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA67_124 = input.LA(1);

                         
                        int index67_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_124);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA67_125 = input.LA(1);

                         
                        int index67_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_125);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA67_126 = input.LA(1);

                         
                        int index67_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_126);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA67_131 = input.LA(1);

                         
                        int index67_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_131);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA67_132 = input.LA(1);

                         
                        int index67_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_132);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA67_133 = input.LA(1);

                         
                        int index67_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_133);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA67_134 = input.LA(1);

                         
                        int index67_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_134);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA67_135 = input.LA(1);

                         
                        int index67_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_135);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA67_136 = input.LA(1);

                         
                        int index67_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_136);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA67_137 = input.LA(1);

                         
                        int index67_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_137);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA67_138 = input.LA(1);

                         
                        int index67_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_138);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA67_139 = input.LA(1);

                         
                        int index67_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_139);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA67_140 = input.LA(1);

                         
                        int index67_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_140);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA67_141 = input.LA(1);

                         
                        int index67_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_141);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA67_142 = input.LA(1);

                         
                        int index67_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_142);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA67_143 = input.LA(1);

                         
                        int index67_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_143);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA67_145 = input.LA(1);

                         
                        int index67_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_145);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA67_149 = input.LA(1);

                         
                        int index67_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_149);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA67_150 = input.LA(1);

                         
                        int index67_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_150);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA67_151 = input.LA(1);

                         
                        int index67_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_151);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA67_152 = input.LA(1);

                         
                        int index67_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_152);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA67_153 = input.LA(1);

                         
                        int index67_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_153);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA67_154 = input.LA(1);

                         
                        int index67_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_154);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA67_155 = input.LA(1);

                         
                        int index67_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_155);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA67_156 = input.LA(1);

                         
                        int index67_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_156);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA67_157 = input.LA(1);

                         
                        int index67_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_157);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA67_158 = input.LA(1);

                         
                        int index67_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_158);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA67_159 = input.LA(1);

                         
                        int index67_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_159);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA67_160 = input.LA(1);

                         
                        int index67_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_160);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA67_161 = input.LA(1);

                         
                        int index67_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_161);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA67_165 = input.LA(1);

                         
                        int index67_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_165);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA67_167 = input.LA(1);

                         
                        int index67_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_167);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA67_168 = input.LA(1);

                         
                        int index67_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_168);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA67_169 = input.LA(1);

                         
                        int index67_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_169);
                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA67_170 = input.LA(1);

                         
                        int index67_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_170);
                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA67_171 = input.LA(1);

                         
                        int index67_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_171);
                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA67_172 = input.LA(1);

                         
                        int index67_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_172);
                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA67_173 = input.LA(1);

                         
                        int index67_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_173);
                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA67_174 = input.LA(1);

                         
                        int index67_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_174);
                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA67_175 = input.LA(1);

                         
                        int index67_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_175);
                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA67_176 = input.LA(1);

                         
                        int index67_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_176);
                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA67_177 = input.LA(1);

                         
                        int index67_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_177);
                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA67_178 = input.LA(1);

                         
                        int index67_178 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_178);
                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA67_179 = input.LA(1);

                         
                        int index67_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_179);
                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA67_180 = input.LA(1);

                         
                        int index67_180 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_180);
                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA67_185 = input.LA(1);

                         
                        int index67_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_185);
                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA67_186 = input.LA(1);

                         
                        int index67_186 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_186);
                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA67_187 = input.LA(1);

                         
                        int index67_187 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_187);
                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA67_188 = input.LA(1);

                         
                        int index67_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_188);
                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA67_189 = input.LA(1);

                         
                        int index67_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_189);
                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA67_190 = input.LA(1);

                         
                        int index67_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_190);
                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA67_191 = input.LA(1);

                         
                        int index67_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_191);
                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA67_192 = input.LA(1);

                         
                        int index67_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_192);
                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA67_193 = input.LA(1);

                         
                        int index67_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_193);
                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA67_194 = input.LA(1);

                         
                        int index67_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_194);
                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA67_195 = input.LA(1);

                         
                        int index67_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_195);
                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA67_196 = input.LA(1);

                         
                        int index67_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_196);
                        if ( s>=0 ) return s;
                        break;
                    case 156 : 
                        int LA67_197 = input.LA(1);

                         
                        int index67_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_197);
                        if ( s>=0 ) return s;
                        break;
                    case 157 : 
                        int LA67_198 = input.LA(1);

                         
                        int index67_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_198);
                        if ( s>=0 ) return s;
                        break;
                    case 158 : 
                        int LA67_203 = input.LA(1);

                         
                        int index67_203 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_203);
                        if ( s>=0 ) return s;
                        break;
                    case 159 : 
                        int LA67_204 = input.LA(1);

                         
                        int index67_204 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_204);
                        if ( s>=0 ) return s;
                        break;
                    case 160 : 
                        int LA67_205 = input.LA(1);

                         
                        int index67_205 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_Php()) ) {s = 40;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index67_205);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\37\uffff";
    static final String DFA72_eofS =
        "\1\uffff\1\4\35\uffff";
    static final String DFA72_minS =
        "\1\23\1\4\1\23\1\0\26\uffff\2\0\1\uffff\2\0";
    static final String DFA72_maxS =
        "\1\121\1\130\1\121\1\0\26\uffff\2\0\1\uffff\2\0";
    static final String DFA72_acceptS =
        "\4\uffff\1\2\27\uffff\1\1\2\uffff";
    static final String DFA72_specialS =
        "\3\uffff\1\0\26\uffff\1\1\1\2\1\uffff\1\3\1\4}>";
    static final String[] DFA72_transitionS = {
            "\1\2\75\uffff\1\1",
            "\2\4\1\34\1\4\1\32\1\4\2\uffff\3\4\1\3\1\33\1\uffff\1\4\1\uffff"+
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
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff"
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
            return "422:1: nameOrFunctionCall : ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace -> ^( Apply name ( expression )* ) | name );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_3 = input.LA(1);

                         
                        int index72_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Php()) ) {s = 28;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index72_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_26 = input.LA(1);

                         
                        int index72_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Php()) ) {s = 28;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index72_26);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_27 = input.LA(1);

                         
                        int index72_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Php()) ) {s = 28;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index72_27);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA72_29 = input.LA(1);

                         
                        int index72_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Php()) ) {s = 28;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index72_29);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA72_30 = input.LA(1);

                         
                        int index72_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_Php()) ) {s = 28;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index72_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\22\uffff";
    static final String DFA71_eofS =
        "\22\uffff";
    static final String DFA71_minS =
        "\1\6\21\uffff";
    static final String DFA71_maxS =
        "\1\140\21\uffff";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA71_specialS =
        "\22\uffff}>";
    static final String[] DFA71_transitionS = {
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

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "423:22: ( expression ( Comma expression )* )?";
        }
    }
    static final String DFA73_eotS =
        "\43\uffff";
    static final String DFA73_eofS =
        "\43\uffff";
    static final String DFA73_minS =
        "\1\23\1\17\1\23\36\uffff\2\0";
    static final String DFA73_maxS =
        "\1\121\1\17\1\121\36\uffff\2\0";
    static final String DFA73_acceptS =
        "\3\uffff\1\1\33\uffff\1\2\1\3\2\uffff";
    static final String DFA73_specialS =
        "\1\uffff\1\0\37\uffff\1\1\1\2}>";
    static final String[] DFA73_transitionS = {
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
            return "427:1: name : ( staticMemberAccess | memberAccess | variable );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA73_1==ClassMember) ) {s = 3;}

                        else if ( (synpred110_Php()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_33 = input.LA(1);

                         
                        int index73_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_Php()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index73_33);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_34 = input.LA(1);

                         
                        int index73_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_Php()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index73_34);
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
    static final String DFA74_eotS =
        "\34\uffff";
    static final String DFA74_eofS =
        "\1\1\33\uffff";
    static final String DFA74_minS =
        "\1\4\33\uffff";
    static final String DFA74_maxS =
        "\1\132\33\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\3\30\uffff\1\1\1\2";
    static final String DFA74_specialS =
        "\34\uffff}>";
    static final String[] DFA74_transitionS = {
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
            return "()* loopback of 438:9: ( OpenSquareBrace expression CloseSquareBrace | '->' UnquotedString )*";
        }
    }
    static final String DFA76_eotS =
        "\31\uffff";
    static final String DFA76_eofS =
        "\31\uffff";
    static final String DFA76_minS =
        "\1\6\30\uffff";
    static final String DFA76_maxS =
        "\1\140\30\uffff";
    static final String DFA76_acceptS =
        "\1\uffff\1\1\26\uffff\1\2";
    static final String DFA76_specialS =
        "\31\uffff}>";
    static final String[] DFA76_transitionS = {
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
            return "158:7: ( simpleStatement )?";
        }
    }
    static final String DFA93_eotS =
        "\22\uffff";
    static final String DFA93_eofS =
        "\22\uffff";
    static final String DFA93_minS =
        "\1\6\21\uffff";
    static final String DFA93_maxS =
        "\1\140\21\uffff";
    static final String DFA93_acceptS =
        "\1\uffff\1\1\17\uffff\1\2";
    static final String DFA93_specialS =
        "\22\uffff}>";
    static final String[] DFA93_transitionS = {
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

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "423:22: ( expression ( Comma expression )* )?";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_prog876 = new BitSet(new long[]{0x0987E7CF454A0442L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_simpleStatement_in_statement889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_BodyString_in_statement892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_statement900 = new BitSet(new long[]{0x0987E7CF454A0C40L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_statement902 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_statement904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketedBlock_in_statement916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_statement929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDefinition_in_statement937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexStatement_in_statement945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_statement953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_statement955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_bracketedBlock977 = new BitSet(new long[]{0x0987E7CF454A0C40L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_bracketedBlock981 = new BitSet(new long[]{0x0987E7CF454A0C40L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_bracketedBlock984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Interface_in_interfaceDefinition1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceDefinition1014 = new BitSet(new long[]{0x0200000000000400L});
    public static final BitSet FOLLOW_interfaceExtends_in_interfaceDefinition1016 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_interfaceDefinition1027 = new BitSet(new long[]{0x2804200000000800L,0x0000000000040000L});
    public static final BitSet FOLLOW_interfaceMember_in_interfaceDefinition1037 = new BitSet(new long[]{0x2804200000000800L,0x0000000000040000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_interfaceDefinition1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Extends_in_interfaceExtends1088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1091 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_interfaceExtends1094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1097 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Const_in_interfaceMember1115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1117 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_interfaceMember1120 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_interfaceMember1122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_interfaceMember1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_interfaceMember1154 = new BitSet(new long[]{0x0804200000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Function_in_interfaceMember1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1159 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_interfaceMember1161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_interfaceMember1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classModifier_in_classDefinition1207 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_Class_in_classDefinition1219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition1223 = new BitSet(new long[]{0x0600000000000400L});
    public static final BitSet FOLLOW_Extends_in_classDefinition1235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition1239 = new BitSet(new long[]{0x0400000000000400L});
    public static final BitSet FOLLOW_classImplements_in_classDefinition1252 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_classDefinition1263 = new BitSet(new long[]{0x3804200000080800L,0x0000000000040000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition1273 = new BitSet(new long[]{0x3804200000080800L,0x0000000000040000L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_classDefinition1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Implements_in_classImplements1366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements1370 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_classImplements1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements1376 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember1396 = new BitSet(new long[]{0x0804200000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Function_in_classMember1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1401 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_classMember1403 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_bracketedBlock_in_classMember1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_classMember1456 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dollar_in_classMember1458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1460 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1463 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_classMember1465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Const_in_classMember1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1504 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1507 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_classMember1509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember1541 = new BitSet(new long[]{0x0804000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Dollar_in_classMember1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1547 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1551 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_classMember1553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_fieldDefinition1605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_fieldDefinition1607 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_fieldDefinition1610 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_fieldDefinition1612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_fieldDefinition1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Abstract_in_classModifier1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_fieldModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_complexStatement1694 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1696 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1700 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1702 = new BitSet(new long[]{0x0987E7FF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1706 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_conditional_in_complexStatement1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_complexStatement1739 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1741 = new BitSet(new long[]{0x0007C007454A0050L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_forInit_in_complexStatement1743 = new BitSet(new long[]{0x0007C007454A0050L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_forCondition_in_complexStatement1745 = new BitSet(new long[]{0x0007C007454A00C0L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_forUpdate_in_complexStatement1747 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1749 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Foreach_in_complexStatement1773 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1775 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_variable_in_complexStatement1777 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_complexStatement1779 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_arrayEntry_in_complexStatement1781 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1783 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_complexStatement1805 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1807 = new BitSet(new long[]{0x0007C007454A00C0L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1811 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1814 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Do_in_complexStatement1835 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1837 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_While_in_complexStatement1839 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1841 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1845 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_complexStatement1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Switch_in_complexStatement1868 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_complexStatement1870 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1872 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_complexStatement1874 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_complexStatement1876 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_cases_in_complexStatement1877 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_complexStatement1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_complexStatement1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Echo_in_simpleStatement1913 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_commaList_in_simpleStatement1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Global_in_simpleStatement1924 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_name_in_simpleStatement1927 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_simpleStatement1930 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_name_in_simpleStatement1933 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Static_in_simpleStatement1943 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_variable_in_simpleStatement1946 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Equals_in_simpleStatement1948 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_simpleStatement1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Break_in_simpleStatement1959 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Continue_in_simpleStatement1971 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Return_in_simpleStatement1988 = new BitSet(new long[]{0x0007C007454A0042L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_simpleStatement1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RequireOperator_in_simpleStatement2000 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_simpleStatement2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_simpleStatement2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElseIf_in_conditional2029 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_conditional2031 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_conditional2035 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_conditional2037 = new BitSet(new long[]{0x0987E7FF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_conditional2041 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_conditional_in_conditional2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_conditional2067 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_conditional2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forInit2090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_forInit2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forCondition2119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_forCondition2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forUpdate2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_casestatement_in_cases2180 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_defaultcase_in_cases2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_casestatement2201 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_casestatement2204 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_casestatement2206 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_casestatement2209 = new BitSet(new long[]{0x0987E7CF454A0442L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_Default_in_defaultcase2229 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_defaultcase2232 = new BitSet(new long[]{0x0987E7CF454A0440L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_defaultcase2235 = new BitSet(new long[]{0x0987E7CF454A0442L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_Function_in_functionDefinition2254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_functionDefinition2256 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_functionDefinition2258 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bracketedBlock_in_functionDefinition2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenBrace_in_parametersDefinition2298 = new BitSet(new long[]{0x0000000000480080L});
    public static final BitSet FOLLOW_paramDef_in_parametersDefinition2301 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_parametersDefinition2304 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_paramDef_in_parametersDefinition2306 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_parametersDefinition2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_paramDef2339 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_Equals_in_paramDef2342 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_paramDef2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_paramName2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_paramName2375 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dollar_in_paramName2377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_commaList2408 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_commaList2411 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_commaList2414 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_weakLogicalOr_in_expression2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2455 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_Or_in_weakLogicalOr2458 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2461 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2480 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_Xor_in_weakLogicalXor2483 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2486 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2509 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_And_in_weakLogicalAnd2512 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2515 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_name_in_assignment2534 = new BitSet(new long[]{0x0000000080000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_set_in_assignment2537 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_assignment_in_assignment2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternary_in_assignment2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_ternary2572 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_QuestionMark_in_ternary2574 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_ternary2576 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_ternary2578 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_ternary2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_ternary2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr2620 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LogicalOr_in_logicalOr2623 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr2626 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2645 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_LogicalAnd_in_logicalAnd2648 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2651 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2674 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_Pipe_in_bitwiseOr2677 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2680 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2699 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_Ampersand_in_bitWiseAnd2702 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2705 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2724 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_EqualityOperator_in_equalityCheck2727 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2753 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ComparisionOperator_in_comparisionCheck2756 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addition_in_bitWiseShift2778 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ShiftOperator_in_bitWiseShift2781 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_addition_in_bitWiseShift2784 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_multiplication_in_addition2807 = new BitSet(new long[]{0x0000000006200002L});
    public static final BitSet FOLLOW_set_in_addition2810 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_multiplication_in_addition2823 = new BitSet(new long[]{0x0000000006200002L});
    public static final BitSet FOLLOW_logicalNot_in_multiplication2842 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_set_in_multiplication2845 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_logicalNot_in_multiplication2858 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_Bang_in_logicalNot2877 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_logicalNot_in_logicalNot2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceOf_in_logicalNot2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negateOrCast_in_instanceOf2905 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_Instanceof_in_instanceOf2908 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_negateOrCast_in_instanceOf2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_negateOrCast2930 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_increment_in_negateOrCast2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenBrace_in_negateOrCast2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_PrimitiveType_in_negateOrCast2953 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_negateOrCast2955 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_increment_in_negateOrCast2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenBrace_in_negateOrCast2975 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_negateOrCast2978 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseBrace_in_negateOrCast2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_increment_in_negateOrCast2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IncrementOperator_in_increment3006 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_name_in_increment3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_increment3026 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_IncrementOperator_in_increment3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newOrClone_in_increment3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_New_in_newOrClone3063 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_newOrClone3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Clone_in_newOrClone3074 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_name_in_newOrClone3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomOrReference_in_newOrClone3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_atomOrReference3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_atomOrReference3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_arrayDeclaration3127 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_arrayDeclaration3129 = new BitSet(new long[]{0x0007C007454A00C0L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration3132 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_arrayDeclaration3135 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration3137 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_arrayDeclaration3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_arrayEntry3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayEntry3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_keyValuePair3193 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ArrayAssign_in_keyValuePair3195 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_keyValuePair3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleQuotedString_in_atom3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleQuotedString_in_atom3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HereDoc_in_atom3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_atom3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Real_in_atom3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Boolean_in_atom3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_atom3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_reference3261 = new BitSet(new long[]{0x00000003454A0040L,0x00000001FC0A0000L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall3289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_nameOrFunctionCall3291 = new BitSet(new long[]{0x0007C007454A00C0L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall3294 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_nameOrFunctionCall3297 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall3299 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_nameOrFunctionCall3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticMemberAccess_in_name3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_name3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_name3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_staticMemberAccess3373 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ClassMember_in_staticMemberAccess3375 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_variable_in_staticMemberAccess3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_memberAccess3395 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_OpenSquareBrace_in_memberAccess3408 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_memberAccess3411 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CloseSquareBrace_in_memberAccess3413 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_InstanceMember_in_memberAccess3426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_memberAccess3429 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_Dollar_in_variable3452 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_variable_in_variable3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_variable3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_synpred3_Php889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_BodyString_in_synpred3_Php892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBrace_in_synpred4_Php900 = new BitSet(new long[]{0x0987E7CF454A0C40L,0x00000001FC1B0000L});
    public static final BitSet FOLLOW_statement_in_synpred4_Php902 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CloseCurlyBrace_in_synpred4_Php904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketedBlock_in_synpred5_Php916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_synpred23_Php1396 = new BitSet(new long[]{0x0804200000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_Function_in_synpred23_Php1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_synpred23_Php1401 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_synpred23_Php1403 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_bracketedBlock_in_synpred23_Php1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SemiColon_in_synpred23_Php1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred33_Php1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred52_Php2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_synpred65_Php2458 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_weakLogicalXor_in_synpred65_Php2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_synpred66_Php2483 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_synpred66_Php2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_And_in_synpred67_Php2512 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_assignment_in_synpred67_Php2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred69_Php2534 = new BitSet(new long[]{0x0000000080000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_set_in_synpred69_Php2537 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_assignment_in_synpred69_Php2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_synpred70_Php2572 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_QuestionMark_in_synpred70_Php2574 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_synpred70_Php2576 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_synpred70_Php2578 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_synpred70_Php2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred92_Php3026 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_IncrementOperator_in_synpred92_Php3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_synpred98_Php3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred108_Php3289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenBrace_in_synpred108_Php3291 = new BitSet(new long[]{0x0007C007454A00C0L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_synpred108_Php3294 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_synpred108_Php3297 = new BitSet(new long[]{0x0007C007454A0040L,0x00000001FC1A0000L});
    public static final BitSet FOLLOW_expression_in_synpred108_Php3299 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseBrace_in_synpred108_Php3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_synpred110_Php3344 = new BitSet(new long[]{0x0000000000000002L});

}