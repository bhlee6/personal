import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loop1 {
    public static void firstTenMultiples(int n) {

        for (int i = 1; i <11; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        firstTenMultiples(N);
    }
}