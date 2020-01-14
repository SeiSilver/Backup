// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package HW.workshop5.Part1.Ques1;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    public static PhoneNumber[] phonelist = new PhoneNumber[10];
    public static int count = 0;

    public static void function1() {
        PhoneNumber p = new PhoneNumber();
        phonelist[count] = p.inputData();
        count++;

        System.out.println("Do you want to continue (y/n)?");
        if (Validation.checkInputYN()) {
            function1();
            System.out.println("Add complete!");
        }
    }

    public static void function2() {
        IntPhoneNumber p = new IntPhoneNumber();

        p = p.inputData();

        phonelist[count] = p;
        count++;

        System.out.println("Do you want to continue (y/n)?");
        if (Validation.checkInputYN()) {
            function2();
            System.out.println("Add complete!");
        }

    }

    public static void menu() {
        System.out.println("======================= MENU =========================");
        System.out.println("| 1. Local Phone                                     |");
        System.out.println("| 2. Inter phone number                              |");
        System.out.println("| 3. Exit                                            |");
        System.out.println("======================================================");
        System.out.println("Choose option: ");
    }

    public static void manager() {
        int choice = 0;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                function1();
                break;
            case 2:
                function2();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            System.out.println();
        } while (choice != 3);
    }
}