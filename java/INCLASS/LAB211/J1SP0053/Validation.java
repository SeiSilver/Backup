package J1SP0053;

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
            if (res <= 0)
                throw new Exception();
            else
                return res;
        } catch (Exception e) {
            System.out.println("Please input a positive number greater than zero ");
            System.out.print("Please enter again: ");
            sc.nextLine();
            return checkInt();
        }
    }

    public static int checkArrayInt() {
        int res = 0;
        try {
            res = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Please input a number");
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
            System.out.println("A positive number");
            System.out.print("Enter again: ");
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
            System.out.println("Enter again\n");
            return checkInputString();
        }
        return res;
    }

    public static float checkFloat() {
        float res = 0;
        try {
            res = sc.nextFloat();
            if (res <= 0)
                throw new Exception();
            else
                return res;
        } catch (Exception e) {
            System.out.println("A positive number greater than 0.");
            System.out.print("Enter again: ");
            sc.nextLine();
            return checkInt();
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = Validation.checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N"))
                return false;
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}
