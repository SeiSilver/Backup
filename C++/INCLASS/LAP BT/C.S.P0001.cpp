// C.S.P0001

#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void reverse(char*s), check(char*s);

int main() {
    char c;
    do {
        char s[100] = {};
        printf("Please enter string: ");
        scanf("%[^\n]", &s);
        check(s);
        printf("The old String: ");
        puts(s);
        reverse(s);
        printf("The reversed string: ");
        puts(s);
        fflush(stdin);
        printf("Press Enter to continue, ESC to exit \n");
        c = getch();
    } while (c != 27);
    system("pause");
}

void movedata(int* i, char* input) {
    for (int j = *i; input[j] != '\0'; j++) {
        input[j] = input[j + 1];
    }
    *i -= 1;
}

void reverse(char* s) {
    char save[10][100] = {};
    int i = 0;
    char* token = strtok(s, " ");

    while (token != NULL) {
        strcpy(save[i++], token);
        token = strtok(NULL, " ");
    }
    // reset s
    strcpy(s, "");
    for (int dem = i - 1; dem >= 0; dem--) {
        strcat(s, save[dem]);
        strcat(s, " ");
    }
}

void check(char* s) {
    int len = strlen(s);
    for (int i = 0; i < len; i++) {
        if (s[0] == ' ') movedata(&i, s);
        if (s[i] == ' ' && s[i + 1] == ' ') {
            movedata(&i, s);
        }
    }
}
