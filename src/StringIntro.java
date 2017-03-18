
import java.io.*;
import java.util.*;

    public class StringIntro {

        public static void countStrings(String s1, String s2) {
            int s1length = s1.length();
            int s2length = s2.length();
            System.out.println(s1length+s2length);
            System.out.println(s1.compareTo(s2) > 0 ? "Yes": "No");
            System.out.println(capitalize(s1) + " " + capitalize(s2));

        }

        public static String capitalize(String s) {
            return s.substring(0, 1).toUpperCase() + s.substring(1);
        }

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            countStrings(A, B);

        }
    }
