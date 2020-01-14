// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
package part1ques2;

import java.util.*;

public class Part1Ques2 {

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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Arr[%d] the element: ",i);
            arr[i] = scan.nextInt();
            if (arr[i] >= 100000) {
                System.out.println("Please enter a number under 100 000");
                i--;
            }
            System.out.println();
        }
        System.out.println("Array: ");
        print(arr, n);
        System.out.println("Array after sorted: ");
        int result[] = sort(arr, n);
        print(result, result.length);

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Maximum value in Array: " + max);
        System.out.println();

        scan.close();
    }
}