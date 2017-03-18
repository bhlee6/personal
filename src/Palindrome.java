/**
 * Created by Brian on 1/20/2017.
 */
public class Palindrome {

    //Most Optimal Algorithm because n/2 comparisons
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n/2; ++i) {
            if (str.charAt(i) != str.charAt(n-i-1)) return false;
        }
        return true;
    }

    //Slower runtime
    public static boolean reverse(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }



}

/*

import java.io.*;
import java.util.*;

public class Solution {

    public static String palindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n/2; ++i) {
            if (s.charAt(i) != s.charAt(n-i-1)) return "No";
        }
        return "Yes";
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(palindrome(A));
}
}

 */
