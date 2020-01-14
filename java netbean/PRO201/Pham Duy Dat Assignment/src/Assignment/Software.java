// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Assignment;

import java.text.DecimalFormat;

public class Software extends ShopItem {
    private int CDno;

    public Software() {
    }

    public Software(String id, String name, double price, int quantity, int CDno) {
        super(id, name, price, quantity);
        this.CDno = CDno;
    }

    public Software(int CDno) {
        this.CDno = CDno;
    }

    public int getCno() {
        return CDno;
    }

    public void setCno(int CDno) {
        this.CDno = CDno;
    }

    @Override
    public double transportingFee() {
        double temp = 0;
        if (getQuantity() <= 3)
            temp = 3.25;
        else if (getQuantity() > 3)
            temp = 3.25 + 1.25 * (getQuantity() - 3);
        return temp;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0#####");
        return String.format("%-15s %-20s %-10s %-10d CDno=%-10d", super.getId(), super.getName(),
                df.format(super.getPrice()), super.getQuantity(), getCno());
    }

}
