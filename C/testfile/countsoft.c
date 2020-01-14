// #include<stdlib.h>
// #include<stdio.h>
// #include<conio.h>
// #define Maxint 100000
// #define Author "Doan Duc Tin"
// #define Members "Pham Duy Dat, Do Viet Khoa"

// void CountingSort(int A[],int MaxA,int P[],int Sort[],int n)
// {
//     for (int i=2;i<=MaxA;i++) P[i]+=P[i-1];
//     for (int i=1;i<=n;i++) Sort[P[A[i]]--]=A[i];
// }

// int main()
// {
//     int A[Maxint],Index[Maxint],Sort[Maxint],n,MaxA=0;

//     FILE*input=fopen("inputFiles\\CountingSort.in","r+");
    
//     FILE*output=fopen("outputFiles\\CountingSort.out","w");

//     fscanf(input,"%d",&n);

//     for (int i=1;i<=n;i++)
//     {
//         fscanf(input,"%d",&A[i]);
//         Index[A[i]]++;
//         if (MaxA<A[i]) MaxA=A[i];
//     }

//     CountingSort(A,MaxA,Index,Sort,n);
//     for (int i=1;i<=n;i++) fprintf(output,"%d ",Sort[i]);
//     fclose(input);
//     fclose(output);
//     return 0;
// }

#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#define Maxint 100
#define Author "Doan Duc Tin"
#define Members "Pham Duy Dat, Do Viet Khoa"

void CountingSort(int A[],int MaxA,int Sort[],int n)
{   int Index[300];
    for (int i=0;i<n;i++) Index[A[i]] += Index[A[i]]+1;
    for (int i=0;i<=MaxA;i++) 
    Sort[Index[A[i]--]]=A[i];
}
int main()
{
    int A[Maxint],Index[Maxint],Sort[Maxint],n,MaxA=0;
    printf("n: ");
    scanf("%d",&n);
    for (int i=0;i<n;i++)
    {
        scanf("%d",&A[i]);
        if (MaxA<A[i] ) MaxA=A[i];
    }
    CountingSort(A,MaxA,Sort,n);
    for (int i=0;i<=n;i++) printf("%d ",Sort[i]);
    return 0;
}