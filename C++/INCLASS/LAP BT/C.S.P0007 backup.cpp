/* 
   name: Pham Duy Dat
   Class: SE1403
   ID: DE140191
 */

#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void movedata(int *i, char *input) {
    for (int j = *i; input[j] != '\0'; j++) {
        input[j] = input[j + 1];
    }
    *i -= 1;
}

void swap(char *a, char *b) {
    char t = *a;
    *a = *b;
    *b = t;
}

void reverse(char *input) {
    for (int i = 0, j = strlen(input) - 1; i < j; i++, j--) {
        swap(&input[i], &input[j]);
    }
}

void change(char *input) {
    int len = strlen(input);
    for (int i = 0; i < len; i++) {
        if (input[i] == toupper(input[i]))
            input[i] = tolower(input[i]);
        else
            input[i] = toupper(input[i]);
    }
}

int main() {
    char input[100] = {};
    printf("Please enter a string: ");
    gets(input);
    int len = strlen(input);
    printf("The string after removing:");
    for (int i = 0; i < len; i++) {
        input[0] = toupper(input[0]);
        if (input[0] == ' ') movedata(&i, input);
        if (input[i] == ' ' && input[i + 1] == ' ') {
            movedata(&i, input);
        }
        if (input[i] == ' ' && input[i + 1] != ' ') input[i + 1] = toupper(input[i + 1]);
    }

    puts(input);
    reverse(input);
    puts(input);
    change(input);
    puts(input);

    system("pause");
}