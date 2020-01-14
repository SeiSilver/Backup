/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
*/

package J1SP0011;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void pause() {

        System.out.println("Press Enter to Continue!");
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
                m.BinaryConvert();
                break;

            case 2:
                m.DecimalConvert();
                break;

            case 3:
                m.HexadecimalConvert();
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            pause();
        } while (choice != 4);

    }
}
