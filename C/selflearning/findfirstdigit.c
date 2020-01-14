#include <stdio.h>

int main()
{
    int n, first;

    /* Input number from user */
    printf("Enter any number: ");
    scanf("%d", &n);

    first = n;

    /* Remove last digit from number till only one digit is left */
    while(first >= 10)
    {
        first = first / 10;
    }

    printf("First digit = %d", first);

    return 0;
}