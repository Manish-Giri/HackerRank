package langjava.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class SubstringComparisons {

    private static String getSmallestAndLargest(String s, int k) {
        System.out.println(s);
        //ArrayList<String> chunks = new ArrayList<>();
        TreeSet<String> chunks = new TreeSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            chunks.add(s.substring(i, i+k));
        }
        System.out.println(chunks);

        return chunks.first() + "\n" + chunks.last();

        //Collections.sort(chunks);
        //System.out.println(chunks);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        // return chunks.first() + "\n" + chunks.last();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
