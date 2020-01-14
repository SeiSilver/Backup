// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private ArrayList<ShopItem> store = new ArrayList<ShopItem>();

    public Store(ArrayList<ShopItem> store) {
        this.store = store;
    }

    public Store() {
        store.add(new Book("B_002", "No Game No Life", 10.616, 20, 56));
        store.add(new Book("B_001", "Manga", 6.2, 30, 40));
        store.add(new Book("B_003", "C/C++ basic", 25.69, 50, 100));
        store.add(new Software("S_003", "Microsoft10", 5, 6, 1));
        store.add(new Software("S_002", "Java Hacker", 2.12, 6, 4));
        store.add(new Software("S_001", "Monster Hunter", 38.36, 30, 2));
    }

    public ArrayList<ShopItem> getStore() {
        return store;
    }

    public void setStore(ArrayList<ShopItem> store) {
        this.store = store;
    }

    public void addItem() {
        String key = "";

        while (true) {
            System.out.println("Add Book or Software (B/S) ?");
            if (Validation.addSoftwareorBook()) {
                key = "S_";
            } else
                key = "B_";

            System.out.print("Enter id: ");

            StringBuilder sb = new StringBuilder(Validation.checkInputString());
            if ((sb.charAt(0) == 'B' || sb.charAt(0) == 'b' || sb.charAt(0) == 'S' || sb.charAt(0) == 's')
                    && sb.charAt(1) == '_') {
                sb.delete(0, 2);
            }
            String id = key + sb;
            System.out.print("Enter name: ");
            String name = Validation.checkInputString();
            System.out.print("Enter Price: ");
            Double price = Validation.checkDouble();
            System.out.print("Enter quantity: ");
            int quantity = Validation.checkInt();

            if (key.equalsIgnoreCase("B_")) {
                System.out.print("Enter Weight: ");
                Double weight = Validation.checkDouble();
                store.add(new Book(id, name, price, quantity, weight));
            } else if (key.equalsIgnoreCase("S_")) {
                System.out.print("Enter noCD: ");
                int noCD = Validation.checkInt();
                store.add(new Software(id, name, price, quantity, noCD));
            }

            System.out.print("Do you want to continue (Y/N): ");
            if (!Validation.checkInputYN()) {
                System.out.println("Add complete!");
                return;
            }
        }
    }

    public void remove() {
        System.out.print("Enter ID item want to remove: ");
        String remove = Validation.checkInputString();
        for (ShopItem i : store) {
            if (i.getId().equalsIgnoreCase(remove)) {
                store.remove(i);
                System.out.println("Remove complete!");
                return;
            }
        }
        System.out.println("ID not found - remove Fail!");

    }

    public void update() {
        System.out.print("Enter ID item want to update: ");
        String remove = Validation.checkInputString();

        for (ShopItem i : store) {
            if (i.getId().equalsIgnoreCase(remove)) {
                String key = "";
                if (i.getId().charAt(0) == 'B')
                    key = "B_";
                else
                    key = "S_";
                System.out.print("Enter id: ");
                StringBuilder sb = new StringBuilder(Validation.checkInputString());
                if ((sb.charAt(0) == 'B' || sb.charAt(0) == 'b' || sb.charAt(0) == 'S' || sb.charAt(0) == 's')
                        && sb.charAt(1) == '_') {
                    sb.delete(0, 2);
                }

                i.setId(key + sb);

                System.out.print("Enter name: ");
                i.setName(Validation.checkInputString());

                System.out.print("Enter Price: ");
                i.setPrice(Validation.checkDouble());

                System.out.print("Enter quantity: ");
                i.setQuantity(Validation.checkInt());

                if (key.equalsIgnoreCase("B_")) {
                    System.out.print("Enter Weight: ");
                    ((Book) i).setWeight(Validation.checkDouble());
                } else if (key.equalsIgnoreCase("S_")) {
                    System.out.print("Enter noCD: ");
                    ((Software) i).setCno(Validation.checkInt());
                }
                System.out.println("Update complete!");
                return;
            }
        }
        System.out.println("ID not found - Update Fail!");

    }

    public void displayList() {
        Collections.sort(store, Collections.reverseOrder());
        System.out.println("============================ Shop items ============================");
        System.out.printf("%-15s %-20s %-10s %-10s %-10s\n\n", "ID", "Name", "Price", "Quantity", "Detail");
        for (ShopItem i : store) {
            System.out.println(i);
        }
        System.out.println("====================================================================");

    }
}
