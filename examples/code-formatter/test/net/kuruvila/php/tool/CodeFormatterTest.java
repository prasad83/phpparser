/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.kuruvila.php.tool;import net.kuruvila.php.test.Resources;
import net.kuruvila.php.test.TestUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sun.misc.Resource;
import static org.junit.Assert.*;

/**
 *
 * @author sidharth
 */
public class CodeFormatterTest {
    Resources res = new Resources();
    TestUtils util = new TestUtils();
    public CodeFormatterTest() throws Exception{
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
    public void test1() throws Exception{
        CodeFormatter cf = new CodeFormatter();
        String result = cf.format(util.readStream(res.asStream("test1")));
        System.out.println(result);
    }


}