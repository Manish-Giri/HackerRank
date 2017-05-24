package tutorials.thirtydaysofcode;

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
            return 0;
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
