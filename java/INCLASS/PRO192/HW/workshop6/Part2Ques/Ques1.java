// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop6.Part2Ques;

public class Ques1 {
    public static void main(String[] args) {
        String str = "Java Exercises!";

        System.out.println("String: " + str);
        for (int i = 0; i < str.length(); i++)
            System.out.println("The character at position " + i + " is " + str.charAt(i));

        System.out.println("The character at position 0 is " + str.charAt(0));
        System.out.println("The character at position 10 is " + str.charAt(10));
    }
}
