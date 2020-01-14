package HW.workshop1;

import java.util.Scanner;

public class question3 {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        input.close();
        int hour=0,min=0,sec=0;
        int remain;
        hour = times/3600;
        remain = times%3600;
        if (remain >0) min = remain/60;
        remain = remain%60;
        if (remain >0) sec = remain;       
        System.out.println(hour + " : " + min + " : " + sec);
        }
}