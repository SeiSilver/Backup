/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/

package J1SP0053;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void pause() {

        System.out.println("\nPress Enter to Continue!");
        sc.nextLine();
    }

    public static void menu() {
        System.out.println("======================= MENU =========================");
        System.out.printf("| 1. %-47s |\n", "Input Element");
        System.out.printf("| 2. %-47s |\n", "Sort Ascending");
        System.out.printf("| 3. %-47s |\n", "Sort Descending");
        System.out.printf("| 4. %-47s |\n", "Exit");
        System.out.println("======================================================");
        System.out.print("Choose option: ");
    }

    public static void main(String[] args) {
        int arr[] = {};
        int n = 0;
        int choice = 0;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                arr = addInputarray(arr, n);
                n = arr.length;
                break;
            case 2:
                SortAscending(arr, n);
                break;
            case 3:
                SortDescending(arr, n);
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            if (choice != 4)
                pause();
        } while (choice != 4);
    }

    public static int[] addInputarray(int[] arr, int n) {
        System.out.println("Input Length Of Array");
        System.out.print("Enter Number: ");
        n = Validation.checkInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Number %d: ", i + 1);
            arr[i] = Validation.checkArrayInt();
        }
        return arr;
    }

    public static void SortAscending(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("[" + arr[i] + "]");
            if (i != arr.length - 1)
                System.out.print(" <- ");
        }
    }

    public static void SortDescending(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("[" + arr[i] + "]");
            if (i != n - 1)
                System.out.print(" -> ");
        }
    }
}