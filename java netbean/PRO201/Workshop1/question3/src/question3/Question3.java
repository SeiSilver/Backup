// name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
package question3;
import java.util.Scanner;
public class Question3 {

      public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter times: ");
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