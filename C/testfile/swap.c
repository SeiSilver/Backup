#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>

int d[100], s[100], a[100];
int n,i=0;

void addvalue () {
    printf("enter d[%d]= ",i); scanf("%d",&d[i]);
    i++;
    n++;
    printf("number is added!");
}

void searchvalue () {
    int x,notexit;
    printf("enter value want to search: "); scanf("%d",&x);
    for (int i=0; i<=n; i++) {
        if (d[i]==x) printf("%d is present at location d[%d]\n",x,i);
    }
    // neu gia tri tim ko thay in ra ko ton tai
    for (int i=0; i<=n; i++) {
        if (d[i]!=x) notexit=0; 
    }
    if (notexit==0) printf ("value doesn't exit");
}

void printarray() {
    printf("array: \n");
    for (int i=0;i<n;i++) {
        printf("d[%d]= %d\n", i,d[i]);
    }
}

void printvalueinrange() {
    int min,max;
    printf("enter minval: "); scanf("%d",&min);
    printf("enter maxval: "); scanf("%d",&max);
    printf("value between %d and %d: \n",min,max);
    for (i=0;i<n;i++) {
        if ( (min<d[i]) && (max>d[i]) )  printf("%d,",d[i]);
    }
}

void ascendingorder() {
    int swap,i,j;
    for (i=0; i<=n; i++) s[i]=d[i];
    for (i=0; i<=(n-1); i++) {
        for (j=i+1; j<=n; j++) {
            if (s[i]>s[j]) {
                swap=s[i];
                s[i]=s[j];
                s[j]=swap;
                }
        }
    }
    printf("Value in ascending order\n");
    // tim lai vi tri goc sau khi swap
    for (i=0;i<=n;i++) {
        for (j=0;j<=n;j++) {
            if (s[i]==d[j]) printf("d[%d]= %d\n", j,s[i]); 
        }
    }
}

int menu() {
    int opt;
    system("cls");
    printf("1- Add a value \n");
    printf("2- Search a value \n");
    printf("3- Print out the array  \n");
    printf("4- Print out values in a range \n");
    printf("5- Print out the array in ascending order \n");
    printf("others- quit \n");
}

int main()  {
    int opt;
    do {
        menu();
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: printf("\n"); addvalue(); break;
            case 2: printf("\n"); searchvalue(); break;
            case 3: printf("\n"); printarray(); break;
            case 4: printf("\n"); printvalueinrange(); break;
            case 5: printf("\n"); ascendingorder();  break;
        }
        if (opt>0 && opt<6) { 
            printf("\n\n");
            system ("pause");
        }
    }
    while (opt>0 && opt <6);
    system ("pause");
    return 0;
}