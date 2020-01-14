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
    char names[MAXN][20], mark[MAXN][20];
    do {
        menu();
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: input(names,mark,&n); break;
            case 2: find(names,mark,n); break;
            // case 3: delete(names,mark,prices,categories,&n); break;
            // case 4: sort(names,mark,prices,categories,n); break; 
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

void input(char names[][20],char mark[][20], int *n) {
    char enter[20];
    FILE*output=fopen("FileCode\\Sort.out","a");
    // fseek(output,0,SEEK_END);
    do {
        printf("%d. names: ", *n); fflush(stdin); gets(enter); // scanf("%[^\n]",names);
        if (enter[0] != '\0') {
            strcpy(names[*n],enter);
            printf("%d. mark: ", *n); fflush(stdin); scanf("%[^\n]",mark [*n]);
            printf("\n");
            fprintf(output,"%-10s %15s\n",names[*n],mark[*n]);
            (*n)++;   
        }
    } while (enter[0] != '\0');
    fclose(output);
}

void find(char names[][20],char mark[][20], int n) {
    int stt=1;
    char search[1000];
    char find[1000];
    // char *search = (char *) calloc( 100, sizeof( char ));
    FILE*output=fopen("FileCode\\Sort.out","r");
    // fgets(search,1000,output);
    printf("tim cai gi ? "); fflush(stdin); gets(find);
    for (int i=0;i<n;i++) fscanf(output,"%[^\n]",&search[i]);

    for (int i=0; i<n ; i++) {
        if ( strstr(search[i],find) != NULL ) {
            printf("\n%d. names: %s\n",i,names[i]);
            printf("%d. mark: %s\n",i,mark[i]);
            stt =0;
        }
    } if (stt=0) printf("Not found!");
    fclose(output);
}

// int findcode(char mark[][9], char search[], int n) {
//     for (int i=0; i<n;i++) if ( strcmp(mark[i],search) == 0 ) return i;
//     return -1;
// }

// void delete(char names[][20],char mark[][9], double prices[], char categories[][13], int *n) {
//     char search[20];
//     printf("muon xoa ai gi? "); fflush(stdin); gets(search);
//     int findid = findcode(mark,search,*n);
//     if (findid >=0) {
//         printf("found on %d    value is: %s \n",findid,names[findid]);
// 		for (int i=findid;i<(*n-1);i++) {
//             strcpy(mark[i],mark[i+1]);
// 			strcpy(names[i],names[i+1]);
// 			prices[i]=prices[i+1];
// 			strcpy(categories[i],categories[i+1]);
//         }
// 		(*n)--;
// 		printf("After deleting: \n"); output(names,mark,prices,categories,*n);
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

// void sort(char names[][20],char mark[][9],double prices[], char categories[][13], int n){
// 	for (int i=0; i<n-1; i++)
//     	for (int j=i+1; j<n; j++ ) {
//             int check = strcmp(mark[i],mark[j]);
//             int checkname = strcmp(names[i],names[j]);
//             if (check > 0 || (check==0 && checkname >0 ) ) {
//                 swap(mark[i],mark[j]);
//                 swap(names[i],names[j]);
//                 swapInt(&prices[i],&prices[j]);
//                 swap(categories[i],categories[j]);
//             }
//         }
//     printf("After sorting: \n");  output(names,mark,prices,categories,n);
// }