import java.io.*;
import java.util.*;

public class WeightedMean {


    public static double calculateWeightedMean(int[] array, int[] weighted) {
        int weightedSum = 0;
        int weight = 0;
        for (int i = 0; i<array.length; i++) {
            weightedSum = array[i]*weighted[i]+weightedSum;
            weight += weighted[i];
        }
        double mean = (double) weightedSum/weight;
        double roundedMean = (double) (Math.round(mean*10))/10;
        return roundedMean;
    }

    public static void main(String[] args) {

        Scanner s= null;
        try {
            s = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int size;
        size = s.nextInt();


        int[] iarray = new int[size];
        int[] weightArray = new int[size];
        s.nextLine();
        for (int i=0; i<size; i++) {
            iarray[i] = s.nextInt();
        }
        s.nextLine();
        for (int i=0; i<size; i++) {
            weightArray[i] = s.nextInt();
        }
        System.out.println(calculateWeightedMean(iarray, weightArray));
    }
}