// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop5.Part2.Ques4;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percent) {
        return super.getRadius() * percent / 100;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
