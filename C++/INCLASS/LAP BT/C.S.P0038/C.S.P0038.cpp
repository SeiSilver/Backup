// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int checkfile(FILE* filename) {
    if (filename != NULL) {
        return true;
    }
    return false;
}

void printfile(char* filename) {
    char in;
    FILE* check = fopen(filename, "r+");
    if (!checkfile(check)) {
        printf("File doesn't exit!\n");
        return;
    }
    printf("File context: \n\n");
    while ((in = fgetc(check)) != EOF) putchar(in);
    printf("\n");
    fclose(check);
}

int main() {
    char path[1000] = {};
    // char defpath[] = {"LAP BT\\C.S.P0038\\"};
    printf("Enter the file path: ");
    gets(path);
    // strcat(defpath, path);
    printf("Path: ");
    puts(path);
    // printf("File context: \n");
    printfile(path);
    system("pause");
}
