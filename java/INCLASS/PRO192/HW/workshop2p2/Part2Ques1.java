// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package HW.workshop2p2;

import java.util.Scanner;

public class Part2Ques1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Number: ");
        double first = scan.nextDouble();
        System.out.println("Second Number: ");
        double Second = scan.nextDouble();
        System.out.println("Third Number: ");
        double Third = scan.nextDouble();
        double aver = average(first,Second,Third);
        System.out.println("Average = "+aver);
        scan.close();
    }

    private static double average(double first, double second, double third) {
        return (first + second + third)/3 ;
    }
}