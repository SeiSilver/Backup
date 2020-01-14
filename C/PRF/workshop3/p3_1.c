#include <stdio.h>
#include <conio.h>
#include<math.h>

int getRelPos(double x,double y,double r) {
    double d2=x*x + y*y; 
    double r2=r*r;          
    if (d2<r2) return 1 ; 
    else if (d2==r2) return 0 ; 
    return -1 ; 
}

int main() {
    double x,y,r;
    int result;
    printf("enter x: "); scanf("%lf",&x);
    printf("enter y: "); scanf("%lf",&y);
    do {
        printf("enter r: "); scanf("%lf",&r);
     } while (r<0);
    result=getRelPos(x,y,r);
    if (result==1) printf("The point (%.2lf,%.2lf) is in the circle\n",x,y);
    else if (result==0) printf("The point (%.2lf,%.2lf) is on the circle\n",x,y);
    else printf("The point (%.2lf,%.2lf) is out of the circle\n",x,y);
    getchar();
    getchar();
    return 0;
}
