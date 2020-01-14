// #include <stdio.h>
// #include <conio.h>
// int main()
// {
//     int s=0,i,n;
//     printf("enter n: "); scanf ("%d",&n);
//     for (i=(n%2==1)? 1:2;i<=n;s+=i)
//     i+=2;
//     printf("%d", s);
//     getchar();
//     getchar();
//     return 0;
// }

// #include <stdio.h>
// #include <conio.h>
// int main()
// {
//     int s=0,i,n;
//     printf("enter n: "); scanf ("%d",&n);
//     for (i=n;i>0;s+=i)
//     i-=2;
//     printf("gia tri s: %d\n", s);
//     printf("gia tri i: %d\n", i);
//     getchar();
//     getchar();
//     return 0;
// }

#include <stdio.h>
#include <conio.h>
#include <math.h>
int main()
{
    int i,n;
    double s=1;
    printf("enter n: "); scanf ("%d",&n);
    for (i=1;i>=0;s+=1.0/pow(i,i-1), i =i+1);
    printf("gia tri s: %d\n", s);
    printf("gia tri i: %d\n", i);
    getchar();
    getchar();
    return 0;
}

