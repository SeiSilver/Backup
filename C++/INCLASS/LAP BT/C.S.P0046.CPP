/* 
   name: Pham Duy Dat
   Class: SE1403
 */
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <time.h>
#include <math.h>
#include <ctype.h>

void opt1(), opt2(), opt3();

void menu() {
    printf("---------------------------\n");
    printf("1. output first primes of the inputted number\n");
    printf("2. check a Fibonacci number\n");
    printf("3. sum of digits in a positive natural number\n");
    printf("4. exit\n");
    printf("---------------------------\n");
}

int main() {
    int opt;
    do {
    system("cls");
    menu();
    printf("Your opt? ");   scanf("%d",&opt);
    switch(opt)  {
            case 1: printf("\n"); opt1(); break;
            case 2: printf("\n"); opt2(); break;
            case 3: printf("\n"); opt3(); break;
            case 4: break;
            default: printf("-----wrong option------\n"); break;
            }
        if (opt!=4) { 
            printf("\n");
            fflush(stdin);
            system ("pause");
        }
    } while (opt!=4);
}

int prime (int n) {   
    int m= (int)sqrt(n);    
    if (n<2) return 0;
    for (int i=2;i<=m;i++)
    {if (n%i==0) return 0;}
    return 1;
}

void opt1() {
    int n=0,dem = 0,i=2;
    printf("Number of prime: ");
    do {
        if (n<0 || n>50) printf("Enter another input: ");
        scanf("%d",&n);
    } while (n<0 || n>50);
    for (int dem = 0 ; dem <n ; i++) {
        if(prime(i)) {
            printf("%d ",i);
            dem++;
        } 
    }
    printf("\n");
}

void fibo(int n){
    int t1=1,t2=1,f=0; // 1 1 2 3 4 5 6
    int stt=1;
    for (int i=3;f<1000;i++) {
        f=t1+t2;
        t1=t2;
        t2=f;
        if (f == n) {
            printf("It's a Fibonacci term.\n");
            stt=0;
            break;
        } 
    } if (stt) printf("It's not a Fibonacci term.\n");
}

void opt2() {
    int n=0,dem;
    printf("Number tested: ");
    do {
        if (n<0 || n>1000) printf("Enter another input: ");
        scanf("%d",&n);
    } while (n<0 || n>1000);
    fibo(n);
}

void opt3() {
    int n;
    printf("Enter a digital: ");
    scanf("%d",&n);
    int len =floor(log10(abs(n))) + 1;
    int sum = 0;
    while (n!= 0) {
        int length = pow(10,len-1);
        int store  = n;
        store = store/length;
        sum +=store;
        n=n%length;
        len--;
    }
    printf("Sum of it's digits: %d\n",sum);
}