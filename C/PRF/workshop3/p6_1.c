#include<stdio.h>
#include<conio.h>
int n;

int fibonacci(int n){
    int t1=1,t2=1,f=1;
    if (n==1) return 1;
    while (f<n) {
        f=t1+t2;
        t1=t2;
        t2=f; 
    }
    return n==f;
    if (n==f) printf("n is Fibo element");
    return 1;
}

int main() {
    while(n<1) {
        printf("enter n: ");
        scanf("%d", &n);
    } if (fibonacci(n)==1) printf("it is a Fibonacci element\n");
    else printf("it is not a Fibonacci element\n");
    getchar();
    getchar();
    return 0; 
}