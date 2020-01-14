package selflearn;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt(); //get sum from user input
        int difference = scanner.nextInt(); //get difference from user input

        int a = (sum + difference)/2;
        int b = a - difference;

        System.out.println(a);
        System.out.println(b);

        scanner.close();
    }
}
