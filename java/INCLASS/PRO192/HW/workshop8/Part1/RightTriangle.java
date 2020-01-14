// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop8.Part1;

public class RightTriangle {
    int side1;
    int side2;
    int side3;

    public RightTriangle(int side1, int side2, int side3)
            throws IllegalTriangleException, IllegalRightTriangleException {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)
            throw new IllegalTriangleException("This is not a triangle!");
        else if (side1 == Math.sqrt(Math.pow(side2, 2) + Math.pow(side3, 2))
                || side2 == Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2))
                || side3 == Math.sqrt(Math.pow(side2, 2) + Math.pow(side1, 2)))
            throw new IllegalRightTriangleException("This is a right triangle!");
        else
            throw new IllegalRightTriangleException("This is not a right triangle!");
    }

}
