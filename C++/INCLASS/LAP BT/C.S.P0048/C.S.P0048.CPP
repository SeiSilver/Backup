#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TRUE 1
#define FALSE 0

int writefile(char* filename) {
    char input[201];
    int length;

    FILE* f = fopen(filename, "w+");
    fflush(stdin);

    printf("Enter text that you want to write to file (enter to exit): \n");
    do {
        gets(input);
        length = strlen(input);
        if (length > 0) {
            fputs(input, f);
            fputs("\n", f);
        }
    } while (length > 0);
    fclose(f);
    return TRUE;
}

void printfile(char* filename) {
    char in;
    FILE* check = fopen(filename, "r+");

    while ((in = fgetc(check)) != EOF) putchar(in);

    fclose(check);
}

int main() {
    char filename[100] = {};
    printf("Enter the file's name that you want to save: ");
    scanf("%s", &filename);
    char path[] = {"LAP BT\\C.S.P0048\\"};
    strcat(path, filename);

    if (writefile(path) == TRUE) printf("Write file complete!\n\n");

    printf("Data in the text file:\n");
    printfile(path);
    system("pause");
}