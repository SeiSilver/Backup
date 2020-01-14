package HW.workshop4.Part1.Question1;

public class Validation {

    public static String checkString() {
        MoleculesDemo.sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String res = MoleculesDemo.sc.nextLine();
        if (res.isEmpty()) {
            System.out.println("String cant be empty");
            System.out.println("Please enter again\n");
            return checkString();
        }
        return res;
    }

    public static Double checkDouble() {
        double res = MoleculesDemo.sc.nextDouble();

        if (res <= 0 || res > 0.01) {
            System.out.println("A positive, less than 0.01 floating point value ");
            System.out.println("Please enter again\n");
            return checkDouble();
        }
        return res;
    }
}
