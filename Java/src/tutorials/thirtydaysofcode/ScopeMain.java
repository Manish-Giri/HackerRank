package tutorials.thirtydaysofcode;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by manishgiri on 1/19/17.
 */


public class ScopeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Numbers are " + Arrays.toString(numbers));

        ScopeDifference scopeDifference = new ScopeDifference(numbers);
        scopeDifference.computeDifference();
    }

}
