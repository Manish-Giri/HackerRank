package algorithms.Warmup;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user1 on 4/1/15.
 */
public class HalloweenPartyTest {

    static Scanner sc = new Scanner(System.in);

    private static long findPieces(long a) {

        long half = a/2;
        long result = 0;

        if(a % 2 == 0) {
            result = (long) Math.pow( (double) half, 2);

        }

        else {

            result = (half + 1) * half;
        }

        return result;
    }
    public static void main(String[] args) {


      //  System.out.println("Enter the number of test cases: ");
        int T = sc.nextInt();

        ArrayList<Long> res = new ArrayList<>(T);

        for(int x = 0; x < T; x++) {

            //System.out.println("Enter N: ");

           // long N = Long.parseUnsignedLong(sc.nextLine());

            long N = sc.nextLong();

            long result = findPieces(N);

            res.add(result);

        }

      //  System.out.println("Number of pieces: ");
        for(int x = 0; x < res.size(); x++) {
            System.out.println(res.get(x));
        }


    }
}
