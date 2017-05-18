package tutorials.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by manishgiri on 1/19/17.
 */
public class ScopeDifference {
    private int[] elements;
    public int maximumDifference;

    public ScopeDifference(int[] integers) {
        elements = integers;
    }

    private int findDifference(int a, int b) {
        return Math.abs(a - b);
    }

    /**
     * compute maximum difference between any two pair of integers from the
     * array elements
     */

    public void computeDifference() {
        ArrayList<Integer> differences = new ArrayList<>();
        for(int i = 0; i < elements.length - 1; i++) {
            for(int j = i + 1; j < elements.length; j++) {
                int difference = findDifference(elements[i],elements[j]);
                differences.add(difference);
            }
        }
        maximumDifference = Collections.max(differences);
        System.out.print(maximumDifference);
    }
}
