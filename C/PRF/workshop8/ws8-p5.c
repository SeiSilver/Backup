// note kiểm tra xem có file trong đường dẫn đó ko
#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#define Maxint 100000

void getinputFile(double A[], int* count, double* sum)
{   
    int i;
    FILE*input=fopen("PRF\\workshop8\\p5-input.txt","r");
    while (fscanf(input,"%lf",&A[i]) == 1) {
        (*count)++;
        (*sum)+=A[i];
    }
    fclose(input);
}

int main()
{
    int count=0;
    double A[Maxint];
    double sum=0;
    getinputFile(A,&count,&sum);
    printf("Count = %d\n",count);
    printf("Average: %lf\n",sum/count);
    system("pause");
}