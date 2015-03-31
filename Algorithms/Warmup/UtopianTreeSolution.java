package algorithms.Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Created by manishgiri on 3/30/15.
 */
public class UtopianTreeSolution {

    static Scanner sc= new Scanner(System.in);
    public static int calculateHeight(int cycles) {

        int height = 1;
        boolean Spring = true;
        int n = 0;
        while (n < cycles) {

            if(Spring) {
                Spring = false;
                height *= 2;
                n++;

            }

            else if(!Spring) {
                Spring = true;
                height += 1;
                n++;
            }
        }

        return height;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();
        int cycles = 0;
        int n = 0;
        while (n < t) {
            //System.out.println("Enter the number of cycles");
            cycles = sc.nextInt();
            int height = calculateHeight(cycles);
            System.out.println(height);
            n++;
        }

    }
}
