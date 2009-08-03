// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/sidharth/Documents/code/phpparser/grammar/Php.g 2009-08-03 23:56:57

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
            this.state.ruleMemo = new HashMap[177+1];
             
             
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


        private boolean expressionFollowsBodyString = false;


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:161:1: prog : ( statement )* ;
    public final PhpParser.prog_return prog() throws RecognitionException {
        PhpParser.prog_return retval = new PhpParser.prog_return();
        retval.start = input.LT(1);
        int prog_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.statement_return statement1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:161:6: ( ( statement )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:161:8: ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:161:8: ( statement )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_prog889);
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
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:163:1: statement : ({...}? => printExpr ';' | ({...}? => ( printExpr )? | ( simpleStatement )? ) BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' );
    public final PhpParser.statement_return statement() throws RecognitionException {
        PhpParser.statement_return retval = new PhpParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal3=null;
        Token BodyString6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token char_literal15=null;
        PhpParser.printExpr_return printExpr2 = null;

        PhpParser.printExpr_return printExpr4 = null;

        PhpParser.simpleStatement_return simpleStatement5 = null;

        PhpParser.statement_return statement8 = null;

        PhpParser.bracketedBlock_return bracketedBlock10 = null;

        PhpParser.classDefinition_return classDefinition11 = null;

        PhpParser.interfaceDefinition_return interfaceDefinition12 = null;

        PhpParser.complexStatement_return complexStatement13 = null;

        PhpParser.simpleStatement_return simpleStatement14 = null;


        CommonTree char_literal3_tree=null;
        CommonTree BodyString6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBracket=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBracket");
        RewriteRuleTokenStream stream_OpenCurlyBracket=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBracket");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:164:5: ({...}? => printExpr ';' | ({...}? => ( printExpr )? | ( simpleStatement )? ) BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' )
            int alt5=8;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:164:7: {...}? => printExpr ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    if ( !((expressionFollowsBodyString)) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "statement", "expressionFollowsBodyString");
                    }
                    if ( state.backtracking==0 ) {
                      expressionFollowsBodyString=false;
                    }
                    pushFollow(FOLLOW_printExpr_in_statement907);
                    printExpr2=printExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, printExpr2.getTree());
                    char_literal3=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_statement909); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:7: ({...}? => ( printExpr )? | ( simpleStatement )? ) BodyString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:7: ({...}? => ( printExpr )? | ( simpleStatement )? )
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:8: {...}? => ( printExpr )?
                            {
                            if ( !((expressionFollowsBodyString)) ) {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                throw new FailedPredicateException(input, "statement", "expressionFollowsBodyString");
                            }
                            if ( state.backtracking==0 ) {
                              expressionFollowsBodyString=false;
                            }
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:79: ( printExpr )?
                            int alt2=2;
                            alt2 = dfa2.predict(input);
                            switch (alt2) {
                                case 1 :
                                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: printExpr
                                    {
                                    pushFollow(FOLLOW_printExpr_in_statement925);
                                    printExpr4=printExpr();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, printExpr4.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:92: ( simpleStatement )?
                            {
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:92: ( simpleStatement )?
                            int alt3=2;
                            alt3 = dfa3.predict(input);
                            switch (alt3) {
                                case 1 :
                                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: simpleStatement
                                    {
                                    pushFollow(FOLLOW_simpleStatement_in_statement930);
                                    simpleStatement5=simpleStatement();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleStatement5.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    BodyString6=(Token)match(input,BodyString,FOLLOW_BodyString_in_statement934); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BodyString6_tree = (CommonTree)adaptor.create(BodyString6);
                    adaptor.addChild(root_0, BodyString6_tree);
                    }
                    if ( state.backtracking==0 ) {
                      expressionFollowsBodyString = (BodyString6!=null?BodyString6.getText():null).endsWith("<?=");
                    }

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:166:7: '{' statement '}'
                    {
                    char_literal7=(Token)match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_statement944); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenCurlyBracket.add(char_literal7);

                    pushFollow(FOLLOW_statement_in_statement946);
                    statement8=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement8.getTree());
                    char_literal9=(Token)match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_statement948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseCurlyBracket.add(char_literal9);



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
                    // 166:25: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:167:7: bracketedBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bracketedBlock_in_statement960);
                    bracketedBlock10=bracketedBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketedBlock10.getTree());

                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:169:7: classDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_classDefinition_in_statement973);
                    classDefinition11=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition11.getTree());

                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:170:7: interfaceDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDefinition_in_statement981);
                    interfaceDefinition12=interfaceDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDefinition12.getTree());

                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:171:7: complexStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_complexStatement_in_statement989);
                    complexStatement13=complexStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, complexStatement13.getTree());

                    }
                    break;
                case 8 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:172:7: simpleStatement ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_simpleStatement_in_statement997);
                    simpleStatement14=simpleStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleStatement14.getTree());
                    char_literal15=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_statement999); if (state.failed) return retval;

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

    public static class printExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "printExpr"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:175:1: printExpr : expression -> ^( Echo expression ) ;
    public final PhpParser.printExpr_return printExpr() throws RecognitionException {
        PhpParser.printExpr_return retval = new PhpParser.printExpr_return();
        retval.start = input.LT(1);
        int printExpr_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.expression_return expression16 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:176:5: ( expression -> ^( Echo expression ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:176:7: expression
            {
            pushFollow(FOLLOW_expression_in_printExpr1017);
            expression16=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression16.getTree());


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 176:18: -> ^( Echo expression )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:176:21: ^( Echo expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Echo, "Echo"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 3, printExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "printExpr"

    public static class bracketedBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracketedBlock"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:179:1: bracketedBlock : '{' (stmts= statement )* '}' -> ^( Block $stmts) ;
    public final PhpParser.bracketedBlock_return bracketedBlock() throws RecognitionException {
        PhpParser.bracketedBlock_return retval = new PhpParser.bracketedBlock_return();
        retval.start = input.LT(1);
        int bracketedBlock_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal17=null;
        Token char_literal18=null;
        PhpParser.statement_return stmts = null;


        CommonTree char_literal17_tree=null;
        CommonTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBracket=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBracket");
        RewriteRuleTokenStream stream_OpenCurlyBracket=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBracket");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:180:5: ( '{' (stmts= statement )* '}' -> ^( Block $stmts) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:180:7: '{' (stmts= statement )* '}'
            {
            char_literal17=(Token)match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_bracketedBlock1042); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBracket.add(char_literal17);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:180:16: (stmts= statement )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: stmts= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bracketedBlock1046);
            	    stmts=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(stmts.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal18=(Token)match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_bracketedBlock1049); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBracket.add(char_literal18);



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
            // 180:32: -> ^( Block $stmts)
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:180:35: ^( Block $stmts)
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
            if ( state.backtracking>0 ) { memoize(input, 4, bracketedBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bracketedBlock"

    public static class interfaceDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDefinition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:183:1: interfaceDefinition : Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBracket ( interfaceMember )* CloseCurlyBracket -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* ) ;
    public final PhpParser.interfaceDefinition_return interfaceDefinition() throws RecognitionException {
        PhpParser.interfaceDefinition_return retval = new PhpParser.interfaceDefinition_return();
        retval.start = input.LT(1);
        int interfaceDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token interfaceName=null;
        Token Interface19=null;
        Token OpenCurlyBracket21=null;
        Token CloseCurlyBracket23=null;
        PhpParser.interfaceExtends_return interfaceExtends20 = null;

        PhpParser.interfaceMember_return interfaceMember22 = null;


        CommonTree interfaceName_tree=null;
        CommonTree Interface19_tree=null;
        CommonTree OpenCurlyBracket21_tree=null;
        CommonTree CloseCurlyBracket23_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBracket=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBracket");
        RewriteRuleTokenStream stream_Interface=new RewriteRuleTokenStream(adaptor,"token Interface");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleTokenStream stream_OpenCurlyBracket=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBracket");
        RewriteRuleSubtreeStream stream_interfaceExtends=new RewriteRuleSubtreeStream(adaptor,"rule interfaceExtends");
        RewriteRuleSubtreeStream stream_interfaceMember=new RewriteRuleSubtreeStream(adaptor,"rule interfaceMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:184:5: ( Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBracket ( interfaceMember )* CloseCurlyBracket -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:184:7: Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBracket ( interfaceMember )* CloseCurlyBracket
            {
            Interface19=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDefinition1075); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Interface.add(Interface19);

            interfaceName=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceDefinition1079); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(interfaceName);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:184:46: ( interfaceExtends )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Extends) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: interfaceExtends
                    {
                    pushFollow(FOLLOW_interfaceExtends_in_interfaceDefinition1081);
                    interfaceExtends20=interfaceExtends();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interfaceExtends.add(interfaceExtends20.getTree());

                    }
                    break;

            }

            OpenCurlyBracket21=(Token)match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_interfaceDefinition1092); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBracket.add(OpenCurlyBracket21);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:186:9: ( interfaceMember )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Function||LA8_0==Static||LA8_0==Abstract||LA8_0==Const||LA8_0==AccessModifier) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: interfaceMember
            	    {
            	    pushFollow(FOLLOW_interfaceMember_in_interfaceDefinition1102);
            	    interfaceMember22=interfaceMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_interfaceMember.add(interfaceMember22.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            CloseCurlyBracket23=(Token)match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_interfaceDefinition1113); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBracket.add(CloseCurlyBracket23);



            // AST REWRITE
            // elements: interfaceExtends, interfaceName, interfaceMember, Interface
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
            // 188:9: -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:188:12: ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_Interface.nextNode(), root_1);

                adaptor.addChild(root_1, stream_interfaceName.nextNode());
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:188:39: ( interfaceExtends )?
                if ( stream_interfaceExtends.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceExtends.nextTree());

                }
                stream_interfaceExtends.reset();
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:188:57: ( interfaceMember )*
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
            if ( state.backtracking>0 ) { memoize(input, 5, interfaceDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceDefinition"

    public static class interfaceExtends_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceExtends"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:191:1: interfaceExtends : Extends UnquotedString ( Comma UnquotedString )* ;
    public final PhpParser.interfaceExtends_return interfaceExtends() throws RecognitionException {
        PhpParser.interfaceExtends_return retval = new PhpParser.interfaceExtends_return();
        retval.start = input.LT(1);
        int interfaceExtends_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Extends24=null;
        Token UnquotedString25=null;
        Token Comma26=null;
        Token UnquotedString27=null;

        CommonTree Extends24_tree=null;
        CommonTree UnquotedString25_tree=null;
        CommonTree Comma26_tree=null;
        CommonTree UnquotedString27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:192:5: ( Extends UnquotedString ( Comma UnquotedString )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:192:7: Extends UnquotedString ( Comma UnquotedString )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Extends24=(Token)match(input,Extends,FOLLOW_Extends_in_interfaceExtends1153); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Extends24_tree = (CommonTree)adaptor.create(Extends24);
            root_0 = (CommonTree)adaptor.becomeRoot(Extends24_tree, root_0);
            }
            UnquotedString25=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1156); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString25_tree = (CommonTree)adaptor.create(UnquotedString25);
            adaptor.addChild(root_0, UnquotedString25_tree);
            }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:192:31: ( Comma UnquotedString )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Comma) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:192:32: Comma UnquotedString
            	    {
            	    Comma26=(Token)match(input,Comma,FOLLOW_Comma_in_interfaceExtends1159); if (state.failed) return retval;
            	    UnquotedString27=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1162); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString27_tree = (CommonTree)adaptor.create(UnquotedString27);
            	    adaptor.addChild(root_0, UnquotedString27_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
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
            if ( state.backtracking>0 ) { memoize(input, 6, interfaceExtends_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceExtends"

    public static class interfaceMember_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceMember"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:194:1: interfaceMember : ( Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* Function UnquotedString parametersDefinition ';' -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ) );
    public final PhpParser.interfaceMember_return interfaceMember() throws RecognitionException {
        PhpParser.interfaceMember_return retval = new PhpParser.interfaceMember_return();
        retval.start = input.LT(1);
        int interfaceMember_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Const28=null;
        Token UnquotedString29=null;
        Token Equals30=null;
        Token char_literal32=null;
        Token Function34=null;
        Token UnquotedString35=null;
        Token char_literal37=null;
        PhpParser.atom_return atom31 = null;

        PhpParser.fieldModifier_return fieldModifier33 = null;

        PhpParser.parametersDefinition_return parametersDefinition36 = null;


        CommonTree Const28_tree=null;
        CommonTree UnquotedString29_tree=null;
        CommonTree Equals30_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree Function34_tree=null;
        CommonTree UnquotedString35_tree=null;
        CommonTree char_literal37_tree=null;
        RewriteRuleTokenStream stream_Const=new RewriteRuleTokenStream(adaptor,"token Const");
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleSubtreeStream stream_fieldModifier=new RewriteRuleSubtreeStream(adaptor,"rule fieldModifier");
        RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:195:5: ( Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* Function UnquotedString parametersDefinition ';' -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Const) ) {
                alt12=1;
            }
            else if ( (LA12_0==Function||LA12_0==Static||LA12_0==Abstract||LA12_0==AccessModifier) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:195:7: Const UnquotedString ( Equals atom )? ';'
                    {
                    Const28=(Token)match(input,Const,FOLLOW_Const_in_interfaceMember1180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Const.add(Const28);

                    UnquotedString29=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1182); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString29);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:195:28: ( Equals atom )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==Equals) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:195:29: Equals atom
                            {
                            Equals30=(Token)match(input,Equals,FOLLOW_Equals_in_interfaceMember1185); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals30);

                            pushFollow(FOLLOW_atom_in_interfaceMember1187);
                            atom31=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom31.getTree());

                            }
                            break;

                    }

                    char_literal32=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1191); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal32);



                    // AST REWRITE
                    // elements: UnquotedString, atom, Const
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 196:9: -> ^( Const UnquotedString ( atom )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:196:12: ^( Const UnquotedString ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Const.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:196:35: ( atom )?
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:197:7: ( fieldModifier )* Function UnquotedString parametersDefinition ';'
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:197:7: ( fieldModifier )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Static||LA11_0==Abstract||LA11_0==AccessModifier) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_interfaceMember1219);
                    	    fieldModifier33=fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    Function34=(Token)match(input,Function,FOLLOW_Function_in_interfaceMember1222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Function.add(Function34);

                    UnquotedString35=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString35);

                    pushFollow(FOLLOW_parametersDefinition_in_interfaceMember1226);
                    parametersDefinition36=parametersDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition36.getTree());
                    char_literal37=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal37);



                    // AST REWRITE
                    // elements: UnquotedString, fieldModifier, parametersDefinition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 198:9: -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:198:12: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Method, "Method"), root_1);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:198:21: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:198:33: ( fieldModifier )*
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
            if ( state.backtracking>0 ) { memoize(input, 7, interfaceMember_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceMember"

    public static class classDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDefinition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:201:1: classDefinition : ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBracket ( classMember )* CloseCurlyBracket -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* ) ;
    public final PhpParser.classDefinition_return classDefinition() throws RecognitionException {
        PhpParser.classDefinition_return retval = new PhpParser.classDefinition_return();
        retval.start = input.LT(1);
        int classDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token className=null;
        Token extendsclass=null;
        Token Class39=null;
        Token Extends40=null;
        Token OpenCurlyBracket42=null;
        Token CloseCurlyBracket44=null;
        PhpParser.classModifier_return classModifier38 = null;

        PhpParser.classImplements_return classImplements41 = null;

        PhpParser.classMember_return classMember43 = null;


        CommonTree className_tree=null;
        CommonTree extendsclass_tree=null;
        CommonTree Class39_tree=null;
        CommonTree Extends40_tree=null;
        CommonTree OpenCurlyBracket42_tree=null;
        CommonTree CloseCurlyBracket44_tree=null;
        RewriteRuleTokenStream stream_CloseCurlyBracket=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBracket");
        RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
        RewriteRuleTokenStream stream_Extends=new RewriteRuleTokenStream(adaptor,"token Extends");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleTokenStream stream_OpenCurlyBracket=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBracket");
        RewriteRuleSubtreeStream stream_classImplements=new RewriteRuleSubtreeStream(adaptor,"rule classImplements");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        RewriteRuleSubtreeStream stream_classModifier=new RewriteRuleSubtreeStream(adaptor,"rule classModifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:202:5: ( ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBracket ( classMember )* CloseCurlyBracket -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:202:9: ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBracket ( classMember )* CloseCurlyBracket
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:202:9: ( classModifier )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Abstract) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: classModifier
                    {
                    pushFollow(FOLLOW_classModifier_in_classDefinition1272);
                    classModifier38=classModifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classModifier.add(classModifier38.getTree());

                    }
                    break;

            }

            Class39=(Token)match(input,Class,FOLLOW_Class_in_classDefinition1284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Class.add(Class39);

            className=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(className);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:204:9: ( Extends extendsclass= UnquotedString )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Extends) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:204:10: Extends extendsclass= UnquotedString
                    {
                    Extends40=(Token)match(input,Extends,FOLLOW_Extends_in_classDefinition1300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Extends.add(Extends40);

                    extendsclass=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(extendsclass);


                    }
                    break;

            }

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:205:9: ( classImplements )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Implements) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: classImplements
                    {
                    pushFollow(FOLLOW_classImplements_in_classDefinition1317);
                    classImplements41=classImplements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classImplements.add(classImplements41.getTree());

                    }
                    break;

            }

            OpenCurlyBracket42=(Token)match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_classDefinition1328); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenCurlyBracket.add(OpenCurlyBracket42);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:207:9: ( classMember )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Dollar||LA16_0==Function||LA16_0==Static||(LA16_0>=Abstract && LA16_0<=Const)||LA16_0==AccessModifier) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classDefinition1338);
            	    classMember43=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember43.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            CloseCurlyBracket44=(Token)match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_classDefinition1349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseCurlyBracket.add(CloseCurlyBracket44);



            // AST REWRITE
            // elements: classMember, classImplements, classModifier, Extends, Class, className, extendsclass
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
            // 209:9: -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:209:12: ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_Class.nextNode(), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:209:20: ^( Modifiers ( classModifier )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:209:32: ( classModifier )?
                if ( stream_classModifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_classModifier.nextTree());

                }
                stream_classModifier.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_className.nextNode());
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:209:59: ( ^( Extends $extendsclass) )?
                if ( stream_Extends.hasNext()||stream_extendsclass.hasNext() ) {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:209:59: ^( Extends $extendsclass)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_Extends.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_extendsclass.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_Extends.reset();
                stream_extendsclass.reset();
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:209:85: ( classImplements )?
                if ( stream_classImplements.hasNext() ) {
                    adaptor.addChild(root_1, stream_classImplements.nextTree());

                }
                stream_classImplements.reset();
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:210:13: ( classMember )*
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
            if ( state.backtracking>0 ) { memoize(input, 8, classDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDefinition"

    public static class classImplements_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classImplements"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:214:1: classImplements : Implements ( UnquotedString ( Comma UnquotedString )* ) ;
    public final PhpParser.classImplements_return classImplements() throws RecognitionException {
        PhpParser.classImplements_return retval = new PhpParser.classImplements_return();
        retval.start = input.LT(1);
        int classImplements_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Implements45=null;
        Token UnquotedString46=null;
        Token Comma47=null;
        Token UnquotedString48=null;

        CommonTree Implements45_tree=null;
        CommonTree UnquotedString46_tree=null;
        CommonTree Comma47_tree=null;
        CommonTree UnquotedString48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:215:5: ( Implements ( UnquotedString ( Comma UnquotedString )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:215:8: Implements ( UnquotedString ( Comma UnquotedString )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            Implements45=(Token)match(input,Implements,FOLLOW_Implements_in_classImplements1431); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Implements45_tree = (CommonTree)adaptor.create(Implements45);
            root_0 = (CommonTree)adaptor.becomeRoot(Implements45_tree, root_0);
            }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:215:20: ( UnquotedString ( Comma UnquotedString )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:215:21: UnquotedString ( Comma UnquotedString )*
            {
            UnquotedString46=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1435); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString46_tree = (CommonTree)adaptor.create(UnquotedString46);
            adaptor.addChild(root_0, UnquotedString46_tree);
            }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:215:36: ( Comma UnquotedString )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:215:37: Comma UnquotedString
            	    {
            	    Comma47=(Token)match(input,Comma,FOLLOW_Comma_in_classImplements1438); if (state.failed) return retval;
            	    UnquotedString48=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1441); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString48_tree = (CommonTree)adaptor.create(UnquotedString48);
            	    adaptor.addChild(root_0, UnquotedString48_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
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
            if ( state.backtracking>0 ) { memoize(input, 9, classImplements_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classImplements"

    public static class classMember_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:218:1: classMember : ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? ) | Var Dollar UnquotedString ( Equals atom )? ';' -> ^( Var ^( Dollar UnquotedString ) ( atom )? ) | Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) );
    public final PhpParser.classMember_return classMember() throws RecognitionException {
        PhpParser.classMember_return retval = new PhpParser.classMember_return();
        retval.start = input.LT(1);
        int classMember_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Function50=null;
        Token UnquotedString51=null;
        Token char_literal54=null;
        Token Var55=null;
        Token Dollar56=null;
        Token UnquotedString57=null;
        Token Equals58=null;
        Token char_literal60=null;
        Token Const61=null;
        Token UnquotedString62=null;
        Token Equals63=null;
        Token char_literal65=null;
        Token Dollar67=null;
        Token UnquotedString68=null;
        Token Equals69=null;
        Token char_literal71=null;
        PhpParser.fieldModifier_return fieldModifier49 = null;

        PhpParser.parametersDefinition_return parametersDefinition52 = null;

        PhpParser.bracketedBlock_return bracketedBlock53 = null;

        PhpParser.atom_return atom59 = null;

        PhpParser.atom_return atom64 = null;

        PhpParser.fieldModifier_return fieldModifier66 = null;

        PhpParser.atom_return atom70 = null;


        CommonTree Function50_tree=null;
        CommonTree UnquotedString51_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree Var55_tree=null;
        CommonTree Dollar56_tree=null;
        CommonTree UnquotedString57_tree=null;
        CommonTree Equals58_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree Const61_tree=null;
        CommonTree UnquotedString62_tree=null;
        CommonTree Equals63_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree Dollar67_tree=null;
        CommonTree UnquotedString68_tree=null;
        CommonTree Equals69_tree=null;
        CommonTree char_literal71_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:219:5: ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? ) | Var Dollar UnquotedString ( Equals atom )? ';' -> ^( Var ^( Dollar UnquotedString ) ( atom )? ) | Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case Static:
            case Abstract:
            case AccessModifier:
                {
                switch ( input.LA(2) ) {
                case Function:
                    {
                    alt24=1;
                    }
                    break;
                case Static:
                case Abstract:
                case AccessModifier:
                    {
                    int LA24_7 = input.LA(3);

                    if ( (synpred26_Php()) ) {
                        alt24=1;
                    }
                    else if ( (true) ) {
                        alt24=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case Dollar:
                    {
                    alt24=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }

                }
                break;
            case Function:
                {
                alt24=1;
                }
                break;
            case Var:
                {
                alt24=2;
                }
                break;
            case Const:
                {
                alt24=3;
                }
                break;
            case Dollar:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:219:7: ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' )
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:219:7: ( fieldModifier )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Static||LA18_0==Abstract||LA18_0==AccessModifier) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_classMember1461);
                    	    fieldModifier49=fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier49.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    Function50=(Token)match(input,Function,FOLLOW_Function_in_classMember1464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Function.add(Function50);

                    UnquotedString51=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString51);

                    pushFollow(FOLLOW_parametersDefinition_in_classMember1468);
                    parametersDefinition52=parametersDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition52.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:220:9: ( bracketedBlock | ';' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==OpenCurlyBracket) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==SemiColon) ) {
                        alt19=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:220:10: bracketedBlock
                            {
                            pushFollow(FOLLOW_bracketedBlock_in_classMember1480);
                            bracketedBlock53=bracketedBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracketedBlock.add(bracketedBlock53.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:220:27: ';'
                            {
                            char_literal54=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1484); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal54);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: parametersDefinition, fieldModifier, bracketedBlock, UnquotedString
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 221:9: -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:221:12: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Method, "Method"), root_1);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:221:21: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:221:33: ( fieldModifier )*
                        while ( stream_fieldModifier.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldModifier.nextTree());

                        }
                        stream_fieldModifier.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                        adaptor.addChild(root_1, stream_parametersDefinition.nextTree());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:221:85: ( bracketedBlock )?
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:222:7: Var Dollar UnquotedString ( Equals atom )? ';'
                    {
                    Var55=(Token)match(input,Var,FOLLOW_Var_in_classMember1521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Var.add(Var55);

                    Dollar56=(Token)match(input,Dollar,FOLLOW_Dollar_in_classMember1523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar56);

                    UnquotedString57=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1525); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString57);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:222:33: ( Equals atom )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==Equals) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:222:34: Equals atom
                            {
                            Equals58=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1528); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals58);

                            pushFollow(FOLLOW_atom_in_classMember1530);
                            atom59=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom59.getTree());

                            }
                            break;

                    }

                    char_literal60=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1534); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal60);



                    // AST REWRITE
                    // elements: UnquotedString, atom, Dollar, Var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 223:9: -> ^( Var ^( Dollar UnquotedString ) ( atom )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:223:12: ^( Var ^( Dollar UnquotedString ) ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Var.nextNode(), root_1);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:223:18: ^( Dollar UnquotedString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_UnquotedString.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:223:43: ( atom )?
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:224:7: Const UnquotedString ( Equals atom )? ';'
                    {
                    Const61=(Token)match(input,Const,FOLLOW_Const_in_classMember1567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Const.add(Const61);

                    UnquotedString62=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString62);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:224:28: ( Equals atom )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==Equals) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:224:29: Equals atom
                            {
                            Equals63=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1572); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals63);

                            pushFollow(FOLLOW_atom_in_classMember1574);
                            atom64=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom64.getTree());

                            }
                            break;

                    }

                    char_literal65=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal65);



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
                    // 225:9: -> ^( Const UnquotedString ( atom )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:225:12: ^( Const UnquotedString ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Const.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_UnquotedString.nextNode());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:225:35: ( atom )?
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:226:7: ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';'
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:226:7: ( fieldModifier )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Static||LA22_0==Abstract||LA22_0==AccessModifier) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: fieldModifier
                    	    {
                    	    pushFollow(FOLLOW_fieldModifier_in_classMember1606);
                    	    fieldModifier66=fieldModifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier66.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:226:22: ( Dollar UnquotedString )
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:226:23: Dollar UnquotedString
                    {
                    Dollar67=(Token)match(input,Dollar,FOLLOW_Dollar_in_classMember1610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar67);

                    UnquotedString68=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString68);


                    }

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:226:46: ( Equals atom )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==Equals) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:226:47: Equals atom
                            {
                            Equals69=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1616); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Equals.add(Equals69);

                            pushFollow(FOLLOW_atom_in_classMember1618);
                            atom70=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_atom.add(atom70.getTree());

                            }
                            break;

                    }

                    char_literal71=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal71);



                    // AST REWRITE
                    // elements: atom, UnquotedString, fieldModifier, Dollar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 227:9: -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:227:12: ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Field, "Field"), root_1);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:227:20: ^( Modifiers ( fieldModifier )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:227:32: ( fieldModifier )*
                        while ( stream_fieldModifier.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldModifier.nextTree());

                        }
                        stream_fieldModifier.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:227:48: ^( Dollar UnquotedString )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_UnquotedString.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:227:73: ( atom )?
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
            if ( state.backtracking>0 ) { memoize(input, 10, classMember_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class fieldDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDefinition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:230:1: fieldDefinition : Dollar UnquotedString ( Equals atom )? ';' -> ^( Field ^( Dollar UnquotedString ) ( atom )? ) ;
    public final PhpParser.fieldDefinition_return fieldDefinition() throws RecognitionException {
        PhpParser.fieldDefinition_return retval = new PhpParser.fieldDefinition_return();
        retval.start = input.LT(1);
        int fieldDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Dollar72=null;
        Token UnquotedString73=null;
        Token Equals74=null;
        Token char_literal76=null;
        PhpParser.atom_return atom75 = null;


        CommonTree Dollar72_tree=null;
        CommonTree UnquotedString73_tree=null;
        CommonTree Equals74_tree=null;
        CommonTree char_literal76_tree=null;
        RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:231:5: ( Dollar UnquotedString ( Equals atom )? ';' -> ^( Field ^( Dollar UnquotedString ) ( atom )? ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:231:7: Dollar UnquotedString ( Equals atom )? ';'
            {
            Dollar72=(Token)match(input,Dollar,FOLLOW_Dollar_in_fieldDefinition1670); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Dollar.add(Dollar72);

            UnquotedString73=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_fieldDefinition1672); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString73);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:231:29: ( Equals atom )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Equals) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:231:30: Equals atom
                    {
                    Equals74=(Token)match(input,Equals,FOLLOW_Equals_in_fieldDefinition1675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Equals.add(Equals74);

                    pushFollow(FOLLOW_atom_in_fieldDefinition1677);
                    atom75=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom75.getTree());

                    }
                    break;

            }

            char_literal76=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_fieldDefinition1681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal76);



            // AST REWRITE
            // elements: Dollar, atom, UnquotedString
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 231:47: -> ^( Field ^( Dollar UnquotedString ) ( atom )? )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:231:50: ^( Field ^( Dollar UnquotedString ) ( atom )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Field, "Field"), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:231:58: ^( Dollar UnquotedString )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);

                adaptor.addChild(root_2, stream_UnquotedString.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:231:83: ( atom )?
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
            if ( state.backtracking>0 ) { memoize(input, 11, fieldDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldDefinition"

    public static class classModifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classModifier"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:234:1: classModifier : 'abstract' ;
    public final PhpParser.classModifier_return classModifier() throws RecognitionException {
        PhpParser.classModifier_return retval = new PhpParser.classModifier_return();
        retval.start = input.LT(1);
        int classModifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token string_literal77=null;

        CommonTree string_literal77_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:235:5: ( 'abstract' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:235:7: 'abstract'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal77=(Token)match(input,Abstract,FOLLOW_Abstract_in_classModifier1716); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal77_tree = (CommonTree)adaptor.create(string_literal77);
            adaptor.addChild(root_0, string_literal77_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 12, classModifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classModifier"

    public static class fieldModifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldModifier"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:237:1: fieldModifier : ( AccessModifier | 'abstract' | 'static' );
    public final PhpParser.fieldModifier_return fieldModifier() throws RecognitionException {
        PhpParser.fieldModifier_return retval = new PhpParser.fieldModifier_return();
        retval.start = input.LT(1);
        int fieldModifier_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set78=null;

        CommonTree set78_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:238:5: ( AccessModifier | 'abstract' | 'static' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set78=(Token)input.LT(1);
            if ( input.LA(1)==Static||input.LA(1)==Abstract||input.LA(1)==AccessModifier ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set78));
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
            if ( state.backtracking>0 ) { memoize(input, 13, fieldModifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldModifier"

    public static class complexStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "complexStatement"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:242:1: complexStatement : ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( 'if' expression $ifTrue ( conditional )? ) | For '(' forInit forCondition forUpdate ')' statement -> ^( For forInit forCondition forUpdate statement ) | Foreach '(' variable 'as' arrayEntry ')' statement -> ^( Foreach variable arrayEntry statement ) | While '(' (whileCondition= expression )? ')' statement -> ^( While $whileCondition statement ) | Do statement While '(' doCondition= expression ')' ';' -> ^( Do statement $doCondition) | Switch '(' expression ')' '{' cases '}' -> ^( Switch expression cases ) | functionDefinition );
    public final PhpParser.complexStatement_return complexStatement() throws RecognitionException {
        PhpParser.complexStatement_return retval = new PhpParser.complexStatement_return();
        retval.start = input.LT(1);
        int complexStatement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token If79=null;
        Token char_literal80=null;
        Token char_literal81=null;
        Token For83=null;
        Token char_literal84=null;
        Token char_literal88=null;
        Token Foreach90=null;
        Token char_literal91=null;
        Token string_literal93=null;
        Token char_literal95=null;
        Token While97=null;
        Token char_literal98=null;
        Token char_literal99=null;
        Token Do101=null;
        Token While103=null;
        Token char_literal104=null;
        Token char_literal105=null;
        Token char_literal106=null;
        Token Switch107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        Token char_literal111=null;
        Token char_literal113=null;
        PhpParser.expression_return ifCondition = null;

        PhpParser.statement_return ifTrue = null;

        PhpParser.expression_return whileCondition = null;

        PhpParser.expression_return doCondition = null;

        PhpParser.conditional_return conditional82 = null;

        PhpParser.forInit_return forInit85 = null;

        PhpParser.forCondition_return forCondition86 = null;

        PhpParser.forUpdate_return forUpdate87 = null;

        PhpParser.statement_return statement89 = null;

        PhpParser.variable_return variable92 = null;

        PhpParser.arrayEntry_return arrayEntry94 = null;

        PhpParser.statement_return statement96 = null;

        PhpParser.statement_return statement100 = null;

        PhpParser.statement_return statement102 = null;

        PhpParser.expression_return expression109 = null;

        PhpParser.cases_return cases112 = null;

        PhpParser.functionDefinition_return functionDefinition114 = null;


        CommonTree If79_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree char_literal81_tree=null;
        CommonTree For83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree char_literal88_tree=null;
        CommonTree Foreach90_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree char_literal95_tree=null;
        CommonTree While97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree Do101_tree=null;
        CommonTree While103_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree char_literal106_tree=null;
        CommonTree Switch107_tree=null;
        CommonTree char_literal108_tree=null;
        CommonTree char_literal110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree char_literal113_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:243:5: ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( 'if' expression $ifTrue ( conditional )? ) | For '(' forInit forCondition forUpdate ')' statement -> ^( For forInit forCondition forUpdate statement ) | Foreach '(' variable 'as' arrayEntry ')' statement -> ^( Foreach variable arrayEntry statement ) | While '(' (whileCondition= expression )? ')' statement -> ^( While $whileCondition statement ) | Do statement While '(' doCondition= expression ')' ';' -> ^( Do statement $doCondition) | Switch '(' expression ')' '{' cases '}' -> ^( Switch expression cases ) | functionDefinition )
            int alt28=7;
            switch ( input.LA(1) ) {
            case If:
                {
                alt28=1;
                }
                break;
            case For:
                {
                alt28=2;
                }
                break;
            case Foreach:
                {
                alt28=3;
                }
                break;
            case While:
                {
                alt28=4;
                }
                break;
            case Do:
                {
                alt28=5;
                }
                break;
            case Switch:
                {
                alt28=6;
                }
                break;
            case Function:
                {
                alt28=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:243:7: If '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
                    {
                    If79=(Token)match(input,If,FOLLOW_If_in_complexStatement1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_If.add(If79);

                    char_literal80=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal80);

                    pushFollow(FOLLOW_expression_in_complexStatement1765);
                    ifCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifCondition.getTree());
                    char_literal81=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal81);

                    pushFollow(FOLLOW_statement_in_complexStatement1771);
                    ifTrue=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(ifTrue.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:243:58: ( conditional )?
                    int alt26=2;
                    alt26 = dfa26.predict(input);
                    switch (alt26) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: conditional
                            {
                            pushFollow(FOLLOW_conditional_in_complexStatement1773);
                            conditional82=conditional();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_conditional.add(conditional82.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: conditional, ifTrue, If, expression
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
                    // 244:9: -> ^( 'if' expression $ifTrue ( conditional )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:244:12: ^( 'if' expression $ifTrue ( conditional )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(If, "If"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_ifTrue.nextTree());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:244:38: ( conditional )?
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:245:7: For '(' forInit forCondition forUpdate ')' statement
                    {
                    For83=(Token)match(input,For,FOLLOW_For_in_complexStatement1804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_For.add(For83);

                    char_literal84=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal84);

                    pushFollow(FOLLOW_forInit_in_complexStatement1808);
                    forInit85=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forInit.add(forInit85.getTree());
                    pushFollow(FOLLOW_forCondition_in_complexStatement1810);
                    forCondition86=forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forCondition.add(forCondition86.getTree());
                    pushFollow(FOLLOW_forUpdate_in_complexStatement1812);
                    forUpdate87=forUpdate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate87.getTree());
                    char_literal88=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal88);

                    pushFollow(FOLLOW_statement_in_complexStatement1816);
                    statement89=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement89.getTree());


                    // AST REWRITE
                    // elements: forCondition, forUpdate, For, forInit, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 245:60: -> ^( For forInit forCondition forUpdate statement )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:245:63: ^( For forInit forCondition forUpdate statement )
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:246:7: Foreach '(' variable 'as' arrayEntry ')' statement
                    {
                    Foreach90=(Token)match(input,Foreach,FOLLOW_Foreach_in_complexStatement1838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Foreach.add(Foreach90);

                    char_literal91=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal91);

                    pushFollow(FOLLOW_variable_in_complexStatement1842);
                    variable92=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable.add(variable92.getTree());
                    string_literal93=(Token)match(input,113,FOLLOW_113_in_complexStatement1844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_113.add(string_literal93);

                    pushFollow(FOLLOW_arrayEntry_in_complexStatement1846);
                    arrayEntry94=arrayEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry94.getTree());
                    char_literal95=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal95);

                    pushFollow(FOLLOW_statement_in_complexStatement1850);
                    statement96=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement96.getTree());


                    // AST REWRITE
                    // elements: variable, arrayEntry, Foreach, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 246:58: -> ^( Foreach variable arrayEntry statement )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:246:61: ^( Foreach variable arrayEntry statement )
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:247:7: While '(' (whileCondition= expression )? ')' statement
                    {
                    While97=(Token)match(input,While,FOLLOW_While_in_complexStatement1870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_While.add(While97);

                    char_literal98=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal98);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:247:31: (whileCondition= expression )?
                    int alt27=2;
                    alt27 = dfa27.predict(input);
                    switch (alt27) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: whileCondition= expression
                            {
                            pushFollow(FOLLOW_expression_in_complexStatement1876);
                            whileCondition=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(whileCondition.getTree());

                            }
                            break;

                    }

                    char_literal99=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal99);

                    pushFollow(FOLLOW_statement_in_complexStatement1881);
                    statement100=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement100.getTree());


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
                    // 247:58: -> ^( While $whileCondition statement )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:247:61: ^( While $whileCondition statement )
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:248:7: Do statement While '(' doCondition= expression ')' ';'
                    {
                    Do101=(Token)match(input,Do,FOLLOW_Do_in_complexStatement1900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Do.add(Do101);

                    pushFollow(FOLLOW_statement_in_complexStatement1902);
                    statement102=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement102.getTree());
                    While103=(Token)match(input,While,FOLLOW_While_in_complexStatement1904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_While.add(While103);

                    char_literal104=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal104);

                    pushFollow(FOLLOW_expression_in_complexStatement1910);
                    doCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(doCondition.getTree());
                    char_literal105=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal105);

                    char_literal106=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_complexStatement1914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SemiColon.add(char_literal106);



                    // AST REWRITE
                    // elements: statement, Do, doCondition
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
                    // 248:61: -> ^( Do statement $doCondition)
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:248:64: ^( Do statement $doCondition)
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:249:7: Switch '(' expression ')' '{' cases '}'
                    {
                    Switch107=(Token)match(input,Switch,FOLLOW_Switch_in_complexStatement1933); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Switch.add(Switch107);

                    char_literal108=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_complexStatement1935); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal108);

                    pushFollow(FOLLOW_expression_in_complexStatement1937);
                    expression109=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression109.getTree());
                    char_literal110=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_complexStatement1939); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal110);

                    char_literal111=(Token)match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_complexStatement1941); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenCurlyBracket.add(char_literal111);

                    pushFollow(FOLLOW_cases_in_complexStatement1942);
                    cases112=cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cases.add(cases112.getTree());
                    char_literal113=(Token)match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_complexStatement1943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseCurlyBracket.add(char_literal113);



                    // AST REWRITE
                    // elements: cases, expression, Switch
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 249:45: -> ^( Switch expression cases )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:249:48: ^( Switch expression cases )
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:250:7: functionDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_functionDefinition_in_complexStatement1961);
                    functionDefinition114=functionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDefinition114.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 14, complexStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "complexStatement"

    public static class simpleStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleStatement"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:253:1: simpleStatement : ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression );
    public final PhpParser.simpleStatement_return simpleStatement() throws RecognitionException {
        PhpParser.simpleStatement_return retval = new PhpParser.simpleStatement_return();
        retval.start = input.LT(1);
        int simpleStatement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Echo115=null;
        Token Global117=null;
        Token char_literal119=null;
        Token Static121=null;
        Token Equals123=null;
        Token Break125=null;
        Token Integer126=null;
        Token Continue127=null;
        Token Integer128=null;
        Token Return129=null;
        Token RequireOperator131=null;
        PhpParser.commaList_return commaList116 = null;

        PhpParser.name_return name118 = null;

        PhpParser.name_return name120 = null;

        PhpParser.variable_return variable122 = null;

        PhpParser.atom_return atom124 = null;

        PhpParser.expression_return expression130 = null;

        PhpParser.expression_return expression132 = null;

        PhpParser.expression_return expression133 = null;


        CommonTree Echo115_tree=null;
        CommonTree Global117_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree Static121_tree=null;
        CommonTree Equals123_tree=null;
        CommonTree Break125_tree=null;
        CommonTree Integer126_tree=null;
        CommonTree Continue127_tree=null;
        CommonTree Integer128_tree=null;
        CommonTree Return129_tree=null;
        CommonTree RequireOperator131_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:254:5: ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression )
            int alt33=8;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:254:7: Echo commaList
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Echo115=(Token)match(input,Echo,FOLLOW_Echo_in_simpleStatement1978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Echo115_tree = (CommonTree)adaptor.create(Echo115);
                    root_0 = (CommonTree)adaptor.becomeRoot(Echo115_tree, root_0);
                    }
                    pushFollow(FOLLOW_commaList_in_simpleStatement1981);
                    commaList116=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, commaList116.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:255:7: Global name ( ',' name )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Global117=(Token)match(input,Global,FOLLOW_Global_in_simpleStatement1989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Global117_tree = (CommonTree)adaptor.create(Global117);
                    root_0 = (CommonTree)adaptor.becomeRoot(Global117_tree, root_0);
                    }
                    pushFollow(FOLLOW_name_in_simpleStatement1992);
                    name118=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name118.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:255:20: ( ',' name )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==Comma) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:255:21: ',' name
                    	    {
                    	    char_literal119=(Token)match(input,Comma,FOLLOW_Comma_in_simpleStatement1995); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_name_in_simpleStatement1998);
                    	    name120=name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name120.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:256:7: Static variable Equals atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Static121=(Token)match(input,Static,FOLLOW_Static_in_simpleStatement2008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Static121_tree = (CommonTree)adaptor.create(Static121);
                    root_0 = (CommonTree)adaptor.becomeRoot(Static121_tree, root_0);
                    }
                    pushFollow(FOLLOW_variable_in_simpleStatement2011);
                    variable122=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable122.getTree());
                    Equals123=(Token)match(input,Equals,FOLLOW_Equals_in_simpleStatement2013); if (state.failed) return retval;
                    pushFollow(FOLLOW_atom_in_simpleStatement2016);
                    atom124=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom124.getTree());

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:257:7: Break ( Integer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Break125=(Token)match(input,Break,FOLLOW_Break_in_simpleStatement2024); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Break125_tree = (CommonTree)adaptor.create(Break125);
                    root_0 = (CommonTree)adaptor.becomeRoot(Break125_tree, root_0);
                    }
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:257:14: ( Integer )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==Integer) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: Integer
                            {
                            Integer126=(Token)match(input,Integer,FOLLOW_Integer_in_simpleStatement2027); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Integer126_tree = (CommonTree)adaptor.create(Integer126);
                            adaptor.addChild(root_0, Integer126_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:258:7: Continue ( Integer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Continue127=(Token)match(input,Continue,FOLLOW_Continue_in_simpleStatement2036); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Continue127_tree = (CommonTree)adaptor.create(Continue127);
                    root_0 = (CommonTree)adaptor.becomeRoot(Continue127_tree, root_0);
                    }
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:258:17: ( Integer )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==Integer) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: Integer
                            {
                            Integer128=(Token)match(input,Integer,FOLLOW_Integer_in_simpleStatement2039); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Integer128_tree = (CommonTree)adaptor.create(Integer128);
                            adaptor.addChild(root_0, Integer128_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:260:7: Return ( expression )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Return129=(Token)match(input,Return,FOLLOW_Return_in_simpleStatement2053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Return129_tree = (CommonTree)adaptor.create(Return129);
                    root_0 = (CommonTree)adaptor.becomeRoot(Return129_tree, root_0);
                    }
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:260:15: ( expression )?
                    int alt32=2;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_simpleStatement2056);
                            expression130=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression130.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:261:7: RequireOperator expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    RequireOperator131=(Token)match(input,RequireOperator,FOLLOW_RequireOperator_in_simpleStatement2065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RequireOperator131_tree = (CommonTree)adaptor.create(RequireOperator131);
                    root_0 = (CommonTree)adaptor.becomeRoot(RequireOperator131_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_simpleStatement2068);
                    expression132=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression132.getTree());

                    }
                    break;
                case 8 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:262:7: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_simpleStatement2076);
                    expression133=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression133.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 15, simpleStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleStatement"

    public static class conditional_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:266:1: conditional : ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( If $ifCondition $ifTrue ( conditional )? ) | Else statement -> statement );
    public final PhpParser.conditional_return conditional() throws RecognitionException {
        PhpParser.conditional_return retval = new PhpParser.conditional_return();
        retval.start = input.LT(1);
        int conditional_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ElseIf134=null;
        Token char_literal135=null;
        Token char_literal136=null;
        Token Else138=null;
        PhpParser.expression_return ifCondition = null;

        PhpParser.statement_return ifTrue = null;

        PhpParser.conditional_return conditional137 = null;

        PhpParser.statement_return statement139 = null;


        CommonTree ElseIf134_tree=null;
        CommonTree char_literal135_tree=null;
        CommonTree char_literal136_tree=null;
        CommonTree Else138_tree=null;
        RewriteRuleTokenStream stream_ElseIf=new RewriteRuleTokenStream(adaptor,"token ElseIf");
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:5: ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( If $ifCondition $ifTrue ( conditional )? ) | Else statement -> statement )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ElseIf) ) {
                alt35=1;
            }
            else if ( (LA35_0==Else) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:7: ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
                    {
                    ElseIf134=(Token)match(input,ElseIf,FOLLOW_ElseIf_in_conditional2094); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ElseIf.add(ElseIf134);

                    char_literal135=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_conditional2096); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(char_literal135);

                    pushFollow(FOLLOW_expression_in_conditional2100);
                    ifCondition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(ifCondition.getTree());
                    char_literal136=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_conditional2102); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(char_literal136);

                    pushFollow(FOLLOW_statement_in_conditional2106);
                    ifTrue=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(ifTrue.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:62: ( conditional )?
                    int alt34=2;
                    alt34 = dfa34.predict(input);
                    switch (alt34) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: conditional
                            {
                            pushFollow(FOLLOW_conditional_in_conditional2108);
                            conditional137=conditional();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_conditional.add(conditional137.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: conditional, ifTrue, ifCondition
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
                    // 267:75: -> ^( If $ifCondition $ifTrue ( conditional )? )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:78: ^( If $ifCondition $ifTrue ( conditional )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(If, "If"), root_1);

                        adaptor.addChild(root_1, stream_ifCondition.nextTree());
                        adaptor.addChild(root_1, stream_ifTrue.nextTree());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:104: ( conditional )?
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:268:7: Else statement
                    {
                    Else138=(Token)match(input,Else,FOLLOW_Else_in_conditional2132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Else.add(Else138);

                    pushFollow(FOLLOW_statement_in_conditional2134);
                    statement139=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement139.getTree());


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
                    // 268:22: -> statement
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
            if ( state.backtracking>0 ) { memoize(input, 16, conditional_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditional"

    public static class forInit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:271:1: forInit : ( commaList )? ';' -> ^( ForInit ( commaList )? ) ;
    public final PhpParser.forInit_return forInit() throws RecognitionException {
        PhpParser.forInit_return retval = new PhpParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal141=null;
        PhpParser.commaList_return commaList140 = null;


        CommonTree char_literal141_tree=null;
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:272:5: ( ( commaList )? ';' -> ^( ForInit ( commaList )? ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:272:7: ( commaList )? ';'
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:272:7: ( commaList )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forInit2155);
                    commaList140=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList140.getTree());

                    }
                    break;

            }

            char_literal141=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_forInit2158); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal141);



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
            // 272:22: -> ^( ForInit ( commaList )? )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:272:25: ^( ForInit ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForInit, "ForInit"), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:272:35: ( commaList )?
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
            if ( state.backtracking>0 ) { memoize(input, 17, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forCondition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:275:1: forCondition : ( commaList )? ';' -> ^( ForCondition ( commaList )? ) ;
    public final PhpParser.forCondition_return forCondition() throws RecognitionException {
        PhpParser.forCondition_return retval = new PhpParser.forCondition_return();
        retval.start = input.LT(1);
        int forCondition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal143=null;
        PhpParser.commaList_return commaList142 = null;


        CommonTree char_literal143_tree=null;
        RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
        RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:276:5: ( ( commaList )? ';' -> ^( ForCondition ( commaList )? ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:276:7: ( commaList )? ';'
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:276:7: ( commaList )?
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forCondition2184);
                    commaList142=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList142.getTree());

                    }
                    break;

            }

            char_literal143=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_forCondition2187); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SemiColon.add(char_literal143);



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
            // 276:22: -> ^( ForCondition ( commaList )? )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:276:25: ^( ForCondition ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForCondition, "ForCondition"), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:276:40: ( commaList )?
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
            if ( state.backtracking>0 ) { memoize(input, 18, forCondition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forCondition"

    public static class forUpdate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forUpdate"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:279:1: forUpdate : ( commaList )? -> ^( ForUpdate ( commaList )? ) ;
    public final PhpParser.forUpdate_return forUpdate() throws RecognitionException {
        PhpParser.forUpdate_return retval = new PhpParser.forUpdate_return();
        retval.start = input.LT(1);
        int forUpdate_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.commaList_return commaList144 = null;


        RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:280:5: ( ( commaList )? -> ^( ForUpdate ( commaList )? ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:280:7: ( commaList )?
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:280:7: ( commaList )?
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: commaList
                    {
                    pushFollow(FOLLOW_commaList_in_forUpdate2217);
                    commaList144=commaList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_commaList.add(commaList144.getTree());

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
            // 280:18: -> ^( ForUpdate ( commaList )? )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:280:21: ^( ForUpdate ( commaList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForUpdate, "ForUpdate"), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:280:33: ( commaList )?
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
            if ( state.backtracking>0 ) { memoize(input, 19, forUpdate_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forUpdate"

    public static class cases_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cases"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:283:1: cases : ( casestatement )* defaultcase ;
    public final PhpParser.cases_return cases() throws RecognitionException {
        PhpParser.cases_return retval = new PhpParser.cases_return();
        retval.start = input.LT(1);
        int cases_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.casestatement_return casestatement145 = null;

        PhpParser.defaultcase_return defaultcase146 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:284:5: ( ( casestatement )* defaultcase )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:284:7: ( casestatement )* defaultcase
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:284:7: ( casestatement )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==Case) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: casestatement
            	    {
            	    pushFollow(FOLLOW_casestatement_in_cases2245);
            	    casestatement145=casestatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, casestatement145.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            pushFollow(FOLLOW_defaultcase_in_cases2249);
            defaultcase146=defaultcase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultcase146.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 20, cases_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cases"

    public static class casestatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "casestatement"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:287:1: casestatement : Case expression ':' ( statement )* ;
    public final PhpParser.casestatement_return casestatement() throws RecognitionException {
        PhpParser.casestatement_return retval = new PhpParser.casestatement_return();
        retval.start = input.LT(1);
        int casestatement_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Case147=null;
        Token char_literal149=null;
        PhpParser.expression_return expression148 = null;

        PhpParser.statement_return statement150 = null;


        CommonTree Case147_tree=null;
        CommonTree char_literal149_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:288:5: ( Case expression ':' ( statement )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:288:7: Case expression ':' ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            Case147=(Token)match(input,Case,FOLLOW_Case_in_casestatement2266); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Case147_tree = (CommonTree)adaptor.create(Case147);
            root_0 = (CommonTree)adaptor.becomeRoot(Case147_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_casestatement2269);
            expression148=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression148.getTree());
            char_literal149=(Token)match(input,Colon,FOLLOW_Colon_in_casestatement2271); if (state.failed) return retval;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:288:29: ( statement )*
            loop40:
            do {
                int alt40=2;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestatement2274);
            	    statement150=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement150.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
            if ( state.backtracking>0 ) { memoize(input, 21, casestatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "casestatement"

    public static class defaultcase_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultcase"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:291:1: defaultcase : ( Default ':' ( statement )* ) ;
    public final PhpParser.defaultcase_return defaultcase() throws RecognitionException {
        PhpParser.defaultcase_return retval = new PhpParser.defaultcase_return();
        retval.start = input.LT(1);
        int defaultcase_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Default151=null;
        Token char_literal152=null;
        PhpParser.statement_return statement153 = null;


        CommonTree Default151_tree=null;
        CommonTree char_literal152_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:5: ( ( Default ':' ( statement )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:7: ( Default ':' ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:7: ( Default ':' ( statement )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:8: Default ':' ( statement )*
            {
            Default151=(Token)match(input,Default,FOLLOW_Default_in_defaultcase2294); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Default151_tree = (CommonTree)adaptor.create(Default151);
            root_0 = (CommonTree)adaptor.becomeRoot(Default151_tree, root_0);
            }
            char_literal152=(Token)match(input,Colon,FOLLOW_Colon_in_defaultcase2297); if (state.failed) return retval;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:22: ( statement )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultcase2300);
            	    statement153=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement153.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
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
            if ( state.backtracking>0 ) { memoize(input, 22, defaultcase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultcase"

    public static class functionDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDefinition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:295:1: functionDefinition : Function UnquotedString parametersDefinition bracketedBlock -> ^( Function UnquotedString parametersDefinition bracketedBlock ) ;
    public final PhpParser.functionDefinition_return functionDefinition() throws RecognitionException {
        PhpParser.functionDefinition_return retval = new PhpParser.functionDefinition_return();
        retval.start = input.LT(1);
        int functionDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Function154=null;
        Token UnquotedString155=null;
        PhpParser.parametersDefinition_return parametersDefinition156 = null;

        PhpParser.bracketedBlock_return bracketedBlock157 = null;


        CommonTree Function154_tree=null;
        CommonTree UnquotedString155_tree=null;
        RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
        RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");
        RewriteRuleSubtreeStream stream_bracketedBlock=new RewriteRuleSubtreeStream(adaptor,"rule bracketedBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:296:5: ( Function UnquotedString parametersDefinition bracketedBlock -> ^( Function UnquotedString parametersDefinition bracketedBlock ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:296:7: Function UnquotedString parametersDefinition bracketedBlock
            {
            Function154=(Token)match(input,Function,FOLLOW_Function_in_functionDefinition2319); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Function.add(Function154);

            UnquotedString155=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_functionDefinition2321); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString155);

            pushFollow(FOLLOW_parametersDefinition_in_functionDefinition2323);
            parametersDefinition156=parametersDefinition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition156.getTree());
            pushFollow(FOLLOW_bracketedBlock_in_functionDefinition2325);
            bracketedBlock157=bracketedBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracketedBlock.add(bracketedBlock157.getTree());


            // AST REWRITE
            // elements: parametersDefinition, bracketedBlock, Function, UnquotedString
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 296:67: -> ^( Function UnquotedString parametersDefinition bracketedBlock )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:297:9: ^( Function UnquotedString parametersDefinition bracketedBlock )
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
            if ( state.backtracking>0 ) { memoize(input, 23, functionDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class parametersDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametersDefinition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:300:1: parametersDefinition : OpenRoundBracket ( paramDef ( Comma paramDef )* )? CloseRoundBracket -> ^( Params ( paramDef )* ) ;
    public final PhpParser.parametersDefinition_return parametersDefinition() throws RecognitionException {
        PhpParser.parametersDefinition_return retval = new PhpParser.parametersDefinition_return();
        retval.start = input.LT(1);
        int parametersDefinition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OpenRoundBracket158=null;
        Token Comma160=null;
        Token CloseRoundBracket162=null;
        PhpParser.paramDef_return paramDef159 = null;

        PhpParser.paramDef_return paramDef161 = null;


        CommonTree OpenRoundBracket158_tree=null;
        CommonTree Comma160_tree=null;
        CommonTree CloseRoundBracket162_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleSubtreeStream stream_paramDef=new RewriteRuleSubtreeStream(adaptor,"rule paramDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:5: ( OpenRoundBracket ( paramDef ( Comma paramDef )* )? CloseRoundBracket -> ^( Params ( paramDef )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:7: OpenRoundBracket ( paramDef ( Comma paramDef )* )? CloseRoundBracket
            {
            OpenRoundBracket158=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_parametersDefinition2363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenRoundBracket.add(OpenRoundBracket158);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:24: ( paramDef ( Comma paramDef )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Dollar||LA43_0==Ampersand) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:25: paramDef ( Comma paramDef )*
                    {
                    pushFollow(FOLLOW_paramDef_in_parametersDefinition2366);
                    paramDef159=paramDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramDef.add(paramDef159.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:34: ( Comma paramDef )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==Comma) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:35: Comma paramDef
                    	    {
                    	    Comma160=(Token)match(input,Comma,FOLLOW_Comma_in_parametersDefinition2369); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Comma.add(Comma160);

                    	    pushFollow(FOLLOW_paramDef_in_parametersDefinition2371);
                    	    paramDef161=paramDef();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_paramDef.add(paramDef161.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            CloseRoundBracket162=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_parametersDefinition2377); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseRoundBracket.add(CloseRoundBracket162);



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
            // 301:72: -> ^( Params ( paramDef )* )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:75: ^( Params ( paramDef )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Params, "Params"), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:301:84: ( paramDef )*
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
            if ( state.backtracking>0 ) { memoize(input, 24, parametersDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parametersDefinition"

    public static class paramDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramDef"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:304:1: paramDef : paramName ( Equals atom )? ;
    public final PhpParser.paramDef_return paramDef() throws RecognitionException {
        PhpParser.paramDef_return retval = new PhpParser.paramDef_return();
        retval.start = input.LT(1);
        int paramDef_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Equals164=null;
        PhpParser.paramName_return paramName163 = null;

        PhpParser.atom_return atom165 = null;


        CommonTree Equals164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:305:5: ( paramName ( Equals atom )? )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:305:7: paramName ( Equals atom )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_paramName_in_paramDef2404);
            paramName163=paramName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramName163.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:305:17: ( Equals atom )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Equals) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:305:18: Equals atom
                    {
                    Equals164=(Token)match(input,Equals,FOLLOW_Equals_in_paramDef2407); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Equals164_tree = (CommonTree)adaptor.create(Equals164);
                    root_0 = (CommonTree)adaptor.becomeRoot(Equals164_tree, root_0);
                    }
                    pushFollow(FOLLOW_atom_in_paramDef2410);
                    atom165=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom165.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 25, paramDef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "paramDef"

    public static class paramName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramName"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:308:1: paramName : ( Dollar UnquotedString | Ampersand Dollar UnquotedString -> ^( Ampersand ^( Dollar UnquotedString ) ) );
    public final PhpParser.paramName_return paramName() throws RecognitionException {
        PhpParser.paramName_return retval = new PhpParser.paramName_return();
        retval.start = input.LT(1);
        int paramName_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Dollar166=null;
        Token UnquotedString167=null;
        Token Ampersand168=null;
        Token Dollar169=null;
        Token UnquotedString170=null;

        CommonTree Dollar166_tree=null;
        CommonTree UnquotedString167_tree=null;
        CommonTree Ampersand168_tree=null;
        CommonTree Dollar169_tree=null;
        CommonTree UnquotedString170_tree=null;
        RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
        RewriteRuleTokenStream stream_Ampersand=new RewriteRuleTokenStream(adaptor,"token Ampersand");
        RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:309:5: ( Dollar UnquotedString | Ampersand Dollar UnquotedString -> ^( Ampersand ^( Dollar UnquotedString ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Dollar) ) {
                alt45=1;
            }
            else if ( (LA45_0==Ampersand) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:309:7: Dollar UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Dollar166=(Token)match(input,Dollar,FOLLOW_Dollar_in_paramName2429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar166_tree = (CommonTree)adaptor.create(Dollar166);
                    root_0 = (CommonTree)adaptor.becomeRoot(Dollar166_tree, root_0);
                    }
                    UnquotedString167=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString167_tree = (CommonTree)adaptor.create(UnquotedString167);
                    adaptor.addChild(root_0, UnquotedString167_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:310:7: Ampersand Dollar UnquotedString
                    {
                    Ampersand168=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_paramName2440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Ampersand.add(Ampersand168);

                    Dollar169=(Token)match(input,Dollar,FOLLOW_Dollar_in_paramName2442); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Dollar.add(Dollar169);

                    UnquotedString170=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString170);



                    // AST REWRITE
                    // elements: UnquotedString, Dollar, Ampersand
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 310:39: -> ^( Ampersand ^( Dollar UnquotedString ) )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:310:42: ^( Ampersand ^( Dollar UnquotedString ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Ampersand.nextNode(), root_1);

                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:310:54: ^( Dollar UnquotedString )
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
            if ( state.backtracking>0 ) { memoize(input, 26, paramName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "paramName"

    public static class commaList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commaList"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:313:1: commaList : expression ( ',' expression )* ;
    public final PhpParser.commaList_return commaList() throws RecognitionException {
        PhpParser.commaList_return retval = new PhpParser.commaList_return();
        retval.start = input.LT(1);
        int commaList_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal172=null;
        PhpParser.expression_return expression171 = null;

        PhpParser.expression_return expression173 = null;


        CommonTree char_literal172_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:314:5: ( expression ( ',' expression )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:314:7: expression ( ',' expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_commaList2473);
            expression171=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression171.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:314:18: ( ',' expression )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==Comma) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:314:19: ',' expression
            	    {
            	    char_literal172=(Token)match(input,Comma,FOLLOW_Comma_in_commaList2476); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_commaList2479);
            	    expression173=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression173.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 27, commaList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "commaList"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:317:1: expression : weakLogicalOr ;
    public final PhpParser.expression_return expression() throws RecognitionException {
        PhpParser.expression_return retval = new PhpParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.weakLogicalOr_return weakLogicalOr174 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:318:5: ( weakLogicalOr )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:318:7: weakLogicalOr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_weakLogicalOr_in_expression2503);
            weakLogicalOr174=weakLogicalOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalOr174.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 28, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class weakLogicalOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "weakLogicalOr"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:321:1: weakLogicalOr : weakLogicalXor ( Or weakLogicalXor )* ;
    public final PhpParser.weakLogicalOr_return weakLogicalOr() throws RecognitionException {
        PhpParser.weakLogicalOr_return retval = new PhpParser.weakLogicalOr_return();
        retval.start = input.LT(1);
        int weakLogicalOr_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Or176=null;
        PhpParser.weakLogicalXor_return weakLogicalXor175 = null;

        PhpParser.weakLogicalXor_return weakLogicalXor177 = null;


        CommonTree Or176_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:322:5: ( weakLogicalXor ( Or weakLogicalXor )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:322:7: weakLogicalXor ( Or weakLogicalXor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2520);
            weakLogicalXor175=weakLogicalXor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalXor175.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:322:22: ( Or weakLogicalXor )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:322:23: Or weakLogicalXor
            	    {
            	    Or176=(Token)match(input,Or,FOLLOW_Or_in_weakLogicalOr2523); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Or176_tree = (CommonTree)adaptor.create(Or176);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Or176_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2526);
            	    weakLogicalXor177=weakLogicalXor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalXor177.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 29, weakLogicalOr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "weakLogicalOr"

    public static class weakLogicalXor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "weakLogicalXor"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:325:1: weakLogicalXor : weakLogicalAnd ( Xor weakLogicalAnd )* ;
    public final PhpParser.weakLogicalXor_return weakLogicalXor() throws RecognitionException {
        PhpParser.weakLogicalXor_return retval = new PhpParser.weakLogicalXor_return();
        retval.start = input.LT(1);
        int weakLogicalXor_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Xor179=null;
        PhpParser.weakLogicalAnd_return weakLogicalAnd178 = null;

        PhpParser.weakLogicalAnd_return weakLogicalAnd180 = null;


        CommonTree Xor179_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:326:5: ( weakLogicalAnd ( Xor weakLogicalAnd )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:326:7: weakLogicalAnd ( Xor weakLogicalAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2545);
            weakLogicalAnd178=weakLogicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd178.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:326:22: ( Xor weakLogicalAnd )*
            loop48:
            do {
                int alt48=2;
                alt48 = dfa48.predict(input);
                switch (alt48) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:326:23: Xor weakLogicalAnd
            	    {
            	    Xor179=(Token)match(input,Xor,FOLLOW_Xor_in_weakLogicalXor2548); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Xor179_tree = (CommonTree)adaptor.create(Xor179);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Xor179_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2551);
            	    weakLogicalAnd180=weakLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd180.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
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
            if ( state.backtracking>0 ) { memoize(input, 30, weakLogicalXor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "weakLogicalXor"

    public static class weakLogicalAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "weakLogicalAnd"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:329:1: weakLogicalAnd : assignment ( And assignment )* ;
    public final PhpParser.weakLogicalAnd_return weakLogicalAnd() throws RecognitionException {
        PhpParser.weakLogicalAnd_return retval = new PhpParser.weakLogicalAnd_return();
        retval.start = input.LT(1);
        int weakLogicalAnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token And182=null;
        PhpParser.assignment_return assignment181 = null;

        PhpParser.assignment_return assignment183 = null;


        CommonTree And182_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:330:5: ( assignment ( And assignment )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:330:7: assignment ( And assignment )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_in_weakLogicalAnd2574);
            assignment181=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment181.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:330:18: ( And assignment )*
            loop49:
            do {
                int alt49=2;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:330:19: And assignment
            	    {
            	    And182=(Token)match(input,And,FOLLOW_And_in_weakLogicalAnd2577); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    And182_tree = (CommonTree)adaptor.create(And182);
            	    root_0 = (CommonTree)adaptor.becomeRoot(And182_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_assignment_in_weakLogicalAnd2580);
            	    assignment183=assignment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment183.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
            if ( state.backtracking>0 ) { memoize(input, 31, weakLogicalAnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "weakLogicalAnd"

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:333:1: assignment : ( listVariables ( ( Equals | AsignmentOperator ) assignment ) | ternary );
    public final PhpParser.assignment_return assignment() throws RecognitionException {
        PhpParser.assignment_return retval = new PhpParser.assignment_return();
        retval.start = input.LT(1);
        int assignment_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set185=null;
        PhpParser.listVariables_return listVariables184 = null;

        PhpParser.assignment_return assignment186 = null;

        PhpParser.ternary_return ternary187 = null;


        CommonTree set185_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:334:5: ( listVariables ( ( Equals | AsignmentOperator ) assignment ) | ternary )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:334:7: listVariables ( ( Equals | AsignmentOperator ) assignment )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_listVariables_in_assignment2599);
                    listVariables184=listVariables();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, listVariables184.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:334:21: ( ( Equals | AsignmentOperator ) assignment )
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:334:22: ( Equals | AsignmentOperator ) assignment
                    {
                    set185=(Token)input.LT(1);
                    set185=(Token)input.LT(1);
                    if ( input.LA(1)==Equals||input.LA(1)==AsignmentOperator ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set185), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_assignment_in_assignment2611);
                    assignment186=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment186.getTree());

                    }


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:335:7: ternary
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ternary_in_assignment2621);
                    ternary187=ternary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary187.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 32, assignment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class listVariables_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listVariables"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:338:1: listVariables : ( List OpenRoundBracket name ( ',' name )* CloseRoundBracket | name );
    public final PhpParser.listVariables_return listVariables() throws RecognitionException {
        PhpParser.listVariables_return retval = new PhpParser.listVariables_return();
        retval.start = input.LT(1);
        int listVariables_StartIndex = input.index();
        CommonTree root_0 = null;

        Token List188=null;
        Token OpenRoundBracket189=null;
        Token char_literal191=null;
        Token CloseRoundBracket193=null;
        PhpParser.name_return name190 = null;

        PhpParser.name_return name192 = null;

        PhpParser.name_return name194 = null;


        CommonTree List188_tree=null;
        CommonTree OpenRoundBracket189_tree=null;
        CommonTree char_literal191_tree=null;
        CommonTree CloseRoundBracket193_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:339:5: ( List OpenRoundBracket name ( ',' name )* CloseRoundBracket | name )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==List) ) {
                alt52=1;
            }
            else if ( (LA52_0==Dollar||LA52_0==UnquotedString) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:339:7: List OpenRoundBracket name ( ',' name )* CloseRoundBracket
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    List188=(Token)match(input,List,FOLLOW_List_in_listVariables2638); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    List188_tree = (CommonTree)adaptor.create(List188);
                    root_0 = (CommonTree)adaptor.becomeRoot(List188_tree, root_0);
                    }
                    OpenRoundBracket189=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_listVariables2641); if (state.failed) return retval;
                    pushFollow(FOLLOW_name_in_listVariables2644);
                    name190=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name190.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:339:36: ( ',' name )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==Comma) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:339:37: ',' name
                    	    {
                    	    char_literal191=(Token)match(input,Comma,FOLLOW_Comma_in_listVariables2647); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_name_in_listVariables2650);
                    	    name192=name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, name192.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    CloseRoundBracket193=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_listVariables2654); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:340:7: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_listVariables2664);
                    name194=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name194.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 33, listVariables_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "listVariables"

    public static class ternary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternary"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:343:1: ternary : ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr );
    public final PhpParser.ternary_return ternary() throws RecognitionException {
        PhpParser.ternary_return retval = new PhpParser.ternary_return();
        retval.start = input.LT(1);
        int ternary_StartIndex = input.index();
        CommonTree root_0 = null;

        Token QuestionMark196=null;
        Token Colon198=null;
        PhpParser.logicalOr_return logicalOr195 = null;

        PhpParser.expression_return expression197 = null;

        PhpParser.expression_return expression199 = null;

        PhpParser.logicalOr_return logicalOr200 = null;


        CommonTree QuestionMark196_tree=null;
        CommonTree Colon198_tree=null;
        RewriteRuleTokenStream stream_QuestionMark=new RewriteRuleTokenStream(adaptor,"token QuestionMark");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleSubtreeStream stream_logicalOr=new RewriteRuleSubtreeStream(adaptor,"rule logicalOr");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:344:5: ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:344:7: logicalOr QuestionMark expression Colon expression
                    {
                    pushFollow(FOLLOW_logicalOr_in_ternary2681);
                    logicalOr195=logicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalOr.add(logicalOr195.getTree());
                    QuestionMark196=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QuestionMark.add(QuestionMark196);

                    pushFollow(FOLLOW_expression_in_ternary2685);
                    expression197=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression197.getTree());
                    Colon198=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Colon.add(Colon198);

                    pushFollow(FOLLOW_expression_in_ternary2689);
                    expression199=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression199.getTree());


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
                    // 344:58: -> ^( IfExpression logicalOr ( expression )* )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:344:61: ^( IfExpression logicalOr ( expression )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IfExpression, "IfExpression"), root_1);

                        adaptor.addChild(root_1, stream_logicalOr.nextTree());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:344:86: ( expression )*
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:345:7: logicalOr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_logicalOr_in_ternary2708);
                    logicalOr200=logicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalOr200.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 34, ternary_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternary"

    public static class logicalOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalOr"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:348:1: logicalOr : logicalAnd ( LogicalOr logicalAnd )* ;
    public final PhpParser.logicalOr_return logicalOr() throws RecognitionException {
        PhpParser.logicalOr_return retval = new PhpParser.logicalOr_return();
        retval.start = input.LT(1);
        int logicalOr_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LogicalOr202=null;
        PhpParser.logicalAnd_return logicalAnd201 = null;

        PhpParser.logicalAnd_return logicalAnd203 = null;


        CommonTree LogicalOr202_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:349:5: ( logicalAnd ( LogicalOr logicalAnd )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:349:7: logicalAnd ( LogicalOr logicalAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalAnd_in_logicalOr2729);
            logicalAnd201=logicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd201.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:349:18: ( LogicalOr logicalAnd )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:349:19: LogicalOr logicalAnd
            	    {
            	    LogicalOr202=(Token)match(input,LogicalOr,FOLLOW_LogicalOr_in_logicalOr2732); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LogicalOr202_tree = (CommonTree)adaptor.create(LogicalOr202);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LogicalOr202_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicalAnd_in_logicalOr2735);
            	    logicalAnd203=logicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd203.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 35, logicalOr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalOr"

    public static class logicalAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalAnd"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:352:1: logicalAnd : bitwiseOr ( LogicalAnd bitwiseOr )* ;
    public final PhpParser.logicalAnd_return logicalAnd() throws RecognitionException {
        PhpParser.logicalAnd_return retval = new PhpParser.logicalAnd_return();
        retval.start = input.LT(1);
        int logicalAnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token LogicalAnd205=null;
        PhpParser.bitwiseOr_return bitwiseOr204 = null;

        PhpParser.bitwiseOr_return bitwiseOr206 = null;


        CommonTree LogicalAnd205_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:353:5: ( bitwiseOr ( LogicalAnd bitwiseOr )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:353:7: bitwiseOr ( LogicalAnd bitwiseOr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2754);
            bitwiseOr204=bitwiseOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr204.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:353:17: ( LogicalAnd bitwiseOr )*
            loop55:
            do {
                int alt55=2;
                alt55 = dfa55.predict(input);
                switch (alt55) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:353:18: LogicalAnd bitwiseOr
            	    {
            	    LogicalAnd205=(Token)match(input,LogicalAnd,FOLLOW_LogicalAnd_in_logicalAnd2757); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LogicalAnd205_tree = (CommonTree)adaptor.create(LogicalAnd205);
            	    root_0 = (CommonTree)adaptor.becomeRoot(LogicalAnd205_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2760);
            	    bitwiseOr206=bitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr206.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 36, logicalAnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalAnd"

    public static class bitwiseOr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseOr"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:356:1: bitwiseOr : bitWiseAnd ( Pipe bitWiseAnd )* ;
    public final PhpParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
        PhpParser.bitwiseOr_return retval = new PhpParser.bitwiseOr_return();
        retval.start = input.LT(1);
        int bitwiseOr_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Pipe208=null;
        PhpParser.bitWiseAnd_return bitWiseAnd207 = null;

        PhpParser.bitWiseAnd_return bitWiseAnd209 = null;


        CommonTree Pipe208_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:357:5: ( bitWiseAnd ( Pipe bitWiseAnd )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:357:7: bitWiseAnd ( Pipe bitWiseAnd )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2783);
            bitWiseAnd207=bitWiseAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseAnd207.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:357:18: ( Pipe bitWiseAnd )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:357:19: Pipe bitWiseAnd
            	    {
            	    Pipe208=(Token)match(input,Pipe,FOLLOW_Pipe_in_bitwiseOr2786); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Pipe208_tree = (CommonTree)adaptor.create(Pipe208);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Pipe208_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2789);
            	    bitWiseAnd209=bitWiseAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseAnd209.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, bitwiseOr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitwiseOr"

    public static class bitWiseAnd_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitWiseAnd"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:360:1: bitWiseAnd : equalityCheck ( Ampersand equalityCheck )* ;
    public final PhpParser.bitWiseAnd_return bitWiseAnd() throws RecognitionException {
        PhpParser.bitWiseAnd_return retval = new PhpParser.bitWiseAnd_return();
        retval.start = input.LT(1);
        int bitWiseAnd_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Ampersand211=null;
        PhpParser.equalityCheck_return equalityCheck210 = null;

        PhpParser.equalityCheck_return equalityCheck212 = null;


        CommonTree Ampersand211_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:361:5: ( equalityCheck ( Ampersand equalityCheck )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:361:7: equalityCheck ( Ampersand equalityCheck )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2808);
            equalityCheck210=equalityCheck();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCheck210.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:361:21: ( Ampersand equalityCheck )*
            loop57:
            do {
                int alt57=2;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:361:22: Ampersand equalityCheck
            	    {
            	    Ampersand211=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_bitWiseAnd2811); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Ampersand211_tree = (CommonTree)adaptor.create(Ampersand211);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Ampersand211_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2814);
            	    equalityCheck212=equalityCheck();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCheck212.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, bitWiseAnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitWiseAnd"

    public static class equalityCheck_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityCheck"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:364:1: equalityCheck : comparisionCheck ( EqualityOperator comparisionCheck )? ;
    public final PhpParser.equalityCheck_return equalityCheck() throws RecognitionException {
        PhpParser.equalityCheck_return retval = new PhpParser.equalityCheck_return();
        retval.start = input.LT(1);
        int equalityCheck_StartIndex = input.index();
        CommonTree root_0 = null;

        Token EqualityOperator214=null;
        PhpParser.comparisionCheck_return comparisionCheck213 = null;

        PhpParser.comparisionCheck_return comparisionCheck215 = null;


        CommonTree EqualityOperator214_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:365:5: ( comparisionCheck ( EqualityOperator comparisionCheck )? )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:365:7: comparisionCheck ( EqualityOperator comparisionCheck )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2833);
            comparisionCheck213=comparisionCheck();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, comparisionCheck213.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:365:24: ( EqualityOperator comparisionCheck )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:365:25: EqualityOperator comparisionCheck
                    {
                    EqualityOperator214=(Token)match(input,EqualityOperator,FOLLOW_EqualityOperator_in_equalityCheck2836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EqualityOperator214_tree = (CommonTree)adaptor.create(EqualityOperator214);
                    root_0 = (CommonTree)adaptor.becomeRoot(EqualityOperator214_tree, root_0);
                    }
                    pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2839);
                    comparisionCheck215=comparisionCheck();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comparisionCheck215.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 39, equalityCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityCheck"

    public static class comparisionCheck_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparisionCheck"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:368:1: comparisionCheck : bitWiseShift ( ComparisionOperator bitWiseShift )? ;
    public final PhpParser.comparisionCheck_return comparisionCheck() throws RecognitionException {
        PhpParser.comparisionCheck_return retval = new PhpParser.comparisionCheck_return();
        retval.start = input.LT(1);
        int comparisionCheck_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ComparisionOperator217=null;
        PhpParser.bitWiseShift_return bitWiseShift216 = null;

        PhpParser.bitWiseShift_return bitWiseShift218 = null;


        CommonTree ComparisionOperator217_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:369:5: ( bitWiseShift ( ComparisionOperator bitWiseShift )? )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:369:7: bitWiseShift ( ComparisionOperator bitWiseShift )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2862);
            bitWiseShift216=bitWiseShift();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseShift216.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:369:20: ( ComparisionOperator bitWiseShift )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:369:21: ComparisionOperator bitWiseShift
                    {
                    ComparisionOperator217=(Token)match(input,ComparisionOperator,FOLLOW_ComparisionOperator_in_comparisionCheck2865); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ComparisionOperator217_tree = (CommonTree)adaptor.create(ComparisionOperator217);
                    root_0 = (CommonTree)adaptor.becomeRoot(ComparisionOperator217_tree, root_0);
                    }
                    pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2868);
                    bitWiseShift218=bitWiseShift();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseShift218.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, comparisionCheck_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "comparisionCheck"

    public static class bitWiseShift_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitWiseShift"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:372:1: bitWiseShift : addition ( ShiftOperator addition )* ;
    public final PhpParser.bitWiseShift_return bitWiseShift() throws RecognitionException {
        PhpParser.bitWiseShift_return retval = new PhpParser.bitWiseShift_return();
        retval.start = input.LT(1);
        int bitWiseShift_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ShiftOperator220=null;
        PhpParser.addition_return addition219 = null;

        PhpParser.addition_return addition221 = null;


        CommonTree ShiftOperator220_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:373:5: ( addition ( ShiftOperator addition )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:373:7: addition ( ShiftOperator addition )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_addition_in_bitWiseShift2887);
            addition219=addition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addition219.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:373:16: ( ShiftOperator addition )*
            loop60:
            do {
                int alt60=2;
                alt60 = dfa60.predict(input);
                switch (alt60) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:373:17: ShiftOperator addition
            	    {
            	    ShiftOperator220=(Token)match(input,ShiftOperator,FOLLOW_ShiftOperator_in_bitWiseShift2890); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ShiftOperator220_tree = (CommonTree)adaptor.create(ShiftOperator220);
            	    root_0 = (CommonTree)adaptor.becomeRoot(ShiftOperator220_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addition_in_bitWiseShift2893);
            	    addition221=addition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addition221.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, bitWiseShift_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitWiseShift"

    public static class addition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addition"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:376:1: addition : multiplication ( ( Plus | Minus | Dot ) multiplication )* ;
    public final PhpParser.addition_return addition() throws RecognitionException {
        PhpParser.addition_return retval = new PhpParser.addition_return();
        retval.start = input.LT(1);
        int addition_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set223=null;
        PhpParser.multiplication_return multiplication222 = null;

        PhpParser.multiplication_return multiplication224 = null;


        CommonTree set223_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:377:5: ( multiplication ( ( Plus | Minus | Dot ) multiplication )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:377:7: multiplication ( ( Plus | Minus | Dot ) multiplication )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplication_in_addition2916);
            multiplication222=multiplication();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplication222.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:377:22: ( ( Plus | Minus | Dot ) multiplication )*
            loop61:
            do {
                int alt61=2;
                alt61 = dfa61.predict(input);
                switch (alt61) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:377:23: ( Plus | Minus | Dot ) multiplication
            	    {
            	    set223=(Token)input.LT(1);
            	    set223=(Token)input.LT(1);
            	    if ( input.LA(1)==Dot||(input.LA(1)>=Plus && input.LA(1)<=Minus) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set223), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplication_in_addition2932);
            	    multiplication224=multiplication();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplication224.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
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
            if ( state.backtracking>0 ) { memoize(input, 42, addition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addition"

    public static class multiplication_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplication"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:380:1: multiplication : logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )* ;
    public final PhpParser.multiplication_return multiplication() throws RecognitionException {
        PhpParser.multiplication_return retval = new PhpParser.multiplication_return();
        retval.start = input.LT(1);
        int multiplication_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set226=null;
        PhpParser.logicalNot_return logicalNot225 = null;

        PhpParser.logicalNot_return logicalNot227 = null;


        CommonTree set226_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:381:5: ( logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:381:7: logicalNot ( ( Asterisk | Forwardslash | Percent ) logicalNot )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalNot_in_multiplication2951);
            logicalNot225=logicalNot();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot225.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:381:18: ( ( Asterisk | Forwardslash | Percent ) logicalNot )*
            loop62:
            do {
                int alt62=2;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:381:19: ( Asterisk | Forwardslash | Percent ) logicalNot
            	    {
            	    set226=(Token)input.LT(1);
            	    set226=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Asterisk && input.LA(1)<=Forwardslash) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set226), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_logicalNot_in_multiplication2967);
            	    logicalNot227=logicalNot();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot227.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
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
            if ( state.backtracking>0 ) { memoize(input, 43, multiplication_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplication"

    public static class logicalNot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalNot"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:384:1: logicalNot : ( Bang logicalNot | instanceOf );
    public final PhpParser.logicalNot_return logicalNot() throws RecognitionException {
        PhpParser.logicalNot_return retval = new PhpParser.logicalNot_return();
        retval.start = input.LT(1);
        int logicalNot_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Bang228=null;
        PhpParser.logicalNot_return logicalNot229 = null;

        PhpParser.instanceOf_return instanceOf230 = null;


        CommonTree Bang228_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:385:5: ( Bang logicalNot | instanceOf )
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:385:7: Bang logicalNot
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Bang228=(Token)match(input,Bang,FOLLOW_Bang_in_logicalNot2986); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Bang228_tree = (CommonTree)adaptor.create(Bang228);
                    root_0 = (CommonTree)adaptor.becomeRoot(Bang228_tree, root_0);
                    }
                    pushFollow(FOLLOW_logicalNot_in_logicalNot2989);
                    logicalNot229=logicalNot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot229.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:386:7: instanceOf
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_instanceOf_in_logicalNot2997);
                    instanceOf230=instanceOf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf230.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 44, logicalNot_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalNot"

    public static class instanceOf_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceOf"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:389:1: instanceOf : negateOrCast ( Instanceof negateOrCast )? ;
    public final PhpParser.instanceOf_return instanceOf() throws RecognitionException {
        PhpParser.instanceOf_return retval = new PhpParser.instanceOf_return();
        retval.start = input.LT(1);
        int instanceOf_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Instanceof232=null;
        PhpParser.negateOrCast_return negateOrCast231 = null;

        PhpParser.negateOrCast_return negateOrCast233 = null;


        CommonTree Instanceof232_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:390:5: ( negateOrCast ( Instanceof negateOrCast )? )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:390:7: negateOrCast ( Instanceof negateOrCast )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_negateOrCast_in_instanceOf3014);
            negateOrCast231=negateOrCast();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, negateOrCast231.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:390:20: ( Instanceof negateOrCast )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:390:21: Instanceof negateOrCast
                    {
                    Instanceof232=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf3017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Instanceof232_tree = (CommonTree)adaptor.create(Instanceof232);
                    root_0 = (CommonTree)adaptor.becomeRoot(Instanceof232_tree, root_0);
                    }
                    pushFollow(FOLLOW_negateOrCast_in_instanceOf3020);
                    negateOrCast233=negateOrCast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, negateOrCast233.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 45, instanceOf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "instanceOf"

    public static class negateOrCast_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negateOrCast"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:393:1: negateOrCast : ( ( Tilde | Minus | SuppressWarnings ) increment | OpenRoundBracket PrimitiveType CloseRoundBracket increment -> ^( Cast PrimitiveType increment ) | OpenRoundBracket weakLogicalAnd CloseRoundBracket | increment );
    public final PhpParser.negateOrCast_return negateOrCast() throws RecognitionException {
        PhpParser.negateOrCast_return retval = new PhpParser.negateOrCast_return();
        retval.start = input.LT(1);
        int negateOrCast_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set234=null;
        Token OpenRoundBracket236=null;
        Token PrimitiveType237=null;
        Token CloseRoundBracket238=null;
        Token OpenRoundBracket240=null;
        Token CloseRoundBracket242=null;
        PhpParser.increment_return increment235 = null;

        PhpParser.increment_return increment239 = null;

        PhpParser.weakLogicalAnd_return weakLogicalAnd241 = null;

        PhpParser.increment_return increment243 = null;


        CommonTree set234_tree=null;
        CommonTree OpenRoundBracket236_tree=null;
        CommonTree PrimitiveType237_tree=null;
        CommonTree CloseRoundBracket238_tree=null;
        CommonTree OpenRoundBracket240_tree=null;
        CommonTree CloseRoundBracket242_tree=null;
        RewriteRuleTokenStream stream_PrimitiveType=new RewriteRuleTokenStream(adaptor,"token PrimitiveType");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleSubtreeStream stream_increment=new RewriteRuleSubtreeStream(adaptor,"rule increment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:394:5: ( ( Tilde | Minus | SuppressWarnings ) increment | OpenRoundBracket PrimitiveType CloseRoundBracket increment -> ^( Cast PrimitiveType increment ) | OpenRoundBracket weakLogicalAnd CloseRoundBracket | increment )
            int alt65=4;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:394:7: ( Tilde | Minus | SuppressWarnings ) increment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    set234=(Token)input.LT(1);
                    set234=(Token)input.LT(1);
                    if ( input.LA(1)==SuppressWarnings||input.LA(1)==Minus||input.LA(1)==Tilde ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set234), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_increment_in_negateOrCast3052);
                    increment235=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, increment235.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:395:7: OpenRoundBracket PrimitiveType CloseRoundBracket increment
                    {
                    OpenRoundBracket236=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_negateOrCast3060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(OpenRoundBracket236);

                    PrimitiveType237=(Token)match(input,PrimitiveType,FOLLOW_PrimitiveType_in_negateOrCast3062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PrimitiveType.add(PrimitiveType237);

                    CloseRoundBracket238=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_negateOrCast3064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(CloseRoundBracket238);

                    pushFollow(FOLLOW_increment_in_negateOrCast3066);
                    increment239=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_increment.add(increment239.getTree());


                    // AST REWRITE
                    // elements: PrimitiveType, increment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 395:66: -> ^( Cast PrimitiveType increment )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:395:69: ^( Cast PrimitiveType increment )
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:396:7: OpenRoundBracket weakLogicalAnd CloseRoundBracket
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OpenRoundBracket240=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_negateOrCast3084); if (state.failed) return retval;
                    pushFollow(FOLLOW_weakLogicalAnd_in_negateOrCast3087);
                    weakLogicalAnd241=weakLogicalAnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd241.getTree());
                    CloseRoundBracket242=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_negateOrCast3089); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:397:7: increment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_increment_in_negateOrCast3098);
                    increment243=increment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, increment243.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 46, negateOrCast_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "negateOrCast"

    public static class increment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "increment"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:400:1: increment : ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone );
    public final PhpParser.increment_return increment() throws RecognitionException {
        PhpParser.increment_return retval = new PhpParser.increment_return();
        retval.start = input.LT(1);
        int increment_StartIndex = input.index();
        CommonTree root_0 = null;

        Token IncrementOperator244=null;
        Token IncrementOperator247=null;
        PhpParser.name_return name245 = null;

        PhpParser.name_return name246 = null;

        PhpParser.newOrClone_return newOrClone248 = null;


        CommonTree IncrementOperator244_tree=null;
        CommonTree IncrementOperator247_tree=null;
        RewriteRuleTokenStream stream_IncrementOperator=new RewriteRuleTokenStream(adaptor,"token IncrementOperator");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:401:5: ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone )
            int alt66=3;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:401:7: IncrementOperator name
                    {
                    IncrementOperator244=(Token)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment3115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IncrementOperator.add(IncrementOperator244);

                    pushFollow(FOLLOW_name_in_increment3117);
                    name245=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name245.getTree());


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
                    // 401:30: -> ^( Prefix IncrementOperator name )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:401:33: ^( Prefix IncrementOperator name )
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:402:7: name IncrementOperator
                    {
                    pushFollow(FOLLOW_name_in_increment3135);
                    name246=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name246.getTree());
                    IncrementOperator247=(Token)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment3137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IncrementOperator.add(IncrementOperator247);



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
                    // 402:30: -> ^( Postfix IncrementOperator name )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:402:33: ^( Postfix IncrementOperator name )
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:403:7: newOrClone
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_newOrClone_in_increment3155);
                    newOrClone248=newOrClone();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newOrClone248.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 47, increment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "increment"

    public static class newOrClone_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newOrClone"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:406:1: newOrClone : ( New nameOrFunctionCall | Clone name | atomOrReference );
    public final PhpParser.newOrClone_return newOrClone() throws RecognitionException {
        PhpParser.newOrClone_return retval = new PhpParser.newOrClone_return();
        retval.start = input.LT(1);
        int newOrClone_StartIndex = input.index();
        CommonTree root_0 = null;

        Token New249=null;
        Token Clone251=null;
        PhpParser.nameOrFunctionCall_return nameOrFunctionCall250 = null;

        PhpParser.name_return name252 = null;

        PhpParser.atomOrReference_return atomOrReference253 = null;


        CommonTree New249_tree=null;
        CommonTree Clone251_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:407:5: ( New nameOrFunctionCall | Clone name | atomOrReference )
            int alt67=3;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:407:7: New nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    New249=(Token)match(input,New,FOLLOW_New_in_newOrClone3172); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    New249_tree = (CommonTree)adaptor.create(New249);
                    root_0 = (CommonTree)adaptor.becomeRoot(New249_tree, root_0);
                    }
                    pushFollow(FOLLOW_nameOrFunctionCall_in_newOrClone3175);
                    nameOrFunctionCall250=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall250.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:408:7: Clone name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Clone251=(Token)match(input,Clone,FOLLOW_Clone_in_newOrClone3183); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Clone251_tree = (CommonTree)adaptor.create(Clone251);
                    root_0 = (CommonTree)adaptor.becomeRoot(Clone251_tree, root_0);
                    }
                    pushFollow(FOLLOW_name_in_newOrClone3186);
                    name252=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name252.getTree());

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:409:7: atomOrReference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atomOrReference_in_newOrClone3194);
                    atomOrReference253=atomOrReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomOrReference253.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 48, newOrClone_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newOrClone"

    public static class atomOrReference_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomOrReference"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:412:1: atomOrReference : ( atom | reference );
    public final PhpParser.atomOrReference_return atomOrReference() throws RecognitionException {
        PhpParser.atomOrReference_return retval = new PhpParser.atomOrReference_return();
        retval.start = input.LT(1);
        int atomOrReference_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.atom_return atom254 = null;

        PhpParser.reference_return reference255 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:413:5: ( atom | reference )
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:413:7: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_atomOrReference3211);
                    atom254=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom254.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:414:7: reference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_reference_in_atomOrReference3219);
                    reference255=reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reference255.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, atomOrReference_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atomOrReference"

    public static class arrayDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayDeclaration"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:417:1: arrayDeclaration : Array OpenRoundBracket ( arrayEntry ( Comma arrayEntry )* )? CloseRoundBracket -> ^( Array ( arrayEntry )* ) ;
    public final PhpParser.arrayDeclaration_return arrayDeclaration() throws RecognitionException {
        PhpParser.arrayDeclaration_return retval = new PhpParser.arrayDeclaration_return();
        retval.start = input.LT(1);
        int arrayDeclaration_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Array256=null;
        Token OpenRoundBracket257=null;
        Token Comma259=null;
        Token CloseRoundBracket261=null;
        PhpParser.arrayEntry_return arrayEntry258 = null;

        PhpParser.arrayEntry_return arrayEntry260 = null;


        CommonTree Array256_tree=null;
        CommonTree OpenRoundBracket257_tree=null;
        CommonTree Comma259_tree=null;
        CommonTree CloseRoundBracket261_tree=null;
        RewriteRuleTokenStream stream_Array=new RewriteRuleTokenStream(adaptor,"token Array");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleSubtreeStream stream_arrayEntry=new RewriteRuleSubtreeStream(adaptor,"rule arrayEntry");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:418:5: ( Array OpenRoundBracket ( arrayEntry ( Comma arrayEntry )* )? CloseRoundBracket -> ^( Array ( arrayEntry )* ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:418:7: Array OpenRoundBracket ( arrayEntry ( Comma arrayEntry )* )? CloseRoundBracket
            {
            Array256=(Token)match(input,Array,FOLLOW_Array_in_arrayDeclaration3236); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Array.add(Array256);

            OpenRoundBracket257=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_arrayDeclaration3238); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OpenRoundBracket.add(OpenRoundBracket257);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:418:30: ( arrayEntry ( Comma arrayEntry )* )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:418:31: arrayEntry ( Comma arrayEntry )*
                    {
                    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration3241);
                    arrayEntry258=arrayEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry258.getTree());
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:418:42: ( Comma arrayEntry )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==Comma) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:418:43: Comma arrayEntry
                    	    {
                    	    Comma259=(Token)match(input,Comma,FOLLOW_Comma_in_arrayDeclaration3244); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Comma.add(Comma259);

                    	    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration3246);
                    	    arrayEntry260=arrayEntry();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry260.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }

            CloseRoundBracket261=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_arrayDeclaration3252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CloseRoundBracket.add(CloseRoundBracket261);



            // AST REWRITE
            // elements: Array, arrayEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 418:82: -> ^( Array ( arrayEntry )* )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:418:85: ^( Array ( arrayEntry )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_Array.nextNode(), root_1);

                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:418:93: ( arrayEntry )*
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
            if ( state.backtracking>0 ) { memoize(input, 50, arrayDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayDeclaration"

    public static class arrayEntry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayEntry"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:421:1: arrayEntry : ( keyValuePair | expression ) ;
    public final PhpParser.arrayEntry_return arrayEntry() throws RecognitionException {
        PhpParser.arrayEntry_return retval = new PhpParser.arrayEntry_return();
        retval.start = input.LT(1);
        int arrayEntry_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.keyValuePair_return keyValuePair262 = null;

        PhpParser.expression_return expression263 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:422:5: ( ( keyValuePair | expression ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:422:7: ( keyValuePair | expression )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:422:7: ( keyValuePair | expression )
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:422:8: keyValuePair
                    {
                    pushFollow(FOLLOW_keyValuePair_in_arrayEntry3279);
                    keyValuePair262=keyValuePair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, keyValuePair262.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:422:23: expression
                    {
                    pushFollow(FOLLOW_expression_in_arrayEntry3283);
                    expression263=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression263.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, arrayEntry_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayEntry"

    public static class keyValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePair"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:425:1: keyValuePair : ( expression ArrayAssign expression ) -> ^( ArrayAssign ( expression )+ ) ;
    public final PhpParser.keyValuePair_return keyValuePair() throws RecognitionException {
        PhpParser.keyValuePair_return retval = new PhpParser.keyValuePair_return();
        retval.start = input.LT(1);
        int keyValuePair_StartIndex = input.index();
        CommonTree root_0 = null;

        Token ArrayAssign265=null;
        PhpParser.expression_return expression264 = null;

        PhpParser.expression_return expression266 = null;


        CommonTree ArrayAssign265_tree=null;
        RewriteRuleTokenStream stream_ArrayAssign=new RewriteRuleTokenStream(adaptor,"token ArrayAssign");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:426:5: ( ( expression ArrayAssign expression ) -> ^( ArrayAssign ( expression )+ ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:426:7: ( expression ArrayAssign expression )
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:426:7: ( expression ArrayAssign expression )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:426:8: expression ArrayAssign expression
            {
            pushFollow(FOLLOW_expression_in_keyValuePair3302);
            expression264=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression264.getTree());
            ArrayAssign265=(Token)match(input,ArrayAssign,FOLLOW_ArrayAssign_in_keyValuePair3304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ArrayAssign.add(ArrayAssign265);

            pushFollow(FOLLOW_expression_in_keyValuePair3306);
            expression266=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression266.getTree());

            }



            // AST REWRITE
            // elements: ArrayAssign, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 426:43: -> ^( ArrayAssign ( expression )+ )
            {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:426:46: ^( ArrayAssign ( expression )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 52, keyValuePair_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "keyValuePair"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:429:1: atom : ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration );
    public final PhpParser.atom_return atom() throws RecognitionException {
        PhpParser.atom_return retval = new PhpParser.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        CommonTree root_0 = null;

        Token SingleQuotedString267=null;
        Token DoubleQuotedString268=null;
        Token HereDoc269=null;
        Token Integer270=null;
        Token Real271=null;
        Token Boolean272=null;
        PhpParser.arrayDeclaration_return arrayDeclaration273 = null;


        CommonTree SingleQuotedString267_tree=null;
        CommonTree DoubleQuotedString268_tree=null;
        CommonTree HereDoc269_tree=null;
        CommonTree Integer270_tree=null;
        CommonTree Real271_tree=null;
        CommonTree Boolean272_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:429:5: ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration )
            int alt72=7;
            switch ( input.LA(1) ) {
            case SingleQuotedString:
                {
                alt72=1;
                }
                break;
            case DoubleQuotedString:
                {
                alt72=2;
                }
                break;
            case HereDoc:
                {
                alt72=3;
                }
                break;
            case Integer:
                {
                alt72=4;
                }
                break;
            case Real:
                {
                alt72=5;
                }
                break;
            case Boolean:
                {
                alt72=6;
                }
                break;
            case Array:
                {
                alt72=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:429:7: SingleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SingleQuotedString267=(Token)match(input,SingleQuotedString,FOLLOW_SingleQuotedString_in_atom3328); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SingleQuotedString267_tree = (CommonTree)adaptor.create(SingleQuotedString267);
                    adaptor.addChild(root_0, SingleQuotedString267_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:429:28: DoubleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DoubleQuotedString268=(Token)match(input,DoubleQuotedString,FOLLOW_DoubleQuotedString_in_atom3332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DoubleQuotedString268_tree = (CommonTree)adaptor.create(DoubleQuotedString268);
                    adaptor.addChild(root_0, DoubleQuotedString268_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:429:49: HereDoc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    HereDoc269=(Token)match(input,HereDoc,FOLLOW_HereDoc_in_atom3336); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HereDoc269_tree = (CommonTree)adaptor.create(HereDoc269);
                    adaptor.addChild(root_0, HereDoc269_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:429:59: Integer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Integer270=(Token)match(input,Integer,FOLLOW_Integer_in_atom3340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Integer270_tree = (CommonTree)adaptor.create(Integer270);
                    adaptor.addChild(root_0, Integer270_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:429:69: Real
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Real271=(Token)match(input,Real,FOLLOW_Real_in_atom3344); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Real271_tree = (CommonTree)adaptor.create(Real271);
                    adaptor.addChild(root_0, Real271_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:429:76: Boolean
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Boolean272=(Token)match(input,Boolean,FOLLOW_Boolean_in_atom3348); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Boolean272_tree = (CommonTree)adaptor.create(Boolean272);
                    adaptor.addChild(root_0, Boolean272_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:429:86: arrayDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayDeclaration_in_atom3352);
                    arrayDeclaration273=arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayDeclaration273.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, atom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class reference_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reference"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:433:1: reference : ( Ampersand nameOrFunctionCall | nameOrFunctionCall );
    public final PhpParser.reference_return reference() throws RecognitionException {
        PhpParser.reference_return retval = new PhpParser.reference_return();
        retval.start = input.LT(1);
        int reference_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Ampersand274=null;
        PhpParser.nameOrFunctionCall_return nameOrFunctionCall275 = null;

        PhpParser.nameOrFunctionCall_return nameOrFunctionCall276 = null;


        CommonTree Ampersand274_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:434:5: ( Ampersand nameOrFunctionCall | nameOrFunctionCall )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==Ampersand) ) {
                alt73=1;
            }
            else if ( (LA73_0==Dollar||LA73_0==UnquotedString) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:434:7: Ampersand nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Ampersand274=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_reference3370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Ampersand274_tree = (CommonTree)adaptor.create(Ampersand274);
                    root_0 = (CommonTree)adaptor.becomeRoot(Ampersand274_tree, root_0);
                    }
                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference3373);
                    nameOrFunctionCall275=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall275.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:435:7: nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference3381);
                    nameOrFunctionCall276=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall276.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 54, reference_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "reference"

    public static class nameOrFunctionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameOrFunctionCall"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:438:1: nameOrFunctionCall : ( name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket -> ^( Apply name ( expression )* ) | name );
    public final PhpParser.nameOrFunctionCall_return nameOrFunctionCall() throws RecognitionException {
        PhpParser.nameOrFunctionCall_return retval = new PhpParser.nameOrFunctionCall_return();
        retval.start = input.LT(1);
        int nameOrFunctionCall_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OpenRoundBracket278=null;
        Token Comma280=null;
        Token CloseRoundBracket282=null;
        PhpParser.name_return name277 = null;

        PhpParser.expression_return expression279 = null;

        PhpParser.expression_return expression281 = null;

        PhpParser.name_return name283 = null;


        CommonTree OpenRoundBracket278_tree=null;
        CommonTree Comma280_tree=null;
        CommonTree CloseRoundBracket282_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_OpenRoundBracket=new RewriteRuleTokenStream(adaptor,"token OpenRoundBracket");
        RewriteRuleTokenStream stream_CloseRoundBracket=new RewriteRuleTokenStream(adaptor,"token CloseRoundBracket");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:5: ( name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket -> ^( Apply name ( expression )* ) | name )
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:7: name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket
                    {
                    pushFollow(FOLLOW_name_in_nameOrFunctionCall3398);
                    name277=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_name.add(name277.getTree());
                    OpenRoundBracket278=(Token)match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_nameOrFunctionCall3400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OpenRoundBracket.add(OpenRoundBracket278);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:29: ( expression ( Comma expression )* )?
                    int alt75=2;
                    alt75 = dfa75.predict(input);
                    switch (alt75) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:30: expression ( Comma expression )*
                            {
                            pushFollow(FOLLOW_expression_in_nameOrFunctionCall3403);
                            expression279=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression279.getTree());
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:41: ( Comma expression )*
                            loop74:
                            do {
                                int alt74=2;
                                int LA74_0 = input.LA(1);

                                if ( (LA74_0==Comma) ) {
                                    alt74=1;
                                }


                                switch (alt74) {
                            	case 1 :
                            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:42: Comma expression
                            	    {
                            	    Comma280=(Token)match(input,Comma,FOLLOW_Comma_in_nameOrFunctionCall3406); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_Comma.add(Comma280);

                            	    pushFollow(FOLLOW_expression_in_nameOrFunctionCall3408);
                            	    expression281=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_expression.add(expression281.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop74;
                                }
                            } while (true);


                            }
                            break;

                    }

                    CloseRoundBracket282=(Token)match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_nameOrFunctionCall3414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CloseRoundBracket.add(CloseRoundBracket282);



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
                    // 439:81: -> ^( Apply name ( expression )* )
                    {
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:84: ^( Apply name ( expression )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Apply, "Apply"), root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:97: ( expression )*
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:440:7: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_name_in_nameOrFunctionCall3433);
                    name283=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, name283.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, nameOrFunctionCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nameOrFunctionCall"

    public static class name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:443:1: name : ( staticMemberAccess | memberAccess | variable );
    public final PhpParser.name_return name() throws RecognitionException {
        PhpParser.name_return retval = new PhpParser.name_return();
        retval.start = input.LT(1);
        int name_StartIndex = input.index();
        CommonTree root_0 = null;

        PhpParser.staticMemberAccess_return staticMemberAccess284 = null;

        PhpParser.memberAccess_return memberAccess285 = null;

        PhpParser.variable_return variable286 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:443:5: ( staticMemberAccess | memberAccess | variable )
            int alt77=3;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:443:7: staticMemberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_staticMemberAccess_in_name3445);
                    staticMemberAccess284=staticMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticMemberAccess284.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:444:7: memberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_memberAccess_in_name3453);
                    memberAccess285=memberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccess285.getTree());

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:445:7: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_name3461);
                    variable286=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable286.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 56, name_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "name"

    public static class staticMemberAccess_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticMemberAccess"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:448:1: staticMemberAccess : UnquotedString '::' variable ;
    public final PhpParser.staticMemberAccess_return staticMemberAccess() throws RecognitionException {
        PhpParser.staticMemberAccess_return retval = new PhpParser.staticMemberAccess_return();
        retval.start = input.LT(1);
        int staticMemberAccess_StartIndex = input.index();
        CommonTree root_0 = null;

        Token UnquotedString287=null;
        Token string_literal288=null;
        PhpParser.variable_return variable289 = null;


        CommonTree UnquotedString287_tree=null;
        CommonTree string_literal288_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:449:5: ( UnquotedString '::' variable )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:449:7: UnquotedString '::' variable
            {
            root_0 = (CommonTree)adaptor.nil();

            UnquotedString287=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_staticMemberAccess3482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString287_tree = (CommonTree)adaptor.create(UnquotedString287);
            adaptor.addChild(root_0, UnquotedString287_tree);
            }
            string_literal288=(Token)match(input,ClassMember,FOLLOW_ClassMember_in_staticMemberAccess3484); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal288_tree = (CommonTree)adaptor.create(string_literal288);
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal288_tree, root_0);
            }
            pushFollow(FOLLOW_variable_in_staticMemberAccess3487);
            variable289=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable289.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 57, staticMemberAccess_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "staticMemberAccess"

    public static class memberAccess_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberAccess"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:452:1: memberAccess : variable ( OpenSquareBracket expression CloseSquareBracket | '->' UnquotedString )* ;
    public final PhpParser.memberAccess_return memberAccess() throws RecognitionException {
        PhpParser.memberAccess_return retval = new PhpParser.memberAccess_return();
        retval.start = input.LT(1);
        int memberAccess_StartIndex = input.index();
        CommonTree root_0 = null;

        Token OpenSquareBracket291=null;
        Token CloseSquareBracket293=null;
        Token string_literal294=null;
        Token UnquotedString295=null;
        PhpParser.variable_return variable290 = null;

        PhpParser.expression_return expression292 = null;


        CommonTree OpenSquareBracket291_tree=null;
        CommonTree CloseSquareBracket293_tree=null;
        CommonTree string_literal294_tree=null;
        CommonTree UnquotedString295_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:453:5: ( variable ( OpenSquareBracket expression CloseSquareBracket | '->' UnquotedString )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:453:7: variable ( OpenSquareBracket expression CloseSquareBracket | '->' UnquotedString )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_variable_in_memberAccess3504);
            variable290=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable290.getTree());
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:454:9: ( OpenSquareBracket expression CloseSquareBracket | '->' UnquotedString )*
            loop78:
            do {
                int alt78=3;
                alt78 = dfa78.predict(input);
                switch (alt78) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:454:11: OpenSquareBracket expression CloseSquareBracket
            	    {
            	    OpenSquareBracket291=(Token)match(input,OpenSquareBracket,FOLLOW_OpenSquareBracket_in_memberAccess3517); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OpenSquareBracket291_tree = (CommonTree)adaptor.create(OpenSquareBracket291);
            	    root_0 = (CommonTree)adaptor.becomeRoot(OpenSquareBracket291_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expression_in_memberAccess3520);
            	    expression292=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression292.getTree());
            	    CloseSquareBracket293=(Token)match(input,CloseSquareBracket,FOLLOW_CloseSquareBracket_in_memberAccess3522); if (state.failed) return retval;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:455:11: '->' UnquotedString
            	    {
            	    string_literal294=(Token)match(input,InstanceMember,FOLLOW_InstanceMember_in_memberAccess3535); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal294_tree = (CommonTree)adaptor.create(string_literal294);
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal294_tree, root_0);
            	    }
            	    UnquotedString295=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_memberAccess3538); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString295_tree = (CommonTree)adaptor.create(UnquotedString295);
            	    adaptor.addChild(root_0, UnquotedString295_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop78;
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
            if ( state.backtracking>0 ) { memoize(input, 58, memberAccess_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "memberAccess"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:458:1: variable : ( Dollar variable | UnquotedString );
    public final PhpParser.variable_return variable() throws RecognitionException {
        PhpParser.variable_return retval = new PhpParser.variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Dollar296=null;
        Token UnquotedString298=null;
        PhpParser.variable_return variable297 = null;


        CommonTree Dollar296_tree=null;
        CommonTree UnquotedString298_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:459:5: ( Dollar variable | UnquotedString )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==Dollar) ) {
                alt79=1;
            }
            else if ( (LA79_0==UnquotedString) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:459:7: Dollar variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Dollar296=(Token)match(input,Dollar,FOLLOW_Dollar_in_variable3561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar296_tree = (CommonTree)adaptor.create(Dollar296);
                    root_0 = (CommonTree)adaptor.becomeRoot(Dollar296_tree, root_0);
                    }
                    pushFollow(FOLLOW_variable_in_variable3564);
                    variable297=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable297.getTree());

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:460:7: UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UnquotedString298=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_variable3572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString298_tree = (CommonTree)adaptor.create(UnquotedString298);
                    adaptor.addChild(root_0, UnquotedString298_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 59, variable_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variable"

    // $ANTLR start synpred1_Php
    public final void synpred1_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:161:8: ( statement )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:161:8: statement
        {
        pushFollow(FOLLOW_statement_in_synpred1_Php889);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Php

    // $ANTLR start synpred2_Php
    public final void synpred2_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:164:7: ({...}? => printExpr ';' )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:164:7: {...}? => printExpr ';'
        {
        if ( !((expressionFollowsBodyString)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_Php", "expressionFollowsBodyString");
        }
        pushFollow(FOLLOW_printExpr_in_synpred2_Php907);
        printExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SemiColon,FOLLOW_SemiColon_in_synpred2_Php909); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Php

    // $ANTLR start synpred4_Php
    public final void synpred4_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:8: ({...}? => ( printExpr )? )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:8: {...}? => ( printExpr )?
        {
        if ( !((expressionFollowsBodyString)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_Php", "expressionFollowsBodyString");
        }
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:79: ( printExpr )?
        int alt80=2;
        alt80 = dfa80.predict(input);
        switch (alt80) {
            case 1 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: printExpr
                {
                pushFollow(FOLLOW_printExpr_in_synpred4_Php925);
                printExpr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred4_Php

    // $ANTLR start synpred6_Php
    public final void synpred6_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:7: ( ({...}? => ( printExpr )? | ( simpleStatement )? ) BodyString )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:7: ({...}? => ( printExpr )? | ( simpleStatement )? ) BodyString
        {
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:7: ({...}? => ( printExpr )? | ( simpleStatement )? )
        int alt83=2;
        alt83 = dfa83.predict(input);
        switch (alt83) {
            case 1 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:8: {...}? => ( printExpr )?
                {
                if ( !((expressionFollowsBodyString)) ) {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    throw new FailedPredicateException(input, "synpred6_Php", "expressionFollowsBodyString");
                }
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:79: ( printExpr )?
                int alt81=2;
                alt81 = dfa81.predict(input);
                switch (alt81) {
                    case 1 :
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: printExpr
                        {
                        pushFollow(FOLLOW_printExpr_in_synpred6_Php925);
                        printExpr();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                }
                break;
            case 2 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:92: ( simpleStatement )?
                {
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:165:92: ( simpleStatement )?
                int alt82=2;
                alt82 = dfa82.predict(input);
                switch (alt82) {
                    case 1 :
                        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: simpleStatement
                        {
                        pushFollow(FOLLOW_simpleStatement_in_synpred6_Php930);
                        simpleStatement();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                }
                break;

        }

        match(input,BodyString,FOLLOW_BodyString_in_synpred6_Php934); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Php

    // $ANTLR start synpred7_Php
    public final void synpred7_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:166:7: ( '{' statement '}' )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:166:7: '{' statement '}'
        {
        match(input,OpenCurlyBracket,FOLLOW_OpenCurlyBracket_in_synpred7_Php944); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred7_Php946);
        statement();

        state._fsp--;
        if (state.failed) return ;
        match(input,CloseCurlyBracket,FOLLOW_CloseCurlyBracket_in_synpred7_Php948); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Php

    // $ANTLR start synpred8_Php
    public final void synpred8_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:167:7: ( bracketedBlock )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:167:7: bracketedBlock
        {
        pushFollow(FOLLOW_bracketedBlock_in_synpred8_Php960);
        bracketedBlock();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Php

    // $ANTLR start synpred12_Php
    public final void synpred12_Php_fragment() throws RecognitionException {   
        PhpParser.statement_return stmts = null;


        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:180:16: (stmts= statement )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:180:16: stmts= statement
        {
        pushFollow(FOLLOW_statement_in_synpred12_Php1046);
        stmts=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_Php

    // $ANTLR start synpred26_Php
    public final void synpred26_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:219:7: ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:219:7: ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' )
        {
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:219:7: ( fieldModifier )*
        loop85:
        do {
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==Static||LA85_0==Abstract||LA85_0==AccessModifier) ) {
                alt85=1;
            }


            switch (alt85) {
        	case 1 :
        	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:0:0: fieldModifier
        	    {
        	    pushFollow(FOLLOW_fieldModifier_in_synpred26_Php1461);
        	    fieldModifier();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop85;
            }
        } while (true);

        match(input,Function,FOLLOW_Function_in_synpred26_Php1464); if (state.failed) return ;
        match(input,UnquotedString,FOLLOW_UnquotedString_in_synpred26_Php1466); if (state.failed) return ;
        pushFollow(FOLLOW_parametersDefinition_in_synpred26_Php1468);
        parametersDefinition();

        state._fsp--;
        if (state.failed) return ;
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:220:9: ( bracketedBlock | ';' )
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==OpenCurlyBracket) ) {
            alt86=1;
        }
        else if ( (LA86_0==SemiColon) ) {
            alt86=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 86, 0, input);

            throw nvae;
        }
        switch (alt86) {
            case 1 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:220:10: bracketedBlock
                {
                pushFollow(FOLLOW_bracketedBlock_in_synpred26_Php1480);
                bracketedBlock();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:220:27: ';'
                {
                match(input,SemiColon,FOLLOW_SemiColon_in_synpred26_Php1484); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred26_Php

    // $ANTLR start synpred36_Php
    public final void synpred36_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:243:58: ( conditional )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:243:58: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred36_Php1773);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Php

    // $ANTLR start synpred55_Php
    public final void synpred55_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:62: ( conditional )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:267:62: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred55_Php2108);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_Php

    // $ANTLR start synpred61_Php
    public final void synpred61_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:288:29: ( statement )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:288:29: statement
        {
        pushFollow(FOLLOW_statement_in_synpred61_Php2274);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_Php

    // $ANTLR start synpred62_Php
    public final void synpred62_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:22: ( statement )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:292:22: statement
        {
        pushFollow(FOLLOW_statement_in_synpred62_Php2300);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_Php

    // $ANTLR start synpred68_Php
    public final void synpred68_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:322:23: ( Or weakLogicalXor )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:322:23: Or weakLogicalXor
        {
        match(input,Or,FOLLOW_Or_in_synpred68_Php2523); if (state.failed) return ;
        pushFollow(FOLLOW_weakLogicalXor_in_synpred68_Php2526);
        weakLogicalXor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_Php

    // $ANTLR start synpred69_Php
    public final void synpred69_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:326:23: ( Xor weakLogicalAnd )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:326:23: Xor weakLogicalAnd
        {
        match(input,Xor,FOLLOW_Xor_in_synpred69_Php2548); if (state.failed) return ;
        pushFollow(FOLLOW_weakLogicalAnd_in_synpred69_Php2551);
        weakLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Php

    // $ANTLR start synpred70_Php
    public final void synpred70_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:330:19: ( And assignment )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:330:19: And assignment
        {
        match(input,And,FOLLOW_And_in_synpred70_Php2577); if (state.failed) return ;
        pushFollow(FOLLOW_assignment_in_synpred70_Php2580);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Php

    // $ANTLR start synpred72_Php
    public final void synpred72_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:334:7: ( listVariables ( ( Equals | AsignmentOperator ) assignment ) )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:334:7: listVariables ( ( Equals | AsignmentOperator ) assignment )
        {
        pushFollow(FOLLOW_listVariables_in_synpred72_Php2599);
        listVariables();

        state._fsp--;
        if (state.failed) return ;
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:334:21: ( ( Equals | AsignmentOperator ) assignment )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:334:22: ( Equals | AsignmentOperator ) assignment
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

        pushFollow(FOLLOW_assignment_in_synpred72_Php2611);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred72_Php

    // $ANTLR start synpred75_Php
    public final void synpred75_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:344:7: ( logicalOr QuestionMark expression Colon expression )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:344:7: logicalOr QuestionMark expression Colon expression
        {
        pushFollow(FOLLOW_logicalOr_in_synpred75_Php2681);
        logicalOr();

        state._fsp--;
        if (state.failed) return ;
        match(input,QuestionMark,FOLLOW_QuestionMark_in_synpred75_Php2683); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred75_Php2685);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,Colon,FOLLOW_Colon_in_synpred75_Php2687); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred75_Php2689);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_Php

    // $ANTLR start synpred97_Php
    public final void synpred97_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:402:7: ( name IncrementOperator )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:402:7: name IncrementOperator
        {
        pushFollow(FOLLOW_name_in_synpred97_Php3135);
        name();

        state._fsp--;
        if (state.failed) return ;
        match(input,IncrementOperator,FOLLOW_IncrementOperator_in_synpred97_Php3137); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_Php

    // $ANTLR start synpred103_Php
    public final void synpred103_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:422:8: ( keyValuePair )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:422:8: keyValuePair
        {
        pushFollow(FOLLOW_keyValuePair_in_synpred103_Php3279);
        keyValuePair();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_Php

    // $ANTLR start synpred113_Php
    public final void synpred113_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:7: ( name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:7: name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket
        {
        pushFollow(FOLLOW_name_in_synpred113_Php3398);
        name();

        state._fsp--;
        if (state.failed) return ;
        match(input,OpenRoundBracket,FOLLOW_OpenRoundBracket_in_synpred113_Php3400); if (state.failed) return ;
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:29: ( expression ( Comma expression )* )?
        int alt101=2;
        alt101 = dfa101.predict(input);
        switch (alt101) {
            case 1 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:30: expression ( Comma expression )*
                {
                pushFollow(FOLLOW_expression_in_synpred113_Php3403);
                expression();

                state._fsp--;
                if (state.failed) return ;
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:41: ( Comma expression )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==Comma) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:439:42: Comma expression
                	    {
                	    match(input,Comma,FOLLOW_Comma_in_synpred113_Php3406); if (state.failed) return ;
                	    pushFollow(FOLLOW_expression_in_synpred113_Php3408);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop100;
                    }
                } while (true);


                }
                break;

        }

        match(input,CloseRoundBracket,FOLLOW_CloseRoundBracket_in_synpred113_Php3414); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_Php

    // $ANTLR start synpred115_Php
    public final void synpred115_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:444:7: ( memberAccess )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:444:7: memberAccess
        {
        pushFollow(FOLLOW_memberAccess_in_synpred115_Php3453);
        memberAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_Php

    // Delegated rules

    public final boolean synpred6_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_Php_fragment(); // can never throw exception
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
    public final boolean synpred12_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Php_fragment(); // can never throw exception
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
    public final boolean synpred26_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_Php_fragment(); // can never throw exception
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
    public final boolean synpred113_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Php_fragment(); // can never throw exception
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
    public final boolean synpred115_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Php_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_Php_fragment(); // can never throw exception
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
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA50 dfa50 = new DFA50(this);
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
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA101 dfa101 = new DFA101(this);
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
            return "()* loopback of 161:8: ( statement )*";
        }
    }
    static final String DFA5_eotS =
        "\51\uffff";
    static final String DFA5_eofS =
        "\51\uffff";
    static final String DFA5_minS =
        "\1\6\21\0\1\uffff\10\0\16\uffff";
    static final String DFA5_maxS =
        "\1\141\21\0\1\uffff\10\0\16\uffff";
    static final String DFA5_acceptS =
        "\22\uffff\1\2\10\uffff\1\5\1\uffff\1\6\1\7\6\uffff\1\1\1\10\1\3"+
        "\1\4";
    static final String DFA5_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
        "\1\30\16\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\6\3\uffff\1\32\6\uffff\1\5\1\uffff\1\3\2\uffff\1\21\1\uffff"+
            "\1\4\1\uffff\1\5\3\uffff\1\5\1\uffff\1\10\1\11\1\23\1\36\2\uffff"+
            "\5\36\2\uffff\1\36\1\26\1\27\1\30\1\24\1\25\4\uffff\1\1\1\33"+
            "\1\35\2\uffff\1\33\24\uffff\1\22\1\2\1\uffff\1\15\1\31\5\uffff"+
            "\1\7\1\20\1\12\1\13\1\14\1\16\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "163:1: statement : ({...}? => printExpr ';' | ({...}? => ( printExpr )? | ( simpleStatement )? ) BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_4 = input.LA(1);

                         
                        int index5_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_6 = input.LA(1);

                         
                        int index5_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_7 = input.LA(1);

                         
                        int index5_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA5_8 = input.LA(1);

                         
                        int index5_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA5_9 = input.LA(1);

                         
                        int index5_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA5_10 = input.LA(1);

                         
                        int index5_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA5_11 = input.LA(1);

                         
                        int index5_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA5_12 = input.LA(1);

                         
                        int index5_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA5_13 = input.LA(1);

                         
                        int index5_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA5_14 = input.LA(1);

                         
                        int index5_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA5_15 = input.LA(1);

                         
                        int index5_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA5_16 = input.LA(1);

                         
                        int index5_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA5_17 = input.LA(1);

                         
                        int index5_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred2_Php()&&(expressionFollowsBodyString))) ) {s = 37;}

                        else if ( ((synpred6_Php()||(synpred6_Php()&&(expressionFollowsBodyString)))) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA5_19 = input.LA(1);

                         
                        int index5_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA5_20 = input.LA(1);

                         
                        int index5_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA5_21 = input.LA(1);

                         
                        int index5_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA5_22 = input.LA(1);

                         
                        int index5_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_22);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA5_23 = input.LA(1);

                         
                        int index5_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA5_24 = input.LA(1);

                         
                        int index5_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_24);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA5_25 = input.LA(1);

                         
                        int index5_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index5_25);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA5_26 = input.LA(1);

                         
                        int index5_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Php()) ) {s = 39;}

                        else if ( (synpred8_Php()) ) {s = 40;}

                         
                        input.seek(index5_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA4_eotS =
        "\u00ef\uffff";
    static final String DFA4_eofS =
        "\u00ef\uffff";
    static final String DFA4_minS =
        "\2\6\1\0\1\23\1\6\1\23\1\6\3\23\6\0\1\6\1\23\1\0\7\uffff\1\0\26"+
        "\uffff\67\0\132\uffff\3\0\52\uffff";
    static final String DFA4_maxS =
        "\1\141\1\6\1\0\1\122\3\141\3\122\6\0\1\6\1\122\1\0\7\uffff\1\0\26"+
        "\uffff\67\0\132\uffff\3\0\52\uffff";
    static final String DFA4_acceptS =
        "\23\uffff\1\2\34\uffff\1\1\u00be\uffff";
    static final String DFA4_specialS =
        "\2\uffff\1\0\7\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\7\7\uffff"+
        "\1\10\26\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
        "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
        "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
        "\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71"+
        "\1\72\1\73\1\74\1\75\1\76\1\77\132\uffff\1\100\1\101\1\102\52\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\6\12\uffff\1\5\1\uffff\1\3\2\uffff\1\21\1\uffff\1\4\1\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\10\1\11\1\23\13\uffff\5\23\4\uffff"+
            "\1\1\31\uffff\1\22\1\2\1\uffff\1\15\1\23\5\uffff\1\7\1\20\1"+
            "\12\1\13\1\14\1\16\1\17",
            "\1\32",
            "\1\uffff",
            "\1\61\76\uffff\1\62",
            "\1\65\12\uffff\1\64\1\uffff\1\70\2\uffff\1\102\1\uffff\1\63"+
            "\1\uffff\1\64\3\uffff\1\64\1\uffff\1\71\1\72\60\uffff\1\67\1"+
            "\uffff\1\76\6\uffff\1\66\1\101\1\73\1\74\1\75\1\77\1\100",
            "\1\105\2\uffff\1\117\11\uffff\1\106\1\107\60\uffff\1\104\1"+
            "\uffff\1\113\6\uffff\1\103\1\116\1\110\1\111\1\112\1\114\1\115",
            "\1\126\12\uffff\1\125\1\uffff\1\123\2\uffff\1\141\1\uffff\1"+
            "\124\1\uffff\1\125\3\uffff\1\125\1\uffff\1\130\1\131\25\uffff"+
            "\1\121\32\uffff\1\122\1\uffff\1\135\5\uffff\1\120\1\127\1\140"+
            "\1\132\1\133\1\134\1\136\1\137",
            "\1\143\76\uffff\1\142",
            "\1\145\76\uffff\1\144",
            "\1\147\76\uffff\1\146",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00c2",
            "\1\u00c4\76\uffff\1\u00c3",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "165:7: ({...}? => ( printExpr )? | ( simpleStatement )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_12 = input.LA(1);

                         
                        int index4_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_13 = input.LA(1);

                         
                        int index4_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_14 = input.LA(1);

                         
                        int index4_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_15 = input.LA(1);

                         
                        int index4_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_15);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_18 = input.LA(1);

                         
                        int index4_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_26 = input.LA(1);

                         
                        int index4_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_26);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA4_49 = input.LA(1);

                         
                        int index4_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_49);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA4_50 = input.LA(1);

                         
                        int index4_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_50);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA4_51 = input.LA(1);

                         
                        int index4_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_51);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA4_52 = input.LA(1);

                         
                        int index4_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_52);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA4_53 = input.LA(1);

                         
                        int index4_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_53);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA4_54 = input.LA(1);

                         
                        int index4_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_54);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA4_55 = input.LA(1);

                         
                        int index4_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_55);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA4_56 = input.LA(1);

                         
                        int index4_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_56);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA4_57 = input.LA(1);

                         
                        int index4_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_57);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA4_58 = input.LA(1);

                         
                        int index4_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_58);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA4_59 = input.LA(1);

                         
                        int index4_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_59);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA4_60 = input.LA(1);

                         
                        int index4_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_60);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA4_61 = input.LA(1);

                         
                        int index4_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_61);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA4_62 = input.LA(1);

                         
                        int index4_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_62);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA4_63 = input.LA(1);

                         
                        int index4_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_63);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA4_64 = input.LA(1);

                         
                        int index4_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_64);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA4_65 = input.LA(1);

                         
                        int index4_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_65);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA4_66 = input.LA(1);

                         
                        int index4_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_66);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA4_67 = input.LA(1);

                         
                        int index4_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_67);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA4_68 = input.LA(1);

                         
                        int index4_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_68);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA4_69 = input.LA(1);

                         
                        int index4_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_69);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA4_70 = input.LA(1);

                         
                        int index4_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_70);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA4_71 = input.LA(1);

                         
                        int index4_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_71);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA4_72 = input.LA(1);

                         
                        int index4_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_72);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA4_73 = input.LA(1);

                         
                        int index4_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_73);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA4_74 = input.LA(1);

                         
                        int index4_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_74);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA4_75 = input.LA(1);

                         
                        int index4_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_75);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA4_76 = input.LA(1);

                         
                        int index4_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_76);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA4_77 = input.LA(1);

                         
                        int index4_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_77);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA4_78 = input.LA(1);

                         
                        int index4_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_78);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA4_79 = input.LA(1);

                         
                        int index4_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_79);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA4_80 = input.LA(1);

                         
                        int index4_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_80);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA4_81 = input.LA(1);

                         
                        int index4_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_81);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA4_82 = input.LA(1);

                         
                        int index4_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_82);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA4_83 = input.LA(1);

                         
                        int index4_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_83);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA4_84 = input.LA(1);

                         
                        int index4_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_84);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA4_85 = input.LA(1);

                         
                        int index4_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_85);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA4_86 = input.LA(1);

                         
                        int index4_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_86);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA4_87 = input.LA(1);

                         
                        int index4_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_87);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA4_88 = input.LA(1);

                         
                        int index4_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_88);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA4_89 = input.LA(1);

                         
                        int index4_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_89);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA4_90 = input.LA(1);

                         
                        int index4_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_90);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA4_91 = input.LA(1);

                         
                        int index4_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_91);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA4_92 = input.LA(1);

                         
                        int index4_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_92);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA4_93 = input.LA(1);

                         
                        int index4_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_93);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA4_94 = input.LA(1);

                         
                        int index4_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_94);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA4_95 = input.LA(1);

                         
                        int index4_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_95);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA4_96 = input.LA(1);

                         
                        int index4_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_96);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA4_97 = input.LA(1);

                         
                        int index4_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_97);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA4_98 = input.LA(1);

                         
                        int index4_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_98);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA4_99 = input.LA(1);

                         
                        int index4_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_99);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA4_100 = input.LA(1);

                         
                        int index4_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_100);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA4_101 = input.LA(1);

                         
                        int index4_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_101);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA4_102 = input.LA(1);

                         
                        int index4_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_102);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA4_103 = input.LA(1);

                         
                        int index4_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_103);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA4_194 = input.LA(1);

                         
                        int index4_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_194);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA4_195 = input.LA(1);

                         
                        int index4_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_195);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA4_196 = input.LA(1);

                         
                        int index4_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index4_196);
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
        "\23\uffff";
    static final String DFA2_eofS =
        "\23\uffff";
    static final String DFA2_minS =
        "\1\6\22\uffff";
    static final String DFA2_maxS =
        "\1\141\22\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA2_specialS =
        "\23\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\31\uffff\1\22\1\1"+
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
            return "165:79: ( printExpr )?";
        }
    }
    static final String DFA3_eotS =
        "\32\uffff";
    static final String DFA3_eofS =
        "\32\uffff";
    static final String DFA3_minS =
        "\1\6\31\uffff";
    static final String DFA3_maxS =
        "\1\141\31\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\27\uffff\1\2";
    static final String DFA3_specialS =
        "\32\uffff}>";
    static final String[] DFA3_transitionS = {
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
            return "165:92: ( simpleStatement )?";
        }
    }
    static final String DFA6_eotS =
        "\46\uffff";
    static final String DFA6_eofS =
        "\46\uffff";
    static final String DFA6_minS =
        "\1\6\45\uffff";
    static final String DFA6_maxS =
        "\1\141\45\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\2\1\1\43\uffff";
    static final String DFA6_specialS =
        "\46\uffff}>";
    static final String[] DFA6_transitionS = {
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 180:16: (stmts= statement )*";
        }
    }
    static final String DFA26_eotS =
        "\121\uffff";
    static final String DFA26_eofS =
        "\1\3\120\uffff";
    static final String DFA26_minS =
        "\1\6\2\0\116\uffff";
    static final String DFA26_maxS =
        "\1\141\2\0\116\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\1\2\50\uffff\1\1\44\uffff";
    static final String DFA26_specialS =
        "\1\uffff\1\0\1\1\116\uffff}>";
    static final String[] DFA26_transitionS = {
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "243:58: ( conditional )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Php()) ) {s = 44;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Php()) ) {s = 44;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\23\uffff";
    static final String DFA27_eofS =
        "\23\uffff";
    static final String DFA27_minS =
        "\1\6\22\uffff";
    static final String DFA27_maxS =
        "\1\141\22\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA27_specialS =
        "\23\uffff}>";
    static final String[] DFA27_transitionS = {
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
            return "247:31: (whileCondition= expression )?";
        }
    }
    static final String DFA33_eotS =
        "\31\uffff";
    static final String DFA33_eofS =
        "\31\uffff";
    static final String DFA33_minS =
        "\1\6\30\uffff";
    static final String DFA33_maxS =
        "\1\141\30\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\20\uffff";
    static final String DFA33_specialS =
        "\31\uffff}>";
    static final String[] DFA33_transitionS = {
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

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "253:1: simpleStatement : ( Echo commaList | Global name ( ',' name )* | Static variable Equals atom | Break ( Integer )? | Continue ( Integer )? | Return ( expression )? | RequireOperator expression | expression );";
        }
    }
    static final String DFA32_eotS =
        "\25\uffff";
    static final String DFA32_eofS =
        "\1\22\24\uffff";
    static final String DFA32_minS =
        "\1\4\24\uffff";
    static final String DFA32_maxS =
        "\1\141\24\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\20\uffff\1\2\2\uffff";
    static final String DFA32_specialS =
        "\25\uffff}>";
    static final String[] DFA32_transitionS = {
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
            return "260:15: ( expression )?";
        }
    }
    static final String DFA34_eotS =
        "\121\uffff";
    static final String DFA34_eofS =
        "\1\3\120\uffff";
    static final String DFA34_minS =
        "\1\6\2\0\116\uffff";
    static final String DFA34_maxS =
        "\1\141\2\0\116\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\1\2\50\uffff\1\1\44\uffff";
    static final String DFA34_specialS =
        "\1\uffff\1\0\1\1\116\uffff}>";
    static final String[] DFA34_transitionS = {
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
            return "267:62: ( conditional )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_Php()) ) {s = 44;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_Php()) ) {s = 44;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\23\uffff";
    static final String DFA36_eofS =
        "\23\uffff";
    static final String DFA36_minS =
        "\1\4\22\uffff";
    static final String DFA36_maxS =
        "\1\141\22\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA36_specialS =
        "\23\uffff}>";
    static final String[] DFA36_transitionS = {
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
            return "272:7: ( commaList )?";
        }
    }
    static final String DFA37_eotS =
        "\23\uffff";
    static final String DFA37_eofS =
        "\23\uffff";
    static final String DFA37_minS =
        "\1\4\22\uffff";
    static final String DFA37_maxS =
        "\1\141\22\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA37_specialS =
        "\23\uffff}>";
    static final String[] DFA37_transitionS = {
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
            return "276:7: ( commaList )?";
        }
    }
    static final String DFA38_eotS =
        "\23\uffff";
    static final String DFA38_eofS =
        "\23\uffff";
    static final String DFA38_minS =
        "\1\6\22\uffff";
    static final String DFA38_maxS =
        "\1\141\22\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA38_specialS =
        "\23\uffff}>";
    static final String[] DFA38_transitionS = {
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
            return "280:7: ( commaList )?";
        }
    }
    static final String DFA40_eotS =
        "\50\uffff";
    static final String DFA40_eofS =
        "\1\1\47\uffff";
    static final String DFA40_minS =
        "\1\6\47\uffff";
    static final String DFA40_maxS =
        "\1\141\47\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\43\uffff";
    static final String DFA40_specialS =
        "\50\uffff}>";
    static final String[] DFA40_transitionS = {
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
            return "()* loopback of 288:29: ( statement )*";
        }
    }
    static final String DFA41_eotS =
        "\46\uffff";
    static final String DFA41_eofS =
        "\46\uffff";
    static final String DFA41_minS =
        "\1\6\45\uffff";
    static final String DFA41_maxS =
        "\1\141\45\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\2\1\1\43\uffff";
    static final String DFA41_specialS =
        "\46\uffff}>";
    static final String[] DFA41_transitionS = {
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
            return "()* loopback of 292:22: ( statement )*";
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
            return "()* loopback of 322:22: ( Or weakLogicalXor )*";
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
                        if ( (synpred68_Php()) ) {s = 29;}

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
        "\36\uffff";
    static final String DFA48_eofS =
        "\1\1\35\uffff";
    static final String DFA48_minS =
        "\1\4\10\uffff\1\0\24\uffff";
    static final String DFA48_maxS =
        "\1\121\10\uffff\1\0\24\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\2\33\uffff\1\1";
    static final String DFA48_specialS =
        "\11\uffff\1\0\24\uffff}>";
    static final String[] DFA48_transitionS = {
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
            return "()* loopback of 326:22: ( Xor weakLogicalAnd )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_9 = input.LA(1);

                         
                        int index48_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Php()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index48_9);
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
        "\36\uffff";
    static final String DFA49_eofS =
        "\1\1\35\uffff";
    static final String DFA49_minS =
        "\1\4\10\uffff\1\0\24\uffff";
    static final String DFA49_maxS =
        "\1\121\10\uffff\1\0\24\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\2\33\uffff\1\1";
    static final String DFA49_specialS =
        "\11\uffff\1\0\24\uffff}>";
    static final String[] DFA49_transitionS = {
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
            return "()* loopback of 330:18: ( And assignment )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_9 = input.LA(1);

                         
                        int index49_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_Php()) ) {s = 29;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index49_9);
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
        "\60\uffff";
    static final String DFA50_eofS =
        "\2\uffff\1\4\55\uffff";
    static final String DFA50_minS =
        "\1\6\1\uffff\1\4\1\23\16\uffff\1\0\13\uffff\2\0\16\uffff\2\0";
    static final String DFA50_maxS =
        "\1\141\1\uffff\1\133\1\122\16\uffff\1\0\13\uffff\2\0\16\uffff\2"+
        "\0";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\53\uffff";
    static final String DFA50_specialS =
        "\22\uffff\1\0\13\uffff\1\1\1\2\16\uffff\1\3\1\4}>";
    static final String[] DFA50_transitionS = {
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
            return "333:1: assignment : ( listVariables ( ( Equals | AsignmentOperator ) assignment ) | ternary );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_18 = input.LA(1);

                         
                        int index50_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index50_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_30 = input.LA(1);

                         
                        int index50_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index50_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_31 = input.LA(1);

                         
                        int index50_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index50_31);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_46 = input.LA(1);

                         
                        int index50_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index50_46);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_47 = input.LA(1);

                         
                        int index50_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_Php()) ) {s = 1;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index50_47);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\u00ea\uffff";
    static final String DFA53_eofS =
        "\5\uffff\1\121\3\uffff\6\121\u00db\uffff";
    static final String DFA53_minS =
        "\2\6\1\23\1\6\1\23\1\4\3\23\6\4\1\6\1\23\77\0\14\uffff\21\0\14\uffff"+
        "\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14"+
        "\uffff\3\0";
    static final String DFA53_maxS =
        "\4\141\1\122\1\133\3\122\6\131\1\6\1\122\77\0\14\uffff\21\0\14\uffff"+
        "\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14\uffff\12\0\14"+
        "\uffff\3\0";
    static final String DFA53_acceptS =
        "\120\uffff\1\1\1\2\u0098\uffff";
    static final String DFA53_specialS =
        "\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
        "\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14"+
        "\uffff\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110"+
        "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\14\uffff\1\120\1\121"+
        "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\14\uffff\1\132"+
        "\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\14\uffff"+
        "\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\14"+
        "\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167"+
        "\14\uffff\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080"+
        "\1\u0081\14\uffff\1\u0082\1\u0083\1\u0084}>";
    static final String[] DFA53_transitionS = {
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
            "\2\121\1\105\1\121\1\103\1\121\2\uffff\1\121\1\117\1\116\1"+
            "\102\1\104\1\uffff\1\120\1\uffff\1\121\1\110\1\114\1\115\1\uffff"+
            "\2\110\3\107\25\uffff\3\121\1\106\32\uffff\1\121\5\uffff\1\113"+
            "\1\112\1\111\1\uffff\1\134",
            "\1\135\76\uffff\1\136",
            "\1\140\76\uffff\1\137",
            "\1\142\76\uffff\1\141",
            "\2\121\1\uffff\1\121\1\uffff\1\121\2\uffff\1\121\1\154\1\153"+
            "\3\uffff\1\120\1\uffff\1\121\1\145\1\151\1\152\1\uffff\2\145"+
            "\3\144\25\uffff\3\121\1\143\32\uffff\1\121\5\uffff\1\150\1\147"+
            "\1\146",
            "\2\121\1\uffff\1\121\1\uffff\1\121\2\uffff\1\121\1\u0082\1"+
            "\u0081\3\uffff\1\120\1\uffff\1\121\1\173\1\177\1\u0080\1\uffff"+
            "\2\173\3\172\25\uffff\3\121\1\171\32\uffff\1\121\5\uffff\1\176"+
            "\1\175\1\174",
            "\2\121\1\uffff\1\121\1\uffff\1\121\2\uffff\1\121\1\u0098\1"+
            "\u0097\3\uffff\1\120\1\uffff\1\121\1\u0091\1\u0095\1\u0096\1"+
            "\uffff\2\u0091\3\u0090\25\uffff\3\121\1\u008f\32\uffff\1\121"+
            "\5\uffff\1\u0094\1\u0093\1\u0092",
            "\2\121\1\uffff\1\121\1\uffff\1\121\2\uffff\1\121\1\u00ae\1"+
            "\u00ad\3\uffff\1\120\1\uffff\1\121\1\u00a7\1\u00ab\1\u00ac\1"+
            "\uffff\2\u00a7\3\u00a6\25\uffff\3\121\1\u00a5\32\uffff\1\121"+
            "\5\uffff\1\u00aa\1\u00a9\1\u00a8",
            "\2\121\1\uffff\1\121\1\uffff\1\121\2\uffff\1\121\1\u00c4\1"+
            "\u00c3\3\uffff\1\120\1\uffff\1\121\1\u00bd\1\u00c1\1\u00c2\1"+
            "\uffff\2\u00bd\3\u00bc\25\uffff\3\121\1\u00bb\32\uffff\1\121"+
            "\5\uffff\1\u00c0\1\u00bf\1\u00be",
            "\2\121\1\uffff\1\121\1\uffff\1\121\2\uffff\1\121\1\u00da\1"+
            "\u00d9\3\uffff\1\120\1\uffff\1\121\1\u00d3\1\u00d7\1\u00d8\1"+
            "\uffff\2\u00d3\3\u00d2\25\uffff\3\121\1\u00d1\32\uffff\1\121"+
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
            return "343:1: ternary : ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_17 = input.LA(1);

                         
                        int index53_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_17);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_18 = input.LA(1);

                         
                        int index53_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_19 = input.LA(1);

                         
                        int index53_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA53_20 = input.LA(1);

                         
                        int index53_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_20);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA53_21 = input.LA(1);

                         
                        int index53_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA53_22 = input.LA(1);

                         
                        int index53_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA53_23 = input.LA(1);

                         
                        int index53_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA53_24 = input.LA(1);

                         
                        int index53_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA53_25 = input.LA(1);

                         
                        int index53_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA53_26 = input.LA(1);

                         
                        int index53_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_26);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA53_27 = input.LA(1);

                         
                        int index53_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_27);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA53_28 = input.LA(1);

                         
                        int index53_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_28);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA53_29 = input.LA(1);

                         
                        int index53_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_29);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA53_30 = input.LA(1);

                         
                        int index53_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_30);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA53_31 = input.LA(1);

                         
                        int index53_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_31);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA53_32 = input.LA(1);

                         
                        int index53_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_32);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA53_33 = input.LA(1);

                         
                        int index53_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_33);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA53_34 = input.LA(1);

                         
                        int index53_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_34);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA53_35 = input.LA(1);

                         
                        int index53_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_35);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA53_36 = input.LA(1);

                         
                        int index53_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_36);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA53_37 = input.LA(1);

                         
                        int index53_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_37);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA53_38 = input.LA(1);

                         
                        int index53_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_38);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA53_39 = input.LA(1);

                         
                        int index53_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_39);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA53_40 = input.LA(1);

                         
                        int index53_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_40);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA53_41 = input.LA(1);

                         
                        int index53_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_41);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA53_42 = input.LA(1);

                         
                        int index53_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_42);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA53_43 = input.LA(1);

                         
                        int index53_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_43);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA53_44 = input.LA(1);

                         
                        int index53_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_44);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA53_45 = input.LA(1);

                         
                        int index53_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_45);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA53_46 = input.LA(1);

                         
                        int index53_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_46);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA53_47 = input.LA(1);

                         
                        int index53_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_47);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA53_48 = input.LA(1);

                         
                        int index53_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_48);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA53_49 = input.LA(1);

                         
                        int index53_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_49);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA53_50 = input.LA(1);

                         
                        int index53_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_50);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA53_51 = input.LA(1);

                         
                        int index53_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_51);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA53_52 = input.LA(1);

                         
                        int index53_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_52);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA53_53 = input.LA(1);

                         
                        int index53_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_53);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA53_54 = input.LA(1);

                         
                        int index53_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_54);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA53_55 = input.LA(1);

                         
                        int index53_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_55);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA53_56 = input.LA(1);

                         
                        int index53_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_56);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA53_57 = input.LA(1);

                         
                        int index53_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_57);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA53_58 = input.LA(1);

                         
                        int index53_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_58);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA53_59 = input.LA(1);

                         
                        int index53_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_59);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA53_60 = input.LA(1);

                         
                        int index53_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_60);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA53_61 = input.LA(1);

                         
                        int index53_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_61);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA53_62 = input.LA(1);

                         
                        int index53_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_62);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA53_63 = input.LA(1);

                         
                        int index53_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_63);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA53_64 = input.LA(1);

                         
                        int index53_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_64);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA53_65 = input.LA(1);

                         
                        int index53_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_65);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA53_66 = input.LA(1);

                         
                        int index53_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_66);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA53_67 = input.LA(1);

                         
                        int index53_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_67);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA53_68 = input.LA(1);

                         
                        int index53_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_68);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA53_69 = input.LA(1);

                         
                        int index53_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_69);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA53_70 = input.LA(1);

                         
                        int index53_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_70);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA53_71 = input.LA(1);

                         
                        int index53_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_71);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA53_72 = input.LA(1);

                         
                        int index53_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_72);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA53_73 = input.LA(1);

                         
                        int index53_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_73);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA53_74 = input.LA(1);

                         
                        int index53_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_74);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA53_75 = input.LA(1);

                         
                        int index53_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_75);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA53_76 = input.LA(1);

                         
                        int index53_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_76);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA53_77 = input.LA(1);

                         
                        int index53_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_77);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA53_78 = input.LA(1);

                         
                        int index53_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_78);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA53_79 = input.LA(1);

                         
                        int index53_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_79);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA53_92 = input.LA(1);

                         
                        int index53_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_92);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA53_93 = input.LA(1);

                         
                        int index53_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_93);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA53_94 = input.LA(1);

                         
                        int index53_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_94);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA53_95 = input.LA(1);

                         
                        int index53_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_95);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA53_96 = input.LA(1);

                         
                        int index53_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_96);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA53_97 = input.LA(1);

                         
                        int index53_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_97);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA53_98 = input.LA(1);

                         
                        int index53_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_98);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA53_99 = input.LA(1);

                         
                        int index53_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_99);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA53_100 = input.LA(1);

                         
                        int index53_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_100);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA53_101 = input.LA(1);

                         
                        int index53_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_101);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA53_102 = input.LA(1);

                         
                        int index53_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_102);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA53_103 = input.LA(1);

                         
                        int index53_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_103);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA53_104 = input.LA(1);

                         
                        int index53_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_104);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA53_105 = input.LA(1);

                         
                        int index53_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_105);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA53_106 = input.LA(1);

                         
                        int index53_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_106);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA53_107 = input.LA(1);

                         
                        int index53_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_107);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA53_108 = input.LA(1);

                         
                        int index53_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_108);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA53_121 = input.LA(1);

                         
                        int index53_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_121);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA53_122 = input.LA(1);

                         
                        int index53_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_122);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA53_123 = input.LA(1);

                         
                        int index53_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_123);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA53_124 = input.LA(1);

                         
                        int index53_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_124);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA53_125 = input.LA(1);

                         
                        int index53_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_125);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA53_126 = input.LA(1);

                         
                        int index53_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_126);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA53_127 = input.LA(1);

                         
                        int index53_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_127);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA53_128 = input.LA(1);

                         
                        int index53_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_128);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA53_129 = input.LA(1);

                         
                        int index53_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_129);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA53_130 = input.LA(1);

                         
                        int index53_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_130);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA53_143 = input.LA(1);

                         
                        int index53_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_143);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA53_144 = input.LA(1);

                         
                        int index53_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_144);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA53_145 = input.LA(1);

                         
                        int index53_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_145);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA53_146 = input.LA(1);

                         
                        int index53_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_146);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA53_147 = input.LA(1);

                         
                        int index53_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_147);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA53_148 = input.LA(1);

                         
                        int index53_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_148);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA53_149 = input.LA(1);

                         
                        int index53_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_149);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA53_150 = input.LA(1);

                         
                        int index53_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_150);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA53_151 = input.LA(1);

                         
                        int index53_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_151);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA53_152 = input.LA(1);

                         
                        int index53_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_152);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA53_165 = input.LA(1);

                         
                        int index53_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_165);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA53_166 = input.LA(1);

                         
                        int index53_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_166);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA53_167 = input.LA(1);

                         
                        int index53_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_167);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA53_168 = input.LA(1);

                         
                        int index53_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_168);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA53_169 = input.LA(1);

                         
                        int index53_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_169);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA53_170 = input.LA(1);

                         
                        int index53_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_170);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA53_171 = input.LA(1);

                         
                        int index53_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_171);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA53_172 = input.LA(1);

                         
                        int index53_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_172);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA53_173 = input.LA(1);

                         
                        int index53_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_173);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA53_174 = input.LA(1);

                         
                        int index53_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_174);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA53_187 = input.LA(1);

                         
                        int index53_187 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_187);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA53_188 = input.LA(1);

                         
                        int index53_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_188);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA53_189 = input.LA(1);

                         
                        int index53_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_189);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA53_190 = input.LA(1);

                         
                        int index53_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_190);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA53_191 = input.LA(1);

                         
                        int index53_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_191);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA53_192 = input.LA(1);

                         
                        int index53_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_192);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA53_193 = input.LA(1);

                         
                        int index53_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_193);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA53_194 = input.LA(1);

                         
                        int index53_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_194);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA53_195 = input.LA(1);

                         
                        int index53_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_195);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA53_196 = input.LA(1);

                         
                        int index53_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_196);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA53_209 = input.LA(1);

                         
                        int index53_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_209);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA53_210 = input.LA(1);

                         
                        int index53_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_210);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA53_211 = input.LA(1);

                         
                        int index53_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_211);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA53_212 = input.LA(1);

                         
                        int index53_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_212);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA53_213 = input.LA(1);

                         
                        int index53_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_213);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA53_214 = input.LA(1);

                         
                        int index53_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_214);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA53_215 = input.LA(1);

                         
                        int index53_215 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_215);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA53_216 = input.LA(1);

                         
                        int index53_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_216);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA53_217 = input.LA(1);

                         
                        int index53_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_217);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA53_218 = input.LA(1);

                         
                        int index53_218 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_218);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA53_231 = input.LA(1);

                         
                        int index53_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_231);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA53_232 = input.LA(1);

                         
                        int index53_232 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_232);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA53_233 = input.LA(1);

                         
                        int index53_233 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_Php()) ) {s = 80;}

                        else if ( (true) ) {s = 81;}

                         
                        input.seek(index53_233);
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
        "\16\uffff";
    static final String DFA54_eofS =
        "\1\1\15\uffff";
    static final String DFA54_minS =
        "\1\4\15\uffff";
    static final String DFA54_maxS =
        "\1\121\15\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA54_specialS =
        "\16\uffff}>";
    static final String[] DFA54_transitionS = {
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
            return "()* loopback of 349:18: ( LogicalOr logicalAnd )*";
        }
    }
    static final String DFA55_eotS =
        "\17\uffff";
    static final String DFA55_eofS =
        "\1\1\16\uffff";
    static final String DFA55_minS =
        "\1\4\16\uffff";
    static final String DFA55_maxS =
        "\1\121\16\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\2\14\uffff\1\1";
    static final String DFA55_specialS =
        "\17\uffff}>";
    static final String[] DFA55_transitionS = {
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
            return "()* loopback of 353:17: ( LogicalAnd bitwiseOr )*";
        }
    }
    static final String DFA56_eotS =
        "\20\uffff";
    static final String DFA56_eofS =
        "\1\1\17\uffff";
    static final String DFA56_minS =
        "\1\4\17\uffff";
    static final String DFA56_maxS =
        "\1\121\17\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\2\15\uffff\1\1";
    static final String DFA56_specialS =
        "\20\uffff}>";
    static final String[] DFA56_transitionS = {
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
            return "()* loopback of 357:18: ( Pipe bitWiseAnd )*";
        }
    }
    static final String DFA57_eotS =
        "\21\uffff";
    static final String DFA57_eofS =
        "\1\1\20\uffff";
    static final String DFA57_minS =
        "\1\4\20\uffff";
    static final String DFA57_maxS =
        "\1\121\20\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\1\2\16\uffff\1\1";
    static final String DFA57_specialS =
        "\21\uffff}>";
    static final String[] DFA57_transitionS = {
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
            return "()* loopback of 361:21: ( Ampersand equalityCheck )*";
        }
    }
    static final String DFA58_eotS =
        "\22\uffff";
    static final String DFA58_eofS =
        "\1\2\21\uffff";
    static final String DFA58_minS =
        "\1\4\21\uffff";
    static final String DFA58_maxS =
        "\1\127\21\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\1\1\2\17\uffff";
    static final String DFA58_specialS =
        "\22\uffff}>";
    static final String[] DFA58_transitionS = {
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
            return "365:24: ( EqualityOperator comparisionCheck )?";
        }
    }
    static final String DFA59_eotS =
        "\23\uffff";
    static final String DFA59_eofS =
        "\1\2\22\uffff";
    static final String DFA59_minS =
        "\1\4\22\uffff";
    static final String DFA59_maxS =
        "\1\130\22\uffff";
    static final String DFA59_acceptS =
        "\1\uffff\1\1\1\2\20\uffff";
    static final String DFA59_specialS =
        "\23\uffff}>";
    static final String[] DFA59_transitionS = {
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
            return "369:20: ( ComparisionOperator bitWiseShift )?";
        }
    }
    static final String DFA60_eotS =
        "\24\uffff";
    static final String DFA60_eofS =
        "\1\1\23\uffff";
    static final String DFA60_minS =
        "\1\4\23\uffff";
    static final String DFA60_maxS =
        "\1\131\23\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\1\2\21\uffff\1\1";
    static final String DFA60_specialS =
        "\24\uffff}>";
    static final String[] DFA60_transitionS = {
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
            return "()* loopback of 373:16: ( ShiftOperator addition )*";
        }
    }
    static final String DFA61_eotS =
        "\25\uffff";
    static final String DFA61_eofS =
        "\1\1\24\uffff";
    static final String DFA61_minS =
        "\1\4\24\uffff";
    static final String DFA61_maxS =
        "\1\131\24\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\2\22\uffff\1\1";
    static final String DFA61_specialS =
        "\25\uffff}>";
    static final String[] DFA61_transitionS = {
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
            return "()* loopback of 377:22: ( ( Plus | Minus | Dot ) multiplication )*";
        }
    }
    static final String DFA62_eotS =
        "\26\uffff";
    static final String DFA62_eofS =
        "\1\1\25\uffff";
    static final String DFA62_minS =
        "\1\4\25\uffff";
    static final String DFA62_maxS =
        "\1\131\25\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\2\23\uffff\1\1";
    static final String DFA62_specialS =
        "\26\uffff}>";
    static final String[] DFA62_transitionS = {
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
            return "()* loopback of 381:18: ( ( Asterisk | Forwardslash | Percent ) logicalNot )*";
        }
    }
    static final String DFA63_eotS =
        "\21\uffff";
    static final String DFA63_eofS =
        "\21\uffff";
    static final String DFA63_minS =
        "\1\6\20\uffff";
    static final String DFA63_maxS =
        "\1\141\20\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\1\2\16\uffff";
    static final String DFA63_specialS =
        "\21\uffff}>";
    static final String[] DFA63_transitionS = {
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
            return "384:1: logicalNot : ( Bang logicalNot | instanceOf );";
        }
    }
    static final String DFA64_eotS =
        "\27\uffff";
    static final String DFA64_eofS =
        "\1\2\26\uffff";
    static final String DFA64_minS =
        "\1\4\26\uffff";
    static final String DFA64_maxS =
        "\1\131\26\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\1\2\24\uffff";
    static final String DFA64_specialS =
        "\27\uffff}>";
    static final String[] DFA64_transitionS = {
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
            return "390:20: ( Instanceof negateOrCast )?";
        }
    }
    static final String DFA65_eotS =
        "\42\uffff";
    static final String DFA65_eofS =
        "\42\uffff";
    static final String DFA65_minS =
        "\1\6\1\uffff\1\6\37\uffff";
    static final String DFA65_maxS =
        "\1\141\1\uffff\1\141\37\uffff";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\14\uffff\1\2\1\3\20\uffff";
    static final String DFA65_specialS =
        "\42\uffff}>";
    static final String[] DFA65_transitionS = {
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
            return "393:1: negateOrCast : ( ( Tilde | Minus | SuppressWarnings ) increment | OpenRoundBracket PrimitiveType CloseRoundBracket increment -> ^( Cast PrimitiveType increment ) | OpenRoundBracket weakLogicalAnd CloseRoundBracket | increment );";
        }
    }
    static final String DFA66_eotS =
        "\53\uffff";
    static final String DFA66_eofS =
        "\2\uffff\1\4\50\uffff";
    static final String DFA66_minS =
        "\1\23\1\uffff\1\4\1\23\12\uffff\3\0\30\uffff\2\0";
    static final String DFA66_maxS =
        "\1\141\1\uffff\1\133\1\122\12\uffff\3\0\30\uffff\2\0";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\15\uffff\1\2\30\uffff";
    static final String DFA66_specialS =
        "\16\uffff\1\0\1\1\1\2\30\uffff\1\3\1\4}>";
    static final String[] DFA66_transitionS = {
            "\1\3\2\uffff\1\4\11\uffff\2\4\60\uffff\1\2\1\uffff\1\4\6\uffff"+
            "\1\1\6\4",
            "",
            "\4\4\1\17\1\4\2\uffff\3\4\1\16\1\20\1\uffff\1\4\1\uffff\4\4"+
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
            return "400:1: increment : ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_14 = input.LA(1);

                         
                        int index66_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index66_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_15 = input.LA(1);

                         
                        int index66_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index66_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_16 = input.LA(1);

                         
                        int index66_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index66_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA66_41 = input.LA(1);

                         
                        int index66_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index66_41);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA66_42 = input.LA(1);

                         
                        int index66_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_Php()) ) {s = 18;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index66_42);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\15\uffff";
    static final String DFA67_eofS =
        "\15\uffff";
    static final String DFA67_minS =
        "\1\23\14\uffff";
    static final String DFA67_maxS =
        "\1\141\14\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\1\1\2\1\3\11\uffff";
    static final String DFA67_specialS =
        "\15\uffff}>";
    static final String[] DFA67_transitionS = {
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
            return "406:1: newOrClone : ( New nameOrFunctionCall | Clone name | atomOrReference );";
        }
    }
    static final String DFA68_eotS =
        "\13\uffff";
    static final String DFA68_eofS =
        "\13\uffff";
    static final String DFA68_minS =
        "\1\23\12\uffff";
    static final String DFA68_maxS =
        "\1\141\12\uffff";
    static final String DFA68_acceptS =
        "\1\uffff\1\1\6\uffff\1\2\2\uffff";
    static final String DFA68_specialS =
        "\13\uffff}>";
    static final String[] DFA68_transitionS = {
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
            return "412:1: atomOrReference : ( atom | reference );";
        }
    }
    static final String DFA70_eotS =
        "\23\uffff";
    static final String DFA70_eofS =
        "\23\uffff";
    static final String DFA70_minS =
        "\1\6\22\uffff";
    static final String DFA70_maxS =
        "\1\141\22\uffff";
    static final String DFA70_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA70_specialS =
        "\23\uffff}>";
    static final String[] DFA70_transitionS = {
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
            return "418:30: ( arrayEntry ( Comma arrayEntry )* )?";
        }
    }
    static final String DFA71_eotS =
        "\u00d1\uffff";
    static final String DFA71_eofS =
        "\2\uffff\1\47\7\uffff\6\47\u00c1\uffff";
    static final String DFA71_minS =
        "\2\6\1\5\1\23\1\6\1\23\1\6\3\23\6\5\1\6\1\23\25\0\4\uffff\104\0"+
        "\3\uffff\1\0\1\uffff\15\0\4\uffff\17\0\4\uffff\15\0\3\uffff\1\0"+
        "\1\uffff\16\0\4\uffff\16\0\4\uffff\3\0";
    static final String DFA71_maxS =
        "\1\141\1\6\1\133\1\122\3\141\3\122\6\131\1\6\1\122\25\0\4\uffff"+
        "\104\0\3\uffff\1\0\1\uffff\15\0\4\uffff\17\0\4\uffff\15\0\3\uffff"+
        "\1\0\1\uffff\16\0\4\uffff\16\0\4\uffff\3\0";
    static final String DFA71_acceptS =
        "\47\uffff\1\2\2\uffff\1\1\u00a6\uffff";
    static final String DFA71_specialS =
        "\22\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\4\uffff\1\25\1\26\1"+
        "\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
        "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
        "\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75"+
        "\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110"+
        "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123"+
        "\1\124\1\125\1\126\1\127\1\130\3\uffff\1\131\1\uffff\1\132\1\133"+
        "\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146"+
        "\4\uffff\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1"+
        "\160\1\161\1\162\1\163\1\164\1\165\4\uffff\1\166\1\167\1\170\1\171"+
        "\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\3\uffff"+
        "\1\u0083\1\uffff\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089"+
        "\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091"+
        "\4\uffff\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
        "\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\4\uffff"+
        "\1\u00a0\1\u00a1\1\u00a2}>";
    static final String[] DFA71_transitionS = {
            "\1\6\12\uffff\1\5\1\uffff\1\3\2\uffff\1\21\1\uffff\1\4\1\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\10\1\11\25\uffff\1\1\32\uffff\1\2"+
            "\1\uffff\1\15\6\uffff\1\7\1\20\1\12\1\13\1\14\1\16\1\17",
            "\1\22",
            "\1\47\1\27\1\47\1\25\3\uffff\1\52\1\42\1\41\1\23\1\26\1\uffff"+
            "\1\43\2\uffff\1\33\1\37\1\40\1\uffff\2\33\3\32\1\uffff\1\24"+
            "\23\uffff\1\44\1\46\1\45\1\31\37\uffff\1\24\1\36\1\35\1\34\1"+
            "\uffff\1\30",
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
            "\1\47\1\uffff\1\47\4\uffff\1\52\1\153\1\152\3\uffff\1\162\2"+
            "\uffff\1\144\1\150\1\151\1\uffff\2\144\3\143\25\uffff\1\154"+
            "\1\156\1\155\1\142\40\uffff\1\147\1\146\1\145",
            "\1\47\1\uffff\1\47\4\uffff\1\52\1\175\1\174\3\uffff\1\u0085"+
            "\2\uffff\1\166\1\172\1\173\1\uffff\2\166\3\165\25\uffff\1\176"+
            "\1\u0080\1\177\1\164\40\uffff\1\171\1\170\1\167",
            "\1\47\1\uffff\1\47\4\uffff\1\52\1\u008f\1\u008e\3\uffff\1\u0090"+
            "\2\uffff\1\u0088\1\u008c\1\u008d\1\uffff\2\u0088\3\u0087\25"+
            "\uffff\1\u0091\1\u0093\1\u0092\1\u0086\40\uffff\1\u008b\1\u008a"+
            "\1\u0089",
            "\1\47\1\uffff\1\47\4\uffff\1\52\1\u00a1\1\u00a0\3\uffff\1\u00a8"+
            "\2\uffff\1\u009a\1\u009e\1\u009f\1\uffff\2\u009a\3\u0099\25"+
            "\uffff\1\u00a2\1\u00a4\1\u00a3\1\u0098\40\uffff\1\u009d\1\u009c"+
            "\1\u009b",
            "\1\47\1\uffff\1\47\4\uffff\1\52\1\u00b3\1\u00b2\3\uffff\1\u00b4"+
            "\2\uffff\1\u00ac\1\u00b0\1\u00b1\1\uffff\2\u00ac\3\u00ab\25"+
            "\uffff\1\u00b5\1\u00b7\1\u00b6\1\u00aa\40\uffff\1\u00af\1\u00ae"+
            "\1\u00ad",
            "\1\47\1\uffff\1\47\4\uffff\1\52\1\u00c5\1\u00c4\3\uffff\1\u00c6"+
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
            return "422:7: ( keyValuePair | expression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_18 = input.LA(1);

                         
                        int index71_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_19 = input.LA(1);

                         
                        int index71_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_20 = input.LA(1);

                         
                        int index71_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_20);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_21 = input.LA(1);

                         
                        int index71_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_21);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_22 = input.LA(1);

                         
                        int index71_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_22);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_23 = input.LA(1);

                         
                        int index71_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_23);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_24 = input.LA(1);

                         
                        int index71_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_24);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA71_25 = input.LA(1);

                         
                        int index71_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_25);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA71_26 = input.LA(1);

                         
                        int index71_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_26);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA71_27 = input.LA(1);

                         
                        int index71_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_27);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA71_28 = input.LA(1);

                         
                        int index71_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_28);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA71_29 = input.LA(1);

                         
                        int index71_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_29);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA71_30 = input.LA(1);

                         
                        int index71_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_30);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA71_31 = input.LA(1);

                         
                        int index71_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_31);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA71_32 = input.LA(1);

                         
                        int index71_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_32);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA71_33 = input.LA(1);

                         
                        int index71_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_33);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA71_34 = input.LA(1);

                         
                        int index71_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_34);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA71_35 = input.LA(1);

                         
                        int index71_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_35);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA71_36 = input.LA(1);

                         
                        int index71_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_36);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA71_37 = input.LA(1);

                         
                        int index71_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_37);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA71_38 = input.LA(1);

                         
                        int index71_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_38);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA71_43 = input.LA(1);

                         
                        int index71_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_43);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA71_44 = input.LA(1);

                         
                        int index71_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_44);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA71_45 = input.LA(1);

                         
                        int index71_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_45);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA71_46 = input.LA(1);

                         
                        int index71_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_46);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA71_47 = input.LA(1);

                         
                        int index71_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_47);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA71_48 = input.LA(1);

                         
                        int index71_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_48);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA71_49 = input.LA(1);

                         
                        int index71_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_49);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA71_50 = input.LA(1);

                         
                        int index71_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_50);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA71_51 = input.LA(1);

                         
                        int index71_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_51);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA71_52 = input.LA(1);

                         
                        int index71_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_52);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA71_53 = input.LA(1);

                         
                        int index71_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_53);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA71_54 = input.LA(1);

                         
                        int index71_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_54);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA71_55 = input.LA(1);

                         
                        int index71_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_55);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA71_56 = input.LA(1);

                         
                        int index71_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_56);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA71_57 = input.LA(1);

                         
                        int index71_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_57);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA71_58 = input.LA(1);

                         
                        int index71_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_58);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA71_59 = input.LA(1);

                         
                        int index71_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_59);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA71_60 = input.LA(1);

                         
                        int index71_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_60);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA71_61 = input.LA(1);

                         
                        int index71_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_61);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA71_62 = input.LA(1);

                         
                        int index71_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_62);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA71_63 = input.LA(1);

                         
                        int index71_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_63);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA71_64 = input.LA(1);

                         
                        int index71_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_64);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA71_65 = input.LA(1);

                         
                        int index71_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_65);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA71_66 = input.LA(1);

                         
                        int index71_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_66);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA71_67 = input.LA(1);

                         
                        int index71_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_67);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA71_68 = input.LA(1);

                         
                        int index71_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_68);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA71_69 = input.LA(1);

                         
                        int index71_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_69);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA71_70 = input.LA(1);

                         
                        int index71_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_70);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA71_71 = input.LA(1);

                         
                        int index71_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_71);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA71_72 = input.LA(1);

                         
                        int index71_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_72);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA71_73 = input.LA(1);

                         
                        int index71_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_73);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA71_74 = input.LA(1);

                         
                        int index71_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_74);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA71_75 = input.LA(1);

                         
                        int index71_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_75);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA71_76 = input.LA(1);

                         
                        int index71_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_76);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA71_77 = input.LA(1);

                         
                        int index71_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_77);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA71_78 = input.LA(1);

                         
                        int index71_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_78);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA71_79 = input.LA(1);

                         
                        int index71_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_79);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA71_80 = input.LA(1);

                         
                        int index71_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_80);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA71_81 = input.LA(1);

                         
                        int index71_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_81);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA71_82 = input.LA(1);

                         
                        int index71_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_82);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA71_83 = input.LA(1);

                         
                        int index71_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_83);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA71_84 = input.LA(1);

                         
                        int index71_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_84);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA71_85 = input.LA(1);

                         
                        int index71_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_85);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA71_86 = input.LA(1);

                         
                        int index71_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_86);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA71_87 = input.LA(1);

                         
                        int index71_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_87);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA71_88 = input.LA(1);

                         
                        int index71_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_88);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA71_89 = input.LA(1);

                         
                        int index71_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_89);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA71_90 = input.LA(1);

                         
                        int index71_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_90);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA71_91 = input.LA(1);

                         
                        int index71_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_91);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA71_92 = input.LA(1);

                         
                        int index71_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_92);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA71_93 = input.LA(1);

                         
                        int index71_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_93);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA71_94 = input.LA(1);

                         
                        int index71_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_94);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA71_95 = input.LA(1);

                         
                        int index71_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_95);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA71_96 = input.LA(1);

                         
                        int index71_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_96);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA71_97 = input.LA(1);

                         
                        int index71_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_97);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA71_98 = input.LA(1);

                         
                        int index71_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_98);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA71_99 = input.LA(1);

                         
                        int index71_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_99);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA71_100 = input.LA(1);

                         
                        int index71_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_100);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA71_101 = input.LA(1);

                         
                        int index71_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_101);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA71_102 = input.LA(1);

                         
                        int index71_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_102);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA71_103 = input.LA(1);

                         
                        int index71_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_103);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA71_104 = input.LA(1);

                         
                        int index71_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_104);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA71_105 = input.LA(1);

                         
                        int index71_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_105);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA71_106 = input.LA(1);

                         
                        int index71_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_106);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA71_107 = input.LA(1);

                         
                        int index71_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_107);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA71_108 = input.LA(1);

                         
                        int index71_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_108);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA71_109 = input.LA(1);

                         
                        int index71_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_109);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA71_110 = input.LA(1);

                         
                        int index71_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_110);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA71_114 = input.LA(1);

                         
                        int index71_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_114);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA71_116 = input.LA(1);

                         
                        int index71_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_116);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA71_117 = input.LA(1);

                         
                        int index71_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_117);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA71_118 = input.LA(1);

                         
                        int index71_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_118);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA71_119 = input.LA(1);

                         
                        int index71_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_119);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA71_120 = input.LA(1);

                         
                        int index71_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_120);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA71_121 = input.LA(1);

                         
                        int index71_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_121);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA71_122 = input.LA(1);

                         
                        int index71_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_122);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA71_123 = input.LA(1);

                         
                        int index71_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_123);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA71_124 = input.LA(1);

                         
                        int index71_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_124);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA71_125 = input.LA(1);

                         
                        int index71_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_125);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA71_126 = input.LA(1);

                         
                        int index71_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_126);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA71_127 = input.LA(1);

                         
                        int index71_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_127);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA71_128 = input.LA(1);

                         
                        int index71_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_128);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA71_133 = input.LA(1);

                         
                        int index71_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_133);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA71_134 = input.LA(1);

                         
                        int index71_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_134);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA71_135 = input.LA(1);

                         
                        int index71_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_135);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA71_136 = input.LA(1);

                         
                        int index71_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_136);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA71_137 = input.LA(1);

                         
                        int index71_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_137);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA71_138 = input.LA(1);

                         
                        int index71_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_138);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA71_139 = input.LA(1);

                         
                        int index71_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_139);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA71_140 = input.LA(1);

                         
                        int index71_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_140);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA71_141 = input.LA(1);

                         
                        int index71_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_141);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA71_142 = input.LA(1);

                         
                        int index71_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_142);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA71_143 = input.LA(1);

                         
                        int index71_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_143);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA71_144 = input.LA(1);

                         
                        int index71_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_144);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA71_145 = input.LA(1);

                         
                        int index71_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_145);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA71_146 = input.LA(1);

                         
                        int index71_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_146);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA71_147 = input.LA(1);

                         
                        int index71_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_147);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA71_152 = input.LA(1);

                         
                        int index71_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_152);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA71_153 = input.LA(1);

                         
                        int index71_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_153);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA71_154 = input.LA(1);

                         
                        int index71_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_154);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA71_155 = input.LA(1);

                         
                        int index71_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_155);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA71_156 = input.LA(1);

                         
                        int index71_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_156);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA71_157 = input.LA(1);

                         
                        int index71_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_157);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA71_158 = input.LA(1);

                         
                        int index71_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_158);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA71_159 = input.LA(1);

                         
                        int index71_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_159);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA71_160 = input.LA(1);

                         
                        int index71_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_160);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA71_161 = input.LA(1);

                         
                        int index71_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_161);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA71_162 = input.LA(1);

                         
                        int index71_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_162);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA71_163 = input.LA(1);

                         
                        int index71_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_163);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA71_164 = input.LA(1);

                         
                        int index71_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_164);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA71_168 = input.LA(1);

                         
                        int index71_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_168);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA71_170 = input.LA(1);

                         
                        int index71_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_170);
                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA71_171 = input.LA(1);

                         
                        int index71_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_171);
                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA71_172 = input.LA(1);

                         
                        int index71_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_172);
                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA71_173 = input.LA(1);

                         
                        int index71_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_173);
                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA71_174 = input.LA(1);

                         
                        int index71_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_174);
                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA71_175 = input.LA(1);

                         
                        int index71_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_175);
                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA71_176 = input.LA(1);

                         
                        int index71_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_176);
                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA71_177 = input.LA(1);

                         
                        int index71_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_177);
                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA71_178 = input.LA(1);

                         
                        int index71_178 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_178);
                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA71_179 = input.LA(1);

                         
                        int index71_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_179);
                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA71_180 = input.LA(1);

                         
                        int index71_180 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_180);
                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA71_181 = input.LA(1);

                         
                        int index71_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_181);
                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA71_182 = input.LA(1);

                         
                        int index71_182 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_182);
                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA71_183 = input.LA(1);

                         
                        int index71_183 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_183);
                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA71_188 = input.LA(1);

                         
                        int index71_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_188);
                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA71_189 = input.LA(1);

                         
                        int index71_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_189);
                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA71_190 = input.LA(1);

                         
                        int index71_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_190);
                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA71_191 = input.LA(1);

                         
                        int index71_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_191);
                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA71_192 = input.LA(1);

                         
                        int index71_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_192);
                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA71_193 = input.LA(1);

                         
                        int index71_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_193);
                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA71_194 = input.LA(1);

                         
                        int index71_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_194);
                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA71_195 = input.LA(1);

                         
                        int index71_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_195);
                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA71_196 = input.LA(1);

                         
                        int index71_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_196);
                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA71_197 = input.LA(1);

                         
                        int index71_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_197);
                        if ( s>=0 ) return s;
                        break;
                    case 156 : 
                        int LA71_198 = input.LA(1);

                         
                        int index71_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_198);
                        if ( s>=0 ) return s;
                        break;
                    case 157 : 
                        int LA71_199 = input.LA(1);

                         
                        int index71_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_199);
                        if ( s>=0 ) return s;
                        break;
                    case 158 : 
                        int LA71_200 = input.LA(1);

                         
                        int index71_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_200);
                        if ( s>=0 ) return s;
                        break;
                    case 159 : 
                        int LA71_201 = input.LA(1);

                         
                        int index71_201 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_201);
                        if ( s>=0 ) return s;
                        break;
                    case 160 : 
                        int LA71_206 = input.LA(1);

                         
                        int index71_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_206);
                        if ( s>=0 ) return s;
                        break;
                    case 161 : 
                        int LA71_207 = input.LA(1);

                         
                        int index71_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_207);
                        if ( s>=0 ) return s;
                        break;
                    case 162 : 
                        int LA71_208 = input.LA(1);

                         
                        int index71_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_Php()) ) {s = 42;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index71_208);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\37\uffff";
    static final String DFA76_eofS =
        "\1\uffff\1\7\35\uffff";
    static final String DFA76_minS =
        "\1\23\1\4\1\23\3\0\27\uffff\2\0";
    static final String DFA76_maxS =
        "\1\122\1\131\1\122\3\0\27\uffff\2\0";
    static final String DFA76_acceptS =
        "\6\uffff\1\1\1\2\27\uffff";
    static final String DFA76_specialS =
        "\3\uffff\1\0\1\1\1\2\27\uffff\1\3\1\4}>";
    static final String[] DFA76_transitionS = {
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
            return "438:1: nameOrFunctionCall : ( name OpenRoundBracket ( expression ( Comma expression )* )? CloseRoundBracket -> ^( Apply name ( expression )* ) | name );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Php()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_4 = input.LA(1);

                         
                        int index76_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Php()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index76_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Php()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_29 = input.LA(1);

                         
                        int index76_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Php()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index76_29);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_30 = input.LA(1);

                         
                        int index76_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_Php()) ) {s = 6;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index76_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\23\uffff";
    static final String DFA75_eofS =
        "\23\uffff";
    static final String DFA75_minS =
        "\1\6\22\uffff";
    static final String DFA75_maxS =
        "\1\141\22\uffff";
    static final String DFA75_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA75_specialS =
        "\23\uffff}>";
    static final String[] DFA75_transitionS = {
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
            return "439:29: ( expression ( Comma expression )* )?";
        }
    }
    static final String DFA77_eotS =
        "\43\uffff";
    static final String DFA77_eofS =
        "\43\uffff";
    static final String DFA77_minS =
        "\1\23\1\17\1\23\36\uffff\2\0";
    static final String DFA77_maxS =
        "\1\122\1\17\1\122\36\uffff\2\0";
    static final String DFA77_acceptS =
        "\3\uffff\1\1\33\uffff\1\2\1\3\2\uffff";
    static final String DFA77_specialS =
        "\1\uffff\1\0\37\uffff\1\1\1\2}>";
    static final String[] DFA77_transitionS = {
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
            return "443:1: name : ( staticMemberAccess | memberAccess | variable );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA77_1==ClassMember) ) {s = 3;}

                        else if ( (synpred115_Php()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_33 = input.LA(1);

                         
                        int index77_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Php()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_33);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_34 = input.LA(1);

                         
                        int index77_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_Php()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_34);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\34\uffff";
    static final String DFA78_eofS =
        "\1\1\33\uffff";
    static final String DFA78_minS =
        "\1\4\33\uffff";
    static final String DFA78_maxS =
        "\1\133\33\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\3\30\uffff\1\1\1\2";
    static final String DFA78_specialS =
        "\34\uffff}>";
    static final String[] DFA78_transitionS = {
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
            return "()* loopback of 454:9: ( OpenSquareBracket expression CloseSquareBracket | '->' UnquotedString )*";
        }
    }
    static final String DFA80_eotS =
        "\23\uffff";
    static final String DFA80_eofS =
        "\1\22\22\uffff";
    static final String DFA80_minS =
        "\1\6\22\uffff";
    static final String DFA80_maxS =
        "\1\141\22\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA80_specialS =
        "\23\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\32\uffff\1\1\1\uffff"+
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
            return "165:79: ( printExpr )?";
        }
    }
    static final String DFA83_eotS =
        "\u00c6\uffff";
    static final String DFA83_eofS =
        "\u00c6\uffff";
    static final String DFA83_minS =
        "\2\6\1\0\1\23\1\6\1\23\1\6\3\23\6\0\1\6\1\23\1\0\7\uffff\1\0\26"+
        "\uffff\67\0\132\uffff\3\0\1\uffff";
    static final String DFA83_maxS =
        "\1\141\1\6\1\0\1\122\3\141\3\122\6\0\1\6\1\122\1\0\7\uffff\1\0\26"+
        "\uffff\67\0\132\uffff\3\0\1\uffff";
    static final String DFA83_acceptS =
        "\23\uffff\1\2\34\uffff\1\1\u0095\uffff";
    static final String DFA83_specialS =
        "\2\uffff\1\0\7\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\7\7\uffff"+
        "\1\10\26\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
        "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
        "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
        "\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71"+
        "\1\72\1\73\1\74\1\75\1\76\1\77\132\uffff\1\100\1\101\1\102\1\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\6\12\uffff\1\5\1\uffff\1\3\2\uffff\1\21\1\uffff\1\4\1\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\10\1\11\1\23\13\uffff\5\23\4\uffff"+
            "\1\1\31\uffff\1\22\1\2\1\uffff\1\15\1\23\5\uffff\1\7\1\20\1"+
            "\12\1\13\1\14\1\16\1\17",
            "\1\32",
            "\1\uffff",
            "\1\61\76\uffff\1\62",
            "\1\65\12\uffff\1\64\1\uffff\1\70\2\uffff\1\102\1\uffff\1\63"+
            "\1\uffff\1\64\3\uffff\1\64\1\uffff\1\71\1\72\60\uffff\1\67\1"+
            "\uffff\1\76\6\uffff\1\66\1\101\1\73\1\74\1\75\1\77\1\100",
            "\1\105\2\uffff\1\117\11\uffff\1\106\1\107\60\uffff\1\104\1"+
            "\uffff\1\113\6\uffff\1\103\1\116\1\110\1\111\1\112\1\114\1\115",
            "\1\126\12\uffff\1\125\1\uffff\1\123\2\uffff\1\141\1\uffff\1"+
            "\124\1\uffff\1\125\3\uffff\1\125\1\uffff\1\130\1\131\25\uffff"+
            "\1\121\32\uffff\1\122\1\uffff\1\135\5\uffff\1\120\1\127\1\140"+
            "\1\132\1\133\1\134\1\136\1\137",
            "\1\143\76\uffff\1\142",
            "\1\145\76\uffff\1\144",
            "\1\147\76\uffff\1\146",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00c2",
            "\1\u00c4\76\uffff\1\u00c3",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "165:7: ({...}? => ( printExpr )? | ( simpleStatement )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_2 = input.LA(1);

                         
                        int index83_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA83_10 = input.LA(1);

                         
                        int index83_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA83_11 = input.LA(1);

                         
                        int index83_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA83_12 = input.LA(1);

                         
                        int index83_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA83_13 = input.LA(1);

                         
                        int index83_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA83_14 = input.LA(1);

                         
                        int index83_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA83_15 = input.LA(1);

                         
                        int index83_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_15);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA83_18 = input.LA(1);

                         
                        int index83_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA83_26 = input.LA(1);

                         
                        int index83_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_26);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA83_49 = input.LA(1);

                         
                        int index83_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_49);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA83_50 = input.LA(1);

                         
                        int index83_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_50);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA83_51 = input.LA(1);

                         
                        int index83_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_51);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA83_52 = input.LA(1);

                         
                        int index83_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_52);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA83_53 = input.LA(1);

                         
                        int index83_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_53);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA83_54 = input.LA(1);

                         
                        int index83_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_54);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA83_55 = input.LA(1);

                         
                        int index83_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_55);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA83_56 = input.LA(1);

                         
                        int index83_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_56);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA83_57 = input.LA(1);

                         
                        int index83_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_57);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA83_58 = input.LA(1);

                         
                        int index83_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_58);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA83_59 = input.LA(1);

                         
                        int index83_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_59);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA83_60 = input.LA(1);

                         
                        int index83_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_60);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA83_61 = input.LA(1);

                         
                        int index83_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_61);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA83_62 = input.LA(1);

                         
                        int index83_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_62);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA83_63 = input.LA(1);

                         
                        int index83_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_63);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA83_64 = input.LA(1);

                         
                        int index83_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_64);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA83_65 = input.LA(1);

                         
                        int index83_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_65);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA83_66 = input.LA(1);

                         
                        int index83_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_66);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA83_67 = input.LA(1);

                         
                        int index83_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_67);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA83_68 = input.LA(1);

                         
                        int index83_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_68);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA83_69 = input.LA(1);

                         
                        int index83_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_69);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA83_70 = input.LA(1);

                         
                        int index83_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_70);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA83_71 = input.LA(1);

                         
                        int index83_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_71);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA83_72 = input.LA(1);

                         
                        int index83_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_72);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA83_73 = input.LA(1);

                         
                        int index83_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_73);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA83_74 = input.LA(1);

                         
                        int index83_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_74);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA83_75 = input.LA(1);

                         
                        int index83_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_75);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA83_76 = input.LA(1);

                         
                        int index83_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_76);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA83_77 = input.LA(1);

                         
                        int index83_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_77);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA83_78 = input.LA(1);

                         
                        int index83_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_78);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA83_79 = input.LA(1);

                         
                        int index83_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_79);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA83_80 = input.LA(1);

                         
                        int index83_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_80);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA83_81 = input.LA(1);

                         
                        int index83_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_81);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA83_82 = input.LA(1);

                         
                        int index83_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_82);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA83_83 = input.LA(1);

                         
                        int index83_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_83);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA83_84 = input.LA(1);

                         
                        int index83_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_84);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA83_85 = input.LA(1);

                         
                        int index83_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_85);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA83_86 = input.LA(1);

                         
                        int index83_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_86);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA83_87 = input.LA(1);

                         
                        int index83_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_87);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA83_88 = input.LA(1);

                         
                        int index83_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_88);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA83_89 = input.LA(1);

                         
                        int index83_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_89);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA83_90 = input.LA(1);

                         
                        int index83_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_90);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA83_91 = input.LA(1);

                         
                        int index83_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_91);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA83_92 = input.LA(1);

                         
                        int index83_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_92);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA83_93 = input.LA(1);

                         
                        int index83_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_93);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA83_94 = input.LA(1);

                         
                        int index83_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_94);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA83_95 = input.LA(1);

                         
                        int index83_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_95);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA83_96 = input.LA(1);

                         
                        int index83_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_96);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA83_97 = input.LA(1);

                         
                        int index83_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_97);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA83_98 = input.LA(1);

                         
                        int index83_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_98);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA83_99 = input.LA(1);

                         
                        int index83_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_99);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA83_100 = input.LA(1);

                         
                        int index83_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_100);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA83_101 = input.LA(1);

                         
                        int index83_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_101);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA83_102 = input.LA(1);

                         
                        int index83_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_102);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA83_103 = input.LA(1);

                         
                        int index83_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_103);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA83_194 = input.LA(1);

                         
                        int index83_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_194);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA83_195 = input.LA(1);

                         
                        int index83_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_195);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA83_196 = input.LA(1);

                         
                        int index83_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred4_Php()&&(expressionFollowsBodyString))) ) {s = 48;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index83_196);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\23\uffff";
    static final String DFA81_eofS =
        "\23\uffff";
    static final String DFA81_minS =
        "\1\6\22\uffff";
    static final String DFA81_maxS =
        "\1\141\22\uffff";
    static final String DFA81_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA81_specialS =
        "\23\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\1\12\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\25\uffff\1\1\31\uffff\1\22\1\1"+
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

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "165:79: ( printExpr )?";
        }
    }
    static final String DFA82_eotS =
        "\32\uffff";
    static final String DFA82_eofS =
        "\32\uffff";
    static final String DFA82_minS =
        "\1\6\31\uffff";
    static final String DFA82_maxS =
        "\1\141\31\uffff";
    static final String DFA82_acceptS =
        "\1\uffff\1\1\27\uffff\1\2";
    static final String DFA82_specialS =
        "\32\uffff}>";
    static final String[] DFA82_transitionS = {
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
            return "165:92: ( simpleStatement )?";
        }
    }
    static final String DFA101_eotS =
        "\23\uffff";
    static final String DFA101_eofS =
        "\23\uffff";
    static final String DFA101_minS =
        "\1\6\22\uffff";
    static final String DFA101_maxS =
        "\1\141\22\uffff";
    static final String DFA101_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA101_specialS =
        "\23\uffff}>";
    static final String[] DFA101_transitionS = {
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

    static final short[] DFA101_eot = DFA.unpackEncodedString(DFA101_eotS);
    static final short[] DFA101_eof = DFA.unpackEncodedString(DFA101_eofS);
    static final char[] DFA101_min = DFA.unpackEncodedStringToUnsignedChars(DFA101_minS);
    static final char[] DFA101_max = DFA.unpackEncodedStringToUnsignedChars(DFA101_maxS);
    static final short[] DFA101_accept = DFA.unpackEncodedString(DFA101_acceptS);
    static final short[] DFA101_special = DFA.unpackEncodedString(DFA101_specialS);
    static final short[][] DFA101_transition;

    static {
        int numStates = DFA101_transitionS.length;
        DFA101_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA101_transition[i] = DFA.unpackEncodedString(DFA101_transitionS[i]);
        }
    }

    class DFA101 extends DFA {

        public DFA101(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 101;
            this.eot = DFA101_eot;
            this.eof = DFA101_eof;
            this.min = DFA101_min;
            this.max = DFA101_max;
            this.accept = DFA101_accept;
            this.special = DFA101_special;
            this.transition = DFA101_transition;
        }
        public String getDescription() {
            return "439:29: ( expression ( Comma expression )* )?";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_prog889 = new BitSet(new long[]{0x1387E7CF454A0442L,0x00000003F8360000L});
    public static final BitSet FOLLOW_printExpr_in_statement907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_statement909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printExpr_in_statement925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_simpleStatement_in_statement930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_BodyString_in_statement934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_statement944 = new BitSet(new long[]{0x1387E7CF454A0C40L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_statement946 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_statement948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketedBlock_in_statement960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_statement973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDefinition_in_statement981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexStatement_in_statement989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_statement997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_statement999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_printExpr1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_bracketedBlock1042 = new BitSet(new long[]{0x1387E7CF454A0C40L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_bracketedBlock1046 = new BitSet(new long[]{0x1387E7CF454A0C40L,0x00000003F8360000L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_bracketedBlock1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Interface_in_interfaceDefinition1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceDefinition1079 = new BitSet(new long[]{0x0400000000000400L});
    public static final BitSet FOLLOW_interfaceExtends_in_interfaceDefinition1081 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_interfaceDefinition1092 = new BitSet(new long[]{0x5004200000000800L,0x0000000000080000L});
    public static final BitSet FOLLOW_interfaceMember_in_interfaceDefinition1102 = new BitSet(new long[]{0x5004200000000800L,0x0000000000080000L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_interfaceDefinition1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Extends_in_interfaceExtends1153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1156 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_interfaceExtends1159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1162 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Const_in_interfaceMember1180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1182 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_interfaceMember1185 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_interfaceMember1187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_interfaceMember1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_interfaceMember1219 = new BitSet(new long[]{0x1004200000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Function_in_interfaceMember1222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1224 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_interfaceMember1226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_interfaceMember1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classModifier_in_classDefinition1272 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Class_in_classDefinition1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition1288 = new BitSet(new long[]{0x0C00000000000400L});
    public static final BitSet FOLLOW_Extends_in_classDefinition1300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition1304 = new BitSet(new long[]{0x0800000000000400L});
    public static final BitSet FOLLOW_classImplements_in_classDefinition1317 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_classDefinition1328 = new BitSet(new long[]{0x7004200000080800L,0x0000000000080000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition1338 = new BitSet(new long[]{0x7004200000080800L,0x0000000000080000L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_classDefinition1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Implements_in_classImplements1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements1435 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_classImplements1438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements1441 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember1461 = new BitSet(new long[]{0x1004200000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Function_in_classMember1464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1466 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_classMember1468 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_bracketedBlock_in_classMember1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_classMember1521 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dollar_in_classMember1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1525 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1528 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_classMember1530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Const_in_classMember1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1569 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1572 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_classMember1574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember1606 = new BitSet(new long[]{0x1004000000080000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Dollar_in_classMember1610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember1612 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_classMember1616 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_classMember1618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_classMember1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_fieldDefinition1670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_fieldDefinition1672 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_Equals_in_fieldDefinition1675 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_fieldDefinition1677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_fieldDefinition1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Abstract_in_classModifier1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_fieldModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_complexStatement1759 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1761 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1765 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1767 = new BitSet(new long[]{0x1387E7FF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1771 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_conditional_in_complexStatement1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_complexStatement1804 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1806 = new BitSet(new long[]{0x00800003454A0050L,0x00000003F8140000L});
    public static final BitSet FOLLOW_forInit_in_complexStatement1808 = new BitSet(new long[]{0x00800003454A0050L,0x00000003F8140000L});
    public static final BitSet FOLLOW_forCondition_in_complexStatement1810 = new BitSet(new long[]{0x00800003454A00C0L,0x00000003F8140000L});
    public static final BitSet FOLLOW_forUpdate_in_complexStatement1812 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1814 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Foreach_in_complexStatement1838 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1840 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_variable_in_complexStatement1842 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_complexStatement1844 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_arrayEntry_in_complexStatement1846 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1848 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_complexStatement1870 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1872 = new BitSet(new long[]{0x00800003454A00C0L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1876 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1879 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Do_in_complexStatement1900 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_complexStatement1902 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_While_in_complexStatement1904 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1906 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1910 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_complexStatement1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Switch_in_complexStatement1933 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_complexStatement1935 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_complexStatement1937 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_complexStatement1939 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_complexStatement1941 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_cases_in_complexStatement1942 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_complexStatement1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDefinition_in_complexStatement1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Echo_in_simpleStatement1978 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_commaList_in_simpleStatement1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Global_in_simpleStatement1989 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_simpleStatement1992 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_simpleStatement1995 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_simpleStatement1998 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Static_in_simpleStatement2008 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_variable_in_simpleStatement2011 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Equals_in_simpleStatement2013 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_simpleStatement2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Break_in_simpleStatement2024 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Continue_in_simpleStatement2036 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Return_in_simpleStatement2053 = new BitSet(new long[]{0x00800003454A0042L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_simpleStatement2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RequireOperator_in_simpleStatement2065 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_simpleStatement2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_simpleStatement2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElseIf_in_conditional2094 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_conditional2096 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_conditional2100 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_conditional2102 = new BitSet(new long[]{0x1387E7FF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_conditional2106 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_conditional_in_conditional2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_conditional2132 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_conditional2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forInit2155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_forInit2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forCondition2184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_forCondition2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commaList_in_forUpdate2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_casestatement_in_cases2245 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_defaultcase_in_cases2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_casestatement2266 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_casestatement2269 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_casestatement2271 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_casestatement2274 = new BitSet(new long[]{0x1387E7CF454A0442L,0x00000003F8360000L});
    public static final BitSet FOLLOW_Default_in_defaultcase2294 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_defaultcase2297 = new BitSet(new long[]{0x1387E7CF454A0440L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_defaultcase2300 = new BitSet(new long[]{0x1387E7CF454A0442L,0x00000003F8360000L});
    public static final BitSet FOLLOW_Function_in_functionDefinition2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_functionDefinition2321 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_functionDefinition2323 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bracketedBlock_in_functionDefinition2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_parametersDefinition2363 = new BitSet(new long[]{0x0000000000480080L});
    public static final BitSet FOLLOW_paramDef_in_parametersDefinition2366 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_parametersDefinition2369 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_paramDef_in_parametersDefinition2371 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_parametersDefinition2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramName_in_paramDef2404 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_Equals_in_paramDef2407 = new BitSet(new long[]{0x0000000000000000L,0x00000003F0100000L});
    public static final BitSet FOLLOW_atom_in_paramDef2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_paramName2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_paramName2440 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Dollar_in_paramName2442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_commaList2473 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Comma_in_commaList2476 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_commaList2479 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_weakLogicalOr_in_expression2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2520 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_Or_in_weakLogicalOr2523 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2526 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2545 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_Xor_in_weakLogicalXor2548 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2551 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2574 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_And_in_weakLogicalAnd2577 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2580 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_listVariables_in_assignment2599 = new BitSet(new long[]{0x0000000080000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_set_in_assignment2602 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_assignment_in_assignment2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternary_in_assignment2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_List_in_listVariables2638 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_listVariables2641 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_listVariables2644 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_listVariables2647 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_listVariables2650 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_listVariables2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_listVariables2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_ternary2681 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_QuestionMark_in_ternary2683 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_ternary2685 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_ternary2687 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_ternary2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_ternary2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr2729 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LogicalOr_in_logicalOr2732 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_logicalAnd_in_logicalOr2735 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2754 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_LogicalAnd_in_logicalAnd2757 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2760 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2783 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_Pipe_in_bitwiseOr2786 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2789 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2808 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_Ampersand_in_bitWiseAnd2811 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2814 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_EqualityOperator_in_equalityCheck2836 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2862 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ComparisionOperator_in_comparisionCheck2865 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addition_in_bitWiseShift2887 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ShiftOperator_in_bitWiseShift2890 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_addition_in_bitWiseShift2893 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_multiplication_in_addition2916 = new BitSet(new long[]{0x0000000006200002L});
    public static final BitSet FOLLOW_set_in_addition2919 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_multiplication_in_addition2932 = new BitSet(new long[]{0x0000000006200002L});
    public static final BitSet FOLLOW_logicalNot_in_multiplication2951 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_set_in_multiplication2954 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_logicalNot_in_multiplication2967 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_Bang_in_logicalNot2986 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_logicalNot_in_logicalNot2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceOf_in_logicalNot2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negateOrCast_in_instanceOf3014 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_Instanceof_in_instanceOf3017 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_negateOrCast_in_instanceOf3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_negateOrCast3039 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_increment_in_negateOrCast3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_negateOrCast3060 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_PrimitiveType_in_negateOrCast3062 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_negateOrCast3064 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_increment_in_negateOrCast3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_negateOrCast3084 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_negateOrCast3087 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_negateOrCast3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_increment_in_negateOrCast3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IncrementOperator_in_increment3115 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_increment3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_increment3135 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IncrementOperator_in_increment3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newOrClone_in_increment3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_New_in_newOrClone3172 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_newOrClone3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Clone_in_newOrClone3183 = new BitSet(new long[]{0x0080000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_name_in_newOrClone3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomOrReference_in_newOrClone3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_atomOrReference3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_atomOrReference3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_arrayDeclaration3236 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_arrayDeclaration3238 = new BitSet(new long[]{0x00800003454A00C0L,0x00000003F8140000L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration3241 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_arrayDeclaration3244 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration3246 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_arrayDeclaration3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_arrayEntry3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayEntry3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_keyValuePair3302 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ArrayAssign_in_keyValuePair3304 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_keyValuePair3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SingleQuotedString_in_atom3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleQuotedString_in_atom3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HereDoc_in_atom3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_atom3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Real_in_atom3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Boolean_in_atom3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_atom3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_reference3370 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall3398 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_nameOrFunctionCall3400 = new BitSet(new long[]{0x00800003454A00C0L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall3403 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_nameOrFunctionCall3406 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall3408 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_nameOrFunctionCall3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticMemberAccess_in_name3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_name3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_name3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_staticMemberAccess3482 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ClassMember_in_staticMemberAccess3484 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_variable_in_staticMemberAccess3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_memberAccess3504 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_OpenSquareBracket_in_memberAccess3517 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_memberAccess3520 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CloseSquareBracket_in_memberAccess3522 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_InstanceMember_in_memberAccess3535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_memberAccess3538 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_Dollar_in_variable3561 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_variable_in_variable3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UnquotedString_in_variable3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred1_Php889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printExpr_in_synpred2_Php907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SemiColon_in_synpred2_Php909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printExpr_in_synpred4_Php925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printExpr_in_synpred6_Php925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_simpleStatement_in_synpred6_Php930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_BodyString_in_synpred6_Php934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OpenCurlyBracket_in_synpred7_Php944 = new BitSet(new long[]{0x1387E7CF454A0C40L,0x00000003F8360000L});
    public static final BitSet FOLLOW_statement_in_synpred7_Php946 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CloseCurlyBracket_in_synpred7_Php948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketedBlock_in_synpred8_Php960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred12_Php1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldModifier_in_synpred26_Php1461 = new BitSet(new long[]{0x1004200000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Function_in_synpred26_Php1464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_synpred26_Php1466 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parametersDefinition_in_synpred26_Php1468 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_bracketedBlock_in_synpred26_Php1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SemiColon_in_synpred26_Php1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred36_Php1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred55_Php2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred61_Php2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred62_Php2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_synpred68_Php2523 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_weakLogicalXor_in_synpred68_Php2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Xor_in_synpred69_Php2548 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_weakLogicalAnd_in_synpred69_Php2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_And_in_synpred70_Php2577 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_assignment_in_synpred70_Php2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listVariables_in_synpred72_Php2599 = new BitSet(new long[]{0x0000000080000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_set_in_synpred72_Php2602 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_assignment_in_synpred72_Php2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOr_in_synpred75_Php2681 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_QuestionMark_in_synpred75_Php2683 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_synpred75_Php2685 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Colon_in_synpred75_Php2687 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_synpred75_Php2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred97_Php3135 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IncrementOperator_in_synpred97_Php3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValuePair_in_synpred103_Php3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_synpred113_Php3398 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OpenRoundBracket_in_synpred113_Php3400 = new BitSet(new long[]{0x00800003454A00C0L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_synpred113_Php3403 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_Comma_in_synpred113_Php3406 = new BitSet(new long[]{0x00800003454A0040L,0x00000003F8140000L});
    public static final BitSet FOLLOW_expression_in_synpred113_Php3408 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_CloseRoundBracket_in_synpred113_Php3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_synpred115_Php3453 = new BitSet(new long[]{0x0000000000000002L});

}