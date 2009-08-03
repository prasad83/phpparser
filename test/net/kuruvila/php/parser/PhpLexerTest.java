/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.kuruvila.php.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.kuruvila.php.test.Resources;
import org.antlr.runtime.Token;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sidharth
 */
public class PhpLexerTest {
    Resources res = new Resources();
    public PhpLexerTest() throws Exception{
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test01() throws Exception{
        String name = "lexer01";
        PhpLexer lex = res.lexer(name);
        lex.setAllowShortOpenTag(true);
        testForLexer(lex, name);
        
    }

    @Test
    public void test02() throws Exception{
        String name = "lexer02";
        PhpLexer lex = res.lexer(name);
        lex.setAllowShortOpenTag(true);
        testForLexer(lex, name);
    }

    /*@Test
    public void test03() throws Exception{
        String name = "lexer03";
        disp(name);
    }*/

    private void test(String name)throws Exception{
        PhpLexer lex = res.lexer(name);
        testForLexer(lex, name);
    }

    private void testForLexer(PhpLexer lex, String name) throws Exception{
        List<Map<String,String>> resultTokens = tokenList(lex);
        List<Object> expectedTokens = (List<Object>)res.readJson(name);
        compareLists(expectedTokens, resultTokens);
    }

    private void disp(String name) throws Exception{
        PhpLexer lex = res.lexer(name);
        List<Map<String,String>> resultTokens = tokenList(lex);
        for (Map<String, String> map : resultTokens) {
            System.out.println("map:"+map);
        }
    }

    private List<Map<String,String>> tokenList(PhpLexer lex){
        List<Map<String,String>> tokens = new ArrayList<Map<String,String>>();
        Token token;
        while((token=lex.nextToken()).getType()!=PhpLexer.EOF){
           Map<String,String> tokenVal = new HashMap<String, String>();
           tokenVal.put("text", token.getText());
           tokenVal.put("type", res.tokenName(token.getType()));
           tokens.add(tokenVal);
        }
        return tokens;
    }

    private void compareLists(List<Object> expected, List<Map<String, String>> result){
        assertEquals(expected.size(), result.size());
        int n = expected.size();
        for (int i = 0; i < n; i++) {

            Map r = result.get(i);
            Object e = expected.get(i);
            if(e instanceof String){
                assertEquals(e, r.get("type"));
            }else{
                Map<String, String> em = (Map<String, String>)e;
                if(!em.containsKey("text")){
                    assertEquals(em.get("type"), r.get("type"));
                }else if(!em.containsKey("type")){
                    assertEquals(em.get("text"), r.get("text"));
                }else{
                    assertEquals(e, r);
                }
            }
        }
    }
}