// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques2;

public class Ques2 {

    public static void main(String[] args) {
        String name = "   Pham      Duy       Dat        ";
        System.out.println("String: " + name);

        name = name.replaceAll("( )+", " ").trim();
        System.out.println("String: " + name);

        System.out.println("The first Letter Words: " + getinitials(name));

    }

    private static String getinitials(String name) {
        String save[] = name.split(" ");
        String res = "";
        for (String i : save) {
            res += i.charAt(0);
        }
        return res;
    }
}
