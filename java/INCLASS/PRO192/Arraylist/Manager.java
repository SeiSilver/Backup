// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package PRO192.Arraylist;

import java.util.Scanner;

public class Manager {

    public static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("======================= MENU =========================");
        System.out.println("| 1.                                                 |");
        System.out.println("| 2.                                                 |");
        System.out.println("| 3.                                                 |");
        System.out.println("======================================================");
        System.out.print("Choose option: ");
    }

    public static void manager() {
        int choice = 0;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
            case 1:

            case 2:

            case 3:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
        } while (choice != 3);
    }
}