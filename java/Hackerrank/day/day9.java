package hackrank.day;

import java.util.*;

public class day9 {
    static int factorial(int n) {
        for (int i = n - 1; i > 0; i--) {
            n = n * i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        System.out.println(result);

        scanner.close();
    }
}
