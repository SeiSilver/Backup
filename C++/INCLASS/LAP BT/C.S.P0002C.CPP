#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void movedata(int *i, char *input) {
    for (int j = *i; input[j] != '\0'; j++) {
        input[j] = input[j + 1];
    }
    *i -= 1;
}

void FixString(char *num) {
    int len = strlen(num);
    for (int i = 0; i < len; i++) {
        if (num[i] == ' ') movedata(&i, num);
    }
}

void convert(char *num, char *str) {
    int length = strlen(num);
    for (int i = 0; i < length; i++) {
        int stt = 1;
        if (length - i == 2 || length - i == 5 || length - i == 8) {
            if (num[i] == '1') {
                switch (num[i + 1]) {
                    case '0':
                        strcat(str, "Ten ");
                        break;
                    case '1':
                        strcat(str, "ELeven ");
                        break;
                    case '2':
                        strcat(str, "Twelve ");
                        break;
                    case '3':
                        strcat(str, "Thirteen ");
                        break;
                    case '4':
                        strcat(str, "Fourteen ");
                        break;
                    case '5':
                        strcat(str, "Fifteen ");
                        break;
                    case '6':
                        strcat(str, "Sixteen ");
                        break;
                    case '7':
                        strcat(str, "Seventeen ");
                        break;
                    case '8':
                        strcat(str, "Eighteen ");
                        break;
                    case '9':
                        strcat(str, "Nineteen ");
                        break;
                }
                stt = 0;
            } else
                switch (num[i]) {
                    case '1':
                        strcat(str, "One ");
                        break;
                    case '2':
                        strcat(str, "Twenty ");
                        break;
                    case '3':
                        strcat(str, "Thirty ");
                        break;
                    case '4':
                        strcat(str, "Fourty ");
                        break;
                    case '5':
                        strcat(str, "Fifty ");
                        break;
                    case '6':
                        strcat(str, "Sixty ");
                        break;
                    case '7':
                        strcat(str, "Seventy ");
                        break;
                    case '8':
                        strcat(str, "Eighty ");
                        break;
                    case '9':
                        strcat(str, "Ninety ");
                        break;
                    default:
                        break;
                }
        } else if (stt != 0)
            switch (num[i]) {
                case '1':
                    strcat(str, "One ");
                    break;
                case '2':
                    strcat(str, "Two ");
                    break;
                case '3':
                    strcat(str, "Three ");
                    break;
                case '4':
                    strcat(str, "Four ");
                    break;
                case '5':
                    strcat(str, "Five ");
                    break;
                case '6':
                    strcat(str, "Six ");
                    break;
                case '7':
                    strcat(str, "Seven ");
                    break;
                case '8':
                    strcat(str, "Eight ");
                    break;
                case '9':
                    strcat(str, "Nine ");
                    break;
                default:
                    break;
            };
        if (stt == 0) i += 1;
        switch (length - i) {
            case 3:
            case 6:
            case 9:
            case 12:
                if (num[i] != '0') strcat(str, "Hundred ");
                break;
            case 4:
                if (num[i] != '0' || num[i - 1] != '0' || num[i - 2] != '0') strcat(str, "Thousand ");
                break;
            case 7:
                if (num[i] != '0' || num[i - 1] != '0' || num[i - 2] != '0') strcat(str, "Million ");
                break;
            case 10:
                strcat(str,"Billion ");
                break;
        }
    }
}

int main() {
    char num[13];
    char string[1000000] = {};
    printf("Enter string: ");
    gets(num);
    FixString(num);
    convert(num, string);
    printf("The converted string: \n");
    puts(string);
    system("pause");
}