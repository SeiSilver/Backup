// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Assignment;

import java.io.*;
import java.util.*;

public class Management {

    public static void WriteObjectFile(ArrayList<ShopItem> data, String name) {
        File f = new File(name);
        if (f.exists()) {
            f.delete();
        }
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (ShopItem i : data) {
                oos.writeObject(i);
            }
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void ReadObjectFile(ArrayList<ShopItem> store, String name) {
        ShopItem sc = new ShopItem();
        // File f = new File(name);
        // if (f.exists()) {
        // f.delete();
        // }
        try {
            FileInputStream fis = new FileInputStream(name);
            ObjectInputStream ois = new ObjectInputStream(fis);
            sc = (ShopItem) ois.readObject();
            store.add(sc);
            while (sc != null) {
                sc = (ShopItem) ois.readObject();
                store.add(sc);
                System.out.println(sc);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        // for (ShopItem i : store) {
        // System.out.println(i);
        // }
    }

    public static void ReadOnly(ArrayList<ShopItem> store, String name) {
        ShopItem sc = new ShopItem();
        try {
            FileInputStream fis = new FileInputStream(name);
            ObjectInputStream ois = new ObjectInputStream(fis);
            sc = (ShopItem) ois.readObject();
            System.out.println(sc);
            while (sc != null) {
                sc = (ShopItem) ois.readObject();
                System.out.println(sc);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("File doesn't contain any data " + e);
        }
        // for (ShopItem i : store) {
        // System.out.println(i);
        // }
    }
}
