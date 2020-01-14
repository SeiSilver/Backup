/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
*/

package J1SP0050;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void pause() {

        System.out.println("\nPress Enter to Continue!");
        sc.nextLine();
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        int choice = 0;
        do {
            m.menu();
            choice = Validation.checkInt();
            switch (choice) {
            case 1:
                m.SuperlativeEquation();
                break;
            case 2:
                m.QuadraticEquation();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            if (choice != 3)
                pause();
        } while (choice != 3);

    }
}
