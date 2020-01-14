// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int main() {
    int col, row;
    printf("Accept size \n");
    printf("Rows: ");
    scanf("%d", &col);
    printf("Col: ");
    scanf("%d", &row);

    int **arr1 = (int **)malloc(row * sizeof(int *));

    for (int i = 0; i < row; i++) arr1[i] = (int *)malloc(col * sizeof(int));

    int **arr2 = (int **)malloc(row * sizeof(int *));

    for (int i = 0; i < row; i++) arr2[i] = (int *)malloc(col * sizeof(int));

    printf("Accept matrix m1: \n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            printf("Arr1[%d][%d]: ", i, j);
            scanf("%d", &arr1[i][j]);
        }
        printf("\n");
    }

    printf("Accept matrix m2: \n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            printf("Arr2[%d][%d]: ", i, j);
            scanf("%d", &arr2[i][j]);
        }
        printf("\n");
    }

    printf("Sum = m1 + m2\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            printf("Sum[%d][%d] = %d \n", i, j, arr1[i][j] + arr2[i][j]);
        }
        printf("\n");
    }

    system("pause");
}
