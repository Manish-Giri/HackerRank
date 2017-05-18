package algorithms.Warmup;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by manishgiri on 3/30/15.
 * code for service lane challenge in alogrithms warmup challenge
 */
public class ServiceLane {

    static Scanner sc = new Scanner(System.in);
    static int[] width = {2, 3, 1, 2, 3, 2, 3, 3};
    public static int calculateVehicle(int p, int q) {

        int i;
        int j = q;

        //get widths at indices p and q
        int entryWidth = width[p];
        int exitWidth = width[q];

        ArrayList<Integer> al = new ArrayList<Integer>();
        //store entry and exit widths in arraylist
        al.add(entryWidth);
        al.add(exitWidth);

        //loop to get all intermediate widths
        for(i = p+1; i < q; i++) {
           al.add(width[i]);
        }

        //create integer array and convert array list to integer array
        Integer[] result = new Integer[al.size()];
        result = al.toArray(result);

        //sort integer array
        Arrays.sort(result);

        //find lowest element of sorted array as width
        int lowest = result[0];

        return lowest;

    }

    public static void main(String[] args) {

        ArrayList<Integer> length;
        ArrayList<Integer> results;
        int n, t;
        //int p = 0;

        System.out.println("Enter length of highway:");
        n = sc.nextInt();

        //construct array list of input length
        length = new ArrayList<Integer>(n);

        //store all elements in arraylist
        System.out.println("Enter width array: " + n +" elements");
        for(int i = 0; i < n; i++){
            length.add(sc.nextInt());
        }

        System.out.println("Enter number of test cases:");
        t = sc.nextInt();
        results = new ArrayList<Integer>(t);
        for(int p = 0; p < t; p++) {

            int entry, exit;
            System.out.println("Enter integers for test case #" + p);
            System.out.println("Enter entry segment: ");
            entry = sc.nextInt();
            System.out.println("Enter exit segment: ");
            exit = sc.nextInt();

            results.add(calculateVehicle(entry, exit));
        }

        System.out.println();
        System.out.println("Results for the test cases are: ");
        System.out.println();
        System.out.println(results);

        }


    }

