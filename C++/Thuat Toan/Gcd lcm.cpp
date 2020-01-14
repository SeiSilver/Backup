#include <conio.h>
#include <stdio.h>

int a, b, d, m;

int gcd(int a, int b) {
    while (a != b)
        if (a > b)
            a -= b;
        else
            b -= a;
    return a;
}

int lcm(int a, int b) {
    return a * b / gcd(a, b);
}

int main() {
    while (a <= 0 || b <= 0) {
        printf("enter a: ");
        scanf("%d", &a);
        printf("enter b: ");
        scanf("%d", &b);
    }
    d = gcd(a, b);
    m = lcm(a, b);
    printf("d: %d\n", d);
    printf("m: %d", m);
    getchar();
    getchar();
    return 0;
}
