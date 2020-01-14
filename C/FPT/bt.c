#include <stdio.h>
#include <math.h>
#include <stdlib.h>

void sumEvenOdd() {
    int sumOdd = 0, sumEven = 0;
    int upperbound, absDiff;
    printf("Enter the upperbound: "); scanf("%d", &upperbound);
    int number = 1;
    while (number <= upperbound) {
        if (number % 2 == 0) sumEven += number;
        else sumOdd += number;
        ++number;
    }
      if (sumOdd > sumEven) absDiff = sumOdd - sumEven;
      else absDiff = sumEven - sumOdd;
      printf("The sum of odd numbers is %d.\n", sumOdd);
      printf("The sum of even numbers is %d.\n", sumEven);
      printf("The absolute difference is %d.\n", absDiff);
}

int func1() {
    sumEvenOdd();
}

double CelsiusFahrenheit(double celsius) {
    double fahrenheit;
    fahrenheit = celsius*(9/5)+32;
    printf("%.2lf degree C is %.2lf degree F\n", celsius, fahrenheit);
}

double FahrenheitCelsius( double fahrenheit) {
    double celsius;
    celsius = (fahrenheit-32)*(5/9);
    printf("%.2lf degree F is %.2lf degree C\n", fahrenheit, celsius);
}

int func2() {
    double celsius;
    printf("Enter the temperature in celsius: "); scanf("%lf", &celsius);
    CelsiusFahrenheit(celsius);
}

int func3() {
    double fahrenheit;
    printf("Enter the temperature in fahrenheit: "); scanf("%lf", &fahrenheit); 
    FahrenheitCelsius(fahrenheit);
}

void FahrenheitCelsiuspointer(double fahrenheit, double *celsius) {
    *celsius= (fahrenheit-32)*(5/9);
}

int func4() {
    double fahrenheit, celsius;
    printf("Enter the temperature in fahrenheit: "); scanf("%lf", &fahrenheit); 
    FahrenheitCelsiuspointer(fahrenheit, &celsius);
    printf("%.2lf degree F is %.2lf degree C\n", fahrenheit, celsius);
}

int main()  {
    int opt;
    float x;
    do {
        system("cls");
        printf("1- SumOddEven \n");
        printf("2- CelsiusFahrenheit\n");
        printf("3- FahrenheitCelsius \n");
        printf("4- FahrenheitCelsius-pointer \n");
        printf("5- Quit \n");
        printf("Your opt? ");    scanf("%d",&opt);
        switch(opt)  {
            case 1: func1();  break;
            case 2: func2();  break;
            case 3: func3();  break;
            case 4: func4();  break;
            case 5: break;
            default: printf("ERROR \n");
            }
        if (opt!=5) { fflush(stdin); system("pause");}
    }
    while (opt!=5);
    system ("pause");
    return 0;
}