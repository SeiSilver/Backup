package trenlop;

import java.util.*; 

public class exp {
    public static void main(String arg[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter gender T/F: ");
        boolean gender = input.nextBoolean();

        System.out.println("Name: " + name );
        System.out.println("Age: " + age );
        System.out.println("Gender: " + (gender ? "Male" : "Female" ));

        input.close();
        }
}