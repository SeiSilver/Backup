// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop3.Part1Question.Part4;

import java.util.*;

public class Fraction {
    public static Scanner sc = new Scanner(System.in);
    private int numer;
    private int denom;

    public Fraction(int num, int den) {
        this.numer = num;
        this.denom = den;
    }

    public Fraction() {
    }

    void simplify() {

        int gcd = findGCD(numer, denom);
        numer /= gcd;
        denom /= gcd;
    }

    int findGCD(int numer, int denom) {
        if (denom == 0)
            return numer;
        return findGCD(denom, numer % denom);
    }

    public int getNumer() {
        return numer;
    }

    public int getDenom() {
        return denom;
    }

    public void setNumer(int n) {
        this.numer = n;
    }

    public void setDenom(int n) {
        this.denom = n;
    }

    public int input() {
        System.out.print("Enter numerator (phan tu) : ");
        numer = sc.nextInt();

        System.out.print("Type denominator (phan mau) : ");
        denom = sc.nextInt();
        if (denom == 0) {
            System.out.println("Zero in The denominator is not allowed!\nPlease try again!");
            return input();
        }
        return 0;
    }

    public Fraction add(Fraction a, Fraction b) {
        Fraction result;

        result = new Fraction(a.getNumer() * b.getDenom() + b.getNumer() * a.getDenom(), a.getDenom() * b.getDenom());
        result.simplify();

        return result;
    }

    public Fraction subtract(Fraction a, Fraction b) {
        Fraction result;

        result = new Fraction(a.getNumer() * b.getDenom() - b.getNumer() * a.getDenom(), a.getDenom() * b.getDenom());
        result.simplify();

        return result;
    }

    public Fraction multiply(Fraction a, Fraction b) {
        Fraction result;

        result = new Fraction(a.getNumer() * b.getNumer(), a.getDenom() * b.getDenom());
        result.simplify();

        return result;
    }

    public Fraction divide(Fraction a, Fraction b) {
        Fraction result;

        result = new Fraction(a.getNumer() * b.getDenom(), a.getDenom() * b.getNumer());
        result.simplify();

        return result;
    }

    public void display() {
        System.out.println("Faction : " + numer + "/" + denom + "\n");
    }

    @Override
    public String toString() {
        return numer + "/" + denom;
    }

}