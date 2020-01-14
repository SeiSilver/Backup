// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package Assignment;

import java.util.Scanner;

public class Manager {

    public Scanner sc = new Scanner(System.in);

    public void manager(Store store, Basket basket) {
        int choice = 0;
        do {
            System.out.println("======================= MENU =========================");
            System.out.println("| 1. Admin                                           |");
            System.out.println("| 2. Customer                                        |");
            System.out.println("| 3. Exit                                            |");
            System.out.println("======================================================");
            System.out.print("Choose option: ");
            choice = Validation.checkInt();
            switch (choice) {
            case 1:
                Admin(store);
                break;
            case 2:
                Customer(store, basket);
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            System.out.println();
        } while (choice != 3);
    }

    public void Admin(Store store) {
        int choice;
        do {
            System.out.println("====================== MENU ==========================");
            System.out.println("| 1. Add a item                                      |");
            System.out.println("| 2. Display all item                                |");
            System.out.println("| 3. Update item                                     |");
            System.out.println("| 4. Remove item                                     |");
            System.out.println("| 5. Exit                                            |");
            System.out.println("======================================================");
            System.out.print("Choose option: ");
            choice = Validation.checkInt(); // xu ly chu
            switch (choice) {
            case 1:
                store.addItem();
                Management.WriteObjectFile(store.getStore(), "Assignment/Shoplist.txt");
                break;
            case 2:
                // store.displayList();
                Management.WriteObjectFile(store.getStore(), "Assignment/Shoplist.txt");
                Management.ReadOnly(store.getStore(), "Assignment/Shoplist.txt");
                break;
            case 3:
                store.update();
                Management.WriteObjectFile(store.getStore(), "Assignment/Shoplist.txt");
                break;
            case 4:
                store.remove();
                Management.WriteObjectFile(store.getStore(), "Assignment/Shoplist.txt");
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            System.out.println();
        } while (choice != 5);
    }

    public void Customer(Store store, Basket basket) {
        int choice;
        do {
            System.out.println("======================= MENU =========================");
            System.out.println("| 1. Add to Shopping Basket                          |");
            System.out.println("| 2. Display the Shopping Basket                     |");
            System.out.println("| 3. Remove Shopping Basket                          |");
            System.out.println("| 4. Print the Cart                                  |");
            System.out.println("| 5. Exit                                            |");
            System.out.println("======================================================");
            System.out.print("Choose option: ");
            choice = Validation.checkInt();
            switch (choice) {
            case 1:
                basket.addItem(store);
                Management.WriteObjectFile(basket.getBasket(), "Assignment/Basket.txt");
                break;
            case 2:
                // basket.ViewItems();
                Management.WriteObjectFile(basket.getBasket(), "Assignment/Basket.txt");
                Management.ReadOnly(basket.getBasket(), "Assignment/Basket.txt");
                break;
            case 3:
                basket.remove(store);
                Management.WriteObjectFile(basket.getBasket(), "Assignment/Basket.txt");
                break;
            case 4:
                basket.PrintInvoice();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            System.out.println();
        } while (choice != 5);
    }
}