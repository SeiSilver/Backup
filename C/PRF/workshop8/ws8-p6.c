// note kiểm tra xem có file trong đường dẫn đó ko
#include<stdlib.h>
#include<stdio.h>
#include<conio.h>

int main()
{   
    char c;
    FILE*input=fopen("PRF\\workshop8\\p6-data.txt","r");
    printf("the first 10 characters: \n\n");
    for (int i =0; i<10;i++) putchar(fgetc(input));
    rewind(input);
    printf("\n\nAfter rewind: \n");
    while ((c=fgetc(input)) != EOF) putchar(c);
    printf("\n\n");
    fclose(input);
    system("pause");
}