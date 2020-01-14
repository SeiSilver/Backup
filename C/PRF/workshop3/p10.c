#include <stdio.h>
#include <conio.h>

void printMinMaxDigits( int n)
{  int remainder;
   int min, max;
   remainder = n%10;
   n=n/10; 
   min=remainder; 
   max=min;
   while (n>0) {
       remainder=n%10;
       n=n/10;
       if (min>remainder) min=remainder; 
       if (max<remainder) max=remainder;
   }
   printf ("min: %d\n",min);
   printf ("max: %d\n",max);
}

int main() {
    int n=-1;
    while (n<0) {
        printf ("enter n: "); scanf("%d",&n);
        printMinMaxDigits(n);
    }
    getchar(); getchar();
    return 0;
}
