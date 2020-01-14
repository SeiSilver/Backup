#include <stdio.h>
#include <conio.h>
#include <math.h>
#include <stdlib.h>

double fibo(int n){
    double t1=1,t2=1,f=1;
    for (int i=3;i<=n;i++) {
        f=t1+t2;
        t1=t2;
        t2=f; 
    }
    return f;
}

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


int main() {
    int stt, choice;
    double n;
    int day,month,year;
    do {
       system ("cls");
       printf ("1- Fibonacci sequence\n");
       printf ("2- Check a date\n");
       printf ("3- Quit\n");
       printf ("Select an operation: "); scanf("%d",&choice);
       switch(choice) {
            case 1: do {printf("\nenter value: "); scanf ("%lf",&n);}
                    while (n<0);
                    printf("The first %.0lf Fibonacci numbers: \n",n);
                    for (int i=1;i<=n;i++) {
                    printf("%.0lf\n", fibo(i)); }
                    break; 
            case 2: printf("\nenter day: "); scanf ("%d",&day);
                    printf("enter month: "); scanf ("%d",&month);
                    printf("enter year: "); scanf ("%d",&year); 
                    if (checkadate(day,month,year)) printf("Valid date\n");
                    else printf("Invalid date\n");
                    break;
        } 
    if (choice==1 || choice==2) getchar(); getchar();
    } while ((choice>0) && (choice<3)); 
system("pause");
return 0;
}