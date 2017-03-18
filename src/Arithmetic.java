import java.util.Scanner;

public class Arithmetic {

    public static double calculateCost(double d, int i1, int i2){
        double tip = d* i1/100;
        double tax = d * i2/100;
        return d + tip+ tax;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();


        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(calculateCost(mealCost, tipPercent, taxPercent));
        System.out.println("The total meal cost is "+ totalCost + "dollars.");
        // Print your result
    }
}