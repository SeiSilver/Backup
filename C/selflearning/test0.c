// #include <stdio.h>
// #include <conio.h>
// #include <math.h>

// double fibo(double n){
//     double t1=1,t2=1,f=1;
//     for (int i=3;i<=n;i++) {
//         f=t1+t2;
//         t1=t2;
//         t2=f;
//     }
//     return f;
// }

// int first(double n) {
// while (n>=10) n=n/10;
// return n;
// }

// int main() {
// double n;
// do {printf("enter value: "); scanf ("%lf",&n);}
// while (n<0);
// printf("Fibonacci numbers: %.0lf\n", fibo(n));
// printf("The first n Fibonacci numbers: %d\n", first(fibo(n)) );
// printf ("Press any key to exit");
// getchar(); getchar();
// return 0;
// }


// // int first(double n) {
// //     while (n>=10)
// //     n/=10; 
// //     return n;
// // }


#include <stdio.h>
#include <conio.h>
#include <math.h>
#include <stdlib.h>

int n=0,choice;


int prime (int n)
{   
    int m= (int)sqrt(n);    
    if (n<2) return 0;
    for (int i=2;i<=m;i++)
    {if (n%i==0) return 0;}
    return 1;
}

double fibo(int n){
    double t1=1,t2=1,f=1;
    for (int i=3;i<=n;i++) {
        f=t1+t2;
        t1=t2;
        t2=f; 
    }
    return f;
}

int stt=0;

int main() {
do {
    system ("cls");
    printf ("1- Process primes\n");
    printf ("2- Print The n Fibonacci numbers \n");
    printf ("3- Quit\n");
    printf ("Select an operation: "); scanf("%d",&choice);
    switch(choice) {
        case 1: do {printf("\nenter value: "); scanf ("%d",&n);}
                while (n<0);
                int dem;
                for (int i=2;dem<=n;i++) {
                if(prime(i)) dem++;
                if(dem==n) printf ("dem: %d\n",dem);}
        case 2: do {printf("\nenter value: "); scanf ("%d",&n);}
                while (n<0);
                printf ("The n Fibonacci numbers: %lf",fibo(n)); break;
        } if (choice==1 || choice==2) getchar(); getchar();
   } while ((choice>0) && (choice<3)); 
system ("pause");
return 0;
}