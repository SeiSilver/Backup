/* 
   Name: Pham Duy Dat
   ID: DE140191
   Class: SE1403
 */
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <time.h>
#include <math.h>

void function1(), function2(),function3();

void menu() {
    printf("---------------------------\n");
    printf("1. Quadratic equation.\n");
    printf("2. Bank deposit problem.\n");
    printf("3. exit.\n");
    printf("---------------------------\n");
}

int main() {
    int option;
    do {
    system("cls");
    menu();
    printf("Your option? ");   scanf("%d",&option);
    switch(option)  {
            case 1: printf("\n"); function1(); break;
            case 2: printf("\n"); function2(); break;
            case 3: break;
            default: printf("-----wrong option------\n"); break;
            }
        if (option!=3) { 
            printf("\n");
            fflush(stdin);
            system ("pause");
        }
    } while (option!=3);
}

void function1() {
    double a,b,c;
    printf("Enter a: "); scanf("%lf",&a); // 1
    printf("Enter b: "); scanf("%lf",&b); // -6
    printf("Enter c: "); scanf("%lf",&c); // -2
    double delta = b*b - 4*a*c;
    double x1,x2;
    if (delta > 0) {
        x1 = (double) (-b + sqrt(delta)) / (2*a);
        x2 = (double) (-b - sqrt(delta)) / (2*a);
        printf("x1 = %g\n",x1);
        printf("x2 = %g\n",x2);
    }
    else if (delta == 0) {
        x1 = (double) (-b + sqrt(delta)) / (2*a);
        printf("x1 = x2 = %g\n",x1);
    }
    else {
        printf("The equation has no solution");
    }
}

void function2() {
    int deposit = -1;
    while (deposit <0) {
        printf("Amount of money want to deposit: ");
        scanf("%d",&deposit);
        if(deposit <0) printf("Please enter a positive number\n");       
    }

    double rate = 1;
    while (rate >0.1 || rate <0) {
        printf("Deposit interest rates: ");
        scanf("%lf",&rate);
        if(rate >0.1 || rate <0) printf("Please enter a positive number <= 0.1\n");   
    }

    int months = -1;
    while (months <0) {
        printf("Number of deposit months: ");
        scanf("%d",&months);
        if(months <0) printf("Please enter a positive number\n");       
    }
    double output = deposit*rate*months;
    printf("Total amount received: %g\n",output);
}