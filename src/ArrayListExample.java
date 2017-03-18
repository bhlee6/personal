import java.io.*;
import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int listCount = s.nextInt();
        ArrayList[] lists = new ArrayList[listCount];
        for (int i = 0; i < listCount; i++) {
            int d = s.nextInt();
            lists[i] = new ArrayList();
            for (int j = 0; j <d; j++) {
                lists[i].add(s.nextInt());
            }
        }

        int q = s.nextInt();
        for (int i = 0; i<q; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            try {
                System.out.println(lists[x-1].get(y-1));
            }
            catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
