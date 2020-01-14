// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void menu() {
    printf("=====================================\n");
    printf("1. Add new item                     |\n");
    printf("2. Delete item                      |\n");
    printf("3. Change the cost of an item       |\n");
    printf("4. Search for item                  |\n");
    printf("5. Display inventory details        |\n");
    printf("6. Quit                             |\n");
    printf("=====================================\n");
}

void getDataFile(int* id, char name[][30], double* cost, char category[], int& n) {
    printf("Welcome to the store!\n");
    printf("Input the file to load: ");
    char filename[30] = {};
    fflush(stdin);
    gets(filename);
    printf("%s have been load successfully to the database!\n", filename);
    char path[] = "Slot 2-3 Assignment/C.S.P0020/";
    strcat(path, filename);
    FILE* f = fopen(path, "r");
    char c;
    while (c = fgetc(f) != EOF) {
        fseek(f, -1, SEEK_CUR);
        fscanf(f, "%d", &id[n]);
        fscanf(f, "%s", name[n]);
        fscanf(f, "%lf", &cost[n]);
        fscanf(f, "\t%c\n", &category[n++]);
    }
    fclose(f);
}

void fileupdate(int* id, char name[][30], double* cost, char* category, int n) {
    FILE* f = fopen("./C.S.P0020/data.txt", "w+");
    int i = 0;
    while (i < n) {
        fprintf(f, "%-10d %-10s %-10.2lf\t%c\n", id[i], name[i], cost[i], category[i]);
        i++;
    }
    fclose(f);
}

void addData(int* id, char name[][30], double* cost, char* category, int& n) {
    printf("Enter ID: ");
    int add;
    scanf("%d", &add);
    for (int i = 0; i < n; i++) {
        if (add == id[i]) {
            printf("This ID already exist! - Try Again\n");
            return addData(id, name, cost, category, n);
        }
    }
    id[n] = add;
    printf("Enter Name: ");
    scanf("%s", name[n]);
    printf("Cost: ");
    scanf("%lf", &cost[n]);
    fflush(stdin);
    printf("Category?: ");
    scanf("%c", &category[n]);
    category[n] = toupper(category[n]);
    n++;
    fileupdate(id, name, cost, category, n);
    printf("%s has been add to database complete!\n", name[n - 1]);
}

void deleteData(int* id, char name[][30], double* cost, char* category, int& n) {
    printf("Enter ID want to delete: ");
    int del;
    scanf("%d", &del);
    for (int i = 0; i < n; i++) {
        if (del == id[i]) {
            printf("%s has been delete from the database complete!\n", name[i]);
            for (int j = i; j < n - 1; j++) {
                id[j] = id[j + 1];
                strcpy(name[j], name[j + 1]);
                cost[j] = cost[j + 1];
                category[j] = category[j + 1];
            }
            id[n - 1] = '\0';
            strcpy(name[n - 1], "");
            cost[n - 1] = '\0';
            category[n - 1] = '\0';
            n--;
            fileupdate(id, name, cost, category, n);
            return;
        }
    }
    printf("ID doesn't exist!\n");
}

void changeData(int* id, char name[][30], double* cost, char* category, int n) {
    printf("Enter ID want to change: ");
    int change;
    scanf("%d", &change);
    for (int i = 0; i < n; i++) {
        if (change == id[i]) {
            printf("Changing the Cost Value in ID %d: \n", change);
            printf("Enter new Cost: ");
            double newcost = 0;
            scanf("%lf", &newcost);
            cost[i] = newcost;
            fileupdate(id, name, cost, category, n);
            printf("%s now costs %.2lf\n", name[i], cost[i]);
            return;
        }
    }
    printf("ID doesn't exist!\n");
}

void SearchData(int* id, char name[][30], double* cost, char* category, int n) {
    printf("Enter name want to Search: ");
    char Search[100] = {};
    fflush(stdin);
    gets(Search);
    for (int i = 0; i < n; i++) {
        if (strcasecmp(Search, name[i]) == 0) {
            printf("_________________Product infomation_________________\n");
            printf("%-10d %-10s %-10s\t%s\n", "ID", "Name", "Cost", "Category");
            printf("%-10d %-10s %-10.2lf\t%c\n", id[i], name[i], cost[i], category[i]);
            return;
        }
    }
    printf("Sorry, we doesn't have %s !\n", Search);
}

void viewsList(int* id, char name[][30], double* cost, char* category, int n) {
    printf("Here is a listing of all the Product in stock\n");
    printf("%-10s %-10s %-10s\t%s\n", "ID", "Name", "Cost", "Category");
    for (int i = 0; i < n; i++)
        printf("%-10d %-10s %-10.2lf\t%c\n", id[i], name[i], cost[i], category[i]);
}

void SavetoOtherFile(int* id, char name[][30], double* cost, char* category, int n) {
    printf("Would you like to save the changes made to the database?\n");
    char res[10] = {};
    fflush(stdin);
    gets(res);
    if (strcasecmp(res, "yes") == 0 || strcasecmp(res, "y") == 0) {
        printf("What file you want to save as?\n");
        char newfile[100] = {};
        fflush(stdin);
        gets(newfile);
        char path[] = "Slot 2-3 Assignment/C.S.P0020/";
        strcat(path, newfile);
        FILE* f = fopen(path, "w+");
        int i = 0;
        while (i < n) {
            fprintf(f, "%-10d %-10s %-10.2lf\t%c\n", id[i], name[i], cost[i], category[i]);
            i++;
        }
        printf("The file has been saved. Thanks for shopping!\n");
        fclose(f);
        fflush(stdin);
    }
}

int main() {
    int opt;
    int n = 0;
    int id[100] = {};
    char name[100][30] = {};
    double cost[100] = {};
    char category[100] = {};
    getDataFile(id, name, cost, category, n);
    do {
        menu();
        printf("Your opt? ");
        scanf("%d", &opt);
        switch (opt) {
            case 1:
                addData(id, name, cost, category, n);
                break;
            case 2:
                deleteData(id, name, cost, category, n);
                break;
            case 3:
                changeData(id, name, cost, category, n);
                break;
            case 4:
                SearchData(id, name, cost, category, n);
                break;
            case 5:
                viewsList(id, name, cost, category, n);
                break;
            case 6:
                break;
            default:
                printf("-----wrong option------\n");
        }
        if (opt != 6) {
            printf("\n");
            fflush(stdin);
            system("pause");
            system("cls");
        }
    } while (opt != 6);
    SavetoOtherFile(id, name, cost, category, n);
    system("pause");
}
