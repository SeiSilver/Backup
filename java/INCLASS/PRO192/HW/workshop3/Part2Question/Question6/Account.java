package HW.workshop3.Part2Question.Question6;

public class Account {
    private int ID;
    private Customer customer;
    private double balance = 0;

    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public Customer getCus() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Amount withdraw exceeds the current balance!");
    }

    @Override
    public String toString() {
        return "AcountID = " + ID + "\nCustomer: " + customer + "\nBalance: " + balance;
    }

}
