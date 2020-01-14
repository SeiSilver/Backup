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
    printf("1- Add a student \n");
    printf("2- Remove a student \n");
    printf("3- Search a student  \n");
    printf("4- Print the list in ascending order \n");
    printf("5- quit \n");
    printf("---------------------------\n");
}

int main()  {
    int opt, n=0;
    char names[MAXN][20];
    do {
        menu();
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: input(names,&n); break;
            case 2: delete(names,&n); break; 
            case 3: find(names,n); break;
            case 4: sort(names,n); break; 
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

char* lTrim(char s[]){
   int i=0;
   while (s[i]==' ') i++;
   if(i>0) strcpy(&s[0],&s[i]);
   return s;
}

char* rTrim(char s[]){
   int i=strlen(s)-1;
   while(s[i]==' ') i--;
   s[i+1]='\0';
   return s;
}
char* trim(char s[]){
   rTrim(lTrim(s));
   char *ptr=strstr(s,"  ");
   while(ptr!=NULL){
      strcpy(ptr,ptr+1);
      ptr=strstr(s,"  ");
   }
   return s;
}
char* nameStr(char s[]){
   trim(s);
   strlwr(s);
   int L=strlen(s);
   int i;
   for (i=0;i<L;i++) s[i]=toupper (s[i]);
    //   if(i==0 || (i>0 && s[i-1]==' ')) s[i]=toupper (s[i]); // in khi tự đầu dòng
   return s;
}

void output(char names[][20], int n) {
    for (int i=0; i<n;i++) 
        printf("\n%d. names: %s\n",i,names[i]); 
}

void input(char names[][20], int *n) {
    char enter[20];
    printf("Press enter to exit\n");
    do {
        printf("%d. names: ", *n); fflush(stdin); gets(enter); // scanf("%[^\n]",names);
        fflush(stdin);
        if (enter[0] != '\0') {
            strcpy(names[*n],enter);
            nameStr(names[*n]);
            printf("\n");
            (*n)++;
        }
    } while (enter[0] != '\0');
    printf("\nAfter adding: \n");	output(names,*n);	
}

void find(char names[][20], int n) {
    char search[20];
    int stt=0;
    printf("Who you want to search? "); fflush(stdin); gets(search);
    nameStr(search);
    for (int i=0; i<n ; i++) {
        if ( strstr(names[i],search) != NULL ) {
            printf("\n%d. names: %s\n",i,names[i]);
            stt=1;
        }
    } if (stt!=1) printf("sorry,not found...! \n");
}

int findcode(char names[][20], char search[], int n) {
    for (int i=0; i<n;i++) if ( strcmp(names[i],search) == 0 ) return i;
    return -1;
}

void delete(char names[][20], int *n) {
    char search[20];
    printf("Who you want to remove? "); fflush(stdin); gets(search);
    nameStr(search);
    int findid = findcode(names,search,*n);
    if (findid >=0) {
        printf("%s is removed \n",names[findid]);
		for (int i=findid;i<(*n-1);i++) {
			strcpy(names[i],names[i+1]);
        }
		(*n)--;
		printf("After deleting: \n"); output(names,*n);
    }
	else printf("sorry,not found...! \n");
}

void swap(char a[], char b[]){
	char t[31];
	strcpy(t,a); 
    strcpy(a,b); 
    strcpy(b,t);
}

void sort(char names[][20], int n){
	for (int i=0; i<n-1; i++)
    	for (int j=i+1; j<n; j++ ) {
            int checkname = strcmp(names[i],names[j]);
            if (checkname >0 ) {
                swap(names[i],names[j]);
            }
        }
    printf("After sorting: \n");  output(names,n);
}