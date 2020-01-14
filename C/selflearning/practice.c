#include <stdlib.h>
#include <stdio.h>

int swap(char *pc1,char *pc2) {
    char t=*pc1;
    *pc1=*pc2;
    *pc2=t;
} 
// int main() {
//     int a=5, b=1;
//     printf("a=%d, b=%d\n",a,b);
//     swap(&a,&b);
//     printf("a=%d, b=%d\n",a,b);
//     getchar();getchar();
//     return 0;
// }

int main() {
    char c1,c2;
    char *pc1=&c1 , *pc2=&c2;
    // pc1 = (char*) malloc ( sizeof(char));
    // pc2 = (char*) malloc ( sizeof(char));
    printf("enter pc1: "); scanf("%c", &c1);
    printf("enter pc2: "); scanf(" %c", &c2);
    if (c1>c2) swap(&c1,&c2);
    char c;
    for (c=*pc1;c<=*pc2;c++)
    printf("%c,%4d,%4o,%4X\n",c,c,c,c);
    getchar(); getchar();
    return 0;
}