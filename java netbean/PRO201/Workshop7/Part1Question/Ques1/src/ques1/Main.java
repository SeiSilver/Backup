// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Dictionary> wlist = new HashSet<Dictionary>();

        wlist.add(new Dictionary("burglar", "Breaks into a home to steal things"));
        wlist.add(new Dictionary("forger", "Makes an illegal copy of something"));
        wlist.add(new Dictionary("hacker", "Breaks into a computer syst"));
        wlist.add(new Dictionary("hijacker", "Takes control of an airplane"));
        wlist.add(new Dictionary("kidnapper", "Holds someone for ransom money"));
        wlist.add(new Dictionary("mugger", "Attacks and steals money from someone"));
        wlist.add(new Dictionary("murderer", "Kills another person"));
        wlist.add(new Dictionary("bank robber", "Steals money from a bank"));

        int c = 0;

        for (Dictionary i : wlist) {
            System.out.println((c + 1) + "." + i);
        }

        System.out.println("After Sorted!");

        ArrayList<Dictionary> sortarr = new ArrayList<Dictionary>(wlist);
        Collections.sort(sortarr, Collections.reverseOrder());

        for (int i = 0; i < sortarr.size(); i++) {
            System.out.println((i + 1) + "." + sortarr.get(i));
        }
    }
}
