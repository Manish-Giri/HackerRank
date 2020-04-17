package tutorials.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by manishgiri on 6/5/16.
 */
public class Recursion {
    private static int factorialize(int num) {
        if (num <= 1) {
            return 1;
        }
        else
            return num * factorialize(num - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorialize(n));
    }
}
