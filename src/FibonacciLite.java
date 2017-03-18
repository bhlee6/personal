import java.io.*;
import java.util.*;

public class FibonacciLite {

    public static int fibonaccil(int n) {
            int a = 0;
            int b = 1;
            int fib = 1;
            for(int i=0; i<n; i++) {
                System.out.println(a +" " + b +" " + fib);
                a = b;
                b = fib;
                fib = a + b;
                System.out.println(a +" " + b +" " + fib);
            }
            return a;
        }

    public static void main(String[] args) {
        System.out.println(fibonaccil(1));
    }
}