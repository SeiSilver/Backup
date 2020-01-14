// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Book", "Sach");
        hm.put("Pen", "But");
        hm.put("Dragon", "rong");
        Manager m = new Manager();

        m.manager(hm);
    }
}
