import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java1d {
    static class Game {

        ArrayList<Integer> visited;
        int[] iarray;
        int jump;

        public Game(int[] iarray, int jump) {
            this.visited = new ArrayList<>();
            this.iarray = iarray;
            this.jump = jump;
        }


        public boolean endReachable(int index) {
            int length = iarray.length;

            if (index < 0 || iarray[index] == 1) {
                return false;
            }
            if (index >= length || index + jump >= length) {
                return true;
            }
            this.iarray[index] = 1;
            return endReachable(index + 1) || endReachable(index - 1) || endReachable(index + this.jump);
        }
    }

    public static void main(String[] args) {
        Scanner s= null;
        try {
            s = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int numberOfTests =  s.nextInt();
        for (int i = 0; i < numberOfTests; i++){
            int n = s.nextInt();
            int m = s.nextInt();
            int[] path = new int[n];
            for (int j = 0; j < n; j++) {
                path[j] = s.nextInt();
            }
            Game g = new Game(path, m);
            System.out.println(g.endReachable(0)?"Yes" : "No");
        }
    }
}