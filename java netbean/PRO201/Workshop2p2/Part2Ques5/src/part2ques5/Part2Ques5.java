// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package part2ques5;

import java.util.*;

public class Part2Ques5 {

    static String dayofweek[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    // using gauss's method to calculate the day of weeks

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 2004;
        int febdays = 28;

        do {
            System.out.print("Enter day: ");
            day = sc.nextInt();
            System.out.print("Enter month: ");
            month = sc.nextInt();
            System.out.print("Enter year: ");
            year = sc.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                febdays = 29;
            if (day == 0 && month == 0)
                break;
            System.out.println("Day you enter: " + day + "/" + month + "/" + year);
            System.out.println("Get day of week: " + check(day, month, year));
            System.out.println();
        } while (day <= 31 || day > 0 || month > 0 || month <= 12 || month == 2 && day <= febdays);

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