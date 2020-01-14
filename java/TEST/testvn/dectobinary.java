package test;

import java.util.*;


public class dectobinary {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        int arr[] = new int[100];
        int dem =0;

        while ( n != 0 ) {
            arr[dem] = n%2;
            n=n/2;
            dem++;            
        }
        
        for (int i = dem-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        
        scanner.close();
    }
}
