// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop2p2;

import java.util.*;

public class Part2Ques5 {

    static String dayofweek[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    // using gauss's method to calculate the day of weeks

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 2016;
        int febdays = 0;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            febdays = 29;

        do {
            System.out.print("Enter day: ");
            day = sc.nextInt();
            System.out.print("Enter month: ");
            month = sc.nextInt();
            System.out.print("Enter year: ");
            year = sc.nextInt();
            if (day == 0 && month == 0)
                break;
            System.out.println(check(day, month, year));
        } while (day <= 31 || day > 0 || month > 0 || month <= 12 || month == 2 && day <= febdays);
        sc.close();
    }

    public static String check(int day, int month, int year) {

        double m = (month - 2 + 12) % 12;
        if (month < 3)
            year -= 1;
        int y = 5 * (year % 4) + 4 * (year % 100) + 6 * (year % 400);
        int days = (day + (int) (2.6 * m - 0.2) + y) % 7;

        return dayofweek[days];
    }
}
