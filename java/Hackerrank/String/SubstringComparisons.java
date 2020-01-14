package hackrank.String;

import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, k + i);
            if (smallest.compareTo(str) > 0)
                smallest = str;
            else if (largest.compareTo(str) < 0)
                largest = str;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        s = "welcometojava";
        int k = scan.nextInt();
        k = 3;
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}