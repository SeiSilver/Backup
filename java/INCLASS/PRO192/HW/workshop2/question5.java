package HW.workshop2;

// nhap 1 cai mang global
// viet 1 function nhap mang 

import java.util.*;

public class question5 {
    static Scanner scan = new Scanner(System.in);

    public static int[] Input(int n) {
        int[] input = new int[n];
        for (int i = 0; i < n; i += 1) {
            System.out.print("Enter an element: ");
            input[i] = scan.nextInt();
        }
        return input;
    }
    private static boolean checkeven(int i, int input[]) {
        if (input[i] % 2 == 0) {
            return true;
        }
        return false;
    }

    private static boolean checkodd(int i, int input[]) {
        if (input[i] % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        int[] input = Input(n);

        int counteven = 0;
        int countodd = 0;

        System.out.println();
        for (int i = 0; i < n; i++) {
            if (checkodd(i, input)) {
                countodd++;
                System.out.println(input[i] + " is a Odd ");
            }

            else if ((checkeven(i, input))) {
                counteven++;
                System.out.println(input[i] + " is a Even");
            }
        }
        System.out.println();
        System.out.println("Number of odd: " + countodd + "\nNumber of Even: " + counteven);
        scan.close();
    }
}