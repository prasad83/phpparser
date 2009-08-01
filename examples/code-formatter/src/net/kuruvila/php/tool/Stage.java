package net.kuruvila.php.tool;

import net.kuruvila.php.parser.PhpLexer;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;

/**
 * Super cass for all the formatting stages
 * 
 * @author sidharth
 */
abstract class Stage {

    //The token rewrite stream
    TokenRewriteStream tokens;

    //The lexer object
    Lexer lexer;

    /**
     * Override this method to implement the formatting
     * The method should make the formatting changes to
     * tokens.
     * 
     * @throws org.antlr.runtime.RecognitionException
     */
    abstract void rule() throws RecognitionException;

    public String process(String input) throws RecognitionException {
        ANTLRStringStream is = new ANTLRStringStream(input);
        lexer = new PhpLexer(is);
        tokens = new TokenRewriteStream(lexer);
        rule();
        return tokens.toString();
    }
}
