package domains.algorithms.Implementation.circulararrayrotation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    // T O(n)
    static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        // to avoid re-using same element
        List<Integer> copy = new ArrayList<>(a);

        // calculate final posn of each element using mod - O(n)
        for(int i = 0; i < copy.size(); i++) {
            int newPos = (i + k) % copy.size();
            a.set(newPos, copy.get(i));
        }

       /* List<Integer> res = new ArrayList<>();
        for(int idx: queries){
            if(idx < a.size()) {
                res.add(a.get(idx));
            }

        }
        return res;*/

        // USE STREAMS
        return queries.stream().map(a::get).collect(Collectors.toList());
    }

    // INEFFICIENT - causes TLE due to num of rotations, see modulus approach above
/*    static void rotate(List<Integer> nums) {
        int last = nums.get(nums.size()-1);
        for(int i = nums.size()-1; i > 0; i--) {
            nums.set(i, nums.get(i-1));
        }
        nums.set(0, last);
    }*/

}

/**
 * John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right one. To test Sherlock's abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.
 *
 * For each array, perform a number of right circular rotations and return the values of the elements at the given indices.
 *
 * <a href="https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true">...</a>
 */
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        int q = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> queries = IntStream.range(0, q).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.circularArrayRotation(a, k, queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
