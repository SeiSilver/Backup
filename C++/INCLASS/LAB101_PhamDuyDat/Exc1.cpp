// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void display(double x, double e) {
    double sum = 1;
    int i = 1;
    int n = 1;
    double t = 1;
    while (t >= e) {
        sum += t;
        n++;
        i = i * n;
        t = pow(x,n) / (double) i;
    }
    printf("The sum of e^%.0lf = %lf\n", x ,sum);
}

int main() {
    printf("Enter epsilon: ");
    double e;
    scanf("%lf", &e);
    printf("Enter x: ");
    double x;
    scanf("%lf", &x);
    display(x, e);
    system("pause");
}
