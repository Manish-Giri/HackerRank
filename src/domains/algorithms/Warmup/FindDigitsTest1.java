package domains.algorithms.Warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by manishgiri on 4/3/15.
 */
public class FindDigitsTest1 {

    static Scanner sc = new Scanner(System.in);

    private static List<Long> getDigits(long num) {

        List<Long> digits = new ArrayList<>();

        while(num > 0) {

            long quotient = num /10;
            long remainder = num - (quotient * 10);
            num = quotient;

            digits.add(remainder);
        }

        //return list

        return digits;

    }

    public static void main(String[] args) {

        List<Long> result = new ArrayList<>();

        System.out.println("Enter the integer: ");

        long N = sc.nextLong();

        result = getDigits(N);

        //print digits
        System.out.println("The digits of the number are: ");

        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }

}
