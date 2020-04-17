package domains.algorithms.Warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by manishgiri on 4/8/15.
 */
public class ChocolateFeastTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int T = Integer.parseInt(sc.nextLine());
        List<Integer> result = new ArrayList<>(T);


        for(int i = 0; i < T; i++) {

            int numChoc = 0;
            int[] numbers = new int[3];
            System.out.println("Enter N, C, M separated by spaces");

            String next = sc.nextLine();

            String[] nextSplit =  next.split(" ");


            int item;

            for(int p = 0; p < 3; p++) {
                item = Integer.parseInt(nextSplit[p]);
                numbers[p] = item;
            }

            int N = numbers[0];
            int C = numbers[1];
            int M = numbers[2];

            numChoc = N/C;

            if(numChoc < M) {
                result.add(numChoc);
            }

            else if(numChoc == M) {
                numChoc++;
                result.add(numChoc);
            }

            else if(numChoc > M) {

                int w = numChoc;

                do {
                    int newchoc = w/M;
                    int left = w%M;
                    numChoc += newchoc;
                    numChoc += left;
                    w += left;
                } while ( w % M != 0);

                result.add(numChoc);
            }


        }

        System.out.println("Total number of chocolates:");
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
