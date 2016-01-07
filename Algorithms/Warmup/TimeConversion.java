package algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by manishgiri on 1/6/16.
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] parts = time.split(":");
        for(String part: parts){
            System.out.println(part);
        }
        int hours = Integer.parseInt(parts[0]);
        String minutes = (parts[1]);


        String seconds = parts[2].substring(0,2);
        String timeZ = parts[2].substring(2);

       // String[] last = parts[2].split("");

        //String seconds = last[0]+last[1];
        //String timeZ = last[2]+last[3];
        String finalHour = "";
        if(timeZ.equalsIgnoreCase("PM")) {
            if(hours == 12) {
                finalHour = Integer.toString(12);
            }
            else {
                finalHour = Integer.toString(hours + 12);
            }
        }
        else if(timeZ.equalsIgnoreCase("AM")) {
            if(hours == 12) {
                finalHour = "00";
            }
            else if(hours == 10 || hours == 11) {
                finalHour = Integer.toString(hours);
            }
            else {
                finalHour = "0"+hours;
            }
        }
        System.out.println(finalHour+":"+minutes+":"+seconds);


    }
}