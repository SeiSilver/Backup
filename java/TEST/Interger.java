/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/

import java.util.Scanner;

class Manager {

    public static Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("======================= MENU =========================");
        System.out.printf("| 1. %-47s |\n", "");
        System.out.printf("| 2. %-47s |\n", "");
        System.out.printf("| 3. %-47s |\n", "");
        System.out.println("======================================================");
        System.out.print("Choose option: ");
    }

    public void manager() {
        int choice = 0;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Invalid selection");
                break;

            }
        } while (choice != 3);
    }

}