// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop10.Part1.Ques2;

public class Flower {
    private String name;
    private double price;
    private String color;

    public Flower(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20f %-10s", name, price, color);
    }

}
