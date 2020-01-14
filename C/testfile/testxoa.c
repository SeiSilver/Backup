#include<stdio.h>
#include<conio.h>
#include<string.h>

// int main () {
//     char A[50];
//     int i,j;
//     int n;
//     printf("enter chuoi"); gets(A);

//     n=strlen(A);
//     for (i=0;i<n;i++) {
//         if (A[i]==' ') {
//         for (j=i;j<n;j++) {
//             A[j]=A[j+1];
//         }
//         i--; 
//         n--;    
//         }
//     }
//     printf("%d\n",n);
//     puts(A);
//     system("pause");
// }

int d[100],n;

void addvalue () {
    scanf("%d",&n);
    for(int i=0; i<n; i+=1) {
        printf("d[%d]= ",i); scanf("%d",&d[i]);
    }
    searchvalue();
}

void searchvalue () {    // n=strlen(d);
    int x;
    printf("enter value want to search: "); scanf("%d",&x);
    for (int i=0; i<n; i++) {
      if (d[i]==x) {
        printf("%d is present at location %d.\n",x,++i);
      }
    }  printarray();
}

void printarray() {
    printf("array: ");
    for (int i=0;i<n;i++) {
        printf("%d ", d[i]);
    }
}

int main() {
    addvalue();
    system("pause");
}