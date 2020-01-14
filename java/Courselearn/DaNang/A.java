package Courselearn.DaNang;

// Name:Pham Duy Dat
// Class: SE140191
// ID: DE140191

import java.util.Scanner;

public class A {
    public static Scanner sc = new Scanner(System.in);

    public static boolean checkPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int save = 0;

    public static int makePrime(int n) {
        int res = 0;
        if (checkPrime(n))
            return n;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0)
                res += i;
        }
        if (checkPrime(res))
            return res;
        else {
            if (save == res)
                return -1;
            save = n;
            return makePrime(res);
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(makePrime(n));
    }
}
