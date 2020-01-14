// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package part2ques2;

import java.util.Scanner;

public class Part2Ques2 {

    public static int check(String str) {
        int count = 0;
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ( c == 'A' || c == 'O' || c == 'I' || c == 'E' || c == 'U' ) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        System.out.println("String: " + str);
        System.out.println("The number of vowels in a string: " + check(str) );
        scan.close();
    }
}