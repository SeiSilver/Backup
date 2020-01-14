// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void input(double* grade, int& n) {
    printf("Please Enter a number: \n");
    int i = 0;
    while (true) {
        scanf("%lf", &grade[i]);
        n++;
        if (grade[i] == -999) {
            grade[i] = 0;
            n--;
            break;
        }
        i++;
    }
    printf("\n");
}

void draw(double* grade, int n) {
    printf("\nHere is a histogram of the adjusted data:\n\n");
    for (int i = 0, j = 4; i <= 100; i += 5, j = i + 4) {
        if (i != 100)
            printf("%2d-%2d| ", i, j);
        else
            printf("%5d| ", 100);
        for (int c = 0; c < n; c++) {
            if (grade[c] >= i && grade[c] <= j) printf("*");
        }
        printf("\n");
    }
}

void positonMax(double* grade, int& n) {
    double max = grade[0];
    int pos = 0;
    for (int i = 0; i < n; i++) {
        if (max < grade[i]) {
            max = grade[i];
            pos = i;
        }
    }
    for (int i = pos; i < n; i++) {
        grade[i] = grade[i + 1];
    }
    n--;
    printf("The data has been delete by removing the Maximum %.2lf\n", max);
}

void positonMin(double* grade, int& n) {
    double min = grade[0];
    int pos = 0;
    for (int i = 0; i < n; i++) {
        if (min > grade[i]) {
            min = grade[i];
            pos = i;
        }
    }
    for (int i = pos; i < n; i++) {
        grade[i] = grade[i + 1];
    }
    n--;
    printf("The data has been delete by removing the Minimum %.2lf\n", min);
}

double average(double* grade, int& n) {
    double res = 0;
    for (int i = 0; i < n; i++) {
        res += grade[i];
    }
    return res /= n;
}

double standarddeviation(double* grade, int& n) {
    double res = 0;
    double mean = average(grade, n);
    for (int i = 0; i < n; i++) {
        res += pow(mean - grade[i], 2);
    }
    return sqrt(res / n);
}

int main() {
    double grade[100] = {};
    int n = 0;
    input(grade, n);
    positonMin(grade, n);
    positonMax(grade, n);
    printf("The adjusted mean is %.2lf\n", average(grade, n));
    printf("The adjusted standard deviation is %.2lf\n", standarddeviation(grade, n));
    draw(grade, n);
    system("pause");
}
