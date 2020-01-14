// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>
#include <ctype.h>
#include <time.h>

void countingsort(int arr[], int n)
{
    int store[100000];
    int sorted[n];
    for (int i = 0; i < n; i++)
    {
        store[arr[i]] += 1;
    }

    for (int i = 0; i < 100000; i++)
    {
        if (i != 0)
            store[i] += store[i - 1];
    }

    for (int i = 0; i < n; i++)
    {
        sorted[store[arr[i]] - 1] = arr[i];
        store[arr[i]] -= 1;
    }
    for (int i = 0; i < n; i++)
    {
        arr[i] = sorted[i];
    }
}

int main()
{
    printf("Enter size of array: ");
    int n;
    scanf("%d", &n);
    int arr[n] = {};
    for (int i = 0; i < n; i++)
    {
        printf("Enter Element[%d]: ", i);
        scanf("%d", &arr[i]);
    }
    countingsort(arr, n);

    printf("The array sorted in ascending: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    printf("\nThe array sorted in descending: \n");
    for (int i = n - 1; i >= 0; i--)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
    system("pause");
}
