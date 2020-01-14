// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Arraylist.Fruit2;

import java.util.*;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<Fruit> fruitlist = new ArrayList<Fruit>();

        Fruit f1 = new Fruit(1, "dragon fruit", "VN");
        Fruit f2 = new Fruit(2, "apple", "US");
        Fruit f3 = new Fruit(3, "banana", "JP");
        Fruit f4 = new Fruit(4, "Orange", "VN");

        fruitlist.add(f1);
        fruitlist.add(f2);
        fruitlist.add(f3);
        fruitlist.add(f4);

        for (Fruit i : fruitlist) {
            System.out.println(i);
        }

        System.out.println("======================");

        // Collections.sort(fruitlist);
    }
}
