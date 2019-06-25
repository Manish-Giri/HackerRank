package algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by manishgiri on 3/30/15.
 */
public class SplitTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        System.out.println("Enter size of array:");
        //accept integer thru nextLine() then parse integer
        int _a_size = Integer.parseInt(in.nextLine());
        System.out.println("You entered: " + _a_size);

        //construct array with input size
        int[] _a = new int[_a_size];

        int _a_item;

        System.out.println("Enter integers of array: ");
        //return current line into string next
        String next = in.nextLine();

        System.out.println("You entered with spaces: " + next);

        //create array of numbers after splitting input based on " "
        String[] next_split = next.split(" ");

        System.out.println("After removing spaces, string array: " );
        for(String x: next_split) {
            System.out.print(x);
        }

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        System.out.println("Numbers stored in _a array: "  );
        for(int x: _a){
            System.out.print(x);
        }
        //res = lonelyinteger(_a);
        //System.out.println(res);

    }
}
