/* 
   name: Pham Duy Dat
   Class: SE1403
 */
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <iostream>
using namespace std;

int main() {
    int n, sumodd = 0, sumeven = 0;
    scanf("%d", &n);
    int arr[n];
    printf("Enter %d Element: \n", n);
    for (int i = 0; i < n; i++) {
        printf("Element: ");
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0)
            sumeven += arr[i];
        else
            sumodd += arr[i];
    }

    printf("Sum Of Even: %d\n", sumeven);
    printf("Sum Of Odd: %d\n", sumodd);
    system("pause");
}