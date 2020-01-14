package Courselearn.Codewar;

// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

public class A {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int arr[] = { 4, 7, 9, 3, 10, 11, 13 };

        int count = 0;

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                arr[i + 1] = arr[i] + 1;
                count++;
            }
            if (arr[i + 1] < arr[i + 2])
                i++;
        }

        System.out.println(count);

        long finish = System.currentTimeMillis();
        System.out.println("\nTotal of executing time: " + (finish - start) + " ms" + " - "
                + (double) (finish - start) / 1000 + "s");

    }
}
