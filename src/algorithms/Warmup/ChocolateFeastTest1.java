package algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by manishgiri on 4/8/15.
 */
public class ChocolateFeastTest1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int T = in.nextInt();

        for(int i = 0; i < T; i++) {

            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long Solve(int N, int C, int M) {

        //doesn't work

        long buy = (long) N/C;
        long free = (long) buy/M;
        long left = (long) buy%M;
        long all = buy + free;
        while((left+free)/M>=1 && left>0){
            free = (left + free)/M;
            left = (left + free)%M;
            all = all + free;
        }
        return all;
    }

}
