package hackrank;

import java.util.*;

public class time {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String s = input.nextLine();

        int hour = Integer.valueOf(s.substring(0, 2));
        int min = Integer.valueOf(s.substring(3, 5));

        int sec = Integer.valueOf(s.substring(6, 8));
        String check = s.substring(8, 10);

        hour -= ((check.toUpperCase().equals("AM") && hour == 12) ? 12 : 0);
        hour += ((check.toUpperCase().equals("PM") && hour != 12) ? 12 : 0);

        System.out.println(
                String.format("%02d", hour) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sec));
        input.close();
    }
}
