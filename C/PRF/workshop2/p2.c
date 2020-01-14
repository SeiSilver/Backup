#include <stdio.h>
#include <conio.h>
int main()
{
    int n;
    double a,tf,ti;
    float taxpercent;
    printf ("Enter Your income of this year: "); scanf ("%lf",&a);
    printf ("Enter Number of dependent: "); scanf ("%d",&n);
    printf ("tax-free income: %.0lf\n",tf=12*(9000000+(double)n*3600000));
    ti=a-tf;
    if (ti<0) {
        ti=0; 
        printf("Taxable income:0\n");}
    else printf ("Taxable income: %.0lf\n",ti);
    if (ti<=5000000) taxpercent=(double)5/100;
    else if (ti<=10000000) taxpercent=(double)1/10;
    else if (ti<=18000000) taxpercent=(double)15/100;
    else taxpercent=(double)1/5;
    printf ("income tax: %.0lf\n",ti*taxpercent);
    getchar();
    getchar();
    return 0;
}