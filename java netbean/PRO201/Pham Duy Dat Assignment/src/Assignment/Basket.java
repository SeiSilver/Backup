// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Basket {
    protected ArrayList<ShopItem> basket = new ArrayList<ShopItem>();

    public Basket(ArrayList<ShopItem> basket) {
        this.basket = basket;
    }

    public Basket() {
    }

    public void addItem(Store store) {
        int stt = 0;
        store.displayList();

        System.out.print("Enter ID: ");
        String id = Validation.checkInputString();
        for (ShopItem i : store.getStore()) {
            if (i.getId().equalsIgnoreCase(id)) {

                if (i.getQuantity() <= 0) {
                    System.out.println("This product is sold out!");
                    return;
                }

                int quantity;
                System.out.print("Enter Quantity want to buy: ");
                do {
                    quantity = Validation.checkInt();
                    if (quantity > i.getQuantity())
                        System.out.print("Sorry we don't have enough quantity of this item!\nEnter Again: ");
                } while (quantity > i.getQuantity());

                if (i.getId().charAt(0) == 'B') {
                    basket.add(new Book(i.getId(), i.getName(), i.getPrice(), quantity, ((Book) i).getWeight()));
                } else
                    basket.add(new Software(i.getId(), i.getName(), i.getPrice(), quantity, ((Software) i).getCno()));

                i.setQuantity(i.getQuantity() - quantity);

                System.out.println("Add complete!");
                stt = 1;
                return;
            }
        }
        if (stt == 0)
            System.out.println("Item doesn't exit!");
    }

    public void remove(Store store) {
        ViewItems();
        System.out.print("Enter ID: ");
        String id = Validation.checkInputString();
        for (ShopItem i : basket) {
            if (i.getId().equalsIgnoreCase(id)) {
                for (ShopItem j : store.getStore()) {
                    if (j.getId().equalsIgnoreCase(id))
                        j.setQuantity(j.getQuantity() + i.getQuantity());
                }
                basket.remove(i);
                System.out.println("Remove complete!");
                return;
            }
        }
        System.out.println("ID doesn't exit in Basket!");
    }

    public void PrintInvoice() {
        Collections.sort(basket, Collections.reverseOrder());
        System.out.println("\n****************************** Basket ******************************");
        System.out.printf("%-15s %-20s %-10s %-10s %-10s\n\n", "ID", "Name", "Price", "Quantity", "Detail");
        for (ShopItem i : basket) {
            System.out.println(i);
        }
        double tfee = 0;
        double price = 0;
        for (ShopItem i : basket) {
            tfee += i.transportingFee();
            price += i.getPrice() * i.getQuantity();
        }
        System.out.println("Total price: " + price);
        System.out.println("Total of Transport Fee: " + tfee);
        System.out.println("Total of Price + Fee: " + (price + tfee));
        System.out.println("*************************************************************************");
    }

    public void ViewItems() {
        Collections.sort(basket, Collections.reverseOrder());
        System.out.println("\n****************************** Basket ******************************");
        System.out.printf("%-15s %-20s %-10s %-10s %-10s\n\n", "ID", "Name", "Price", "Quantity", "Detail");
        for (ShopItem i : basket) {
            System.out.println(i);
        }
        System.out.println("*************************************************************************\n");
    }

    @Override
    public String toString() {
        return "Basket [basket=" + basket + "]";
    }
}