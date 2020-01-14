// note kiểm tra xem có file trong đường dẫn đó ko
#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<ctype.h>

void getinputFile(char name[][41], char add[][41],int mark[], int *n)
{
    FILE*input=fopen("PRF\\workshop8\\student1.txt","r");
    while (fscanf(input,"%41[^;]; %41[^;]; %d\n",name[*n],add[*n],&mark[*n])==3) (*n)+=1;
    fclose(input);
}

void printdata(char name[][41], char add[][41],int mark[], int *n) {
    printf("Data after sorted: \n");
    for (int i=0; i<*n;i++) {
        printf("%-40s %-40s %5d\n",name[i],add[i],mark[i]);
    }
}

void returnoutputFile(char name[][41], char add[][41],int mark[], int *n)
{
    FILE*output=fopen("PRF\\workshop8\\student2.txt","w");
    for (int i=0;i<*n;i++) fprintf(output,"%-30s %-40s %5d\n",name[i],add[i],mark[i]);
    fclose(output);
}

void swapInt(int*a,int*b)
{
    int t=*a;
    *a=*b;
    *b=t;
}
void swapString(char*a,char*b)
{
    char c[41];
    strcpy(c,a);
    strcpy(a,b);
    strcpy(b,c);
}
void sort(char name[][41], char add[][41],int mark[], int *n)
{
    for (int i=0;i<*n-1;i++)
        for (int j=i+1;j<*n;j++)
            if (mark[j]>mark[i]){
                swapInt(&mark[i],&mark[j]);
                swapString(name[i],name[j]);
                swapString(add[i],add[j]);
            }  
}

int main() {
    char name[50][41],add[50][41];
    int mark[50];
    int n=0;
    getinputFile(name,add,mark,&n);
    sort(name,add,mark,&n);
    printdata(name,add,mark,&n);
    returnoutputFile(name,add,mark,&n);
    system("pause");
    return 0;
}