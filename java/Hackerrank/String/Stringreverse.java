// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package hackrank.String;

import java.util.*;

public class Stringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        sc.close();

        // String reversed = new StringBuilder(A).reverse().toString();
        String reversed = new StringBuffer(A).reverse().toString();
        System.out.println(A);
        System.out.println(reversed);
        System.out.println(A.equals(reversed) ? "Yes" : "No");
    }
}
