/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
*/

package J1SP0006;

import java.util.Random;
import java.util.Scanner;

public class binarysearch {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = arraylength();
        int search = searchinput();
        int[] arr = getarrayinput(n);

        QuickSort(arr, 0, n - 1);
        printarray(arr);

        int res = BinarySearch(arr, 0, n - 1, search);
        if (res == -1)
            System.out.println(search + " doesn't exist!");
        else
            System.out.println("Found " + search + " at index: " + res);

    }

    public static int BinarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return BinarySearch(arr, l, mid - 1, x);

            return BinarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static int searchinput() {
        System.out.println("Enter search value: ");
        int n;
        try {
            n = sc.nextInt();
            return n;
        } catch (Exception e) {
            System.out.println("Please enter a number. ");
            System.out.print("Please try again: ");
            sc.nextLine();
        }
        return searchinput();
    }

    public static int arraylength() {
        System.out.print("Enter number of array: ");
        int n = 0;
        try {
            n = sc.nextInt();
            if (n >= 0)
                return n;
        } catch (Exception e) {
            System.out.println("Please enter a number. ");
            System.out.print("Please try again: ");
            sc.nextLine();
        }

        System.out.println("Please enter a positive number. ");
        return arraylength();
    }

    public static int[] getarrayinput(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(n);
        }
        return arr;
    }

    public static void printarray(int[] arr) {
        System.out.print("Sorted array: ");

        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ((i == arr.length - 1) ? " " : ", "));
        }
        System.out.println("]");
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int part = partition(arr, low, high);
            QuickSort(arr, low, part - 1);
            QuickSort(arr, part + 1, high);
        }
    }
}
