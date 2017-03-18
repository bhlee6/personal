import java.io.*;
import java.util.*;


public class ReverseArray {

    static void reverse(int[] array) {
        for (int j = array.length-1; j>=0; j--){
            System.out.print(array[j] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner s= null;
        try {
            s = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = s.nextInt();
        }
        s.close();
        reverse(arr);


    }
}