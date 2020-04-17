package domains.algorithms.Warmup;
import java.util.*;


/**
 * Created by manishgiri on 3/30/15.
 */
public class LonelyInteger {

    static int lonelyinteger(int[] a) {

        int n = a.length;
        int result = 0;
        for( int i = 0; i < n; i++) {
            result = result ^ a[i];
        }

        return  result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);

    }
}
