package langjava.introduction;

import java.util.Scanner;

public class OutputFomatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d", s1, x);
            System.out.println();
        }
        System.out.println("================================");

    }

}
