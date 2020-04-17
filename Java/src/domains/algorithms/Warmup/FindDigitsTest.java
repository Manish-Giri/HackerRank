package domains.algorithms.Warmup;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user1 on 4/2/15.
 */
public class FindDigitsTest {

    static Scanner sc = new Scanner(System.in);

    private static Long[] findDigits(long num) {

        ArrayList<Long> digits = new ArrayList<>();

        //extract all digits from input number and store in arraylist
        while (num > 0) {

            long quotient = num / 10;
            long remainder = num - (quotient * 10);
            num = quotient;
            digits.add(remainder);

        }

        Long[] result = new Long[digits.size()];
        result = digits.toArray(result) ;
        return result;

    }

    private static int findCount(Long[] list, long num) {

        int count = 0;
        for(int i = 0; i < list.length; i++) {

            //ignore division by zero- DON'T FORGET!!!
            if(list[i] == 0) {
                continue;
            }
            if (num % list[i] == 0){
                count++;
            }
        }

        return count;

    }
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        //read in number of test cases
        System.out.println("Enter number of test cases: ");
        int T = sc.nextInt();

        //loop through number of test cases
        for(int i = 0; i < T; i++) {

            System.out.println("Enter the number: ");
            long N = sc.nextLong();

            //extract digits of number and store in Integer array
            Long[] nDigits = findDigits(N);

            //calculate num. of digits which exactly divide N
            int answer = findCount(nDigits, N);

            //store answer in final arraylist
            al.add(answer);

        }

        //loop through final arraylist to print answers
        for(int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }


    }
}
