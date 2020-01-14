package PacticalExam2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        double res = 0;
        try {
            res = sc.nextDouble();
            return res;

        } catch (Exception e) {
            System.out.print("Please enter again: ");
            sc.nextLine();
            return checkDouble();
        }
    }

    public static int checkInt() {
        int res = 0;
        try {
            res = sc.nextInt();

            return res;
        } catch (Exception e) {
            System.out.print("Please enter again: ");
            sc.nextLine();
            return checkInt();
        }
    }

    public static String checkInputCode() {
        String result = checkInputString();
        if (result.length() != 4) {
            System.err.println("Tour's code must have 4 characters");
            System.out.print("Enter again: ");
            checkInputCode();
        }
        return result;
    }

    public static Date checkInputDate() {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String result = checkInputString();
        Date date = new Date();
        try {
            date = formater.parse(result);
        } catch (ParseException e) {
            System.err.println("Please input in format (dd/MM/yyyy)");
            System.out.print("Enter again: ");
            checkInputDate();
        }
        return date;
    }

    public static Date checkInputEndDate(Date endDate) {
        Date date = new Date();
        do {
            date = checkInputDate();
            if ((date.getTime() - endDate.getTime()) <= 0) {
                System.err.println("End date must later than start date");
                System.out.print("Enter again: ");
            }
        } while ((date.getTime() - endDate.getTime()) <= 0);
        return date;
    }

    public static String checkInputTransport() {
        String result;
        while (true) {
            System.out.print("Do you want to travel by airplane(Y/N): ");
            result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return "airplane";
            } else if (result.equalsIgnoreCase("N"))
                return "Other";
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}
