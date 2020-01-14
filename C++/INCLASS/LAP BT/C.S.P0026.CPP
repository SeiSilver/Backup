// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <ctype.h>

void DecToBin(double n)
{
    double le = n - (int)n;
    int arr1[10000] = {};
    int c = 0;
    if (le != 0)
    {
        while (le != 0.0)
        { //0.25 0.5 1.0 -1
            le = le * 2;
            arr1[c] = (int)le;
            if (le >= 1.0)
                le--;
            c++;
        }
    }

    int arr[10000] = {};
    int dem = 0;
    while (n != 0)
    {
        arr[dem] = (int)n % 2;
        n = (int)n / 2;
        dem++;
    }
    for (int i = dem - 1; i >= 0; i--)
        printf("%d", arr[i]);

    if (c != 0)
        printf(".");

    for (int i = 0; i < c; i++)
        printf("%d", arr1[i]);

    printf("\n");
}

int main()
{
    double n = -1;
    printf("Convert Decimal to Binary\n");
    while (n < 0)
    {
        printf("Enter positive number: ");
        scanf("%lf", &n);
        if (n < 0)
            printf("Please enter a positive number\n");
    }

    DecToBin(n);
    system("pause");
}