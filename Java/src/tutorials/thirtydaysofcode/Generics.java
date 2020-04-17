package tutorials.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by manishgiri on 7/9/17.
 */
public class Generics<T> {

    private void printArray(T[] arr) {
        for(T element: arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Generics<Integer> intGenerics = new Generics<Integer>();
        Generics<String> stringGenerics = new Generics<String>();
        intGenerics.printArray( intArray  );
        stringGenerics.printArray( stringArray );
        if(Generics.class.getDeclaredMethods().length > 1){
            System.out.println("The Generics class should only have 1 method named printArray.");
        }
        
    }
}
