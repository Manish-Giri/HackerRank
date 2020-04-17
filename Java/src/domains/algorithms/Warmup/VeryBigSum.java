package domains.algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by Manish on 10/27/2015.
 */
public class VeryBigSum {

    private static long[] parseNumbers(String input, int length) {
        /**
         * method accepts a string input, and a integer length and parses the numbers in the string
         */
        //split the string on spaces
        String[] terms = input.split(" ");
        //create new array with given length
        long[] numbers = new long[length];

        //for every number in the string array, add it to the long array
        for(int i = 0; i < numbers.length; i++) {
            Long num = Long.parseLong(terms[i]);
            numbers[i] = num;
        }

        return numbers;
    }

    private static long calculateSum(long[] nums) {
        long result = 0;
        for(long num: nums) {
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
        long[] numbers = parseNumbers(input, n);
        System.out.println(calculateSum(numbers));
    }
}
