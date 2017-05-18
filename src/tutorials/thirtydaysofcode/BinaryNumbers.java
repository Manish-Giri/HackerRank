package tutorials.thirtydaysofcode;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by hi on 9/24/2016.
 * Objective
 Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

 Task
 Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

 Input Format

 A single integer, .

 Constraints

 Output Format

 Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .
 */
public class BinaryNumbers {

    private static String convertToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    private static int countConsecutiveOnes(String number) {
        String[] digits = number.split("");
        int consecutiveCount = 0;
        int currentCount = 0;
        for(int i = 0; i < digits.length; i++) {
            if(digits[i].equals("1")) {
                currentCount++;
            }
            else {
                currentCount = 0;
            }

            if(consecutiveCount < currentCount) {
                consecutiveCount = currentCount;
            }
        }


        return consecutiveCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = countConsecutiveOnes(convertToBinary(n));
        System.out.println(count);
    }
}
