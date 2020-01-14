// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int main() {
    clock_t begin = clock();

    int n = 10;
    int p = 2;

    while (n != 1) {
        if (n % p == 0) {
            n /= p;
            printf("%d ", p);
        } else
            p++;
    }

    clock_t end = clock();
    double time = (end - begin);
    printf("\nTotal of executing time: %g ms --- %g s\n", time,
           time / CLOCKS_PER_SEC);
    system("pause");
}
