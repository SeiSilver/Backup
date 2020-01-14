// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop11.Question1;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void writefile(ArrayList<String> data, String address) {
        File f = new File(address);
        FileWriter fr = null;
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

    public static void readFile(String filename, ArrayList<String> data) throws IOException {
        File f = new File(filename);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            data.add(line);
        }
        System.out.println("Path: " + f.getAbsolutePath());
        System.out.println("Read text file: ");
        for (String i : data) {
            System.out.println(i);
        }
        br.close();
        fr.close();
    }

    public static void convert(ArrayList<String> data) {
        for (int i = 0; i < data.size(); i++) {
            StringBuffer sc = new StringBuffer(data.get(i));
            for (int j = 0; j < sc.length(); j++) {
                if (sc.charAt(j) >= 'A' && sc.charAt(j) <= 'Z' || sc.charAt(j) >= 'a' && sc.charAt(j) <= 'z') {
                    char c = (char) (sc.charAt(j) + 3);
                    if ((int) sc.charAt(j) + 3 > 122) {
                        c = (char) (sc.charAt(j) + 3 - 122 - 1 + 'a');
                    } else if ((int) sc.charAt(j) + 3 <= 122 && (int) sc.charAt(j) + 3 >= 97) {
                        c = (char) (sc.charAt(j) + 3);
                    } else if ((int) sc.charAt(j) + 3 > 90) {
                        c = (char) (sc.charAt(j) + 3 - 90 - 1 + 'A');
                    }
                    sc.setCharAt(j, c);
                }
            }
            data.set(i, sc.toString());

        }
    }

    public static void main(String[] args) throws IOException {
        String address = "HW/workshop11/Question1/data.txt";
        ArrayList<String> data = new ArrayList<String>();
        readFile(address, data);

        convert(data);
        System.out.println("\nAfter converted: ");
        for (String i : data) {
            System.out.println(i);
        }
        String outputAddress = "HW/workshop11/Question1/Output.txt";
        writefile(data, outputAddress);
    }
}
