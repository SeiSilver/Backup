// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop7.Part2QuesOld.Ques3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();

        ls.add(new Student("1", "Spring", "kong", "java"));
        ls.add(new Student("2", "Summer", "bat", ".net"));
        ls.add(new Student("3", "Spring", "ahoa", "c/c++"));

        Menu.manager(ls);
    }
}
