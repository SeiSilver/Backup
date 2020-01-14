// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>
#include <ctype.h>
#include <time.h>

void print(int *arr, int &n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}

void opt1(int *arr, int &n)
{
    printf("Enter size of array: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("Enter Element[%d]: ", i);
        scanf("%d", &arr[i]);
    }
    printf("Current array: ");
    print(arr, n);
}

void opt2(int *arr, int &n)
{
    int Search, stt = 0;
    printf("Enter what you want to find: ");
    scanf("%d", &Search);
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == Search)
        {
            printf("Arr[%d] = %d\n", i, Search);
            stt = 1;
        }
    }
    if (stt == 0)
        printf("\nElement is not found\n");
}

void movedata(int *i, int *input, int &n)
{
    for (int j = *i; j < n; j++)
    {
        input[j] = input[j + 1];
    }
    n -= 1;
}

void opt3(int *arr, int &n, int c)
{
    int remove, stt = 0;
    printf("Enter what element you want to remove: ");
    scanf("%d", &remove);
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == remove)
        {
            movedata(&i, arr, n);
            stt = 1;
            if (c == 0)
                break;
            i--;
        }
    }
    if (stt == 0)
        printf("\nElement is not found\n");
    printf("Current array: ");
    print(arr, n);
}

void opt4(int *arr, int &n)
{
    opt3(arr, n, 1);
}

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void opt6(int arr[], int &n, int call)
{
    int sort[n];
    int pos[n];
    for (int i = 0; i < n; i++)
    {
        sort[i] = arr[i];
    }
    for (int i = 0; i < n; i++)
    {
        pos[i] = i;
    }

    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++)
            if (sort[j] > sort[j + 1])
            {
                swap(&sort[j], &sort[j + 1]);
                swap(&pos[j], &pos[j + 1]);
            }

    if (call == 0)
        for (int i = 0; i < n; i++)
        {
            printf("arr[%d] = %d\n", pos[i], sort[i]);
        }
    if (call == 1)
        for (int i = n - 1; i >= 0; i--)
        {
            printf("arr[%d] = %d\n", pos[i], sort[i]);
        }
}

void menu()
{
    printf("---------------------------\n");
    printf("1. Add a value \n");
    printf("2. Search a value\n");
    printf("3. Remove the first existence of a value\n");
    printf("4. Remove all existences of a value\n");
    printf("5. Print out the array \n");
    printf("6. Sort the array in ascending order (positions of elements are preserved)\n");
    printf("7. Sort the array in descending order (positions of elements are preserved)\n");
    printf("8. quit \n");
    printf("---------------------------\n");
}

int main()
{
    int n = 0;
    int arr[10000];
    int opt;
    do
    {
        system("cls");
        menu();
        printf("Your opt? ");
        scanf("%d", &opt);
        switch (opt)
        {
        case 1:
            opt1(arr, n);
            break;
        case 2:
            opt2(arr, n);
            break;
        case 3:
            opt3(arr, n, 0);
            break;
        case 4:
            opt4(arr, n);
            break;
        case 5:
            print(arr, n);
            break;
        case 6:
            opt6(arr, n, 0);
            break;
        case 7:
            opt6(arr, n, 1);
            break;
        default:
            printf("Error");
            break;
        }
        if (opt != 8)
        {
            printf("\n");
            fflush(stdin);
            system("pause");
        }
    } while (opt >= 1 && opt <= 7);
}
