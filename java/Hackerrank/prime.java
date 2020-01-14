package hackrank;

import java.math.BigInteger;
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();

        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");

        sc.close();
    }
}
