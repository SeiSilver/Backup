#include <Stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>

int printlist(), addstudent(), searchstudent(), removestudent(), upper(), opt1(), opt2(), opt3(), opt4();

char array[100][100];
int count;
int i=1;

int addstudent() {
    printf("\nID  - Name\n");
    printf("%d     Add: ",i); scanf("%[^\n]",&array[i]);
    i++;
    count++;
    printf("student is added !");   
}

int removestudent() {
    char remove[1];
    int i,n;

    for (int i=1; i<=count; i++) printf("%s\n", array[i]);
    fflush(stdin);

    printf("Enter stundent name wants to remove: "); scanf("%[^\n]",&remove);
    for (i=1;i<=count;i++) {
        if (strstr(array[i],remove) != NULL) for (int j=n;j<=count;j++) {
            array[j]==array[j+1];
        n+=1;
        }  
    }
}

int searchstudent() {   
    char search[1];
    int id;
	int stt=0,o;
	fflush(stdin);
    printf("\n1 - search stundent via name \n"); 
    printf("2 - search stundent via ID \n"); 
    printf("your option ?"); scanf("%d",&o);
    switch(o) {
        case 1: printf("Name: ");
                scanf("%[^\n]",&search);
                for (int i=1; i<=count; i++) {
                    if (strstr(array[i],search) != NULL) {
                        printf("\nID    - Name\n");
                        printf("%d       %s\n",i,array[i]);
                    } 
                } break;
        case 2:     // in theo id dc cấp
        printf("ID: "); scanf("%d",&id);
        printf("\nID    - Name\n");
        printf("%d       %s",id,array[id]);
    }   
}

int printlist() {

}

int menu() {
    system("cls");
    printf("1- Add a student \n");
    printf("2- Remove a student \n");
    printf("3- Search a student  \n");
    printf("4- Print the list in ascending order \n");
    printf("5- quit \n");
}

int main()  {
    int opt;
    do {
        menu();
        printf("Your opt? ");   scanf("%d",&opt);
        switch(opt)  {
            case 1: opt1(); break;
            case 2: opt2(); break;
            case 3: opt3(); break;
            case 4: opt4(); break;
            case 5: break;
            default: printf("Error!!! \n Please enter other option!!!");
        }
        if (opt>0 && opt<5) { 
            printf("\n");
            system ("pause");
            fflush(stdin);
        }
    }
    while (opt !=5);
    system ("pause");
    return 0;
}

int opt1() {
    fflush(stdin);
    addstudent();
}

int opt2() {
    removestudent();
}

int opt3() {
    fflush(stdin);
    searchstudent();
}

int opt4() {

}