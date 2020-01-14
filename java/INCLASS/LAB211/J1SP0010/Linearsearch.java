/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
*/

package J1SP0010;

import java.util.Random;
import java.util.Scanner;

public class Linearsearch {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = arraylength();
        int search = searchinput();
        int[] arr = getarrayinput(n);

        printarray(arr);

        int res = BinarySearch(arr, search);

        if (res == -1)
            System.out.println(search + " doesn't exist!");
        else
            System.out.println("Found " + search + " at index: " + res);

    }

    public static int BinarySearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
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
        System.out.print("The array: ");

        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ((i == arr.length - 1) ? " " : ", "));
        }
        System.out.println("]");
    }

}
