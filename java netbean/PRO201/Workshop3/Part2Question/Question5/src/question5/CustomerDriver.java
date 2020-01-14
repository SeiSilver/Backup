// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question5;

public class CustomerDriver {
    public static void main(String[] args) {
        Customer cus1 = new Customer(1, "Dat", 4);
        Customer cus2 = new Customer(2, "Sei", 3);
        Invoice in1 = new Invoice(200, cus1, 240);
        Invoice in2 = new Invoice(100, cus2, 340);
        System.out.println(in1);
        System.out.println(in2);
    }
}
