#include <stdio.h>
#include <conio.h>

int n;

double factorial(int n){    
    double p=1;
    for (int i=2;i<=n;i++) p*=i;
    return p;
}

int main() {
    printf("enter n: ");
    while (n<=0) {
        scanf("%d", &n);
        if (n<=0) printf ("enter a positive integer: ");
    }
    printf ("factorial: %.0lf",factorial(n));
    getchar();
    getchar();
    return 0;
}