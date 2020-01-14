#include <stdio.h>
#include <conio.h>
int main()
{
    char c1=0,c2=0,t;
    int d;
    printf("enter c1: "); scanf("%c",&c1);
    printf("enter c2: "); scanf(" %c",&c2);
    if (c1>c2) {
        t=c1;
        c1=c2;
        c2=t;
    }
    d=c2-c1;
    printf("d: %d\n",d);
    for (int c=c1;c<=c2;c++) {
        printf ("%c: %d, %o, %X\n",c,c,c,c);
    }
    getchar();
    getchar();
    return 0;
}