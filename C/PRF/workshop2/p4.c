#include<stdio.h>
#include<conio.h>
int main()
{
    int x,y;
    do
    {
        printf("Enter x: "); scanf("%d",&x);
        printf("Enter y: "); scanf("%d",&y);
        int t=x;
        x=y;
        y=t;
        printf ("x= %d\n", x);
        printf ("y= %d\n", y);
    }
    while ((x!=0)&&(y!=0)); 
    printf ("program intermating");
    getchar();
    getchar();
    return 0;
}

