package algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by manishgiri on 4/12/15.
 */
public class ChocolateFeastTest2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int T = in.nextInt();

        for(int i = 0; i < T; i++) {

            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long Solve(int N, int C, int M) {

        long currentChoc = 0;
        long totalChoc = 0;
        long wrapper = 0;

        currentChoc = (long) N/C;
        totalChoc = currentChoc;
        wrapper = totalChoc;

        while(wrapper >= M) {
            totalChoc += wrapper/M;
            currentChoc = wrapper/M;

            wrapper -= (wrapper/M) * M;
            wrapper = wrapper % M;

            wrapper += currentChoc;

        }

        return totalChoc;

    }


}
