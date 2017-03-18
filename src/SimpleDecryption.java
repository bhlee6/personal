import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


/**
 * SimpleDecryption class attempts to decrypt an integer into a string.  Given an integer, followed by a String
 * of length equal to the number of digits in the integer, this class maps each integer value to the character on the
 * next line.  Same digit values will override the previous mapped character.
 */
public class SimpleDecryption {

    /**
     * Given an Integer, return the String value of the Integer after it has been decrypted using the given map.
     *
     * @param n an integer
     * @param map Current HashMap that contains the mapping for each Integer value to a Character
     * @return Decrypted String
     */
    public static String decrypt(int n, HashMap<Integer,Character> map) {
        String decrypted = "";
        String[] intAsString = String.valueOf(n).split("(?<=.)");
        for (int i = 0; i < intAsString.length; i++) {
            Integer index = Integer.parseInt(intAsString[i]);
            if (map.get(index) == null) {
                System.out.println("Value has not been mapped for key: " + index);
                decrypted += index;
            } else {
                decrypted += map.get(index);
            }

        }
        return decrypted;
    }

    /**
     * Maps the Given Integer digit to the corresponding index of the String, and returns the HashMap.
     *
     * @param n  Given Integer
     * @param s Given String
     * @return HashMap<Integer, Character>
     */
    public static HashMap<Integer, Character> mapOut(Integer n, String s) {
        HashMap<Integer,Character> map = new HashMap<>();
        String[] intAsString = String.valueOf(n).split("(?<=.)");
        for (int i = 0; i< intAsString.length; i++) {
            map.put(Integer.parseInt(intAsString[i]), s.charAt(i));
        }
        return map;
    }

    /**
     * Given an ArrayList of Integers and an ArrayList of Strings, maps each of the
     * Integers with the corresponding indexed String in the String ArrayList and merges the maps to 1.
     * @param ilist ArrayList<Integer>
     * @param slist ArrayList<String>
     * @return HashMap<Integer, Character>
     */
    public static HashMap<Integer, Character> listsToMap (ArrayList<Integer> ilist, ArrayList<String> slist) {
        HashMap<Integer, Character> mergedMap = new HashMap<>();
        for (int i = 0; i<ilist.size(); i++) {
            mergedMap.putAll(mapOut(ilist.get(i), slist.get(i)));
        }
        return mergedMap;
    }

    public static void main(String[] args) {
        Scanner s= null;
        try {
            s = new Scanner(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Integer> ilist = new ArrayList<>();
        ArrayList<String> slist = new ArrayList<>();
        while (s.hasNextLine()) {
            ilist.add(s.nextInt());
            s.nextLine();
            slist.add(s.nextLine());
        }
        s.close();
        HashMap currentMap = listsToMap(ilist, slist);
        int i = 1234567089;
        System.out.println (decrypt(i, currentMap));
    }
}
