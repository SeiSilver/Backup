package HW.workshop2;

import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the investment amount: ");
        double investment = in.nextDouble();

        System.out.println("Input the rate of interest: ");
        double rate = in.nextDouble();

        System.out.println("Input number of years: ");
        int years = in.nextInt();
        double res;

        rate *= 0.01;

        System.out.printf("Years\t\tFutureValue\n");

        for (int i = 1 ; i<=years ; i++) {
            res = futureInvestmentValue(investment,rate/12,i) ;
            System.out.printf("%d\t\t%.2f\n",i,res);
        }
        System.out.println();
        in.close();
    }

    private static double futureInvestmentValue(double investment, double rate, int years) {
        int period= years*12;
        double result= investment * Math.pow(1 + rate, period);
        return result;
    }

}