// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package part2ques3;

import java.util.Scanner;

public class Part2Ques3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scan.nextDouble();
        System.out.println("Enter b: ");
        double b = scan.nextDouble();
        System.out.println("Enter c: ");
        double c = scan.nextDouble();
        equation(a, b, c);
        scan.close();
    }

    public static void equation(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (double) (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("x1 = %g\n", x1);
            System.out.printf("x2 = %g\n", x2);
        } else if (delta == 0) {
            double x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
            System.out.printf("x1 = x2 = %g\n", x1);
        } else {
            System.out.printf("The equation has no solution\n");
        }
    }
}
