// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques3;

public class Shape {
    private String color;
    private boolean filled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "\nShape: color = " + color + " - filled = " + filled + "\n";
    }

}
