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
    printf("Enter size of array: ");
    int n;
    scanf("%d", &n);
    int arr[n] = {};
    for (int i = 0; i < n; i++) {
        printf("Enter Element[%d]: ", i);
        scanf("%d", &arr[i]);
    }
    int min = arr[0];
    int position = 0;
    for (int i = 0; i < n; i++) {
        if (min > arr[i]) {
            min = arr[i];
            position = i;
        }
    }
    printf("The smallest element: %d -- Its position: %d\n", min, position);

    system("pause");
}
