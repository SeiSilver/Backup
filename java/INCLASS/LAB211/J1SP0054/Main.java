/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/

package J1SP0054;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void pause() {

        System.out.println("\nPress Enter to Continue!");
        sc.nextLine();
    }

    public static void main(String[] args) {
        int choice = 0;
        Manager m = new Manager();
        do {
            m.menu();
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                m.addcontact();
                break;
            case 2:
                m.displayall();
                break;
            case 3:
                m.deletecontact();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            if (choice != 4)
                pause();
        } while (choice != 4);
    }

}