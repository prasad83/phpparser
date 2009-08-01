/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.kuruvila.php.parser;

/**
 *
 * @author sidharth
 */
public class Level{

    public String name;
    public int start;
    public int end;


    public Level(){
        
    }

    public Level(String name, int start, int end){
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String toString() {
        return "Level(" + name + "," + start + "," + end + ")";
    }


}