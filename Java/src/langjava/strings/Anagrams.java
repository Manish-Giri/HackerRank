package langjava.strings;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String a, String b) {
        System.out.println(a + " " + b);
        if( a == null || b == null || a.equals("") || b.equals("") ) {
            System.out.println("Inside");
            return false;
        }

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();


        a.chars().mapToObj(i -> String.valueOf((char) i)).forEach(e -> map1.put(e.toLowerCase(), map1.getOrDefault(e.toLowerCase(), 0)+1));
        b.chars().mapToObj(i -> String.valueOf((char) i)).forEach(e -> map2.put(e.toLowerCase(), map2.getOrDefault(e.toLowerCase(), 0)+1));
        System.out.println(map1);
        System.out.println(map2);

        for(String s: b.split("")) {
            Integer count1 = map1.get(s);
            Integer count2 = map2.get(s);
            if(count1 == null || count2 == null) {
                return false;
            }
            if(!count1.equals(count2)) {
                return false;
            }
        }
        return true;

    }
}
