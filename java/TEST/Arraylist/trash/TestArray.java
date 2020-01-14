// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Arraylist.trash;

import java.util.*;

public class TestArray {
    public static void main(String[] args) {

        // LinkedList<String> staff = new LinkedList<String>();

        // staff.add("Sei");
        // staff.add("Dat");
        // staff.add("Anna");
        // staff.add("Mai");
        // staff.addFirst("1");
        // System.out.println(staff);

        // ListIterator<String> iterator = staff.listIterator();
        // iterator.next();
        // iterator.next();
        // iterator.add("Yue");
        // iterator.next();
        // System.out.println(staff);
        // iterator.remove();
        // iterator.previous();
        // iterator.add("Phong");
        // iterator.previous();
        // iterator.add("minh");

        // System.out.println(staff);

        List<Fruit> fruitlist = new ArrayList<Fruit>();

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
        // https://viblo.asia/p/java-8-comparator-lam-the-nao-de-sap-xep-list-m68Z0m29lkG?fbclid=IwAR3I8U8AaEepID6nT8ZhwSLnTe3qYhJwowvFKtxLHGzGpr6KU2-TfwRfYJs

    }
}
