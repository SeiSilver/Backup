/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/

package J1SP0054;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    public static Scanner sc = new Scanner(System.in);
    public ArrayList<Contact> list = new ArrayList<Contact>();

    public void menu() {
        System.out.println("======================= MENU =========================");
        System.out.printf("| 1. %-47s |\n", "Add a Contact");
        System.out.printf("| 2. %-47s |\n", "Display all Contact");
        System.out.printf("| 3. %-47s |\n", "Delete a Contact");
        System.out.printf("| 4. %-47s |\n", "Exit");
        System.out.println("======================================================");
        System.out.print("Choose option: ");
    }

    public int idcount = 1;

    public void addcontact() {
        while (true) {
            System.out.print("Enter Name: ");
            String name = Validation.checkInputString();
            System.out.print("Enter Group: ");
            String group = Validation.checkInputString();
            System.out.print("Enter Address: ");
            String address = Validation.checkInputString();
            System.out.print("Enter Phone: ");
            String phone = Validation.checkPhone();

            list.add(new Contact(idcount, name, group, address, phone));

            for (Contact i : list) {
                if (i.getID() == idcount) {
                    idcount++;
                    break;
                }
            }

            System.out.print("Want to continue (Y/N)? ");
            if (!Validation.checkInputYN())
                return;
        }
    }

    public void displayall() {
        System.out.printf("%-5s %-18s %-20s %-20s %-10s %-20s %s\n", "ID", "Name", "First Name", "Last Name", "Group",
                "Address", "Phone");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void deletecontact() {
        System.out.print("Enter ID: ");
        int id = Validation.checkInt();
        for (Contact i : list) {
            if (i.getID() == id) {
                list.remove(i);
                System.out.println("Removed success.");
                break;
            }
        }

    }
}