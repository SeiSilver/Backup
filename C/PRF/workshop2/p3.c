#include <stdio.h>
#include <conio.h>
int main()
{
    int s=0,x;
    do { 
        printf("Enter x: "); scanf ("%d",&x);
        if (x!=0) s=s+x;
    }
    while (x!=0); printf (" result: %d\n", s);
    getchar();
    getchar();
    return 0;
}