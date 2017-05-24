package tutorials.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by manishgiri on 5/23/17.
 */
public class Interfaces {

    private interface AdvancedArithmetic{
        int divisorSum(int n);
    }

    private static class Calculator implements AdvancedArithmetic {

        @Override
        public int divisorSum(int n) {
            ArrayList<Integer> divisors = new ArrayList<>();
            int result = 0;
            for(int i = 1; i <= n; i++) {
                if(n % i == 0) {
                    divisors.add(i);
                }
            }

            for(int k: divisors) {
                result += k;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
