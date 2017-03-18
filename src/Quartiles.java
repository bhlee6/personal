import java.io.*;
import java.util.*;

public class Quartiles {

    public static void calculateQuartile(int[] array){

        double q1;
        double q2;
        double q3;
        int length = array.length;

        Arrays.sort(array);
        q1 = medianv2(array, 0, length/2 - 1);
        q2 = median(array);
        if (even(length)) {
            q3 = medianv2(array, length/2, length - 1);
        }
        else {
            q3 = medianv2(array, length/2 + 1, length - 1);
        }

        System.out.println((int) q1);
        System.out.println((int) q2);
        System.out.println((int) q3);

    }


    public static boolean even(int i) {
        return i % 2==0;
    }

    public static double roundDouble(double d) {
        return (double) (Math.round(d*10))/10;
    }

    public static double median(int[] array) {
        int midOfArray = (int) Math.round((double)(array.length)/2);
        if (array.length % 2==0) {
            return roundDouble(average(array[midOfArray], array[midOfArray+1]));
        }
        else return array[midOfArray-1];
    }

    public static double medianv2(int[] array, int start, int end) {
        int length = end - start + 1;
        int median;

        if (length% 2 != 0) {
            median = array[start+length/2];
        }
        else {
            median = (array[start + length/2 - 1] + array[start + length/2])/2;
        }
        return median;
    }

    public static double average(int i1, int i2) {
        return (double) (i1+i2)/2;
    }

    public static void main(String[] args) {

        Scanner s = null;
        try {
            s = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int size;
        size = s.nextInt();

        int[] iarray = new int[size];
        s.nextLine();
        for (int i = 0; i < size; i++) {
            iarray[i] = s.nextInt();
        }
        calculateQuartile(iarray);
    }
}