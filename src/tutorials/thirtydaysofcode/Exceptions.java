package tutorials.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by manishgiri on 5/18/17.
 */
public class Exceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int result;
        try {
            result = Integer.parseInt(S);
            System.out.println(result);
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println("Bad String");
        }
    }
}
