package domains.algorithms.Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;
/**
 * Created by manishgiri on 3/30/15.
 */
public class MaximizingXORSolution {

/*
 * Complete the function below.

 */

    static int max = 0;

    static int calcXor(int p, int q) {

        return p ^ q;
    }


    static int maxXor(int l, int r) {

        int xor;
        int a, b, i, j;
        int current = 0;
        j = r;

        for( i = l; i <= j; i++) {

            for(int k = i; k <= j; k++) {

                current = calcXor(i, k);
                if(current > max)
                    max = current;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }

}
