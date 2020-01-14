package selflearn;

import java.util.Scanner;

/* 
public class tinhnamnhuan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt(); // get year from user input

        if (year % 100 == 0) {
            if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        scanner.close();
    }
}
 */

public class tinhnamnhuan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt(); //get year from user input
        
        String value = " is not a leap year";
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) value = " is a leap year";
        
        System.out.println(year + value);
        scanner.close();

    }
}