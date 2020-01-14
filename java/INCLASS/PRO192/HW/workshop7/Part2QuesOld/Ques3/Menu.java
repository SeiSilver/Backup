// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package HW.workshop7.Part2QuesOld.Ques3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {

    public static void createStudent(ArrayList<Student> ls) {
        while (true) {
            System.out.print("Enter id: ");
            String id = Validation.checkInputString();
            System.out.print("Enter name student: ");
            String studentName = Validation.checkInputString();
            System.out.print("Enter semester: ");
            String semester = Validation.checkInputString();
            System.out.print("Enter name course: ");
            String courseName = Validation.checkInputCourse();

            ls.add(new Student(id, semester, studentName, courseName));

            System.out.print("Do you want to continue (Y/N): ");
            if (!Validation.checkInputYN()) {
                System.out.println("Add complete!");
                return;
            }
        }
    }

    public static void findAndSort(ArrayList<Student> ls) {
        int stt = 0;
        System.out.println("Enter Student Name Or ID you want to search: ");
        String search = Validation.checkInputString();

        for (Student i : ls) {
            if (Validation.checkStudentExist(i, search)) {
                System.out.println(i);
                System.out.println("This Student exit!");
                stt = 1;
            }
        }

        if (stt == 0)
            System.out.println("Student doesn't exit!");

        System.out.println("========================");
        System.out.println("After Sorted: ");
        Collections.sort(ls);

        for (Student i : ls) {
            System.out.println(i);
        }

    }

    public static void UpdateAndDelete(ArrayList<Student> ls) {
        int stt = 0;
        System.out.println("Enter Student Name/ID you want to Update: ");
        String search = Validation.checkInputString();
        for (Student i : ls) {
            if (Validation.checkStudentExist(i, search)) {
                System.out.println("Student exit!");
                stt = 1;
                System.out.println("Do You want to UPDATE or DELETE this Student (U/D) ?");
                if (Validation.checkUpdateorDelete()) {
                    System.out.print("Enter id: ");
                    String id = Validation.checkInputString();
                    System.out.print("Enter name student: ");
                    String studentName = Validation.checkInputString();
                    System.out.print("Enter semester: ");
                    String semester = Validation.checkInputString();
                    System.out.print("Enter name course: ");
                    String courseName = Validation.checkInputCourse();
                    ls.add(new Student(id, semester, studentName, courseName));
                    System.out.println("Update complete!");
                } else {
                    ls.remove(i);
                    System.out.println("Delete complete!");
                }
                break;
            }
        }
        if (stt == 0) {
            System.out.println("Stundent doesn't exit!");
            return;
        }
    }

    public static void report(ArrayList<Student> ls) {

        for (Student i : ls) {
            Report in = new Report(i);
            System.out.println(in);
        }
    }

    public static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("======================= MENU ========================");
        System.out.println("| 1. Create                                          |");
        System.out.println("| 2. Find and Sort                                   |");
        System.out.println("| 3. Update/Delete                                   |");
        System.out.println("| 4. Report                                          |");
        System.out.println("| 5. Exit                                            |");
        System.out.println("======================================================");
        System.out.print("Choose option: ");
    }

    public static void manager(ArrayList<Student> ls) {
        int choice = 0;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                createStudent(ls);
                break;
            case 2:
                findAndSort(ls);
                break;
            case 3:
                UpdateAndDelete(ls);
                break;
            case 4:
                report(ls);
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