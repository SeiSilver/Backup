// Day of the Programmer

#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
int days = 215; //thang 1 -> 8 tru thang 2 feb has variable days so 
void solve(int year){
    int febdays;
    if(year<=1917) //julian calender
        if(year%4 == 0)
            febdays=29;
        else
            febdays=28;
    else if(year == 1918)
        febdays=15; 
    else
    {
        if((year%400 == 0)|| (year%4 == 0)&&(year%100 !=0))
            febdays=29;
        else
            febdays=28;
    }
    printf("Day of the Programmer\n%d.09.%d\n",256-(febdays+days),year);//febdays+days will be 8 months days
}

int main() {
    int year; 
    scanf("%d", &year);
    int result_size;
    solve(year);
    system("pause");
}