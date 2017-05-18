package tutorials.thirtydaysofcode;

/**
 * Created by manishgiri on 1/11/17.
 */
public class InheritanceStudent extends InheritancePerson {

    private int[] testScores;

    //constructor
    InheritanceStudent(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        testScores = scores;

    }

    public char calculate() {
        int scoreSum = 0;
        char grade = 'A';
        for(int score: testScores) {
            scoreSum += score;
        }
        double average = (double) scoreSum / testScores.length;
        if(average >= 90 && average <= 100) {
            grade = 'O';
        }

        else if(average >= 80 && average < 90) {
            grade = 'E';
        }

        else if(average >= 70 && average < 80) {
            grade = 'A';
        }

        else if(average >= 55 && average < 70) {
            grade = 'P';
        }

        else if(average >= 40 && average < 55) {
            grade = 'D';
        }

        else if(average < 40) {
            grade = 'T';
        }
        //System.out.println(grade);
        return grade;
    }
}
