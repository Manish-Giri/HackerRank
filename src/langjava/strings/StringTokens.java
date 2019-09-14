package langjava.strings;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String regex = "[ !,?._'@]+";
        if(s.length() > 400000) {
            scan.close();
            return;
        }
        if(s.length() == 0) {
            System.out.println("0");
        }
        else {
            String[] tokens = s.split(regex);
            System.out.println(tokens.length);
            for(String t: tokens) {
                System.out.println(t);
            }
        }

        scan.close();
    }
}
