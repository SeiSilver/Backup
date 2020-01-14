#include<stdio.h>
#include<conio.h>
int n,s=0;

int sumdigits(int n){
    int sum=0;
    while (n>0) {
    int remainder =n%10;
    n=n/10;
    sum+=remainder;
    } return sum;
}

int main() {
    while (n>=0) {
        printf ("enter n: "); scanf("%d",&n);
        if (n>=0) {
            s=sumdigits(n);
            printf ("S: %d\n",s);
        }
    } getchar(); getchar();
    return 0;
}


