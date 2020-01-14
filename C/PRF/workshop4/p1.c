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

void printMinMaxDigits(int n)
{  int remainder;
   int min, max;
   remainder = n%10;
   n=n/10; 
   min=remainder; 
   max=min;
   while (n>0) {
       remainder=n%10;
       n=n/10;
       if (min>remainder) min=remainder; 
       if (max<remainder) max=remainder;
   }
   printf ("min: %d\n",min);
   printf ("max: %d\n\n",max);
}

int main() {
do {
    system ("cls");
    printf ("1- Process primes\n");
    printf ("2- Print min, max digit in an integer \n");
    printf ("3- Quit\n");
    printf ("Select an operation: "); scanf("%d",&choice);
    switch(choice) {
        case 1: do {printf("\nenter value: "); scanf ("%d",&n);}
                while (n<0);
                if (prime(n)==1) printf ("It is a prime\n\n");
                else printf ("It is not a prime\n\n"); break;
        case 2: do {printf("\nenter value: "); scanf ("%d",&n);}
                while (n<0);
                printMinMaxDigits(n); break;
        } if (choice==1 || choice==2) system ("pause");
   } while ((choice>0) && (choice<3)); 
system ("pause");
return 0;
}