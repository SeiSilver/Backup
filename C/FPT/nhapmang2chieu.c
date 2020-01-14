#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>

// nhập mảng 2 chiều tính tổng của 2 phần tử lớn nhất mỗi hàng

int a[100][100];
int n,c=0,r;

int tinhtong(int* a,int* b, int* i) {
    int sum=(*a + *b);
    printf("Sum of %d and %d in a[%d]: %d\n",*a,*b,*i,sum);
    return sum=0;  
}

int main() {
    
    printf("How many number want to add : \n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            printf("Nhap a[%d][%d] = ", i, j);
            scanf("%d", &a[i][j]);
        }
        printf("\n");
    } 
    printf("Result: \n");
    for (int i = 0; i < 3; i++) {
        printf("a[%d] = ",i);
        for (int j = 0; j < 4; j++) printf("%d ",a[i][j]);
        printf("\n");
    }


    for (int i = 0; i < 3; i++) {

        int largest1=a[i][0];
        int largest2=a[i][0];

        for (int j = 0; j < 4; j++) {
            if (a[i][j] >= largest1) {
                largest2= largest1;
                largest1=a[i][j];
            }
            else if(a[i][j] > largest2) largest2 = a[i][j]; 
        }
        printf("The two largest numbers in a[%d] are %d and %d \n",i, largest1, largest2);
        tinhtong(&largest1,&largest2,&i);
    } 

    system("pause");
}