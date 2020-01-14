// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package part2ques4;

import java.util.Scanner;

public class Part2Ques4 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(arr);
        System.out.println("Sum of array: "+sumarr(arr));
    }
    public static int sumarr(int[] arr) {
        int sum = 0;
        for (int i = 0 ; i < arr.length; i++) {
            sum+=arr[i]; 
        }
        return sum;
    }
    public static void print(int arr[]) {
        System.out.println("arr:");
        for (int i = 0 ; i < arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    
}
