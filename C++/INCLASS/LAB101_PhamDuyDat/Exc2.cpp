// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void input(int *arr, int &n) {
    for (int i = 0; i < n; i++) {
        printf("Enter an Element arr[%d]: ", i);
        scanf("%d", &arr[i]);
    }
}

void display(int *arr, int n) {
    printf("array display: \n");
    for (int i = 0; i < n; i++) {
        printf("arr[%d] = %d\n", i, arr[i]);
    }
}

void search(int *arr, int n) {
    printf("Enter Element want to search: ");
    int s;
    scanf("%d",&s);
    int pos;
    for (int i = 0; i < n; i++) {
        if (arr[i] == s) pos = i;
    }
    printf("the last %d in array is at the position arr[%d]\n\n",s,pos);
}

void parameter(int *arr, int n) {
    printf("parameter display: \n");
    for (int i = 0; i < n+1; i++) {
        for (int j = 0 ; j < i ; j++) {
            printf("%d ",arr[j]);        
        }
        printf("\n");
    }
}

void swap(int &a, int &b){
	int t;
	t=a; 
    a=b; 
    b=t;
}

void rotate (int *arr, int n) {
    printf("how many the elements back to: ");
    int k;
    scanf("%d",&k);
    int store[n] = {};
    for (int i = 0; i < n; i++) {
        store[i] = arr[i];
    }
    for (int i = 0; i < n; i++) {
        int c = i + k;
        if (c > (n-1)) c = c - n;
        swap(store[i],arr[c]);
    }
    display(arr,n);
}

int main() {
    int *arr = (int *)malloc(1000 * sizeof(int));
    int n = 0;
    printf("How many number want to add: \n");
    scanf("%d", &n);
    input(arr, n);
    display(arr,n);
    search(arr,n);
    parameter(arr,n);
    rotate(arr,n);
    system("pause");
}
