
import java.util.*;

public class Conditional {

    public static String evenCases(int n) {
        /*
         */
        if (n >= 2 && n <= 5) {
            return "Not Weird";
        }
        if (n >= 6 && n <= 20) {
            return "Weird";
        } else return "Not Weird";
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
           ans = evenCases(n);
        }
        System.out.println(ans);
    }
}
