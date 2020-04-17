package langjava.introduction;

import java.time.LocalDate;
import java.util.Scanner;

public class DateAndTime {
    private static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
        LocalDate localDate = LocalDate.parse(year+"-"+month+"-"+day);
        return localDate.getDayOfWeek().toString();

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }

}
