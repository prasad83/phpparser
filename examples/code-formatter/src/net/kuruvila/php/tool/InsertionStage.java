package net.kuruvila.php.tool;

import net.kuruvila.php.parser.InsertionParser;
import org.antlr.runtime.RecognitionException;

/**
 * Insert missing curly braces around complex statements.
 * 
 * @author sidharth
 */
class InsertionStage extends Stage {

    @Override
    void rule() throws RecognitionException {
        InsertionParser tap = new InsertionParser(tokens);
        tap.prog();
    }
}
