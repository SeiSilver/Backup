package selflearn;

import java.util.Scanner;

public class nhapdata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("string:");

        String a = scanner.next(); // Read user input
        System.out.println("The number is: " + a);  // Output user input

        scanner.close();
    }

}