package algorithms.Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by manishgiri on 3/31/15.
 */
public class AngryProfessorSolution {

    static Scanner sc = new Scanner(System.in);

    private static int findNonPositive(int[] a) {

        int count = 0;
        for(int i = 0; i < a.length; i++) {

            if (a[i] < 0 || a[i] == 0) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        //Read in number of test cases

        int T = Integer.parseInt(sc.nextLine());

        //create arraylist to hold results
        ArrayList<String> arrayList = new ArrayList<>(T);

        for( int i = 0; i < T; i++) {

            int count;
            String result = " ";


            String str = sc.nextLine();

            String[] nums = str.split(" ");

            Integer[] holder = new Integer[2];

            int hold;

            for(int x = 0; x < 2; x++) {

                hold = Integer.parseInt(nums[x]);
                holder[x] = hold;
            }

            int N = holder[0];
            int K = holder[1];

            //create array of size N
            int[] students = new int[N];


            String next = sc.nextLine();

            String[] nextSplit = next.split(" ");

            int _a_item;

            for(int _a_i = 0; _a_i < N; _a_i++) {

                _a_item = Integer.parseInt(nextSplit[_a_i]);
                students[_a_i] = _a_item;
            }

            //calculate
            count = findNonPositive(students);

            if (count < K)
                result = "YES";
            else if(count >= K)
                result = "NO";

            arrayList.add(result);

        }

        for ( int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
    

}
