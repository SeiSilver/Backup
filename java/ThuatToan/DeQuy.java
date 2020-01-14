// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

public class DeQuy {

    // public static boolean con(String res, String[] str) {
    // int dem = 0;
    // int len = res.length();
    // for (int i = 0; i < str.length; i++) {
    // if (res.contains(str[i]) == false) {
    // return false;
    // }
    // }
    // return true;
    // }

    static int kq[] = new int[8], dd[] = new int[10];
    static int n = 0;
    static int prime[] = new int[50000];

    static int xuat() {
        // for (int i = 0; i < n; i++) {
        // System.out.println(kq[i]);
        // }
        String res = "";
        for (int j = 0; j < n; j++)
            res += String.valueOf(kq[j]);
        int n = Integer.valueOf(res);
        return n;
    }

    static void backtrack(int i, int[] arr) {
        if (i == n)
            System.out.println(xuat());
        for (int j = 0; j < arr.length; j++)
            if (dd[j] == 0) {
                dd[j] = 1;
                kq[i] = arr[j];
                backtrack(i + 1, arr);
                dd[j] = 0;
            }
    }

    public static void main(String[] args) {
        // String res[] = { "9", "9", "9", "9", "8", "3", "4" };
        int arr[] = { 7, 2, 5, 4 };
        n = 3;
        for (int i = 0; i < 10; i++)
            dd[i] = 0;
        backtrack(0, arr);

    }
}
