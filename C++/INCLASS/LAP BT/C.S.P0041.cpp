// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <bits/stdc++.h>
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
using namespace std;

int main() {
    printf("Enter the size of array: ");
    int n;
    scanf("%d", &n);
    int arr[n] = {0};
    printf("Enter the element of the array: \n");
    for (int i = 0; i < n; i++) {
        printf("Arr[%d] = ", i);
        scanf("%d", &arr[i]);
    }
    printf("Array element: \n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    // Find max using cpp
    int max = *max_element(arr, arr + n);
    printf("\nArray Maxium value: \n%d\n", max);

    // Find max using clasical C method
    // int m = arr[0];
    // for (int i = 0; i < n; i++) {
    //     if (arr[i] > m) m = arr[i];
    // }
    // printf("\nArray Maxium value: \n%d\n", m);

    printf("Array Even values: \n");
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) printf("%d ", arr[i]);
    }
    printf("\n");
    system("pause");
}
