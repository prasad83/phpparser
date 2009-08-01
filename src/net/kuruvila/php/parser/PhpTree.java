// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 PhpTree.g 2009-05-31 23:11:32

    package net.kuruvila.php.parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class PhpTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SemiColon", "Comma", "OpenBrace", "CloseBrace", "OpenSquareBrace", "CloseSquareBrace", "OpenCurlyBrace", "CloseCurlyBrace", "ArrayAssign", "LogicalOr", "LogicalAnd", "ClassMember", "InstanceMember", "SuppressWarnings", "QuestionMark", "Dollar", "Colon", "Dot", "Ampersand", "Pipe", "Bang", "Plus", "Minus", "Asterisk", "Percent", "Forwardslash", "Tilde", "Equals", "New", "Clone", "Echo", "If", "Else", "ElseIf", "For", "Foreach", "While", "Do", "Switch", "Case", "Default", "Function", "Break", "Continue", "Return", "Global", "Static", "And", "Or", "Xor", "Instanceof", "Class", "Interface", "Extends", "Implements", "Abstract", "Var", "Const", "Modifiers", "ClassDefinition", "Block", "Params", "Apply", "Member", "Reference", "Empty", "Prefix", "Postfix", "IfExpression", "Label", "Cast", "ForInit", "ForCondition", "ForUpdate", "Field", "Method", "BodyString", "UnquotedString", "AccessModifier", "Integer", "RequireOperator", "AsignmentOperator", "EqualityOperator", "ComparisionOperator", "ShiftOperator", "PrimitiveType", "IncrementOperator", "Array", "SingleQuotedString", "DoubleQuotedString", "HereDoc", "Real", "Boolean", "BodyStringRest", "BodyStringRestShortTag", "MultilineComment", "SinglelineComment", "UnixComment", "Decimal", "Hexadecimal", "Octal", "Digits", "DNum", "Exponent_DNum", "EscapeCharector", "HereDocContents", "Eol", "WhiteSpace", "'as'"
    };
    public static final int Switch=42;
    public static final int New=32;
    public static final int DoubleQuotedString=93;
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
    public static final int CloseBrace=7;
    public static final int HereDocContents=109;
    public static final int Var=60;
    public static final int Colon=20;
    public static final int EqualityOperator=86;
    public static final int Continue=47;
    public static final int Percent=28;
    public static final int ElseIf=37;
    public static final int QuestionMark=18;
    public static final int ForUpdate=77;
    public static final int Dollar=19;
    public static final int ClassDefinition=63;
    public static final int UnixComment=101;
    public static final int Cast=74;
    public static final int Prefix=70;
    public static final int Label=73;
    public static final int Abstract=59;
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
    public static final int BodyString=80;
    public static final int Else=36;
    public static final int SuppressWarnings=17;
    public static final int Xor=53;
    public static final int ComparisionOperator=87;
    public static final int ForCondition=76;
    public static final int Case=43;
    public static final int Function=45;
    public static final int Pipe=23;
    public static final int Global=49;
    public static final int Tilde=30;
    public static final int Block=64;
    public static final int Method=79;
    public static final int OpenBrace=6;
    public static final int Empty=69;
    public static final int Bang=24;
    public static final int While=40;
    public static final int EOF=-1;
    public static final int AsignmentOperator=85;
    public static final int Digits=105;
    public static final int HereDoc=94;
    public static final int Member=67;
    public static final int Return=48;

    // delegates
    // delegators


        public PhpTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public PhpTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PhpTree.tokenNames; }
    public String getGrammarFileName() { return "PhpTree.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // PhpTree.g:13:1: prog : ( statement )* ;
    public final PhpTree.prog_return prog() throws RecognitionException {
        PhpTree.prog_return retval = new PhpTree.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        PhpTree.statement_return statement1 = null;



        try {
            // PhpTree.g:13:6: ( ( statement )* )
            // PhpTree.g:13:8: ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // PhpTree.g:13:8: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==OpenSquareBrace||(LA1_0>=LogicalOr && LA1_0<=SuppressWarnings)||LA1_0==Dollar||(LA1_0>=Dot && LA1_0<=If)||(LA1_0>=For && LA1_0<=Switch)||(LA1_0>=Function && LA1_0<=Interface)||LA1_0==Block||LA1_0==Apply||(LA1_0>=Prefix && LA1_0<=IfExpression)||LA1_0==Cast||(LA1_0>=BodyString && LA1_0<=UnquotedString)||(LA1_0>=Integer && LA1_0<=EqualityOperator)||LA1_0==ShiftOperator||(LA1_0>=Array && LA1_0<=Boolean)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PhpTree.g:0:0: statement
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_statement_in_prog43);
            	    statement1=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_0, statement1.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // PhpTree.g:15:1: statement : ( BodyString | ^( Block ( statement )* ) | classDefinition | interfaceDefinition | complexStatement | simpleStatement );
    public final PhpTree.statement_return statement() throws RecognitionException {
        PhpTree.statement_return retval = new PhpTree.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BodyString2=null;
        CommonTree Block3=null;
        PhpTree.statement_return statement4 = null;

        PhpTree.classDefinition_return classDefinition5 = null;

        PhpTree.interfaceDefinition_return interfaceDefinition6 = null;

        PhpTree.complexStatement_return complexStatement7 = null;

        PhpTree.simpleStatement_return simpleStatement8 = null;


        CommonTree BodyString2_tree=null;
        CommonTree Block3_tree=null;

        try {
            // PhpTree.g:16:5: ( BodyString | ^( Block ( statement )* ) | classDefinition | interfaceDefinition | complexStatement | simpleStatement )
            int alt3=6;
            switch ( input.LA(1) ) {
            case BodyString:
                {
                alt3=1;
                }
                break;
            case Block:
                {
                alt3=2;
                }
                break;
            case Class:
                {
                alt3=3;
                }
                break;
            case Interface:
                {
                alt3=4;
                }
                break;
            case If:
            case For:
            case Foreach:
            case While:
            case Do:
            case Switch:
            case Function:
                {
                alt3=5;
                }
                break;
            case OpenSquareBrace:
            case LogicalOr:
            case LogicalAnd:
            case ClassMember:
            case InstanceMember:
            case SuppressWarnings:
            case Dollar:
            case Dot:
            case Ampersand:
            case Pipe:
            case Bang:
            case Plus:
            case Minus:
            case Asterisk:
            case Percent:
            case Forwardslash:
            case Tilde:
            case Equals:
            case New:
            case Clone:
            case Echo:
            case Break:
            case Continue:
            case Return:
            case Global:
            case Static:
            case And:
            case Or:
            case Xor:
            case Instanceof:
            case Apply:
            case Prefix:
            case Postfix:
            case IfExpression:
            case Cast:
            case UnquotedString:
            case Integer:
            case RequireOperator:
            case AsignmentOperator:
            case EqualityOperator:
            case ShiftOperator:
            case Array:
            case SingleQuotedString:
            case DoubleQuotedString:
            case HereDoc:
            case Real:
            case Boolean:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // PhpTree.g:16:7: BodyString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    BodyString2=(CommonTree)match(input,BodyString,FOLLOW_BodyString_in_statement56); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BodyString2_tree = (CommonTree)adaptor.dupNode(BodyString2);

                    adaptor.addChild(root_0, BodyString2_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:17:7: ^( Block ( statement )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Block3=(CommonTree)match(input,Block,FOLLOW_Block_in_statement65); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Block3_tree = (CommonTree)adaptor.dupNode(Block3);

                    root_1 = (CommonTree)adaptor.becomeRoot(Block3_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // PhpTree.g:17:15: ( statement )*
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==OpenSquareBrace||(LA2_0>=LogicalOr && LA2_0<=SuppressWarnings)||LA2_0==Dollar||(LA2_0>=Dot && LA2_0<=If)||(LA2_0>=For && LA2_0<=Switch)||(LA2_0>=Function && LA2_0<=Interface)||LA2_0==Block||LA2_0==Apply||(LA2_0>=Prefix && LA2_0<=IfExpression)||LA2_0==Cast||(LA2_0>=BodyString && LA2_0<=UnquotedString)||(LA2_0>=Integer && LA2_0<=EqualityOperator)||LA2_0==ShiftOperator||(LA2_0>=Array && LA2_0<=Boolean)) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // PhpTree.g:0:0: statement
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_statement_in_statement67);
                        	    statement4=statement();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_1, statement4.getTree());

                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop2;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // PhpTree.g:19:7: classDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_classDefinition_in_statement82);
                    classDefinition5=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, classDefinition5.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // PhpTree.g:20:7: interfaceDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_interfaceDefinition_in_statement90);
                    interfaceDefinition6=interfaceDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, interfaceDefinition6.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // PhpTree.g:21:7: complexStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_complexStatement_in_statement98);
                    complexStatement7=complexStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, complexStatement7.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // PhpTree.g:22:7: simpleStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_simpleStatement_in_statement106);
                    simpleStatement8=simpleStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, simpleStatement8.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class interfaceDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDefinition"
    // PhpTree.g:25:1: interfaceDefinition : ^( Interface UnquotedString ( interfaceExtends )? ( interfaceMember )* ) ;
    public final PhpTree.interfaceDefinition_return interfaceDefinition() throws RecognitionException {
        PhpTree.interfaceDefinition_return retval = new PhpTree.interfaceDefinition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Interface9=null;
        CommonTree UnquotedString10=null;
        PhpTree.interfaceExtends_return interfaceExtends11 = null;

        PhpTree.interfaceMember_return interfaceMember12 = null;


        CommonTree Interface9_tree=null;
        CommonTree UnquotedString10_tree=null;

        try {
            // PhpTree.g:26:5: ( ^( Interface UnquotedString ( interfaceExtends )? ( interfaceMember )* ) )
            // PhpTree.g:26:7: ^( Interface UnquotedString ( interfaceExtends )? ( interfaceMember )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Interface9=(CommonTree)match(input,Interface,FOLLOW_Interface_in_interfaceDefinition124); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Interface9_tree = (CommonTree)adaptor.dupNode(Interface9);

            root_1 = (CommonTree)adaptor.becomeRoot(Interface9_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            UnquotedString10=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceDefinition126); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString10_tree = (CommonTree)adaptor.dupNode(UnquotedString10);

            adaptor.addChild(root_1, UnquotedString10_tree);
            }
            // PhpTree.g:26:34: ( interfaceExtends )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Extends) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // PhpTree.g:0:0: interfaceExtends
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_interfaceExtends_in_interfaceDefinition128);
                    interfaceExtends11=interfaceExtends();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, interfaceExtends11.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }

            // PhpTree.g:26:52: ( interfaceMember )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Const||LA5_0==Method) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // PhpTree.g:0:0: interfaceMember
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_interfaceMember_in_interfaceDefinition131);
            	    interfaceMember12=interfaceMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, interfaceMember12.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interfaceDefinition"

    public static class interfaceExtends_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceExtends"
    // PhpTree.g:29:1: interfaceExtends : Extends ( UnquotedString )+ ;
    public final PhpTree.interfaceExtends_return interfaceExtends() throws RecognitionException {
        PhpTree.interfaceExtends_return retval = new PhpTree.interfaceExtends_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Extends13=null;
        CommonTree UnquotedString14=null;

        CommonTree Extends13_tree=null;
        CommonTree UnquotedString14_tree=null;

        try {
            // PhpTree.g:30:5: ( Extends ( UnquotedString )+ )
            // PhpTree.g:30:7: Extends ( UnquotedString )+
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            Extends13=(CommonTree)match(input,Extends,FOLLOW_Extends_in_interfaceExtends150); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Extends13_tree = (CommonTree)adaptor.dupNode(Extends13);

            root_0 = (CommonTree)adaptor.becomeRoot(Extends13_tree, root_0);
            }
            // PhpTree.g:30:16: ( UnquotedString )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==UnquotedString) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PhpTree.g:0:0: UnquotedString
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    UnquotedString14=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends153); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString14_tree = (CommonTree)adaptor.dupNode(UnquotedString14);

            	    adaptor.addChild(root_0, UnquotedString14_tree);
            	    }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interfaceExtends"

    public static class interfaceMember_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceMember"
    // PhpTree.g:32:1: interfaceMember : ( ^( Const UnquotedString ( atom )? ) | ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ) );
    public final PhpTree.interfaceMember_return interfaceMember() throws RecognitionException {
        PhpTree.interfaceMember_return retval = new PhpTree.interfaceMember_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Const15=null;
        CommonTree UnquotedString16=null;
        CommonTree Method18=null;
        CommonTree Modifiers19=null;
        CommonTree UnquotedString21=null;
        CommonTree Params22=null;
        PhpTree.atom_return atom17 = null;

        PhpTree.fieldModifier_return fieldModifier20 = null;

        PhpTree.paramDef_return paramDef23 = null;


        CommonTree Const15_tree=null;
        CommonTree UnquotedString16_tree=null;
        CommonTree Method18_tree=null;
        CommonTree Modifiers19_tree=null;
        CommonTree UnquotedString21_tree=null;
        CommonTree Params22_tree=null;

        try {
            // PhpTree.g:33:5: ( ^( Const UnquotedString ( atom )? ) | ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Const) ) {
                alt10=1;
            }
            else if ( (LA10_0==Method) ) {
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
                    // PhpTree.g:33:7: ^( Const UnquotedString ( atom )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Const15=(CommonTree)match(input,Const,FOLLOW_Const_in_interfaceMember171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Const15_tree = (CommonTree)adaptor.dupNode(Const15);

                    root_1 = (CommonTree)adaptor.becomeRoot(Const15_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString16=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString16_tree = (CommonTree)adaptor.dupNode(UnquotedString16);

                    adaptor.addChild(root_1, UnquotedString16_tree);
                    }
                    // PhpTree.g:33:30: ( atom )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==Integer||(LA7_0>=Array && LA7_0<=Boolean)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // PhpTree.g:0:0: atom
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_atom_in_interfaceMember175);
                            atom17=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, atom17.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:34:7: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Method18=(CommonTree)match(input,Method,FOLLOW_Method_in_interfaceMember186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Method18_tree = (CommonTree)adaptor.dupNode(Method18);

                    root_1 = (CommonTree)adaptor.becomeRoot(Method18_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Modifiers19=(CommonTree)match(input,Modifiers,FOLLOW_Modifiers_in_interfaceMember189); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Modifiers19_tree = (CommonTree)adaptor.dupNode(Modifiers19);

                    root_2 = (CommonTree)adaptor.becomeRoot(Modifiers19_tree, root_2);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // PhpTree.g:34:28: ( fieldModifier )*
                        loop8:
                        do {
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==Static||LA8_0==Abstract||LA8_0==AccessModifier) ) {
                                alt8=1;
                            }


                            switch (alt8) {
                        	case 1 :
                        	    // PhpTree.g:0:0: fieldModifier
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_fieldModifier_in_interfaceMember191);
                        	    fieldModifier20=fieldModifier();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_2, fieldModifier20.getTree());

                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop8;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    UnquotedString21=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString21_tree = (CommonTree)adaptor.dupNode(UnquotedString21);

                    adaptor.addChild(root_1, UnquotedString21_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Params22=(CommonTree)match(input,Params,FOLLOW_Params_in_interfaceMember198); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Params22_tree = (CommonTree)adaptor.dupNode(Params22);

                    root_2 = (CommonTree)adaptor.becomeRoot(Params22_tree, root_2);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // PhpTree.g:34:68: ( paramDef )*
                        loop9:
                        do {
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==Dollar||LA9_0==Ampersand||LA9_0==Equals) ) {
                                alt9=1;
                            }


                            switch (alt9) {
                        	case 1 :
                        	    // PhpTree.g:0:0: paramDef
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_paramDef_in_interfaceMember200);
                        	    paramDef23=paramDef();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_2, paramDef23.getTree());

                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop9;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interfaceMember"

    public static class classDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDefinition"
    // PhpTree.g:37:1: classDefinition : ^( Class ^( Modifiers ( classModifier )? ) UnquotedString ( ^( Extends UnquotedString ) )? ( classImplements )? ( classMember )* ) ;
    public final PhpTree.classDefinition_return classDefinition() throws RecognitionException {
        PhpTree.classDefinition_return retval = new PhpTree.classDefinition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Class24=null;
        CommonTree Modifiers25=null;
        CommonTree UnquotedString27=null;
        CommonTree Extends28=null;
        CommonTree UnquotedString29=null;
        PhpTree.classModifier_return classModifier26 = null;

        PhpTree.classImplements_return classImplements30 = null;

        PhpTree.classMember_return classMember31 = null;


        CommonTree Class24_tree=null;
        CommonTree Modifiers25_tree=null;
        CommonTree UnquotedString27_tree=null;
        CommonTree Extends28_tree=null;
        CommonTree UnquotedString29_tree=null;

        try {
            // PhpTree.g:38:5: ( ^( Class ^( Modifiers ( classModifier )? ) UnquotedString ( ^( Extends UnquotedString ) )? ( classImplements )? ( classMember )* ) )
            // PhpTree.g:38:9: ^( Class ^( Modifiers ( classModifier )? ) UnquotedString ( ^( Extends UnquotedString ) )? ( classImplements )? ( classMember )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Class24=(CommonTree)match(input,Class,FOLLOW_Class_in_classDefinition223); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Class24_tree = (CommonTree)adaptor.dupNode(Class24);

            root_1 = (CommonTree)adaptor.becomeRoot(Class24_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Modifiers25=(CommonTree)match(input,Modifiers,FOLLOW_Modifiers_in_classDefinition226); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Modifiers25_tree = (CommonTree)adaptor.dupNode(Modifiers25);

            root_2 = (CommonTree)adaptor.becomeRoot(Modifiers25_tree, root_2);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // PhpTree.g:38:29: ( classModifier )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Abstract) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // PhpTree.g:0:0: classModifier
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_classModifier_in_classDefinition228);
                        classModifier26=classModifier();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_2, classModifier26.getTree());

                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            _last = (CommonTree)input.LT(1);
            UnquotedString27=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition232); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString27_tree = (CommonTree)adaptor.dupNode(UnquotedString27);

            adaptor.addChild(root_1, UnquotedString27_tree);
            }
            // PhpTree.g:38:60: ( ^( Extends UnquotedString ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Extends) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // PhpTree.g:38:61: ^( Extends UnquotedString )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Extends28=(CommonTree)match(input,Extends,FOLLOW_Extends_in_classDefinition236); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Extends28_tree = (CommonTree)adaptor.dupNode(Extends28);

                    root_2 = (CommonTree)adaptor.becomeRoot(Extends28_tree, root_2);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString29=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition238); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString29_tree = (CommonTree)adaptor.dupNode(UnquotedString29);

                    adaptor.addChild(root_2, UnquotedString29_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }

            // PhpTree.g:38:89: ( classImplements )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Implements) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // PhpTree.g:0:0: classImplements
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_classImplements_in_classDefinition243);
                    classImplements30=classImplements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, classImplements30.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }

            // PhpTree.g:38:106: ( classMember )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=Var && LA14_0<=Const)||(LA14_0>=Field && LA14_0<=Method)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // PhpTree.g:0:0: classMember
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_classMember_in_classDefinition246);
            	    classMember31=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, classMember31.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDefinition"

    public static class classImplements_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classImplements"
    // PhpTree.g:41:1: classImplements : ^( Implements ( UnquotedString )+ ) ;
    public final PhpTree.classImplements_return classImplements() throws RecognitionException {
        PhpTree.classImplements_return retval = new PhpTree.classImplements_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Implements32=null;
        CommonTree UnquotedString33=null;

        CommonTree Implements32_tree=null;
        CommonTree UnquotedString33_tree=null;

        try {
            // PhpTree.g:42:5: ( ^( Implements ( UnquotedString )+ ) )
            // PhpTree.g:42:8: ^( Implements ( UnquotedString )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Implements32=(CommonTree)match(input,Implements,FOLLOW_Implements_in_classImplements271); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Implements32_tree = (CommonTree)adaptor.dupNode(Implements32);

            root_1 = (CommonTree)adaptor.becomeRoot(Implements32_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // PhpTree.g:42:21: ( UnquotedString )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==UnquotedString) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // PhpTree.g:0:0: UnquotedString
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    UnquotedString33=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements273); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    UnquotedString33_tree = (CommonTree)adaptor.dupNode(UnquotedString33);

            	    adaptor.addChild(root_1, UnquotedString33_tree);
            	    }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classImplements"

    public static class classMember_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // PhpTree.g:45:1: classMember : ( ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ( statementBlock )? ) | ^( Var ^( Dollar UnquotedString ) ( atom )? ) | ^( Const UnquotedString ( atom )? ) | ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) );
    public final PhpTree.classMember_return classMember() throws RecognitionException {
        PhpTree.classMember_return retval = new PhpTree.classMember_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Method34=null;
        CommonTree Modifiers35=null;
        CommonTree UnquotedString37=null;
        CommonTree Params38=null;
        CommonTree Var41=null;
        CommonTree Dollar42=null;
        CommonTree UnquotedString43=null;
        CommonTree Const45=null;
        CommonTree UnquotedString46=null;
        CommonTree Field48=null;
        CommonTree Modifiers49=null;
        CommonTree Dollar51=null;
        CommonTree UnquotedString52=null;
        PhpTree.fieldModifier_return fieldModifier36 = null;

        PhpTree.paramDef_return paramDef39 = null;

        PhpTree.statementBlock_return statementBlock40 = null;

        PhpTree.atom_return atom44 = null;

        PhpTree.atom_return atom47 = null;

        PhpTree.fieldModifier_return fieldModifier50 = null;

        PhpTree.atom_return atom53 = null;


        CommonTree Method34_tree=null;
        CommonTree Modifiers35_tree=null;
        CommonTree UnquotedString37_tree=null;
        CommonTree Params38_tree=null;
        CommonTree Var41_tree=null;
        CommonTree Dollar42_tree=null;
        CommonTree UnquotedString43_tree=null;
        CommonTree Const45_tree=null;
        CommonTree UnquotedString46_tree=null;
        CommonTree Field48_tree=null;
        CommonTree Modifiers49_tree=null;
        CommonTree Dollar51_tree=null;
        CommonTree UnquotedString52_tree=null;

        try {
            // PhpTree.g:46:5: ( ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ( statementBlock )? ) | ^( Var ^( Dollar UnquotedString ) ( atom )? ) | ^( Const UnquotedString ( atom )? ) | ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case Method:
                {
                alt23=1;
                }
                break;
            case Var:
                {
                alt23=2;
                }
                break;
            case Const:
                {
                alt23=3;
                }
                break;
            case Field:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // PhpTree.g:46:7: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString ^( Params ( paramDef )* ) ( statementBlock )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Method34=(CommonTree)match(input,Method,FOLLOW_Method_in_classMember293); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Method34_tree = (CommonTree)adaptor.dupNode(Method34);

                    root_1 = (CommonTree)adaptor.becomeRoot(Method34_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Modifiers35=(CommonTree)match(input,Modifiers,FOLLOW_Modifiers_in_classMember296); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Modifiers35_tree = (CommonTree)adaptor.dupNode(Modifiers35);

                    root_2 = (CommonTree)adaptor.becomeRoot(Modifiers35_tree, root_2);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // PhpTree.g:46:28: ( fieldModifier )*
                        loop16:
                        do {
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==Static||LA16_0==Abstract||LA16_0==AccessModifier) ) {
                                alt16=1;
                            }


                            switch (alt16) {
                        	case 1 :
                        	    // PhpTree.g:0:0: fieldModifier
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_fieldModifier_in_classMember298);
                        	    fieldModifier36=fieldModifier();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_2, fieldModifier36.getTree());

                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop16;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    UnquotedString37=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember302); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString37_tree = (CommonTree)adaptor.dupNode(UnquotedString37);

                    adaptor.addChild(root_1, UnquotedString37_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Params38=(CommonTree)match(input,Params,FOLLOW_Params_in_classMember305); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Params38_tree = (CommonTree)adaptor.dupNode(Params38);

                    root_2 = (CommonTree)adaptor.becomeRoot(Params38_tree, root_2);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // PhpTree.g:46:68: ( paramDef )*
                        loop17:
                        do {
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==Dollar||LA17_0==Ampersand||LA17_0==Equals) ) {
                                alt17=1;
                            }


                            switch (alt17) {
                        	case 1 :
                        	    // PhpTree.g:0:0: paramDef
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_paramDef_in_classMember307);
                        	    paramDef39=paramDef();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_2, paramDef39.getTree());

                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop17;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // PhpTree.g:46:79: ( statementBlock )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==Block) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // PhpTree.g:0:0: statementBlock
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_statementBlock_in_classMember311);
                            statementBlock40=statementBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, statementBlock40.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:47:7: ^( Var ^( Dollar UnquotedString ) ( atom )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Var41=(CommonTree)match(input,Var,FOLLOW_Var_in_classMember322); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Var41_tree = (CommonTree)adaptor.dupNode(Var41);

                    root_1 = (CommonTree)adaptor.becomeRoot(Var41_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Dollar42=(CommonTree)match(input,Dollar,FOLLOW_Dollar_in_classMember325); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar42_tree = (CommonTree)adaptor.dupNode(Dollar42);

                    root_2 = (CommonTree)adaptor.becomeRoot(Dollar42_tree, root_2);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString43=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString43_tree = (CommonTree)adaptor.dupNode(UnquotedString43);

                    adaptor.addChild(root_2, UnquotedString43_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // PhpTree.g:47:38: ( atom )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Integer||(LA19_0>=Array && LA19_0<=Boolean)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // PhpTree.g:0:0: atom
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_atom_in_classMember330);
                            atom44=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, atom44.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // PhpTree.g:48:7: ^( Const UnquotedString ( atom )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Const45=(CommonTree)match(input,Const,FOLLOW_Const_in_classMember342); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Const45_tree = (CommonTree)adaptor.dupNode(Const45);

                    root_1 = (CommonTree)adaptor.becomeRoot(Const45_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString46=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember344); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString46_tree = (CommonTree)adaptor.dupNode(UnquotedString46);

                    adaptor.addChild(root_1, UnquotedString46_tree);
                    }
                    // PhpTree.g:48:30: ( atom )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==Integer||(LA20_0>=Array && LA20_0<=Boolean)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // PhpTree.g:0:0: atom
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_atom_in_classMember346);
                            atom47=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, atom47.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // PhpTree.g:49:7: ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Field48=(CommonTree)match(input,Field,FOLLOW_Field_in_classMember357); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Field48_tree = (CommonTree)adaptor.dupNode(Field48);

                    root_1 = (CommonTree)adaptor.becomeRoot(Field48_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Modifiers49=(CommonTree)match(input,Modifiers,FOLLOW_Modifiers_in_classMember360); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Modifiers49_tree = (CommonTree)adaptor.dupNode(Modifiers49);

                    root_2 = (CommonTree)adaptor.becomeRoot(Modifiers49_tree, root_2);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // PhpTree.g:49:27: ( fieldModifier )*
                        loop21:
                        do {
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==Static||LA21_0==Abstract||LA21_0==AccessModifier) ) {
                                alt21=1;
                            }


                            switch (alt21) {
                        	case 1 :
                        	    // PhpTree.g:0:0: fieldModifier
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_fieldModifier_in_classMember362);
                        	    fieldModifier50=fieldModifier();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_2, fieldModifier50.getTree());

                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop21;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Dollar51=(CommonTree)match(input,Dollar,FOLLOW_Dollar_in_classMember367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar51_tree = (CommonTree)adaptor.dupNode(Dollar51);

                    root_2 = (CommonTree)adaptor.becomeRoot(Dollar51_tree, root_2);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString52=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString52_tree = (CommonTree)adaptor.dupNode(UnquotedString52);

                    adaptor.addChild(root_2, UnquotedString52_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // PhpTree.g:49:68: ( atom )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==Integer||(LA22_0>=Array && LA22_0<=Boolean)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // PhpTree.g:0:0: atom
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_atom_in_classMember372);
                            atom53=atom();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, atom53.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class statementBlock_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementBlock"
    // PhpTree.g:52:1: statementBlock : ^( Block ( statement )* ) ;
    public final PhpTree.statementBlock_return statementBlock() throws RecognitionException {
        PhpTree.statementBlock_return retval = new PhpTree.statementBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Block54=null;
        PhpTree.statement_return statement55 = null;


        CommonTree Block54_tree=null;

        try {
            // PhpTree.g:53:5: ( ^( Block ( statement )* ) )
            // PhpTree.g:53:7: ^( Block ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Block54=(CommonTree)match(input,Block,FOLLOW_Block_in_statementBlock396); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Block54_tree = (CommonTree)adaptor.dupNode(Block54);

            root_1 = (CommonTree)adaptor.becomeRoot(Block54_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // PhpTree.g:53:15: ( statement )*
                loop24:
                do {
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==OpenSquareBrace||(LA24_0>=LogicalOr && LA24_0<=SuppressWarnings)||LA24_0==Dollar||(LA24_0>=Dot && LA24_0<=If)||(LA24_0>=For && LA24_0<=Switch)||(LA24_0>=Function && LA24_0<=Interface)||LA24_0==Block||LA24_0==Apply||(LA24_0>=Prefix && LA24_0<=IfExpression)||LA24_0==Cast||(LA24_0>=BodyString && LA24_0<=UnquotedString)||(LA24_0>=Integer && LA24_0<=EqualityOperator)||LA24_0==ShiftOperator||(LA24_0>=Array && LA24_0<=Boolean)) ) {
                        alt24=1;
                    }


                    switch (alt24) {
                	case 1 :
                	    // PhpTree.g:0:0: statement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_statement_in_statementBlock398);
                	    statement55=statement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, statement55.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop24;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementBlock"

    public static class fieldDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldDefinition"
    // PhpTree.g:56:1: fieldDefinition : ^( Field ^( Dollar UnquotedString ) ( atom )? ) ;
    public final PhpTree.fieldDefinition_return fieldDefinition() throws RecognitionException {
        PhpTree.fieldDefinition_return retval = new PhpTree.fieldDefinition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Field56=null;
        CommonTree Dollar57=null;
        CommonTree UnquotedString58=null;
        PhpTree.atom_return atom59 = null;


        CommonTree Field56_tree=null;
        CommonTree Dollar57_tree=null;
        CommonTree UnquotedString58_tree=null;

        try {
            // PhpTree.g:57:5: ( ^( Field ^( Dollar UnquotedString ) ( atom )? ) )
            // PhpTree.g:57:7: ^( Field ^( Dollar UnquotedString ) ( atom )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Field56=(CommonTree)match(input,Field,FOLLOW_Field_in_fieldDefinition418); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Field56_tree = (CommonTree)adaptor.dupNode(Field56);

            root_1 = (CommonTree)adaptor.becomeRoot(Field56_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Dollar57=(CommonTree)match(input,Dollar,FOLLOW_Dollar_in_fieldDefinition421); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Dollar57_tree = (CommonTree)adaptor.dupNode(Dollar57);

            root_2 = (CommonTree)adaptor.becomeRoot(Dollar57_tree, root_2);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            UnquotedString58=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_fieldDefinition423); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString58_tree = (CommonTree)adaptor.dupNode(UnquotedString58);

            adaptor.addChild(root_2, UnquotedString58_tree);
            }

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            // PhpTree.g:57:40: ( atom )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Integer||(LA25_0>=Array && LA25_0<=Boolean)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // PhpTree.g:0:0: atom
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_fieldDefinition426);
                    atom59=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, atom59.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldDefinition"

    public static class classModifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classModifier"
    // PhpTree.g:60:1: classModifier : 'abstract' ;
    public final PhpTree.classModifier_return classModifier() throws RecognitionException {
        PhpTree.classModifier_return retval = new PhpTree.classModifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal60=null;

        CommonTree string_literal60_tree=null;

        try {
            // PhpTree.g:61:5: ( 'abstract' )
            // PhpTree.g:61:7: 'abstract'
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            string_literal60=(CommonTree)match(input,Abstract,FOLLOW_Abstract_in_classModifier449); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal60_tree = (CommonTree)adaptor.dupNode(string_literal60);

            adaptor.addChild(root_0, string_literal60_tree);
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classModifier"

    public static class fieldModifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldModifier"
    // PhpTree.g:63:1: fieldModifier : ( AccessModifier | 'abstract' | 'static' );
    public final PhpTree.fieldModifier_return fieldModifier() throws RecognitionException {
        PhpTree.fieldModifier_return retval = new PhpTree.fieldModifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set61=null;

        CommonTree set61_tree=null;

        try {
            // PhpTree.g:64:5: ( AccessModifier | 'abstract' | 'static' )
            // PhpTree.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set61=(CommonTree)input.LT(1);
            if ( input.LA(1)==Static||input.LA(1)==Abstract||input.LA(1)==AccessModifier ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set61_tree = (CommonTree)adaptor.dupNode(set61);

                adaptor.addChild(root_0, set61_tree);
                }
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
            } 

            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldModifier"

    public static class complexStatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "complexStatement"
    // PhpTree.g:68:1: complexStatement : ( ^( 'if' expression statement ( statement )? ) | ^( For forInit forCondition forUpdate statement ) | ^( Foreach variable arrayEntry statement ) | ^( While expression statement ) | ^( Do statement expression ) | ^( Switch expression cases ) | functionDefinition );
    public final PhpTree.complexStatement_return complexStatement() throws RecognitionException {
        PhpTree.complexStatement_return retval = new PhpTree.complexStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal62=null;
        CommonTree For66=null;
        CommonTree Foreach71=null;
        CommonTree While75=null;
        CommonTree Do78=null;
        CommonTree Switch81=null;
        PhpTree.expression_return expression63 = null;

        PhpTree.statement_return statement64 = null;

        PhpTree.statement_return statement65 = null;

        PhpTree.forInit_return forInit67 = null;

        PhpTree.forCondition_return forCondition68 = null;

        PhpTree.forUpdate_return forUpdate69 = null;

        PhpTree.statement_return statement70 = null;

        PhpTree.variable_return variable72 = null;

        PhpTree.arrayEntry_return arrayEntry73 = null;

        PhpTree.statement_return statement74 = null;

        PhpTree.expression_return expression76 = null;

        PhpTree.statement_return statement77 = null;

        PhpTree.statement_return statement79 = null;

        PhpTree.expression_return expression80 = null;

        PhpTree.expression_return expression82 = null;

        PhpTree.cases_return cases83 = null;

        PhpTree.functionDefinition_return functionDefinition84 = null;


        CommonTree string_literal62_tree=null;
        CommonTree For66_tree=null;
        CommonTree Foreach71_tree=null;
        CommonTree While75_tree=null;
        CommonTree Do78_tree=null;
        CommonTree Switch81_tree=null;

        try {
            // PhpTree.g:69:5: ( ^( 'if' expression statement ( statement )? ) | ^( For forInit forCondition forUpdate statement ) | ^( Foreach variable arrayEntry statement ) | ^( While expression statement ) | ^( Do statement expression ) | ^( Switch expression cases ) | functionDefinition )
            int alt27=7;
            switch ( input.LA(1) ) {
            case If:
                {
                alt27=1;
                }
                break;
            case For:
                {
                alt27=2;
                }
                break;
            case Foreach:
                {
                alt27=3;
                }
                break;
            case While:
                {
                alt27=4;
                }
                break;
            case Do:
                {
                alt27=5;
                }
                break;
            case Switch:
                {
                alt27=6;
                }
                break;
            case Function:
                {
                alt27=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // PhpTree.g:69:7: ^( 'if' expression statement ( statement )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal62=(CommonTree)match(input,If,FOLLOW_If_in_complexStatement493); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal62_tree = (CommonTree)adaptor.dupNode(string_literal62);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal62_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_complexStatement495);
                    expression63=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression63.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_complexStatement497);
                    statement64=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement64.getTree());
                    // PhpTree.g:69:35: ( statement )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==OpenSquareBrace||(LA26_0>=LogicalOr && LA26_0<=SuppressWarnings)||LA26_0==Dollar||(LA26_0>=Dot && LA26_0<=If)||(LA26_0>=For && LA26_0<=Switch)||(LA26_0>=Function && LA26_0<=Interface)||LA26_0==Block||LA26_0==Apply||(LA26_0>=Prefix && LA26_0<=IfExpression)||LA26_0==Cast||(LA26_0>=BodyString && LA26_0<=UnquotedString)||(LA26_0>=Integer && LA26_0<=EqualityOperator)||LA26_0==ShiftOperator||(LA26_0>=Array && LA26_0<=Boolean)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // PhpTree.g:0:0: statement
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_statement_in_complexStatement499);
                            statement65=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, statement65.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:70:7: ^( For forInit forCondition forUpdate statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    For66=(CommonTree)match(input,For,FOLLOW_For_in_complexStatement510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    For66_tree = (CommonTree)adaptor.dupNode(For66);

                    root_1 = (CommonTree)adaptor.becomeRoot(For66_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_forInit_in_complexStatement512);
                    forInit67=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, forInit67.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_forCondition_in_complexStatement514);
                    forCondition68=forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, forCondition68.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_forUpdate_in_complexStatement516);
                    forUpdate69=forUpdate();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, forUpdate69.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_complexStatement518);
                    statement70=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement70.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // PhpTree.g:71:7: ^( Foreach variable arrayEntry statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Foreach71=(CommonTree)match(input,Foreach,FOLLOW_Foreach_in_complexStatement528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Foreach71_tree = (CommonTree)adaptor.dupNode(Foreach71);

                    root_1 = (CommonTree)adaptor.becomeRoot(Foreach71_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_complexStatement530);
                    variable72=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variable72.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayEntry_in_complexStatement532);
                    arrayEntry73=arrayEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arrayEntry73.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_complexStatement534);
                    statement74=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement74.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // PhpTree.g:72:7: ^( While expression statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    While75=(CommonTree)match(input,While,FOLLOW_While_in_complexStatement544); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    While75_tree = (CommonTree)adaptor.dupNode(While75);

                    root_1 = (CommonTree)adaptor.becomeRoot(While75_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_complexStatement546);
                    expression76=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression76.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_complexStatement548);
                    statement77=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement77.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // PhpTree.g:73:7: ^( Do statement expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Do78=(CommonTree)match(input,Do,FOLLOW_Do_in_complexStatement558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Do78_tree = (CommonTree)adaptor.dupNode(Do78);

                    root_1 = (CommonTree)adaptor.becomeRoot(Do78_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_complexStatement560);
                    statement79=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement79.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_complexStatement562);
                    expression80=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression80.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // PhpTree.g:74:7: ^( Switch expression cases )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Switch81=(CommonTree)match(input,Switch,FOLLOW_Switch_in_complexStatement572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Switch81_tree = (CommonTree)adaptor.dupNode(Switch81);

                    root_1 = (CommonTree)adaptor.becomeRoot(Switch81_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_complexStatement574);
                    expression82=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression82.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_cases_in_complexStatement576);
                    cases83=cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, cases83.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // PhpTree.g:75:7: functionDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_functionDefinition_in_complexStatement585);
                    functionDefinition84=functionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, functionDefinition84.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "complexStatement"

    public static class simpleStatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleStatement"
    // PhpTree.g:78:1: simpleStatement : ( ^( Echo ( expression )+ ) | ^( Global ( name )+ ) | ^( Static variable atom ) | ^( Break ( Integer )? ) | ^( Continue ( Integer )? ) | ^( Return ( expression )? ) | ^( RequireOperator expression ) | expression );
    public final PhpTree.simpleStatement_return simpleStatement() throws RecognitionException {
        PhpTree.simpleStatement_return retval = new PhpTree.simpleStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Echo85=null;
        CommonTree Global87=null;
        CommonTree Static89=null;
        CommonTree Break92=null;
        CommonTree Integer93=null;
        CommonTree Continue94=null;
        CommonTree Integer95=null;
        CommonTree Return96=null;
        CommonTree RequireOperator98=null;
        PhpTree.expression_return expression86 = null;

        PhpTree.name_return name88 = null;

        PhpTree.variable_return variable90 = null;

        PhpTree.atom_return atom91 = null;

        PhpTree.expression_return expression97 = null;

        PhpTree.expression_return expression99 = null;

        PhpTree.expression_return expression100 = null;


        CommonTree Echo85_tree=null;
        CommonTree Global87_tree=null;
        CommonTree Static89_tree=null;
        CommonTree Break92_tree=null;
        CommonTree Integer93_tree=null;
        CommonTree Continue94_tree=null;
        CommonTree Integer95_tree=null;
        CommonTree Return96_tree=null;
        CommonTree RequireOperator98_tree=null;

        try {
            // PhpTree.g:79:5: ( ^( Echo ( expression )+ ) | ^( Global ( name )+ ) | ^( Static variable atom ) | ^( Break ( Integer )? ) | ^( Continue ( Integer )? ) | ^( Return ( expression )? ) | ^( RequireOperator expression ) | expression )
            int alt33=8;
            switch ( input.LA(1) ) {
            case Echo:
                {
                alt33=1;
                }
                break;
            case Global:
                {
                alt33=2;
                }
                break;
            case Static:
                {
                alt33=3;
                }
                break;
            case Break:
                {
                alt33=4;
                }
                break;
            case Continue:
                {
                alt33=5;
                }
                break;
            case Return:
                {
                alt33=6;
                }
                break;
            case RequireOperator:
                {
                alt33=7;
                }
                break;
            case OpenSquareBrace:
            case LogicalOr:
            case LogicalAnd:
            case ClassMember:
            case InstanceMember:
            case SuppressWarnings:
            case Dollar:
            case Dot:
            case Ampersand:
            case Pipe:
            case Bang:
            case Plus:
            case Minus:
            case Asterisk:
            case Percent:
            case Forwardslash:
            case Tilde:
            case Equals:
            case New:
            case Clone:
            case And:
            case Or:
            case Xor:
            case Instanceof:
            case Apply:
            case Prefix:
            case Postfix:
            case IfExpression:
            case Cast:
            case UnquotedString:
            case Integer:
            case AsignmentOperator:
            case EqualityOperator:
            case ShiftOperator:
            case Array:
            case SingleQuotedString:
            case DoubleQuotedString:
            case HereDoc:
            case Real:
            case Boolean:
                {
                alt33=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // PhpTree.g:79:7: ^( Echo ( expression )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Echo85=(CommonTree)match(input,Echo,FOLLOW_Echo_in_simpleStatement603); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Echo85_tree = (CommonTree)adaptor.dupNode(Echo85);

                    root_1 = (CommonTree)adaptor.becomeRoot(Echo85_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // PhpTree.g:79:14: ( expression )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==OpenSquareBrace||(LA28_0>=LogicalOr && LA28_0<=SuppressWarnings)||LA28_0==Dollar||(LA28_0>=Dot && LA28_0<=Clone)||(LA28_0>=And && LA28_0<=Instanceof)||LA28_0==Apply||(LA28_0>=Prefix && LA28_0<=IfExpression)||LA28_0==Cast||LA28_0==UnquotedString||LA28_0==Integer||(LA28_0>=AsignmentOperator && LA28_0<=EqualityOperator)||LA28_0==ShiftOperator||(LA28_0>=Array && LA28_0<=Boolean)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // PhpTree.g:0:0: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_simpleStatement605);
                    	    expression86=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression86.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:80:7: ^( Global ( name )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Global87=(CommonTree)match(input,Global,FOLLOW_Global_in_simpleStatement616); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Global87_tree = (CommonTree)adaptor.dupNode(Global87);

                    root_1 = (CommonTree)adaptor.becomeRoot(Global87_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // PhpTree.g:80:16: ( name )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==OpenSquareBrace||(LA29_0>=ClassMember && LA29_0<=InstanceMember)||LA29_0==Dollar||LA29_0==UnquotedString) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // PhpTree.g:0:0: name
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_name_in_simpleStatement618);
                    	    name88=name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, name88.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // PhpTree.g:81:7: ^( Static variable atom )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Static89=(CommonTree)match(input,Static,FOLLOW_Static_in_simpleStatement629); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Static89_tree = (CommonTree)adaptor.dupNode(Static89);

                    root_1 = (CommonTree)adaptor.becomeRoot(Static89_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_simpleStatement631);
                    variable90=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variable90.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_simpleStatement633);
                    atom91=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, atom91.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // PhpTree.g:82:7: ^( Break ( Integer )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Break92=(CommonTree)match(input,Break,FOLLOW_Break_in_simpleStatement643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Break92_tree = (CommonTree)adaptor.dupNode(Break92);

                    root_1 = (CommonTree)adaptor.becomeRoot(Break92_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // PhpTree.g:82:15: ( Integer )?
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==Integer) ) {
                            alt30=1;
                        }
                        switch (alt30) {
                            case 1 :
                                // PhpTree.g:0:0: Integer
                                {
                                _last = (CommonTree)input.LT(1);
                                Integer93=(CommonTree)match(input,Integer,FOLLOW_Integer_in_simpleStatement645); if (state.failed) return retval;
                                if ( state.backtracking==0 ) {
                                Integer93_tree = (CommonTree)adaptor.dupNode(Integer93);

                                adaptor.addChild(root_1, Integer93_tree);
                                }

                                if ( state.backtracking==0 ) {
                                }
                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // PhpTree.g:83:7: ^( Continue ( Integer )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Continue94=(CommonTree)match(input,Continue,FOLLOW_Continue_in_simpleStatement656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Continue94_tree = (CommonTree)adaptor.dupNode(Continue94);

                    root_1 = (CommonTree)adaptor.becomeRoot(Continue94_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // PhpTree.g:83:18: ( Integer )?
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Integer) ) {
                            alt31=1;
                        }
                        switch (alt31) {
                            case 1 :
                                // PhpTree.g:0:0: Integer
                                {
                                _last = (CommonTree)input.LT(1);
                                Integer95=(CommonTree)match(input,Integer,FOLLOW_Integer_in_simpleStatement658); if (state.failed) return retval;
                                if ( state.backtracking==0 ) {
                                Integer95_tree = (CommonTree)adaptor.dupNode(Integer95);

                                adaptor.addChild(root_1, Integer95_tree);
                                }

                                if ( state.backtracking==0 ) {
                                }
                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // PhpTree.g:85:7: ^( Return ( expression )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Return96=(CommonTree)match(input,Return,FOLLOW_Return_in_simpleStatement674); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Return96_tree = (CommonTree)adaptor.dupNode(Return96);

                    root_1 = (CommonTree)adaptor.becomeRoot(Return96_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // PhpTree.g:85:16: ( expression )?
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==OpenSquareBrace||(LA32_0>=LogicalOr && LA32_0<=SuppressWarnings)||LA32_0==Dollar||(LA32_0>=Dot && LA32_0<=Clone)||(LA32_0>=And && LA32_0<=Instanceof)||LA32_0==Apply||(LA32_0>=Prefix && LA32_0<=IfExpression)||LA32_0==Cast||LA32_0==UnquotedString||LA32_0==Integer||(LA32_0>=AsignmentOperator && LA32_0<=EqualityOperator)||LA32_0==ShiftOperator||(LA32_0>=Array && LA32_0<=Boolean)) ) {
                            alt32=1;
                        }
                        switch (alt32) {
                            case 1 :
                                // PhpTree.g:0:0: expression
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_expression_in_simpleStatement676);
                                expression97=expression();

                                state._fsp--;
                                if (state.failed) return retval;
                                if ( state.backtracking==0 ) 
                                adaptor.addChild(root_1, expression97.getTree());

                                if ( state.backtracking==0 ) {
                                }
                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // PhpTree.g:86:7: ^( RequireOperator expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    RequireOperator98=(CommonTree)match(input,RequireOperator,FOLLOW_RequireOperator_in_simpleStatement687); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RequireOperator98_tree = (CommonTree)adaptor.dupNode(RequireOperator98);

                    root_1 = (CommonTree)adaptor.becomeRoot(RequireOperator98_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_simpleStatement689);
                    expression99=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression99.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // PhpTree.g:87:7: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_simpleStatement698);
                    expression100=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, expression100.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleStatement"

    public static class forInit_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // PhpTree.g:91:1: forInit : ^( ForInit ( expression )+ ) ;
    public final PhpTree.forInit_return forInit() throws RecognitionException {
        PhpTree.forInit_return retval = new PhpTree.forInit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ForInit101=null;
        PhpTree.expression_return expression102 = null;


        CommonTree ForInit101_tree=null;

        try {
            // PhpTree.g:92:5: ( ^( ForInit ( expression )+ ) )
            // PhpTree.g:92:7: ^( ForInit ( expression )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ForInit101=(CommonTree)match(input,ForInit,FOLLOW_ForInit_in_forInit717); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ForInit101_tree = (CommonTree)adaptor.dupNode(ForInit101);

            root_1 = (CommonTree)adaptor.becomeRoot(ForInit101_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // PhpTree.g:92:17: ( expression )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==OpenSquareBrace||(LA34_0>=LogicalOr && LA34_0<=SuppressWarnings)||LA34_0==Dollar||(LA34_0>=Dot && LA34_0<=Clone)||(LA34_0>=And && LA34_0<=Instanceof)||LA34_0==Apply||(LA34_0>=Prefix && LA34_0<=IfExpression)||LA34_0==Cast||LA34_0==UnquotedString||LA34_0==Integer||(LA34_0>=AsignmentOperator && LA34_0<=EqualityOperator)||LA34_0==ShiftOperator||(LA34_0>=Array && LA34_0<=Boolean)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // PhpTree.g:0:0: expression
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_forInit719);
            	    expression102=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, expression102.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forCondition"
    // PhpTree.g:95:1: forCondition : ^( ForCondition ( expression )+ ) ;
    public final PhpTree.forCondition_return forCondition() throws RecognitionException {
        PhpTree.forCondition_return retval = new PhpTree.forCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ForCondition103=null;
        PhpTree.expression_return expression104 = null;


        CommonTree ForCondition103_tree=null;

        try {
            // PhpTree.g:96:5: ( ^( ForCondition ( expression )+ ) )
            // PhpTree.g:96:7: ^( ForCondition ( expression )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ForCondition103=(CommonTree)match(input,ForCondition,FOLLOW_ForCondition_in_forCondition739); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ForCondition103_tree = (CommonTree)adaptor.dupNode(ForCondition103);

            root_1 = (CommonTree)adaptor.becomeRoot(ForCondition103_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // PhpTree.g:96:22: ( expression )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==OpenSquareBrace||(LA35_0>=LogicalOr && LA35_0<=SuppressWarnings)||LA35_0==Dollar||(LA35_0>=Dot && LA35_0<=Clone)||(LA35_0>=And && LA35_0<=Instanceof)||LA35_0==Apply||(LA35_0>=Prefix && LA35_0<=IfExpression)||LA35_0==Cast||LA35_0==UnquotedString||LA35_0==Integer||(LA35_0>=AsignmentOperator && LA35_0<=EqualityOperator)||LA35_0==ShiftOperator||(LA35_0>=Array && LA35_0<=Boolean)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // PhpTree.g:0:0: expression
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_forCondition741);
            	    expression104=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, expression104.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forCondition"

    public static class forUpdate_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forUpdate"
    // PhpTree.g:99:1: forUpdate : ^( ForUpdate ( expression )+ ) ;
    public final PhpTree.forUpdate_return forUpdate() throws RecognitionException {
        PhpTree.forUpdate_return retval = new PhpTree.forUpdate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ForUpdate105=null;
        PhpTree.expression_return expression106 = null;


        CommonTree ForUpdate105_tree=null;

        try {
            // PhpTree.g:100:5: ( ^( ForUpdate ( expression )+ ) )
            // PhpTree.g:100:7: ^( ForUpdate ( expression )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ForUpdate105=(CommonTree)match(input,ForUpdate,FOLLOW_ForUpdate_in_forUpdate765); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ForUpdate105_tree = (CommonTree)adaptor.dupNode(ForUpdate105);

            root_1 = (CommonTree)adaptor.becomeRoot(ForUpdate105_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // PhpTree.g:100:19: ( expression )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==OpenSquareBrace||(LA36_0>=LogicalOr && LA36_0<=SuppressWarnings)||LA36_0==Dollar||(LA36_0>=Dot && LA36_0<=Clone)||(LA36_0>=And && LA36_0<=Instanceof)||LA36_0==Apply||(LA36_0>=Prefix && LA36_0<=IfExpression)||LA36_0==Cast||LA36_0==UnquotedString||LA36_0==Integer||(LA36_0>=AsignmentOperator && LA36_0<=EqualityOperator)||LA36_0==ShiftOperator||(LA36_0>=Array && LA36_0<=Boolean)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // PhpTree.g:0:0: expression
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_forUpdate767);
            	    expression106=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, expression106.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forUpdate"

    public static class cases_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cases"
    // PhpTree.g:103:1: cases : ( casestatement )* defaultcase ;
    public final PhpTree.cases_return cases() throws RecognitionException {
        PhpTree.cases_return retval = new PhpTree.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        PhpTree.casestatement_return casestatement107 = null;

        PhpTree.defaultcase_return defaultcase108 = null;



        try {
            // PhpTree.g:104:5: ( ( casestatement )* defaultcase )
            // PhpTree.g:104:7: ( casestatement )* defaultcase
            {
            root_0 = (CommonTree)adaptor.nil();

            // PhpTree.g:104:7: ( casestatement )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Case) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // PhpTree.g:0:0: casestatement
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_casestatement_in_cases787);
            	    casestatement107=casestatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_0, casestatement107.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_defaultcase_in_cases791);
            defaultcase108=defaultcase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, defaultcase108.getTree());

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cases"

    public static class casestatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "casestatement"
    // PhpTree.g:107:1: casestatement : ^( Case expression ( statement )* ) ;
    public final PhpTree.casestatement_return casestatement() throws RecognitionException {
        PhpTree.casestatement_return retval = new PhpTree.casestatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Case109=null;
        PhpTree.expression_return expression110 = null;

        PhpTree.statement_return statement111 = null;


        CommonTree Case109_tree=null;

        try {
            // PhpTree.g:108:5: ( ^( Case expression ( statement )* ) )
            // PhpTree.g:108:7: ^( Case expression ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Case109=(CommonTree)match(input,Case,FOLLOW_Case_in_casestatement809); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Case109_tree = (CommonTree)adaptor.dupNode(Case109);

            root_1 = (CommonTree)adaptor.becomeRoot(Case109_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_casestatement811);
            expression110=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expression110.getTree());
            // PhpTree.g:108:25: ( statement )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==OpenSquareBrace||(LA38_0>=LogicalOr && LA38_0<=SuppressWarnings)||LA38_0==Dollar||(LA38_0>=Dot && LA38_0<=If)||(LA38_0>=For && LA38_0<=Switch)||(LA38_0>=Function && LA38_0<=Interface)||LA38_0==Block||LA38_0==Apply||(LA38_0>=Prefix && LA38_0<=IfExpression)||LA38_0==Cast||(LA38_0>=BodyString && LA38_0<=UnquotedString)||(LA38_0>=Integer && LA38_0<=EqualityOperator)||LA38_0==ShiftOperator||(LA38_0>=Array && LA38_0<=Boolean)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // PhpTree.g:0:0: statement
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_statement_in_casestatement813);
            	    statement111=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, statement111.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "casestatement"

    public static class defaultcase_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultcase"
    // PhpTree.g:111:1: defaultcase : ^( Default ( statement )* ) ;
    public final PhpTree.defaultcase_return defaultcase() throws RecognitionException {
        PhpTree.defaultcase_return retval = new PhpTree.defaultcase_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Default112=null;
        PhpTree.statement_return statement113 = null;


        CommonTree Default112_tree=null;

        try {
            // PhpTree.g:112:5: ( ^( Default ( statement )* ) )
            // PhpTree.g:112:7: ^( Default ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Default112=(CommonTree)match(input,Default,FOLLOW_Default_in_defaultcase834); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Default112_tree = (CommonTree)adaptor.dupNode(Default112);

            root_1 = (CommonTree)adaptor.becomeRoot(Default112_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // PhpTree.g:112:17: ( statement )*
                loop39:
                do {
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==OpenSquareBrace||(LA39_0>=LogicalOr && LA39_0<=SuppressWarnings)||LA39_0==Dollar||(LA39_0>=Dot && LA39_0<=If)||(LA39_0>=For && LA39_0<=Switch)||(LA39_0>=Function && LA39_0<=Interface)||LA39_0==Block||LA39_0==Apply||(LA39_0>=Prefix && LA39_0<=IfExpression)||LA39_0==Cast||(LA39_0>=BodyString && LA39_0<=UnquotedString)||(LA39_0>=Integer && LA39_0<=EqualityOperator)||LA39_0==ShiftOperator||(LA39_0>=Array && LA39_0<=Boolean)) ) {
                        alt39=1;
                    }


                    switch (alt39) {
                	case 1 :
                	    // PhpTree.g:0:0: statement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_statement_in_defaultcase836);
                	    statement113=statement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, statement113.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop39;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defaultcase"

    public static class functionDefinition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDefinition"
    // PhpTree.g:115:1: functionDefinition : ^( Function UnquotedString ^( Params ( paramDef )* ) ^( Block ( statement )* ) ) ;
    public final PhpTree.functionDefinition_return functionDefinition() throws RecognitionException {
        PhpTree.functionDefinition_return retval = new PhpTree.functionDefinition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Function114=null;
        CommonTree UnquotedString115=null;
        CommonTree Params116=null;
        CommonTree Block118=null;
        PhpTree.paramDef_return paramDef117 = null;

        PhpTree.statement_return statement119 = null;


        CommonTree Function114_tree=null;
        CommonTree UnquotedString115_tree=null;
        CommonTree Params116_tree=null;
        CommonTree Block118_tree=null;

        try {
            // PhpTree.g:116:5: ( ^( Function UnquotedString ^( Params ( paramDef )* ) ^( Block ( statement )* ) ) )
            // PhpTree.g:116:7: ^( Function UnquotedString ^( Params ( paramDef )* ) ^( Block ( statement )* ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Function114=(CommonTree)match(input,Function,FOLLOW_Function_in_functionDefinition856); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Function114_tree = (CommonTree)adaptor.dupNode(Function114);

            root_1 = (CommonTree)adaptor.becomeRoot(Function114_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            UnquotedString115=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_functionDefinition858); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString115_tree = (CommonTree)adaptor.dupNode(UnquotedString115);

            adaptor.addChild(root_1, UnquotedString115_tree);
            }
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Params116=(CommonTree)match(input,Params,FOLLOW_Params_in_functionDefinition861); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Params116_tree = (CommonTree)adaptor.dupNode(Params116);

            root_2 = (CommonTree)adaptor.becomeRoot(Params116_tree, root_2);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // PhpTree.g:116:42: ( paramDef )*
                loop40:
                do {
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==Dollar||LA40_0==Ampersand||LA40_0==Equals) ) {
                        alt40=1;
                    }


                    switch (alt40) {
                	case 1 :
                	    // PhpTree.g:0:0: paramDef
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_paramDef_in_functionDefinition863);
                	    paramDef117=paramDef();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_2, paramDef117.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop40;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Block118=(CommonTree)match(input,Block,FOLLOW_Block_in_functionDefinition868); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Block118_tree = (CommonTree)adaptor.dupNode(Block118);

            root_2 = (CommonTree)adaptor.becomeRoot(Block118_tree, root_2);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // PhpTree.g:116:61: ( statement )*
                loop41:
                do {
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==OpenSquareBrace||(LA41_0>=LogicalOr && LA41_0<=SuppressWarnings)||LA41_0==Dollar||(LA41_0>=Dot && LA41_0<=If)||(LA41_0>=For && LA41_0<=Switch)||(LA41_0>=Function && LA41_0<=Interface)||LA41_0==Block||LA41_0==Apply||(LA41_0>=Prefix && LA41_0<=IfExpression)||LA41_0==Cast||(LA41_0>=BodyString && LA41_0<=UnquotedString)||(LA41_0>=Integer && LA41_0<=EqualityOperator)||LA41_0==ShiftOperator||(LA41_0>=Array && LA41_0<=Boolean)) ) {
                        alt41=1;
                    }


                    switch (alt41) {
                	case 1 :
                	    // PhpTree.g:0:0: statement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_statement_in_functionDefinition870);
                	    statement119=statement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_2, statement119.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop41;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"

    public static class paramDef_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramDef"
    // PhpTree.g:119:1: paramDef : ( ^( Equals paramName atom ) | paramName );
    public final PhpTree.paramDef_return paramDef() throws RecognitionException {
        PhpTree.paramDef_return retval = new PhpTree.paramDef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Equals120=null;
        PhpTree.paramName_return paramName121 = null;

        PhpTree.atom_return atom122 = null;

        PhpTree.paramName_return paramName123 = null;


        CommonTree Equals120_tree=null;

        try {
            // PhpTree.g:120:5: ( ^( Equals paramName atom ) | paramName )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Equals) ) {
                alt42=1;
            }
            else if ( (LA42_0==Dollar||LA42_0==Ampersand) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // PhpTree.g:120:7: ^( Equals paramName atom )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Equals120=(CommonTree)match(input,Equals,FOLLOW_Equals_in_paramDef895); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Equals120_tree = (CommonTree)adaptor.dupNode(Equals120);

                    root_1 = (CommonTree)adaptor.becomeRoot(Equals120_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_paramName_in_paramDef897);
                    paramName121=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, paramName121.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_paramDef899);
                    atom122=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, atom122.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:121:7: paramName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_paramName_in_paramDef909);
                    paramName123=paramName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, paramName123.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "paramDef"

    public static class paramName_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramName"
    // PhpTree.g:124:1: paramName : ( ^( Dollar UnquotedString ) | ^( Ampersand ^( Dollar UnquotedString ) ) );
    public final PhpTree.paramName_return paramName() throws RecognitionException {
        PhpTree.paramName_return retval = new PhpTree.paramName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Dollar124=null;
        CommonTree UnquotedString125=null;
        CommonTree Ampersand126=null;
        CommonTree Dollar127=null;
        CommonTree UnquotedString128=null;

        CommonTree Dollar124_tree=null;
        CommonTree UnquotedString125_tree=null;
        CommonTree Ampersand126_tree=null;
        CommonTree Dollar127_tree=null;
        CommonTree UnquotedString128_tree=null;

        try {
            // PhpTree.g:125:5: ( ^( Dollar UnquotedString ) | ^( Ampersand ^( Dollar UnquotedString ) ) )
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
                    // PhpTree.g:125:7: ^( Dollar UnquotedString )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Dollar124=(CommonTree)match(input,Dollar,FOLLOW_Dollar_in_paramName927); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar124_tree = (CommonTree)adaptor.dupNode(Dollar124);

                    root_1 = (CommonTree)adaptor.becomeRoot(Dollar124_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString125=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName929); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString125_tree = (CommonTree)adaptor.dupNode(UnquotedString125);

                    adaptor.addChild(root_1, UnquotedString125_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:126:7: ^( Ampersand ^( Dollar UnquotedString ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Ampersand126=(CommonTree)match(input,Ampersand,FOLLOW_Ampersand_in_paramName939); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Ampersand126_tree = (CommonTree)adaptor.dupNode(Ampersand126);

                    root_1 = (CommonTree)adaptor.becomeRoot(Ampersand126_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Dollar127=(CommonTree)match(input,Dollar,FOLLOW_Dollar_in_paramName942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar127_tree = (CommonTree)adaptor.dupNode(Dollar127);

                    root_2 = (CommonTree)adaptor.becomeRoot(Dollar127_tree, root_2);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    UnquotedString128=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName944); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString128_tree = (CommonTree)adaptor.dupNode(UnquotedString128);

                    adaptor.addChild(root_2, UnquotedString128_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "paramName"

    public static class expression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // PhpTree.g:129:1: expression : ( ^( Or expression expression ) | ^( Xor expression expression ) | ^( And expression expression ) | ^( Equals expression expression ) | ^( AsignmentOperator expression expression ) | ^( IfExpression expression expression expression ) | ^( LogicalOr expression expression ) | ^( LogicalAnd expression expression ) | ^( Pipe expression expression ) | ^( Ampersand expression expression ) | ^( EqualityOperator expression expression ) | ^( ShiftOperator expression expression ) | ^( Plus expression expression ) | ^( Minus expression expression ) | ^( Dot expression expression ) | ^( Asterisk expression expression ) | ^( Forwardslash expression expression ) | ^( Percent expression expression ) | ^( Bang expression ) | ^( Instanceof expression expression ) | ^( Tilde expression ) | ^( Minus expression ) | ^( SuppressWarnings expression ) | ^( Cast PrimitiveType expression ) | ^( Prefix IncrementOperator name ) | ^( Postfix IncrementOperator name ) | ^( New nameOrFunctionCall ) | ^( Clone name ) | atomOrReference );
    public final PhpTree.expression_return expression() throws RecognitionException {
        PhpTree.expression_return retval = new PhpTree.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Or129=null;
        CommonTree Xor132=null;
        CommonTree And135=null;
        CommonTree Equals138=null;
        CommonTree AsignmentOperator141=null;
        CommonTree IfExpression144=null;
        CommonTree LogicalOr148=null;
        CommonTree LogicalAnd151=null;
        CommonTree Pipe154=null;
        CommonTree Ampersand157=null;
        CommonTree EqualityOperator160=null;
        CommonTree ShiftOperator163=null;
        CommonTree Plus166=null;
        CommonTree Minus169=null;
        CommonTree Dot172=null;
        CommonTree Asterisk175=null;
        CommonTree Forwardslash178=null;
        CommonTree Percent181=null;
        CommonTree Bang184=null;
        CommonTree Instanceof186=null;
        CommonTree Tilde189=null;
        CommonTree Minus191=null;
        CommonTree SuppressWarnings193=null;
        CommonTree Cast195=null;
        CommonTree PrimitiveType196=null;
        CommonTree Prefix198=null;
        CommonTree IncrementOperator199=null;
        CommonTree Postfix201=null;
        CommonTree IncrementOperator202=null;
        CommonTree New204=null;
        CommonTree Clone206=null;
        PhpTree.expression_return expression130 = null;

        PhpTree.expression_return expression131 = null;

        PhpTree.expression_return expression133 = null;

        PhpTree.expression_return expression134 = null;

        PhpTree.expression_return expression136 = null;

        PhpTree.expression_return expression137 = null;

        PhpTree.expression_return expression139 = null;

        PhpTree.expression_return expression140 = null;

        PhpTree.expression_return expression142 = null;

        PhpTree.expression_return expression143 = null;

        PhpTree.expression_return expression145 = null;

        PhpTree.expression_return expression146 = null;

        PhpTree.expression_return expression147 = null;

        PhpTree.expression_return expression149 = null;

        PhpTree.expression_return expression150 = null;

        PhpTree.expression_return expression152 = null;

        PhpTree.expression_return expression153 = null;

        PhpTree.expression_return expression155 = null;

        PhpTree.expression_return expression156 = null;

        PhpTree.expression_return expression158 = null;

        PhpTree.expression_return expression159 = null;

        PhpTree.expression_return expression161 = null;

        PhpTree.expression_return expression162 = null;

        PhpTree.expression_return expression164 = null;

        PhpTree.expression_return expression165 = null;

        PhpTree.expression_return expression167 = null;

        PhpTree.expression_return expression168 = null;

        PhpTree.expression_return expression170 = null;

        PhpTree.expression_return expression171 = null;

        PhpTree.expression_return expression173 = null;

        PhpTree.expression_return expression174 = null;

        PhpTree.expression_return expression176 = null;

        PhpTree.expression_return expression177 = null;

        PhpTree.expression_return expression179 = null;

        PhpTree.expression_return expression180 = null;

        PhpTree.expression_return expression182 = null;

        PhpTree.expression_return expression183 = null;

        PhpTree.expression_return expression185 = null;

        PhpTree.expression_return expression187 = null;

        PhpTree.expression_return expression188 = null;

        PhpTree.expression_return expression190 = null;

        PhpTree.expression_return expression192 = null;

        PhpTree.expression_return expression194 = null;

        PhpTree.expression_return expression197 = null;

        PhpTree.name_return name200 = null;

        PhpTree.name_return name203 = null;

        PhpTree.nameOrFunctionCall_return nameOrFunctionCall205 = null;

        PhpTree.name_return name207 = null;

        PhpTree.atomOrReference_return atomOrReference208 = null;


        CommonTree Or129_tree=null;
        CommonTree Xor132_tree=null;
        CommonTree And135_tree=null;
        CommonTree Equals138_tree=null;
        CommonTree AsignmentOperator141_tree=null;
        CommonTree IfExpression144_tree=null;
        CommonTree LogicalOr148_tree=null;
        CommonTree LogicalAnd151_tree=null;
        CommonTree Pipe154_tree=null;
        CommonTree Ampersand157_tree=null;
        CommonTree EqualityOperator160_tree=null;
        CommonTree ShiftOperator163_tree=null;
        CommonTree Plus166_tree=null;
        CommonTree Minus169_tree=null;
        CommonTree Dot172_tree=null;
        CommonTree Asterisk175_tree=null;
        CommonTree Forwardslash178_tree=null;
        CommonTree Percent181_tree=null;
        CommonTree Bang184_tree=null;
        CommonTree Instanceof186_tree=null;
        CommonTree Tilde189_tree=null;
        CommonTree Minus191_tree=null;
        CommonTree SuppressWarnings193_tree=null;
        CommonTree Cast195_tree=null;
        CommonTree PrimitiveType196_tree=null;
        CommonTree Prefix198_tree=null;
        CommonTree IncrementOperator199_tree=null;
        CommonTree Postfix201_tree=null;
        CommonTree IncrementOperator202_tree=null;
        CommonTree New204_tree=null;
        CommonTree Clone206_tree=null;

        try {
            // PhpTree.g:130:5: ( ^( Or expression expression ) | ^( Xor expression expression ) | ^( And expression expression ) | ^( Equals expression expression ) | ^( AsignmentOperator expression expression ) | ^( IfExpression expression expression expression ) | ^( LogicalOr expression expression ) | ^( LogicalAnd expression expression ) | ^( Pipe expression expression ) | ^( Ampersand expression expression ) | ^( EqualityOperator expression expression ) | ^( ShiftOperator expression expression ) | ^( Plus expression expression ) | ^( Minus expression expression ) | ^( Dot expression expression ) | ^( Asterisk expression expression ) | ^( Forwardslash expression expression ) | ^( Percent expression expression ) | ^( Bang expression ) | ^( Instanceof expression expression ) | ^( Tilde expression ) | ^( Minus expression ) | ^( SuppressWarnings expression ) | ^( Cast PrimitiveType expression ) | ^( Prefix IncrementOperator name ) | ^( Postfix IncrementOperator name ) | ^( New nameOrFunctionCall ) | ^( Clone name ) | atomOrReference )
            int alt44=29;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // PhpTree.g:130:7: ^( Or expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Or129=(CommonTree)match(input,Or,FOLLOW_Or_in_expression968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Or129_tree = (CommonTree)adaptor.dupNode(Or129);

                    root_1 = (CommonTree)adaptor.becomeRoot(Or129_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression970);
                    expression130=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression130.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression972);
                    expression131=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression131.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:131:7: ^( Xor expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Xor132=(CommonTree)match(input,Xor,FOLLOW_Xor_in_expression982); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Xor132_tree = (CommonTree)adaptor.dupNode(Xor132);

                    root_1 = (CommonTree)adaptor.becomeRoot(Xor132_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression984);
                    expression133=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression133.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression986);
                    expression134=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression134.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // PhpTree.g:132:7: ^( And expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    And135=(CommonTree)match(input,And,FOLLOW_And_in_expression996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    And135_tree = (CommonTree)adaptor.dupNode(And135);

                    root_1 = (CommonTree)adaptor.becomeRoot(And135_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression998);
                    expression136=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression136.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1000);
                    expression137=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression137.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // PhpTree.g:133:7: ^( Equals expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Equals138=(CommonTree)match(input,Equals,FOLLOW_Equals_in_expression1010); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Equals138_tree = (CommonTree)adaptor.dupNode(Equals138);

                    root_1 = (CommonTree)adaptor.becomeRoot(Equals138_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1012);
                    expression139=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression139.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1014);
                    expression140=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression140.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // PhpTree.g:134:7: ^( AsignmentOperator expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AsignmentOperator141=(CommonTree)match(input,AsignmentOperator,FOLLOW_AsignmentOperator_in_expression1024); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AsignmentOperator141_tree = (CommonTree)adaptor.dupNode(AsignmentOperator141);

                    root_1 = (CommonTree)adaptor.becomeRoot(AsignmentOperator141_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1026);
                    expression142=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression142.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1028);
                    expression143=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression143.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // PhpTree.g:135:7: ^( IfExpression expression expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IfExpression144=(CommonTree)match(input,IfExpression,FOLLOW_IfExpression_in_expression1038); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IfExpression144_tree = (CommonTree)adaptor.dupNode(IfExpression144);

                    root_1 = (CommonTree)adaptor.becomeRoot(IfExpression144_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1040);
                    expression145=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression145.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1042);
                    expression146=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression146.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1044);
                    expression147=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression147.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // PhpTree.g:136:7: ^( LogicalOr expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LogicalOr148=(CommonTree)match(input,LogicalOr,FOLLOW_LogicalOr_in_expression1054); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LogicalOr148_tree = (CommonTree)adaptor.dupNode(LogicalOr148);

                    root_1 = (CommonTree)adaptor.becomeRoot(LogicalOr148_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1056);
                    expression149=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression149.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1058);
                    expression150=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression150.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // PhpTree.g:137:7: ^( LogicalAnd expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LogicalAnd151=(CommonTree)match(input,LogicalAnd,FOLLOW_LogicalAnd_in_expression1068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LogicalAnd151_tree = (CommonTree)adaptor.dupNode(LogicalAnd151);

                    root_1 = (CommonTree)adaptor.becomeRoot(LogicalAnd151_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1070);
                    expression152=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression152.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1072);
                    expression153=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression153.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // PhpTree.g:138:7: ^( Pipe expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Pipe154=(CommonTree)match(input,Pipe,FOLLOW_Pipe_in_expression1082); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Pipe154_tree = (CommonTree)adaptor.dupNode(Pipe154);

                    root_1 = (CommonTree)adaptor.becomeRoot(Pipe154_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1084);
                    expression155=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression155.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1086);
                    expression156=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression156.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // PhpTree.g:139:7: ^( Ampersand expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Ampersand157=(CommonTree)match(input,Ampersand,FOLLOW_Ampersand_in_expression1096); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Ampersand157_tree = (CommonTree)adaptor.dupNode(Ampersand157);

                    root_1 = (CommonTree)adaptor.becomeRoot(Ampersand157_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1098);
                    expression158=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression158.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1100);
                    expression159=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression159.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // PhpTree.g:140:7: ^( EqualityOperator expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EqualityOperator160=(CommonTree)match(input,EqualityOperator,FOLLOW_EqualityOperator_in_expression1110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EqualityOperator160_tree = (CommonTree)adaptor.dupNode(EqualityOperator160);

                    root_1 = (CommonTree)adaptor.becomeRoot(EqualityOperator160_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1112);
                    expression161=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression161.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1114);
                    expression162=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression162.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // PhpTree.g:141:7: ^( ShiftOperator expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ShiftOperator163=(CommonTree)match(input,ShiftOperator,FOLLOW_ShiftOperator_in_expression1124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ShiftOperator163_tree = (CommonTree)adaptor.dupNode(ShiftOperator163);

                    root_1 = (CommonTree)adaptor.becomeRoot(ShiftOperator163_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1126);
                    expression164=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression164.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1128);
                    expression165=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression165.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 13 :
                    // PhpTree.g:142:7: ^( Plus expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Plus166=(CommonTree)match(input,Plus,FOLLOW_Plus_in_expression1138); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Plus166_tree = (CommonTree)adaptor.dupNode(Plus166);

                    root_1 = (CommonTree)adaptor.becomeRoot(Plus166_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1140);
                    expression167=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression167.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1142);
                    expression168=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression168.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 14 :
                    // PhpTree.g:143:7: ^( Minus expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Minus169=(CommonTree)match(input,Minus,FOLLOW_Minus_in_expression1152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Minus169_tree = (CommonTree)adaptor.dupNode(Minus169);

                    root_1 = (CommonTree)adaptor.becomeRoot(Minus169_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1154);
                    expression170=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression170.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1156);
                    expression171=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression171.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 15 :
                    // PhpTree.g:144:7: ^( Dot expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Dot172=(CommonTree)match(input,Dot,FOLLOW_Dot_in_expression1166); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dot172_tree = (CommonTree)adaptor.dupNode(Dot172);

                    root_1 = (CommonTree)adaptor.becomeRoot(Dot172_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1168);
                    expression173=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression173.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1170);
                    expression174=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression174.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 16 :
                    // PhpTree.g:145:7: ^( Asterisk expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Asterisk175=(CommonTree)match(input,Asterisk,FOLLOW_Asterisk_in_expression1180); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Asterisk175_tree = (CommonTree)adaptor.dupNode(Asterisk175);

                    root_1 = (CommonTree)adaptor.becomeRoot(Asterisk175_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1182);
                    expression176=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression176.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1184);
                    expression177=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression177.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 17 :
                    // PhpTree.g:146:7: ^( Forwardslash expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Forwardslash178=(CommonTree)match(input,Forwardslash,FOLLOW_Forwardslash_in_expression1194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Forwardslash178_tree = (CommonTree)adaptor.dupNode(Forwardslash178);

                    root_1 = (CommonTree)adaptor.becomeRoot(Forwardslash178_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1196);
                    expression179=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression179.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1198);
                    expression180=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression180.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 18 :
                    // PhpTree.g:147:7: ^( Percent expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Percent181=(CommonTree)match(input,Percent,FOLLOW_Percent_in_expression1208); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Percent181_tree = (CommonTree)adaptor.dupNode(Percent181);

                    root_1 = (CommonTree)adaptor.becomeRoot(Percent181_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1210);
                    expression182=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression182.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1212);
                    expression183=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression183.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 19 :
                    // PhpTree.g:148:7: ^( Bang expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Bang184=(CommonTree)match(input,Bang,FOLLOW_Bang_in_expression1222); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Bang184_tree = (CommonTree)adaptor.dupNode(Bang184);

                    root_1 = (CommonTree)adaptor.becomeRoot(Bang184_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1224);
                    expression185=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression185.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 20 :
                    // PhpTree.g:149:7: ^( Instanceof expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Instanceof186=(CommonTree)match(input,Instanceof,FOLLOW_Instanceof_in_expression1234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Instanceof186_tree = (CommonTree)adaptor.dupNode(Instanceof186);

                    root_1 = (CommonTree)adaptor.becomeRoot(Instanceof186_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1236);
                    expression187=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression187.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1238);
                    expression188=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression188.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 21 :
                    // PhpTree.g:150:7: ^( Tilde expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Tilde189=(CommonTree)match(input,Tilde,FOLLOW_Tilde_in_expression1248); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Tilde189_tree = (CommonTree)adaptor.dupNode(Tilde189);

                    root_1 = (CommonTree)adaptor.becomeRoot(Tilde189_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1250);
                    expression190=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression190.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 22 :
                    // PhpTree.g:151:7: ^( Minus expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Minus191=(CommonTree)match(input,Minus,FOLLOW_Minus_in_expression1260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Minus191_tree = (CommonTree)adaptor.dupNode(Minus191);

                    root_1 = (CommonTree)adaptor.becomeRoot(Minus191_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1262);
                    expression192=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression192.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 23 :
                    // PhpTree.g:152:7: ^( SuppressWarnings expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SuppressWarnings193=(CommonTree)match(input,SuppressWarnings,FOLLOW_SuppressWarnings_in_expression1273); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SuppressWarnings193_tree = (CommonTree)adaptor.dupNode(SuppressWarnings193);

                    root_1 = (CommonTree)adaptor.becomeRoot(SuppressWarnings193_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1275);
                    expression194=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression194.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 24 :
                    // PhpTree.g:153:7: ^( Cast PrimitiveType expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Cast195=(CommonTree)match(input,Cast,FOLLOW_Cast_in_expression1285); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Cast195_tree = (CommonTree)adaptor.dupNode(Cast195);

                    root_1 = (CommonTree)adaptor.becomeRoot(Cast195_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    PrimitiveType196=(CommonTree)match(input,PrimitiveType,FOLLOW_PrimitiveType_in_expression1287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PrimitiveType196_tree = (CommonTree)adaptor.dupNode(PrimitiveType196);

                    adaptor.addChild(root_1, PrimitiveType196_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1289);
                    expression197=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression197.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 25 :
                    // PhpTree.g:154:7: ^( Prefix IncrementOperator name )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Prefix198=(CommonTree)match(input,Prefix,FOLLOW_Prefix_in_expression1299); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Prefix198_tree = (CommonTree)adaptor.dupNode(Prefix198);

                    root_1 = (CommonTree)adaptor.becomeRoot(Prefix198_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    IncrementOperator199=(CommonTree)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_expression1301); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IncrementOperator199_tree = (CommonTree)adaptor.dupNode(IncrementOperator199);

                    adaptor.addChild(root_1, IncrementOperator199_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_name_in_expression1303);
                    name200=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, name200.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 26 :
                    // PhpTree.g:155:7: ^( Postfix IncrementOperator name )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Postfix201=(CommonTree)match(input,Postfix,FOLLOW_Postfix_in_expression1313); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Postfix201_tree = (CommonTree)adaptor.dupNode(Postfix201);

                    root_1 = (CommonTree)adaptor.becomeRoot(Postfix201_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    IncrementOperator202=(CommonTree)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_expression1315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IncrementOperator202_tree = (CommonTree)adaptor.dupNode(IncrementOperator202);

                    adaptor.addChild(root_1, IncrementOperator202_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_name_in_expression1317);
                    name203=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, name203.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 27 :
                    // PhpTree.g:156:7: ^( New nameOrFunctionCall )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    New204=(CommonTree)match(input,New,FOLLOW_New_in_expression1327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    New204_tree = (CommonTree)adaptor.dupNode(New204);

                    root_1 = (CommonTree)adaptor.becomeRoot(New204_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nameOrFunctionCall_in_expression1329);
                    nameOrFunctionCall205=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, nameOrFunctionCall205.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 28 :
                    // PhpTree.g:157:7: ^( Clone name )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Clone206=(CommonTree)match(input,Clone,FOLLOW_Clone_in_expression1339); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Clone206_tree = (CommonTree)adaptor.dupNode(Clone206);

                    root_1 = (CommonTree)adaptor.becomeRoot(Clone206_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_name_in_expression1341);
                    name207=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, name207.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 29 :
                    // PhpTree.g:158:7: atomOrReference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atomOrReference_in_expression1350);
                    atomOrReference208=atomOrReference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atomOrReference208.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class atomOrReference_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomOrReference"
    // PhpTree.g:162:1: atomOrReference : ( atom | reference );
    public final PhpTree.atomOrReference_return atomOrReference() throws RecognitionException {
        PhpTree.atomOrReference_return retval = new PhpTree.atomOrReference_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        PhpTree.atom_return atom209 = null;

        PhpTree.reference_return reference210 = null;



        try {
            // PhpTree.g:163:5: ( atom | reference )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Integer||(LA45_0>=Array && LA45_0<=Boolean)) ) {
                alt45=1;
            }
            else if ( (LA45_0==OpenSquareBrace||(LA45_0>=ClassMember && LA45_0<=InstanceMember)||LA45_0==Dollar||LA45_0==Ampersand||LA45_0==Apply||LA45_0==UnquotedString) ) {
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
                    // PhpTree.g:163:7: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_atomOrReference1368);
                    atom209=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atom209.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:164:7: reference
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_reference_in_atomOrReference1376);
                    reference210=reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, reference210.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomOrReference"

    public static class arrayDeclaration_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayDeclaration"
    // PhpTree.g:167:1: arrayDeclaration : ^( Array ( arrayEntry )* ) ;
    public final PhpTree.arrayDeclaration_return arrayDeclaration() throws RecognitionException {
        PhpTree.arrayDeclaration_return retval = new PhpTree.arrayDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Array211=null;
        PhpTree.arrayEntry_return arrayEntry212 = null;


        CommonTree Array211_tree=null;

        try {
            // PhpTree.g:168:5: ( ^( Array ( arrayEntry )* ) )
            // PhpTree.g:168:7: ^( Array ( arrayEntry )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Array211=(CommonTree)match(input,Array,FOLLOW_Array_in_arrayDeclaration1394); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Array211_tree = (CommonTree)adaptor.dupNode(Array211);

            root_1 = (CommonTree)adaptor.becomeRoot(Array211_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // PhpTree.g:168:15: ( arrayEntry )*
                loop46:
                do {
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==OpenSquareBrace||(LA46_0>=ArrayAssign && LA46_0<=SuppressWarnings)||LA46_0==Dollar||(LA46_0>=Dot && LA46_0<=Clone)||(LA46_0>=And && LA46_0<=Instanceof)||LA46_0==Apply||(LA46_0>=Prefix && LA46_0<=IfExpression)||LA46_0==Cast||LA46_0==UnquotedString||LA46_0==Integer||(LA46_0>=AsignmentOperator && LA46_0<=EqualityOperator)||LA46_0==ShiftOperator||(LA46_0>=Array && LA46_0<=Boolean)) ) {
                        alt46=1;
                    }


                    switch (alt46) {
                	case 1 :
                	    // PhpTree.g:0:0: arrayEntry
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration1396);
                	    arrayEntry212=arrayEntry();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, arrayEntry212.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop46;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayDeclaration"

    public static class arrayEntry_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayEntry"
    // PhpTree.g:171:1: arrayEntry : ( keyValuePair | expression ) ;
    public final PhpTree.arrayEntry_return arrayEntry() throws RecognitionException {
        PhpTree.arrayEntry_return retval = new PhpTree.arrayEntry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        PhpTree.keyValuePair_return keyValuePair213 = null;

        PhpTree.expression_return expression214 = null;



        try {
            // PhpTree.g:172:5: ( ( keyValuePair | expression ) )
            // PhpTree.g:172:7: ( keyValuePair | expression )
            {
            root_0 = (CommonTree)adaptor.nil();

            // PhpTree.g:172:7: ( keyValuePair | expression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ArrayAssign) ) {
                alt47=1;
            }
            else if ( (LA47_0==OpenSquareBrace||(LA47_0>=LogicalOr && LA47_0<=SuppressWarnings)||LA47_0==Dollar||(LA47_0>=Dot && LA47_0<=Clone)||(LA47_0>=And && LA47_0<=Instanceof)||LA47_0==Apply||(LA47_0>=Prefix && LA47_0<=IfExpression)||LA47_0==Cast||LA47_0==UnquotedString||LA47_0==Integer||(LA47_0>=AsignmentOperator && LA47_0<=EqualityOperator)||LA47_0==ShiftOperator||(LA47_0>=Array && LA47_0<=Boolean)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // PhpTree.g:172:8: keyValuePair
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_keyValuePair_in_arrayEntry1416);
                    keyValuePair213=keyValuePair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, keyValuePair213.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:172:23: expression
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_arrayEntry1420);
                    expression214=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, expression214.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayEntry"

    public static class keyValuePair_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValuePair"
    // PhpTree.g:175:1: keyValuePair : ^( ArrayAssign ( expression )+ ) ;
    public final PhpTree.keyValuePair_return keyValuePair() throws RecognitionException {
        PhpTree.keyValuePair_return retval = new PhpTree.keyValuePair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ArrayAssign215=null;
        PhpTree.expression_return expression216 = null;


        CommonTree ArrayAssign215_tree=null;

        try {
            // PhpTree.g:176:5: ( ^( ArrayAssign ( expression )+ ) )
            // PhpTree.g:176:7: ^( ArrayAssign ( expression )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ArrayAssign215=(CommonTree)match(input,ArrayAssign,FOLLOW_ArrayAssign_in_keyValuePair1439); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ArrayAssign215_tree = (CommonTree)adaptor.dupNode(ArrayAssign215);

            root_1 = (CommonTree)adaptor.becomeRoot(ArrayAssign215_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // PhpTree.g:176:21: ( expression )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==OpenSquareBrace||(LA48_0>=LogicalOr && LA48_0<=SuppressWarnings)||LA48_0==Dollar||(LA48_0>=Dot && LA48_0<=Clone)||(LA48_0>=And && LA48_0<=Instanceof)||LA48_0==Apply||(LA48_0>=Prefix && LA48_0<=IfExpression)||LA48_0==Cast||LA48_0==UnquotedString||LA48_0==Integer||(LA48_0>=AsignmentOperator && LA48_0<=EqualityOperator)||LA48_0==ShiftOperator||(LA48_0>=Array && LA48_0<=Boolean)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // PhpTree.g:0:0: expression
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_keyValuePair1441);
            	    expression216=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, expression216.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyValuePair"

    public static class atom_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // PhpTree.g:179:1: atom : ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration );
    public final PhpTree.atom_return atom() throws RecognitionException {
        PhpTree.atom_return retval = new PhpTree.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SingleQuotedString217=null;
        CommonTree DoubleQuotedString218=null;
        CommonTree HereDoc219=null;
        CommonTree Integer220=null;
        CommonTree Real221=null;
        CommonTree Boolean222=null;
        PhpTree.arrayDeclaration_return arrayDeclaration223 = null;


        CommonTree SingleQuotedString217_tree=null;
        CommonTree DoubleQuotedString218_tree=null;
        CommonTree HereDoc219_tree=null;
        CommonTree Integer220_tree=null;
        CommonTree Real221_tree=null;
        CommonTree Boolean222_tree=null;

        try {
            // PhpTree.g:179:5: ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration )
            int alt49=7;
            switch ( input.LA(1) ) {
            case SingleQuotedString:
                {
                alt49=1;
                }
                break;
            case DoubleQuotedString:
                {
                alt49=2;
                }
                break;
            case HereDoc:
                {
                alt49=3;
                }
                break;
            case Integer:
                {
                alt49=4;
                }
                break;
            case Real:
                {
                alt49=5;
                }
                break;
            case Boolean:
                {
                alt49=6;
                }
                break;
            case Array:
                {
                alt49=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // PhpTree.g:179:7: SingleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    SingleQuotedString217=(CommonTree)match(input,SingleQuotedString,FOLLOW_SingleQuotedString_in_atom1455); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SingleQuotedString217_tree = (CommonTree)adaptor.dupNode(SingleQuotedString217);

                    adaptor.addChild(root_0, SingleQuotedString217_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:179:28: DoubleQuotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DoubleQuotedString218=(CommonTree)match(input,DoubleQuotedString,FOLLOW_DoubleQuotedString_in_atom1459); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DoubleQuotedString218_tree = (CommonTree)adaptor.dupNode(DoubleQuotedString218);

                    adaptor.addChild(root_0, DoubleQuotedString218_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // PhpTree.g:179:49: HereDoc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    HereDoc219=(CommonTree)match(input,HereDoc,FOLLOW_HereDoc_in_atom1463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HereDoc219_tree = (CommonTree)adaptor.dupNode(HereDoc219);

                    adaptor.addChild(root_0, HereDoc219_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // PhpTree.g:179:59: Integer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    Integer220=(CommonTree)match(input,Integer,FOLLOW_Integer_in_atom1467); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Integer220_tree = (CommonTree)adaptor.dupNode(Integer220);

                    adaptor.addChild(root_0, Integer220_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // PhpTree.g:179:69: Real
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    Real221=(CommonTree)match(input,Real,FOLLOW_Real_in_atom1471); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Real221_tree = (CommonTree)adaptor.dupNode(Real221);

                    adaptor.addChild(root_0, Real221_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // PhpTree.g:179:76: Boolean
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    Boolean222=(CommonTree)match(input,Boolean,FOLLOW_Boolean_in_atom1475); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Boolean222_tree = (CommonTree)adaptor.dupNode(Boolean222);

                    adaptor.addChild(root_0, Boolean222_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // PhpTree.g:179:86: arrayDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayDeclaration_in_atom1479);
                    arrayDeclaration223=arrayDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, arrayDeclaration223.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class reference_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reference"
    // PhpTree.g:183:1: reference : ( ^( Ampersand nameOrFunctionCall ) | nameOrFunctionCall );
    public final PhpTree.reference_return reference() throws RecognitionException {
        PhpTree.reference_return retval = new PhpTree.reference_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Ampersand224=null;
        PhpTree.nameOrFunctionCall_return nameOrFunctionCall225 = null;

        PhpTree.nameOrFunctionCall_return nameOrFunctionCall226 = null;


        CommonTree Ampersand224_tree=null;

        try {
            // PhpTree.g:184:5: ( ^( Ampersand nameOrFunctionCall ) | nameOrFunctionCall )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Ampersand) ) {
                alt50=1;
            }
            else if ( (LA50_0==OpenSquareBrace||(LA50_0>=ClassMember && LA50_0<=InstanceMember)||LA50_0==Dollar||LA50_0==Apply||LA50_0==UnquotedString) ) {
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
                    // PhpTree.g:184:7: ^( Ampersand nameOrFunctionCall )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Ampersand224=(CommonTree)match(input,Ampersand,FOLLOW_Ampersand_in_reference1498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Ampersand224_tree = (CommonTree)adaptor.dupNode(Ampersand224);

                    root_1 = (CommonTree)adaptor.becomeRoot(Ampersand224_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference1500);
                    nameOrFunctionCall225=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, nameOrFunctionCall225.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:185:7: nameOrFunctionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nameOrFunctionCall_in_reference1509);
                    nameOrFunctionCall226=nameOrFunctionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, nameOrFunctionCall226.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reference"

    public static class nameOrFunctionCall_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameOrFunctionCall"
    // PhpTree.g:188:1: nameOrFunctionCall : ( ^( Apply name ( expression )* ) | name );
    public final PhpTree.nameOrFunctionCall_return nameOrFunctionCall() throws RecognitionException {
        PhpTree.nameOrFunctionCall_return retval = new PhpTree.nameOrFunctionCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Apply227=null;
        PhpTree.name_return name228 = null;

        PhpTree.expression_return expression229 = null;

        PhpTree.name_return name230 = null;


        CommonTree Apply227_tree=null;

        try {
            // PhpTree.g:189:5: ( ^( Apply name ( expression )* ) | name )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Apply) ) {
                alt52=1;
            }
            else if ( (LA52_0==OpenSquareBrace||(LA52_0>=ClassMember && LA52_0<=InstanceMember)||LA52_0==Dollar||LA52_0==UnquotedString) ) {
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
                    // PhpTree.g:189:7: ^( Apply name ( expression )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Apply227=(CommonTree)match(input,Apply,FOLLOW_Apply_in_nameOrFunctionCall1527); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Apply227_tree = (CommonTree)adaptor.dupNode(Apply227);

                    root_1 = (CommonTree)adaptor.becomeRoot(Apply227_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_name_in_nameOrFunctionCall1529);
                    name228=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, name228.getTree());
                    // PhpTree.g:189:20: ( expression )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==OpenSquareBrace||(LA51_0>=LogicalOr && LA51_0<=SuppressWarnings)||LA51_0==Dollar||(LA51_0>=Dot && LA51_0<=Clone)||(LA51_0>=And && LA51_0<=Instanceof)||LA51_0==Apply||(LA51_0>=Prefix && LA51_0<=IfExpression)||LA51_0==Cast||LA51_0==UnquotedString||LA51_0==Integer||(LA51_0>=AsignmentOperator && LA51_0<=EqualityOperator)||LA51_0==ShiftOperator||(LA51_0>=Array && LA51_0<=Boolean)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // PhpTree.g:0:0: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_nameOrFunctionCall1531);
                    	    expression229=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, expression229.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:190:7: name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_name_in_nameOrFunctionCall1541);
                    name230=name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, name230.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nameOrFunctionCall"

    public static class name_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name"
    // PhpTree.g:193:1: name : ( staticMemberAccess | memberAccess | variable );
    public final PhpTree.name_return name() throws RecognitionException {
        PhpTree.name_return retval = new PhpTree.name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        PhpTree.staticMemberAccess_return staticMemberAccess231 = null;

        PhpTree.memberAccess_return memberAccess232 = null;

        PhpTree.variable_return variable233 = null;



        try {
            // PhpTree.g:193:5: ( staticMemberAccess | memberAccess | variable )
            int alt53=3;
            switch ( input.LA(1) ) {
            case ClassMember:
                {
                alt53=1;
                }
                break;
            case OpenSquareBrace:
            case InstanceMember:
                {
                alt53=2;
                }
                break;
            case Dollar:
            case UnquotedString:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // PhpTree.g:193:7: staticMemberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_staticMemberAccess_in_name1553);
                    staticMemberAccess231=staticMemberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, staticMemberAccess231.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:194:7: memberAccess
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_memberAccess_in_name1561);
                    memberAccess232=memberAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, memberAccess232.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // PhpTree.g:195:7: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_name1569);
                    variable233=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, variable233.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "name"

    public static class staticMemberAccess_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticMemberAccess"
    // PhpTree.g:198:1: staticMemberAccess : ^( '::' UnquotedString variable ) ;
    public final PhpTree.staticMemberAccess_return staticMemberAccess() throws RecognitionException {
        PhpTree.staticMemberAccess_return retval = new PhpTree.staticMemberAccess_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal234=null;
        CommonTree UnquotedString235=null;
        PhpTree.variable_return variable236 = null;


        CommonTree string_literal234_tree=null;
        CommonTree UnquotedString235_tree=null;

        try {
            // PhpTree.g:199:5: ( ^( '::' UnquotedString variable ) )
            // PhpTree.g:199:7: ^( '::' UnquotedString variable )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            string_literal234=(CommonTree)match(input,ClassMember,FOLLOW_ClassMember_in_staticMemberAccess1591); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal234_tree = (CommonTree)adaptor.dupNode(string_literal234);

            root_1 = (CommonTree)adaptor.becomeRoot(string_literal234_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            UnquotedString235=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_staticMemberAccess1593); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            UnquotedString235_tree = (CommonTree)adaptor.dupNode(UnquotedString235);

            adaptor.addChild(root_1, UnquotedString235_tree);
            }
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_staticMemberAccess1596);
            variable236=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, variable236.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "staticMemberAccess"

    public static class memberAccess_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberAccess"
    // PhpTree.g:202:1: memberAccess : ( ^( OpenSquareBrace variable expression ) | ^( '->' variable UnquotedString ) );
    public final PhpTree.memberAccess_return memberAccess() throws RecognitionException {
        PhpTree.memberAccess_return retval = new PhpTree.memberAccess_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OpenSquareBrace237=null;
        CommonTree string_literal240=null;
        CommonTree UnquotedString242=null;
        PhpTree.variable_return variable238 = null;

        PhpTree.expression_return expression239 = null;

        PhpTree.variable_return variable241 = null;


        CommonTree OpenSquareBrace237_tree=null;
        CommonTree string_literal240_tree=null;
        CommonTree UnquotedString242_tree=null;

        try {
            // PhpTree.g:203:5: ( ^( OpenSquareBrace variable expression ) | ^( '->' variable UnquotedString ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==OpenSquareBrace) ) {
                alt54=1;
            }
            else if ( (LA54_0==InstanceMember) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // PhpTree.g:203:7: ^( OpenSquareBrace variable expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    OpenSquareBrace237=(CommonTree)match(input,OpenSquareBrace,FOLLOW_OpenSquareBrace_in_memberAccess1615); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OpenSquareBrace237_tree = (CommonTree)adaptor.dupNode(OpenSquareBrace237);

                    root_1 = (CommonTree)adaptor.becomeRoot(OpenSquareBrace237_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_memberAccess1617);
                    variable238=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variable238.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_memberAccess1619);
                    expression239=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression239.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:204:7: ^( '->' variable UnquotedString )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal240=(CommonTree)match(input,InstanceMember,FOLLOW_InstanceMember_in_memberAccess1629); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal240_tree = (CommonTree)adaptor.dupNode(string_literal240);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal240_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_memberAccess1631);
                    variable241=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variable241.getTree());
                    _last = (CommonTree)input.LT(1);
                    UnquotedString242=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_memberAccess1633); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString242_tree = (CommonTree)adaptor.dupNode(UnquotedString242);

                    adaptor.addChild(root_1, UnquotedString242_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "memberAccess"

    public static class variable_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // PhpTree.g:207:1: variable : ( ^( Dollar variable ) | UnquotedString );
    public final PhpTree.variable_return variable() throws RecognitionException {
        PhpTree.variable_return retval = new PhpTree.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Dollar243=null;
        CommonTree UnquotedString245=null;
        PhpTree.variable_return variable244 = null;


        CommonTree Dollar243_tree=null;
        CommonTree UnquotedString245_tree=null;

        try {
            // PhpTree.g:208:5: ( ^( Dollar variable ) | UnquotedString )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Dollar) ) {
                alt55=1;
            }
            else if ( (LA55_0==UnquotedString) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // PhpTree.g:208:7: ^( Dollar variable )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    Dollar243=(CommonTree)match(input,Dollar,FOLLOW_Dollar_in_variable1656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Dollar243_tree = (CommonTree)adaptor.dupNode(Dollar243);

                    root_1 = (CommonTree)adaptor.becomeRoot(Dollar243_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_variable1658);
                    variable244=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variable244.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // PhpTree.g:209:7: UnquotedString
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    UnquotedString245=(CommonTree)match(input,UnquotedString,FOLLOW_UnquotedString_in_variable1667); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UnquotedString245_tree = (CommonTree)adaptor.dupNode(UnquotedString245);

                    adaptor.addChild(root_0, UnquotedString245_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    // $ANTLR start synpred72_PhpTree
    public final void synpred72_PhpTree_fragment() throws RecognitionException {   
        // PhpTree.g:139:7: ( ^( Ampersand expression expression ) )
        // PhpTree.g:139:7: ^( Ampersand expression expression )
        {
        match(input,Ampersand,FOLLOW_Ampersand_in_synpred72_PhpTree1096); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred72_PhpTree1098);
        expression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred72_PhpTree1100);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_PhpTree

    // $ANTLR start synpred76_PhpTree
    public final void synpred76_PhpTree_fragment() throws RecognitionException {   
        // PhpTree.g:143:7: ( ^( Minus expression expression ) )
        // PhpTree.g:143:7: ^( Minus expression expression )
        {
        match(input,Minus,FOLLOW_Minus_in_synpred76_PhpTree1152); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred76_PhpTree1154);
        expression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred76_PhpTree1156);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_PhpTree

    // $ANTLR start synpred84_PhpTree
    public final void synpred84_PhpTree_fragment() throws RecognitionException {   
        // PhpTree.g:151:7: ( ^( Minus expression ) )
        // PhpTree.g:151:7: ^( Minus expression )
        {
        match(input,Minus,FOLLOW_Minus_in_synpred84_PhpTree1260); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred84_PhpTree1262);
        expression();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred84_PhpTree

    // Delegated rules

    public final boolean synpred84_PhpTree() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_PhpTree_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_PhpTree() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_PhpTree_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_PhpTree() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_PhpTree_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA44 dfa44 = new DFA44(this);
    static final String DFA44_eotS =
        "\54\uffff";
    static final String DFA44_eofS =
        "\54\uffff";
    static final String DFA44_minS =
        "\1\10\11\uffff\1\0\3\uffff\1\0\35\uffff";
    static final String DFA44_maxS =
        "\1\140\11\uffff\1\0\3\uffff\1\0\35\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13\1\14"+
        "\1\15\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\14\uffff\1\12\1\16\1\26";
    static final String DFA44_specialS =
        "\12\uffff\1\0\3\uffff\1\1\35\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\34\4\uffff\1\7\1\10\2\34\1\26\1\uffff\1\34\1\uffff\1\17\1"+
            "\12\1\11\1\23\1\15\1\16\1\20\1\22\1\21\1\25\1\4\1\32\1\33\21"+
            "\uffff\1\3\1\1\1\2\1\24\13\uffff\1\34\3\uffff\1\30\1\31\1\6"+
            "\1\uffff\1\27\6\uffff\1\34\1\uffff\1\34\1\uffff\1\5\1\13\1\uffff"+
            "\1\14\2\uffff\6\34",
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
            return "129:1: expression : ( ^( Or expression expression ) | ^( Xor expression expression ) | ^( And expression expression ) | ^( Equals expression expression ) | ^( AsignmentOperator expression expression ) | ^( IfExpression expression expression expression ) | ^( LogicalOr expression expression ) | ^( LogicalAnd expression expression ) | ^( Pipe expression expression ) | ^( Ampersand expression expression ) | ^( EqualityOperator expression expression ) | ^( ShiftOperator expression expression ) | ^( Plus expression expression ) | ^( Minus expression expression ) | ^( Dot expression expression ) | ^( Asterisk expression expression ) | ^( Forwardslash expression expression ) | ^( Percent expression expression ) | ^( Bang expression ) | ^( Instanceof expression expression ) | ^( Tilde expression ) | ^( Minus expression ) | ^( SuppressWarnings expression ) | ^( Cast PrimitiveType expression ) | ^( Prefix IncrementOperator name ) | ^( Postfix IncrementOperator name ) | ^( New nameOrFunctionCall ) | ^( Clone name ) | atomOrReference );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_10 = input.LA(1);

                         
                        int index44_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_PhpTree()) ) {s = 41;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index44_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_14 = input.LA(1);

                         
                        int index44_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred76_PhpTree()) ) {s = 42;}

                        else if ( (synpred84_PhpTree()) ) {s = 43;}

                         
                        input.seek(index44_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_statement_in_prog43 = new BitSet(new long[]{0x01FFE7CFFFEBE102L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_BodyString_in_statement56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Block_in_statement65 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement67 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_classDefinition_in_statement82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDefinition_in_statement90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexStatement_in_statement98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleStatement_in_statement106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Interface_in_interfaceDefinition124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceDefinition126 = new BitSet(new long[]{0x2200000000000008L,0x0000000000008000L});
    public static final BitSet FOLLOW_interfaceExtends_in_interfaceDefinition128 = new BitSet(new long[]{0x2000000000000008L,0x0000000000008000L});
    public static final BitSet FOLLOW_interfaceMember_in_interfaceDefinition131 = new BitSet(new long[]{0x2000000000000008L,0x0000000000008000L});
    public static final BitSet FOLLOW_Extends_in_interfaceExtends150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_Const_in_interfaceMember171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember173 = new BitSet(new long[]{0x0000000000000008L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_interfaceMember175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Method_in_interfaceMember186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Modifiers_in_interfaceMember189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldModifier_in_interfaceMember191 = new BitSet(new long[]{0x0804000000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_interfaceMember195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Params_in_interfaceMember198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_paramDef_in_interfaceMember200 = new BitSet(new long[]{0x0000000080480008L});
    public static final BitSet FOLLOW_Class_in_classDefinition223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Modifiers_in_classDefinition226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classModifier_in_classDefinition228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition232 = new BitSet(new long[]{0x3600000000000008L,0x000000000000C000L});
    public static final BitSet FOLLOW_Extends_in_classDefinition236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_classDefinition238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classImplements_in_classDefinition243 = new BitSet(new long[]{0x3000000000000008L,0x000000000000C000L});
    public static final BitSet FOLLOW_classMember_in_classDefinition246 = new BitSet(new long[]{0x3000000000000008L,0x000000000000C000L});
    public static final BitSet FOLLOW_Implements_in_classImplements271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_classImplements273 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
    public static final BitSet FOLLOW_Method_in_classMember293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Modifiers_in_classMember296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember298 = new BitSet(new long[]{0x0804000000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Params_in_classMember305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_paramDef_in_classMember307 = new BitSet(new long[]{0x0000000080480008L});
    public static final BitSet FOLLOW_statementBlock_in_classMember311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Var_in_classMember322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Dollar_in_classMember325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_classMember330 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Const_in_classMember342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember344 = new BitSet(new long[]{0x0000000000000008L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_classMember346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Field_in_classMember357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Modifiers_in_classMember360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldModifier_in_classMember362 = new BitSet(new long[]{0x0804000000000008L,0x0000000000040000L});
    public static final BitSet FOLLOW_Dollar_in_classMember367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_classMember369 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_classMember372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Block_in_statementBlock396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statementBlock398 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_Field_in_fieldDefinition418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Dollar_in_fieldDefinition421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_fieldDefinition423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_fieldDefinition426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Abstract_in_classModifier449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_fieldModifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_complexStatement493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_complexStatement495 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_statement_in_complexStatement497 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_statement_in_complexStatement499 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_For_in_complexStatement510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_complexStatement512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_forCondition_in_complexStatement514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_forUpdate_in_complexStatement516 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_statement_in_complexStatement518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Foreach_in_complexStatement528 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_complexStatement530 = new BitSet(new long[]{0x01FFE7CFFFEBF100L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_arrayEntry_in_complexStatement532 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_statement_in_complexStatement534 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_While_in_complexStatement544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_complexStatement546 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_statement_in_complexStatement548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Do_in_complexStatement558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_complexStatement560 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_complexStatement562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Switch_in_complexStatement572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_complexStatement574 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_cases_in_complexStatement576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionDefinition_in_complexStatement585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Echo_in_simpleStatement603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_simpleStatement605 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_Global_in_simpleStatement616 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_name_in_simpleStatement618 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_Static_in_simpleStatement629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_simpleStatement631 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_simpleStatement633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Break_in_simpleStatement643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Continue_in_simpleStatement656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Integer_in_simpleStatement658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Return_in_simpleStatement674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_simpleStatement676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RequireOperator_in_simpleStatement687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_simpleStatement689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_simpleStatement698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ForInit_in_forInit717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forInit719 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_ForCondition_in_forCondition739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCondition741 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_ForUpdate_in_forUpdate765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forUpdate767 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_casestatement_in_cases787 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_defaultcase_in_cases791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_casestatement809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_casestatement811 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_statement_in_casestatement813 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_Default_in_defaultcase834 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_defaultcase836 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_Function_in_functionDefinition856 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_functionDefinition858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Params_in_functionDefinition861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_paramDef_in_functionDefinition863 = new BitSet(new long[]{0x0000000080480008L});
    public static final BitSet FOLLOW_Block_in_functionDefinition868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_functionDefinition870 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_Equals_in_paramDef895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_paramName_in_paramDef897 = new BitSet(new long[]{0x0000000000000000L,0x00000001F8080000L});
    public static final BitSet FOLLOW_atom_in_paramDef899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_paramName_in_paramDef909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dollar_in_paramName927 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Ampersand_in_paramName939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Dollar_in_paramName942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_paramName944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Or_in_expression968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression970 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Xor_in_expression982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression984 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression986 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_And_in_expression996 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression998 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1000 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Equals_in_expression1010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1012 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1014 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AsignmentOperator_in_expression1024 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1026 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1028 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IfExpression_in_expression1038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1040 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1042 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1044 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LogicalOr_in_expression1054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1056 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1058 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LogicalAnd_in_expression1068 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1070 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1072 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Pipe_in_expression1082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1084 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1086 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Ampersand_in_expression1096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1098 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EqualityOperator_in_expression1110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1112 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ShiftOperator_in_expression1124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1126 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Plus_in_expression1138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1140 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Minus_in_expression1152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1154 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Dot_in_expression1166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1168 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Asterisk_in_expression1180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1182 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Forwardslash_in_expression1194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1196 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Percent_in_expression1208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1210 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Bang_in_expression1222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Instanceof_in_expression1234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1236 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Tilde_in_expression1248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Minus_in_expression1260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SuppressWarnings_in_expression1273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Cast_in_expression1285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PrimitiveType_in_expression1287 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_expression1289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Prefix_in_expression1299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IncrementOperator_in_expression1301 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_name_in_expression1303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Postfix_in_expression1313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IncrementOperator_in_expression1315 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_name_in_expression1317 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_New_in_expression1327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_expression1329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Clone_in_expression1339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_name_in_expression1341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atomOrReference_in_expression1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_atomOrReference1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_atomOrReference1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_arrayDeclaration1394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration1396 = new BitSet(new long[]{0x01FFE7CFFFEBF108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_keyValuePair_in_arrayEntry1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arrayEntry1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ArrayAssign_in_keyValuePair1439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_keyValuePair1441 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_SingleQuotedString_in_atom1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleQuotedString_in_atom1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HereDoc_in_atom1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_atom1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Real_in_atom1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Boolean_in_atom1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_atom1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_reference1498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference1500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nameOrFunctionCall_in_reference1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Apply_in_nameOrFunctionCall1527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall1529 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_nameOrFunctionCall1531 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_name_in_nameOrFunctionCall1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticMemberAccess_in_name1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberAccess_in_name1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_name1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ClassMember_in_staticMemberAccess1591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_UnquotedString_in_staticMemberAccess1593 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_variable_in_staticMemberAccess1596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OpenSquareBrace_in_memberAccess1615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_memberAccess1617 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_memberAccess1619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_InstanceMember_in_memberAccess1629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_memberAccess1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UnquotedString_in_memberAccess1633 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Dollar_in_variable1656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_variable1658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UnquotedString_in_variable1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ampersand_in_synpred72_PhpTree1096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred72_PhpTree1098 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_synpred72_PhpTree1100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Minus_in_synpred76_PhpTree1152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred76_PhpTree1154 = new BitSet(new long[]{0x01FFE7CFFFEBE108L,0x00000001F97B05C5L});
    public static final BitSet FOLLOW_expression_in_synpred76_PhpTree1156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Minus_in_synpred84_PhpTree1260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_synpred84_PhpTree1262 = new BitSet(new long[]{0x0000000000000008L});

}