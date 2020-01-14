package HW.workshop7.Part2Ques.Ques2;

import java.util.Scanner;

public class Validation {
    public Scanner sc = new Scanner(System.in);

    public String checkInputString() {
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String res = sc.nextLine();
        if (res.isEmpty()) {
            System.out.println("String cant be empty");
            System.out.println("Please enter again\n");
            return checkInputString();
        }
        return res;
    }

    public int checkInputIntLimit(int min, int max) {
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

    public boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N"))
                return false;
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    public Double checkDouble() {
        double res = sc.nextDouble();

        if (res < 0) {
            System.out.println("A positive number ");
            System.out.println("Please enter again\n");
            return checkDouble();
        }
        return res;
    }

    public int checkInt() {
        int res = sc.nextInt();

        if (res < 0) {
            System.out.println("A positive number ");
            System.out.println("Please enter again\n");
            return checkInt();
        }
        return res;
    }

    public String checkInputCourse() {
        while (true) {
            String result = checkInputString();

            if (result.equalsIgnoreCase("java") || result.equalsIgnoreCase(".net")
                    || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.err.println("There are only three courses: Java, .Net, C/C++");
            System.out.print("Enter again: ");
        }
    }

    public boolean CheckCouse(Course i, String search) {
        if (i.getId().equalsIgnoreCase(search)) {
            return true;
        }
        return false;
    }

    public boolean checkUpdateorDelete() {
        String result = checkInputString();
        if (result.equalsIgnoreCase("U")) {
            return true;
        } else if (result.equalsIgnoreCase("D"))
            return false;
        System.err.println("Please input U/u or D/n.");
        System.out.print("Enter again: ");

        return checkUpdateorDelete();
    }

}
