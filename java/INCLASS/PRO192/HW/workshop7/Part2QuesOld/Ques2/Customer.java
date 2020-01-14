// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop7.Part2QuesOld.Ques2;

public class Customer {
    int roll;
    String name;
    int marks;
    long phone;

    public Customer(int roll, String name, int marks, long phone) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", marks=" + marks + ", phone=" + phone + ", roll=" + roll + "]";
    }

}
