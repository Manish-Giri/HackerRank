package tutorials.thirtydaysofcode;

import java.util.Scanner;

public class BitwiseAND {

    private static final Scanner scanner = new Scanner(System.in);

    private static void printMaxExAnd(int N, int K) {
        int max = -9999;
        for(int i = 1; i <= N-1; i++) {
            for(int j = i+1; j <= N; j++) {
                int tmp = i & j;
                if(tmp > max && tmp < K) {
                    max = tmp;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int t = 3;
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] na = {"5 2", "8 5", "2 2"};
        for (int tItr = 0; tItr < na.length; tItr++) {
            //String[] nk = na[tItr].split(" ");
           String[] nk = na[tItr].split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            printMaxExAnd(n,k);
        }

        scanner.close();
    }
}
