#include<stdio.h>
#include<conio.h>
int main()
{
    int x=1,y=1;
    while ((x!=0)&&(y!=0))
    {
        printf("Enter x: "); scanf("%d",&x);
        printf("Enter y: "); scanf("%d",&y);
        int t=x;
        x=y;
        y=t;
        if ((x==0)||(y==0)) 
        { printf ("Program terminating"); break;}
        printf ("x= %d\n", x);
        printf ("y= %d\n", y);
    }
    getchar();
    getchar();
    return 0;
}