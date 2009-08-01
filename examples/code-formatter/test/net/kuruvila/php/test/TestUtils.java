/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.kuruvila.php.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;

/**
 *
 * @author sidharth
 */
public class TestUtils {


    public static String readStream(InputStream is) throws IOException{
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
