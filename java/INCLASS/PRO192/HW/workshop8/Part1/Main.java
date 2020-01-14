// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop8.Part1;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        while (true) {
            System.out.print("Enter a: ");
            a = Validation.checkInt();
            System.out.print("Enter b: ");
            b = Validation.checkInt();
            System.out.print("Enter c: ");
            c = Validation.checkInt();

            try {
                @SuppressWarnings("unused") // tat spawn warning test ko su dung
                RightTriangle test = new RightTriangle(a, b, c);
            } catch (IllegalRightTriangleException | IllegalTriangleException e) {
                System.out.println(e);
            }
            System.out.print("Do you want to continue (Y/N)? : ");
            if (!Validation.checkInputYN())
                return;
            System.out.println();
        }
    }
}
