// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop5.Part2.Ques4;

public class Circle implements GeometricObject {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: \nradius = " + radius + "\nPerimeter = " + getPerimeter() + "\nArea = " + getArea() + "\n";
    }

}
