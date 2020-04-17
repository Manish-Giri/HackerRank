package warmupchallenges.sockmerchant;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


 class Solution {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: ar) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> es: map.entrySet()) {
            pairs += es.getValue()/2;
        }
        return pairs;


    }

    private static final Scanner scanner = new Scanner(System.in);

     static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
