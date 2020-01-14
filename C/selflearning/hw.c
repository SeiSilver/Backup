// viet chuyen doi tu he thap phan sang he nhi phan
#include <stdio.h>
#include <conio.h>
int main()
{
    char bin[100];
    int dec,i,x,stt=0;
    
    printf("Enter a decimal number: "); scanf ("%d", &dec);
    if (dec<0) {
        dec*=-1;
        stt=1;}
    // chuyen tu so nguyen sang so nhi phan
    for (i=0;dec!=0;i++)
        {
        bin[i]=dec%2;
        dec=dec/2;
        x=i+1;
        }
    // chuyen tu so nguyen am sang so nhi phan
    if (stt) {
        for (i=0;i<x;i++) {
            if (bin[i]) bin[i]=0;
            else bin[i]=1;
        }
        for (i=0;i<x;i++) {
            if (i==0) bin[i]+=1;
            bin[i]=bin[i]%2;
            if (!bin[i]) bin[i+1]+=1;   
        }
    }    
    // hiện thị đủ độ dài của n byte
    int n;
    if (x<=4) n=4;
    else if(x<=8) n=8;
    else if(x<=12) n=12;
    else if(x<=16) n=16;
    
    for (x;x<n;x++) {
       if (stt) bin[x]=1;
       else bin[x]=0;
    }
    printf ("Binary is converted: ");
    for (i=x-1;i>=0;i--)
    {printf ("%d", bin[i]);
    if (i%4==0) printf(" ");}
    getchar();
    getchar();
    return 0;  
}
