// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop7.Part1Ques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
// import java.util.NavigableSet;
import java.util.Set;
// import java.util.TreeSet;

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
        // NavigableSet<Dictionary> sort1 = new TreeSet<Dictionary>(wlist);
        // sort1 = sort1.descendingSet();

        ArrayList<Dictionary> sortarr = new ArrayList<Dictionary>(wlist);
        Collections.sort(sortarr, Collections.reverseOrder());
        // sort1.sort(Comparator.comparing(Dictionary::getWord));
        // System.out.println("============================");

        // System.out.println(sort1);
        for (int i = 0; i < sortarr.size(); i++) {
            System.out.println((i + 1) + "." + sortarr.get(i));
        }
    }
}
