// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g 2009-05-27 16:15:00

package net.kuruvila.php.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FormattingLexer extends Lexer {
    public static final int Switch=42;
    public static final int New=32;
    public static final int DoubleQuotedString=93;
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
    public static final int CloseBrace=7;
    public static final int HereDocContents=108;
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
    public static final int UnixComment=100;
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
    public static final int ComparisionOperator=87;
    public static final int ForCondition=76;
    public static final int Case=43;
    public static final int Function=45;
    public static final int Pipe=23;
    public static final int Global=49;
    public static final int Tilde=30;
    public static final int Block=64;
    public static final int T__111=111;
    public static final int Method=79;
    public static final int OpenBrace=6;
    public static final int Empty=69;
    public static final int Bang=24;
    public static final int While=40;
    public static final int EOF=-1;
    public static final int AsignmentOperator=85;
    public static final int Digits=104;
    public static final int HereDoc=94;
    public static final int Member=67;
    public static final int Return=48;

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


    // delegates
    // delegators

    public FormattingLexer() {;} 
    public FormattingLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FormattingLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g"; }

    // $ANTLR start "SemiColon"
    public final void mSemiColon() throws RecognitionException {
        try {
            int _type = SemiColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:34:11: ( ';' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:34:13: ';'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:35:7: ( ',' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:35:9: ','
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

    // $ANTLR start "OpenBrace"
    public final void mOpenBrace() throws RecognitionException {
        try {
            int _type = OpenBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:36:11: ( '(' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:36:13: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OpenBrace"

    // $ANTLR start "CloseBrace"
    public final void mCloseBrace() throws RecognitionException {
        try {
            int _type = CloseBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:37:12: ( ')' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:37:14: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CloseBrace"

    // $ANTLR start "OpenSquareBrace"
    public final void mOpenSquareBrace() throws RecognitionException {
        try {
            int _type = OpenSquareBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:38:17: ( '[' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:38:19: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OpenSquareBrace"

    // $ANTLR start "CloseSquareBrace"
    public final void mCloseSquareBrace() throws RecognitionException {
        try {
            int _type = CloseSquareBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:39:18: ( ']' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:39:20: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CloseSquareBrace"

    // $ANTLR start "OpenCurlyBrace"
    public final void mOpenCurlyBrace() throws RecognitionException {
        try {
            int _type = OpenCurlyBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:40:16: ( '{' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:40:18: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OpenCurlyBrace"

    // $ANTLR start "CloseCurlyBrace"
    public final void mCloseCurlyBrace() throws RecognitionException {
        try {
            int _type = CloseCurlyBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:41:17: ( '}' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:41:19: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CloseCurlyBrace"

    // $ANTLR start "ArrayAssign"
    public final void mArrayAssign() throws RecognitionException {
        try {
            int _type = ArrayAssign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:42:13: ( '=>' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:42:15: '=>'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:43:11: ( '||' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:43:13: '||'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:44:12: ( '&&' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:44:14: '&&'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:45:13: ( '::' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:45:15: '::'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:46:16: ( '->' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:46:18: '->'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:47:18: ( '@' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:47:20: '@'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:48:14: ( '?' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:48:16: '?'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:49:8: ( '$' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:49:10: '$'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:50:7: ( ':' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:50:9: ':'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:51:5: ( '.' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:51:7: '.'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:52:11: ( '&' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:52:13: '&'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:53:6: ( '|' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:53:8: '|'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:54:6: ( '!' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:54:8: '!'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:55:6: ( '+' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:55:8: '+'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:56:7: ( '-' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:56:9: '-'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:57:10: ( '*' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:57:12: '*'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:58:9: ( '%' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:58:11: '%'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:59:14: ( '/' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:59:16: '/'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:60:7: ( '~' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:60:9: '~'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:61:8: ( '=' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:61:10: '='
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:62:5: ( 'new' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:62:7: 'new'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:63:7: ( 'clone' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:63:9: 'clone'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:64:6: ( 'echo' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:64:8: 'echo'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:65:4: ( 'if' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:65:6: 'if'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:66:6: ( 'else' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:66:8: 'else'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:67:8: ( 'elseif' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:67:10: 'elseif'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:68:5: ( 'for' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:68:7: 'for'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:69:9: ( 'foreach' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:69:11: 'foreach'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:70:7: ( 'while' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:70:9: 'while'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:71:4: ( 'do' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:71:6: 'do'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:72:8: ( 'switch' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:72:10: 'switch'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:73:6: ( 'case' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:73:8: 'case'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:74:9: ( 'default' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:74:11: 'default'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:75:10: ( 'function' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:75:12: 'function'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:76:7: ( 'break' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:76:9: 'break'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:77:10: ( 'continue' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:77:12: 'continue'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:78:8: ( 'return' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:78:10: 'return'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:79:8: ( 'global' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:79:10: 'global'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:80:8: ( 'static' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:80:10: 'static'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:81:5: ( 'and' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:81:7: 'and'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:82:4: ( 'or' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:82:6: 'or'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:83:5: ( 'xor' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:83:7: 'xor'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:84:12: ( 'instanceof' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:84:14: 'instanceof'
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

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:85:7: ( 'class' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:85:9: 'class'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:86:11: ( 'interface' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:86:13: 'interface'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:87:9: ( 'extends' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:87:11: 'extends'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:88:12: ( 'implements' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:88:14: 'implements'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:89:10: ( 'abstract' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:89:12: 'abstract'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:90:5: ( 'var' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:90:7: 'var'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:91:7: ( 'const' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:91:9: 'const'
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

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:92:8: ( 'as' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:92:10: 'as'
            {
            match("as"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "BodyString"
    public final void mBodyString() throws RecognitionException {
        try {
            int _type = BodyString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:5: ( '?>' ( ( '<' ~ '?' )=> '<' | ~ '<' )* ( '<?' ( ( 'php' )? ) )? )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:7: '?>' ( ( '<' ~ '?' )=> '<' | ~ '<' )* ( '<?' ( ( 'php' )? ) )?
            {
            match("?>"); if (state.failed) return ;

            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:12: ( ( '<' ~ '?' )=> '<' | ~ '<' )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='<') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='?') ) {
                        int LA1_4 = input.LA(3);

                        if ( (synpred1_Formatting()) ) {
                            alt1=1;
                        }


                    }
                    else if ( (LA1_1=='<') && (synpred1_Formatting())) {
                        alt1=1;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<=';')||(LA1_1>='=' && LA1_1<='>')||(LA1_1>='@' && LA1_1<='\uFFFF')) && (synpred1_Formatting())) {
                        alt1=1;
                    }

                    else {
                        alt1=1;
                    }

                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=';')||(LA1_0>='=' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:13: ( '<' ~ '?' )=> '<'
            	    {
            	    match('<'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:33: ~ '<'
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

            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:41: ( '<?' ( ( 'php' )? ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='<') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:42: '<?' ( ( 'php' )? )
                    {
                    match("<?"); if (state.failed) return ;

                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:47: ( ( 'php' )? )
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:48: ( 'php' )?
                    {
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:48: ( 'php' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='p') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:48: 'php'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BodyString"

    // $ANTLR start "FirstBodyString"
    public final void mFirstBodyString() throws RecognitionException {
        try {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:5: ( ( ( '<' ~ '?' )=> '<' | ~ '<' )* '<?' ( ( 'php' )? ) )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:7: ( ( '<' ~ '?' )=> '<' | ~ '<' )* '<?' ( ( 'php' )? )
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:7: ( ( '<' ~ '?' )=> '<' | ~ '<' )*
            loop4:
            do {
                int alt4=3;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:8: ( '<' ~ '?' )=> '<'
            	    {
            	    match('<'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:28: ~ '<'
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

            match("<?"); if (state.failed) return ;

            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:41: ( ( 'php' )? )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:42: ( 'php' )?
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:42: ( 'php' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='p') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:42: 'php'
                    {
                    match("php"); if (state.failed) return ;


                    }
                    break;

            }


            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "FirstBodyString"

    // $ANTLR start "MultilineComment"
    public final void mMultilineComment() throws RecognitionException {
        try {
            int _type = MultilineComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:475:5: ( '/*' ( ( '*' ~ '/' )=> '*' | ~ '*' )* '*/' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:475:7: '/*' ( ( '*' ~ '/' )=> '*' | ~ '*' )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:475:12: ( ( '*' ~ '/' )=> '*' | ~ '*' )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3=='*') && (synpred3_Formatting())) {
                            alt6=1;
                        }
                        else if ( ((LA6_3>='\u0000' && LA6_3<=')')||(LA6_3>='+' && LA6_3<='\uFFFF')) && (synpred3_Formatting())) {
                            alt6=1;
                        }


                    }
                    else if ( (LA6_1=='*') && (synpred3_Formatting())) {
                        alt6=1;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<=')')||(LA6_1>='+' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) && (synpred3_Formatting())) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:475:13: ( '*' ~ '/' )=> '*'
            	    {
            	    match('*'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:475:32: ~ '*'
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
            	    break loop6;
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:479:5: ( '//' ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:479:7: '//' ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )*
            {
            match("//"); if (state.failed) return ;

            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:479:13: ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='?') && (synpred4_Formatting())) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='>')||(LA7_0>='@' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:479:14: ( '?' ~ '>' )=> '?'
            	    {
            	    match('?'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:479:32: ~ ( '\\n' | '?' )
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
            	    break loop7;
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:483:5: ( '#' ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:483:7: '#' ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )*
            {
            match('#'); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:483:11: ( ( '?' ~ '>' )=> '?' | ~ ( '\\n' | '?' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='?') && (synpred5_Formatting())) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='>')||(LA8_0>='@' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:483:12: ( '?' ~ '>' )=> '?'
            	    {
            	    match('?'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:483:30: ~ ( '\\n' | '?' )
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
    // $ANTLR end "UnixComment"

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:488:5: ( ( 'a' | 'A' ) ( 'r' | 'R' ) ( 'r' | 'R' ) ( 'a' | 'A' ) ( 'y' | 'Y' ) )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:488:7: ( 'a' | 'A' ) ( 'r' | 'R' ) ( 'r' | 'R' ) ( 'a' | 'A' ) ( 'y' | 'Y' )
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:492:5: ( 'require' | 'require_once' | 'include' | 'include_once' )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:492:7: 'require'
                    {
                    match("require"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:492:19: 'require_once'
                    {
                    match("require_once"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:492:36: 'include'
                    {
                    match("include"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:492:48: 'include_once'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:496:5: ( 'int' | 'float' | 'string' | 'array' | 'object' | 'bool' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt10=1;
                }
                break;
            case 'f':
                {
                alt10=2;
                }
                break;
            case 's':
                {
                alt10=3;
                }
                break;
            case 'a':
                {
                alt10=4;
                }
                break;
            case 'o':
                {
                alt10=5;
                }
                break;
            case 'b':
                {
                alt10=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:496:7: 'int'
                    {
                    match("int"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:496:13: 'float'
                    {
                    match("float"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:496:21: 'string'
                    {
                    match("string"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:496:30: 'array'
                    {
                    match("array"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:496:38: 'object'
                    {
                    match("object"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:496:47: 'bool'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:500:5: ( 'public' | 'private' | 'protected' )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='p') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='u') ) {
                    alt11=1;
                }
                else if ( (LA11_1=='r') ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3=='i') ) {
                        alt11=2;
                    }
                    else if ( (LA11_3=='o') ) {
                        alt11=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:500:7: 'public'
                    {
                    match("public"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:500:18: 'private'
                    {
                    match("private"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:500:30: 'protected'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:505:2: ( ( '1' .. '9' ( '0' .. '9' )* ) | '0' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='1' && LA13_0<='9')) ) {
                alt13=1;
            }
            else if ( (LA13_0=='0') ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:505:3: ( '1' .. '9' ( '0' .. '9' )* )
                    {
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:505:3: ( '1' .. '9' ( '0' .. '9' )* )
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:505:4: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:505:13: ( '0' .. '9' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:505:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:505:26: '0'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:509:2: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:509:4: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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

            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:509:16: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='F')||(LA14_0>='a' && LA14_0<='f')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:514:2: ( '0' ( '0' .. '7' )+ )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:514:4: '0' ( '0' .. '7' )+
            {
            match('0'); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:514:7: ( '0' .. '7' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='7')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:514:8: '0' .. '7'
            	    {
            	    matchRange('0','7'); if (state.failed) return ;

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
    // $ANTLR end "Octal"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:517:2: ( Octal | Decimal | Hexadecimal )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt16=3;
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
                    alt16=1;
                    }
                    break;
                default:
                    alt16=2;}

            }
            else if ( ((LA16_0>='1' && LA16_0<='9')) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:517:3: Octal
                    {
                    mOctal(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:517:9: Decimal
                    {
                    mDecimal(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:517:17: Hexadecimal
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:522:2: ( ( '0' .. '9' )+ )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:522:4: ( '0' .. '9' )+
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:522:4: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:522:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:2: ( ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) ) )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:3: ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) )
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:3: ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='.') && (synpred6_Formatting())) {
                alt19=1;
            }
            else if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:4: ( '.' Digits )=> ( '.' Digits )
                    {
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:18: ( '.' Digits )
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:19: '.' Digits
                    {
                    match('.'); if (state.failed) return ;
                    mDigits(); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:31: ( Digits '.' ( Digits )? )
                    {
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:31: ( Digits '.' ( Digits )? )
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:32: Digits '.' ( Digits )?
                    {
                    mDigits(); if (state.failed) return ;
                    match('.'); if (state.failed) return ;
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:43: ( Digits )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:43: Digits
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:532:2: ( ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits ) )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:532:3: ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits )
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:532:3: ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:532:4: ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:532:4: ( Digits | DNum )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:532:5: Digits
                    {
                    mDigits(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:532:12: DNum
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

            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:532:26: ( '+' '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='+') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:532:27: '+' '-'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:536:5: ( DNum | Exponent_DNum )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:536:7: DNum
                    {
                    mDNum(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:536:12: Exponent_DNum
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:540:5: ( 'true' | 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='t') ) {
                alt23=1;
            }
            else if ( (LA23_0=='f') ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:540:7: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:540:16: 'false'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:544:5: ( '\\'' ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' | ~ ( '\\'' | '\\\\' ) )* '\\'' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:544:7: '\\'' ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' | ~ ( '\\'' | '\\\\' ) )* '\\''
            {
            match('\''); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:544:12: ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' | ~ ( '\\'' | '\\\\' ) )*
            loop24:
            do {
                int alt24=5;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:544:13: ( '\\\\' '\\'' )=> '\\\\' '\\''
            	    {
            	    match('\\'); if (state.failed) return ;
            	    match('\''); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:545:15: ( '\\\\' '\\\\' )=> '\\\\' '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;
            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:546:15: '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:546:22: ~ ( '\\'' | '\\\\' )
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
            	    break loop24;
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:552:5: ( 'n' | 'r' | 't' | '\\\\' | '$' | '\"' | Digits | 'x' )
            int alt25=8;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt25=1;
                }
                break;
            case 'r':
                {
                alt25=2;
                }
                break;
            case 't':
                {
                alt25=3;
                }
                break;
            case '\\':
                {
                alt25=4;
                }
                break;
            case '$':
                {
                alt25=5;
                }
                break;
            case '\"':
                {
                alt25=6;
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
                alt25=7;
                }
                break;
            case 'x':
                {
                alt25=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:552:7: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:552:13: 'r'
                    {
                    match('r'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:552:19: 't'
                    {
                    match('t'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:552:25: '\\\\'
                    {
                    match('\\'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:552:32: '$'
                    {
                    match('$'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:552:38: '\"'
                    {
                    match('\"'); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:552:44: Digits
                    {
                    mDigits(); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:552:53: 'x'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:556:5: ( '\"' ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:556:7: '\"' ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:556:12: ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' | ~ ( '\\\\' | '\"' ) )*
            loop26:
            do {
                int alt26=4;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:556:14: ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector
            	    {
            	    match('\\'); if (state.failed) return ;
            	    mEscapeCharector(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:557:7: '\\\\'
            	    {
            	    match('\\'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:558:7: ~ ( '\\\\' | '\"' )
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
            	    break loop26;
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:563:5: ( '<<<' HereDocContents )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:563:7: '<<<' HereDocContents
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:568:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:568:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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

            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:568:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')||(LA27_0>='A' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='z')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:
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
            	    break loop27;
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:574:5: ()
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:574:7: 
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:5: ( '+=' | '-=' | '*=' | '/=' | '.=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
            int alt28=11;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt28=1;
                }
                break;
            case '-':
                {
                alt28=2;
                }
                break;
            case '*':
                {
                alt28=3;
                }
                break;
            case '/':
                {
                alt28=4;
                }
                break;
            case '.':
                {
                alt28=5;
                }
                break;
            case '%':
                {
                alt28=6;
                }
                break;
            case '&':
                {
                alt28=7;
                }
                break;
            case '|':
                {
                alt28=8;
                }
                break;
            case '^':
                {
                alt28=9;
                }
                break;
            case '<':
                {
                alt28=10;
                }
                break;
            case '>':
                {
                alt28=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:7: '+='
                    {
                    match("+="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:12: '-='
                    {
                    match("-="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:17: '*='
                    {
                    match("*="); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:22: '/='
                    {
                    match("/="); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:27: '.='
                    {
                    match(".="); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:32: '%='
                    {
                    match("%="); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:37: '&='
                    {
                    match("&="); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:42: '|='
                    {
                    match("|="); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:47: '^='
                    {
                    match("^="); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:52: '<<='
                    {
                    match("<<="); if (state.failed) return ;


                    }
                    break;
                case 11 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:605:58: '>>='
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:609:5: ( '==' | '!=' | '===' | '!==' )
            int alt29=4;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='=') ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1=='=') ) {
                    int LA29_3 = input.LA(3);

                    if ( (LA29_3=='=') ) {
                        alt29=3;
                    }
                    else {
                        alt29=1;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA29_0=='!') ) {
                int LA29_2 = input.LA(2);

                if ( (LA29_2=='=') ) {
                    int LA29_4 = input.LA(3);

                    if ( (LA29_4=='=') ) {
                        alt29=4;
                    }
                    else {
                        alt29=2;}
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:609:7: '=='
                    {
                    match("=="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:609:14: '!='
                    {
                    match("!="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:609:21: '==='
                    {
                    match("==="); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:609:29: '!=='
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:613:5: ( '<' | '<=' | '>' | '>=' | '<>' )
            int alt30=5;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='<') ) {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt30=2;
                    }
                    break;
                case '>':
                    {
                    alt30=5;
                    }
                    break;
                default:
                    alt30=1;}

            }
            else if ( (LA30_0=='>') ) {
                int LA30_2 = input.LA(2);

                if ( (LA30_2=='=') ) {
                    alt30=4;
                }
                else {
                    alt30=3;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:613:7: '<'
                    {
                    match('<'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:613:13: '<='
                    {
                    match("<="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:613:20: '>'
                    {
                    match('>'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:613:26: '>='
                    {
                    match(">="); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:613:33: '<>'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:617:5: ( '<<' | '>>' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='<') ) {
                alt31=1;
            }
            else if ( (LA31_0=='>') ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:617:7: '<<'
                    {
                    match("<<"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:617:14: '>>'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:621:5: ( '--' | '++' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='-') ) {
                alt32=1;
            }
            else if ( (LA32_0=='+') ) {
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
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:621:7: '--'
                    {
                    match("--"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:621:12: '++'
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
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:626:5: ( '\\n' )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:626:7: '\\n'
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

            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:633:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )* )
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:633:4: ( ' ' | '\\t' | '\\n' | '\\r' )*
            {
            // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:633:4: ( ' ' | '\\t' | '\\n' | '\\r' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='\t' && LA33_0<='\n')||LA33_0=='\r'||LA33_0==' ') ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:
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
            	    break loop33;
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
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:8: ( SemiColon | Comma | OpenBrace | CloseBrace | OpenSquareBrace | CloseSquareBrace | OpenCurlyBrace | CloseCurlyBrace | ArrayAssign | LogicalOr | LogicalAnd | ClassMember | InstanceMember | SuppressWarnings | QuestionMark | Dollar | Colon | Dot | Ampersand | Pipe | Bang | Plus | Minus | Asterisk | Percent | Forwardslash | Tilde | Equals | New | Clone | Echo | If | Else | ElseIf | For | Foreach | While | Do | Switch | Case | Default | Function | Break | Continue | Return | Global | Static | And | Or | Xor | Instanceof | Class | Interface | Extends | Implements | Abstract | Var | Const | T__111 | BodyString | MultilineComment | SinglelineComment | UnixComment | Array | RequireOperator | PrimitiveType | AccessModifier | Integer | Real | Boolean | SingleQuotedString | DoubleQuotedString | HereDoc | UnquotedString | AsignmentOperator | EqualityOperator | ComparisionOperator | ShiftOperator | IncrementOperator | WhiteSpace )
        int alt34=80;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:10: SemiColon
                {
                mSemiColon(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:20: Comma
                {
                mComma(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:26: OpenBrace
                {
                mOpenBrace(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:36: CloseBrace
                {
                mCloseBrace(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:47: OpenSquareBrace
                {
                mOpenSquareBrace(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:63: CloseSquareBrace
                {
                mCloseSquareBrace(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:80: OpenCurlyBrace
                {
                mOpenCurlyBrace(); if (state.failed) return ;

                }
                break;
            case 8 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:95: CloseCurlyBrace
                {
                mCloseCurlyBrace(); if (state.failed) return ;

                }
                break;
            case 9 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:111: ArrayAssign
                {
                mArrayAssign(); if (state.failed) return ;

                }
                break;
            case 10 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:123: LogicalOr
                {
                mLogicalOr(); if (state.failed) return ;

                }
                break;
            case 11 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:133: LogicalAnd
                {
                mLogicalAnd(); if (state.failed) return ;

                }
                break;
            case 12 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:144: ClassMember
                {
                mClassMember(); if (state.failed) return ;

                }
                break;
            case 13 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:156: InstanceMember
                {
                mInstanceMember(); if (state.failed) return ;

                }
                break;
            case 14 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:171: SuppressWarnings
                {
                mSuppressWarnings(); if (state.failed) return ;

                }
                break;
            case 15 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:188: QuestionMark
                {
                mQuestionMark(); if (state.failed) return ;

                }
                break;
            case 16 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:201: Dollar
                {
                mDollar(); if (state.failed) return ;

                }
                break;
            case 17 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:208: Colon
                {
                mColon(); if (state.failed) return ;

                }
                break;
            case 18 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:214: Dot
                {
                mDot(); if (state.failed) return ;

                }
                break;
            case 19 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:218: Ampersand
                {
                mAmpersand(); if (state.failed) return ;

                }
                break;
            case 20 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:228: Pipe
                {
                mPipe(); if (state.failed) return ;

                }
                break;
            case 21 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:233: Bang
                {
                mBang(); if (state.failed) return ;

                }
                break;
            case 22 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:238: Plus
                {
                mPlus(); if (state.failed) return ;

                }
                break;
            case 23 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:243: Minus
                {
                mMinus(); if (state.failed) return ;

                }
                break;
            case 24 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:249: Asterisk
                {
                mAsterisk(); if (state.failed) return ;

                }
                break;
            case 25 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:258: Percent
                {
                mPercent(); if (state.failed) return ;

                }
                break;
            case 26 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:266: Forwardslash
                {
                mForwardslash(); if (state.failed) return ;

                }
                break;
            case 27 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:279: Tilde
                {
                mTilde(); if (state.failed) return ;

                }
                break;
            case 28 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:285: Equals
                {
                mEquals(); if (state.failed) return ;

                }
                break;
            case 29 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:292: New
                {
                mNew(); if (state.failed) return ;

                }
                break;
            case 30 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:296: Clone
                {
                mClone(); if (state.failed) return ;

                }
                break;
            case 31 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:302: Echo
                {
                mEcho(); if (state.failed) return ;

                }
                break;
            case 32 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:307: If
                {
                mIf(); if (state.failed) return ;

                }
                break;
            case 33 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:310: Else
                {
                mElse(); if (state.failed) return ;

                }
                break;
            case 34 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:315: ElseIf
                {
                mElseIf(); if (state.failed) return ;

                }
                break;
            case 35 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:322: For
                {
                mFor(); if (state.failed) return ;

                }
                break;
            case 36 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:326: Foreach
                {
                mForeach(); if (state.failed) return ;

                }
                break;
            case 37 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:334: While
                {
                mWhile(); if (state.failed) return ;

                }
                break;
            case 38 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:340: Do
                {
                mDo(); if (state.failed) return ;

                }
                break;
            case 39 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:343: Switch
                {
                mSwitch(); if (state.failed) return ;

                }
                break;
            case 40 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:350: Case
                {
                mCase(); if (state.failed) return ;

                }
                break;
            case 41 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:355: Default
                {
                mDefault(); if (state.failed) return ;

                }
                break;
            case 42 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:363: Function
                {
                mFunction(); if (state.failed) return ;

                }
                break;
            case 43 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:372: Break
                {
                mBreak(); if (state.failed) return ;

                }
                break;
            case 44 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:378: Continue
                {
                mContinue(); if (state.failed) return ;

                }
                break;
            case 45 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:387: Return
                {
                mReturn(); if (state.failed) return ;

                }
                break;
            case 46 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:394: Global
                {
                mGlobal(); if (state.failed) return ;

                }
                break;
            case 47 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:401: Static
                {
                mStatic(); if (state.failed) return ;

                }
                break;
            case 48 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:408: And
                {
                mAnd(); if (state.failed) return ;

                }
                break;
            case 49 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:412: Or
                {
                mOr(); if (state.failed) return ;

                }
                break;
            case 50 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:415: Xor
                {
                mXor(); if (state.failed) return ;

                }
                break;
            case 51 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:419: Instanceof
                {
                mInstanceof(); if (state.failed) return ;

                }
                break;
            case 52 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:430: Class
                {
                mClass(); if (state.failed) return ;

                }
                break;
            case 53 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:436: Interface
                {
                mInterface(); if (state.failed) return ;

                }
                break;
            case 54 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:446: Extends
                {
                mExtends(); if (state.failed) return ;

                }
                break;
            case 55 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:454: Implements
                {
                mImplements(); if (state.failed) return ;

                }
                break;
            case 56 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:465: Abstract
                {
                mAbstract(); if (state.failed) return ;

                }
                break;
            case 57 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:474: Var
                {
                mVar(); if (state.failed) return ;

                }
                break;
            case 58 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:478: Const
                {
                mConst(); if (state.failed) return ;

                }
                break;
            case 59 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:484: T__111
                {
                mT__111(); if (state.failed) return ;

                }
                break;
            case 60 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:491: BodyString
                {
                mBodyString(); if (state.failed) return ;

                }
                break;
            case 61 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:502: MultilineComment
                {
                mMultilineComment(); if (state.failed) return ;

                }
                break;
            case 62 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:519: SinglelineComment
                {
                mSinglelineComment(); if (state.failed) return ;

                }
                break;
            case 63 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:537: UnixComment
                {
                mUnixComment(); if (state.failed) return ;

                }
                break;
            case 64 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:549: Array
                {
                mArray(); if (state.failed) return ;

                }
                break;
            case 65 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:555: RequireOperator
                {
                mRequireOperator(); if (state.failed) return ;

                }
                break;
            case 66 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:571: PrimitiveType
                {
                mPrimitiveType(); if (state.failed) return ;

                }
                break;
            case 67 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:585: AccessModifier
                {
                mAccessModifier(); if (state.failed) return ;

                }
                break;
            case 68 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:600: Integer
                {
                mInteger(); if (state.failed) return ;

                }
                break;
            case 69 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:608: Real
                {
                mReal(); if (state.failed) return ;

                }
                break;
            case 70 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:613: Boolean
                {
                mBoolean(); if (state.failed) return ;

                }
                break;
            case 71 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:621: SingleQuotedString
                {
                mSingleQuotedString(); if (state.failed) return ;

                }
                break;
            case 72 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:640: DoubleQuotedString
                {
                mDoubleQuotedString(); if (state.failed) return ;

                }
                break;
            case 73 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:659: HereDoc
                {
                mHereDoc(); if (state.failed) return ;

                }
                break;
            case 74 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:667: UnquotedString
                {
                mUnquotedString(); if (state.failed) return ;

                }
                break;
            case 75 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:682: AsignmentOperator
                {
                mAsignmentOperator(); if (state.failed) return ;

                }
                break;
            case 76 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:700: EqualityOperator
                {
                mEqualityOperator(); if (state.failed) return ;

                }
                break;
            case 77 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:717: ComparisionOperator
                {
                mComparisionOperator(); if (state.failed) return ;

                }
                break;
            case 78 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:737: ShiftOperator
                {
                mShiftOperator(); if (state.failed) return ;

                }
                break;
            case 79 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:751: IncrementOperator
                {
                mIncrementOperator(); if (state.failed) return ;

                }
                break;
            case 80 :
                // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:1:769: WhiteSpace
                {
                mWhiteSpace(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Formatting
    public final void synpred1_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:13: ( '<' ~ '?' )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:466:14: '<' ~ '?'
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
    // $ANTLR end synpred1_Formatting

    // $ANTLR start synpred2_Formatting
    public final void synpred2_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:8: ( '<' ~ '?' )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:471:9: '<' ~ '?'
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
    // $ANTLR end synpred2_Formatting

    // $ANTLR start synpred3_Formatting
    public final void synpred3_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:475:13: ( '*' ~ '/' )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:475:14: '*' ~ '/'
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
    // $ANTLR end synpred3_Formatting

    // $ANTLR start synpred4_Formatting
    public final void synpred4_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:479:14: ( '?' ~ '>' )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:479:15: '?' ~ '>'
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
    // $ANTLR end synpred4_Formatting

    // $ANTLR start synpred5_Formatting
    public final void synpred5_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:483:12: ( '?' ~ '>' )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:483:13: '?' ~ '>'
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
    // $ANTLR end synpred5_Formatting

    // $ANTLR start synpred6_Formatting
    public final void synpred6_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:4: ( '.' Digits )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:527:5: '.' Digits
        {
        match('.'); if (state.failed) return ;
        mDigits(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Formatting

    // $ANTLR start synpred7_Formatting
    public final void synpred7_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:544:13: ( '\\\\' '\\'' )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:544:14: '\\\\' '\\''
        {
        match('\\'); if (state.failed) return ;
        match('\''); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Formatting

    // $ANTLR start synpred8_Formatting
    public final void synpred8_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:545:15: ( '\\\\' '\\\\' )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:545:16: '\\\\' '\\\\'
        {
        match('\\'); if (state.failed) return ;
        match('\\'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Formatting

    // $ANTLR start synpred9_Formatting
    public final void synpred9_Formatting_fragment() throws RecognitionException {   
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:556:14: ( '\\\\' EscapeCharector )
        // /Users/sidharth/Documents/code/temp/php_parser/examples/code-formatter/grammars/Formatting.g:556:15: '\\\\' EscapeCharector
        {
        match('\\'); if (state.failed) return ;
        mEscapeCharector(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Formatting

    public final boolean synpred5_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Formatting_fragment(); // can never throw exception
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
    public final boolean synpred7_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_Formatting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Formatting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA4_eotS =
        "\3\uffff\1\7\5\uffff\1\7";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\2\0\1\uffff\1\0\2\uffff\1\0\1\uffff\2\0";
    static final String DFA4_maxS =
        "\2\uffff\1\uffff\1\uffff\2\uffff\1\uffff\1\uffff\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\uffff\2\1\1\uffff\1\3\2\uffff";
    static final String DFA4_specialS =
        "\1\0\1\2\1\uffff\1\3\2\uffff\1\1\1\uffff\1\5\1\4}>";
    static final String[] DFA4_transitionS = {
            "\74\2\1\1\uffc3\2",
            "\74\5\1\4\2\5\1\3\uffc0\5",
            "",
            "\74\5\1\4\63\5\1\6\uff8f\5",
            "",
            "",
            "\74\5\1\4\53\5\1\10\uff97\5",
            "",
            "\74\5\1\4\63\5\1\11\uff8f\5",
            "\74\5\1\4\uffc3\5"
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
            return "()* loopback of 471:7: ( ( '<' ~ '?' )=> '<' | ~ '<' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_0 = input.LA(1);

                        s = -1;
                        if ( (LA4_0=='<') ) {s = 1;}

                        else if ( ((LA4_0>='\u0000' && LA4_0<=';')||(LA4_0>='=' && LA4_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_6=='h') ) {s = 8;}

                        else if ( (LA4_6=='<') && (synpred2_Formatting())) {s = 4;}

                        else if ( ((LA4_6>='\u0000' && LA4_6<=';')||(LA4_6>='=' && LA4_6<='g')||(LA4_6>='i' && LA4_6<='\uFFFF')) && (synpred2_Formatting())) {s = 5;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_1=='?') ) {s = 3;}

                        else if ( (LA4_1=='<') && (synpred2_Formatting())) {s = 4;}

                        else if ( ((LA4_1>='\u0000' && LA4_1<=';')||(LA4_1>='=' && LA4_1<='>')||(LA4_1>='@' && LA4_1<='\uFFFF')) && (synpred2_Formatting())) {s = 5;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_3=='<') && (synpred2_Formatting())) {s = 4;}

                        else if ( (LA4_3=='p') ) {s = 6;}

                        else if ( ((LA4_3>='\u0000' && LA4_3<=';')||(LA4_3>='=' && LA4_3<='o')||(LA4_3>='q' && LA4_3<='\uFFFF')) && (synpred2_Formatting())) {s = 5;}

                        else s = 7;

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_9=='<') && (synpred2_Formatting())) {s = 4;}

                        else if ( ((LA4_9>='\u0000' && LA4_9<=';')||(LA4_9>='=' && LA4_9<='\uFFFF')) && (synpred2_Formatting())) {s = 5;}

                        else s = 7;

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_8=='p') ) {s = 9;}

                        else if ( (LA4_8=='<') && (synpred2_Formatting())) {s = 4;}

                        else if ( ((LA4_8>='\u0000' && LA4_8<=';')||(LA4_8>='=' && LA4_8<='o')||(LA4_8>='q' && LA4_8<='\uFFFF')) && (synpred2_Formatting())) {s = 5;}

                         
                        input.seek(index4_8);
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
    static final String DFA9_eotS =
        "\15\uffff\1\20\1\22\4\uffff";
    static final String DFA9_eofS =
        "\23\uffff";
    static final String DFA9_minS =
        "\1\151\1\145\1\156\1\161\1\143\1\165\1\154\1\151\1\165\1\162\1\144"+
        "\2\145\2\137\4\uffff";
    static final String DFA9_maxS =
        "\1\162\1\145\1\156\1\161\1\143\1\165\1\154\1\151\1\165\1\162\1\144"+
        "\2\145\2\137\4\uffff";
    static final String DFA9_acceptS =
        "\17\uffff\1\2\1\1\1\4\1\3";
    static final String DFA9_specialS =
        "\23\uffff}>";
    static final String[] DFA9_transitionS = {
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "491:1: RequireOperator : ( 'require' | 'require_once' | 'include' | 'include_once' );";
        }
    }
    static final String DFA20_eotS =
        "\4\uffff";
    static final String DFA20_eofS =
        "\4\uffff";
    static final String DFA20_minS =
        "\2\56\2\uffff";
    static final String DFA20_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA20_specialS =
        "\4\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "532:4: ( Digits | DNum )";
        }
    }
    static final String DFA22_eotS =
        "\3\uffff\1\6\1\uffff\1\6\1\uffff\1\6";
    static final String DFA22_eofS =
        "\10\uffff";
    static final String DFA22_minS =
        "\1\56\1\60\1\56\1\60\1\uffff\1\60\1\uffff\1\60";
    static final String DFA22_maxS =
        "\2\71\2\145\1\uffff\1\145\1\uffff\1\145";
    static final String DFA22_acceptS =
        "\4\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA22_specialS =
        "\10\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\uffff\12\2",
            "\12\3",
            "\1\5\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4",
            "\12\3\13\uffff\1\4\37\uffff\1\4",
            "",
            "\12\7\13\uffff\1\4\37\uffff\1\4",
            "",
            "\12\7\13\uffff\1\4\37\uffff\1\4"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "535:1: Real : ( DNum | Exponent_DNum );";
        }
    }
    static final String DFA24_eotS =
        "\4\uffff\1\6\6\uffff";
    static final String DFA24_eofS =
        "\13\uffff";
    static final String DFA24_minS =
        "\1\0\1\uffff\1\0\1\uffff\2\0\5\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\1\0\5\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\5\1\uffff\1\4\2\uffff\1\3\3\1\1\2";
    static final String DFA24_specialS =
        "\1\1\1\uffff\1\3\1\uffff\1\0\1\2\5\uffff}>";
    static final String[] DFA24_transitionS = {
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
            return "()* loopback of 544:12: ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' | ~ ( '\\'' | '\\\\' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_4=='\'') && (synpred7_Formatting())) {s = 7;}

                        else if ( (LA24_4=='\\') && (synpred7_Formatting())) {s = 8;}

                        else if ( ((LA24_4>='\u0000' && LA24_4<='&')||(LA24_4>='(' && LA24_4<='[')||(LA24_4>=']' && LA24_4<='\uFFFF')) && (synpred7_Formatting())) {s = 9;}

                        else s = 6;

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='\'') ) {s = 1;}

                        else if ( (LA24_0=='\\') ) {s = 2;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_Formatting()) ) {s = 10;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_2 = input.LA(1);

                        s = -1;
                        if ( (LA24_2=='\'') ) {s = 4;}

                        else if ( (LA24_2=='\\') ) {s = 5;}

                        else if ( ((LA24_2>='\u0000' && LA24_2<='&')||(LA24_2>='(' && LA24_2<='[')||(LA24_2>=']' && LA24_2<='\uFFFF')) ) {s = 6;}

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
    static final String DFA26_eotS =
        "\4\uffff\1\14\13\uffff";
    static final String DFA26_eofS =
        "\20\uffff";
    static final String DFA26_minS =
        "\1\0\1\uffff\1\0\1\uffff\10\0\4\uffff";
    static final String DFA26_maxS =
        "\1\uffff\1\uffff\1\uffff\1\uffff\1\uffff\7\0\4\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\4\1\uffff\1\3\10\uffff\1\2\3\1";
    static final String DFA26_specialS =
        "\1\6\1\uffff\1\4\1\uffff\1\11\1\1\1\10\1\7\1\0\1\2\1\3\1\5\4\uffff}>";
    static final String[] DFA26_transitionS = {
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
            return "()* loopback of 556:12: ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' | ~ ( '\\\\' | '\"' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Formatting()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Formatting()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_9 = input.LA(1);

                         
                        int index26_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Formatting()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index26_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_10 = input.LA(1);

                         
                        int index26_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Formatting()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index26_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_2 = input.LA(1);

                        s = -1;
                        if ( (LA26_2=='\"') ) {s = 4;}

                        else if ( (LA26_2=='\\') ) {s = 5;}

                        else if ( (LA26_2=='n') ) {s = 6;}

                        else if ( (LA26_2=='r') ) {s = 7;}

                        else if ( (LA26_2=='t') ) {s = 8;}

                        else if ( (LA26_2=='$') ) {s = 9;}

                        else if ( ((LA26_2>='0' && LA26_2<='9')) ) {s = 10;}

                        else if ( (LA26_2=='x') ) {s = 11;}

                        else if ( ((LA26_2>='\u0000' && LA26_2<='!')||LA26_2=='#'||(LA26_2>='%' && LA26_2<='/')||(LA26_2>=':' && LA26_2<='[')||(LA26_2>=']' && LA26_2<='m')||(LA26_2>='o' && LA26_2<='q')||LA26_2=='s'||(LA26_2>='u' && LA26_2<='w')||(LA26_2>='y' && LA26_2<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_11 = input.LA(1);

                         
                        int index26_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Formatting()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index26_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='\"') ) {s = 1;}

                        else if ( (LA26_0=='\\') ) {s = 2;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='!')||(LA26_0>='#' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_7 = input.LA(1);

                         
                        int index26_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Formatting()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index26_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_Formatting()) ) {s = 15;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index26_6);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_4 = input.LA(1);

                         
                        int index26_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_4=='\"') && (synpred9_Formatting())) {s = 13;}

                        else if ( (LA26_4=='\\') && (synpred9_Formatting())) {s = 14;}

                        else if ( ((LA26_4>='\u0000' && LA26_4<='!')||(LA26_4>='#' && LA26_4<='[')||(LA26_4>=']' && LA26_4<='\uFFFF')) && (synpred9_Formatting())) {s = 15;}

                        else s = 12;

                         
                        input.seek(index26_4);
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
    static final String DFA34_eotS =
        "\1\63\10\uffff\1\66\1\70\1\72\1\74\1\77\1\uffff\1\101\1\uffff\1"+
        "\103\1\104\1\105\1\106\1\107\1\112\1\uffff\17\60\1\uffff\2\60\2"+
        "\155\1\60\2\uffff\1\162\2\uffff\1\162\30\uffff\7\60\1\174\7\60\1"+
        "\u0086\11\60\1\u0092\2\60\1\u0095\5\60\1\uffff\2\155\1\60\1\u009e"+
        "\1\uffff\1\u009e\1\u009f\7\60\1\uffff\1\60\1\u00aa\2\60\1\u00ae"+
        "\4\60\1\uffff\11\60\1\u00bc\1\60\1\uffff\2\60\1\uffff\1\60\1\u00c1"+
        "\1\u00c2\4\60\3\uffff\2\60\1\u00c9\2\60\1\u00cc\1\u00ce\3\60\1\uffff"+
        "\3\60\1\uffff\11\60\1\u00aa\3\60\1\uffff\4\60\2\uffff\3\60\1\u00e8"+
        "\1\u00e9\1\u00ea\1\uffff\1\60\1\u00ec\1\uffff\1\60\1\uffff\7\60"+
        "\1\u00aa\1\u00e8\1\u00f5\4\60\1\u00fa\4\60\2\u00ff\4\60\3\uffff"+
        "\1\60\1\uffff\1\u0105\7\60\1\uffff\1\60\1\u010e\1\u010f\1\u00aa"+
        "\1\uffff\1\u0110\1\60\1\u0112\1\60\1\uffff\1\u00aa\1\u0114\3\60"+
        "\1\uffff\1\u0118\2\60\1\u011c\1\60\1\u011e\1\60\1\u0120\3\uffff"+
        "\1\u011c\1\uffff\1\60\1\uffff\1\u0114\1\60\1\u0124\1\uffff\3\60"+
        "\1\uffff\1\60\1\uffff\1\u0129\1\uffff\1\60\1\u012b\1\60\1\uffff"+
        "\1\60\1\u012e\2\60\1\uffff\1\60\1\uffff\1\u0114\1\u0132\1\uffff"+
        "\1\60\1\u0134\1\60\1\uffff\1\60\1\uffff\1\60\2\u011c";
    static final String DFA34_eofS =
        "\u0138\uffff";
    static final String DFA34_minS =
        "\1\41\10\uffff\2\75\1\46\1\72\1\55\1\uffff\1\76\1\uffff\1\60\1\75"+
        "\1\53\2\75\1\52\1\uffff\1\145\1\141\1\143\1\146\1\141\1\150\1\145"+
        "\1\164\1\157\1\145\1\154\1\122\1\142\1\157\1\141\1\uffff\1\122\1"+
        "\162\2\56\1\162\2\uffff\1\74\2\uffff\1\76\30\uffff\1\167\1\141\1"+
        "\163\1\156\1\150\1\163\1\164\1\60\1\143\1\160\1\162\1\156\1\157"+
        "\1\154\1\151\1\60\1\146\1\151\1\141\1\145\1\157\1\161\1\157\1\144"+
        "\1\163\1\60\2\122\1\60\1\152\2\162\1\142\1\151\1\uffff\2\56\1\165"+
        "\1\74\1\uffff\1\75\1\60\1\156\1\163\1\145\1\163\1\157\2\145\1\uffff"+
        "\1\164\1\60\2\154\1\60\1\143\1\141\1\163\1\154\1\uffff\1\141\2\164"+
        "\1\151\1\141\1\154\2\165\1\142\1\60\1\164\1\uffff\2\101\1\uffff"+
        "\1\145\2\60\1\154\1\166\1\164\1\145\3\uffff\1\145\1\163\1\60\1\151"+
        "\1\164\2\60\1\156\1\141\1\162\1\uffff\1\165\1\145\1\141\1\uffff"+
        "\2\164\2\145\1\165\1\143\1\151\1\156\1\153\1\60\1\162\1\151\1\141"+
        "\1\uffff\1\162\2\131\1\143\2\uffff\1\151\1\141\1\145\3\60\1\uffff"+
        "\1\156\1\60\1\uffff\1\146\1\uffff\1\144\1\156\1\146\1\144\1\155"+
        "\1\143\1\151\3\60\1\154\1\150\1\143\1\147\1\60\1\156\1\162\1\154"+
        "\1\141\2\60\1\164\1\143\1\164\1\143\3\uffff\1\165\1\uffff\1\60\1"+
        "\163\1\143\1\141\2\145\1\150\1\157\1\uffff\1\164\3\60\1\uffff\1"+
        "\60\1\145\1\60\1\143\1\uffff\2\60\1\145\1\164\1\145\1\uffff\1\60"+
        "\1\145\1\143\1\60\1\156\1\60\1\156\1\60\3\uffff\1\60\1\uffff\1\164"+
        "\1\uffff\1\60\1\145\1\60\1\uffff\1\157\1\145\1\157\1\uffff\1\164"+
        "\1\uffff\1\60\1\uffff\1\157\1\60\1\144\1\uffff\1\146\1\60\1\156"+
        "\1\163\1\uffff\1\156\1\uffff\2\60\1\uffff\1\143\1\60\1\143\1\uffff"+
        "\1\145\1\uffff\1\145\2\60";
    static final String DFA34_maxS =
        "\1\176\10\uffff\1\76\1\174\1\75\1\72\1\76\1\uffff\1\76\1\uffff\6"+
        "\75\1\uffff\1\145\1\157\1\170\1\156\1\165\1\150\1\157\1\167\1\162"+
        "\1\145\1\154\1\163\1\162\1\157\1\141\1\uffff\1\162\1\165\2\145\1"+
        "\162\2\uffff\1\74\2\uffff\1\76\30\uffff\1\167\1\157\1\163\1\156"+
        "\1\150\1\163\1\164\1\172\1\164\1\160\1\162\1\156\1\157\1\154\1\151"+
        "\1\172\1\146\1\151\1\162\1\145\1\157\1\164\1\157\1\144\1\163\1\172"+
        "\2\162\1\172\1\152\2\162\1\142\1\157\1\uffff\2\145\1\165\1\75\1"+
        "\uffff\1\75\1\172\1\156\1\163\1\145\1\164\1\157\2\145\1\uffff\1"+
        "\164\1\172\2\154\1\172\1\143\1\141\1\163\1\154\1\uffff\1\141\2\164"+
        "\1\151\1\141\1\154\2\165\1\142\1\172\1\164\1\uffff\2\141\1\uffff"+
        "\1\145\2\172\1\154\1\166\1\164\1\145\3\uffff\1\145\1\163\1\172\1"+
        "\151\1\164\2\172\1\156\1\141\1\162\1\uffff\1\165\1\145\1\141\1\uffff"+
        "\2\164\2\145\1\165\1\143\1\151\1\156\1\153\1\172\1\162\1\151\1\141"+
        "\1\uffff\1\162\2\171\1\143\2\uffff\1\151\1\141\1\145\3\172\1\uffff"+
        "\1\156\1\172\1\uffff\1\146\1\uffff\1\144\1\156\1\146\1\144\1\155"+
        "\1\143\1\151\3\172\1\154\1\150\1\143\1\147\1\172\1\156\1\162\1\154"+
        "\1\141\2\172\1\164\1\143\1\164\1\143\3\uffff\1\165\1\uffff\1\172"+
        "\1\163\1\143\1\141\2\145\1\150\1\157\1\uffff\1\164\3\172\1\uffff"+
        "\1\172\1\145\1\172\1\143\1\uffff\2\172\1\145\1\164\1\145\1\uffff"+
        "\1\172\1\145\1\143\1\172\1\156\1\172\1\156\1\172\3\uffff\1\172\1"+
        "\uffff\1\164\1\uffff\1\172\1\145\1\172\1\uffff\1\157\1\145\1\157"+
        "\1\uffff\1\164\1\uffff\1\172\1\uffff\1\157\1\172\1\144\1\uffff\1"+
        "\146\1\172\1\156\1\163\1\uffff\1\156\1\uffff\2\172\1\uffff\1\143"+
        "\1\172\1\143\1\uffff\1\145\1\uffff\1\145\2\172";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff\1\16\1\uffff\1"+
        "\20\6\uffff\1\33\17\uffff\1\77\5\uffff\1\107\1\110\1\uffff\1\112"+
        "\1\113\1\uffff\1\120\1\11\1\114\1\34\1\12\1\24\1\13\1\23\1\14\1"+
        "\21\1\15\1\117\1\27\1\74\1\17\1\105\1\22\1\25\1\26\1\30\1\31\1\75"+
        "\1\76\1\32\42\uffff\1\104\4\uffff\1\115\11\uffff\1\40\11\uffff\1"+
        "\46\13\uffff\1\73\2\uffff\1\61\7\uffff\1\111\1\116\1\35\12\uffff"+
        "\1\102\3\uffff\1\43\15\uffff\1\60\4\uffff\1\62\1\71\6\uffff\1\50"+
        "\2\uffff\1\37\1\uffff\1\41\31\uffff\1\106\1\36\1\64\1\uffff\1\72"+
        "\10\uffff\1\45\4\uffff\1\53\4\uffff\1\100\5\uffff\1\42\10\uffff"+
        "\1\47\1\57\1\55\1\uffff\1\56\1\uffff\1\103\3\uffff\1\66\3\uffff"+
        "\1\101\1\uffff\1\44\1\uffff\1\51\3\uffff\1\54\4\uffff\1\52\1\uffff"+
        "\1\70\2\uffff\1\65\3\uffff\1\63\1\uffff\1\67\3\uffff";
    static final String DFA34_specialS =
        "\u0138\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\22\1\56\1\47\1\20\1\25\1\13\1\55\1\3\1\4\1\24\1\23\1\2\1"+
            "\15\1\21\1\26\1\52\11\53\1\14\1\1\1\57\1\11\1\62\1\17\1\16\1"+
            "\50\31\60\1\5\1\uffff\1\6\1\61\1\60\1\uffff\1\43\1\40\1\31\1"+
            "\36\1\32\1\34\1\42\1\60\1\33\4\60\1\30\1\44\1\51\1\60\1\41\1"+
            "\37\1\54\1\60\1\46\1\35\1\45\2\60\1\7\1\12\1\10\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\1\64",
            "\1\61\76\uffff\1\67",
            "\1\71\26\uffff\1\61",
            "\1\73",
            "\1\76\17\uffff\1\61\1\75",
            "",
            "\1\100",
            "",
            "\12\102\3\uffff\1\61",
            "\1\65",
            "\1\76\21\uffff\1\61",
            "\1\61",
            "\1\61",
            "\1\110\4\uffff\1\111\15\uffff\1\61",
            "",
            "\1\113",
            "\1\115\12\uffff\1\114\2\uffff\1\116",
            "\1\117\10\uffff\1\120\13\uffff\1\121",
            "\1\122\6\uffff\1\124\1\123",
            "\1\130\12\uffff\1\127\2\uffff\1\125\5\uffff\1\126",
            "\1\131",
            "\1\133\11\uffff\1\132",
            "\1\135\2\uffff\1\134",
            "\1\137\2\uffff\1\136",
            "\1\140",
            "\1\141",
            "\1\146\17\uffff\1\143\13\uffff\1\142\3\uffff\1\145\1\144",
            "\1\150\17\uffff\1\147",
            "\1\151",
            "\1\152",
            "",
            "\1\146\37\uffff\1\146",
            "\1\154\2\uffff\1\153",
            "\1\102\1\uffff\10\156\2\102\13\uffff\1\102\37\uffff\1\102",
            "\1\102\1\uffff\12\157\13\uffff\1\102\37\uffff\1\102",
            "\1\160",
            "",
            "",
            "\1\161",
            "",
            "",
            "\1\163",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\164",
            "\1\166\15\uffff\1\165",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\177\17\uffff\1\175\1\176",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089\20\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008e\2\uffff\1\u008d",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0094\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a\5\uffff\1\u009b",
            "",
            "\1\102\1\uffff\10\156\2\102\13\uffff\1\102\37\uffff\1\102",
            "\1\102\1\uffff\12\157\13\uffff\1\102\37\uffff\1\102",
            "\1\u009c",
            "\1\u009d\1\61",
            "",
            "\1\61",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a4\1\u00a3",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00a9\25\60",
            "\1\u00ab",
            "\1\u00ac",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00ad\25\60",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00bd",
            "",
            "\1\u00bf\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00bf",
            "",
            "\1\u00c0",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ca",
            "\1\u00cb",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00cd\21"+
            "\60",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e3\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\u00e4",
            "",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00eb",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "",
            "",
            "\1\u0104",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "",
            "\1\u010d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0111",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0113",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0119",
            "\1\u011a",
            "\12\60\7\uffff\32\60\4\uffff\1\u011b\1\uffff\32\60",
            "\1\u011d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u011f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\u0121\1\uffff\32\60",
            "",
            "\1\u0122",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0123",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "\1\u0128",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u012a",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u012c",
            "",
            "\1\u012d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0133",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0135",
            "",
            "\1\u0136",
            "",
            "\1\u0137",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60"
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
            return "1:1: Tokens : ( SemiColon | Comma | OpenBrace | CloseBrace | OpenSquareBrace | CloseSquareBrace | OpenCurlyBrace | CloseCurlyBrace | ArrayAssign | LogicalOr | LogicalAnd | ClassMember | InstanceMember | SuppressWarnings | QuestionMark | Dollar | Colon | Dot | Ampersand | Pipe | Bang | Plus | Minus | Asterisk | Percent | Forwardslash | Tilde | Equals | New | Clone | Echo | If | Else | ElseIf | For | Foreach | While | Do | Switch | Case | Default | Function | Break | Continue | Return | Global | Static | And | Or | Xor | Instanceof | Class | Interface | Extends | Implements | Abstract | Var | Const | T__111 | BodyString | MultilineComment | SinglelineComment | UnixComment | Array | RequireOperator | PrimitiveType | AccessModifier | Integer | Real | Boolean | SingleQuotedString | DoubleQuotedString | HereDoc | UnquotedString | AsignmentOperator | EqualityOperator | ComparisionOperator | ShiftOperator | IncrementOperator | WhiteSpace );";
        }
    }
 

}