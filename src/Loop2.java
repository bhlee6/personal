import java.util.*;
import java.io.*;

class Loop2{

    public static void calculateSum(int a, int b, int n) {
        int sum = a;
        for (int i = 0; i < n; i++) {
            sum += ((int) Math.pow(2, i) * b);
            if (i == n- 1) {
            System.out.print(sum + "\n");
            }
            else {System.out.print(sum + " ");
        }
        }
    }


    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calculateSum(a,b,n);
        }
        in.close();


    }
}