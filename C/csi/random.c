#include <stdio.h>
#include <time.h>
#include <stdlib.h>

// long long main() {
// srand((int) time(NULL));
// long long n= rand();
// // int n;
// long long r;
// // printf("How many number you want to have? "); scanf("%d",&n);
//     for(int i=0; i<n; ++i) {
//         r = rand();
//         printf("Rand %d is %d\n",i, r); 
//     }
// system("pause");
// return 0;
// }

int main() {
    clock_t begin = clock();

    int n,r,i,min,max;  
    printf("min"); scanf("%d",&min);
    printf("max"); scanf("%d",&max);
    for(int i=0; i<n; ++i) {
        r = min + rand() % (max + 1 - min);
        printf("Rand %d is %d\n",i, r); 
    }
    
    clock_t end = clock();
    double time = (end - begin);
    printf("\nTotal of executing time: %g ms --- %g s\n", time, time / CLOCKS_PER_SEC);
    system("pause");
}