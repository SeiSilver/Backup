// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Courselearn.Codewar;

import java.util.Arrays;

public class E {

    static boolean prime(int n) {
        int m = (int) Math.sqrt(n);
        if (n < 2)
            return false;
        for (int i = 2; i <= m; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int kq[] = new int[8], dd[] = new int[10];
    static int prime[] = new int[50000];
    static int cc = 0;

    static void xuat(int n) {
        String res = "";
        for (int j = 0; j < n; j++)
            res += String.valueOf(kq[j]);
        int r = Integer.valueOf(res);
        if (prime(r)) {
            prime[cc] = r;
            cc++;
        }
    }

    static void backtrack(int i, int[] arr, int n) {
        if (i == n) {
            xuat(n);
        }
        for (int j = 0; j < arr.length; j++)
            if (dd[j] == 0) {
                dd[j] = 1;
                kq[i] = arr[j];
                backtrack(i + 1, arr, n);
                dd[j] = 0;
            }
    }

    static int findTheLargestPrime(int[] n) {
        int res = -1;
        int len = n.length;
        while (len > 0) {
            backtrack(0, n, len);
            len--;
        }
        int max = Arrays.stream(prime).max().getAsInt();
        if (max != 0)
            return max;
        return res;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n[] = { 7, 2, 5, 4 }; // 87762421
        for (int i = 0; i < cc; i++) {
            System.out.println(prime[i]);
        }

        System.out.println(findTheLargestPrime(n));

        long finish = System.currentTimeMillis();
        System.out.println("\nTotal of executing time: " + (finish - start) + " ms" + " - "
                + (double) (finish - start) / 1000 + "s");

    }
}