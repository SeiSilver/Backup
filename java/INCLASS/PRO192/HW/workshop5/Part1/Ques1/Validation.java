package HW.workshop5.Part1.Ques1;

import java.util.Scanner;

public class Validation {
    public static Scanner sc = new Scanner(System.in);
    private static final String VALID_PHONE = "[0-9]{3}[-][0-9]{3}[-][0-9]{4}";

    public static String checkInputString() {
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String res = sc.nextLine().trim();
        if (res.isEmpty()) {
            System.out.println("String cant be empty");
            System.out.println("Please enter again\n");
            return checkInputString();
        }
        return res;
    }

    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(VALID_PHONE)) {
                return result;
            }
            System.out.println("Please input Phone flow\n" + "• 123-456-7890 \n");
            System.out.print("Enter again: ");
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
