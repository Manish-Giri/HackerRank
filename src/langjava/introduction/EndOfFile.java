package langjava.introduction;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int lineNum = 0;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(++lineNum + " " + line);
        }
    }

}
