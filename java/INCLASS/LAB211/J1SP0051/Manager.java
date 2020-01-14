/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/

package J1SP0051;

import java.util.Scanner;

public class Manager {

    public static Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("======================= MENU =========================");
        System.out.printf("| 1. %-48s|\n", "Normal Calculator");
        System.out.printf("| 2. %-48s|\n", "BMI Calculator");
        System.out.printf("| 3. %-48s|\n", "Exit.");
        System.out.println("======================================================");
        System.out.print("Choose option: ");
    }

    public void NormalCalculator() {
        System.out.println("\n----- Normal Calculator -----");
        System.out.print("Enter number: ");
        double memory = Validation.checkDouble();
        while (true) {
            System.out.print("Enter Operator: ");
            String operator = Validation.checkOperator();
            switch (operator) {
            case "+":
                System.out.print("Enter number: ");
                memory += Validation.checkDouble();
                System.out.println("Memory: " + memory);
                break;
            case "-":
                System.out.print("Enter number: ");
                memory -= Validation.checkDouble();
                System.out.println("Memory: " + memory);
                break;
            case "/":
                System.out.print("Enter number: ");
                memory /= Validation.checkDouble();
                System.out.println("Memory: " + memory);
                break;
            case "^":
                System.out.print("Enter number: ");
                double n = Validation.checkDouble();
                memory = Math.pow(memory, n);
                System.out.println("Memory: " + memory);
                break;
            case "*":
                System.out.print("Enter number: ");
                memory *= Validation.checkDouble();
                System.out.println("Memory: " + memory);
                break;
            case "=":
                System.out.println("Result: " + memory);
                return;
            }
        }
    }

    public void BMICalculator() {
        System.out.println("\n----- BMI Calculator -----");
        System.out.print("Enter Weight(kg): ");
        double Weight = Validation.checkWeightAndHeight();
        System.out.print("Enter Height(cm): ");
        double Height = Validation.checkWeightAndHeight() / 100;
        double BMI = Weight / (Height * Height);
        System.out.printf("BMI Number: %.2f\n", BMI);
        System.out.println("BMI Status: " + Validation.checkStatus(BMI));
    }
}