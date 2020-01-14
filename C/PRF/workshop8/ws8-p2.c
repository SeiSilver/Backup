// note kiểm tra xem có file trong đường dẫn đó ko
#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>
#define TRUE 1
#define FALSE 0

int checkfile(), writefile();

int checkfile (FILE* filename) {
    int stt =FALSE;
    if (filename!=NULL) {
        stt =TRUE;
    }    
    return stt;
}

int writefile () {
    char input[201];
    int length;
    FILE* check= fopen("PRF\\workshop8\\output.txt","r");
    if (checkfile(check)==TRUE) {
        printf("The file output.txt existed. Override it Y/N?: ");
        if (toupper(getchar()) == 'N') return FALSE;
    }
    FILE* f=fopen("PRF\\workshop8\\output.txt","w+");
    fflush(stdin);
    printf("Enter youy text that you want to write to file (enter to exit): \n");
    do {
        gets(input);
        length=strlen(input);
        if (length>0) {
            fputs(input,f);
            fputs("\n",f);
        }
    } while (length>0);
    fclose(check);
    fclose(f);
    return TRUE;    
}
int printfile() {
    char in;
    FILE* check= fopen("PRF\\workshop8\\output.txt","r+");
    if (checkfile(check)==FALSE) {
        printf("File does not exit. \n");
        return 0;
    }
    while ((in=fgetc(check)) != EOF ) putchar(in);
    fclose(check);
}

int main() {
    if (writefile() == FALSE) printf("Fail to Write data to File!\n");
    else printf("Write file complete!\n\n");
    printf("Data in the text file:\n\n");
    printfile();
    system("pause");
}