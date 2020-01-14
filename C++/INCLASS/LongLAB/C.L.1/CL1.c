/*
    Name: Do Viet Khoa
    Code: DE140034
    Class: SE1403
    Status: Complete 
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 50000

int keyCheck(char*);

int recommend(char*);

void search() {
    char key[15];
    char option[3];
    int stt = 0;
    do {
        stt = 0;
        printf("Please enter the word you would like checked.\n");
        gets(key);

        stt = keyCheck(key);

        if (stt == 1)
            printf("Great, %s is in dictionary!\n", key);
        else
            stt = recommend(key);
        if (stt == 0)
            printf("Not exist anyone\n");

        printf("\nWould you like to enter another word?(yes/no)\n");
        gets(option);

        printf("\n");
        fflush(stdin);

    } while ((strcmp(option, "yes") == 0));
}

int main() {
    printf("Welcome to the Spell Checker!\n");

    // char word[MAX][30];
    long long i = 0;
    char key[30];
    char option[3];

    printf("The dictionary has been loaded.\n\n");

    search();

    system("pause");
}

int keyCheck(char* key) {
    FILE* f = fopen("./assigment/LongLAB/C.L.1/dictionary.txt", "r");
    char* checkKey = calloc(30, sizeof(char));
    int stt = 0;

    char word[15];
    int i = 0;
    while (fgets(word, 15, f) && word[0] != EOF) {
        word[strlen(word) - 1] = '\0';
        if (strcmp(word, key) == 0) {
            fclose(f);
            return 1;
        }
    }

    fclose(f);
    return 0;
}

int recommend(char* key) {
    fflush(stdin);
    FILE* f = fopen("./assigment/LongLAB/C.L.1/dictionary.txt", "r");
    char word[15];
    int stt = 0;
    printf("There are some same word: \n");
    while (fgets(word, 15, f) && word[0] != EOF) {
        word[strlen(word) - 1] = '\0';
        if (strspn(word, key) >= (strlen(key) - 2) && strlen(word) <= strlen(key)) {
            printf("%s\n", word);
            stt = 1;
        }
    }
    fclose(f);
    return stt;
}