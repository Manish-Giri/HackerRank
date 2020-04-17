package tutorials.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by manishgiri on 5/19/17.
 */
public class MoreExceptions {

    private class Calculator {

        private double power(int n, int p) throws Exception {
            if(n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            }
            else {
                return Math.pow(n, p);
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MoreExceptions moreExceptions = new MoreExceptions();
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = moreExceptions.new Calculator();
            try {
                int ans = (int) myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
