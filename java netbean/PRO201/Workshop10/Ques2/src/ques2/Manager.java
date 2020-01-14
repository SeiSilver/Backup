// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package ques2;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    public Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("=========== MENU =============");
        System.out.println("| 1. Add Doctor              |");
        System.out.println("| 2. Update Doctor           |");
        System.out.println("| 3. Delete Doctor           |");
        System.out.println("| 4. Search Doctor           |");
        System.out.println("| 5. Exit                    |");
        System.out.println("==============================");
        System.out.print("Choose option: ");
    }

    public void function1(ArrayList<Doctor> dc) {
        System.out.print("Enter code: ");
        String code = Validation.checkInputString();
        if (Validation.checkDoctor(dc, code)) {
            System.out.println("This code has been used! - Try Again!");
            function1(dc);
            return;
        }
        System.out.print("Enter name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter specialization: ");
        String specialization = Validation.checkInputString();
        System.out.print("Enter availability: ");
        int availability = Validation.checkInt();

        if (Validation.checkDuplicate(dc, code, name, specialization, availability)) {
            System.out.println("This Doctor already exist! - Please Enter again!");
            function1(dc);
            return;
        }

        dc.add(new Doctor(code, name, specialization, availability));
        System.out.print("Want to continue ? (Y/N): ");
        if (Validation.checkInputYN()) {
            function1(dc);
            return;
        }
        System.out.println("Add Complete!");
    }

    public void function2(ArrayList<Doctor> dc) {
        System.out.print("Enter Doctor code: ");
        String search = Validation.checkInputString();
        for (Doctor i : dc) {
            if (i.getCode().equalsIgnoreCase(search)) {
                while (true) {
                    System.out.print("Enter New Code: ");
                    String code = Validation.checkInputString();
                    if (Validation.checkDoctor(dc, code)) {
                        System.out.println("This code has been used! - Try Again!");
                        function1(dc);
                    }
                    System.out.print("Enter new name: ");
                    String name = Validation.checkInputString();
                    System.out.print("Enter new Specialization: ");
                    String specialization = Validation.checkInputString();
                    System.out.print("Enter new availability: ");
                    int availability = Validation.checkInt();

                    if (Validation.checkDuplicate(dc, code, name, specialization, availability)) {
                        System.out.println("This Doctor already exist! - Please Enter again!");
                    } else {
                        i.setCode(code);
                        i.setName(name);
                        i.setSpecialization(specialization);
                        i.setAvailability(availability);
                        System.out.println("Update complete!");
                        return;
                    }
                }
            }
        }
        System.out.println("Code doesn't exist! - Update Fail!");
    }

    public void function3(ArrayList<Doctor> dc) {
        System.out.print("Enter Doctor code: ");
        String search = Validation.checkInputString();
        for (Doctor i : dc) {
            if (i.getCode().equalsIgnoreCase(search)) {
                dc.remove(i);
                System.out.println("Delete Complete!");
                return;
            }
        }
        System.out.println("Code doesn't exist! - Delete Fail!");
    }

    public void function4(ArrayList<Doctor> dc) {
        System.out.print("Enter Doctor code: ");
        String search = Validation.checkInputString();
        for (Doctor i : dc) {
            if (i.getCode().equalsIgnoreCase(search)) {
                System.out.printf("%-10s %-30s %-30s %s\n", "Code", "Name", "Specialization", "Availability");
                System.out.println(i);
                return;
            }
        }
        System.out.println("Code doesn't exist!");
    }

    public void manager(ArrayList<Doctor> dc) {
        int choice = 0;
        do {
            menu();
            choice = Validation.checkInt();
            switch (choice) {
            case 1:
                function1(dc);
                break;
            case 2:
                function2(dc);
                break;
            case 3:
                function3(dc);
                break;
            case 4:
                function4(dc);
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
        } while (choice != 5);
    }

}