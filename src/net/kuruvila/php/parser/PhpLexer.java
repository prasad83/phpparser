// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/sidharth/Documents/code/phpparser/grammar/Php.g 2009-08-02 17:47:00

package net.kuruvila.php.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class PhpLexer extends Lexer {
    public static final int Switch=42;
    public static final int New=32;
    public static final int DoubleQuotedString=94;
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
    public static final int Var=61;
    public static final int Colon=20;
    public static final int EqualityOperator=87;
    public static final int T__113=113;
    public static final int Continue=47;
    public static final int Percent=28;
    public static final int ElseIf=37;
    public static final int QuestionMark=18;
    public static final int ForUpdate=78;
    public static final int List=55;
    public static final int OpenRoundBracket=6;
    public static final int Dollar=19;
    public static final int ClassDefinition=64;
    public static final int UnixComment=102;
    public static final int Cast=75;
    public static final int Prefix=71;
    public static final int Label=74;
    public static final int Abstract=60;
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
    public static final int BodyString=81;
    public static final int Else=36;
    public static final int OpenCurlyBracket=10;
    public static final int SuppressWarnings=17;
    public static final int Xor=53;
    public static final int ComparisionOperator=88;
    public static final int ForCondition=77;
    public static final int Case=43;
    public static final int Function=45;
    public static final int Pipe=23;
    public static final int Global=49;
    public static final int Tilde=30;
    public static final int Block=65;
    public static final int Method=80;
    public static final int Empty=70;
    public static final int Bang=24;
    public static final int While=40;
    public static final int EOF=-1;
    public static final int AsignmentOperator=86;
    public static final int Digits=106;
    public static final int HereDoc=95;
    public static final int Member=68;
    public static final int Return=48;


        private boolean allowShortOpenTag = false;

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
                    state.backtracking = 0;
                    mBodyStringRest();
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

        /**
         * Property to enable short open tags
         * 
         * Returns true if short open tags are enabled
         * false if short open tags are disabled.
         * 
         */
        public boolean isAllowShortOpenTag(){
            return allowShortOpenTag;
        }

        /**
         * Property to enable short open tags.
         *
         * Set to true to enable short open tags and false 
         * to disable.
         */
        public void setAllowShortOpenTag(boolean val){
            allowShortOpenTag = val;
        }


    // delegates
    // delegators

    public PhpLexer() {;} 
    public PhpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PhpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/sidharth/Documents/code/phpparser/grammar/Php.g"; }

    // $ANTLR start "SemiColon"
    public final void mSemiColon() throws RecognitionException {
        try {
            int _type = SemiColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:59:11: ( ';' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:59:13: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SemiColon"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:60:7: ( ',' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:60:9: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "OpenRoundBracket"
    public final void mOpenRoundBracket() throws RecognitionException {
        try {
            int _type = OpenRoundBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:61:18: ( '(' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:61:20: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OpenRoundBracket"

    // $ANTLR start "CloseRoundBracket"
    public final void mCloseRoundBracket() throws RecognitionException {
        try {
            int _type = CloseRoundBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:62:19: ( ')' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:62:21: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CloseRoundBracket"

    // $ANTLR start "OpenSquareBracket"
    public final void mOpenSquareBracket() throws RecognitionException {
        try {
            int _type = OpenSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:63:19: ( '[' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:63:21: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OpenSquareBracket"

    // $ANTLR start "CloseSquareBracket"
    public final void mCloseSquareBracket() throws RecognitionException {
        try {
            int _type = CloseSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:64:20: ( ']' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:64:22: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CloseSquareBracket"

    // $ANTLR start "OpenCurlyBracket"
    public final void mOpenCurlyBracket() throws RecognitionException {
        try {
            int _type = OpenCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:65:18: ( '{' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:65:20: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OpenCurlyBracket"

    // $ANTLR start "CloseCurlyBracket"
    public final void mCloseCurlyBracket() throws RecognitionException {
        try {
            int _type = CloseCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:66:19: ( '}' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:66:21: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CloseCurlyBracket"

    // $ANTLR start "ArrayAssign"
    public final void mArrayAssign() throws RecognitionException {
        try {
            int _type = ArrayAssign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:67:13: ( '=>' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:67:15: '=>'
            {
            match("=>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ArrayAssign"

    // $ANTLR start "LogicalOr"
    public final void mLogicalOr() throws RecognitionException {
        try {
            int _type = LogicalOr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:68:11: ( '||' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:68:13: '||'
            {
            match("||"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LogicalOr"

    // $ANTLR start "LogicalAnd"
    public final void mLogicalAnd() throws RecognitionException {
        try {
            int _type = LogicalAnd;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:69:12: ( '&&' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:69:14: '&&'
            {
            match("&&"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LogicalAnd"

    // $ANTLR start "ClassMember"
    public final void mClassMember() throws RecognitionException {
        try {
            int _type = ClassMember;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:70:13: ( '::' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:70:15: '::'
            {
            match("::"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ClassMember"

    // $ANTLR start "InstanceMember"
    public final void mInstanceMember() throws RecognitionException {
        try {
            int _type = InstanceMember;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:71:16: ( '->' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:71:18: '->'
            {
            match("->"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "InstanceMember"

    // $ANTLR start "SuppressWarnings"
    public final void mSuppressWarnings() throws RecognitionException {
        try {
            int _type = SuppressWarnings;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:72:18: ( '@' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:72:20: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SuppressWarnings"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:73:14: ( '?' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:73:16: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "Dollar"
    public final void mDollar() throws RecognitionException {
        try {
            int _type = Dollar;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:74:8: ( '$' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:74:10: '$'
            {
            match('$'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dollar"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:75:7: ( ':' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:75:9: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Dot"
    public final void mDot() throws RecognitionException {
        try {
            int _type = Dot;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:76:5: ( '.' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:76:7: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dot"

    // $ANTLR start "Ampersand"
    public final void mAmpersand() throws RecognitionException {
        try {
            int _type = Ampersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:77:11: ( '&' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:77:13: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ampersand"

    // $ANTLR start "Pipe"
    public final void mPipe() throws RecognitionException {
        try {
            int _type = Pipe;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:78:6: ( '|' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:78:8: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pipe"

    // $ANTLR start "Bang"
    public final void mBang() throws RecognitionException {
        try {
            int _type = Bang;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:79:6: ( '!' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:79:8: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bang"

    // $ANTLR start "Plus"
    public final void mPlus() throws RecognitionException {
        try {
            int _type = Plus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:80:6: ( '+' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:80:8: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Plus"

    // $ANTLR start "Minus"
    public final void mMinus() throws RecognitionException {
        try {
            int _type = Minus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:81:7: ( '-' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:81:9: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Minus"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:82:10: ( '*' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:82:12: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "Percent"
    public final void mPercent() throws RecognitionException {
        try {
            int _type = Percent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:83:9: ( '%' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:83:11: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Percent"

    // $ANTLR start "Forwardslash"
    public final void mForwardslash() throws RecognitionException {
        try {
            int _type = Forwardslash;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:84:14: ( '/' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:84:16: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Forwardslash"

    // $ANTLR start "Tilde"
    public final void mTilde() throws RecognitionException {
        try {
            int _type = Tilde;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:85:7: ( '~' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:85:9: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tilde"

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:86:8: ( '=' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:86:10: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Equals"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:87:5: ( 'new' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:87:7: 'new'
            {
            match("new"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "Clone"
    public final void mClone() throws RecognitionException {
        try {
            int _type = Clone;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:88:7: ( 'clone' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:88:9: 'clone'
            {
            match("clone"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Clone"

    // $ANTLR start "Echo"
    public final void mEcho() throws RecognitionException {
        try {
            int _type = Echo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:89:6: ( 'echo' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:89:8: 'echo'
            {
            match("echo"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Echo"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:90:4: ( 'if' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:90:6: 'if'
            {
            match("if"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:91:6: ( 'else' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:91:8: 'else'
            {
            match("else"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "ElseIf"
    public final void mElseIf() throws RecognitionException {
        try {
            int _type = ElseIf;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:92:8: ( 'elseif' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:92:10: 'elseif'
            {
            match("elseif"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ElseIf"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:93:5: ( 'for' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:93:7: 'for'
            {
            match("for"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "Foreach"
    public final void mForeach() throws RecognitionException {
        try {
            int _type = Foreach;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:94:9: ( 'foreach' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:94:11: 'foreach'
            {
            match("foreach"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Foreach"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:95:7: ( 'while' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:95:9: 'while'
            {
            match("while"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Do"
    public final void mDo() throws RecognitionException {
        try {
            int _type = Do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:96:4: ( 'do' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:96:6: 'do'
            {
            match("do"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Do"

    // $ANTLR start "Switch"
    public final void mSwitch() throws RecognitionException {
        try {
            int _type = Switch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:97:8: ( 'switch' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:97:10: 'switch'
            {
            match("switch"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Switch"

    // $ANTLR start "Case"
    public final void mCase() throws RecognitionException {
        try {
            int _type = Case;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:98:6: ( 'case' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:98:8: 'case'
            {
            match("case"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Case"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:99:9: ( 'default' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:99:11: 'default'
            {
            match("default"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Function"
    public final void mFunction() throws RecognitionException {
        try {
            int _type = Function;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:100:10: ( 'function' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:100:12: 'function'
            {
            match("function"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Function"

    // $ANTLR start "Break"
    public final void mBreak() throws RecognitionException {
        try {
            int _type = Break;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:101:7: ( 'break' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:101:9: 'break'
            {
            match("break"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Break"

    // $ANTLR start "Continue"
    public final void mContinue() throws RecognitionException {
        try {
            int _type = Continue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:102:10: ( 'continue' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:102:12: 'continue'
            {
            match("continue"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Continue"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:103:8: ( 'return' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:103:10: 'return'
            {
            match("return"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "Global"
    public final void mGlobal() throws RecognitionException {
        try {
            int _type = Global;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:104:8: ( 'global' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:104:10: 'global'
            {
            match("global"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Global"

    // $ANTLR start "Static"
    public final void mStatic() throws RecognitionException {
        try {
            int _type = Static;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:105:8: ( 'static' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:105:10: 'static'
            {
            match("static"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Static"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:106:5: ( 'and' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:106:7: 'and'
            {
            match("and"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:107:4: ( 'or' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:107:6: 'or'
            {
            match("or"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "Xor"
    public final void mXor() throws RecognitionException {
        try {
            int _type = Xor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:108:5: ( 'xor' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:108:7: 'xor'
            {
            match("xor"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xor"

    // $ANTLR start "Instanceof"
    public final void mInstanceof() throws RecognitionException {
        try {
            int _type = Instanceof;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:109:12: ( 'instanceof' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:109:14: 'instanceof'
            {
            match("instanceof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Instanceof"

    // $ANTLR start "List"
    public final void mList() throws RecognitionException {
        try {
            int _type = List;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:110:6: ( 'list' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:110:8: 'list'
            {
            match("list"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "List"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:111:7: ( 'class' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:111:9: 'class'
            {
            match("class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "Interface"
    public final void mInterface() throws RecognitionException {
        try {
            int _type = Interface;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:112:11: ( 'interface' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:112:13: 'interface'
            {
            match("interface"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Interface"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:113:9: ( 'extends' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:113:11: 'extends'
            {
            match("extends"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "Implements"
    public final void mImplements() throws RecognitionException {
        try {
            int _type = Implements;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:114:12: ( 'implements' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:114:14: 'implements'
            {
            match("implements"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Implements"

    // $ANTLR start "Abstract"
    public final void mAbstract() throws RecognitionException {
        try {
            int _type = Abstract;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:115:10: ( 'abstract' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:115:12: 'abstract'
            {
            match("abstract"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Abstract"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:116:5: ( 'var' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:116:7: 'var'
            {
            match("var"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "Const"
    public final void mConst() throws RecognitionException {
        try {
            int _type = Const;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:117:7: ( 'const' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:117:9: 'const'
            {
            match("const"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Const"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:118:8: ( 'as' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:118:10: 'as'
            {
            match("as"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "BodyString"
    public final void mBodyString() throws RecognitionException {
        try {
            int _type = BodyString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:455:5: ( '?>' BodyStringRest )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:455:7: '?>' BodyStringRest
            {
            match("?>"); if (state.failed) return ;

            mBodyStringRest(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BodyString"

    // $ANTLR start "BodyStringRest"
    public final void mBodyStringRest() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:460:5: ({...}? => BodyStringRestShortTag | ( ( '<' ~ '?' )=> '<' | ~ '<' )* ( '<?php' )? )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='<') ) {
                int LA3_1 = input.LA(2);

                if ( ((isAllowShortOpenTag())) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>='\u0000' && LA3_0<=';')||(LA3_0>='=' && LA3_0<='\uFFFF')) ) {
                int LA3_2 = input.LA(2);

                if ( ((isAllowShortOpenTag())) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else if ( ((isAllowShortOpenTag())) ) {
                alt3=1;
            }
            else if ( (true) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:460:7: {...}? => BodyStringRestShortTag
                    {
                    if ( !((isAllowShortOpenTag())) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "BodyStringRest", "isAllowShortOpenTag()");
                    }
                    mBodyStringRestShortTag(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:461:7: ( ( '<' ~ '?' )=> '<' | ~ '<' )* ( '<?php' )?
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:461:7: ( ( '<' ~ '?' )=> '<' | ~ '<' )*
                    loop1:
                    do {
                        int alt1=3;
                        alt1 = dfa1.predict(input);
                        switch (alt1) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:461:8: ( '<' ~ '?' )=> '<'
                    	    {
                    	    match('<'); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:461:28: ~ '<'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:461:36: ( '<?php' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='<') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:461:36: '<?php'
                            {
                            match("<?php"); if (state.failed) return ;


                            }
                            break;

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "BodyStringRest"

    // $ANTLR start "BodyStringRestShortTag"
    public final void mBodyStringRestShortTag() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:5: ( ( ( '<' ~ '?' )=> '<' | ~ '<' )* ( '<?' ( ( 'php' )? ) )? )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:7: ( ( '<' ~ '?' )=> '<' | ~ '<' )* ( '<?' ( ( 'php' )? ) )?
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:7: ( ( '<' ~ '?' )=> '<' | ~ '<' )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='<') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='?') ) {
                        int LA4_4 = input.LA(3);

                        if ( (synpred2_Php()) ) {
                            alt4=1;
                        }


                    }
                    else if ( (LA4_1=='<') && (synpred2_Php())) {
                        alt4=1;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<=';')||(LA4_1>='=' && LA4_1<='>')||(LA4_1>='@' && LA4_1<='\uFFFF')) && (synpred2_Php())) {
                        alt4=1;
                    }

                    else {
                        alt4=1;
                    }

                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=';')||(LA4_0>='=' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:8: ( '<' ~ '?' )=> '<'
            	    {
            	    match('<'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:28: ~ '<'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:36: ( '<?' ( ( 'php' )? ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='<') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:37: '<?' ( ( 'php' )? )
                    {
                    match("<?"); if (state.failed) return ;

                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:42: ( ( 'php' )? )
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:43: ( 'php' )?
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:43: ( 'php' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='p') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:43: 'php'
                            {
                            match("php"); if (state.failed) return ;


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "BodyStringRestShortTag"

    // $ANTLR start "MultilineComment"
    public final void mMultilineComment() throws RecognitionException {
        try {
            int _type = MultilineComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:472:5: ( '/*' ( ( '*' ~ '/' )=> '*' | ~ '*' )* '*/' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:472:7: '/*' ( ( '*' ~ '/' )=> '*' | ~ '*' )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:472:12: ( ( '*' ~ '/' )=> '*' | ~ '*' )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3=='*') && (synpred3_Php())) {
                            alt7=1;
                        }
                        else if ( ((LA7_3>='\u0000' && LA7_3<=')')||(LA7_3>='+' && LA7_3<='\uFFFF')) && (synpred3_Php())) {
                            alt7=1;
                        }


                    }
                    else if ( (LA7_1=='*') && (synpred3_Php())) {
                        alt7=1;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<=')')||(LA7_1>='+' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) && (synpred3_Php())) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:472:13: ( '*' ~ '/' )=> '*'
            	    {
            	    match('*'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:472:32: ~ '*'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); if (state.failed) return ;

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MultilineComment"

    // $ANTLR start "SinglelineComment"
    public final void mSinglelineComment() throws RecognitionException {
        try {
            int _type = SinglelineComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:476:5: ( '//' ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:476:7: '//' ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )*
            {
            match("//"); if (state.failed) return ;

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:476:13: ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='?') && (synpred4_Php())) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='>')||(LA8_0>='@' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:476:14: ( '?' ~ '>' )=> '?'
            	    {
            	    match('?'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:476:32: ~ ( '\\n' | '?' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='>')||(input.LA(1)>='@' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SinglelineComment"

    // $ANTLR start "UnixComment"
    public final void mUnixComment() throws RecognitionException {
        try {
            int _type = UnixComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:480:5: ( '#' ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:480:7: '#' ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )*
            {
            match('#'); if (state.failed) return ;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:480:11: ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='?') && (synpred5_Php())) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='>')||(LA9_0>='@' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:480:12: ( '?' ~ '>' )=> '?'
            	    {
            	    match('?'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:480:30: ~ ( '\\n' | '?' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='>')||(input.LA(1)>='@' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UnixComment"

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:485:5: ( ( 'a' | 'A' ) ( 'r' | 'R' ) ( 'r' | 'R' ) ( 'a' | 'A' ) ( 'y' | 'Y' ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:485:7: ( 'a' | 'A' ) ( 'r' | 'R' ) ( 'r' | 'R' ) ( 'a' | 'A' ) ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Array"

    // $ANTLR start "RequireOperator"
    public final void mRequireOperator() throws RecognitionException {
        try {
            int _type = RequireOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:489:5: ( 'require' | 'require_once' | 'include' | 'include_once' )
            int alt10=4;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:489:7: 'require'
                    {
                    match("require"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:489:19: 'require_once'
                    {
                    match("require_once"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:489:36: 'include'
                    {
                    match("include"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:489:48: 'include_once'
                    {
                    match("include_once"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RequireOperator"

    // $ANTLR start "PrimitiveType"
    public final void mPrimitiveType() throws RecognitionException {
        try {
            int _type = PrimitiveType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:493:5: ( 'int' | 'float' | 'string' | 'array' | 'object' | 'bool' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt11=1;
                }
                break;
            case 'f':
                {
                alt11=2;
                }
                break;
            case 's':
                {
                alt11=3;
                }
                break;
            case 'a':
                {
                alt11=4;
                }
                break;
            case 'o':
                {
                alt11=5;
                }
                break;
            case 'b':
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:493:7: 'int'
                    {
                    match("int"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:493:13: 'float'
                    {
                    match("float"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:493:21: 'string'
                    {
                    match("string"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:493:30: 'array'
                    {
                    match("array"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:493:38: 'object'
                    {
                    match("object"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:493:47: 'bool'
                    {
                    match("bool"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PrimitiveType"

    // $ANTLR start "AccessModifier"
    public final void mAccessModifier() throws RecognitionException {
        try {
            int _type = AccessModifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:497:5: ( 'public' | 'private' | 'protected' )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='p') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='u') ) {
                    alt12=1;
                }
                else if ( (LA12_1=='r') ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3=='i') ) {
                        alt12=2;
                    }
                    else if ( (LA12_3=='o') ) {
                        alt12=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:497:7: 'public'
                    {
                    match("public"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:497:18: 'private'
                    {
                    match("private"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:497:30: 'protected'
                    {
                    match("protected"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AccessModifier"

    // $ANTLR start "Decimal"
    public final void mDecimal() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:502:2: ( ( '1' .. '9' ( '0' .. '9' )* ) | '0' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='1' && LA14_0<='9')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='0') ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:502:3: ( '1' .. '9' ( '0' .. '9' )* )
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:502:3: ( '1' .. '9' ( '0' .. '9' )* )
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:502:4: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:502:13: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:502:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:502:26: '0'
                    {
                    match('0'); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "Decimal"

    // $ANTLR start "Hexadecimal"
    public final void mHexadecimal() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:506:2: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:506:4: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); if (state.failed) return ;
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:506:16: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='F')||(LA15_0>='a' && LA15_0<='f')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Hexadecimal"

    // $ANTLR start "Octal"
    public final void mOctal() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:511:2: ( '0' ( '0' .. '7' )+ )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:511:4: '0' ( '0' .. '7' )+
            {
            match('0'); if (state.failed) return ;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:511:7: ( '0' .. '7' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='7')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:511:8: '0' .. '7'
            	    {
            	    matchRange('0','7'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Octal"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:514:2: ( Octal | Decimal | Hexadecimal )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt17=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt17=1;
                    }
                    break;
                default:
                    alt17=2;}

            }
            else if ( ((LA17_0>='1' && LA17_0<='9')) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:514:3: Octal
                    {
                    mOctal(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:514:9: Decimal
                    {
                    mDecimal(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:514:17: Hexadecimal
                    {
                    mHexadecimal(); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "Digits"
    public final void mDigits() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:519:2: ( ( '0' .. '9' )+ )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:519:4: ( '0' .. '9' )+
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:519:4: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:519:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Digits"

    // $ANTLR start "DNum"
    public final void mDNum() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:2: ( ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:3: ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) )
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:3: ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='.') && (synpred6_Php())) {
                alt20=1;
            }
            else if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:4: ( '.' Digits )=> ( '.' Digits )
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:18: ( '.' Digits )
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:19: '.' Digits
                    {
                    match('.'); if (state.failed) return ;
                    mDigits(); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:31: ( Digits '.' ( Digits )? )
                    {
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:31: ( Digits '.' ( Digits )? )
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:32: Digits '.' ( Digits )?
                    {
                    mDigits(); if (state.failed) return ;
                    match('.'); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:43: ( Digits )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:43: Digits
                            {
                            mDigits(); if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DNum"

    // $ANTLR start "Exponent_DNum"
    public final void mExponent_DNum() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:529:2: ( ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits ) )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:529:3: ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits )
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:529:3: ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:529:4: ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:529:4: ( Digits | DNum )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:529:5: Digits
                    {
                    mDigits(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:529:12: DNum
                    {
                    mDNum(); if (state.failed) return ;

                    }
                    break;

            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:529:26: ( '+' '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='+') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:529:27: '+' '-'
                    {
                    match('+'); if (state.failed) return ;
                    match('-'); if (state.failed) return ;

                    }
                    break;

            }

            mDigits(); if (state.failed) return ;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent_DNum"

    // $ANTLR start "Real"
    public final void mReal() throws RecognitionException {
        try {
            int _type = Real;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:533:5: ( DNum | Exponent_DNum )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:533:7: DNum
                    {
                    mDNum(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:533:12: Exponent_DNum
                    {
                    mExponent_DNum(); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Real"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:537:5: ( 'true' | 'false' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='t') ) {
                alt24=1;
            }
            else if ( (LA24_0=='f') ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:537:7: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:537:16: 'false'
                    {
                    match("false"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Boolean"

    // $ANTLR start "SingleQuotedString"
    public final void mSingleQuotedString() throws RecognitionException {
        try {
            int _type = SingleQuotedString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:541:5: ( '\\'' ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' | ~ ( '\\'' | '\\\\' ) )* '\\'' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:541:7: '\\'' ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' | ~ ( '\\'' | '\\\\' ) )* '\\''
            {
            match('\''); if (state.failed) return ;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:541:12: ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' | ~ ( '\\'' | '\\\\' ) )*
            loop25:
            do {
                int alt25=5;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:541:13: ( '\\\\' '\\'' )=> '\\\\' '\\''
            	    {
            	    match('\\'); if (state.failed) return ;
            	    match('\''); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:542:15: ( '\\\\' '\\\\' )=> '\\\\' '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;
            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:543:15: '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:543:22: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SingleQuotedString"

    // $ANTLR start "EscapeCharector"
    public final void mEscapeCharector() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:549:5: ( 'n' | 'r' | 't' | '\\\\' | '$' | '\"' | Digits | 'x' )
            int alt26=8;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt26=1;
                }
                break;
            case 'r':
                {
                alt26=2;
                }
                break;
            case 't':
                {
                alt26=3;
                }
                break;
            case '\\':
                {
                alt26=4;
                }
                break;
            case '$':
                {
                alt26=5;
                }
                break;
            case '\"':
                {
                alt26=6;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt26=7;
                }
                break;
            case 'x':
                {
                alt26=8;
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
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:549:7: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:549:13: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:549:19: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:549:25: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:549:32: '$'
                    {
                    match('$'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:549:38: '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:549:44: Digits
                    {
                    mDigits(); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:549:53: 'x'
                    {
                    match('x'); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "EscapeCharector"

    // $ANTLR start "DoubleQuotedString"
    public final void mDoubleQuotedString() throws RecognitionException {
        try {
            int _type = DoubleQuotedString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:553:5: ( '\"' ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:553:7: '\"' ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:553:12: ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' | ~ ( '\\\\' | '\"' ) )*
            loop27:
            do {
                int alt27=4;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:553:14: ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector
            	    {
            	    match('\\'); if (state.failed) return ;
            	    mEscapeCharector(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:554:7: '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:555:7: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DoubleQuotedString"

    // $ANTLR start "HereDoc"
    public final void mHereDoc() throws RecognitionException {
        try {
            int _type = HereDoc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:560:5: ( '<<<' HereDocContents )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:560:7: '<<<' HereDocContents
            {
            match("<<<"); if (state.failed) return ;

            mHereDocContents(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HereDoc"

    // $ANTLR start "UnquotedString"
    public final void mUnquotedString() throws RecognitionException {
        try {
            int _type = UnquotedString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:565:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:565:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:565:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UnquotedString"

    // $ANTLR start "HereDocContents"
    public final void mHereDocContents() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:571:5: ()
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:571:7: 
            {
            if ( state.backtracking==0 ) {

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

            }

        }
        finally {
        }
    }
    // $ANTLR end "HereDocContents"

    // $ANTLR start "AsignmentOperator"
    public final void mAsignmentOperator() throws RecognitionException {
        try {
            int _type = AsignmentOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:5: ( '+=' | '-=' | '*=' | '/=' | '.=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
            int alt29=11;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt29=1;
                }
                break;
            case '-':
                {
                alt29=2;
                }
                break;
            case '*':
                {
                alt29=3;
                }
                break;
            case '/':
                {
                alt29=4;
                }
                break;
            case '.':
                {
                alt29=5;
                }
                break;
            case '%':
                {
                alt29=6;
                }
                break;
            case '&':
                {
                alt29=7;
                }
                break;
            case '|':
                {
                alt29=8;
                }
                break;
            case '^':
                {
                alt29=9;
                }
                break;
            case '<':
                {
                alt29=10;
                }
                break;
            case '>':
                {
                alt29=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:7: '+='
                    {
                    match("+="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:12: '-='
                    {
                    match("-="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:17: '*='
                    {
                    match("*="); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:22: '/='
                    {
                    match("/="); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:27: '.='
                    {
                    match(".="); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:32: '%='
                    {
                    match("%="); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:37: '&='
                    {
                    match("&="); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:42: '|='
                    {
                    match("|="); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:47: '^='
                    {
                    match("^="); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:52: '<<='
                    {
                    match("<<="); if (state.failed) return ;


                    }
                    break;
                case 11 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:602:58: '>>='
                    {
                    match(">>="); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AsignmentOperator"

    // $ANTLR start "EqualityOperator"
    public final void mEqualityOperator() throws RecognitionException {
        try {
            int _type = EqualityOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:606:5: ( '==' | '!=' | '===' | '!==' )
            int alt30=4;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='=') ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1=='=') ) {
                    int LA30_3 = input.LA(3);

                    if ( (LA30_3=='=') ) {
                        alt30=3;
                    }
                    else {
                        alt30=1;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA30_0=='!') ) {
                int LA30_2 = input.LA(2);

                if ( (LA30_2=='=') ) {
                    int LA30_4 = input.LA(3);

                    if ( (LA30_4=='=') ) {
                        alt30=4;
                    }
                    else {
                        alt30=2;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:606:7: '=='
                    {
                    match("=="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:606:14: '!='
                    {
                    match("!="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:606:21: '==='
                    {
                    match("==="); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:606:29: '!=='
                    {
                    match("!=="); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualityOperator"

    // $ANTLR start "ComparisionOperator"
    public final void mComparisionOperator() throws RecognitionException {
        try {
            int _type = ComparisionOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:610:5: ( '<' | '<=' | '>' | '>=' | '<>' )
            int alt31=5;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='<') ) {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt31=2;
                    }
                    break;
                case '>':
                    {
                    alt31=5;
                    }
                    break;
                default:
                    alt31=1;}

            }
            else if ( (LA31_0=='>') ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2=='=') ) {
                    alt31=4;
                }
                else {
                    alt31=3;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:610:7: '<'
                    {
                    match('<'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:610:13: '<='
                    {
                    match("<="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:610:20: '>'
                    {
                    match('>'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:610:26: '>='
                    {
                    match(">="); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:610:33: '<>'
                    {
                    match("<>"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ComparisionOperator"

    // $ANTLR start "ShiftOperator"
    public final void mShiftOperator() throws RecognitionException {
        try {
            int _type = ShiftOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:614:5: ( '<<' | '>>' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='<') ) {
                alt32=1;
            }
            else if ( (LA32_0=='>') ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:614:7: '<<'
                    {
                    match("<<"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:614:14: '>>'
                    {
                    match(">>"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ShiftOperator"

    // $ANTLR start "IncrementOperator"
    public final void mIncrementOperator() throws RecognitionException {
        try {
            int _type = IncrementOperator;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:618:5: ( '--' | '++' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='-') ) {
                alt33=1;
            }
            else if ( (LA33_0=='+') ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:618:7: '--'
                    {
                    match("--"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:618:12: '++'
                    {
                    match("++"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IncrementOperator"

    // $ANTLR start "Eol"
    public final void mEol() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:623:5: ( '\\n' )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:623:7: '\\n'
            {
            match('\n'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "Eol"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                _channel=HIDDEN;

            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:630:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )* )
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:630:4: ( ' ' | '\\t' | '\\n' | '\\r' )*
            {
            // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:630:4: ( ' ' | '\\t' | '\\n' | '\\r' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='\t' && LA34_0<='\n')||LA34_0=='\r'||LA34_0==' ') ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WhiteSpace"

    public void mTokens() throws RecognitionException {
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:8: ( SemiColon | Comma | OpenRoundBracket | CloseRoundBracket | OpenSquareBracket | CloseSquareBracket | OpenCurlyBracket | CloseCurlyBracket | ArrayAssign | LogicalOr | LogicalAnd | ClassMember | InstanceMember | SuppressWarnings | QuestionMark | Dollar | Colon | Dot | Ampersand | Pipe | Bang | Plus | Minus | Asterisk | Percent | Forwardslash | Tilde | Equals | New | Clone | Echo | If | Else | ElseIf | For | Foreach | While | Do | Switch | Case | Default | Function | Break | Continue | Return | Global | Static | And | Or | Xor | Instanceof | List | Class | Interface | Extends | Implements | Abstract | Var | Const | T__113 | BodyString | MultilineComment | SinglelineComment | UnixComment | Array | RequireOperator | PrimitiveType | AccessModifier | Integer | Real | Boolean | SingleQuotedString | DoubleQuotedString | HereDoc | UnquotedString | AsignmentOperator | EqualityOperator | ComparisionOperator | ShiftOperator | IncrementOperator | WhiteSpace )
        int alt35=81;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:10: SemiColon
                {
                mSemiColon(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:20: Comma
                {
                mComma(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:26: OpenRoundBracket
                {
                mOpenRoundBracket(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:43: CloseRoundBracket
                {
                mCloseRoundBracket(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:61: OpenSquareBracket
                {
                mOpenSquareBracket(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:79: CloseSquareBracket
                {
                mCloseSquareBracket(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:98: OpenCurlyBracket
                {
                mOpenCurlyBracket(); if (state.failed) return ;

                }
                break;
            case 8 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:115: CloseCurlyBracket
                {
                mCloseCurlyBracket(); if (state.failed) return ;

                }
                break;
            case 9 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:133: ArrayAssign
                {
                mArrayAssign(); if (state.failed) return ;

                }
                break;
            case 10 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:145: LogicalOr
                {
                mLogicalOr(); if (state.failed) return ;

                }
                break;
            case 11 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:155: LogicalAnd
                {
                mLogicalAnd(); if (state.failed) return ;

                }
                break;
            case 12 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:166: ClassMember
                {
                mClassMember(); if (state.failed) return ;

                }
                break;
            case 13 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:178: InstanceMember
                {
                mInstanceMember(); if (state.failed) return ;

                }
                break;
            case 14 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:193: SuppressWarnings
                {
                mSuppressWarnings(); if (state.failed) return ;

                }
                break;
            case 15 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:210: QuestionMark
                {
                mQuestionMark(); if (state.failed) return ;

                }
                break;
            case 16 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:223: Dollar
                {
                mDollar(); if (state.failed) return ;

                }
                break;
            case 17 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:230: Colon
                {
                mColon(); if (state.failed) return ;

                }
                break;
            case 18 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:236: Dot
                {
                mDot(); if (state.failed) return ;

                }
                break;
            case 19 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:240: Ampersand
                {
                mAmpersand(); if (state.failed) return ;

                }
                break;
            case 20 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:250: Pipe
                {
                mPipe(); if (state.failed) return ;

                }
                break;
            case 21 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:255: Bang
                {
                mBang(); if (state.failed) return ;

                }
                break;
            case 22 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:260: Plus
                {
                mPlus(); if (state.failed) return ;

                }
                break;
            case 23 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:265: Minus
                {
                mMinus(); if (state.failed) return ;

                }
                break;
            case 24 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:271: Asterisk
                {
                mAsterisk(); if (state.failed) return ;

                }
                break;
            case 25 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:280: Percent
                {
                mPercent(); if (state.failed) return ;

                }
                break;
            case 26 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:288: Forwardslash
                {
                mForwardslash(); if (state.failed) return ;

                }
                break;
            case 27 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:301: Tilde
                {
                mTilde(); if (state.failed) return ;

                }
                break;
            case 28 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:307: Equals
                {
                mEquals(); if (state.failed) return ;

                }
                break;
            case 29 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:314: New
                {
                mNew(); if (state.failed) return ;

                }
                break;
            case 30 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:318: Clone
                {
                mClone(); if (state.failed) return ;

                }
                break;
            case 31 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:324: Echo
                {
                mEcho(); if (state.failed) return ;

                }
                break;
            case 32 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:329: If
                {
                mIf(); if (state.failed) return ;

                }
                break;
            case 33 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:332: Else
                {
                mElse(); if (state.failed) return ;

                }
                break;
            case 34 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:337: ElseIf
                {
                mElseIf(); if (state.failed) return ;

                }
                break;
            case 35 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:344: For
                {
                mFor(); if (state.failed) return ;

                }
                break;
            case 36 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:348: Foreach
                {
                mForeach(); if (state.failed) return ;

                }
                break;
            case 37 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:356: While
                {
                mWhile(); if (state.failed) return ;

                }
                break;
            case 38 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:362: Do
                {
                mDo(); if (state.failed) return ;

                }
                break;
            case 39 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:365: Switch
                {
                mSwitch(); if (state.failed) return ;

                }
                break;
            case 40 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:372: Case
                {
                mCase(); if (state.failed) return ;

                }
                break;
            case 41 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:377: Default
                {
                mDefault(); if (state.failed) return ;

                }
                break;
            case 42 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:385: Function
                {
                mFunction(); if (state.failed) return ;

                }
                break;
            case 43 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:394: Break
                {
                mBreak(); if (state.failed) return ;

                }
                break;
            case 44 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:400: Continue
                {
                mContinue(); if (state.failed) return ;

                }
                break;
            case 45 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:409: Return
                {
                mReturn(); if (state.failed) return ;

                }
                break;
            case 46 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:416: Global
                {
                mGlobal(); if (state.failed) return ;

                }
                break;
            case 47 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:423: Static
                {
                mStatic(); if (state.failed) return ;

                }
                break;
            case 48 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:430: And
                {
                mAnd(); if (state.failed) return ;

                }
                break;
            case 49 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:434: Or
                {
                mOr(); if (state.failed) return ;

                }
                break;
            case 50 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:437: Xor
                {
                mXor(); if (state.failed) return ;

                }
                break;
            case 51 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:441: Instanceof
                {
                mInstanceof(); if (state.failed) return ;

                }
                break;
            case 52 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:452: List
                {
                mList(); if (state.failed) return ;

                }
                break;
            case 53 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:457: Class
                {
                mClass(); if (state.failed) return ;

                }
                break;
            case 54 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:463: Interface
                {
                mInterface(); if (state.failed) return ;

                }
                break;
            case 55 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:473: Extends
                {
                mExtends(); if (state.failed) return ;

                }
                break;
            case 56 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:481: Implements
                {
                mImplements(); if (state.failed) return ;

                }
                break;
            case 57 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:492: Abstract
                {
                mAbstract(); if (state.failed) return ;

                }
                break;
            case 58 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:501: Var
                {
                mVar(); if (state.failed) return ;

                }
                break;
            case 59 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:505: Const
                {
                mConst(); if (state.failed) return ;

                }
                break;
            case 60 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:511: T__113
                {
                mT__113(); if (state.failed) return ;

                }
                break;
            case 61 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:518: BodyString
                {
                mBodyString(); if (state.failed) return ;

                }
                break;
            case 62 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:529: MultilineComment
                {
                mMultilineComment(); if (state.failed) return ;

                }
                break;
            case 63 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:546: SinglelineComment
                {
                mSinglelineComment(); if (state.failed) return ;

                }
                break;
            case 64 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:564: UnixComment
                {
                mUnixComment(); if (state.failed) return ;

                }
                break;
            case 65 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:576: Array
                {
                mArray(); if (state.failed) return ;

                }
                break;
            case 66 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:582: RequireOperator
                {
                mRequireOperator(); if (state.failed) return ;

                }
                break;
            case 67 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:598: PrimitiveType
                {
                mPrimitiveType(); if (state.failed) return ;

                }
                break;
            case 68 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:612: AccessModifier
                {
                mAccessModifier(); if (state.failed) return ;

                }
                break;
            case 69 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:627: Integer
                {
                mInteger(); if (state.failed) return ;

                }
                break;
            case 70 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:635: Real
                {
                mReal(); if (state.failed) return ;

                }
                break;
            case 71 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:640: Boolean
                {
                mBoolean(); if (state.failed) return ;

                }
                break;
            case 72 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:648: SingleQuotedString
                {
                mSingleQuotedString(); if (state.failed) return ;

                }
                break;
            case 73 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:667: DoubleQuotedString
                {
                mDoubleQuotedString(); if (state.failed) return ;

                }
                break;
            case 74 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:686: HereDoc
                {
                mHereDoc(); if (state.failed) return ;

                }
                break;
            case 75 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:694: UnquotedString
                {
                mUnquotedString(); if (state.failed) return ;

                }
                break;
            case 76 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:709: AsignmentOperator
                {
                mAsignmentOperator(); if (state.failed) return ;

                }
                break;
            case 77 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:727: EqualityOperator
                {
                mEqualityOperator(); if (state.failed) return ;

                }
                break;
            case 78 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:744: ComparisionOperator
                {
                mComparisionOperator(); if (state.failed) return ;

                }
                break;
            case 79 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:764: ShiftOperator
                {
                mShiftOperator(); if (state.failed) return ;

                }
                break;
            case 80 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:778: IncrementOperator
                {
                mIncrementOperator(); if (state.failed) return ;

                }
                break;
            case 81 :
                // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:1:796: WhiteSpace
                {
                mWhiteSpace(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Php
    public final void synpred1_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:461:8: ( '<' ~ '?' )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:461:9: '<' ~ '?'
        {
        match('<'); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='>')||(input.LA(1)>='@' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred1_Php

    // $ANTLR start synpred2_Php
    public final void synpred2_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:8: ( '<' ~ '?' )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:466:9: '<' ~ '?'
        {
        match('<'); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='>')||(input.LA(1)>='@' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred2_Php

    // $ANTLR start synpred3_Php
    public final void synpred3_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:472:13: ( '*' ~ '/' )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:472:14: '*' ~ '/'
        {
        match('*'); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred3_Php

    // $ANTLR start synpred4_Php
    public final void synpred4_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:476:14: ( '?' ~ '>' )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:476:15: '?' ~ '>'
        {
        match('?'); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred4_Php

    // $ANTLR start synpred5_Php
    public final void synpred5_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:480:12: ( '?' ~ '>' )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:480:13: '?' ~ '>'
        {
        match('?'); if (state.failed) return ;
        if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            input.consume();
        state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            recover(mse);
            throw mse;}


        }
    }
    // $ANTLR end synpred5_Php

    // $ANTLR start synpred6_Php
    public final void synpred6_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:4: ( '.' Digits )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:524:5: '.' Digits
        {
        match('.'); if (state.failed) return ;
        mDigits(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Php

    // $ANTLR start synpred7_Php
    public final void synpred7_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:541:13: ( '\\\\' '\\'' )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:541:14: '\\\\' '\\''
        {
        match('\\'); if (state.failed) return ;
        match('\''); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Php

    // $ANTLR start synpred8_Php
    public final void synpred8_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:542:15: ( '\\\\' '\\\\' )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:542:16: '\\\\' '\\\\'
        {
        match('\\'); if (state.failed) return ;
        match('\\'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Php

    // $ANTLR start synpred9_Php
    public final void synpred9_Php_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:553:14: ( '\\\\' EscapeCharector )
        // /Users/sidharth/Documents/code/phpparser/grammar/Php.g:553:15: '\\\\' EscapeCharector
        {
        match('\\'); if (state.failed) return ;
        mEscapeCharector(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Php

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
    public final boolean synpred9_Php() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Php_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA1_eotS =
        "\1\2\1\6\2\uffff\1\6\3\uffff\2\6\1\uffff";
    static final String DFA1_eofS =
        "\13\uffff";
    static final String DFA1_minS =
        "\2\0\2\uffff\1\0\3\uffff\3\0";
    static final String DFA1_maxS =
        "\2\uffff\2\uffff\1\uffff\3\uffff\2\uffff\1\0";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\1\2\1\uffff\3\1\3\uffff";
    static final String DFA1_specialS =
        "\1\5\1\3\2\uffff\1\0\3\uffff\1\1\1\4\1\2}>";
    static final String[] DFA1_transitionS = {
            "\74\3\1\1\uffc3\3",
            "\74\7\1\5\2\7\1\4\uffc0\7",
            "",
            "",
            "\74\7\1\5\63\7\1\10\uff8f\7",
            "",
            "",
            "",
            "\74\7\1\5\53\7\1\11\uff97\7",
            "\74\7\1\5\63\7\1\12\uff8f\7",
            "\1\uffff"
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
            return "()* loopback of 461:7: ( ( '<' ~ '?' )=> '<' | ~ '<' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_4=='p') ) {s = 8;}

                        else if ( (LA1_4=='<') && (synpred1_Php())) {s = 5;}

                        else if ( ((LA1_4>='\u0000' && LA1_4<=';')||(LA1_4>='=' && LA1_4<='o')||(LA1_4>='q' && LA1_4<='\uFFFF')) && (synpred1_Php())) {s = 7;}

                        else s = 6;

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_8=='h') ) {s = 9;}

                        else if ( (LA1_8=='<') && (synpred1_Php())) {s = 5;}

                        else if ( ((LA1_8>='\u0000' && LA1_8<=';')||(LA1_8>='=' && LA1_8<='g')||(LA1_8>='i' && LA1_8<='\uFFFF')) && (synpred1_Php())) {s = 7;}

                        else s = 6;

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Php()) ) {s = 7;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_1=='?') ) {s = 4;}

                        else if ( (LA1_1=='<') && (synpred1_Php())) {s = 5;}

                        else if ( ((LA1_1>='\u0000' && LA1_1<=';')||(LA1_1>='=' && LA1_1<='>')||(LA1_1>='@' && LA1_1<='\uFFFF')) && (synpred1_Php())) {s = 7;}

                        else s = 6;

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_9=='p') ) {s = 10;}

                        else if ( (LA1_9=='<') && (synpred1_Php())) {s = 5;}

                        else if ( ((LA1_9>='\u0000' && LA1_9<=';')||(LA1_9>='=' && LA1_9<='o')||(LA1_9>='q' && LA1_9<='\uFFFF')) && (synpred1_Php())) {s = 7;}

                        else s = 6;

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_0 = input.LA(1);

                        s = -1;
                        if ( (LA1_0=='<') ) {s = 1;}

                        else if ( ((LA1_0>='\u0000' && LA1_0<=';')||(LA1_0>='=' && LA1_0<='\uFFFF')) ) {s = 3;}

                        else s = 2;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\15\uffff\1\20\1\22\4\uffff";
    static final String DFA10_eofS =
        "\23\uffff";
    static final String DFA10_minS =
        "\1\151\1\145\1\156\1\161\1\143\1\165\1\154\1\151\1\165\1\162\1\144"+
        "\2\145\2\137\4\uffff";
    static final String DFA10_maxS =
        "\1\162\1\145\1\156\1\161\1\143\1\165\1\154\1\151\1\165\1\162\1\144"+
        "\2\145\2\137\4\uffff";
    static final String DFA10_acceptS =
        "\17\uffff\1\2\1\1\1\4\1\3";
    static final String DFA10_specialS =
        "\23\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\10\uffff\1\1",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "488:1: RequireOperator : ( 'require' | 'require_once' | 'include' | 'include_once' );";
        }
    }
    static final String DFA21_eotS =
        "\4\uffff";
    static final String DFA21_eofS =
        "\4\uffff";
    static final String DFA21_minS =
        "\2\56\2\uffff";
    static final String DFA21_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA21_specialS =
        "\4\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "529:4: ( Digits | DNum )";
        }
    }
    static final String DFA23_eotS =
        "\3\uffff\2\6\2\uffff\1\6";
    static final String DFA23_eofS =
        "\10\uffff";
    static final String DFA23_minS =
        "\1\56\1\60\1\56\2\60\2\uffff\1\60";
    static final String DFA23_maxS =
        "\2\71\3\145\2\uffff\1\145";
    static final String DFA23_acceptS =
        "\5\uffff\1\2\1\1\1\uffff";
    static final String DFA23_specialS =
        "\10\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\1\uffff\12\2",
            "\12\3",
            "\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
            "\12\3\13\uffff\1\5\37\uffff\1\5",
            "\12\7\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            "\12\7\13\uffff\1\5\37\uffff\1\5"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "532:1: Real : ( DNum | Exponent_DNum );";
        }
    }
    static final String DFA25_eotS =
        "\4\uffff\1\6\6\uffff";
    static final String DFA25_eofS =
        "\13\uffff";
    static final String DFA25_minS =
        "\1\0\1\uffff\1\0\1\uffff\2\0\5\uffff";
    static final String DFA25_maxS =
        "\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\0\5\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\5\1\uffff\1\4\2\uffff\1\3\3\1\1\2";
    static final String DFA25_specialS =
        "\1\1\1\uffff\1\2\1\uffff\1\0\1\3\5\uffff}>";
    static final String[] DFA25_transitionS = {
            "\47\3\1\1\64\3\1\2\uffa3\3",
            "",
            "\47\6\1\4\64\6\1\5\uffa3\6",
            "",
            "\47\11\1\7\64\11\1\10\uffa3\11",
            "\1\uffff",
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
            return "()* loopback of 541:12: ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' | ~ ( '\\'' | '\\\\' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_4 = input.LA(1);

                         
                        int index25_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_4=='\'') && (synpred7_Php())) {s = 7;}

                        else if ( (LA25_4=='\\') && (synpred7_Php())) {s = 8;}

                        else if ( ((LA25_4>='\u0000' && LA25_4<='&')||(LA25_4>='(' && LA25_4<='[')||(LA25_4>=']' && LA25_4<='\uFFFF')) && (synpred7_Php())) {s = 9;}

                        else s = 6;

                         
                        input.seek(index25_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0=='\'') ) {s = 1;}

                        else if ( (LA25_0=='\\') ) {s = 2;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_2 = input.LA(1);

                        s = -1;
                        if ( (LA25_2=='\'') ) {s = 4;}

                        else if ( (LA25_2=='\\') ) {s = 5;}

                        else if ( ((LA25_2>='\u0000' && LA25_2<='&')||(LA25_2>='(' && LA25_2<='[')||(LA25_2>=']' && LA25_2<='\uFFFF')) ) {s = 6;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_5 = input.LA(1);

                         
                        int index25_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_Php()) ) {s = 10;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index25_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\4\uffff\1\14\13\uffff";
    static final String DFA27_eofS =
        "\20\uffff";
    static final String DFA27_minS =
        "\1\0\1\uffff\1\0\1\uffff\10\0\4\uffff";
    static final String DFA27_maxS =
        "\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\7\0\4\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\4\1\uffff\1\3\10\uffff\1\2\3\1";
    static final String DFA27_specialS =
        "\1\6\1\uffff\1\10\1\uffff\1\5\1\0\1\3\1\4\1\7\1\1\1\2\1\11\4\uffff}>";
    static final String[] DFA27_transitionS = {
            "\42\3\1\1\71\3\1\2\uffa3\3",
            "",
            "\42\14\1\4\1\14\1\11\13\14\12\12\42\14\1\5\21\14\1\6\3\14\1"+
            "\7\1\14\1\10\3\14\1\13\uff87\14",
            "",
            "\42\17\1\15\71\17\1\16\uffa3\17",
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
            return "()* loopback of 553:12: ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' | ~ ( '\\\\' | '\"' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Php()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_9 = input.LA(1);

                         
                        int index27_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Php()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index27_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_10 = input.LA(1);

                         
                        int index27_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Php()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index27_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Php()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_7 = input.LA(1);

                         
                        int index27_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Php()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index27_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_4=='\"') && (synpred9_Php())) {s = 13;}

                        else if ( (LA27_4=='\\') && (synpred9_Php())) {s = 14;}

                        else if ( ((LA27_4>='\u0000' && LA27_4<='!')||(LA27_4>='#' && LA27_4<='[')||(LA27_4>=']' && LA27_4<='\uFFFF')) && (synpred9_Php())) {s = 15;}

                        else s = 12;

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_0 = input.LA(1);

                        s = -1;
                        if ( (LA27_0=='\"') ) {s = 1;}

                        else if ( (LA27_0=='\\') ) {s = 2;}

                        else if ( ((LA27_0>='\u0000' && LA27_0<='!')||(LA27_0>='#' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_8 = input.LA(1);

                         
                        int index27_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Php()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index27_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_2 = input.LA(1);

                        s = -1;
                        if ( (LA27_2=='\"') ) {s = 4;}

                        else if ( (LA27_2=='\\') ) {s = 5;}

                        else if ( (LA27_2=='n') ) {s = 6;}

                        else if ( (LA27_2=='r') ) {s = 7;}

                        else if ( (LA27_2=='t') ) {s = 8;}

                        else if ( (LA27_2=='$') ) {s = 9;}

                        else if ( ((LA27_2>='0' && LA27_2<='9')) ) {s = 10;}

                        else if ( (LA27_2=='x') ) {s = 11;}

                        else if ( ((LA27_2>='\u0000' && LA27_2<='!')||LA27_2=='#'||(LA27_2>='%' && LA27_2<='/')||(LA27_2>=':' && LA27_2<='[')||(LA27_2>=']' && LA27_2<='m')||(LA27_2>='o' && LA27_2<='q')||LA27_2=='s'||(LA27_2>='u' && LA27_2<='w')||(LA27_2>='y' && LA27_2<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_11 = input.LA(1);

                         
                        int index27_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Php()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index27_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\1\64\10\uffff\1\67\1\71\1\73\1\75\1\100\1\uffff\1\102\1\uffff\1"+
        "\104\1\105\1\106\1\107\1\110\1\113\1\uffff\20\61\1\uffff\2\61\2"+
        "\157\1\61\2\uffff\1\164\2\uffff\1\164\30\uffff\7\61\1\176\7\61\1"+
        "\u0088\11\61\1\u0094\2\61\1\u0097\6\61\1\uffff\2\157\1\61\1\u00a1"+
        "\1\uffff\1\u00a1\1\u00a2\7\61\1\uffff\1\61\1\u00ad\2\61\1\u00b1"+
        "\4\61\1\uffff\11\61\1\u00bf\1\61\1\uffff\2\61\1\uffff\1\61\1\u00c4"+
        "\1\61\1\u00c6\4\61\3\uffff\2\61\1\u00cd\2\61\1\u00d0\1\u00d2\3\61"+
        "\1\uffff\3\61\1\uffff\11\61\1\u00ad\3\61\1\uffff\4\61\1\uffff\1"+
        "\u00e9\1\uffff\3\61\1\u00ed\1\u00ee\1\u00ef\1\uffff\1\61\1\u00f1"+
        "\1\uffff\1\61\1\uffff\7\61\1\u00ad\1\u00ed\1\u00fa\4\61\1\u00ff"+
        "\4\61\2\u0104\1\61\1\uffff\3\61\3\uffff\1\61\1\uffff\1\u010a\7\61"+
        "\1\uffff\1\61\1\u0113\1\u0114\1\u00ad\1\uffff\1\u0115\1\61\1\u0117"+
        "\1\61\1\uffff\1\u00ad\1\u0119\3\61\1\uffff\1\u011d\2\61\1\u0121"+
        "\1\61\1\u0123\1\61\1\u0125\3\uffff\1\u0121\1\uffff\1\61\1\uffff"+
        "\1\u0119\1\61\1\u0129\1\uffff\3\61\1\uffff\1\61\1\uffff\1\u012e"+
        "\1\uffff\1\61\1\u0130\1\61\1\uffff\1\61\1\u0133\2\61\1\uffff\1\61"+
        "\1\uffff\1\u0119\1\u0137\1\uffff\1\61\1\u0139\1\61\1\uffff\1\61"+
        "\1\uffff\1\61\2\u0121";
    static final String DFA35_eofS =
        "\u013d\uffff";
    static final String DFA35_minS =
        "\1\41\10\uffff\2\75\1\46\1\72\1\55\1\uffff\1\76\1\uffff\1\60\1\75"+
        "\1\53\2\75\1\52\1\uffff\1\145\1\141\1\143\1\146\1\141\1\150\1\145"+
        "\1\164\1\157\1\145\1\154\1\122\1\142\1\157\1\151\1\141\1\uffff\1"+
        "\122\1\162\2\56\1\162\2\uffff\1\74\2\uffff\1\76\30\uffff\1\167\1"+
        "\141\1\163\1\156\1\150\1\163\1\164\1\60\1\143\1\160\1\162\1\156"+
        "\1\157\1\154\1\151\1\60\1\146\1\151\1\141\1\145\1\157\1\161\1\157"+
        "\1\144\1\163\1\60\2\122\1\60\1\152\1\162\1\163\1\162\1\142\1\151"+
        "\1\uffff\2\56\1\165\1\74\1\uffff\1\75\1\60\1\156\1\163\1\145\1\163"+
        "\1\157\2\145\1\uffff\1\164\1\60\2\154\1\60\1\143\1\141\1\163\1\154"+
        "\1\uffff\1\141\2\164\1\151\1\141\1\154\2\165\1\142\1\60\1\164\1"+
        "\uffff\2\101\1\uffff\1\145\1\60\1\164\1\60\1\154\1\166\1\164\1\145"+
        "\3\uffff\1\145\1\163\1\60\1\151\1\164\2\60\1\156\1\141\1\162\1\uffff"+
        "\1\165\1\145\1\141\1\uffff\2\164\2\145\1\165\1\143\1\151\1\156\1"+
        "\153\1\60\1\162\1\151\1\141\1\uffff\1\162\2\131\1\143\1\uffff\1"+
        "\60\1\uffff\1\151\1\141\1\145\3\60\1\uffff\1\156\1\60\1\uffff\1"+
        "\146\1\uffff\1\144\1\156\1\146\1\144\1\155\1\143\1\151\3\60\1\154"+
        "\1\150\1\143\1\147\1\60\1\156\1\162\1\154\1\141\2\60\1\164\1\uffff"+
        "\1\143\1\164\1\143\3\uffff\1\165\1\uffff\1\60\1\163\1\143\1\141"+
        "\2\145\1\150\1\157\1\uffff\1\164\3\60\1\uffff\1\60\1\145\1\60\1"+
        "\143\1\uffff\2\60\1\145\1\164\1\145\1\uffff\1\60\1\145\1\143\1\60"+
        "\1\156\1\60\1\156\1\60\3\uffff\1\60\1\uffff\1\164\1\uffff\1\60\1"+
        "\145\1\60\1\uffff\1\157\1\145\1\157\1\uffff\1\164\1\uffff\1\60\1"+
        "\uffff\1\157\1\60\1\144\1\uffff\1\146\1\60\1\156\1\163\1\uffff\1"+
        "\156\1\uffff\2\60\1\uffff\1\143\1\60\1\143\1\uffff\1\145\1\uffff"+
        "\1\145\2\60";
    static final String DFA35_maxS =
        "\1\176\10\uffff\1\76\1\174\1\75\1\72\1\76\1\uffff\1\76\1\uffff\6"+
        "\75\1\uffff\1\145\1\157\1\170\1\156\1\165\1\150\1\157\1\167\1\162"+
        "\1\145\1\154\1\163\1\162\1\157\1\151\1\141\1\uffff\1\162\1\165\2"+
        "\145\1\162\2\uffff\1\74\2\uffff\1\76\30\uffff\1\167\1\157\1\163"+
        "\1\156\1\150\1\163\1\164\1\172\1\164\1\160\1\162\1\156\1\157\1\154"+
        "\1\151\1\172\1\146\1\151\1\162\1\145\1\157\1\164\1\157\1\144\1\163"+
        "\1\172\2\162\1\172\1\152\1\162\1\163\1\162\1\142\1\157\1\uffff\2"+
        "\145\1\165\1\75\1\uffff\1\75\1\172\1\156\1\163\1\145\1\164\1\157"+
        "\2\145\1\uffff\1\164\1\172\2\154\1\172\1\143\1\141\1\163\1\154\1"+
        "\uffff\1\141\2\164\1\151\1\141\1\154\2\165\1\142\1\172\1\164\1\uffff"+
        "\2\141\1\uffff\1\145\1\172\1\164\1\172\1\154\1\166\1\164\1\145\3"+
        "\uffff\1\145\1\163\1\172\1\151\1\164\2\172\1\156\1\141\1\162\1\uffff"+
        "\1\165\1\145\1\141\1\uffff\2\164\2\145\1\165\1\143\1\151\1\156\1"+
        "\153\1\172\1\162\1\151\1\141\1\uffff\1\162\2\171\1\143\1\uffff\1"+
        "\172\1\uffff\1\151\1\141\1\145\3\172\1\uffff\1\156\1\172\1\uffff"+
        "\1\146\1\uffff\1\144\1\156\1\146\1\144\1\155\1\143\1\151\3\172\1"+
        "\154\1\150\1\143\1\147\1\172\1\156\1\162\1\154\1\141\2\172\1\164"+
        "\1\uffff\1\143\1\164\1\143\3\uffff\1\165\1\uffff\1\172\1\163\1\143"+
        "\1\141\2\145\1\150\1\157\1\uffff\1\164\3\172\1\uffff\1\172\1\145"+
        "\1\172\1\143\1\uffff\2\172\1\145\1\164\1\145\1\uffff\1\172\1\145"+
        "\1\143\1\172\1\156\1\172\1\156\1\172\3\uffff\1\172\1\uffff\1\164"+
        "\1\uffff\1\172\1\145\1\172\1\uffff\1\157\1\145\1\157\1\uffff\1\164"+
        "\1\uffff\1\172\1\uffff\1\157\1\172\1\144\1\uffff\1\146\1\172\1\156"+
        "\1\163\1\uffff\1\156\1\uffff\2\172\1\uffff\1\143\1\172\1\143\1\uffff"+
        "\1\145\1\uffff\1\145\2\172";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff\1\16\1\uffff\1"+
        "\20\6\uffff\1\33\20\uffff\1\100\5\uffff\1\110\1\111\1\uffff\1\113"+
        "\1\114\1\uffff\1\121\1\11\1\115\1\34\1\12\1\24\1\13\1\23\1\14\1"+
        "\21\1\15\1\120\1\27\1\75\1\17\1\106\1\22\1\25\1\26\1\30\1\31\1\76"+
        "\1\77\1\32\43\uffff\1\105\4\uffff\1\116\11\uffff\1\40\11\uffff\1"+
        "\46\13\uffff\1\74\2\uffff\1\61\10\uffff\1\112\1\117\1\35\12\uffff"+
        "\1\103\3\uffff\1\43\15\uffff\1\60\4\uffff\1\62\1\uffff\1\72\6\uffff"+
        "\1\50\2\uffff\1\37\1\uffff\1\41\26\uffff\1\64\3\uffff\1\107\1\36"+
        "\1\65\1\uffff\1\73\10\uffff\1\45\4\uffff\1\53\4\uffff\1\101\5\uffff"+
        "\1\42\10\uffff\1\47\1\57\1\55\1\uffff\1\56\1\uffff\1\104\3\uffff"+
        "\1\67\3\uffff\1\102\1\uffff\1\44\1\uffff\1\51\3\uffff\1\54\4\uffff"+
        "\1\52\1\uffff\1\71\2\uffff\1\66\3\uffff\1\63\1\uffff\1\70\3\uffff";
    static final String DFA35_specialS =
        "\u013d\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\22\1\57\1\50\1\20\1\25\1\13\1\56\1\3\1\4\1\24\1\23\1\2\1"+
            "\15\1\21\1\26\1\53\11\54\1\14\1\1\1\60\1\11\1\63\1\17\1\16\1"+
            "\51\31\61\1\5\1\uffff\1\6\1\62\1\61\1\uffff\1\43\1\40\1\31\1"+
            "\36\1\32\1\34\1\42\1\61\1\33\2\61\1\46\1\61\1\30\1\44\1\52\1"+
            "\61\1\41\1\37\1\55\1\61\1\47\1\35\1\45\2\61\1\7\1\12\1\10\1"+
            "\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66\1\65",
            "\1\62\76\uffff\1\70",
            "\1\72\26\uffff\1\62",
            "\1\74",
            "\1\77\17\uffff\1\62\1\76",
            "",
            "\1\101",
            "",
            "\12\103\3\uffff\1\62",
            "\1\66",
            "\1\77\21\uffff\1\62",
            "\1\62",
            "\1\62",
            "\1\111\4\uffff\1\112\15\uffff\1\62",
            "",
            "\1\114",
            "\1\116\12\uffff\1\115\2\uffff\1\117",
            "\1\120\10\uffff\1\121\13\uffff\1\122",
            "\1\123\6\uffff\1\125\1\124",
            "\1\131\12\uffff\1\130\2\uffff\1\126\5\uffff\1\127",
            "\1\132",
            "\1\134\11\uffff\1\133",
            "\1\136\2\uffff\1\135",
            "\1\140\2\uffff\1\137",
            "\1\141",
            "\1\142",
            "\1\147\17\uffff\1\144\13\uffff\1\143\3\uffff\1\146\1\145",
            "\1\151\17\uffff\1\150",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\147\37\uffff\1\147",
            "\1\156\2\uffff\1\155",
            "\1\103\1\uffff\10\160\2\103\13\uffff\1\103\37\uffff\1\103",
            "\1\103\1\uffff\12\161\13\uffff\1\103\37\uffff\1\103",
            "\1\162",
            "",
            "",
            "\1\163",
            "",
            "",
            "\1\165",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166",
            "\1\170\15\uffff\1\167",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0081\17\uffff\1\177\1\u0080",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\20\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u0090\2\uffff\1\u008f",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0096\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d\5\uffff\1\u009e",
            "",
            "\1\103\1\uffff\10\160\2\103\13\uffff\1\103\37\uffff\1\103",
            "\1\103\1\uffff\12\161\13\uffff\1\103\37\uffff\1\103",
            "\1\u009f",
            "\1\u00a0\1\62",
            "",
            "\1\62",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a7\1\u00a6",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00ac\25\61",
            "\1\u00ae",
            "\1\u00af",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00b0\25\61",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c0",
            "",
            "\1\u00c2\37\uffff\1\u00c1",
            "\1\u00c2\37\uffff\1\u00c2",
            "",
            "\1\u00c3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c5",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00ce",
            "\1\u00cf",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00d1\21"+
            "\61",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e7\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00f0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "",
            "",
            "\1\u0109",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0112",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0116",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0118",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u011e",
            "\1\u011f",
            "\12\61\7\uffff\32\61\4\uffff\1\u0120\1\uffff\32\61",
            "\1\u0122",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0124",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\u0126\1\uffff\32\61",
            "",
            "\1\u0127",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0128",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "",
            "\1\u012d",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u012f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0131",
            "",
            "\1\u0132",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0134",
            "\1\u0135",
            "",
            "\1\u0136",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0138",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013a",
            "",
            "\1\u013b",
            "",
            "\1\u013c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61"
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
            return "1:1: Tokens : ( SemiColon | Comma | OpenRoundBracket | CloseRoundBracket | OpenSquareBracket | CloseSquareBracket | OpenCurlyBracket | CloseCurlyBracket | ArrayAssign | LogicalOr | LogicalAnd | ClassMember | InstanceMember | SuppressWarnings | QuestionMark | Dollar | Colon | Dot | Ampersand | Pipe | Bang | Plus | Minus | Asterisk | Percent | Forwardslash | Tilde | Equals | New | Clone | Echo | If | Else | ElseIf | For | Foreach | While | Do | Switch | Case | Default | Function | Break | Continue | Return | Global | Static | And | Or | Xor | Instanceof | List | Class | Interface | Extends | Implements | Abstract | Var | Const | T__113 | BodyString | MultilineComment | SinglelineComment | UnixComment | Array | RequireOperator | PrimitiveType | AccessModifier | Integer | Real | Boolean | SingleQuotedString | DoubleQuotedString | HereDoc | UnquotedString | AsignmentOperator | EqualityOperator | ComparisionOperator | ShiftOperator | IncrementOperator | WhiteSpace );";
        }
    }
 

}