// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package ques2;

import java.util.Scanner;

public class Manager {

    public Scanner sc = new Scanner(System.in);

    public void manager() {
        CourseList cl = new CourseList();
        int choice = 0;
        Menu m = new Menu();
        do {
            m.menu();
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                cl.listall();
                break;
            case 2:
                cl.getCourseById();
                break;
            case 3:
                cl.add();
                break;
            case 4:
                cl.sort();
                break;
            case 5:
                cl.Update();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
        } while (choice != 0);
    }
}