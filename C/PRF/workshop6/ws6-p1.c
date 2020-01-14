#include <Stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>

int ISBNchecker (int n) {
    int I[11]; /* array contains digits in n */
    int C[10]; /* array for checking */
    int t,T=0; /* temporary values */
    int i; /* loop variable and result of the function */
    if (n>0) { 
        /* Compute i[i] */
        for (i=10; i>0; i--) {
            I[i]= n%10;
            n= n/10;
        }   
    }
    /* Compute C[i] */
    for (i=9;i>0;i--) {
        int a=1;
        C[i]=I[a]*i;
        a++;
        t=t+C[i];
    } 
        T=t+I[10];
        /* conclusion */
    if (T%11==0) return 1;
}

int main() {
    int n;
    do {
    system("cls");
    printf ("ISBN Validator \n============== \nISBN (0 to quit): "); scanf("%d",&n); 
    if (n<0) { 
        printf ("Error\n"); system("pause"); 
        }
    } while (n<0); 
    if (n!=0) { 
        if (ISBNchecker(n)==1) printf ("This is a valid ISBN\n");
        else printf ("This is Invalid ISBN\n");
    }
    system("pause");  
}
