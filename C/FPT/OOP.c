#include<stdio.h> 
#include<conio.h> 
#include<math.h>
#include<stdlib.h>

int main() { 
    struct OOP
    {
        float x;
        float y;
    };
    struct OOP input;

    fflush(stdin);
    printf("Enter x: "); scanf("%f",&input.x); 
    fflush(stdin);
    printf("Enter y: "); scanf("%f",&input.y);
    
    double addition, substraction, division, multiplication;
    int stt=1;
    printf("KET QUA \n");
    addition = input.x + input.y;
    substraction = input.x - input.y;
    if (input.y != 0) division = input.x / input.y;
    else stt=0;

    multiplication = input.x * input.y;
    printf("addition = %g +%g = %g\n",input.x, input.y, addition);
    printf("substraction = %g - %g = %g\n", input.x, input.y ,substraction);
    printf("multiplication = %g * %g = %g\n",input.x, input.y, multiplication);
    if (stt != 0) printf("division = %g / %g = %g\n",input.x, input.y, division);
    else printf("division ERROR !\n\n"); 
    printf("\n");

    system("pause");
} 
