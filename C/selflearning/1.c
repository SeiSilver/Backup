// #include <stdio.h>
// #include <conio.h>

// int k,n;
// int gt(int x)
// {  int p=1;
//    for (int i=1;i<=x;i++)
//    p=p*i;
//    return p; 
// }

// int main(){
//     do {
//     printf ("enter k: "); scanf ("%d",&k);
//     printf ("enter n: "); scanf ("%d",&n);
//     }
//     while (n<=0 || k<=0 || k>n);
//     printf("c=%d", gt(n)/(gt(k)*gt(n-k)));
//     getchar();
//     getchar();
//     return 0;

// }


#include <stdio.h>
#include <math.h>
#include <conio.h>

int n=0;

int prime (int n)
{   
    int m= (int)sqrt(n);    
    if (n<2) return 0;
    for (int i=2;i<=m;i++)
    {if (n%i==0) return 0;}
    return 1;
}

int main()
{   
    printf("enter n: ");
    while (n<2) {
    scanf("%d", &n);
    }
    int dem=0;
    for (int i=2;i<=n;i++) {
        if(prime(i)) dem++;
        if(dem=n) printf ("i: %d\n",i);
    }
    getchar();
    getchar();
    return 0;
}     
