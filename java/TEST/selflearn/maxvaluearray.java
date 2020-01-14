package selflearn;

import java.util.Scanner;

public class maxvaluearray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        int[][] myMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                myMatrix[i][j] = scanner.nextInt();
            }
        }

        int max = myMatrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (myMatrix[i][j] > max)
                    max = myMatrix[i][j];

            }
        }

        System.out.println("The max value is: " + max);
    }
}