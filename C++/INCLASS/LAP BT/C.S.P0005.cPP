#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// in doc
// int main() {
//     for (int i =1; i<=9; i++) {
//         for (int j=1; j<=9; j ++) {
//             printf("%d x %d = %d\n", i, j,i*j);
//         }
//         printf("------------------\n");
//     }
//     system("pause");
// }

// in ngang
int main() {
    for (int i =1; i<=9; i++) {
        for (int j=1; j<=9; j ++) {
            printf("%d x %d = %-5d", j, i,i*j);
        }
        printf("\n");
    }
    system("pause");
}