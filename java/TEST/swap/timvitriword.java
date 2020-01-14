package swap;

import java.util.Scanner;

public class timvitriword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString1 = scanner.nextLine(); //get string1 from user input
        String myString2 = scanner.nextLine(); //get string2 from user input
        scanner.close();
        int index;
        index = myString1.toLowerCase().indexOf(myString2.toLowerCase());

        System.out.println(index);
    }

}