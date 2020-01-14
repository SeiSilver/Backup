/* 
   name: Pham Duy Dat
   Class: SE1403
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <ctype.h>

void swap(int *a, int *b) {
    char t =*a;
    *a = *b;
    *b = t;
}

void reverse(int* input, int dem)
{
    for (int i = 0, j = dem - 1; i < j; i++, j--)
    {
        swap(&input[i], &input[j]);
    }
}

int DecToBin(int n, int base) {
    int arr[100] = {};
    int i = 0;
    while (n != 0) {
        arr[i] = n%base;
        n = n/base;
        i++;
    }
    reverse(arr,i);

    for (int a = 0 ; a<i;a++) {
        char hold;
        // if (arr[a] > 10 ) printf("%c",(char) arr[a]-10+ 'A') ;
        // else printf("%c",arr[a] + '0');
        if (arr[a] > 10 ) hold = (char) arr[a]-10+ 'A';
        else hold = arr[a] + '0';
        printf("%c",hold);
    }
    printf("\n");
}

int main () {
    int n,base;
    int bin = 0;
    printf("Enter number: ");
    scanf("%d",&n);
    printf("Enter base: ");
    scanf("%d",&base);
    DecToBin(n,base);
    system("pause");
}