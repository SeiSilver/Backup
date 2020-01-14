/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192.studentdriverr;

/**
 *
 * @author Quynh Tran Ly
 */
public class Student {

    // Atributed
    private String name;
    private String ID;
    private int year;
    private double marks;
    private Lecturer[] tea;

    // behavious

    // Constructor
    // public Student() {
    // }

    // public Student(String n, String id, int y, double m) {
    // name = n;
    // ID = id;
    // year = y;
    // marks = m;
    // }

    public Student(String name, String ID, int year, double marks, Lecturer[] t) {
        this.name = name;
        this.ID = ID;
        this.year = year;
        this.marks = marks;
        this.tea = t;
    }

    public Student() {
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    void goToUni() {
        System.out.println("Every morning, go to FPT");
    }

    double takeTest() {
        double result = 9;
        System.out.println("Final and mid-Term test");
        return result;
    }

    void sport() {
        System.out.println("Nhau");
    }

    void shopping() {
        System.out.println("Shopping");
    }

    void print() {
        System.out.println(name);
        System.out.println(ID);
        System.out.println(year);
        System.out.println(marks);
        System.out.println(tea[0]);
        System.out.println(tea[1]);
        System.out.println(tea[2]);
        System.out.println(tea[3]);
    }

    public String toString() {
        return name + " " + ID + " " + year + " " + marks;
    }

}
