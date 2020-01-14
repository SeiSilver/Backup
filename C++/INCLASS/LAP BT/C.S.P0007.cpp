/* 
   name: Pham Duy Dat
   Class: SE1403
   ID: DE140191
 */

#include <conio.h>
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

void removespace(char *input, int len) {
    for (int i = 0; i < len; i++) {
        if (input[0] == ' ') movedata(&i, input);
        if (input[i] == ' ' && input[i + 1] == ' ') {
            movedata(&i, input);
        }
    }
}

int check(char *input) {
    for (int i = 0; i < strlen(input); i++) {
        if (input[i] == '@' || input[i] == '#' || input[i] == '!' || input[i] == '[' ||
            input[i] == ']' || input[i] == '{' || input[i] == '}' || input[i] == '(' || input[i] == ')') {
            printf("\nString not allowed @ # ! [ ] { } ( ) \nPlease enter Again!\n\n");
            return false;
        }
    }
    return true;
}

void inputData(char *input) {
    printf("Please enter a string: ");
    fflush(stdin);
    gets(input);
    if (check(input) == false) inputData(input);
}

int main() {
    char c;
    do {
        char input[100] = {};
        inputData(input);
        int len = strlen(input);
        printf("The string after removing: ");
        removespace(input, len);
        puts(input);
        printf("Press Enter to continue, ESC to exit \n");
        c = getch();
    } while (c != 27);

    system("pause");
}