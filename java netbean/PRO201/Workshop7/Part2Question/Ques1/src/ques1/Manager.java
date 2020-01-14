// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package ques1;

import java.util.Scanner;

public class Manager {

    public Scanner sc = new Scanner(System.in);

    public void manager(StudentList ls) {
        int choice = 0;
        do {
            Menu m = new Menu();
            m.menu();
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                ls.createStudent();
                break;
            case 2:
                ls.findAndSort();
                break;
            case 3:
                ls.UpdateAndDelete();
                break;
            case 4:
                ls.report();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
        } while (choice != 5);
    }
}