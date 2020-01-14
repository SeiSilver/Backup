#include <stdio.h>
#include <stdlib.h>

int Array[] = {4,1,2,3,0,5,9,7,6,8}; 
int j,i;

void bubbleSort(), swap(), print();

void bubbleSort(int Array[], int n) { 
   for (int i = 0; i < n-1; i++)       
       // so sanh 2 gia tri ke nhau
      for (int j = 0; j< n-i-1 ; j++)  
         if (Array[j] > Array[j+1]) 
            swap( &Array[j], &Array[j+1]); 
   printf("\n");
} 

void swap(int *a, int *b) { 
   printf("swap %d va %d\n",*a,*b);
   int temp = *a; 
   *a = *b; 
   *b = temp; 
   print(Array,10);
} 

void print(int *Array, int n) {
   for(int i=0;i<n;i++) printf("%d ",Array[i]);
   printf("\n");
}

int main() { 
   printf("Mang truoc khi sap xep:\n");
   print(Array,10);
   printf("\n");
   bubbleSort(Array,10); 
   printf("Mang sau khi da sap xep hoan tat: \n");
   print(Array,10);
   system("pause");
} 