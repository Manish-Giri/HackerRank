package domains.algorithms.Warmup.BirthdayCakeCandles;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
 * <p>
 * Example
 * <p>
 * <p>
 * The maximum height candles are  units high. There are  of them, so return .
 * <p>
 * Function Description
 * <p>
 * Complete the function birthdayCakeCandles in the editor below.
 * <p>
 * birthdayCakeCandles has the following parameter(s):
 * <p>
 * int candles[n]: the candle heights
 * Returns
 * <p>
 * int: the number of candles that are tallest
 * Input Format
 * <p>
 * The first line contains a single integer, , the size of .
 * The second line contains  space-separated integers, where each integer  describes the height of .
 * <p>
 * Constraints
 * <p>
 * Sample Input 0
 * <p>
 * 4
 * 3 2 1 3
 * Sample Output 0
 * <p>
 * 2
 * Explanation 0
 * <p>
 * Candle heights are . The tallest candles are  units, and there are  of them.
 */

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // use implemented method here
        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = candles.stream().max(Comparator.naturalOrder()).get();
        return (int) candles.stream().filter(i -> i == max).count();
    }

}
