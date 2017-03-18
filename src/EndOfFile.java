import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Prints line number starting from 1 to the end of the input.
 */
public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int i = 1;
        while(s.hasNext()){
            System.out.println(i + " " + s.nextLine());
            i++;
        }
    }
}