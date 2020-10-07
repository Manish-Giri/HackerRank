package domains.algorithms.implementation.GradingStudents;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/**
 * HackerLand University has the following grading policy:
 *
 * Every student receives a  in the inclusive range from  to .
 * Any  less than  is a failing grade.
 * Sam is a professor at the university and likes to round each student's  according to these rules:
 *
 * If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
 * If the value of  is less than , no rounding occurs as the result will still be a failing grade.
 * Examples
 *
 *  round to  (85 - 84 is less than 3)
 *  do not round (result is less than 40)
 *  do not round (60 - 57 is 3 or higher)
 * Given the initial value of  for each of Sam's  students, write code to automate the rounding process.
 *
 * Function Description
 *
 * Complete the function gradingStudents in the editor below.
 *
 * gradingStudents has the following parameter(s):
 *
 * int grades[n]: the grades before rounding
 * Returns
 *
 * int[n]: the grades after rounding as appropriate
 * Input Format
 *
 * The first line contains a single integer, , the number of students.
 * Each line  of the  subsequent lines contains a single integer, .
 *
 * Constraints
 *
 * Sample Input 0
 *
 * 4
 * 73
 * 67
 * 38
 * 33
 * Sample Output 0
 *
 * 75
 * 67
 * 40
 * 33
 */

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(int n: grades) {
            result.add(calculateGrade(n));
        }
        return result;

    }

    private static int calculateGrade(int initial) {
        if (initial < 38) return initial;
        int grade = initial/5;
        int diff = ((grade+1)*5) - initial;
        if(diff < 3) {
            return (grade+1)*5;
        }
        return initial;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

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
