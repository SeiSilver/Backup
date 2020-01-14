// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package HW.workshop7.Part2Ques.Ques1;

import java.util.Scanner;

public class Manager {

    public Scanner sc = new Scanner(System.in);

    public void manager(StudentList ls) {
        int choice = 0;
        do {
            Menu m = new Menu();
            StudentList s = new StudentList();
            m.menu();
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                s.createStudent();
                break;
            case 2:
                s.findAndSort();
                break;
            case 3:
                s.UpdateAndDelete();
                break;
            case 4:
                s.report();
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