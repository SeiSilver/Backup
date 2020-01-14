package hackrank.day;

import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        elements = a;
    }

    // public void computeDifference() {
    // int max = 0;
    // for (int i = 0; i < elements.length-1; i++) {
    // for (int j = i+1; j < elements.length; j++) {
    // int diff = Math.abs(elements[i] - elements[j]);
    // if (diff > max) max = diff;
    // }
    // }
    // maximumDifference = max;

    void computeDifference() {
        int max = Arrays.stream(elements).max().getAsInt();
        int min = Arrays.stream(elements).min().getAsInt();
        maximumDifference = max - min;
    }

}

public class day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}