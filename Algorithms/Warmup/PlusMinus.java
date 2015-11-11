package algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by manishgiri on 11/9/15.
 * counts fraction of +ve -ve and zeros in an array of numbers
 */
public class PlusMinus {

    private static void printFractions(int[] numbers) {
        int numbersLength = numbers.length;
        int plusCount = 0, minusCount = 0, zeros = 0;
        for(int i = 0; i < numbersLength; i++) {
            if(numbers[i] > 0) {
                plusCount++;
            }
            else if(numbers[i] < 0) {
                minusCount++;
            }
            else {
                zeros++;
            }
        }

        double plusFraction = (double) plusCount/numbersLength;
        double minusFraction = (double) minusCount/numbersLength;
        double zeroFraction = (double) zeros/numbersLength;

        System.out.printf("Plus fraction: %.003f %n", plusFraction);
        System.out.printf("Minus fraction: %.003f %n", minusFraction);
        System.out.printf("Zero fraction: %.003f %n", zeroFraction);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int N = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[N];
        System.out.println("Enter " + N + " space separated integers.");
        String numInput = scanner.nextLine();
        String[] nums = numInput.split(" ");
        for(int j = 0; j < nums.length; j++) {
            numbers[j] = Integer.parseInt(nums[j]);
        }

        printFractions(numbers);
    }
}
