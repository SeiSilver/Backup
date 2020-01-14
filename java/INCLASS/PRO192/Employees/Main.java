// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package PRO192.Employees;

import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Employee e1 = new Employee(100, "Nhan", "Nguyen", "FPT", 20);
        // Employee e2 = new Employee(200, "Hoang", "Tran", "FPT", 10);
        // Employee e3 = new Employee(200, "Dat", "Pham", "FPT", 0);

        // System.out.println(e1 + "\n");
        // System.out.println(e2 + "\n");

        // Employee.setPer(10);
        // // Employee.setCompany("FPT hai Chau");

        // System.out.println(e3 + "\n");
        // System.out.println(e2 + "\n");

        Employee[] arr = new Employee[2];
        // arr[0] = e1;
        // arr[1] = e2;
        // arr[2] = e3;
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        Manager.manager();

        Employee input = new Employee();

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Add to Arr[%d]: \n", i);
            arr[i] = input.input();
            System.out.printf("Add to Arr[%d] complete!\n\n", i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ". " + arr[i]);
        }

        // System.out.println(e2 + "\n");

        // Employee e3 = new Employee(200, "Dat", "Pham", "FPT", 0,5);

        // System.out.println(e3 + "\n");
        // System.out.println(e1 + "\n");
        // System.out.println(e2 + "\n");

    }
}
