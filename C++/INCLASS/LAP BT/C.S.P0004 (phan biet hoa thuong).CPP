// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <bits/stdc++.h>
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void reset(int* freq) {
    for (int i = 0; i < 57; i++) {
        freq[i] = 0;
    }
}

void count(char* str, int* freq, int& n) {
    for (int i = 0; i < n; i++) freq[str[i] - 'A']++;
}

void printtext(char* str, int* freq, int& n) {
    reset(freq);
    count(str, freq, n);
    for (int i = 0; i < n; i++) {
        if (str[i] != ' ')
            if (freq[str[i] - 'A'] != 0) {
                printf("%c ", str[i]);
                freq[str[i] - 'A'] = 0;
            }
    }
    printf("\n");
}

void printrepeat(char* str, int* freq, int& n) {
    reset(freq);
    count(str, freq, n);
    for (int i = 0; i < n; i++) {
        if (str[i] != ' ') {
            if (freq[str[i] - 'A'] != 0) {
                printf("%d ", freq[str[i] - 'A']);
                freq[str[i] - 'A'] = 0;
            }
        }
    }
    printf("\n");
}

void findmost(int* freq, char* str, int n) {
    count(str, freq, n);
    int max = freq[0];
    for (int i = 0; i < 57; i++) {
        if (max < freq[i]) max = freq[i];
    }
    printf("Characters that appears the most: \n");
    if (max != 0) {
        for (int i = 0; i < n; i++) {
            if (str[i] != ' ')
                if (freq[str[i] - 'A'] == max) {
                    printf("%c ", str[i]);
                    freq[str[i] - 'A'] = 0;
                }
        }
        reset(freq);
        count(str, freq, n);

        printf("\n");
        for (int i = 0; i < n; i++) {
            if (str[i] != ' ') {
                if (freq[str[i] - 'A'] == max) {
                    printf("%d ", freq[str[i] - 'A']);
                    freq[str[i] - 'A'] = 0;
                }
            }
        }
    }
    printf("\n");
}

void printCharWithFreq(char* str) {
    int n = strlen(str);

    int freq[57] = {0};

    printf("Times of appearance for each character: \n");
    printtext(str, freq, n);
    printrepeat(str, freq, n);
    findmost(freq, str, n);
}

int main() {
    char str[1000];
    printf("Please enter a string: ");
    scanf("%[^\n]", &str);
    puts(str);
    // phan biet ca hoa lan thuong
    printCharWithFreq(str);
    system("pause");
}
