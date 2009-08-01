/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.kuruvila.php.test;

import net.kuruvila.simplejson.Json;
import net.kuruvila.simplejson.SimpleJson;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.kuruvila.php.parser.PhpLexer;
import net.kuruvila.php.parser.PhpParser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

/**
 *
 * @author sidharth
 */
public class Resources {
    private static final Logger log = Logger.getLogger(Resources.class.getName());
    
    private Properties props;
    private TestUtils utils = new TestUtils();
    private Map<Integer, String> tokenNames;
    public Resources() throws Exception{
        Properties properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("test.properties"));
        } catch (Throwable ex) {
            Logger.getLogger(Resources.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        tokenNames = tokenTypeNames();
        props = properties;
    }
    
    public String getResourcesDirectory(){
        return props.getProperty("resources");
    }
    
    public String getFilePath(String name){
        return getResourcesDirectory()+File.separator+name;
    }
    
    public InputStream asStream(String name) throws FileNotFoundException{
        return new FileInputStream(getFilePath(name));
    }


    public Map<Integer, String> tokenTypeNames()throws IOException{
        String str = utils.readStream(getClass().getClassLoader().getResourceAsStream("net/kuruvila/php/parser/Php.tokens"));
        String[] lines  = str.split("\\n");
        Map<Integer, String> out = new HashMap<Integer, String>();
        for (String line : lines) {
            line = line.trim();
            if(!line.equals("")){
                Pattern pat = Pattern.compile("(\\w+|'[^']+')=(\\d+)");
                Matcher match = pat.matcher(line);
                match.find();
                String label = match.group(1);
                Integer id = Integer.parseInt(match.group(2));
                out.put(id, label);
            }
            
        }
        return out;

    }

    public String tokenName(int tokenId){
        return tokenNames.get(tokenId);
    }

    public Object readJson(String name) throws IOException{
        Json json = new SimpleJson();
        InputStream is = new FileInputStream(getResourcesDirectory()+
                "/"+name+".json");
        String str = utils.readStream(is);
        return json.read(str);
    }


    public PhpLexer lexer(String name) throws IOException{
        InputStream is = new FileInputStream(getResourcesDirectory()+"/"+name+".input");
        ANTLRInputStream input = new ANTLRInputStream(is);
        PhpLexer lex = new PhpLexer(input);
        return lex;
    }

    public PhpParser parser(String name) throws IOException{
        return parser(new FileInputStream(getResourcesDirectory()+"/"+name+".input"));
    }

    private PhpParser parser(InputStream is)throws IOException{
        ANTLRInputStream input = new ANTLRInputStream(is);
        PhpLexer lex = new PhpLexer(input);
        CommonTokenStream cts = new CommonTokenStream(lex);
        PhpParser tap = new PhpParser(cts);
        return tap;
    }

}
