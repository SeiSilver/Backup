// #include <stdio.h>
// #include <conio.h>
// #include<stdlib.h>
// int main ()
// {
//     system ("cls");
//     printf (" chan vai\n");
//     printf (" ve dau dong");
//     getch();
//     return 0;
// }

#include<stdio.h>

int main()  {
    char x[99];
    int n,i,l,stt=0;
    scanf("%d",&n);

	if (n<0)	{	
		n*=-1;
		stt=1;
	}
    
	for (i=0; n!=0; i+=1) {
		x[i]=n%2;
        n=n/2;
		l=i+1;
    }

	if (stt)	{
		for (i=0; i<=l; i+=1)	{	
			if (x[i])	x[i]=0;
			else x[i]=1;
		}
		for (i=0; i<=l; i+=1)	{
			if (i==0)	x[i]+=1;			
			x[i]=x[i]%2;			
			if (!x[i])	x[i+1]+=1;
		}
	}
    
	// Điều chỉnh độ dài chuẩn theo n byte
    if (l<=4)   n=4;
    else if (l<=8)  n=8;
    else if (l<=12) n=12;
    else if (l<=16) n=16;
	
	for (l; l<n; l+=1)  
		if (stt)	x[l]=1;
		else x[l]=0;

    for (i=n-1; i>=0 ; i-=1)   {
        printf("%d",x[i]);
        if (i%4==0) printf(" ");
    }
    
    getchar();
    getchar();
    return 0;
}