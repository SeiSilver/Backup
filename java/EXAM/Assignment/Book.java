// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Assignment;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Book extends ShopItem implements Serializable {

    private static final long serialVersionUID = 1L;
    private double weight;

    public Book(String id, String name, double price, int quantity, double weight) {
        super(id, name, price, quantity);
        this.weight = weight;
    }

    public Book(double weight) {
        this.weight = weight;
    }

    public Book() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double transportingFee() {
        double temp = 0;
        if (getWeight() * super.getQuantity() < 500)
            temp += 5;
        else if (getWeight() * super.getQuantity() < 1000)
            temp += 9.5;
        else
            temp = 9.5 + ((int) (weight * super.getQuantity() / 1000)) * 7;

        return temp;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0#####");
        return String.format("%-15s %-20s %-10s %-10d Weight(g)=%-10s", super.getId(), super.getName(),
                df.format(getPrice()), super.getQuantity(), df.format(getWeight()));
    }

}
