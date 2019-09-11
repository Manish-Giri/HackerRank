package tutorials.thirtydaysofcode;

import java.util.Scanner;

public class NestedLogic {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int[] actual = new int[3];
        int[] expected = new int[3];
        int fine = 0;
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        int i = 0;
        for(String s: firstLine.split(" ")) {
            actual[i++] = Integer.parseInt(s);
        }
        i = 0;
        for(String s: secondLine.split(" ")) {
            expected[i++] = Integer.parseInt(s);
        }
        // CASE 1 - returned after expected year
        if (actual[2] > expected[2]) {
            fine = 10000;
        }

        // CASE err - actual year less than expected year
        else if(actual[2] < expected[2]) {
            fine = 0;
        }
        // CASE 2 - returned on same year
        else if(actual[2] == expected[2]) {
            // case a - returned after expected day but within same month
            if((actual[0] > expected [0]) && (actual[1] == expected[1])) {
                fine = 15 * (actual[0] - expected[0]);
            }

            // case b - returned after expected month but in same year
            else if(actual[1] > expected[1]) {
                fine = 500 * (actual[1] - expected[1]);
            }
        }
        System.out.println(fine);
    }
}
