package langjava.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // get num of test cases
        int N = Integer.parseInt(scan.nextLine());
        List<List<Integer>> lines = new ArrayList<>();
        // get integers
        for (int i = 0; i < N; i++) {
            //get individual lines
            String[] parts = scan.nextLine().split(" ");
            List<Integer> tmp = new ArrayList<>(parts.length-1);
            //lines.set(i, new ArrayList<>(parts.length-1));
            for (int j = 0; j < Integer.parseInt(parts[0]); j++) {
                tmp.add(Integer.parseInt(parts[j+1]));
            }
            lines.add(tmp);
        }

        // get queries
        int Q = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < Q; i++) {
            //get individual lines
            String[] parts = scan.nextLine().split(" ");
            try {
                int e = lines.get(Integer.parseInt(parts[0])-1).get(Integer.parseInt(parts[1])-1);
                System.out.println(e);
            }
            catch (Exception e) {
                System.out.println("ERROR!: " + e);
            }

        }

        scan.close();


    }
}
