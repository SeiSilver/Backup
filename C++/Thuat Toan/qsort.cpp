#include <stdio.h>
#include <stdlib.h>

int values[] = {4, 7, 2, 8, 1, 6, 3};

int cmpfunc(const void* a, const void* b) { return (*(int*)a - *(int*)b); }

int main() {
    int n;

    printf("Day so truoc khi sap xep : \n");
    for (n = 0; n < 7; n++) {
        printf("%d ", values[n]);
    }

    qsort(values, 7, sizeof(int), cmpfunc);

    printf("\nDay so sau khi sap xep: \n");
    for (n = 0; n < 7; n++) {
        printf("%d ", values[n]);
    }
    system("pause");
}