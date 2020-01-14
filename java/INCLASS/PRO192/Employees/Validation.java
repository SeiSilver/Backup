package PRO192.Employees;

public class Validation {

    public static String checkString() {
        Main.sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String res = Main.sc.nextLine();
        if (res.isEmpty()) {
            System.out.println("String cant be empty");
            System.out.println("Please enter again\n");
            return checkString();
        }
        return res;
    }

    public static Double checkDouble() {
        double res = Main.sc.nextDouble();

        if (res < 0) {
            System.out.println("This number must be a positive");
            System.out.println("Please enter again\n");
            return checkDouble();
        }
        return res;
    }

    public static int checkInt() {
        int res = Main.sc.nextInt();

        if (res < 0) {
            System.out.println("This number must be a positive");
            System.out.println("Please enter again\n");
            return checkInt();
        }
        return res;
    }
}
