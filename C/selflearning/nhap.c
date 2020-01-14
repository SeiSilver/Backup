// #include <stdio.h>
// #include <math.h>
// #include <conio.h>

// int n=0;

// int prime (int n)
// {   
//     int m= (int)sqrt(n);    
//     if (n<2) return 0;
//     for (int i=2;i<=m;i++)
//     {if (n%i==0) return 0;}
//     return 1;
// }

// int main()
// {   
//     printf("enter n: ");
//     while (n<2) {
//     scanf("%d", &n);
//     }
//     for (int i=2;i<=n;i++) {
//         if(prime(i)) printf ("i: %d\n",i);
//     }
//     getchar();
//     getchar();
//     return 0;
// }     

// #include <stdio.h>
// int main () 
// {
// int input;
// printf ("Enter a value");
// scanf ("%d", &input);
// if (input> 10) {
// int input=5;
// printf ("The value is %d\n", input);
// }
// printf ("The value is %d\n", input);
// return 0;
// }


#include <stdio.h>
#include <conio.h>

int n;

double fibo(int n){
    int t1=1,t2=1,f=1;
    for (int i=3;i<=n;i++) {
        f=t1+t2;
        t1=t2;
        t2=f; 
    }
    return f;
}

int main() {
    printf("enter n: ");
    while (n<1) {
        scanf("%d",&n);}

    for(int i=1;i<=n;i++)
    printf("%.0lf ", fibo(i));

    getchar();
    getchar();
    return 0;
}