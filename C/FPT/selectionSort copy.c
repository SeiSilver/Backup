#include <stdio.h>
#include <stdlib.h>

int Array[]= {4,5,6,3,2,1,0,9,7,8};

void selectionSort(), swap(), print();

void selectionSort(){
   int min,i=0,j=0; 
   // lap qua ta ca cac so
   for(i = 0; i<10; i++) { 
      // thiet lap phan tu hien tai la min 
      min = i;
      // kiem tra phan tu hien tai co phai la nho nhat khong 
      for(j=i;j<10;j++) if( Array[min] > Array[j] ) min = j;
      if( min != i) { 
         swap(&Array[i], &Array[min]); 
      }          
   }
}  

void swap(int *a, int *b) { 
   int temp = *a; 
   *a = *b; 
   *b = temp; 
} 

void print(int *Array, int n) {
   for(int i=0;i<n;i++) printf("%d ",Array[i]);
   printf("\n");
}

int main() {
   printf("Mang truoc khi sap xep:\n");
   print(Array,10);
	printf("\n");
   selectionSort();
   printf("\nMang sau khi da sap xep: \n");
   print(Array,10);
   printf("\n");
   system("pause");
}