// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop5.Part2.Ques5;

public class Circle extends Shape {

    final double PI = 3.14;
    protected double radius = 1.0;

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

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: \n" + " PI = " + PI + "\nradius = " + radius + "\nArea = " + getArea() + "\nPerimeter = "
                + getPerimeter() + super.toString();
    }

}
