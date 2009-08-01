package net.kuruvila.php.tool;

import net.kuruvila.php.parser.FormattingParser;
import org.antlr.runtime.RecognitionException;

/**
 * This stage currently specifies controls the position of curly braces
 * 
 * @author sidharth
 */
class FormattingStage extends Stage {

    @Override
    void rule() throws RecognitionException {
        FormattingParser fp = new FormattingParser(tokens);
        fp.prog();
    }
}
