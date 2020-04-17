package tutorials.thirtydaysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by manishgiri on 6/5/16.
 */
public class Dictionaries {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.containsKey(s)) {
                System.out.println(s +"="+phoneBook.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
