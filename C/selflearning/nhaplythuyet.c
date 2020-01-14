// #include<stdio.h>
// int main() {
// 	char ten[100];
// 	int tuoi;
// 	printf("Ban hay nhap tuoi cho sinh vien : \n");
// 	scanf("%d",&tuoi);
// 	printf("Ban hay nhap ten cho sinh vien : \n");
//     fflush(stdin);
// 	gets(ten);
// 	printf("Thong tin sinh vien ban vua nhap la : \n");
// 	printf("Tuoi cua sinh vien : %d\n",tuoi);
// 	printf("Ten cua sinh vien : %s\n",ten);	
// 	return 0;
// }


// #include <stdio.h>
// #include <math.h>
// #include <conio.h>
// #include <stdlib.h>

// double lenh1(double n) {
//     int s1=0;
//     for (int i=0;i<=n;i++)
//     s1=i*(i+1);
//     return s1; 
// }

// double lenh2(double n) {
//     int s2=1;
//     for (int i=1;i<=n;i++)
//     s2*=i;
//     return s2;
// }

// float lenh3(double n) {
//     float s3=0;
//     for (int i=2.0;i<=n;i+=2)
//     s3= s3+1.0/(i*(i+2));
//     return s3;
// }

// double c;
// int choice;

// int main () {
//     do {
//     system ("cls");
//     printf ("1- S1\n");
//     printf ("2- S2\n");
//     printf ("3- S3\n");
//     printf ("4- quit\n\n");
//     printf ("Select an operation: "); scanf("%d",&choice);
//     switch(choice) {
//         case 1: printf("enter c: "); scanf("%lf",&c);
//                 printf("%lf",lenh1(c)); break;
//         case 2: printf("enter c: "); scanf("%lf",&c);
//                 printf("%lf",lenh2(c)); break;
//         case 3: printf("enter c: "); scanf("%lf",&c); 
//                 printf("%lf",lenh3(c)); break;
//     } getchar(); getchar();
//     } while (choice>0 && choice <=3);
//     return 0;
// }
