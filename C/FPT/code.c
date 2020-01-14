#include <Stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAXN 50

void opt1() {
    int i;
    char codes[MAXN][9], names[MAXN][21];
    double salaries[MAXN], allowances[MAXN];
    add(codes[i][9], names[i][21], salaries, allowances);
}

void add(char codes[][9],char names[], double salaries[], double allowances[]) {
    fflush(stdin);
    // do {
    printf("enter name thu %d: ",i); scanf ( "%[^\n]" , &names[i] );

    // if (names[i] != " ") {
    //     printf("enter code"); scanf ("%[^\n]",&codes[i]);
    //     printf("enter salary"); scanf ("%[^\n]",&salaries[i]);
    //     printf("enter allowance"); scanf ("%[^\n]",&allowances[i]);
    //     printf("Add complete! \n");
    // }
    // i++;
    // } while (names[i] != " ");
}


int main()  {
    int opt;
    do {
        system("cls");
        printf("1- add \n");
        printf("2- printBasedName \n");
        printf("3- findCode \n");
        printf("4- removePos \n");
        printf("5- sort & Print all the list to the monitor \n");
        printf("6- print based on salary + allowance \n");
        printf("7- quit \n");
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: printf("\n"); opt1(); break;
            // case 2: printf("\n"); opt2(); break;
            // case 3: printf("\n"); opt3(); break;
            // case 4: printf("\n"); opt4(); break;
            // case 5: printf("\n"); opt5(); break;
            // case 6: printf("\n"); opt6(); break; 
            case 7: break;
            default: { printf("-----wrong option------\n"); system ("pause"); }
        }
        if (opt>0 && opt<7) { 
            printf("\n\n");
            fflush(stdin);
            system ("pause");
        }
    }
    while (opt!=7);
    system ("pause");
    return 0;
}
