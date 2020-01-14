// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question2;

public class Account {

    private int id;
    private String name;
    private int balance = 0;

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance)
            this.balance -= amount;
        else
            System.out.println("Amount exceeded balance!");
        return balance;
    }

    public int transferTo(Account acc, int amount) {
        if (amount <= this.balance) {
            acc.credit(amount);
            debit(amount);
        } else
            System.out.println("Amount exceeded balance!");
        return balance;
    }

    @Override
    public String toString() {
        return "Account [Id = " + id + ", Name = " + name + ", Balance = " + balance + "]";
    }

}
