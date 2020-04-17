package domains.algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by Manish on 10/27/2015.
 * calculates the absolute difference of sums across the two main diagonals in a square matrix of size NxN
 */
public class DiagonalDifference {
    static Scanner scanner = new Scanner(System.in);


    private static int[][] constructMatrix(int size) {
        /**
         * constructs a square matrix according to the size passed in
         */
        System.out.println("Enter " + size + " lines containing " + size + " rows describing the matrix");
        int[][] matrix = new int[size][size];
        for(int i = 0; i < size; i++) {
            //accept a line of input
            String input = scanner.nextLine();
            //break it up into array of numbers as strings
            String[] terms = input.split(" ");
            for(int j = 0; j < terms.length; j++) {
                //for each line of input in terms[], parse the number
                Integer num = Integer.parseInt(terms[j]);
                //and store it in corresponding position in the matrix
                matrix[i][j] = num;
            }
        }

        //print matrix - for test
        System.out.println("The matrix is: \n");
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        return matrix;
    }

    private static void calculateDifference(int[][] numbers, int size) {
        /**
         * given a square matrix of size 'size', this method calculates the absolute difference of the sum
         * of the numbers across the two main diagonals of the matrix
         */

        int sum1 = 0;
        int sum2 = 0;

        //first diagonal sum
        for(int i = 0; i < size; i++) {
            sum1 += numbers[i][i];
        }

        //first diagonal sum test
        System.out.println("Sum of first diagonal: " + sum1);

        //second diagonal sum
        for(int i = size - 1; i >=0; i--) {
            sum2 += numbers[i][Math.abs(i-2)];
        }

        //second diagonal sum test
        System.out.println("Sum of second diagonal: " + sum2);

        //absolute difference of two diagonals
        int difference = Math.abs(sum1 - sum2);
        System.out.println("Absolute difference of two diagonals: " + difference);
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of the square matrix");
        int size = Integer.parseInt(scanner.nextLine());
        int[][] numberMatrix = constructMatrix(size);
        calculateDifference(numberMatrix, size);

    }
}
