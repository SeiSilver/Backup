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
#include <iostream>
#include <string>
using namespace std;

void func1(), func2(), func3();
int getLineInFile(char* filename);

char word[] = "_index.txt";
char meaning[] = "_meaning.txt";
char path[] = "Assignment/C.L.24/";
char filename[10000] = "";
char c[2] = "";

void menu() {
    printf("=====================================\n");
    printf("1. Create a new word                |\n");
    printf("2. Edit a word                      |\n");
    printf("3. Look up meaning                  |\n");
    printf("4. Exit                             |\n");
    printf("=====================================\n");
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
                func1();
                break;
            case 2:
                func2();
                break;
            case 3:
                func3();
                break;
            case 4:
                break;
            default:
                printf("-----wrong option------\n");
        }
        if (opt != 4) {
            printf("\n");
            system("pause");
        }
    } while (opt != 4);
}

void getpath(int stt) {
    strcpy(filename, "");
    strcat(filename, path);
    c[0] = tolower(c[0]);
    strcat(filename, c);
    if (stt == 0)
        strcat(filename, word);
    else if (stt == 1)
        strcat(filename, meaning);
}

void writefile(int stt) {
    char input[10000] = {};
    fflush(stdin);
    gets(input);
    if (stt == 0) c[0] = input[0];
    getpath(stt);
    FILE* f = fopen(filename, "a+");
    fputs(input, f);
    fputs("\n", f);
    fclose(f);
}

void func1() {
    printf("Enter a new word: ");
    writefile(0);
    printf("Enter Meaning: ");
    writefile(1);
}

void getinputfile(int count, char sorted[][10000]) {
    FILE* f = fopen(filename, "r");
    int i = 0;
    while (!feof(f) && i < count) {
        fgets(sorted[i], 10000, f);
        sorted[i][strlen(sorted[i]) - 1] = '\0';
        i++;
    }
    fclose(f);
}

int countLine() {
    FILE* f = fopen(filename, "r");
    int count = 0;
    for (char c = getc(f); c != EOF; c = getc(f))
        if (c == '\n')
            count++;
    fclose(f);
    return count;
}

void func2() {
    printf("Enter a word to update: ");
    fflush(stdin);
    char update[10000] = {};
    gets(update);
    c[0] = update[0];
    getpath(0);
    int count = countLine();
    char w[count][10000] = {};
    char m[count][10000] = {};
    getinputfile(count, w);
    getpath(1);
    getinputfile(count, m);

    for (int i = 0; i < count; i++) {
        printf("%d. %-20s %-20s\n", i, w[i], m[i]);
    }

    for (int i = 0; i < count; i++) {
        if (strcasecmp(w[i], update) == 0) {
            fflush(stdin);
            printf("Meaning: ");
            gets(update);
            strcpy(m[i], update);
            FILE* f = fopen(filename, "w");
            for (int i = 0; i < count; i++) {
                fputs(m[i], f);
                fputc('\n', f);
            }
            fclose(f);
            return;
        }
    }
    printf("Word doen't exist!\n");
}

void func3() {
    char input[10000] = {};
    printf("Enter word want to look: ");
    fflush(stdin);
    gets(input);
    c[0] = input[0];
    getpath(0);
    FILE* f1 = fopen(filename, "r");
    getpath(1);
    FILE* f2 = fopen(filename, "r");

    char in = '\0';

    while ((in = getc(f1)) != EOF) {
        fseek(f1, -1, SEEK_CUR);
        char check[10000] = {};
        // fscanf(f1, "%[^\n]", check);
        fgets(check, 10000, f1);
        check[strlen(check) - 1] = '\0';
        char data[1000] = {};
        // fscanf(f2, "%[^\n]", data);
        fgets(data, 10000, f2);
        data[strlen(data) - 1] = '\0';

        // muc dich la di chuyen con tro toi line thu n
        if (strcasecmp(input, check) == 0) {
            printf("Meaning: ");
            puts(data);
            return;
        }
    }
    printf("Word doesn't exit!\n");
}