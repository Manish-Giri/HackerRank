package domains.algorithms.Warmup;
import java.util.Scanner;
/**
 * Created by user1 on 3/29/15.
 */
public class MaximisingXor {

    static Scanner sc = new Scanner(System.in);
    static int max = 0;

    public static int calcXor(int p, int q) {

        return p ^ q;
    }
    public static void main(String[] args) {

        int xor;
        int a, b, i, j;
        int current = 0;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();

       // i = a;
        j = b;

        for (i = a; i <= j; i++) {

            for ( int k = i; k <= j; k++) {

                System.out.println(i +" XOR " + k);
                current = calcXor(i, k);
                if(current > max) {
                    max = current;
                }
            }

        }

        System.out.println("Maximum XOR value is: " + max);
    }
}
