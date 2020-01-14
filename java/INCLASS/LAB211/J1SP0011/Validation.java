package J1SP0011;

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

    public static String Binaryinput() {
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String res;
        try {
            res = sc.nextLine().trim();
            if (res.matches("[0-1]*"))
                return res;
            else
                throw new Exception();
        } catch (Exception e) {
            System.err.println("Must be enter 0 or 1");
            System.out.print("Enter again: ");
            return Binaryinput();
        }
    }

    public static String Hexainput() {
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String res;
        try {
            res = sc.nextLine().trim();
            if (res.matches("[0-9A-F]*") || res.matches("[0-9a-f]*"))
                return res;
            else
                throw new Exception();
        } catch (Exception e) {
            System.err.println("Must be enter 0-9 A-F");
            System.out.print("Enter again: ");
            return Hexainput();
        }
    }
}
