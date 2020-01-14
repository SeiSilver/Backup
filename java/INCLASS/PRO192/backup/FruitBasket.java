/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192.backup;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class FruitBasket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ArrayList<Fruit> fruitBasket = new ArrayList<Fruit>();

        // fruitBasket.add(new Fruit(111, "Mango", "Viet nam"));
        // fruitBasket.add(new Fruit(111, "Banana", "Viet nam"));
        // fruitBasket.add(new Fruit(111, "Apple", "Viet nam"));
        // fruitBasket.add(new Fruit(111, "Lemon", "Viet nam"));

        // Cach 1:
        // for (int i = 0; i < fruitBasket.size(); i += 1)
        // if (fruitBasket.get(i).getName().equalsIgnoreCase("Apple"))
        // System.out.println(i + " : Apple");

        // Cach 2:
        // for (Fruit fruit : fruitBasket) {
        // System.out.println(fruit.getName());
        // }

        // Cach 3:
        // ListIterator ls = fruitBasket.listIterator();
        // while (ls.hasNext())
        // System.out.println(ls.next());
        // System.out.println();
        // while (ls.hasPrevious())
        // System.out.println(ls.previous());

        // System.out.println();
        // while (ls.hasPrevious())
        // System.out.println(ls.next());

        // LinkedList<String> staff = new LinkedList<String>();
        // staff.add("abc");
        // staff.add("xyz");
        // staff.add("lpk");
        // staff.addLast("lol");

        // staff.addLast("lol");
        // staff.addFirst("lmao");
        // staff.addLast("lol");

        // staff.add(2, "xxx");

        // // staff.remove();
        // // staff.remove();

        // // staff.remove("lol");
        // // staff.remove(2);

        // // staff.removeAll(staff);

        // ListIterator iter = staff.listIterator();

        // // iter.add(e);
        // while (iter.hasNext())
        // System.out.println(iter.next());

        ArrayList<Fruit> fruit = new ArrayList<Fruit>();
        fruit.add(new Fruit(111, "Mango", "Viet nam"));
        fruit.add(new Fruit(222, "Banana", "Viet nam"));
        fruit.add(new Fruit(333, "Apple", "Viet nam"));
        fruit.add(new Fruit(444, "Lemon", "Viet nam"));

        for (Fruit fr : fruit)
            System.out.println(fr);
        Collections.sort(fruit);
        for (Fruit fr : fruit)
            System.out.println(fr);
    }

}
