package langjava.introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
    private static int B;
    private static int H;
    private static boolean flag;
    private static Scanner scanner = new Scanner(System.in);
    static {
        B = Integer.parseInt(scanner.nextLine());
        H = Integer.parseInt(scanner.nextLine());
        if(B > 0 && H > 0) {
            flag = true;
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
