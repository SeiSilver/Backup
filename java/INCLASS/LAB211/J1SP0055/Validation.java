package J1SP0055;

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
            if (res < 0)
                throw new Exception();
            else
                return res;
        } catch (Exception e) {
            System.out.println("Please Enter a positive number");
            System.out.print("Enter again: ");
            sc.nextLine();
            return checkInt();
        }
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

    public static boolean checkInputYN() {
        System.out.print("Want to continue (Y/N) ? ");
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

    public static final String VALID_PHONE = "\\d{10}|" + "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}|"
            + "\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}|" + "\\(\\d{3}\\)-\\d{3}-\\d{4}";

    public static String checkPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(VALID_PHONE)) {
                return result;
            }
            System.err.println("Please input Phone flow\n" + "• 1234567890\n" + "• 123-456-7890 \n"
                    + "• 123-456-7890 x1234\n" + "• 123-456-7890 ext1234\n" + "• (123)-456-7890\n" + "• 123.456.7890\n"
                    + "• 123 456 7890");
            System.out.print("Enter again: ");
        }
    }
}
