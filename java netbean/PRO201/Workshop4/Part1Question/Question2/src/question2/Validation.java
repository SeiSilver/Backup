// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package question2;

public class Validation {

    public static String checkString() {
        AtomsDemo.sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String res = AtomsDemo.sc.nextLine();
        if (res.isEmpty()) {
            System.out.println("String cant be empty");
            System.out.println("Please enter again\n");
            return checkString();
        }
        return res;
    }

    public static Double checkDouble() {
        double res = AtomsDemo.sc.nextDouble();

        if (res < 0) {
            System.out.println("A positive number ");
            System.out.println("Please enter again\n");
            return checkDouble();
        }
        return res;
    }

    public static int checkInt() {
        int res = AtomsDemo.sc.nextInt();

        if (res < 0) {
            System.out.println("A positive number ");
            System.out.println("Please enter again\n");
            return checkInt();
        }
        return res;
    }

    public static boolean accept() {
        while (true) {
            String result = Validation.checkString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N"))
                return false;
        }
    }
}
