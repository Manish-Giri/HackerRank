package tutorials.thirtydaysofcode;

import java.util.Scanner;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

/**
 * Created by manishgiri on 9/25/16.
 */
public class TwoDimArrays {

    private static void findMaxValue(int[][] arr) {
        List<Integer> results = new ArrayList<>();
        int rowPtr, colPtr, sum;
        for(rowPtr = 0; rowPtr <= 3; rowPtr++) {
            for (colPtr = 0; colPtr <= 3; colPtr++) {
                sum = arr[rowPtr][colPtr] + arr[rowPtr][colPtr+1] + arr[rowPtr][colPtr+2] +
                        arr[rowPtr+1][colPtr+1] +
                      arr[rowPtr+2][colPtr] + arr[rowPtr+2][colPtr+1] + arr[rowPtr+2][colPtr+2];
                results.add(sum);

            }
        }
        System.out.println(results);
        int largest = Collections.max(results);
        System.out.println(largest);


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }

        }

        findMaxValue(arr);
        //System.out.println("--output--");

       /* for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                //arr[i][j] = in.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

    }
}
