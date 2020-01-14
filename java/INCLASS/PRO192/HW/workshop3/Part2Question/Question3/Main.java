// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop3.Part2Question.Question3;

public class Main {
    public static void main(String[] args) {

        InvoiceItem item1 = new InvoiceItem("I01", "Books", 600, 100);
        InvoiceItem item2 = new InvoiceItem("I02", "Car", 100, 120);

        System.out.println("Total of item 1: " + item1.getTotal());
        System.out.println("Total of item 2: " + item2.getTotal());

        System.out.println(item1);
        System.out.println(item2);
    }
}
