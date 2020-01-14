// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package part2ques4p2;

import java.util.Scanner;

public class Part2Ques4p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = { 5, 1, 4, 89, 100, 9, 10, 126, 896, 45, 0, 6, 2 };
        System.out.println("Array: ");
        print(arr, arr.length);

        System.out.println("How many smallest number you want: ");
        int k = scan.nextInt();

        arr = sort(arr, arr.length);
        for (int i = 0; i < k; i++) {
            System.out.printf("\nThe %d smallest elements: %d\n", i + 1, arr[i]);
        }
        scan.close();
        System.out.println();
    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static int[] sort(int arr[], int n) {
        int len = 100000; // len of a number;
        int store[] = new int[len];
        int sorted[] = new int[n];

        for (int i = 0; i < n; i++) {
            store[arr[i]] += 1;
        }

        for (int i = 0; i < len; i++) {
            if (i != 0)
                store[i] += store[i - 1];
        }

        for (int i = 0; i < n; i++) {
            sorted[store[arr[i]] - 1] = arr[i];
            store[arr[i]] -= 1;
        }

        return sorted;
    }

}
