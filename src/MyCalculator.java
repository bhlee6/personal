import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
//Solves for power
 class MyCalculator {
    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            if (p == 0) {
                return 1;
            } else {
                int power = n;
                for (int i = 1; i < p; i++) {
                    power *= n;
                }
                return power;
            }
        }
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner in= null;
        try {
            in = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while ( in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            MyCalculator my_calculator = new MyCalculator();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

/*
1
0
java.lang.Exception: n and p should be non-negative
java.lang.Exception: n and p should be non-negative
java.lang.Exception: n and p should be non-negative
15625
27
1
8
java.lang.Exception: n and p should be non-negative
 */