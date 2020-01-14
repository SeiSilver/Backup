// note kiểm tra xem có file trong đường dẫn đó ko
#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#define Maxint 100000

int main()
{   
    char c;
    FILE*input=fopen("PRF\\workshop8\\p7-data.txt","r");
    printf("the first 15 characters: \n\n");
    for (int i =0; i<15;i++) putchar(fgetc(input));
    puts("\n");

    fseek(input,-5,SEEK_CUR);
    for (int i =0; i<5;i++) putchar(fgetc(input));
    puts("\n");
    
    fseek(input,-8,SEEK_END);
    for (int i =0; i<5;i++) putchar(fgetc(input));
    puts("\n");

    fseek(input,10,SEEK_SET);
    for (int i =0; i<5;i++) putchar(fgetc(input));
    puts("\n");

    fclose(input);
    system("pause");
}