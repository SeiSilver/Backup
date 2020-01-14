// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question2;

import java.time.LocalDate;

public class StudentDemo {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2000, 07, 05);
        Student st = new Student("Pham Duy Dat", "DE140191", dob, "Nguyen huu tho", "IT", 100);
        st.printAllAttributes();
    }
}
