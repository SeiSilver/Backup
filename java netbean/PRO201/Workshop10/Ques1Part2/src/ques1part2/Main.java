// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques1part2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        GenericFlower<Flower> g = new GenericFlower<>();

        g.setObj(new Flower("Rose", 6, "red"));
        g.add();
        g.setObj(new Flower("Sakura", 12, "Pink"));
        g.add();
        g.setObj(new Flower("Ruby", 1, "Ruby"));
        g.add();
        g.display();
        // System.out.println("After delete: ");
        // g.delete(1);
        // g.display();
        System.out.println();
        // g.sort();
        g.getA().sort(Comparator.comparingDouble(Flower::getPrice));
        g.display();
    }
}
