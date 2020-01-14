package testvn;

import java.util.Scanner;

public class nhap {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        String fullname = input.nextLine();
        String name = input.nextLine();
        int age = input.nextInt();
        int salary = input.nextInt();
        input.nextLine();
        String gender = input.next();
        input.nextLine();
        String status = input.nextLine();
        System.out.println("Fullname: " + fullname);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Gender: " + (gender.toUpperCase() == "TRUE" ? "Male" : "Female"));
        System.out.println("Family Status: " + status);
        input.close();
    }
}