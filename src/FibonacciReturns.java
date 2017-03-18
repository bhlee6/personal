import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class FibonacciReturns {

    public static BigInteger fibonaccil(BigInteger n) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger fib = BigInteger.valueOf(1);
        for(int i=0; i<n.intValue(); i++) {
            a = b;
            b = fib;
            fib = a.add(b);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<BigInteger> list = new ArrayList<>();
        while(s.hasNextLine()) {
            BigInteger n = s.nextBigInteger();
            list.add(n);
        }
        for (BigInteger i : list){
            System.out.println(fibonaccil(i));
        }
    }
}