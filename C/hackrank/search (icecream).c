#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void entercost(int cost[], int n) {
    for (int i = 1; i<= n; i++) {
        scanf("%d",&cost[i]);
    }
}

void pick(int cost[], int n, int m) {
    for (int i = 1; i<=n-1; i++) {
        for (int j=i+1; j<=n; j++) {
            if ( (cost[i]+cost[j]) == m  ) printf("%d %d\n",i,j);
        }
    }
}

int main () {
    int t,m,n;
    scanf("%d",&t);
    for (int i = 0; i< t; i++) {
        scanf("%d",&m);
        scanf("%d",&n);
        int cost[n];
        entercost(cost,n);
        pick(cost,n,m); 
    }
    return 0;
}