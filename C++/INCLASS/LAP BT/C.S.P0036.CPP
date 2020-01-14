// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <string>
using namespace std;

void printCharWithFreq(char *str) {
    int c[26] = {0};
    for (int i = 0; str[i] != '\0'; i++) {
        if (!isalpha(str[i]))
            continue;

        if (isupper(str[i]))
            str[i] = tolower(str[i]);
        c[str[i] - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
        if (c[i] != 0)
            printf("%c: %3d\n", i + 'a', c[i]);
    }
}

int main() {
    char str[1000];
    printf("Please enter a string: ");
    gets(str);
    printCharWithFreq(str);
    system("pause");
}
