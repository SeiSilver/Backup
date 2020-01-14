// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question5;

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int iD, Customer customer, double amount) {
        ID = iD;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmountAfterDiscount() {
        return amount - amount * customer.getDiscount() / 100;
    }

    @Override
    public String toString() {
        return "Invoice [ID=" + ID + ", amount=" + getAmountAfterDiscount() + "," + customer + "]";
    }

}
