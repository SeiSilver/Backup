/* 
   name: Pham Duy Dat
   Class: SE1403
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <ctype.h>

int main() {
    double amount;
    double payment,owe =1;
    double rate;
    printf("Enter is the value left to mortage? \n");
    scanf("%lf",&amount);
    printf("what is the annual interest rate of the loan, in percentage?\n");
    scanf("%lf",&rate);
    printf("what is the monthly payment?\n");
    scanf("%lf",&payment);
    printf("Month\t\tPayment\t\tAmount Owed\n");
    int month = 0;
    double monthlyrate = rate/12/100;
    double loan = amount*monthlyrate + amount;
    while (owe > 0) {
        owe =  loan - payment;
        loan = owe + owe*monthlyrate;
        printf("%d\t\t%g\t\t%g\n",++month,payment,owe);

        if (payment > owe) {
            payment = loan;
            owe =0;
            printf("%d\t\t%g\t\t%g\n",++month,payment,owe);
        }
    }
    system("pause");
}