import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Array2d {
    static int maxSum(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 0; j< array.length -2; j++) {
                int current = array[i][j] +
                        array[i][j+1] +
                        array[i][j+2] +
                        array[i+1][j+1] +
                        array[i+2][j] +
                        array[i+2][j+1] +
                        array[i+2][j+2];
                if (current > max) {
                    max = current;
                }
            }
        }
        return max;
    }



    public static void main(String[] args) {
        Scanner in= null;
        try {
            in = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(maxSum(arr));
    }
}