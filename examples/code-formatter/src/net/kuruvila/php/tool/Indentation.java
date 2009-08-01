package net.kuruvila.php.tool;

/**
 * This object store the indentaion for a range of tokens
 * Spedified by start and end, inclusive of start and end.
 * 
 * @author sidharth
 */
public class Indentation {
    
    String whiteSpace; //The start of line white space.
    int start;
    int end;

    Indentation(String whiteSpace, int start, int end) {
        this.whiteSpace = whiteSpace;
        this.start = start;
        this.end = end;
    }

    public String toString(){
        return "Indentations("+whiteSpace+", "+start+", "+end+")";
    }
}