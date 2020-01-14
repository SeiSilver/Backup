/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
   status: notFinished
*/

package J1SP0055;

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
                m.addDoctor();
                break;
            case 2:
                m.updateDoctor();
                break;
            case 3:
                m.deleteDoctor();
                break;
            case 4:
                m.searchDoctor();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            if (choice != 5)
                pause();
        } while (choice != 5);

        m.displayall();
    }

}