/* 
   name: Pham Duy Dat
   Class: SE1403
 */
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <time.h>
#include <math.h>
#include <ctype.h>

void function1(), function2(int n),function3(int n, int square, int stt);

int main() {
    printf("Check Square number Program\n");
    function1();
    system("pause");
}

void function1() {
    int n;
    printf("Enter a positve number: ");
    do {
    if (n <0) {
        printf ("\nPlease enter a positve number!\n");
        system("pause");
        printf("\nEnter a positve number: ");
    } 
        scanf("%d",&n);
    } while (n < 0);
    function2(n);
}

void function2(int n) {
    int square,stt;
    float check;
    
    check = sqrt((double)n);
    square = check;
    
    if (square == check) stt = 1;
    else stt = 0;
    function3(n,square,stt);
}

void function3(int n, int square, int stt) {
    if (stt == 1 ) {
        printf("\n%d is a square number %d = %d x %d\n\n",n,n,square,square);
        system("pause");
        printf("\n");
    }
    else {
        printf("%d is not a square number\n\n",n);
        system("pause");
        printf("\n");
    } 
    while (true) {
        function1();
    }
}