#include <Stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAXN 10

void input(), output(), sort(), modify();
void find(), delete(), insert();

int menu() {
        system("cls");
        printf("1. Add some item  \n");
        printf("2. Find an item   \n");
        printf("3. Delete an item \n"); 
        printf("4. Insert an item \n"); 
        printf("5. Modify an item \n"); 
        printf("6. Sort the list in ascending order \n");   
        printf("7- quit \n");
}

int main()  {
    int opt, n=0;
    char name[MAXN][20];
    do {
        menu();
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: input(name,&n); break;
            case 2: printf("----- Find an item based on a value inputted ----- \n"); 
                    find(name,&n); break;
            case 3: printf("----- Delete an item based on a value inputted -----\n"); 
                    delete(name,&n); break;
            case 4: printf("chen them 1 dua vao\n"); insert(name,&n); break;
            case 5: printf("thay doi, chinh sua\n"); modify(name, &n); break;
            case 6: printf("sap xep theo thu tu\n"); sort(name,n); break; 
            case 7: break;
            default: { printf("-----wrong option------\n"); system ("pause"); }
        }
        if (opt>0 && opt<7) { 
            printf("\n\n");
            fflush(stdin);
            system ("pause");
        }
    } while (opt!=7);
    system ("pause");
    return 0;
}

void output(char name[][20], int n) {
    for (int i=0; i<n;i++) {
        printf("%d. %s\n",i,name[i]);
    }     
}

void input(char name[][20], int *n) {
    char enter[20];
    int check;
    do {
        printf("%d. name: ", *n); fflush(stdin); gets(enter); // scanf("%[^\n]",name);
        if (enter[0] != '\0') {
            strcpy(name[*n],enter);
            (*n)++;    
        }
    } while (enter[0] != '\0');
    printf("After adding: \n");	output(name, *n);	
}

int findcheck(char name[][20], char search[], int n) {
    for (int i=0; i<n;i++) if ( strcmp(name[i],search) == 0 ) return i;
    return -1;
}

void find(char name[][20], int *n) {
    char search[20];
    printf("tim ai gi? "); fflush(stdin); gets(search);
    int findid = findcheck(name,search,*n);
    if (findid >=0) {
        printf("found on %d    value is: %s \n",findid,name[findid]);
        } 
	else printf("sorry,not found...! \n");
}

void delete(char name[][20], int *n) {
    char search[20];
    printf("muon xoa ai gi? "); fflush(stdin); gets(search);
    int findid = findcheck(name,search,*n);
    if (findid >=0) {
        printf("found on %d    value is: %s \n",findid,name[findid]);
		for (int i=findid;i<(*n-1);i++)
			strcpy(name[i],name[i+1]);
		(*n)--;
		printf("After deleting: \n");	output(name, *n);	
    }
	else printf("sorry,not found...! \n");
}

void swap(char a[], char b[]){
	char t[31];
	strcpy(t,a); 
    strcpy(a,b); 
    strcpy(b,t);
}

void sort(char name[][20], int n){
	for (int i=0; i<n-1; i++)
    	for (int j=i+1; j<n; j++ )
    		if (strcmp(name[i],name[j])>0) swap(name[i],name[j]);
    printf("After sorting: \n");  output(name, n);
}

void insert(char name[][20], int *n) {
    char add[20];
    printf("ban muon them ai vao? "); fflush(stdin); gets(add);
    int i= *n-1;
    if (i < MAXN-1) {
        while (strcmp(name[i],add) >0) {
        strcpy(name[i+1],name[i]);
        i--;
    }
    strcpy(name[i+1],add);
    (*n)++;
	printf("After inserting: \n");  output(name,*n);
    }
    else printf("sorry,not found...! \n");
}

void modify(char name[][20],int *n) {
    char search[20];
    printf("muon chinh sua ai? "); fflush(stdin); gets(search);
    int findid = findcheck(name,search,*n);
    if (findid >=0) {
        printf("Sua thanh: "); gets(search);
        strcpy(name[findid],search);
		printf("After deleting: \n");	output(name, *n);	
    }
	else printf("sorry,not found...! \n");
}
