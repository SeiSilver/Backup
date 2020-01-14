// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques2;

public class Cylinder extends Cirle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: \n" + "height = " + height + super.toString() + "\nVolume = " + getVolume() + "\n";
    }

}
