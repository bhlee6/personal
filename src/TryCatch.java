import java.io.*;
import java.util.*;

public class TryCatch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int i1 = s.nextInt();
            int i2 = s.nextInt();
            int div = i1/i2;
            System.out.println(div);
        }
        catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}