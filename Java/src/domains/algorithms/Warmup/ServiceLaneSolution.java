package domains.algorithms.Warmup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by manishgiri on 3/30/15.
 */
public class ServiceLaneSolution {

    static Scanner sc = new Scanner(System.in);
    static int[] results;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n, t;
        //int p = 0;

        n = sc.nextInt();
        int[] length = new int[n];


        t = sc.nextInt();

        results = new int[t];

        //store all elements in length array

        for(int i = 0; i < n; i++){
            length[i] = sc.nextInt();
        }


        for(int p = 0; p < t; p++) {

            int entry, exit;

            entry = sc.nextInt();

            exit = sc.nextInt();

            ArrayList<Integer> w = new ArrayList<>(exit - entry + 1);

            //fetch widths from length array with input test case integers
            int entryWidth = length[entry];
            int exitWidth = length[exit];

            w.add(entryWidth);
            w.add(exitWidth);

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

        for(int x: results)
            System.out.println(x);

    }


}
