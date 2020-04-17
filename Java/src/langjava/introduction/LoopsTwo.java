package langjava.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopsTwo {

    private static void printSeries(int a, int b, int n) {
        List<Integer> series = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int sum = 0, temp = 0;
            for(int k = 0; k < i + 1; k++) {
                temp += (int) Math.pow(2, k) * b;
            }
            sum = a + temp;
            series.add(sum);
        }
        // print space separated integers
        for(int x : series) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a,b,n);
        }
        in.close();
    }
}
