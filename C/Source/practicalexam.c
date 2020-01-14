#include <Stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAXN 20

void input(), output(), printhighest();
void find(), delete(), sort(), printMaxDigits();


int menu() {
    printf("---------------------------\n");
    printf("1. Add some new students (press Spacebar key to escape) \n");
    printf("2. Search and print out students using a name inputted\n");
    printf("3. Print out students in a range\n");
    printf("4. Print out students with the highest mark\n");
    printf("5. Remove a student based on a code inputted\n");
    printf("6. Print out the list based on name in ascending order then mark in descending order.\n");
    printf("7. quit\n");
    printf("---------------------------\n");
}

int main() {
    int opt,n=0;
    char code[MAXN][21], name[MAXN][20];
    float mark[MAXN];
    do {
    system("cls");
    menu();
    printf("Your opt? ");   scanf("%d",&opt);
    switch(opt)  {
            case 1: printf("\n"); input(name,code,mark,&n); break;
            case 2: printf("\n"); find(name,code,mark,n); break;
            case 3: printf("\n"); printhighest(name,code,mark,n); break;
            case 4: printf("\n"); printMaxDigits(name,code,mark,n); break;
            case 5: printf("\n"); delete(name,code,mark,&n); break;
            case 6: printf("\n"); sort(name,code,mark,n); break; 
            case 7: break;
            default: printf("-----wrong option------\n"); 
            }
        if (opt>0 && opt<7) { 
            printf("\n\n");
            fflush(stdin);
            system ("pause");
        }
    } while (opt!=7);
    system ("pause");
}

void output(char name[][21],char code[][21], float mark[], int n) {
    for (int i=0; i<n;i++) {
        printf("\n%d. names: %s\n",i,name[i]);
        printf("%d. codes: %s\n",i,code[i]);
        printf("%d. mark: %g\n",i,mark[i]);
    }
}

void input(char name[][21],char code[][21], float mark[],int *n) {
    char enter[20];
    do {
        printf("%d. names: ", *n); fflush(stdin); gets(enter); // scanf("%[^\n]",names);
        if (enter[0] != ' ') {
            strcpy(name[*n],enter);
            printf("%d. codes: ", *n); fflush(stdin); scanf("%[^\n]",code[*n]);
            printf("%d. mark: ",*n); scanf("%f",&mark[*n]);
            printf("\n");
            (*n)++;    
        }
    } while (enter[0] != ' ');
    printf("\nAfter adding: \n");	output(name,code,mark,*n);	
}

void find(char name[][21],char code[][21],float mark[], int n) {
    char search[20];
    printf("tim ai ? "); fflush(stdin); gets(search);
    for (int i=0; i<n ; i++) {
        if ( strcmp(name[i],search) == 0 ) {
            printf("%d. name: %s\n",i, name[i]);
            printf("%d. codes: %s\n",i,code[i]);
            printf("%d. mark: %g\n",i,mark[i]);
        }
        else printf("sorry,not found...! \n");
    }
}

void printhighest(char name[][21],char code[][21],float mark[], int n) {
    float min,max;
    printf("enter min: "); scanf("%f",&min);
    printf("enter max: "); scanf("%f",&max);
    for (int i=0; i<n; i++) {
        if (mark[i]>min && mark[i]<max) {
            printf("%d. name: %s\n",i, name[i]);
            printf("%d. codes: %s\n",i,code[i]);
            printf("%d. mark: %g\n",i,mark[i]);
        }
    }
}

float findmax(float mark[], int n) {
    int count[20];
    int dem=0, i;
    float max = mark[0];
    for (i = 1; i < n; i++)
        if (max < mark[i]) {
            max = mark[i];
            count[i]=i;
        }
    return max;
}

void printMaxDigits(char name[][21],char code[][21],float mark[], int n){
    float max = findmax(mark,n);
    for (int i = 1; i < n; i++) {
        if (max == mark[i]) {
            printf("%d. name: %s\n",i, name[i]);
            printf("%d. codes: %s\n",i,code[i]);
            printf("%d. mark: %g\n",i,mark[i]);
        }
    }
}

int findcode(char code[][21], char search[], int n) {
    for (int i=0; i<n;i++) if ( strcmp(code[i],search) == 0 ) return i;
    return -1;
}

void delete(char name[][21],char code[][21],float mark[], int *n) {
    char search[20];
    printf("muon xoa ai gi? "); fflush(stdin); gets(search);
    int findid = findcode(code,search,*n);
    if (findid >=0) {
        printf("%s contains %s \n\n",code[findid],name[findid]);
		for (int i=findid;i<(*n-1);i++) {
            strcpy(code[i],code[i+1]);
			strcpy(name[i],name[i+1]);
			mark[i]=mark[i+1];
			}
		(*n)--;
		printf("After deleting: \n"); output(name,code,mark,*n);
    }
	else printf("sorry,not found...! \n");
}

void swap(char a[], char b[]){
	char t[31];
	strcpy(t,a); 
    strcpy(a,b); 
    strcpy(b,t);
}

void swapInt(float *a, float *b){
	float t;
	t=*a; 
    *a=*b; 
    *b=t;
}

void sort(char name[][21],char code[][21],float mark[], int n){
	for (int i=0; i<n-1; i++)
    	for (int j=i+1; j<n; j++ ) {
        int checkname = strcmp(name[i],name[j]);
            if (checkname > 0 || (mark[i]< mark[j] ) ) {
                swap(code[i],code[j]);
                swap(name[i],name[j]);
                swapInt(&mark[i],&mark[j]);
            }
        }
    printf("After sorting: \n");  output(name,code,mark,n);
}






