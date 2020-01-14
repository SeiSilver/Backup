// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package FILE.Test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FirstFile {

    public static void writefile(String[] data, String address) {
        File f = new File(address);
        FileWriter fr = null;
        try {
            fr = new FileWriter(f);
            for (int i = 0; i < data.length; i++) {
                fr.write(data[i]);
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

        System.out.println(f.getAbsolutePath());
    }

    public static void readFile(String filename) throws IOException {
        File f = new File(filename);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("Read text file: ");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
    }

    public static void main(String[] args) throws IOException {
        String[] data = { "Loli is the best!\n", "Yue is best girls!\n" };
        String add = "FILE/Test1/Test.txt";
        writefile(data, add);
        String filename = "test.txt";
        readFile(filename);
    }
}
