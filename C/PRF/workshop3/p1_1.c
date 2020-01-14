#include <conio.h>
#include <math.h>
#include <stdio.h>

int n = 0;

int prime(int n) {
    int m = (int)sqrt(n);
    if (n < 2) return 0;
    for (int i = 2; i <= m; i++) {
        if (n % i == 0) return 0;
    }
    return 1;
}

int main() {
    // printf("enter n: ");
    // while (n<2) {
    // scanf("%d", &n);
    // }
    int c = 0;
    for (int i = 0; i < 725; i++) {
        if (prime(i)) printf("%d\n", i);
    }

    getchar();
    getchar();
    return 0;
}
