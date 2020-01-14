 
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int checkadate(int d, int m, int y) {
    int maxd=31;
    if (d<1||d>31||m<1||m>12) return 0;
    if (m==4||m==6||m==9||m==11) maxd=30;
    else if (m==2){
        if (y%400==0|| (y%4==0 && y%100!=0)) 
        maxd=29;
        else maxd=28;
    } return d<=maxd;
}

int func1() {
    int day,month,year;
    printf("\nenter day: "); scanf ("%d",&day);
    printf("enter month: "); scanf ("%d",&month);
    printf("enter year: "); scanf ("%d",&year); 
    if (checkadate(day,month,year)) printf("Valid date\n\n");
    else printf("Invalid date\n\n");
}

int swap(char *ac1, char *ac2) {
    char t=*ac1;
    *ac1=*ac2;
    *ac2=t;
}

int func2() {
    char c1,c2;
    char *ac1=&c1, *ac2=&c2;
    printf("\nEnter c1:"); scanf(" %c",&c1);
    printf("Enter c2:"); scanf(" %c",&c2);
    printf ("Characters between %c and %c in descending order \n",c1,c2);
    if (c1<c2) swap(&c1,&c2);
    for (char i=*ac1;i>=*ac2;i--) {
        printf("%c, %4d, %4o, %4X\n",i,i,i,i);
    } 
}

int main()  {
    int opt;
    float x;
    do {
        system("cls");
        printf("1- Processing date data \n");
        printf("2- Character data \n");
        printf("3- Quit \n");
        printf("Your opt? ");    scanf("%d",&opt);
        switch(opt)  {
            case 1: func1();  break;
            case 2: func2();  break;
            case 3: break;
            default: printf("ERROR \n");
            }
        if (opt!=3) { fflush(stdin); system("pause");}
    }
    while (opt!=3);
    system ("pause");
    return 0;
}