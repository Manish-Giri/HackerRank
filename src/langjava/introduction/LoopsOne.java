package langjava.introduction;

import java.util.Scanner;

/**
 * Created by manishgiri on 7/10/17.
 */
public class LoopsOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}
