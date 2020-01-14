// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package FILE.Specialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("Dat", 19, "Male");
        Person p2 = new Person("Harumi", 19, "Female");
        FileOutputStream f = new FileOutputStream(new File("FILE/Specialization/test.txt"));
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(p1);
        o.writeObject(p2);
        f.close();
        o.close();

        FileInputStream f1 = new FileInputStream(new File("FILE/Specialization/test.txt"));
        ObjectInputStream in = new ObjectInputStream(f1);

        Person res1 = (Person) in.readObject();
        Person res2 = (Person) in.readObject();
        System.out.println(res1);
        System.out.println(res2);
        f1.close();
        in.close();
    }
}
