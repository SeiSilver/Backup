import java.util.Scanner;

public class Validation {
    public static Scanner sc = new Scanner(System.in);

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

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            int result = Integer.parseInt(sc.nextLine().trim());
            if (result >= min || result <= max) {
                return result;
            } else {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
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

    public static Double checkDouble() {
        double res = sc.nextDouble();

        if (res < 0) {
            System.out.println("A positive number ");
            System.out.println("Please enter again\n");
            return checkDouble();
        }
        return res;
    }

    public static int checkInt() {
        int res = sc.nextInt();

        if (res < 0) {
            System.out.println("A positive number ");
            System.out.println("Please enter again\n");
            return checkInt();
        }
        return res;
    }
}
