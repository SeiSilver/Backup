package trenlop;

import java.util.Scanner;

public class nhapdata {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String fullname = input.nextLine();
        System.out.print("\nEnter Name: ");
        String name = input.nextLine();
        System.out.print("\nEnter Age: ");
        int age = input.nextInt();
        System.out.print("\nEnter Salary: ");
        int salary = input.nextInt();
        System.out.print("\nEnter gender (true = Male/ false = Female): ");
        input.nextLine();
        boolean gender = input.nextBoolean();
        System.out.print("\nEnter Family Status: ");
        input.nextLine();
        String status = input.nextLine();
        System.out.println("Fullname: " + fullname );
        System.out.println("Name: " + name );
        System.out.println("Age: " + age );
        System.out.println("Salary: " + salary );
        // System.out.println("Gender: " + (gender.toUpperCase() == "TRUE" ? "Male" : "Female" ) );
        System.out.println("Gender: " + (gender == true ? "Male" : "Female" ) );
        System.out.println("Family Status: " + status); 
        input.close();
        }
}