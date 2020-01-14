#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int whowin(int a[],int dem);

int main() {
    int n;
    int dem;
    int a[100];
    scanf("%d",&n);
    for (int i=0;i<n;i++) {
        scanf("%d",&dem);
        int j;
        for (j=0;j<dem;i++) {
            scanf("%d ",a[j]);          
        }
    }
    return 0;
}
// alice di truoc
int whowin(int a[],int dem) {
    for (int i=0 ; i <dem; i++) {
        int ss = a[i]/2;
        if (a[i] < ss) printf ("bob\n");
        else printf("alice\n");
    }
}
