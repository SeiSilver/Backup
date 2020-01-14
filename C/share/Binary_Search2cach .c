#include<stdio.h>
#include<stdlib.h>

int BinarySearch(int, int*, int);

int main()  {
    int x[10]={0,1,2,3,4,5,6,7,8,9};
    int max=10, n;
    printf("Nhap so: ");
    scanf("%d",&n);
    int y= BinarySearch(n,x,max);
    if ( y != -1)
        printf("Value: %d - Stt: %d - Address: %d\n", x[y],y,&x[y]);
    system("pause");
}

/* ---- Cách thông thường ---- */

int BinarySearch(int n, int x[], int max) {
    int min=0, y;
    while (min<=max)    {
        y=(min+max)/2;
        if (x[y]==n)  return y;
        if (x[y]>n)
            max=y-1;
        else min = y+1;
    }
    return -1;
}

/* ---- Cách sử dụng con trỏ ----*/

// int BinarySearch(int n, int* x, int max) {
//     int min=0, y;
//     while (min<=max)    {
//         y=(min+max)/2;
//         if (*(x+y)==n)  return y;
//         if (*(x+y)>n)
//             max=y-1;
//         else min = y+1;
//     }
//     return -1;
// }

