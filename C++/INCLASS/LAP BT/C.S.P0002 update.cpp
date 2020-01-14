#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <conio.h>

void movedata(int *i, char *input){
    for (int j = *i; input[j] != '\0'; j++)
    {
        input[j] = input[j + 1];
    }
    *i-=1;
}

void FixString(char* num) {
	int len = strlen(num);
	for (int i = 0; i < len; i++) {
        if (num[i] == ' ') movedata(&i,num);
    }
}

void convert(char *num) {
    int length = strlen(num);
    
    for (int i = 0; i < length; i ++) {
        int stt = 1;
        if (length - i == 2 || length - i == 5 || length - i == 8) {   
            if (num[i] == '1') {
            switch (num[i+1]) {
                case '0': printf("Ten "); break;
                case '1': printf("ELeven "); break;
                case '2': printf("Twelve "); break;
                case '3': printf("Thirteen "); break;
                case '4': printf("Fourteen "); break;
                case '5': printf("Fifteen "); break;
                case '6': printf("Sixteen "); break;
                case '7': printf("Seventeen "); break;
                case '8': printf("Eighteen "); break;
                case '9': printf("Nineteen "); break;
            } stt = 0;
            }
            else
            switch (num[i]){
            case '1': printf( "One ");break;
            case '2':printf( "Twenty ");break;
            case '3':printf( "Thirty ");break;
            case '4':printf( "Fourty ");break;
            case '5':printf( "Fifty ");break;
            case '6':printf( "Sixty ");break;
            case '7':printf( "Seventy ");break;
            case '8':printf( "Eighty ");break;
            case '9':printf( "Ninety ");break;
            default:
                break;
            }
        }
        else if (stt != 0)
            switch (num[i])
            {
            case '1':printf("One ");break;
            case '2':printf("Two ");break;
            case '3':printf("Three ");break;
            case '4':printf("Four ");break;
            case '5':printf("Five ");break;
            case '6':printf("Six ");break;
            case '7':printf("Seven ");break;
            case '8':printf("Eight ");break;
            case '9':printf("Nine "); break;
            default:
                break;
            };
		if (stt==0) i+=1;
         //100 000
        switch (length - i)
        {
        case 3:
        case 6:
        case 9: if (num[i] != '0') printf("Hundred "); break;
		case 4: if (num[i] != '0' || num[i-1]!='0' || num[i-2]!= '0' ) printf("Thousand "); break ;
                // else printf("Thousand "); break;
        case 7: if (num[i] != '0' || num[i-1]!='0' || num[i-2]!= '0' ) printf("Million "); break;
        case 10: printf("Billion "); break;
        }
    }
}

int main() {
    char num[13];
	gets(num);
    FixString(num);
    convert(num);
	printf("\n");
    system("pause");
}