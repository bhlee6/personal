import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Read a given string, and print its integer value.  If S cannot be converted to an integer, print "Bad String"
 */

public class ExceptionStringToInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
        System.out.println(Integer.parseInt(S));
        } catch (Exception e) {
            System.out.println("Bad String");

        }
    }
}