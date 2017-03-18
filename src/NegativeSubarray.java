import java.io.*;
import java.util.*;

public class NegativeSubarray {

    public static void main(String[] args) {

        Scanner s= null;
        try {
            s = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int size = s.nextInt();
        int count = 0;
        int[] iarray = new int[size];
        while (s.hasNext()) {
            for (int i = 0; i < size; i++) {
                int sum = 0;
                iarray[i] = s.nextInt();
                for (int j = i; j >= 0; j--) {
                    sum += iarray[j];
                    System.out.println(sum);
                    if (sum < 0)
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}