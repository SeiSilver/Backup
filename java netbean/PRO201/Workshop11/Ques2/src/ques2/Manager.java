// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package ques2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    public Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("===================== MENU =========================");
        System.out.println("| 1. Add a list of Students and save to File       |");
        System.out.println("| 2. Loading list of Students from a File          |");
        System.out.println("| 3. Exit                                          |");
        System.out.println("====================================================");
        System.out.print("Choose option: ");
    }

    public static void writefile(ArrayList<Student> data, String address) {
        File f = new File(address);
        FileWriter fr = null;
        try {
            fr = new FileWriter(f);
            for (Student i : data) {
                fr.write(i.toString());
                fr.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readFile(String filename) {
        File f = new File(filename);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            if (line != null)
                System.out.println("Content in File: ");
            do {
                System.out.println(line);
            } while ((line = br.readLine()) != null);

            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }

    public void AddListSavetoFile(ArrayList<Student> slist) {
        String address = "Save.txt";
        System.out.print("Enter name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter age: ");
        int age = Validation.checkInt();
        System.out.print("Enter mark: ");
        double mark = Validation.checkDouble();
        slist.add(new Student(name, age, mark));
        writefile(slist, address);
        System.out.println("Add complete!");
        System.out.print("Want to continue (y/n)? ");
        if (Validation.checkInputYN())
            AddListSavetoFile(slist);
    }

    public void loadStudentFromFile() {
        String address = "Save.txt";
        readFile(address);
    }

    public void manager(ArrayList<Student> slist) {
        int choice = 0;
        do {
            menu();
            choice = Validation.checkInt();
            switch (choice) {
            case 1:
                AddListSavetoFile(slist);
                break;
            case 2:
                loadStudentFromFile();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
        } while (choice != 3);
    }

}