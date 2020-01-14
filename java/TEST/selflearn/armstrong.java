package selflearn;

import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //get number from user input
        scanner.close();
        int check =n, a;
        int sum=0;
        int dem=0;
        if (n>=1 && n<=10000) {
            while (check > 0) {
                check=check/10; 
                dem+=1;                      
            }
            check = n;
            while (n>0) {
                a = n%10;
                n= n/10;
                sum += Math.pow(a,dem);                            
            }
        }
        if (sum == check) System.out.println("The number is an Armstrong");
        else System.out.println("The number is not an Armstrong");
    }
}