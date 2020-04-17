package domains.datastructures.arrays;

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


public class DynamicArrays {

    static class Result {

        /*
         * Complete the 'dynamicArray' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. 2D_INTEGER_ARRAY queries
         */

        static int[] resizeArrayAndAppendValue(int[] source, int value) {
            // In case source array is not initialized, during first pass
            if(source == null) {
                source = new int[0];
            }
            int[] newArray = new int[source.length + 1];
            System.arraycopy(source, 0, newArray, 0, source.length);
            newArray[newArray.length-1] = value;
            return newArray;
        }

        static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
            // Write your code here
            int lastAnswer = 0, x, y, type, seq;
            int[][] sequenceList = new int[n][];

            List<Integer> answers = new ArrayList<>();
            List<Integer> currQuery;
            for(int i = 0; i < queries.size(); i++) {
                // get the current query
                currQuery = queries.get(i);
                type = currQuery.get(0);
                x = currQuery.get(1);
                y = currQuery.get(2);
                // find the type of query
                if(type == 1) {
                    seq = ((x ^ lastAnswer) % n);
                    sequenceList[seq] = resizeArrayAndAppendValue(sequenceList[seq], y);
                }
                else if(type == 2) {
                    seq = ((x ^ lastAnswer) % n);
                    int size = sequenceList[seq].length;
                    int elementIdx = (y % size);
                    lastAnswer = sequenceList[seq][elementIdx];
                    answers.add(lastAnswer);
                    // System.out.println(lastAnswer);
                }
            }
            return answers;
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);
        System.out.println(result);
        /*
        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();

         */
    }
}
