// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <iostream>
#include <string>
using namespace std;

int ToBinary(int* res, int number) {
    int i = 0;
    while (number != 0) {
        res[i] = number % 2;
        number = number / 2;
        i++;
    }
    for (int s = 0, e = i - 1; s < e; s++, e--) {
        int swap = res[s];
        res[s] = res[e];
        res[e] = swap;
    }
    return i;
}

int main() {
    while (true) {
        printf("Covert Decimal to Binary program\n");
        printf("Enter a positive number: ");
        int n = -1;
        while (n < 0) {
            scanf("%d", &n);
            if (n < 0) printf("Please Enter a positive number!\n");
        }
        int res[16] = {};
        int len = ToBinary(res, n);
        printf("Binary number: ");
        for (int i = 0; i < len; i++) {
            printf("%d", res[i]);
        }
        printf("\n");
        system("Pause");
    }
}