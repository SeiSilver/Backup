// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question5;

public class Customer {

    private int ID;
    private String name;
    private int discount;

    public Customer(int iD, String name, int discount) {
        ID = iD;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer [ID=" + ID + ", discount=" + discount + ", name=" + name + "]";
    }

}
