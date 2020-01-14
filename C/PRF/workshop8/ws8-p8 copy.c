#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<ctype.h>
char code[50][11],name[50][31],add[50][41];
int mark[50];
int n=0;

void getinputFile()
{
    FILE*input=fopen("PRF\\workshop8\\p8-input.txt","r");
    while (fscanf(input,"%40[^;]; %40[^;]; %d\n",name[n],add[n],&mark[n])==3) ++n;
    fclose(input);
}

void returnoutputFile()
{
    FILE*output=fopen("PRF\\workshop8\\p8-output.txt","w");
    for (int i=0;i<n;i++) fprintf(output,"%-30s %-41s %5d\n",name[i],add[i],mark[i]);
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
void sort()
{
    for (int i=0;i<n-1;i++)
        for (int j=i+1;j<n;j++)
            if (mark[j]>mark[i]){
                swapInt(&mark[i],&mark[j]);
                swapString(name[i],name[j]);
                swapString(add[i],add[j]);
            }  
}
int main()
{
    getinputFile();
    sort();
    returnoutputFile();    
    return 0;
}