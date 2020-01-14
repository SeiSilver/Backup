

#include <stdio.h>
#include <math.h>
#include <conio.h>
#include <time.h>

int intRandom(int min, int max) {
    int r;
    r = min + rand() % (max + 1 - min);
    return r;
}

int main() {
srand((int) time(NULL));
int total, x,y, count=1;
while (total<2 || total >20){
     printf("Enter total want to sought: "); scanf("%d",&total);
    }
while (x+y != total) {
     x= intRandom(1,10);
     y= intRandom(1,10);
     printf("Result of picks %d and %d: %d + %d =%d \n", count++, count, x, y, x+y);
     count++;
    }
printf ("You got your total in %d picks!\n", count-1);
system("pause");
return 0;
}