package langjava.strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String res = new StringBuilder(A).reverse().toString().equals(A) ? "Yes" : "No";
        System.out.println(res);

    }
}
