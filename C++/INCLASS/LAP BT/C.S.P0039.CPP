/* 
   Name: Pham Duy Dat
   ID: DE140191
   Class: SE1403
 */
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <time.h>
#include <math.h>
#include <ctype.h>

void function1(), function2(),function3();

void menu() {
    printf("---------------------------\n");
    printf("1. Processing date data.\n");
    printf("2. Character data.\n");
    printf("3. Quit.\n");
    printf("---------------------------\n");
}

int main() {
    int option;
    do {
    system("cls");
    menu();
    printf("Your option? ");   scanf("%d",&option);
    switch(option)  {
            case 1: printf("\n"); function1(); break;
            case 2: printf("\n"); function2(); break;
            case 3: break;
            default: printf("\n-----wrong option------\n"); break;
            }
        if (option!=3) { 
            printf("\n");
            fflush(stdin);
            system ("pause");
        }
    } while (option!=3);
}

int valid(int d, int m, int y){
    int maxd=31;
    if (d<1||d>31||m<1||m>12) return 0;
    if (y <1900 || y>9999) return 0;
    if (m==4||m==6||m==9||m==11) maxd=30;
    else if (m==2) {
        if (y%400==0|| (y%4==0 && y%100!=0)) 
        maxd=29;
        else maxd=28;
    }
    return d<=maxd;
}

void function1() {
    int d,m,y;
    printf(" enter d: "); scanf("%d",&d);
    printf(" enter m: "); scanf("%d",&m);
    printf(" enter y: "); scanf("%d",&y);
    if (valid(d,m,y)) printf("valid date");
    else printf("invalid date");
}

void function2() {
    char c1=0,c2=0,t;
    fflush(stdin);
    printf("enter c1: "); scanf("%c",&c1);
    fflush(stdin);
    printf("enter c2: "); scanf(" %c",&c2);
    if (c1>c2) {
        t=c1;
        c1=c2;
        c2=t;
    }
    for (int i=c2;i>=c1;i--) {
        printf ("%c: %d\n",i,i);
    }
}