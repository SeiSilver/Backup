package HW.workshop2;

import java.util.*;

public class Question2 {

    public static Scanner in = new Scanner(System.in);

    public static boolean check(String password) {
        int countDigits = 0;
        
        if (password.length() < 10) return false;

        for (int i = 0; i < password.length(); i++) {
            char check = password.charAt(i);
            if (isDigit(check)) countDigits += 1;
            else if (isLetter(check));
            else return false;
        }
        return (countDigits >= 2);
    }

    private static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }

    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static void main(String[] args) {
        System.out.print("1. A password must have at least eight characters.\n"
                + "2. A password consists of only letters and digits.\n"
                + "3. A password must contain at least two digits \n"
                + "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = in.nextLine();
        if (check(password))
            System.out.println("Password is valid: " + password);
        else
            System.out.println("Not a valid password: " + password);
        in.close();
    }
}