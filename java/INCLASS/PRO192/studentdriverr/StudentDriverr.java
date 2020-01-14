/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192.studentdriverr;

/**
 *
 * @author Quynh Tran Ly
 */
public class StudentDriverr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2 lecturers
        // 2 students
        Lecturer[] arrayT = new Lecturer[4];

        arrayT[0] = new Lecturer(111, "Tran", "Ly");
        arrayT[1] = new Lecturer(112, "Anh", "Ngoc");
        arrayT[2] = new Lecturer(113, "Chuc", "Tran");
        arrayT[3] = new Lecturer(114, "Tra", "Nguyen");

        Student st1 = new Student("Tue", "113", 2000, 7.8, arrayT);

        st1.print();
    }

}
