// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean readFile(String filename, ArrayList<String> data) {
        File f = new File(filename);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println("The content in this File: ");
            do {
                data.add(line);
                System.out.println(line);
            } while ((line = br.readLine()) != null);

            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("File not found!");
            return false;
        }
        return true;
    }

    public static void writefile(String address, ArrayList<String> data) {
        File f = new File(address);
        FileWriter fr = null;
        System.out.println("Path: " + f.getAbsolutePath());
        try {
            fr = new FileWriter(f);
            for (int i = 0; i < data.size(); i++) {
                fr.write(data.get(i));
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

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the address of the file you want to open: ");
        String address = sc.nextLine();
        ArrayList<String> data = new ArrayList<>();
        if (readFile(address, data)) {
            System.out.println("\nEnter the address you want to save to: ");
            String add = sc.nextLine();
            add = add.concat("\\");
            System.out.println("save as?");
            String filename = sc.nextLine();
            add = add.concat(filename);
            writefile(add, data);
            readFile(add, data);
            System.out.println("\nCopy Complete!");
            return;
        }
        System.out.println("\nCopy Fail!");
    }
}
