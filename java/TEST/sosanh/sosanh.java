package sosanh;

import java.util.Scanner;

public class sosanh {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // ...
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // get a from input
        int b = scanner.nextInt();

        System.out.println("a == b = " + (a == b)); // input result of left side
        System.out.println("a != b = " + (a != b)); // input result of left side
        System.out.println("a > b = " + (a > b)); // input result of left side
        System.out.println("a < b = " + (a < b)); // input result of left side
        System.out.println("b >= a = " + (b >= a)); // input result of left side
        System.out.println("b <= a = " + (b <= a)); // input result of left side

        long finish = System.currentTimeMillis();
        System.out.println("\nTotal of executing time: " + (finish - start) + " ms" + " --- " +(double) (finish - start) / 1000 + "s");
        scanner.close();
    }
}