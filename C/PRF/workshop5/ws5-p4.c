#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

float Checkequation(float *pa, float *pb,float *pc) {
    float A;
    if (*pa==0) {
		if (*pb==0) {
			if (*pc==0) printf("Phuong trinh vo so nghiem\n");
			else printf("Phuong trinh vo nghiem\n");
		} else {
			printf("Phuong trinh co 1 nghiem: %f\n",-(*pb)/(*pc));
		}
	}
    else {
		A=(*pb)*(*pb)-4*(*pa)*(*pc);
		if (A<0) printf("Phuong trinh vo nghiem\n");
		if (A==0) {
			printf("Phuong trinh da nghiem kep:%f \n",-(*pb)/(2*(*pa)) );
		} if (A>0) {
			printf("Phuong trinh co 2 nghiem phan biet x1= %f, x2= %f\n",(-(*pb)+sqrt(A))/(2*(*pa)), (-(*pb)-sqrt(A))/(2*(*pa)) );
        }
    }
}

int func1() {
    float a,b,c;
    printf("Quadratic equation: ax^2 + bx + c=0\n"); 
    printf("a: "); scanf("%f",&a);
    printf("\nb: "); scanf("%f",&b);
    printf("\nc: "); scanf("%f",&c);
    Checkequation(&a,&b,&c);
}

float bank(float d, float r, float n) {
    float P = d*pow(1+r,n);
    printf ("Amount at the  %.0fth year: %f\n",n,P);
}

int func2 () {
    float d=-1,r=2.0,n=-1;
    while (d<0) { printf("\nenter d (d>0): "); scanf(" %f",&d); }
    while (r<0.0 || r>=1.0) { printf("\nenter r (0.0<r<1.0): "); scanf(" %f",&r); }
    while (n<0) { printf("\nenter n (n>0): "); scanf(" %f",&n); }
    bank(d,r,n);
}

int main()  {
    int opt;
    float x;
    do {
        system("cls");
        printf("1- Quadratic equation \n");
        printf("2- Bank deposit problem \n");
         printf("3- Quit \n");
        printf("Your opt? ");    scanf("%d",&opt);
        switch(opt)  {
            case 1: func1();  break;
            case 2: func2();  break;
            case 3: break;
            default: printf("ERROR \n");
            }
        if (opt!=3) { fflush(stdin); system("pause");}
    }
    while (opt!=3);
    system ("pause");
    return 0;
}