/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
*/

package J1SP0001;

import java.util.Random;
import java.util.Scanner;

public class bubblesort {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = arraylength();
        int[] arr = getarrayinput(n);
        printarray(arr, 0);
        BubbleSort(arr);
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

    public static void BubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
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
