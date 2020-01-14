// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>
#include <ctype.h>
#include <time.h>

void print(int *arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d   ", arr[i]);
    }
    printf("\n");
}

void movedata(int *i, int *input, int *n)
{
    for (int j = *i; j < *n; j++)
    {
        input[j] = input[j + 1];
    }
    (*i)--;
    (*n)--;
}

int main()
{
    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter element[%d]: ", i);
        scanf("%d", &arr[i]);
    }
    printf("The original array: \n");
    print(arr, n);

    printf("The array after removing duplicate elements: \n");
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
            if (arr[i] == arr[j])
                movedata(&j, arr, &n);
    }
    print(arr, n);
    system("pause");
}
