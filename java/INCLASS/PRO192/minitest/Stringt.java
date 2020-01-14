// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package PRO192.minitest;

import java.util.*;

public class Stringt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Str: ");
        String s = sc.nextLine();
        System.out.println(s);
        s = s.trim();
        System.out.println(s);
        System.out.println("Enter Age; ");
        int age = sc.nextInt();

        String w[] = s.split(" ");
        String pass = "";

        for (String a : w) {
            if (a.length() > 2) {
                pass += a.charAt(1);
            } else if (a.length() == 1) {
                pass += a.charAt(0);
            }
        }
        System.out.println("Password: ");
        pass += String.valueOf(age);
        System.out.println(pass);
        sc.close();
    }
}
