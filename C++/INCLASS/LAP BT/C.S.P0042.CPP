// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>
#include <ctype.h>
#include <time.h>

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
        if (arr[i] == 0)
        {
            arr[i] = arr[i + 1];
            n = i;
            break;
        }
    }
    int max = arr[0];
    for (int i = 0; i < n; i++)
    {
        if (max < arr[i])
        {
            max = arr[i];
        }
    }
    printf("Array max value is %d\n", max);

    printf("Array even value: \n");
    for (int i = 0; i < n; i++)
    {
        if (arr[i] % 2 == 0)
            printf("%d ", arr[i]);
    }
    printf("\n");

    system("pause");
}
