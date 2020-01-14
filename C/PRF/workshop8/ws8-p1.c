// note kiểm tra xem có file trong đường dẫn đó ko
#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#define TRUE 1
#define FALSE 0

int checkfile(), writefile();

int checkfile (FILE* filename) {
    int stt =FALSE;
    if (filename!=NULL) {
        stt =TRUE;
        fclose(filename);
    }    
    return stt;
}

int writefile () {
    char c;
    int CTRL_Z = -1;
    FILE* check= fopen("PRF\\workshop8\\output.txt","r+"); 
    if (checkfile(check)==TRUE) {
        printf("The file output.txt existed. Override it Y/N?: ");
        if (toupper(getchar()) == 'N') return FALSE;
    }
    FILE* f=fopen("PRF\\workshop8\\output.txt","w+");
    fflush(stdin);
    printf("Enter youy text that you want to write to file: \n");
    do {
        c=getchar();
        if (c!=CTRL_Z) fputc(c,f);
    } while (c!=CTRL_Z);
    fclose(f);
    return TRUE;    
}

int main() {
    if (writefile() == FALSE) printf("Fail to Write data to File!\n");
    else printf("Write file complete!\n");
    system("pause");
}