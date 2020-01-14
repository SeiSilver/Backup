// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques3;

import java.io.*;
import java.util.Scanner;

public class Question3 {
    public static Scanner sc = new Scanner(System.in);

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

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the address of the file you want to open: ");
        String address = sc.nextLine();
        readFile(address);
    }
}
