// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques3;

public class Square extends Rectangle {

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square() {
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public double getArea() {
        return super.getLength() * super.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (super.getLength() + super.getWidth());
    }

    @Override
    public String toString() {
        return "Square: \n" + "size = " + super.getLength() + "\nArea = " + getArea() + "\nPerimeter = "
                + getPerimeter() + "\nshape: color = " + super.getColor() + " - filled = " + super.isFilled() + "\n";
    }

}
