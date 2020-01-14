package HW.workshop4.Part1.Question3;

import java.util.Scanner;

// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

public class Manager {
    public static Scanner sc = new Scanner(System.in);
    public static Student[] studentlist = new Student[10];
    public static int count = 0;

    static void pause() {
        System.out.println("Press Enter to continue");
        sc.nextLine();
        sc.nextLine();
    }

    static void function1() {
        while (true) {
            System.out.print("Enter id: ");
            String id = Validation.checkInputString();
            System.out.print("Enter name student: ");
            String name = Validation.checkInputString();
            System.out.print("Enter semester: ");
            String semester = Validation.checkInputString();
            System.out.print("Enter name course: ");
            String course = Validation.checkInputCourse();

            studentlist[count] = new Student(id, name, semester, course);
            count++;

            System.out.print("Do you want to continue (Y/N): ");
            if (!Validation.checkInputYN()) {
                System.out.println("Add complete!");
                pause();
                return;
            }
        }
    }

    static void function2() {
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s|%-10s|%-5s\n", studentlist[i].getStudentName(), studentlist[i].getCourseName(),
                    studentlist[i].getSemester());
        }
        pause();
    }

    public static void menu() {
        System.out.println("==================================");
        System.out.println("| Options:                       |");
        System.out.println("| 1. Create                      |");
        System.out.println("| 2. Display                     |");
        System.out.println("| 3. Exit                        |");
        System.out.println("==================================");
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
        } while (choice != 3);
    }
}