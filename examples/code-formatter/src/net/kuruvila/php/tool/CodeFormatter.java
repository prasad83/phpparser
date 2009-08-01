package net.kuruvila.php.tool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import org.antlr.runtime.RecognitionException;

/**
 * Format php code.
 * 
 * @author sidharth
 */
public class CodeFormatter {

    public static void main(String[] args) throws Exception{
        CodeFormatter cf = new CodeFormatter();
        System.out.print(cf.format(readFile(args[0])));
    }


    /**
     * Format a given String of php code.
     *
     * @param text A string containing the php code
     * @return A string containing the formated code
     * @throws org.antlr.runtime.RecognitionException
     */
    public String format(String text) throws RecognitionException{
        List<Stage> stages = Arrays.asList(
                new InsertionStage(),
                new FormattingStage(),
                new IndentationStage());
        String output=text;
        for (Stage stage : stages) {
            output = stage.process(output);
        }
        return output;
    }

    private static String readFile(String fileName) throws FileNotFoundException, IOException{
        return readStream(new FileInputStream(fileName));
    }


    //Read an entire stream into a string
    private static String readStream(InputStream is) throws IOException{
        Reader r = new InputStreamReader(is);
        char[] buf = new char[1024];
        int n = 0;
        StringBuilder sb = new StringBuilder();
        while((n = r.read(buf))!=-1){
            sb.append(buf, 0, n);
        }
        return sb.toString();
    }


}