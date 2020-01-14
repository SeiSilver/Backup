// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop3.Part1Question.Part4;

public class Main {
    public static void main(String[] args) {

        Fraction d1 = new Fraction(3, 2);
        d1.display();

        Fraction d2 = new Fraction(6, 3);
        d2.display();

        Fraction res = new Fraction();
        System.out.println("Add \t: " + res.add(d1, d2));
        System.out.println("Subtract: " + res.subtract(d1, d2));
        System.out.println("Multiply: " + res.multiply(d1, d2));
        System.out.println("Divide \t: " + res.divide(d1, d2));
    }
}
