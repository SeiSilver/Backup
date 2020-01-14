#include <conio.h>
#include <stdio.h>
#include <time.h>
int n;
double x;
char c1;
int main() {
    int m;
    short s;
    long L;
    float y;
    printf("code of main:%u\n", &main);
    printf("variable n: addr:%u, size: %d\n", &n, sizeof(n));
       printf("variable x: addr:%u, size: %d\n", &x, sizeof(x));
    printf("variable cl: addr:%u, size:%d\n", &c1, sizeof(c1));
    printf("variable m: addr:%u, size:%d\n", &m, sizeof(m));
    printf("variable L: addr:%u, size:%d\n", &L, sizeof(L));
    printf("variable y: addr:%u, size:%d\n", &y, sizeof(y));
    printf("the memory size: %d\n", sizeof(main));

    getchar();
    return 0;
}