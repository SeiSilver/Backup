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
    char path1[] = "File test/test.txt";
    FILE* f = fopen(path1, "r");
    char str[2][100] = {};
    int a = 0;

    while (!feof(f)) {
        fgets(str[a], 100, f);
        a++;
    }

    for (int i = 0; i < a - 1; i++) {
        printf("%d. %s", i, str[i]);
    }
    system("pause");
}
