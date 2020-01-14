package J1SP0050;

import java.util.Scanner;

public class Validation {
    public static Scanner sc = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = sc.nextInt();
                if (result < min || result > max) {
                    throw new Exception();
                } else
                    return result;
            } catch (Exception e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
                sc.nextLine();
            }
        }
    }

    public static int checkInt() {
        int res = 0;
        try {
            res = sc.nextInt();
        } catch (Exception e) {
            System.out.println("A positive number ");
            System.out.print("Please enter again: ");
            sc.nextLine();
            return checkInt();
        }
        return res;
    }

    public static double checkDouble() {
        double res = 0;
        try {
            res = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("A positive number ");
            System.out.print("Please enter again: ");
            sc.nextLine();
            return checkInt();
        }
        return res;
    }

    public static String checkInputString() {
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String res = sc.nextLine();
        if (res.isEmpty()) {
            System.out.println("String cant be empty");
            System.out.println("Please enter again\n");
            return checkInputString();
        }
        return res;
    }

}
