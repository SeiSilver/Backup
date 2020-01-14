// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop5.Part2.Ques3;

public class Circle extends Shape {

    private double radius = 1.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: \n" + "radius = " + radius + "\nArea = " + getArea() + "\nPerimeter = " + getPerimeter()
                + super.toString();
    }

}
