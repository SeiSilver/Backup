// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Courselearn.Codewar;
import java.util.Arrays;

public class testE {

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

    // public static int printMaxNum(int[] num) {
    // int count[] = new int[10];
    // int len = num.length;
    // String str = "";
    // for (int i = 0; i < len; i++)
    // str += Integer.toString(num[i]);

    // int lenstr = str.length();
    // for (int i = 0; i < lenstr; i++)
    // count[str.charAt(i) - '0']++;

    // int result = 0, multiplier = 1;

    // for (int i = 0; i <= 9; i++) {
    // while (count[i] > 0) {
    // result = result + (i * multiplier);
    // count[i]--;
    // multiplier = multiplier * 10;
    // }
    // }

    // return result;
    // }

    public static String[] remove(String str[], int xoa, int len) {
        for (int i = xoa; i < len - 1; i++) {
            str[i] = str[i + 1];
        }
        return str;
    }

    public static boolean con(String[] save, String[] str) {
        int len = str.length;
        int savelen = save.length;

        for (int i = 0; i < savelen; i++) {
            int stt = 0;
            for (int j = 0; j < len; j++) {
                if (save[i].equals(str[j])) {
                    str = remove(str, j, len);
                    len--;
                    stt = 1;
                    break;
                }
            }
            if (stt == 0)
                return false;
        }
        return true;
    }

    public static boolean check(int[] n, int a) {
        String str[] = new String[n.length];
        int nlen = n.length;
        for (int i = 0; i < nlen; i++) {
            str[i] = String.valueOf(n[i]);
        }
        String res = String.valueOf(a);
        String save[] = new String[res.length()];
        int reslen = res.length();
        for (int i = 0; i < reslen; i++) {
            save[i] = Character.toString(res.charAt(i));
        }

        return con(save, str);
    }

    // static int findTheLargestPrime(int[] n) {
    // int res = -1;
    // // int max = Arrays.stream(n).max().getAsInt();
    // int num = printMaxNum(n);
    // // for (int i = 0; i < nl; i++) {
    // // if (!prime(n[i]))
    // // count++;
    // // }
    // // int min = Arrays.stream(n).min().getAsInt();

    // for (int i = num; i >= 2; i -= 1) {
    // // int len = (int) (Math.floor(Math.log10(Math.abs(num))) + 1);
    // if (prime(i)) {
    // if (check(n, i)) {
    // return i;
    // }
    // }

    // }
    // return res;
    // }

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
            // System.out.println(xuat(n));
            // return true;
            xuat(n);
        }
        for (int j = 0; j < arr.length; j++)
            if (dd[j] == 0) {
                dd[j] = 1;
                kq[i] = arr[j];
                backtrack(i + 1, arr, n);
                dd[j] = 0;
            }
        // return false;
    }

    static int findTheLargestPrime(int[] n) {
        int res = -1;
        int len = n.length;
        while (len > 0) {
            backtrack(0, n, len);
            // {
            // return xuat(len);
            // }
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