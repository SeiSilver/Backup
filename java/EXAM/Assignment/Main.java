// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Assignment;

// import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Basket basket = new Basket();
        Manager m = new Manager();
        m.manager(store, basket);
    }
}