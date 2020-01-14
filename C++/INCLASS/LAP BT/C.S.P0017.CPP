/* 
   name: Pham Duy Dat
   Class: SE1403
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <time.h>
#include <ctype.h>

#define inTomi 0.000015783 

void opt1() {
    int time;
	float speed, gallons;
	printf("How many minutes did you drive?\n");
	scanf("%d",&time);
	printf("What was the average speed of the car during that time?\n");
    scanf("%f",&speed);
	printf("How many gallons of gas did your car use?\n");
    scanf("%f",&gallons);
    printf("Your car average %.2f miles per gallons", speed/60*time/gallons);
}

void opt2() {
	float radius;
    int revolutions ;
	printf("What is the radius of your tires, in inches?\n");
	scanf("%f",&radius);
	printf("How many revolutions did your car's tires make?\n");
    scanf("%d",&revolutions );
    printf("Your can traveled %.2f miles", 3.14*2*radius*revolutions*inTomi);

}

void opt3() {
    float radius,amount ;
    int revolutions;
	printf("What is the radius of your tires, in inches?\n");
	scanf("%f",&radius);
	printf("How many revolutions did your car's tires make?\n");
    scanf("%d",&revolutions );
    printf("How many gallons of gas did your car uses\n");
    scanf("%d",&amount);
    printf("Your car averaged %.2f miles per gallon\n",3.14*2*radius*revolutions*inTomi/amount);
}


void menu() {
    printf("---------------------------\n");
    printf("1. Calculating Fuel Economy\n");
    printf("2. Calculating Distance Traveled\n");
    printf("3. Revised Fuel Economy Calculation\n");
    printf("---------------------------\n");
}

int main() {
    int opt;
    do {
    system("cls");
    menu();
    printf("Your opt? ");   scanf("%d",&opt);
    switch(opt)  {
            case 1: printf("\n"); opt1(); break;
            case 2: printf("\n"); opt2(); break;
            case 3: printf("\n"); opt3(); break;
            case 4: break;
            default: printf("-----wrong option------\n"); break;
            }
        if (opt!=4) { 
            printf("\n\n");
            fflush(stdin);
            system ("pause");
        }
    } while (opt!=4);
}
