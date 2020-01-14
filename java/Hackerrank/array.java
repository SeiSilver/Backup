package hackrank;

import java.util.*;

public class array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char arr[] = new char[100];
        int dem = 0;

        int n;
        n = scan.nextInt();
        String s[] = new String[n];

        System.out.println("Enter character array: ");
        for (int i = 0; i <= s.length; i++) {

            s[i] = scan.nextLine();
            for (int j = 0; j < s[i].length(); j++) {
                arr[j] = s[i].charAt(j);
                dem += 1;
            }
            for (int a = 0; a < dem; a++)
                System.out.print(arr[a]);
            System.out.println();
        }
        scan.close();
    }
}

// ----------------------------------------------------------------------

// import java.io.*;
// import java.math.*;
// import java.text.*;
// import java.util.*;
// import java.util.regex.*;

// public class array {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// int N = in.nextInt();

// in.nextLine();

// for (int i = 0; i < N; i++) {
// String string = in.nextLine();
// char[] charArray = string.toCharArray();

// for (int j = 0; j < charArray.length; j++) {
// if (j % 2 == 0) {
// System.out.print(charArray[j]);
// }
// System.out.print(charArray[j]);
// }

// System.out.print(" ");

// for (int j = 0; j < charArray.length; j++) {
// if (j % 2 != 0) {
// System.out.print(charArray[j]);
// }
// }

// System.out.println();
// }

// in.close();
// }
// }