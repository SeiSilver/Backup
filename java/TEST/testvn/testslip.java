package test;

import java.util.Scanner;

public class testslip {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // int[][] arr = new int[6][6];

        String[] arrRowItems = scanner.nextLine().split(" ");

        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(arrRowItems);
    }
}