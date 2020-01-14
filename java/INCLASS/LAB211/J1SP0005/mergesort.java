/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
*/

package J1SP0005;

import java.util.Random;
import java.util.Scanner;

public class mergesort {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = arraylength();
        int[] arr = getarrayinput(n);
        printarray(arr, 0);
        MergeSort(arr, 0, n - 1);
        printarray(arr, 1);
    }

    public static int checkinput() {
        int n = 0;
        try {
            n = sc.nextInt();
            if (n >= 0)
                return n;
        } catch (Exception e) {
            System.out.println("Please enter a number. ");
            System.out.print("Please try again: ");
            sc.nextLine();
            return checkinput();
        }

        System.out.println("Please enter a positive number. ");
        System.out.print("Enter number of array: ");

        return checkinput();
    }

    public static int arraylength() {
        System.out.print("Enter number of array: ");
        int n = checkinput();
        return n;
    }

    public static int[] getarrayinput(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(n);
        }
        return arr;
    }

    public static void printarray(int[] arr, int stt) {
        if (stt == 0)
            System.out.print("Unsorted array: ");
        else
            System.out.print("Sorted array: ");

        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ((i == arr.length - 1) ? " " : ", "));
        }
        System.out.println("]");
    }

    public static void MergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);

            Merge(arr, l, m, r);
        }
    }

    private static void Merge(int[] arr, int l, int m, int r) {

        int L[] = new int[m - l + 1];
        int R[] = new int[r - m];

        /* Copy data to temp arrays */
        for (int i = 0; i < L.length; i++)
            L[i] = arr[l + i];

        for (int j = 0; j < R.length; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < L.length) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < R.length) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
