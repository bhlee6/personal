
import java.io.*;
import java.util.*;

public class Uncoupled {
    public static Integer uncoupled(ArrayList<Integer> ilist) {
        Integer result = 0;
        for(Integer i : ilist) {
            result ^= i;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner s= null;
        try {
            s = new Scanner(new FileReader("sample.txt")).useDelimiter(", ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Scanner s = new Scanner(System.in).useDelimiter(", ");
        ArrayList<Integer> list = new ArrayList<>();
        while (s.hasNext()) {
            Integer n =s.nextInt();
            list.add(n);
            System.out.println(n);
        }

        System.out.println(uncoupled(list));
    }
}
