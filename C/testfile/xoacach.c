#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main() 
{
	char s[100]="MOT HAI  BA   NAM";
	int i,n,j;

	n=strlen(s);

		for(i=0;i<n;i++)
		{
			if((s[i]==' ')&&(s[i+1]==' '))
			{
				for(j=i;j<n;j++)
				{
					s[j]=s[j+1];
                    s[n-1]='\0';
				}
				n--;	//so ki tu cua chuoi giam xuong
				i--;	//sau buoc nay thi i se tang (vong for) nen ta se giam no xuong
			}
		}
	printf("Chuoi sau khi cat: %s\n",s);
	system("pause");
}



// #include<stdio.h>
// #include<conio.h>
// #include<string.h>
// // void xoa(char s[90],int vitrixoa);
// // void xoakt(char*s);

// void main()
// {
//     char s[90];
//     printf("nhap chuoi ");
//     gets(s);
// 	xoakt(s);
//     puts(s);
//     getch();
// }

// void xoakt(char*s)
// {
//     for(int i=0;i<strlen(s);i++)
// 		if(s[i]==' '&& s[i+1]==' ')
// 		{
// 			xoa(s,i);
// 			i--;
// 		}
//     if(s[0]==' ')
// 		xoa(s,0);
//     if(s[strlen(s)-1]==' ')
// 		xoa(s,strlen(s)-1);
// }

// void xoa(char s[90],int vitrixoa)
// {
// 	int n=strlen(s);//gán n= độ dài của chuỗi
//     for(int i=vitrixoa;i<n;i++)//duyệt chuỗi từ vị trí cần xóa
//     s[i]=s[i+1];
// 	s[n-1]='\0'; //kết thúc
// }