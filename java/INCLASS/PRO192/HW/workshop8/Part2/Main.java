// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop8.Part2;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter fruit id: ");
            String fruitId = Validation.checkInputString();
            System.out.print("Enter fruit name: ");
            String fruitName = Validation.checkInputString();
            System.out.print("Enter price: ");
            double price = Validation.checkDouble();
            System.out.print("Enter quantity: ");
            int quantity = Validation.checkInt();
            System.out.print("Enter origin: ");
            String origin = Validation.checkInputString();
            System.out.printf("\n%-20s %-20s %-15s %-15s %-15s\n", "FruitId", "FruitName", "Price", "Quantity",
                    "Origin");
            System.out.printf("%-20s %-20s %-15f %-15d %-15s\n\n", fruitId, fruitName, price, quantity, origin);

            System.out.print("Want to continue (Y/N)? ");
            if (!Validation.checkInputYN())
                return;
        }
    }
}
