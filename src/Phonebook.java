//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Phonebook{

    static String lookup(HashMap<String,Integer> map, String s) {
        if (map.containsKey(s)) {
            return s+"="+ map.get(s);
        }
        else return "Not found";
    }

    public static void main(String []argh){
        Scanner s= null;
        try {
            s = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int n = s.nextInt();

        HashMap phonebook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = s.next();
            int phone = s.nextInt();
            phonebook.put(name, phone);
        }
        while(s.hasNext()){
            String s1 = s.next();
            System.out.println(lookup(phonebook, s1));
        }
        s.close();
    }
}