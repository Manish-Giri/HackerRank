package langjava.strings;

import java.util.Scanner;

public class StringsIntro {

    private static void solve(String a, String b) {
        int len = a.length() + b.length();
        String comp = a.compareTo(b) >= 1 ? "Yes" : "No";
        StringBuilder sb = new StringBuilder();
        sb.append(a.substring(0,1).toUpperCase()).append(a.substring(1)).append(" ").append(b.substring(0,1).toUpperCase()).append(b.substring(1));
        System.out.println(len);
        System.out.println(comp);
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        solve(A, B);
    }
}
