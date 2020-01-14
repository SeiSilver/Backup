package hackrank.String;

import java.util.Arrays;

// kiem tra xem string co chua gia tri giong nhau

import java.util.Scanner;

public class anagram {

    static boolean isAnagram(String A, String B) {
        A = A.toLowerCase();
        B = B.toLowerCase();

        char[] charA = A.toCharArray(); // convert String to array char
        Arrays.sort(charA);
        char[] charB = B.toCharArray();
        Arrays.sort(charB); // Collections.sort() is use to sort list of String
        String a = new String(charA); // conver list of char to String
        String b = new String(charB); //

        if (a.equals(b)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
