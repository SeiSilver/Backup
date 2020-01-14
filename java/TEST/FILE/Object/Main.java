// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package FILE.Object;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Student[] slist = { new Student("Dat", 19), new Student("Harumi", 19), new Student("Sei", 19) };

        try {
            FileOutputStream fo = new FileOutputStream(new File("FILE/Object/testdata.txt"));
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            for (Student i : slist) {
                oo.writeObject(i);
            }
            fo.close();
            oo.close();
        } catch (IOException e) {
            System.out.println("Error!\n" + e);
        }

        Student s1 = new Student();
        Student s2 = new Student();
        try {
            FileInputStream f1 = new FileInputStream(new File("FILE/Object/testdata.txt"));
            ObjectInputStream in = new ObjectInputStream(f1);
            s1 = (Student) in.readObject();
            s2 = (Student) in.readObject();
            f1.close();
            in.close();
        } catch (Exception e) {
            System.out.println("Error!\n" + e);
        }
        System.out.println(s1);
        System.out.println(s2);

    }
}
