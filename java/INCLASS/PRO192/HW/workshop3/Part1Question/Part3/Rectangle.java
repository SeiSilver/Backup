// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop3.Part1Question.Part3;

import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;
    private static Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("enter width: ");
        this.width = sc.nextDouble();
        System.out.print("enter height: ");
        this.height = sc.nextDouble();
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double caculateArea() {
        return width * height;
    }

    public double caculatePerimeter() {
        return (2 * (width + height));
    }

    public void display() {
        System.out.println("\nWidth= " + width + "\tHeight= " + height + "\nArea:" + caculateArea() + "\nPerimeter:"
                + caculatePerimeter());
    }

    @Override
    public String toString() {
        return "\nWidth= " + width + "\tHeight= " + height + "\nArea:" + caculateArea() + "\nPerimeter:"
                + caculatePerimeter() + "\n";
    }
}
