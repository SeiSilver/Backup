// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
package question4;

import java.util.*;;

public class Question4 {

    static void function1() {
    };

    static void function2() {
    };

    public static void pause() {
        Scanner p = new Scanner(System.in);
        System.out.print("Press Enter to continue . . . ");
        p.nextLine();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("============================");
            System.out.println("| MENU SELECTION DEMO |");
            System.out.println("============================");
            System.out.println("| Options:    |");
            System.out.println("| 1. Option 1 |");
            System.out.println("| 2. Option 2 |");
            System.out.println("| 3. Exit     |");
            System.out.println("============================");
            System.out.println("Choose option");
            choice = in.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 2:
                System.out.println("Option 2 selected");
                break;
            case 3:
                System.out.println("Exit selected");
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            if (choice != 3) {
                pause();
            }
        } while (choice != 3);
        in.close();
    }
}