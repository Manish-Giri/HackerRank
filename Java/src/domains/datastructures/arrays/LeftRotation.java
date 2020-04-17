package domains.datastructures.arrays;

import java.util.Scanner;

public class LeftRotation {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            // calculate new position for aItem after d roations
            int pos = i - d;
            // account for negative mod
            int idx = pos >= 0 ? pos % n : n - (Math.abs(pos) % n);
            a[idx] = aItem;
        }

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        scanner.close();
    }
}
