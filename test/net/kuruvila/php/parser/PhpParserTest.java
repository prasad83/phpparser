/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.kuruvila.php.parser;

import net.kuruvila.simplejson.Json;
import net.kuruvila.simplejson.SimpleJson;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.kuruvila.php.test.Resources;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sidharth
 */
public class PhpParserTest {
    Resources res = new Resources();
    public PhpParserTest() throws Exception{
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

    //@After
    public void tearDown() {
    }

    //@Test
    public void test1() throws Exception{
        test("test1");
    }

    @Test
    public void testBodyString() throws Exception{
        test("bodystring");
    }

    @Test
    public void testSimpleStatement() throws Exception{
        test("simplestatement");
    }

    @Test
    public void testExpression() throws Exception{
        test("expression");
    }


    @Test
    public void testIf() throws Exception {
        test("ifcondition");
    }


    @Test
    public void testFunctionCall() throws Exception{
        test("functioncall");
    }

    @Test
    public void testFunctionDefinition() throws Exception{
        test("functiondefinition");

    }

    @Test
    public void testMemberAccess() throws Exception{
        test("memberaccess");
    }

    @Test
    public void testArray() throws Exception{
        test("array");
    }

    @Test
    public void testForeach() throws Exception{
        test("foreach");
    }

    @Test
    public void testSwitchcase() throws Exception{
        test("switchcase");
    }

    @Test
    public void testWhileLoop() throws Exception{
        test("whileloop");
    }

    @Test
    public void testDoLoop() throws Exception{
        test("doloop");
    }

    @Test 
    public void testForLoop() throws Exception{
        test("forloop");
    }

    @Test
    public void testClassDefinition() throws Exception{
        test("classdefinition");
    }

    @Test
    public void testInterfaceDefinition() throws Exception{
        test("interfacedefinition");
    }
    
    @Test
    public void testVtiger() throws Exception{
        PhpParser parser = res.parser("vtiger");
        CommonTree tree = (CommonTree)parser.prog().getTree();
        Object result = simpleTree(tree);
        System.out.println(result);
    }

    //@Test
    public void testDummy() throws Exception{
        disp("dummy");
    }

    private void disp(String name) throws Exception{
        PhpParser parser = res.parser(name);
        CommonTree tree = (CommonTree) parser.prog().getTree();
        Object result = simpleTree(tree);
        System.out.println(result);
        Json json = new SimpleJson();
        System.out.println("Json:"+json.write(result));
    }

    private void test(String name) throws Exception{
        PhpParser parser = res.parser(name);
        CommonTree tree = (CommonTree)parser.prog().getTree();
        Object result = simpleTree(tree);
        //System.out.println("Result:"+result);
        Object expected = res.readJson(name);
        compareTrees(expected, result);
    }

    private PhpParser parser(InputStream is)throws IOException{
        ANTLRInputStream input = new ANTLRInputStream(is);
        PhpLexer lex = new PhpLexer(input);
        CommonTokenStream cts = new CommonTokenStream(lex);
        PhpParser tap = new PhpParser(cts);
        return tap;
    }

    private void compareTrees(Object expected, Object result){
        if(expected == null){
            assertNull(result);
        }else if(expected instanceof List){
            if(result instanceof List){
                List left = (List)expected;
                List right = (List)result;
                assertTrue(right.toString(), left.size()==right.size());
                for (int i = 0; i < left.size(); i++) {
                    compareTrees(left.get(i), right.get(i));
                }
            }else{

                fail("Types do not match expected <"+expected+"> got <"+result+">");
            }
        }else{
            if(expected instanceof String){
                assertEquals(expected, ((Map<String, String>)result).get("value"));
            }else{
                assertEquals(expected, result);
            }
        }
    }

    private Object simpleTree(CommonTree tree){
        Token token = tree.getToken();

        Map<String, String> tokenMap = null;
        if(token != null){
            tokenMap = new HashMap<String, String>();
            String tokenName = res.tokenName(token.getType());
            String tokenValue = token.getText();
            tokenMap.put("name", tokenName);
            tokenMap.put("value", tokenValue);
        }
        if(tree.getChildren()==null){
            return tokenMap;
        }else{
            List tokenList = new ArrayList();
            tokenList.add(tokenMap);
            for (Object object : tree.getChildren()) {
                tokenList.add(simpleTree((CommonTree)object));
            }
            return tokenList;
        }

    }

}