import java.io.*;
import java.util.*;

/**
 * Given a base-10 integer n, convert it to binary (base-2).
 * Then find and print the base-10 integer denoting the maximum number of
 * consecutive 1's in n's binary representation.
 */
public class Binary {

    static int maxConsecutiveOnes(int n) {
        int max = 0;
        String s = Integer.toBinaryString(n);
        String[] sarray = s.split("0");
        for (int i = 0; i<sarray.length; i++) {
            if (sarray[i].length() > max) {
                max = sarray[i].length();
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(maxConsecutiveOnes(s.nextInt()));
    }
}