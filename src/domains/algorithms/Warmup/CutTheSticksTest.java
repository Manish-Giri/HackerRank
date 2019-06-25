package domains.algorithms.Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user1 on 3/30/15.
 */
public class CutTheSticksTest {

    static Scanner sc = new Scanner(System.in);
static  int a[] = {5,4,4,2,2,8};
static ArrayList<Integer> al = new ArrayList<>();
    private static int findLowest(int[] arr) {

        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;

            }

            if (arr[i] < arr[i + 1]) {
                return arr[i];
            }
        }
        return  0;
    }

    public static void main(String[] args) {


        System.out.println("Enter the number of sticks: N");
        int N = sc.nextInt();

        int[] sticks = new int[N];

        System.out.println("Enter lengths of " + N + " sticks");
        for(int i = 0; i < N; i++) {
            sticks[i] = sc.nextInt();
        }

      //  ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(sticks));


        int length = sticks.length;

        while (length > 0) {


            int count = 0;

            for(int i = 0; i < length ; i++) {


                if (sticks[i] == 0) {
                    continue;
                }


            }





        }

/*
        int count = 0;

        for(int p = 0; p < a.length; p++) {

            int low = findLowest(a);

            if(a[p] == 0) {
                continue;
            }

            else {
                a[p] = a[p] - low;
                count++;
            }

            //result[p] = count;
           // System.out.println("Total number of non zero elements are: " + count);


            al.add(count);
        }

        System.out.println("Count is: " + count);

        for(Integer p: al){
            System.out.println(p);
        }


*/


        for(int x: a) {
            x = x-2;
        }

        int low = findLowest(a);
        System.out.println(low);


    }
}
