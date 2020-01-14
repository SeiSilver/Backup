#include <stdio.h>
int main()
{
    int i,a=10,b=10;
    i=a++;
    printf("i=%d, a=%d\n",i,a);
    i=++b;
    printf("i=%d, b=%d\n",i,b);
    getchar ();
    return 0;
}