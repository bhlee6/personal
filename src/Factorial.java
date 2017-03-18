import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(factorial(s.nextInt()));
    }

    private static int factorial(int i) {
        if (i == 1) {
            return i;
        } else
            return (i * factorial(i - 1));
    }
}