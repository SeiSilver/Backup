// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <iostream>
#include <string>
using namespace std;

void swap(char *a, char *b) {
    char t = *a;
    *a = *b;
    *b = t;
}

void Reverse(char *input) {
    for (int i = 0, j = strlen(input) - 1; i < j; i++, j--) {
        swap(&input[i], &input[j]);
    }
}

void ReverseUpAndLow(char *in) {
    int i = 0;
    while (in[i] != '\0') {
        if (islower(in[i]))
            in[i] = toupper(in[i]);
        else
            in[i] = tolower(in[i]);
        i++;
    }
}

void movedata(int *i, char *input) {
    for (int j = *i; input[j] != '\0'; j++) {
        input[j] = input[j + 1];
    }
    *i -= 1;
}

void removespace(char *input) {
    for (int i = 0; i < strlen(input); i++) {
        if (input[0] == ' ') movedata(&i, input);
        if (input[i] == ' ' && input[i + 1] == ' ') {
            movedata(&i, input);
        }
    }
}

int main() {
    char s[1000] = {};
    cout << "Enter your String: \n";
    gets(s);
    removespace(s);
    Reverse(s);
    ReverseUpAndLow(s);
    puts(s);
    system("Pause");
}