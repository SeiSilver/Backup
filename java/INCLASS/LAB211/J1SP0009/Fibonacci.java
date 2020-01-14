/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
*/

package J1SP0009;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci: ");
        fibonnacifunction(45, 0, 1);

        System.out.println();

    }

    public static int fibonnacifunction(int n, int l, int h) {
        if (n < 1) {
            return 0;
        }
        System.out.print(l);
        if (n > 1) {
            System.out.print(", ");
        }
        return fibonnacifunction(--n, h, h + l);
    }
}
