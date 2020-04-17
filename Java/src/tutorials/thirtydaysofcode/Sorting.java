package tutorials.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by manishgiri on 5/24/17.
 */
public class Sorting {

    private static int bubbleSort(int[] numbers) {
        int numberOfSwaps = 0;
        for (int i = 0; i < numbers.length; i++) {
            // Track number of elements swapped during a single array traversal
             // numberOfSwaps = 0;

            for (int j = 0; j < numbers.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (numbers[j] > numbers[j + 1]) {
                    // swap(numbers[j], numbers[j + 1]);
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                    numberOfSwaps++;
                }
            }
        }

        return numberOfSwaps;
    }

    private static void swap(int num1, int num2) {
        int temp = num2;
        num2 = num1;
        num1 = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int swaps = bubbleSort(a);


        System.out.println("Array is sorted in " + swaps +" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);

    }
}
