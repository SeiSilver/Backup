#include<stdio.h>
#include<conio.h>
#include<string.h>


char d[100],n;

void addvalue () {
    // scanf("%d",&n);
    // for(int i=0; i<n; i+=1) {
    //     printf("d[%d]= ",i); scanf("%d",&d[i]);
    // }
    printf("enter chuoi ky tu= "); gets(d);
    searchvalue();
}

void searchvalue () {    
    n=strlen(d);
    char x;
    printf("enter value want to search: "); scanf("%c",&x);
    for (int i=1; i<n; i++) {
      if (d[i]==x) {
        printf("%c is present at location %d.\n",x,i);
      }
    } printarray();
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