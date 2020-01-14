// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop7.Part2QuesOld.Ques2;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomArrayListDemo {

    public static Scanner sc = new Scanner(System.in);

    int n = 4;

    public void addValue(int roll[], String[] name, int[] marks, long[] phone) {
        ArrayList<Customer> list = new ArrayList<Customer>();
        for (int i = 0; i < n; i++) {
            list.add(new Customer(roll[i], name[i], marks[i], phone[i]));
        }
        System.out.println("Add compelete!");
        printValue(list);
    }

    public void printValue(ArrayList<Customer> list) {
        for (Customer a : list)
            System.out.println(a);
    }

    public static void main(String[] args) {
        int roll[] = { 1, 2, 3, 4 };
        String name[] = { "Dat", "Phuong", "Sei", "Yue" };
        int marks[] = { 50, 100, 100, 99 };
        long phone[] = { 8765852900L, 8765852901L, 8760001123L, 87756111111L };
        CustomArrayListDemo custom = new CustomArrayListDemo();
        custom.addValue(roll, name, marks, phone);
    }
}
