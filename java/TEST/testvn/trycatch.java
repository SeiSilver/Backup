// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package test;

import java.util.Scanner;

public class trycatch {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            double a = 1;
            double b = 0;
            double c = a / b;
            System.out.println(a + " / " + b + " = " + c);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
