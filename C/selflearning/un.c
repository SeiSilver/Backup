// tim gia tri lon nhat va nho nhat
#include <stdio.h>
#include <conio.h>
int main()
{   
    int s=0,x,max,min,d=0;
    max=x;
    min=x;
    while (x!=0) {
        printf("Enter x: "); scanf ("%d",&x);
        d++;
        s+=x;
        if (x>min) max=x;
        if (x<max) min=x;
        }
    printf ("max: %d\n", max);
    printf ("min: %d\n", min);
    printf ("s: %d\n", s);
    printf ("ave: %f\n", 1.00*s/(d-1));
    getchar();
    getchar();
    return 0;
}

// #include<stdio.h>

// int main()  {
//     int n=7, m=6;
//     int *pn =&n, *pm=&m;
//     *pn=2*(*pm)-m*n;
//     *pm+=3*m-*pn;
//     printf("m= %d,n= %d\n",m,n);
//     getchar();
//     getchar();
//     return 0;
// }
