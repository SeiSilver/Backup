#include <stdio.h>
#include <math.h>
#include <stdlib.h>

float nhap() {
    float x; int n;
    printf("enter x: "); scanf ("%lf",&x);
    printf("enter n: "); scanf ("%lf",&n);
}

float func1(float x,int n) {
    double s=0;
    for (int i=1;i<=n;i++) {
        double s=pow(x,i); 
        s+=s;  }
    printf ("%.0lf",s);
}

float giaothua(double n) {
        double f=1;
    for (int i=1;i<=n;i++) {
        f*=i;
    } return f; 
}

float func2(double x, int n) {
    double s=1;
    for (int i=1;i<=n;i++) {
        s=pow(x,i)/giaothua(x);
        s+=s;
    }
    printf ("%lf",s);
}

int main()  {
    int opt,n;
    float x;
    do {
        system("cls");
        printf("1: func1 \n");
        printf("2: func2 \n");
        printf("3: Quit \n");
        printf("Your opt? ");    scanf("%d",&opt);
        switch(opt)  {
            case 1: nhap(); func1(x,n);  break;
            case 2: nhap(); func2(x,n);  break;
            case 3: break;
            default: printf("ERROR!");
        }
        if (opt !=3) system ("pause");
    }
    while (opt>0 && opt <4);
    system ("pause");
    return 0;
}