package algorithms.Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
/**
 * Created by manishgiri on 3/30/15.
 */
public class LoveLetterMysterySolution {

    static Scanner sc = new Scanner(System.in);
    public static int calcOperations(String s) {

        int len = s.length();

        char[] letters = s.toCharArray();

        int j = len-1;
        int count = 0;

        for(int i = 0; i < len/2; i++, j--) {

            count += Math.abs((int) (letters[i] - letters[j]));

        }

        return count;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();

        String[] words = new String[t];
        int[] results = new int[t];

        for(int i = 0; i < t; i++) {
            //System.out.println("Enter String: " + i);
            words[i] = sc.next();
            results[i] = calcOperations(words[i]) ;

        }

        //System.out.println("Results for the test cases are: ");
        for(int x: results) {
            System.out.println(x);
        }


    }

}
