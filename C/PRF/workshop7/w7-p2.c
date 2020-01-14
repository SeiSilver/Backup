#include <Stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAXN 20

void input(), output(), sort();
void find(), delete();

int menu() {
    system("cls");
    printf("---------------------------\n");
    printf("1. Adding a new employee  \n");
    printf("2. Find data about employees using a name inputted \n");
    printf("3. Remove an employee based on a code inputted \n"); 
    printf("4. Print the list in descending order based on salary + allowance. \n"); 
    printf("5- quit \n");
    printf("---------------------------\n");
}

int main()  {
    int opt, n=0;
    char names[MAXN][20], codes[MAXN][8];
    double salary[MAXN], allowance[MAXN];
    do {
        menu();
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: input(names,codes,salary,allowance,&n); break;
            case 2: find(names,codes,salary,allowance,n); break;
            case 3: delete(names,codes,salary,allowance,&n); break;
            case 4: sort(names,codes,salary,allowance,n); break; 
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

void output(char names[][20],char codes[][8], double salary[], double allowance[], int n) {
    for (int i=0; i<n;i++) {
        printf("\n%d. employee: %s\n",i,names[i]);
        printf("%d. codes: %s\n",i,codes[i]);
        printf("%d. salary: %g\n",i,salary[i]);
        printf("%d. allowance: %g\n",i,allowance[i]);
    }
}

void input(char names[][20],char codes[][8], double salary[], double allowance[], int *n) {
    char enter[20];
    do {
        printf("%d. employee name: ", *n); fflush(stdin); gets(enter); // scanf("%[^\n]",names);
        if (enter[0] != '\0') {
            strcpy(names[*n],enter);
            printf("%d. codes: ", *n); fflush(stdin); scanf("%[^\n]",codes[*n]);
            printf("%d. salary: ", *n); fflush(stdin); scanf("%lf",&salary[*n]);
            printf("%d. allowance: ", *n); fflush(stdin); scanf("%lf",&allowance[*n]);
            printf("\n");
            (*n)++;    
        }
    } while (enter[0] != '\0');
    printf("\nAfter adding: \n");	output(names,codes,salary,allowance,*n);	
}

void find(char names[][20],char codes[][8], double salary[], double allowance[], int n) {
    char search[20];
    int stt=1;
    printf("who you want search ? "); fflush(stdin); gets(search);
    for (int i=0; i<n ; i++) {
        if ( strstr(names[i],search) != NULL ) {
            printf("\n%d. employee: %s\n",i,names[i]);
            printf("%d. codes: %s\n",i,codes[i]);
            printf("%d. salary: %g\n",i,salary[i]);
            printf("%d. allowance: %g\n",i,allowance[i]);
            stt=0;
        }
    } if (stt!=0) printf("sorry,not found...! \n");
}

int findcode(char codes[][8], char search[], int n) {
    for (int i=0; i<n;i++) if ( strcmp(codes[i],search) == 0 ) return i;
    return -1;
}

void delete(char names[][20],char codes[][8], double salary[], double allowance[], int *n) {
    char search[20];
    printf("Who you want to remove ? "); fflush(stdin); gets(search);
    int findid = findcode(codes,search,*n);
    if (findid >=0) {
        printf("%s is removed \n",names[findid]);
		for (int i=findid;i<(*n-1);i++) {
            strcpy(codes[i],codes[i+1]);
			strcpy(names[i],names[i+1]);
			salary[i]=salary[i+1];
			allowance[i]=allowance[i+1];
        }
		(*n)--;
		printf("After deleting: \n"); output(names,codes,salary,allowance,*n);
    }
	else printf("sorry,not found...! \n");
}

void swap(char a[], char b[]){
	char t[31];
	strcpy(t,a); 
    strcpy(a,b); 
    strcpy(b,t);
}

void swapInt(double *a, double *b){
	double t;
	t=*a; 
    *a=*b; 
    *b=t;
}

void sort(char names[][20],char codes[][8], double salary[], double allowance[], int n){
	for (int i=0; i<n-1; i++)
    	for (int j=i+1; j<n; j++ ) {
            if ( salary[i] + allowance[i] < salary[j] + allowance[j] ) {
                swap(codes[i],codes[j]);
                swap(names[i],names[j]);
                swapInt(&salary[i],&salary[j]);
                swapInt(&allowance[i],&allowance[j]);
            }
        }
    printf("After sorting: \n");  output(names,codes,salary,allowance,n);
}