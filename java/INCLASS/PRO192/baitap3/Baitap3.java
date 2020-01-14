/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192.baitap3;

/**
 *
 * @author ASUS
 */
public class Baitap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person ps = new Person("Khoa", "13", "VietName");
        System.out.println("person: " + ps.toString());

        // Student std = new Student("Khoa","13","VietName","IT",4,200);
        Student std = new Student("IT", 4, 200);
        // Student std = new Student("IT",4,200);
        System.out.println("student: " + std.toString());

        Staff stf = new Staff("Khoa", "13", "VietName", "FPTU", 2000);
        System.out.println("staff: " + stf.toString());
    }

}
