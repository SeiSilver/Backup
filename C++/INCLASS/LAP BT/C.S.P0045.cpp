// 47
// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void swap(char a[], char b[]) {
    char c[50];
    strcpy(c, a);
    strcpy(a, b);
    strcpy(b, c);
}

void sort(char str[][50], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (strcmp(str[i], str[j]) > 0) swap(str[i], str[j]);
        }
    }
}

void printarry(char str[][50], int n) {
    printf("List input name:\n");
    for (int i = 0; i < n; i++) {
        printf("%d. ", i + 1);
        puts(str[i]);
    }
}

int main() {
    int n;
    printf("Enter the value of N: ");
    scanf("%d", &n);
    printf("Enter %d names\n", n);

    char str[n][50];

    for (int i = 0; i < n; i++) {
        fflush(stdin);
        gets(str[i]);
    }

    printarry(str, n);
    sort(str, n);
    printarry(str, n);

    system("pause");
}
