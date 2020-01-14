package swap;
import java.util.Scanner;
public class swapdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = n%10; // get last digits
        int b = (n/10)%10; // get second last digits
        n = n/100 * 100 + a*10 + b;     

        System.out.println(n);
        scanner.close();
    }
}