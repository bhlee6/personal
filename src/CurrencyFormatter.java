import java.io.*;
import java.util.*;
import java.text.*;


public class CurrencyFormatter {

    public static void convertCurrency(Double d) {

        Locale.setDefault(new Locale("en","IN"));
        String india = NumberFormat.getCurrencyInstance().format(d);
        Locale.setDefault(Locale.CHINA);
        String china = NumberFormat.getCurrencyInstance().format(d);
        Locale.setDefault(Locale.US);
        String us = NumberFormat.getCurrencyInstance().format(d);
        Locale.setDefault(Locale.FRANCE);
        String france = NumberFormat.getCurrencyInstance().format(d);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        convertCurrency(payment);

    }
}
