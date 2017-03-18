import java.io.*;
import java.util.*;

public class StringEvenOdd {

    public static void main(String[] args) {
        Scanner s= null;
        try {
            s = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String s1 = s.next();
            String even = "";
            String odd = "";
            for (int j = 0; j < s1.length(); j++) {
                if (j % 2 == 0) {
                    even += s1.charAt(j);
                } else odd += s1.charAt(j);
            }
            System.out.println(even + " " + odd);
        }
    }
}