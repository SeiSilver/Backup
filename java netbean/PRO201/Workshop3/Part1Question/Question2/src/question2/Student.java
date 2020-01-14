// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question2;

import java.time.LocalDate;

public class Student {

    private String name;
    private String studentId;
    private LocalDate birthDate;
    private String address;
    private String major;
    private double gpa;

    public Student(String name, String studentId, LocalDate dob, String address, String major, double gpa) {
        this.birthDate = dob;
        this.name = name;
        this.studentId = studentId;
        this.address = address;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printAllAttributes() {
        System.out.println("Student Name\t: " + name);
        System.out.println("ID\t\t: " + studentId);
        System.out.println("Birth\t\t: " + birthDate);
        System.out.println("Address\t\t: " + address);
        System.out.println("Major\t\t: " + major);
        System.err.println("Gpa\t\t: " + gpa);
    }
}
