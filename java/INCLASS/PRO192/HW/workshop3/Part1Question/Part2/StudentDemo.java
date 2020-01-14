// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop3.Part1Question.Part2;

import java.time.LocalDate;

public class StudentDemo {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2000, 07, 05);

        // Date dob = new Date(2000 - 1900, 7 - 1, 05); // 05/07/2000

        // Note: java.util.date is an old constructor only for jdk 7 and under
        // Still can use but not recommend

        Student st = new Student("Pham Duy Dat", "DE140191", dob, "Nguyen huu tho", "IT", 100);

        st.printAllAttributes();
        st.setAddress("Nui Thanh");
        System.out.println();
        st.printAllAttributes();
    }
}
