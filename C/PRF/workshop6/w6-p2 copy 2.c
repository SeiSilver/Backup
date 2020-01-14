#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>

int d[100];
int n=0,i=0;

int addvalu(), searchvalue(), printarray(), printvalueinrange(), ascendingorder(), findmin(), checkmin();

int addvalue () {
    printf("Enter d[%d]= ",i); scanf("%d",&d[i]);
    fflush(stdin);
    printf("Number is added!");
    i++;
    n++;
}

int searchvalue () {
    int x,notexit;
    printf("enter value want to search: "); scanf("%d",&x);
    for (int i=0; i<n; i++) {
        if (d[i]==x) printf("%d is present at location d[%d]\n",x,i);
    }
    // neu gia tri tim ko thay in ra ko ton tai
    for (int i=0; i<n; i++) {
        if (d[i]!=x) notexit=0; 
    }
    if (notexit==0) printf ("value doesn't exit");
}

int printarray(int *d) {
    printf("array: \n");
    for (int i=0;i<n;i++) {
        printf("d[%d]= %d\n", i,d[i]);
    }
}

int printvalueinrange() {
    int min,max;
    printf("enter minval: "); scanf("%d",&min);
    printf("enter maxval: "); scanf("%d",&max);
    printf("value between %d and %d: \n",min,max);
    for (i=0;i<n;i++) {
        if ( (min<d[i]) && (max>d[i]) )  printf("%d,",d[i]);
    }
}

int ascendingorder() {
    findmin();  
}

int findmin() {
    int min= d[i];
        for (int i=0; i<n;i++) {
        if (d[i]<min) min=d[i];
    }
    int dem=0;
    do  {
        for (int j=0; j<n; j++ )   {
            if (d[j]==min)  {
                printf("d[%d]=%d\n",j,d[j]);
                dem++;
            }
        }
        min+=1;
    }
    while (dem<n);
}

int main()  {
    int opt;
    do {
        system("cls");
        printf("1- Add a value \n");
        printf("2- Search a value \n");
        printf("3- Print out the array  \n");
        printf("4- Print out values in a range \n");
        printf("5- Print out the array in ascending order \n");
        printf("6- quit \n");
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: printf("\n"); addvalue(); break;
            case 2: printf("\n"); searchvalue(); break;
            case 3: printf("\n"); printarray(d); break;
            case 4: printf("\n"); printvalueinrange(); break;
            case 5: printf("\n"); ascendingorder();  break;
            case 6: break;
            default: { printf("-----wrong option------\n"); system ("pause"); }
        }
        if (opt>0 && opt<7) { 
            printf("\n\n");
            fflush(stdin);
            system ("pause");
        }
    }
    while (opt!=6);
    system ("pause");
    return 0;
}