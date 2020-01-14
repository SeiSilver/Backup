#include <stdio.h>
#include <conio.h>
int main()
{
    int a,b,c,stt=1;
    char x;
    printf ("enter an expression+ - * /: " ); scanf("%d%c%d", &a,&x,&b);
    switch (x)
    {
    case '+': c = a+b; break;
    case '-': c = a-b; break;
    case '*': c = a*b; break;    
    case '/': 
        if (b==0) {
          printf ("divide by 0\n"); stt=0;}
            else c = a/b; break;
    default: printf(" x is not supported"); stt=0;
    }
    if (stt!=0) printf (" result %d\n", c);
    getchar();
    getchar();
    return 0;
}

