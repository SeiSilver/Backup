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

void funtion1(),funtion2(int n, int len),funtion3(int sum);

int main() {
    printf("Sum Digit Program\n");
    funtion1();
    do {
        funtion1();
        system ("pause");
    } while (true);
}

void funtion1() {
    int n;
    printf("Enter an interger: ");
    scanf("%d",&n);
    int len = floor(log10(abs(n))) + 1; 
    funtion2(n,len);  
}

void funtion2(int n, int len) {
    int sum = 0;
    while (n!= 0) {
        int length = pow(10,len-1);
        int store  = n;
        store = store/length;
        sum +=store;
        n=n%length;
        len--;
    }
    funtion3(sum);
}

void funtion3(int sum) {
    printf("Sum digit: %d\n",sum);
}