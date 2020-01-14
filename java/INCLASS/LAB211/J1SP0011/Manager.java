/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/

package J1SP0011;

import java.util.Scanner;

public class Manager {

    public static Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("Choose the base number input: ");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
        System.out.println("4. Exit");
        System.out.print("Choose option: ");
    }

    public int displayConvertMenu(String from, String to1, String to2) {
        System.out.println("1. Convert " + from + " to " + to1);
        System.out.println("2. Convert " + from + " to " + to2);
        System.out.print("Your choice: ");
        // sc.nextLine();
        return Validation.checkInputIntLimit(1, 2);
    }

    public void BinaryConvert() {
        String Binary;
        int opt = displayConvertMenu("Binary", "Decimal", "Hexadecimal");
        switch (opt) {
        case 1:
            System.out.print("Enter Binary want to convert: ");
            Binary = Validation.Binaryinput();
            System.out.println("Decimal = " + BinaryToDecimal(Binary));
            break;
        case 2:
            System.out.print("Enter Binary want to convert: ");
            Binary = Validation.Binaryinput();
            System.out.println("Hexadecimal = " + BinaryToHexadecimal(Binary));
            break;
        }
    }

    public int BinaryToDecimal(String Binary) {
        int decimal = Integer.parseInt(Binary, 2);
        return decimal;
    }

    public String BinaryToHexadecimal(String Binary) {
        int decimal = BinaryToDecimal(Binary);
        String Hexadecimal = Integer.toHexString(decimal).toUpperCase();
        return Hexadecimal;
    }

    public void DecimalConvert() {
        int decimal;
        int opt = displayConvertMenu("Decimal", "Binary", "Hexadecimal");
        switch (opt) {
        case 1:
            System.out.print("Enter Decimal want to convert: ");
            decimal = Validation.checkInt();
            System.out.println("Binary = " + DecimalToBinary(decimal));
            break;
        case 2:
            System.out.print("Enter Decimal want to convert: ");
            decimal = Validation.checkInt();
            System.out.println("Hexadecimal = " + DecimalToHexadecimal(decimal));

            break;
        }
    }

    public String DecimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public String DecimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public void HexadecimalConvert() {

        String Hexadecimal;
        int opt = displayConvertMenu("Decimal", "Binary", "Hexadecimal");
        switch (opt) {
        case 1:
            System.out.print("Enter Hexadecimal want to convert: ");
            Hexadecimal = Validation.Hexainput();
            System.out.println("Binary = " + HexadecimalToBinary(Hexadecimal));
            break;
        case 2:
            System.out.print("Enter Hexadecimal want to convert: ");
            Hexadecimal = Validation.Hexainput();
            System.out.println("Decimal = " + HexadecimalToDecimal(Hexadecimal));
            break;
        }
    }

    public String HexadecimalToBinary(String Hexadecimal) {
        int decimal = Integer.parseInt(Hexadecimal, 16);
        return Integer.toBinaryString(decimal);
    }

    public int HexadecimalToDecimal(String Hexadecimal) {
        return Integer.parseInt(Hexadecimal, 16);
    }

}