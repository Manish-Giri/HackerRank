package langjava.datastructures;

import java.util.Scanner;

public class Java2DArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max = -99999, hourglass = 0;
        for(int j = 0; j <= 3; j++) {
            for(int i = 0; i <= 3; i++) {
                hourglass = (arr[j][i] + arr[j][i+1] + arr[j][i+2]
                        + arr[j+1][i+1] +  arr[j+2][i] + arr[j+2][i+1] + arr[j+2][i+2]);
                if(hourglass > max) {
                    max = hourglass;
                }
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
