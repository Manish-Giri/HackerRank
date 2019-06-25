package domains.algorithms.Warmup;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user1 on 3/31/15.
 */
public class AngryProfessorTest {

    static Scanner sc = new Scanner(System.in);

    private static int findNonPositive(int[] a) {

        int count = 0;
        for(int i = 0; i < a.length; i++) {

            if (a[i] < 0 || a[i] == 0) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        //Read in number of test cases

        System.out.println("Enter number of test cases: ");
        int T = Integer.parseInt(sc.nextLine());

        //create arraylist to hold results
        ArrayList<String> arrayList = new ArrayList<>(T);

        for( int i = 0; i < T; i++) {

            int count;
            String result = " ";



            System.out.println("Enter number of students and expected number of students separated by spaces: ");

            String str = sc.nextLine();

            String[] nums = str.split(" ");

            Integer[] holder = new Integer[2];

            int hold;

            for(int x = 0; x < 2; x++) {

                hold = Integer.parseInt(nums[x]);
                holder[x] = hold;
            }

            int N = holder[0];
            int K = holder[1];

            /*
            System.out.println("Enter number of students: ");
            int N = Integer.parseInt(sc.nextLine());*/

            //create array of size N
            int[] students = new int[N];

           /* System.out.println("Enter expected number of students: ");
            int K = Integer.parseInt(sc.nextLine());*/

            System.out.println("Enter arrival times of each student");
/*            for(int j = 0; j < N; j++) {
                students[j] = sc.nextInt();
            }*/

            String next = sc.nextLine();

            String[] nextSplit = next.split(" ");

            int _a_item;

            for(int _a_i = 0; _a_i < N; _a_i++) {

                _a_item = Integer.parseInt(nextSplit[_a_i]);
                students[_a_i] = _a_item;
            }

            //calculate
            count = findNonPositive(students);

            if (count < K)
                result = "YES";
            else if(count >= K)
                result = "NO";

            arrayList.add(result);

        }

    for ( int i = 0; i < arrayList.size(); i++) {
        System.out.println(arrayList.get(i));
    }

    }


}
