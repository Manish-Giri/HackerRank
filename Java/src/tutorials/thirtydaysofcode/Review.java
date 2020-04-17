package tutorials.thirtydaysofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by manishgiri on 6/2/16.
 */
public class Review {

    private static String parseLetters(String input) {
        String odd = "";
        String even = "";
        char[] letters = input.toCharArray();
        for(int i = 0; i < input.length(); i++) {
           if(i % 2 == 0) {
               even += letters[i];
           }

           else {
               odd += letters[i];
           }
        }
        return even + " " + odd;
    }

    public static void main(String[] args) {
        List<String> results = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < T; i++) {
            String s = scanner.nextLine();
            results.add(parseLetters(s));
        }
        for(String s: results) {
            System.out.println(s);
        }
    }
}
