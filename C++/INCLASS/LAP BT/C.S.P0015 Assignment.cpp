// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void input(double &small, double &large, int &invitations) {
    do {
        printf("What is the cost of a small package (in dollars) ?\n");
        scanf("%lf", &small);
        if (small < 0 || small > 500) printf("The cost must be a positive real numbers less than 500\nTry again!\n");
    } while (small < 0 || small > 500);

    do {
        printf("What is the cost of a large package (in dollars) ?\n");
        scanf("%lf", &large);
        if (large < 0 || large > 500) printf("The cost must be a positive real numbers less than 500\nTry again!\n");
    } while (large < 0 || large > 500);

    do {
        printf("How many invitations are you sending out?\n");
        scanf("%d", &invitations);
        if (invitations < 0 || invitations > 10000)
            printf("The number of invitations must be a positive integer less than 10000\nTry again!\n");
    } while (invitations < 0 || invitations > 10000);
}

void output(double small, double large, int invitations) {
    int smallpack = 0, largepack = 0;
    while (invitations > 0) {
        invitations -= 50;
        smallpack++;
    }
    int stt = 0;
    double res = smallpack * small;

    int i = smallpack, j = 0;
    while (stt == 0) {
        if (i <= 0) {
            stt = 1;
            i = 0;
        }
        if (res >= i * small + j * large) {
            res = i * small + j * large;
            largepack = j;
            smallpack = i;
        }
        i -= 4;
        j++;
    }

    printf("You should order %d of small package\n", smallpack);
    printf("You should order %d of large package\n", largepack);
    printf("Your cost for invitations will be: %.2lf\n", res);
}

int main() {
    double small, large;
    int invitations;
    input(small, large, invitations);
    output(small, large, invitations);
    system("pause");
}
