package algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by Manish on 10/27/2015.
 * calculates the absolute difference of sums across the two main diagonals in a square matrix of size NxN
 */
public class DiagonalDifferenceSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                int n = scanner.nextInt();
                if(i == j) {
                    leftDiagonal += n;
                }

                if(i + j == (size -1)) {
                    rightDiagonal += n;
                }
             }
        }

        int answer = Math.abs(leftDiagonal - rightDiagonal);
        System.out.println("Diagonal difference: " + answer);
    }
}
