// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop5.Part1.Ques1;

public class Main {
    public static void main(String[] args) {
        Menu.manager();
        System.out.println("List oF phone number: " + "\n==========================");
        for (int i = 0; i < Menu.count; i++) {
            System.out.println(Menu.phonelist[i]);
        }

    }
}
