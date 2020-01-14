// name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
package question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, perimeter, area;
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        input.close();
    } 
}