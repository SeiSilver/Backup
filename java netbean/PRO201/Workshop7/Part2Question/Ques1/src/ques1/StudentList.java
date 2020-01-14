// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques1;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    private ArrayList<Student> ls = new ArrayList<Student>();

    public StudentList() {
        ls.add(new Student("1", "Spring", "Yue", "java"));
        ls.add(new Student("2", "Summer", "Dat", ".net"));
        ls.add(new Student("3", "Spring", "Anna", "c/c++"));
    }

    public void createStudent() {
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

    public void findAndSort() {
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

    public void UpdateAndDelete() {
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
                    i.setCourseName(courseName);
                    i.setId(id);
                    i.setSemester(semester);
                    i.setStudentName(studentName);
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

    public void report() {
        Collections.sort(ls);
        for (Student i : ls) {
            System.out.println(i);
        }
    }

    public ArrayList<Student> getLs() {
        return ls;
    }

    public void setLs(ArrayList<Student> ls) {
        this.ls = ls;
    }

}
