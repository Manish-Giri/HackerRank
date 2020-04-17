package domains.algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by manishgiri on 11/9/15.
 * prints a sequence of spaces based on given integer
 */
public class Staircase {

    private static void printStaircase(int height) {
        for (int i = 1; i <= height; i++) {
            int numSpaces = height - i;
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            int k = i;
            while (k > 0) {
                System.out.print("#");
                k--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of staircase");
        int n = Integer.parseInt(scanner.nextLine());
        printStaircase(n);
    }
}
