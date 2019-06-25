package algorithms.Warmup;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by manishgiri on 3/31/15.
 */
public class CutTheSticksTest2 {


    static Integer[] nums = {5,4,4,2,2,8};

    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(nums));

        System.out.println((list));

        list.removeAll(Arrays.asList(Integer.valueOf(2)));

        nums = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));





    }

}
