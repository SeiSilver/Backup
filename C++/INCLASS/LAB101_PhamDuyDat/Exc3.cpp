// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void GetInputFile(char* filename, char* str) {
    FILE* f = fopen(filename, "r+");
    char c;
    while (c = fgetc(f) != EOF) {
        fseek(f,-1,SEEK_CUR);
        fgets(str, 100000, f);
        // fscanf(f,"%s",str);
    }
    fclose(f);
    printf("read file to string complete!\n\n");
}

void Convert(char* str) {
    int len = strlen(str);
    printf("String before convert: \n%s\n",str);
    str[0] = toupper(str[0]);
    for (int i = 0; i < len; i++) {
        if (str[i] == ' ' ) {
            str[i + 1] = toupper(str[i + 1]);
        }
    }
    printf("String after convert: \n%s\n",str);
}

void WriteFile(char* str) {
    char path[] = "./LAB101_PhamDuyDat/sample2.txt";
    FILE* f = fopen(path, "w+");
    char c;
    fprintf(f, "%s", str);
    fclose(f);
    printf("\nFile have been save as sample2.txt\n");
}

int main() {
    char path[] = "./LAB101_PhamDuyDat/sample1.txt";
    char str[1000000] = {};
    GetInputFile(path, str);
    Convert(str);
    WriteFile(str);
    system("pause");
}
