// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop7.Part2Ques.Ques2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CourseList {
    private ArrayList<Course> cl = new ArrayList<Course>();

    public Scanner sc = new Scanner(System.in);

    public Validation v = new Validation();

    public CourseList() {
        cl.add(new Course("Java", "FPR192", 3));
        cl.add(new Course("C", "hac", 1));
        cl.add(new Course("abd", "asac", 1));
        cl.add(new Course("C++", "asd", 2));
    }

    public void add() {
        while (true) {
            System.out.print("Enter Course ID: ");
            String id = v.checkInputString();
            System.out.print("Enter Course name: ");
            String name = v.checkInputString();
            System.out.print("Enter course Credit: ");
            int Credit = v.checkInt();
            cl.add(new Course(name, id, Credit));
            System.out.print("Do you want to continue (Y/N): ");
            if (!v.checkInputYN()) {
                System.out.println("Add complete!");
                return;
            }
        }
    }

    public void getCourseById() {
        int stt = 0;
        System.out.print("Enter Course ID you want to search: ");
        String search = v.checkInputString();

        for (Course i : cl) {
            if (v.CheckCouse(i, search)) {
                System.out.println("This course exit!");
                System.out.println("Information of the Course: ");
                System.out.println(i);
                stt = 1;
                break;
            }
        }

        if (stt == 0)
            System.out.println("This course doesn't exit!");
    }

    public void sort() {
        Collections.sort(cl, Collections.reverseOrder());
        System.out.printf("%-15s %-15s %-15s\n", "Course ID", "Course Name", "Course Credit");
        for (Course i : cl) {
            System.out.println(i);
        }
    }

    public void listall() {
        System.out.printf("%-15s %-15s %-15s\n", "Course ID", "Course Name", "Course Credit");
        for (Course i : cl) {
            System.out.println(i);
        }
    }

    public void Update() {
        int stt = 0;
        System.out.println("Enter Course ID you want to Update: ");
        String search = v.checkInputString();
        for (Course i : cl) {
            if (v.CheckCouse(i, search)) {
                System.out.println("This course exit!");
                stt = 1;
                System.out.println("UPDATE this course (y/n) ?");
                if (v.checkInputYN()) {
                    System.out.print("Enter Course ID: ");
                    String id = v.checkInputString();
                    System.out.print("Enter Course name: ");
                    String name = v.checkInputString();
                    System.out.print("Enter course Credit: ");
                    int credit = v.checkInt();
                    i.setCredit(credit);
                    i.setId(id);
                    i.setName(name);

                    System.out.println("Update complete!");
                }
                break;
            }
        }

        if (stt == 0) {
            System.out.println("This course doesn't exit!");
            return;
        }
    }

    public ArrayList<Course> getCl() {
        return cl;
    }

    public void setCl(ArrayList<Course> cl) {
        this.cl = cl;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

}
