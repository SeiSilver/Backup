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

void opt1(), opt2(), opt3();

void menu() {
    printf("==================================================\n");
    printf("1. Convert binary number to decimal number\n");
    printf("2. Convert octal number to decimal number \n");
    printf("3. Convert hexadecimal number to decimal number\n");
    printf("4. Exit\n");
    printf("==================================================\n");
}

int main() {
    int opt;
    do {
        system("cls");
        menu();
        printf("Your opt? ");
        scanf("%d", &opt);
        switch (opt) {
            case 1:
                printf("\n");
                opt1();
                break;
            case 2:
                printf("\n");
                opt2();
                break;
            case 3:
                printf("\n");
                opt3();
                break;
            case 4:
                break;
            default:
                printf("-----wrong option------\n");
        }
        if (opt != 4) {
            printf("\n\n");
            fflush(stdin);
            system("pause");
        }
    } while (opt != 4);
    system("pause");
}

int ToDecimal(char* n, int base, int len) {
    int dec = 0, j = 0;
    for (int i = len - 1; i >= 0; i--) {
        int check = 0;
        if (n[i] >= 'a' && n[i] <= 'f') {
            check = n[i] - 'a' + 10;
        } else if (n[i] >= 'A' && n[i] <= 'F') {
            check = n[i] - 'A' + 10;
        } else
            check = n[i] - '0';

        dec += check * pow(base, j);
        j++;
    }
    return dec;
}

void opt1() {
    char n[16] = {0};
    int base = 2;
    printf("Enter binary number: ");
    fflush(stdin);
    gets(n);
    int len = strlen(n);
    printf("Decimal number is: %d", ToDecimal(n, base, len));
}

void opt2() {
    char n[16] = {0};
    int base = 8;
    printf("Enter octal number: ");
    fflush(stdin);
    gets(n);
    int len = strlen(n);
    printf("Decimal number is: %d", ToDecimal(n, base, len));
}

void opt3() {
    char n[16] = {0};
    int base = 16;
    printf("Enter Hex number: ");
    fflush(stdin);
    gets(n);
    int len = strlen(n);
    printf("Decimal number is: %d", ToDecimal(n, base, len));
}