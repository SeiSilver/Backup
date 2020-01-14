// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <bits/stdc++.h>
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void printCharWithFreq(char* str) {
    int n = strlen(str);

    int freq[26] = {};

    for (int i = 0; i < n; i++) freq[str[i] - 'a']++;

    printf("Found characters: ");
    for (int i = 0; i < n; i++) {
        if (freq[str[i] - 'a'] == 1) {
            printf("%c ", str[i]);

            freq[str[i] - 'a'] = 0;
        }
    }
    printf("\n");
}

int main() {
    char str[1000];
    printf("Please enter a string: ");
    scanf("%[^\n]", &str);
    puts(str);

    for (int i = 0; i < strlen(str); i++) {
        str[i] = tolower(str[i]);
    }

    printCharWithFreq(str);
    system("pause");
}
