// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop7.Part2Ques.Ques3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Book", "Sach");
        hm.put("Cen", "But");
        hm.put("Aragon", "rong");
        Manager m = new Manager();

        m.manager(hm);
    }
}
