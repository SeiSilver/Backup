// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques2;

import java.text.DecimalFormat;

public class Worker extends Person {
    private double bSalary;
    private double rate;

    public Worker() {
    }

    public Worker(String name, double bSalary, double rate) {
        super(name);
        this.bSalary = bSalary;
        this.rate = rate;
    }

    public Worker(double bSalary, double rate) {
        this.bSalary = bSalary;
        this.rate = rate;
    }

    public Worker(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        DecimalFormat DF = new DecimalFormat("#.000");
        System.out.println("Salary: " + DF.format(getSalary()));
        System.out.println();
    }

    @Override
    public double getSalary() {
        return (double) bSalary * rate;
    }

    public Worker input() {
        System.out.print("Enter name: ");
        String n = Validation.checkInputString();
        System.out.print("Enter salary basic: ");
        double s = Validation.checkInputDouble();
        System.out.print("Enter rate: ");
        double r = Validation.checkInputDouble();
        Worker res = new Worker(n, s, r);
        return res;
    }

    @Override
    public String toString() {
        return "\nSalary = " + bSalary + "\nrate=" + rate;
    }

}
