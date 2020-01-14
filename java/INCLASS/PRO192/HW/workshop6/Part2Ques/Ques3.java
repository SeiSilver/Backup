// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop6.Part2Ques;

import java.time.*;
import java.time.format.*;

public class Ques3 {
    public static void main(String[] args) {

        DateTimeFormatter all = DateTimeFormatter.ofPattern("MMMM dd, yyyy\nh:MM a");

        System.out.println("Current Date and Time: \n" + LocalDateTime.now().format(all));

    }

}
