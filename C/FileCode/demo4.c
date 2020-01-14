#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#define Maxint 100000

void Swap(int*a,int*b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
void ASCSort(int A[],int n)
{
    for (int i=1;i<n;i++)
        for (int j=i+1;j<=n;j++)
            if (A[i]>A[j]) Swap(&A[i],&A[j]);
}

void getinputFile(int A[],int*n)
{
    FILE*input=fopen("FileCode\\Sort.in","r");
    fscanf(input,"%d",n);
    for (int i=1;i<=*n;i++) fscanf(input,"%d",&A[i]);
    fclose(input);
}

void returnoutputFile(int A[],int n)
{
    FILE*output=fopen("FileCode\\Sort.out","w");
    for (int i=1;i<=n;i++) fprintf(output,"%d ",A[i]);
    fclose(output);
}

int main()
{
    int A[Maxint],n;
    getinputFile(A,&n);
    ASCSort(A,n);
    returnoutputFile(A,n);
    return 0;
}