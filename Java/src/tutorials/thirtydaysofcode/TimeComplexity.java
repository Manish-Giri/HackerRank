package tutorials.thirtydaysofcode;

import java.util.Scanner;

public class TimeComplexity {
    static boolean testPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        for(int i = 0; i < numCases; i++) {
            int num = scanner.nextInt();
            boolean isPrime = testPrime(num);
            if(isPrime)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}
