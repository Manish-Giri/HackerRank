package domains.algorithms.Warmup;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by manishgiri on 3/31/15.
 */
public class CutTheSticksSolution {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        //System.out.println("Enter the number of sticks: N");
        int N = Integer.parseInt(sc.nextLine());;

        int[] sticks = new int[N];


        int _a_item;

        //System.out.println("Enter integers of array: ");
        //return current line into string next
        String next = sc.nextLine();

        //create array of numbers after splitting input based on " "
        String[] next_split = next.split(" ");


        for(int _a_i = 0; _a_i < N; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            sticks[_a_i] = _a_item;
        }



        int length = sticks.length;
        Arrays.sort(sticks);

        for (int i = 0; i < length; i++) {

            int count = 0;

            if (sticks[i] == 0) {
                continue;
            } else {

                final int v = sticks[i];
                for (int j = i; j < length; j++) {
                    sticks[j] -= v;
                    count++;
                }
            }

            arrayList.add(count);


        }

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }



    }
}
