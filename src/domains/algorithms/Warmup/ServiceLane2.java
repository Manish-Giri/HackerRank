package domains.algorithms.Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by manishgiri on 3/30/15.
 */
public class ServiceLane2 {

    static Scanner sc = new Scanner(System.in);
    static int[] results;

    public static void main(String[] args) {

        int n, t;
        //int p = 0;

        System.out.println("Enter length of highway:");
        n = sc.nextInt();
        int[] length = new int[n];


        System.out.println("Enter number of test cases:");
        t = sc.nextInt();

        results = new int[t];

        //store all elements in length array
        System.out.println("Enter width array: " + n + " elements");
        for(int i = 0; i < n; i++){
            length[i] = sc.nextInt();
        }


        for(int p = 0; p < t; p++) {

            int entry, exit;
            System.out.println("Enter integers for test case #" + p);

            System.out.println("Enter entry segment: ");
            entry = sc.nextInt();

            System.out.println("Enter exit segment: ");
            exit = sc.nextInt();

            ArrayList<Integer> w = new ArrayList<>(exit - entry + 1);
            //int[] width = new int[exit - entry + 1];

            //fetch widths from length array with input test case integers
            int entryWidth = length[entry];
            int exitWidth = length[exit];

            //width[0] = entryWidth;
            w.add(entryWidth);
            w.add(exitWidth);

            //width[exit - entry] = exitWidth;
            for(int i = entry + 1; i < exit; i++) {
                //width[i] = length[i];
                w.add(length[i]);

            }
            Integer[] width = new Integer[exit - entry + 1];
            width = (Integer[]) w.toArray(width);

            //sort width array
            Arrays.sort(width);


            //retrieve and print lowest element indicating type of vehicle
            results[p] = width[0];

        }

        System.out.println();
        System.out.println("Results for the test cases are: ");
        System.out.println();
        for(int x: results)
            System.out.println(x);

    }
}
