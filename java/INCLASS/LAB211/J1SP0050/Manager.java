/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/

package J1SP0050;

import java.util.Scanner;

public class Manager {

    public static Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("======================= MENU =========================");
        System.out.printf("| 1. %-48s|\n", "Calculate Superlative Equation (ax + b = 0)");
        System.out.printf("| 2. %-48s|\n", "Calculate Quadratic Equation (ax^2 + bx + c = 0)");
        System.out.printf("| 3. %-48s|\n", "Exit.");
        System.out.println("======================================================");
        System.out.print("Choose option: ");
    }

    public void SuperlativeEquation() {
        System.out.println("\n----- Calculate Superlative Equation -----");
        System.out.print("Enter A: ");
        double a = Validation.checkInt();
        System.out.print("Enter B: ");
        double b = Validation.checkDouble();
        double x = -b / a;
        int solutionstt = 0;
        if (a == 0 && b == 0)
            System.out.println("Solution: x = infinite");
        else if (a == 0 && b != 0)
            System.out.println("No solution (x = null)");
        else {
            System.out.println("Solution: x = " + x);
            solutionstt = 1;
        }

        System.out.print("Number is even: ");
        int stt = 0;

        if (!checkOddOrEven(a)) {
            System.out.print(a);
            stt = 1;
        }

        if (!checkOddOrEven(b)) {
            if (stt == 1)
                System.out.print(", ");
            System.out.print(b);
            stt = 1;
        }
        if (solutionstt == 1)
            if (!checkOddOrEven(x)) {
                if (stt == 1)
                    System.out.print(", ");
                System.out.print(x);
            }

        System.out.print("\nNumber is odd: ");
        stt = 0;
        if (checkOddOrEven(a)) {
            System.out.print(a);
            stt = 1;
        }

        if (checkOddOrEven(b)) {
            if (stt == 1)
                System.out.print(", ");
            System.out.print(b);
            stt = 1;
        }
        if (solutionstt == 1)
            if (checkOddOrEven(x)) {
                if (stt == 1)
                    System.out.println(", ");
                System.out.print(x);
            }

        System.out.print("\nNumber is Perfect Square: ");
        stt = 0;

        if (checkSquareNumber(a)) {
            System.out.print(a);
            stt = 1;
        }

        if (checkSquareNumber(b)) {
            if (stt == 1)
                System.out.print(", ");
            System.out.print(b);
            stt = 1;
        }
        if (solutionstt == 1)
            if (checkSquareNumber(x)) {
                if (stt == 1)
                    System.out.print(", ");
                System.out.print(x);
            }

    }

    public void QuadraticEquation() {
        System.out.println("\n----- Calculate Quadratic Equation -----");
        System.out.println("Enter A: ");
        double a = Validation.checkDouble();
        System.out.println("Enter B: ");
        double b = Validation.checkDouble();
        System.out.println("Enter C: ");
        double c = Validation.checkDouble();

        double delta = b * b - 4 * a * c;
        double x1 = 0, x2 = 0;

        int solutionstt = 0;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            solutionstt = 1;
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            solutionstt = 1;
        }

        if (solutionstt == 1)
            System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        else
            System.out.println("No Solution (x1 = x2 = null)");

        System.out.print("Number is even: ");
        int stt = 0;

        if (!checkOddOrEven(a)) {
            System.out.print(a);
            stt = 1;
        }

        if (!checkOddOrEven(b)) {
            if (stt == 1)
                System.out.print(", ");
            System.out.print(b);
            stt = 1;
        }

        if (solutionstt == 1) {
            if (!checkOddOrEven(x1)) {
                if (stt == 1)
                    System.out.print(", ");
                System.out.print(x1);
            }
            if (!checkOddOrEven(x2)) {
                if (stt == 1)
                    System.out.print(", ");
                System.out.print(x2);
            }
        }

        System.out.print("\nNumber is odd: ");
        stt = 0;
        if (checkOddOrEven(a)) {
            System.out.print(a);
            stt = 1;
        }

        if (checkOddOrEven(b)) {
            if (stt == 1)
                System.out.print(", ");
            System.out.print(b);
            stt = 1;
        }

        if (checkOddOrEven(c)) {
            if (stt == 1)
                System.out.print(", ");
            System.out.print(c);
        }

        if (solutionstt == 1) {
            if (checkOddOrEven(x1)) {
                if (stt == 1)
                    System.out.print(", ");
                System.out.print(x1);
            }
            if (checkOddOrEven(x2)) {
                if (stt == 1)
                    System.out.print(", ");
                System.out.print(x2);
            }
        }

        System.out.print("\nNumber is Perfect Square: ");
        stt = 0;

        if (checkSquareNumber(a)) {
            System.out.print(a);
            stt = 1;
        }

        if (checkSquareNumber(b)) {
            if (stt == 1)
                System.out.print(", ");
            System.out.print(b);
            stt = 1;
        }

        if (solutionstt == 1) {
            if (!checkSquareNumber(x1)) {
                if (stt == 1)
                    System.out.print(", ");
                System.out.print(x1);
            }
            if (!checkSquareNumber(x2)) {
                if (stt == 1)
                    System.out.print(", ");
                System.out.print(x2);
            }
        }

    }

    public boolean checkOddOrEven(double check) {
        if (check % 2 == 0)
            return true;
        return false;
    }

    public boolean checkSquareNumber(double check) {
        double sn = Math.sqrt(check);
        if (sn - Math.floor(sn) == 0)
            return true;
        else
            return false;
    }

}