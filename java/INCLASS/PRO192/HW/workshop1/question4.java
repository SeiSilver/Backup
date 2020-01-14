package HW.workshop1;
import java.util.Scanner;

public class question4 {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String fullname = input.nextLine();
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Age: ");
        int age = input.nextInt();
        System.out.print("Enter Salary: ");
        int salary = input.nextInt();
        System.out.print("Enter gender: ");
        boolean gender = input.nextBoolean();
        System.out.print("Enter Family Status: ");
        input.nextLine();
        char status = input.next().charAt(0);
        System.out.println("\nFullname: " + fullname );
        System.out.println("Name: " + name );
        System.out.println("Age: " + age );
        System.out.println("Salary: " + salary );
        System.out.println("Gender: " + (gender == true ? "Male" : "Female" ) );
        System.out.println("Family Status: " + ( String.valueOf(status).equals("s") ? "Single" : "Married") ); 
        input.close();
        }
}