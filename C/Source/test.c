#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>

int d[100], s[100];
int n=0,i=0;

int opt1(), opt2(), opt3(), opt4(), opt5(), binarySearch();
void swap();

// input
int opt1 () {
    printf("Enter d[%d]= ",i); scanf("%d",&d[i]);
    fflush(stdin);
    printf("Number is added!");
    i++;
    n++;
}

//output
int opt2(int *d) {
    printf("array: \n");
    for (int i=0;i<n;i++) {
        printf("d[%d]= %d\n", i,d[i]);
    }
}

int opt3 () {
    int x,notexit;
    printf("enter value want to search: "); scanf("%d",&x);
    for (int i=0; i<n; i++) {
        if (d[i]==x) printf("%d is present at location d[%d]\n",x,i);
    }
}

// Linear Search
int opt4() {
    int x;
    printf("enter value want to search: "); scanf("%d",&x);
    int result = binarySearch(d, x,n); 
    (result == -1) ? printf("khong ton tai") 
                   : printf("co ton tai d[%d]",result); 
}

// Binary Search
int binarySearch(int d[], int x, int n) { 
    int left =0,right =n,mid;
    while (left<=right ) {
        mid =(left+right)/2;
        if (x==d[mid]) return mid;
        if (x<d[mid]) right=mid-1;
        else left =mid+1;
     }
    return -1; 
} 

// Selection Soft
int opt5() {
    for (i=0; i<n; i++) s[i]=d[i];
    int j=0;
    int min;
    for (int i=0;i<n;i++) {
        min= i;
        for (int j=i; j<n;j++) {
        if (s[min]>s[j]) min=j;
    } 
        if (min != i) swap(&s[i],&s[min]);
    }

    opt2(s);
}

void swap(int *a, int *b) { 
   int temp = *a; 
   *a = *b; 
   *b = temp; 
} 

int main()  {
    int opt;
    do {
        system("cls");
        printf("1- Input \n");
        printf("2- Output \n");
        printf("3- LinearSearch  \n");
        printf("4- BinarySearch \n");
        printf("5- SelectSort \n");
        printf("6- quit \n");
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: printf("\n"); opt1(); break;
            case 2: printf("\n"); opt2(d); break;
            case 3: printf("\n"); opt3(); break;
            case 4: printf("\n"); opt4();  break;
            case 5: printf("\n"); opt5(); break;
            case 6: break;
            default: { printf("-----wrong option------\n"); system ("pause"); }
        }
        if (opt>0 && opt<6) { 
            printf("\n\n");
            fflush(stdin);
            system ("pause");
        }
    }
    while (opt!=6);
    system ("pause");
    return 0;
}