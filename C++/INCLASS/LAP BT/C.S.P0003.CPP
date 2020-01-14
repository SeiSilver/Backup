#include <stdio.h>
#include <stdlib.h>

void sort(int arr[], int n, int *sorted)
{
    int len = 100000; // len of a number;
    int store[100000] = {};

    for (int i = 0; i < n; i++)
    {
        store[arr[i]] += 1;
    }

    for (int i = 0; i < len; i++)
    {
        if (i != 0)
            store[i] += store[i - 1];
    }

    for (int i = 0; i < n; i++)
    {
        sorted[store[arr[i]] - 1] = arr[i];
        store[arr[i]] -= 1;
    }
}

void output(int n, int a[])
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
}

void swap(int *sorted, int *n, int n1)
{
    for (int i = 0; i < *n; i++)
    {
        if (n1 < sorted[i])
        {
            for (int j = *n; j >= i; j--)
            {
                sorted[j + 1] = sorted[j];
            }
            sorted[i] = n1;
            break;
        }
    }
    (*n)++;
}

int main()
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int a[100] = {};
    for (int i = 0; i < n; i++)
    {
        printf("Enter element[%d]: ", i);
        scanf("%d", &a[i]);
    }
    output(n, a);
    int sorted[n] = {};

    sort(a, n, sorted);

    printf("The array after sorting:\n");
    output(n, sorted);

    int n1;
    printf("\nPlease enter new value: ");
    scanf("%d", &n1);

    swap(sorted, &n, n1);

    printf("New array:\n");
    output(n, sorted);
    system("pause");
    return 0;
}
