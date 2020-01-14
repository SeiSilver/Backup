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

void func1(char path1[], char path2[]), func2(char path1[], char path2[]), func3(char path1[], char path2[]);
void sort(char path1[], char path2[]);
int getLineInFile(char* filename);

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
    char path1[] = "./LongLAB/C.L.24 copy/word.txt";
    char path2[] = "./LongLAB/C.L.24 copy/meaning.txt";
    do {
        system("cls");
        menu();
        printf("Your opt? ");
        scanf("%d", &opt);
        switch (opt) {
            case 1:
                func1(path1, path2);
                break;
            case 2:
                func2(path1, path2);
                break;
            case 3:
                func3(path1, path2);
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

int writefile(char* filename, int stt) {
    char input[10000] = {};
    FILE* f = fopen(filename, "a+");
    fflush(stdin);
    do {
        gets(input);
    } while (strcasecmp(input, "\n") == 0);

    char in;
    rewind(f);
    int count = getLineInFile(filename);
    int i = 0;
    while (!feof(f) && i++ < count) {
        char check[1000] = {};
        fgets(check, 1000, f);
        check[strlen(check) - 1] = '\0';
        if (strcasecmp(input, check) == 0) {
            if (stt == 0) {
                printf("This word aready exit!\n");
                fclose(f);
                return 0;
            } else {
                printf("There is a word with this meaning please try again!\n");
                fclose(f);
                return writefile(filename, 1);
            }
        }
    }
    fseek(f, 0, SEEK_END);
    input[0] = toupper(input[0]);
    fputs(input, f);
    fputs("\n", f);
    fclose(f);
    return 1;
}

void func1(char path1[], char path2[]) {
    printf("Enter a new word: ");
    if (writefile(path1, 0) == 0) return;
    printf("Enter Meaning: ");
    writefile(path2, 1);
    sort(path1, path2);
}

void getinputfile(char* filename, int count, char sorted[][10000]) {
    FILE* f = fopen(filename, "r");
    int i = 0;
    while (!feof(f) && i < count) {
        fgets(sorted[i], 10000, f);
        sorted[i][strlen(sorted[i]) - 1] = '\0';
        // fscanf(f, "%s", sorted[i]);
        i++;
    }
    fclose(f);
}

int getLineInFile(char* filename) {
    FILE* f = fopen(filename, "r");
    int count = 0;
    for (char c = getc(f); c != EOF; c = getc(f))
        if (c == '\n')
            count++;
    fclose(f);
    return count;
}

void func2(char path1[], char path2[]) {
    int count = getLineInFile(path1);
    char word[count][10000] = {};
    char meaning[count][10000] = {};

    getinputfile(path1, count, word);
    getinputfile(path2, count, meaning);

    for (int i = 0; i < count; i++) {
        printf("%d. %-20s %-20s\n", i, word[i], meaning[i]);
    }

    printf("Enter a word to update: ");
    fflush(stdin);
    char update[10000] = {};
    gets(update);

    for (int i = 0; i < count; i++) {
        if (strcasecmp(word[i], update) == 0) {
            fflush(stdin);
            printf("Meaning: ");
            gets(update);
            strcpy(meaning[i], update);
            FILE* f2 = fopen(path2, "w");
            for (int i = 0; i < count; i++) {
                fputs(meaning[i], f2);
                fputc('\n', f2);
            }
            fclose(f2);
            return;
        }
    }
    printf("Not found!\n");
}

void func3(char path1[], char path2[]) {
    FILE* f1 = fopen(path1, "r");
    FILE* f2 = fopen(path2, "r");
    char input[10000] = {};
    printf("Enter word want to look: ");
    fflush(stdin);
    gets(input);

    char in = '0';

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

void swap(char a[], char b[]) {
    char t[10000];
    strcpy(t, a);
    strcpy(a, b);
    strcpy(b, t);
}

void sort(char path1[], char path2[]) {
    int count = getLineInFile(path1);
    char word[count][10000] = {};
    char meaning[count][10000] = {};

    getinputfile(path1, count, word);
    getinputfile(path2, count, meaning);

    for (int i = 0; i < count - 1; i++) {
        for (int j = i + 1; j < count; j++) {
            if (strcmp(word[i], word[j]) > 0) {
                swap(word[i], word[j]);
                swap(meaning[i], meaning[j]);
            }
        }
    }
    FILE* f1 = fopen(path1, "w+");
    FILE* f2 = fopen(path2, "w+");
    for (int i = 0; i < count; i++) {
        fputs(meaning[i], f2);
        fputc('\n', f2);
        fputs(word[i], f1);
        fputc('\n', f1);
    }
    fclose(f1);
    fclose(f2);
}