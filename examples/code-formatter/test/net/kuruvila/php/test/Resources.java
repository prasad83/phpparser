/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.kuruvila.php.test;

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
import net.kuruvila.php.parser.ComplexStatementCurlies;
import net.kuruvila.php.parser.ComplexStatementCurliesLexer;
import net.kuruvila.php.parser.ComplexStatementCurliesParser;
import net.kuruvila.php.parser.PhpLexer;
import net.kuruvila.php.parser.PhpParser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

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
        return new FileInputStream(getResourcesDirectory()+"/"+name+".input");
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

    /*public Object readJson(String name) throws IOException{
        Json json = new SimpleJson();
        InputStream is = new FileInputStream(getResourcesDirectory()+
                "/"+name+".json");
        String str = utils.readStream(is);
        return json.read(str);
    }*/


    public ComplexStatementCurliesLexer lexer(String name) throws IOException{
        InputStream is = new FileInputStream(getResourcesDirectory()+"/"+name+".input");
        ANTLRInputStream input = new ANTLRInputStream(is);
        ComplexStatementCurliesLexer lex = new ComplexStatementCurliesLexer(input);
        return lex;
    }


    public String getText(String name) throws IOException, RecognitionException{
        ComplexStatementCurliesLexer lexer = lexer(name);
        TokenRewriteStream tokens = new TokenRewriteStream(lexer);
        ComplexStatementCurliesParser tap = new ComplexStatementCurliesParser(tokens);
        tap.prog();
        /*CommonTree t = (CommonTree)r.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        nodes.setTokenStream(tokens);
        ComplexStatementCurlies csc = new ComplexStatementCurlies(nodes);
        csc.forStatement();*/
        return tokens.toString();
    }

}
