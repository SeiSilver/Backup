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
    char n[16] = {};
    int base = 2;
    printf("Enter binary number: ");
    fflush(stdin);
    gets(n);
    printf("%d", strlen(n));
    puts(n);
    system("pause");
}
