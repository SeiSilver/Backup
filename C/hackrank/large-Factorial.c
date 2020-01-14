#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    int n, val[500] = {}, size;
    scanf("%d", &n);
    val[0] = 1;
    size = 1;
    for (int i = 2; i <= n; i++)
    {
        int carry = 0;
        for (int j = 0; j < size; j++)
        {
            int pod = val[j] * i + carry;
            val[j] = pod % 10;
            carry = pod / 10;
        }
        while (carry)
        {
            val[size] = carry % 10;
            carry /= 10;
            size++;
        }
    }
    
    for (int i = size - 1; i >= 0; i--)
        printf("%d",val[i]);
    return 0;
}