#include <Stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

char a[100][31];

// void nhap(), in(), inhoa(), bubbleSort(), swap(); 

void nhap(char a[][31], int n) {
    for (int i = 0; i < n; i++) {
        printf("Nhap a[%d]= ", i);
        fflush(stdin);
        scanf("%[^\n]",&a[i]);
        inhoa(a[i]);
    } 
}

int i,j;
void inhoa(char a[i][j]) {
	for (int j=0; j<strlen(a[i]); j++)
	a[i][j]=toupper(a[i][j]);
}

void in(char a[][31],int n) {
    printf("xuat a[]: \n");
    for (int i = 0; i < n; i++) {
        fflush(stdin);
        printf("a[%d] = ",i);
        puts(a[i]);
    }
}

void bubbleSort(int Array[i][j], int n) { 
   for (int i = 0; i < n-1; i++)     
      for (int j = n-1; j> i ; j--)  
        if (strcmp(a[j],a[j-1]) <0 ) {
            char temp[31];  
            strcpy(temp[31],a[j]);
            strcpy(a[j],a[j-1]);
            strcpy(a[j-1],temp[31]);
        }
   printf("\n");
}

int main() {
    int n,i=0;
    printf("muon nhap bao nhieu ten ?\n");
    scanf("%d", &n);
    nhap(a[i],n);
    bubbleSort(a[i],n);
    in(a[i],n);
    system("pause");
}