/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
*/

package J1SP0004;

import java.util.Random;
import java.util.Scanner;

public class quicksort {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = arraylength();
        int[] arr = getarrayinput(n);
        printarray(arr, 0);
        QuickSort(arr, 0, n - 1);
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
}
