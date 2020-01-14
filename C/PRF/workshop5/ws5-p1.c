#include <stdio.h>
#include <math.h>
#include <conio.h>
#include <time.h>
#include <stdlib.h>

int intRandom(int min, int max) {
    int r;
    r = min + rand() % (max + 1 - min);
    return r;
}

int main() {
srand((int) time(NULL));
int total, x,y, count=1;
while (total<2 || total >12){
     printf("enter total of two dices: "); scanf("%d",&total);
    }
while (x+y != total) {
     x= intRandom(1,6);
     y= intRandom(1,6);
     printf("Result of throw %d: %d + %d =%d\n", count, x, y, x+y);
     count++;
    }
printf ("You got your total in %d throws\n", count-1);
system("pause");
return 0;
}