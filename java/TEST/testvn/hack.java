package test;

import java.util.Scanner;

public class hack {
    public static boolean prime(int n) {
        int m = (int) Math.sqrt(n);
        if (n < 2)
            return false;
        for (int i = 2; i <= m; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void check(int prime[], int len) {
        int sum = 0;
        for (int i = 0; i < len; i++) {
            int c = 0;
            for (int j = i + 1; j < len; j++) {
                if (prime[j] - prime[i] == 6) {
                    sum++;
                    // System.out.println(prime[i] + " - " + prime[j]);
                    break;
                } else if (c == 3)
                    break;
                c++;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        scan.close();
        int[] prime = new int[1000000];
        int j = 0;
        for (int i = L; i <= R; i++) {
            if (prime(i)) {
                prime[j] = i;
                // System.out.println(prime(j));
                j++;
            }
        }
        for (int i = 0; i < prime.length; i++)
            System.out.println(prime[i]);
        check(prime, j);

        long finish = System.currentTimeMillis();
        System.out.println("\nTotal of executing time: " + (finish - start) + " ms" + " - "
                + (double) (finish - start) / 1000 + "s");
    }
}
// -------------------------------------------------------------------

// import java.util.Scanner;

// public class hack {
// public static boolean prime(int n) {
// int m = (int) Math.sqrt(n);
// if (n < 2)
// return false;
// for (int i = 2; i <= m; i++) {
// if (n % i == 0)
// return false;
// }
// return true;
// }

// public static int pairOfSpecialPrimes(int prime[]) {
// int count = 0;
// for (int i = 0; i < prime.length; i++) {
// for (int j = i + 1; j < prime.length; j++) {
// if (prime[j] - prime[i] == 6) {
// count++;
// break;
// }
// }
// }
// return count;
// }

// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// int L = scan.nextInt();
// int R = scan.nextInt();
// int[] prime = new int[R+1000];
// for (int i = L, j = 0; i <= R; i++) {
// if (prime(i)) {
// prime[j] = i;
// j++;
// }
// }
// System.out.println(pairOfSpecialPrimes(prime));
// }
// }
