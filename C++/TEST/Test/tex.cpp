// #include <stdio.h>
// #include <stdlib.h>
// #include <string.h>
// #include <conio.h>
// #include <ctype.h>
// #include <math.h>

// const char* donvi[] = {"","one","two","three","four","five","six","seven","eight","nine"};
// const char* chuc[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"}; 
// const char* chuc_donvi[] = {"","","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
// const char* ti_le[] = {"hundred", "thousand", "million","billion"};

// void insert(char* num) {
//     int dem = 0;
//     for (int i = 0; i < strlen(num);i++) {
//         dem+=1;
//         if (dem ==4) {
//             int j;
//             for (j = strlen(num)-1; j >=i;j--) {
//                 num[j+1]=num[j];
//             }
//             num[i] = ' ';
//             dem =0;
//         }     
//     }
//     printf("\n%s\n",num);
// }

// void swap(char *a, char *b) {
//     char t =*a;
//     *a = *b;
//     *b = t;
// }

// void reverse(char* input) {
//     for (int i = 0, j = strlen(input)-1 ;i<j;i++,j--) {
//         swap(&input[i],&input[j]);
//     }
// }

// void convert(int val, int *dem) {

//     int n = val/100;
//     if (n!=0) {
//         printf("%s %s", donvi[n], ti_le[0]);
//     }

//     if (val%100 >=10 && val%100<=19) {
//         printf(" %s", chuc[val%100-10]);
//     }
//     else if (val%100<10) printf("%s", chuc[val]);
//     else {
//         printf(" %s", chuc_donvi[val%100/10]);
//         printf(" %s", donvi[val%100%10]);
//     }
// }

// void converttoword (char* num, int len) {
//     char store[10][3] = {};
//     reverse(num);
//     insert(num);
//     char* token = strtok(num," ");
//     int i =0;
//     while (token != NULL) {
//         strcpy(store[i++],token);
//         token = strtok(NULL," ");
//     }

//     for (int a = 0; a <i;a++) {
// 	    char t = store[a][2];
//         store[a][2] = store[a][0];
//         store[a][0] = t;
//     }
//     i--;

//     while (len > 0) {
//         char str[3] = {};
//         strcpy(str,store[i]);
//         int val = atoi(str);
//         convert(val, &i);
//         if (len >=10 ) printf(" billion");
//         else if (len>=7) printf(" million");
//         else if (len >=4) printf(" thousand");
//         len-=3;
//         i-=1;
//     }
// }

// int main() {
//     char num[13] = {}; 
//     scanf("%s",&num);
//     int len = strlen(num);
//     converttoword(num,len);
//     printf("\n");
//     system("pause");
// }
