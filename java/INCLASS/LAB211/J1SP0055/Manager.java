/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/

package J1SP0055;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    public static Scanner sc = new Scanner(System.in);
    public ArrayList<Doctor> list = new ArrayList<Doctor>();

    public void menu() {
        System.out.println("======================= MENU =========================");
        System.out.printf("| 1. %-47s |\n", "Add Doctor");
        System.out.printf("| 2. %-47s |\n", "Update Doctor");
        System.out.printf("| 3. %-47s |\n", "Delete Doctor");
        System.out.printf("| 4. %-47s |\n", "Search Doctor");
        System.out.printf("| 5. %-47s |\n", "Exit");
        System.out.println("======================================================");
        System.out.print("Choose option: ");
    }

    public void addDoctor() {
        while (true) {
            System.out.print("Enter Code:");
            String code = Validation.checkInputString();
            int stt = 0;
            for (Doctor i : list) {
                if (i.getCode().equalsIgnoreCase(code)) {
                    System.out.println("This code already exist\nEnter again");
                    stt = 1;
                    break;
                }
            }
            if (stt == 1)
                continue;

            System.out.print("Enter Name: ");
            String name = Validation.checkInputString();
            System.out.print("Enter Specialization: ");
            String specialization = Validation.checkInputString();
            System.out.print("Enter Availability: ");
            int availability = Validation.checkInt();

            list.add(new Doctor(code, name, specialization, availability));

            if (!Validation.checkInputYN())
                return;
        }
    }

    public void updateDoctor() {
        System.out.println("--------- Update Doctor -------");
        System.out.print("Enter Code: ");
        String code = Validation.checkInputString();
        for (Doctor i : list) {
            if (i.getCode().equalsIgnoreCase(code)) {

                System.out.print("Enter Code:");
                i.setCode(Validation.checkInputString());

                System.out.print("Enter Name: ");
                i.setName(Validation.checkInputString());

                System.out.print("Enter Specialization: ");
                i.setSpecialization(Validation.checkInputString());

                System.out.print("Enter Availability: ");
                i.setAvailability(Validation.checkInt());
                return;
            }
        }
        System.out.println("Doctor code does not exist");
    }

    public void deleteDoctor() {
        System.out.println("--------- Delete Doctor -------");
        System.out.print("Enter Code: ");
        String code = Validation.checkInputString();
        for (Doctor i : list) {
            if (i.getCode().equalsIgnoreCase(code)) {
                list.remove(i);
                return;
            }
        }
        System.out.println("Doctor code does not exist");
    }

    public void searchDoctor() {
        System.out.println("---------- Search Doctor --------");
        System.out.print("Enter search: ");
        String search = Validation.checkInputString();

        for (Doctor i : list) {
            if (i.getName().equalsIgnoreCase(search) || i.getCode().equalsIgnoreCase(search)
                    || i.getSpecialization().equalsIgnoreCase(search)
                    || Integer.parseInt(search) == i.getAvailability()) {
                System.out.printf("%-10s %-20s %-20s %s\n", "Code", "Name", "Specialization", "Availability");
                System.out.println(i);
                break;
            }

        }
    }

    public void displayall() {
        System.out.printf("%-10s %-20s %-20s %s\n", "Code", "Name", "Specialization", "Availability");
        for (Doctor i : list) {
            System.out.println(i);
        }
    }
}