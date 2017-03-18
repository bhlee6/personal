
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class IfOr {

        public static String evensCase(int n ){
            if (n >=6 && n <=20) {
                return "Weird";
            }
            else return "Not Weird";
        }

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String ans="";
            if(n%2==1){
                ans = "Weird";
            }
            else{
                ans = evensCase(n);
            }
            System.out.println(ans);
        }
    }

