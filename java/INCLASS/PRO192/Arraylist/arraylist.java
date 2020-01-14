// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package PRO192.Arraylist;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        // ArrayList<Integer> al = new ArrayList<Integer>();
        // al.add(1);
        // al.add(7);
        // al.add(2);
        // al.add(3);
        // System.out.println(al);
        // al.remove(2);
        ArrayList<Lecture> al = new ArrayList<Lecture>();
        String cclass[] = { "se1403", "se1401" };
        Lecture l1 = new Lecture(11, "dat", "It", cclass);
        Lecture l2 = new Lecture(0, "sei", "It", cclass);
        Lecture l3 = new Lecture(2, "ana", "It", cclass);
        // Lecture sc[] = new Lecture[3];

        // for (int i = 0; i < 3; i++)
        // al.add()
        al.add(l1);
        al.add(l2);
        al.add(l3);
        System.out.println(al + "\n================");
        al.remove(l1);
        System.out.println(al);

    }
}
