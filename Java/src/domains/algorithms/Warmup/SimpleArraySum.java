package domains.algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by Manish on 10/27/2015.
 * solution to the simple array sum challenge on hackerrank
 */
public class SimpleArraySum {

    //method to parse string input into int array
    private static int[] parseNumbers(String input, int length) {
        /**
         * method accepts a string containing space separated integers, and length
         */
        String[] terms = input.split(" ");
        int[] numbers = new int[length];

        for(int i = 0; i < length; i++) {
            Integer num = Integer.parseInt(terms[i]);
            numbers[i] = num;
        }

        return numbers;
    }

    //method to return sum of numbers in array
    private static int calculateSum(int[] numbers) {
        int result = 0;
        for(int num: numbers) {
            result += num;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the numbers of integers");
        int n = Integer.parseInt(scanner.nextLine());
        //System.out.println("Enter the numbers separated by a space");
        String input = scanner.nextLine();
        int[] numbers = parseNumbers(input, n);
        System.out.println(calculateSum(numbers));

    }
}
