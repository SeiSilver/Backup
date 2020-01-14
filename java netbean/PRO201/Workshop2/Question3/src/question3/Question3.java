// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
package question3;

import java.util.*;

public class Question3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Input the starting number of the range: ");
        int min = in.nextInt();

        System.out.print("Input the ending number of the range: ");
        int max = in.nextInt();
        
        int random_num = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println(random_num);

        in.close();
    }
}