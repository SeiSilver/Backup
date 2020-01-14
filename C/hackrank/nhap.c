#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";
    
    int n;
    double n1;
    char sen[1000]={};
    scanf("%d",&n);
    scanf("%lf",&n1);
    scanf("  %[^\n]",&sen);

    printf("%d\n",n+i);

    printf("%.1lf\n",n1+d);

    printf("%s%s", s,sen);


    return 0;
}