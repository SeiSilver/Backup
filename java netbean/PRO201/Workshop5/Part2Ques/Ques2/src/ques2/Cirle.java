// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques2;

public class Cirle {
    private double radius = 1.0;
    private String color = "red";

    public Cirle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Cirle(double radius) {
        this.radius = radius;
    }

    public Cirle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "\ncolor = " + color + "\nradius = " + radius + "\nBase Area = " + getArea();
    }

}
