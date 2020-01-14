#include <stdio.h>
#include <conio.h>

int fraction=-1,ipart=-1;

double makedouble(int ipart,int fraction){
    double d_f= fraction;
    while (d_f >=1) d_f = d_f/10;
    if (ipart<0) return ipart - d_f; 
    else return ipart + d_f ; 
}

int main(){
    printf("enter ipart: "); scanf ("%d", &ipart);
    printf("enter fraction: ");
    while (fraction<0) {
        scanf("%d",&fraction);
        if (fraction<0) printf("enter a positive fraction: ");
    } double value= makedouble(ipart,fraction);
    printf("value: %g",value);
    getchar(); getchar();
    return 0;
}