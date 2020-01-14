/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192.baitap3;

/**
 *
 * @author ASUS
 */
public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student() {
    }

    public Student(String program, int year, double fee) {
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public Student(String name, String birthday, String address, String program, int year, double fee) {
        super(name, birthday, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString() + " program=" + program + ", year=" + year + ", fee=" + fee;
    }

}
