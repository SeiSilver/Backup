// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
package question5;

import java.util.Scanner;

public class Question5 {
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
        return input[i] % 2 == 0;
    }

    private static boolean checkodd(int i, int input[]) {
        return input[i] % 2 != 0;
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