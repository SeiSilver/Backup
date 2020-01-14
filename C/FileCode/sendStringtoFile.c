#include <Stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAXN 20

void input(), output(), sort(), modify();
void find(), delete(), insert();

int menu() {
    system("cls");
    printf("---------------------------\n");
    printf("1. Add some item  \n");
    printf("2. Print out items which belong to a known category \n");
    printf("3. Remove an item based on a code inputted \n"); 
    printf("4. Print the list in ascending order based on categories then names \n"); 
    printf("5- quit \n");
    printf("---------------------------\n");
}

int main()  {
    int opt, n=0;
    char names[MAXN][20], codes[MAXN][9], categories[MAXN][13];
    double prices[MAXN];
    do {
        menu();
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: input(names,codes,prices,categories,&n); break;
            // case 2: find(names,codes,prices,categories,n); break;
            // case 3: delete(names,codes,prices,categories,&n); break;
            // case 4: sort(names,codes,prices,categories,n); break; 
            case 5: break;
            default: { printf("-----wrong option------\n"); system ("pause"); }
        }
        if (opt>0 && opt<5) { 
            printf("\n\n");
            fflush(stdin);
            system ("pause");
        }
    } while (opt!=5);
    system ("pause");
    return 0;
}

void output(char names[][20],char codes[][9], double prices[], char categories[][13], int n) {
    for (int i=0; i<n;i++) {
        printf("\n%d. names: %s\n",i,names[i]);
        printf("%d. codes: %s\n",i,codes[i]);
        printf("%d. prices: %g\n",i,prices[i]);
        printf("%d. categories: %s\n",i,categories[i]);
    }
}

void input(char names[][20],char codes[][9], double prices[], char categories[][13], int *n) {
    char enter[20];
    do {
        printf("%d. names: ", *n); fflush(stdin); gets(enter); // scanf("%[^\n]",names);
        if (enter[0] != '\0') {
            strcpy(names[*n],enter);
            printf("%d. codes: ", *n); fflush(stdin); scanf("%[^\n]",codes[*n]);
            printf("%d. prices: ", *n); fflush(stdin); scanf("%lf",&prices[*n]);
            printf("%d. categories: ", *n); fflush(stdin); scanf("%[^\n]",&categories[*n]);
            printf("\n");
            (*n)++;    
        }
    } while (enter[0] != '\0');
    printf("\nAfter adding: \n");	output(names,codes,prices,categories,*n);	
}

// void find(char names[][20],char codes[][9], double prices[], char categories[][13], int n) {
//     char search[20];
//     printf("tim categories ? "); fflush(stdin); gets(search);
//     for (int i=0; i<n ; i++) {
//         if ( strcmp(categories[i],search) == 0 ) {
//             printf("\n%d. names: %s\n",i,names[i]);
//             printf("%d. codes: %s\n",i,codes[i]);
//             printf("%d. prices: %g\n",i,prices[i]);
//             printf("%d. categories: %s\n",i,categories[i]);
//         }
//     }
// }

// int findcode(char codes[][9], char search[], int n) {
//     for (int i=0; i<n;i++) if ( strcmp(codes[i],search) == 0 ) return i;
//     return -1;
// }

// void delete(char names[][20],char codes[][9], double prices[], char categories[][13], int *n) {
//     char search[20];
//     printf("muon xoa ai gi? "); fflush(stdin); gets(search);
//     int findid = findcode(codes,search,*n);
//     if (findid >=0) {
//         printf("found on %d    value is: %s \n",findid,names[findid]);
// 		for (int i=findid;i<(*n-1);i++) {
//             strcpy(codes[i],codes[i+1]);
// 			strcpy(names[i],names[i+1]);
// 			prices[i]=prices[i+1];
// 			strcpy(categories[i],categories[i+1]);
//         }
// 		(*n)--;
// 		printf("After deleting: \n"); output(names,codes,prices,categories,*n);
//     }
// 	else printf("sorry,not found...! \n");
// }

// void swap(char a[], char b[]){
// 	char t[31];
// 	strcpy(t,a); 
//     strcpy(a,b); 
//     strcpy(b,t);
// }

// void swapInt(double *a, double *b){
// 	double t;
// 	t=*a; 
//     *a=*b; 
//     *b=t;
// }

// void sort(char names[][20],char codes[][9],double prices[], char categories[][13], int n){
// 	for (int i=0; i<n-1; i++)
//     	for (int j=i+1; j<n; j++ ) {
//             int check = strcmp(codes[i],codes[j]);
//             int checkname = strcmp(names[i],names[j]);
//             if (check > 0 || (check==0 && checkname >0 ) ) {
//                 swap(codes[i],codes[j]);
//                 swap(names[i],names[j]);
//                 swapInt(&prices[i],&prices[j]);
//                 swap(categories[i],categories[j]);
//             }
//         }
//     printf("After sorting: \n");  output(names,codes,prices,categories,n);
// }