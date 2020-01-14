// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques3;

import java.util.*;

public class Ques3 {

    static boolean isAnagram(String A, String B) {
        // A will only keep words and number other special charaters will be removed
        // same as B

        char arrA[] = A.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        char arrB[] = B.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for (int i = 0; i < arrB.length; i++) {
            if (arrA[i] != arrB[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String a = scan.nextLine();
        System.out.println("Enter String 2: ");
        String b = scan.nextLine();

        scan.close();
        System.out.println((isAnagram(a, b)) ? "Is Anagrams" : "Not Anagrams");
    }
}
