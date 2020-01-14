#include <Stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAXN 20

void input(), output(), sort(), printrange(), find();

int menu() {
    system("cls");
    printf("---------------------------\n");
    printf("1. Adding a new soft drink  \n");
    printf("2. Printing out items which belong to a known make \n");
    printf("3. Printing out items whose volumes are between v1 and v2 ( integers) \n"); 
    printf("4. Printing the list in ascending order based on volumes then prices \n"); 
    printf("5- quit \n");
    printf("---------------------------\n");
}

int main()  {
    int opt, n=0;
    char names[MAXN][20], make[MAXN][20];
    int volume[MAXN], price[MAXN], duration[MAXN];
    do {
        menu();
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: input(names,make,volume,price,duration,&n); break;
            case 2: find(names,make,volume,price,duration,n); break;
            case 3: printrange(names,make,volume,price,duration,n); break;
            case 4: sort(names,make,volume,price,duration,n); break; 
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

void output(char names[][20],char make[][20], int volume[], int price[], int duration[],int n) {
    for (int i=0; i<n;i++) {
        printf("\n%d. name of drink: %s\n",i,names[i]);
        printf("%d. make: %s\n",i,make[i]);
        printf("%d. volume: %d\n",i,volume[i]);
        printf("%d. price: %d\n",i,price[i]);
        printf("%d. duration: %d\n",i,duration[i]);
    }
}

void input(char names[][20],char make[][20], int volume[], int price[], int duration[],int *n) {
    char enter[20];
    printf("Press enter to exit!\n\n");
    do {
        printf("%d. name of drink: ", *n); fflush(stdin); gets(enter); // scanf("%[^\n]",names);
        if (enter[0] != '\0') {
            strcpy(names[*n],enter);
            printf("%d. codes: ", *n); fflush(stdin); scanf("%[^\n]",make[*n]);
            printf("%d. volume: ", *n); fflush(stdin); scanf("%d",&volume[*n]);
            printf("%d. price: ", *n); fflush(stdin); scanf("%d",&price[*n]);
            printf("%d. duration: ", *n); fflush(stdin); scanf("%d",&duration[*n]);
            printf("\n");
            (*n)++;    
        }
    } while (enter[0] != '\0');
    printf("\nAfter adding: \n");	output(names,make,volume,price,duration,*n);	
}

void find(char names[][20],char make[][20], int volume[], int price[], int duration[],int n) {
    char search[20];
    int stt=1;
    printf("who you want search ? "); fflush(stdin); gets(search);
    for (int i=0; i<n ; i++) {
        if ( strstr(make[i],search) != NULL ) {
            printf("\n%d. name of drink: %s\n",i,names[i]);
            printf("%d. make: %s\n",i,make[i]);
            printf("%d. volume: %d\n",i,volume[i]);
            printf("%d. price: %d\n",i,price[i]);
            printf("%d. duration: %d\n",i,duration[i]);
            stt=0;
        }
    } if (stt!=0) printf("sorry,not found...! \n");
}

void printrange(char names[][20],char make[][20], int volume[], int price[], int duration[],int n) {
    int min,max;
    int stt=1;
    printf("enter min: "); scanf("%d",&min);
    printf("enter max: "); scanf("%d",&max);
    for (int i=0; i<n; i++) {
        if (volume[i]>min && volume[i]<max) {
            printf("\n%d. name of drink: %s\n",i,names[i]);
            printf("%d. make: %s\n",i,make[i]);
            printf("%d. volume: %d\n",i,volume[i]);
            printf("%d. price: %d\n",i,price[i]);
            printf("%d. duration: %d\n",i,duration[i]);
            stt=0;
        }
    } if (stt!=0) printf("sorry,not found...! \n");
}

void swap(char a[], char b[]){
	char t[31];
	strcpy(t,a); 
    strcpy(a,b); 
    strcpy(b,t);
}

void swapInt(int *a, int *b){
	int t;
	t=*a; 
    *a=*b; 
    *b=t;
}

void sort(char names[][20],char make[][20], int volume[], int price[], int duration[],int n) {
	for (int i=0; i<n-1; i++)
    	for (int j=i+1; j<n; j++ ) {
            if ( volume[i] > volume[j] || ( volume[i] == volume[j] && price[i] > price[j] )) {
                swap(names[i],names[j]);
                swap(make[i],make[j]);
                swapInt(&volume[i],&volume[j]);
                swapInt(&price[i],&price[j]);
                swapInt(&duration[i],&duration[j]);
            }
        }
    printf("After sorting: \n");  output(names,make,volume,price,duration,n);	
}