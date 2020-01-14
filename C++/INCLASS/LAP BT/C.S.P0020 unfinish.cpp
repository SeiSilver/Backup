#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

FILE* f;
int productCount = 0;
int idNumber[100] = {};
char name[100][30] = {};
double cost[100] = {};
char category[100] = {};

int findata(int id) {
    for (int i = 0; i < 100; i++)
        if (id == idNumber[i]) return i;
    return -1;
}

void updateFile() {
    rewind(f);
    // for (int i = 0; i < 100; i++)
    int i = 0;
    while (idNumber[i++] != 0)
        fprintf(f, "%-8d%-10s%-8.2lf\t%c\n", idNumber[i], name[i], cost[i], category[i]);
    char c;
}
void getInputFile() {
    char* filename = (char*)calloc(30, sizeof(char));
    printf("Welcome to the store!\n");
    printf("Input the file to load: ");
    scanf("%s", filename);
    f = fopen("LAP BT/C.S.P0020/items.txt", "w+");
    while (1) {
        char etc = fgetc(f);
        if (etc == EOF) break;
        fseek(f, -1, SEEK_CUR);
        fscanf(f, "%d", &idNumber[productCount]);
        fscanf(f, "%s", name[productCount]);
        fscanf(f, "%lf", &cost[productCount]);
        fscanf(f, "\t%c\n", &category[productCount++]);
    }
    printf("%s have been load successfully to the database!\n", filename);
    rewind(f);
}
void add() {
    printf("Type ID: ");
    int id;
    scanf("%d", &id);
    if (findata(id) >= 0) {
        printf("ID already exist, ADD FAILURE!\n");
        return;
    }
    idNumber[productCount] = id;
    printf("Type Name: ");
    scanf("%s", name[productCount]);
    printf("Cost?: ");
    scanf("%lf", &cost[productCount]);
    fflush(stdin);
    printf("Category?: ");
    scanf("%c", &category[productCount++]);
    updateFile();
    printf("ADD SUCCESSFULLY!\n");
}
void deletec() {
    int id;
    printf("Type ID to delete: ");
    scanf("%d", &id);
    int pos = findata(id);
    if (pos < 0) {
        printf("ID not found, DELETE FAILURE!\n");
        return;
    }
    for (int i = pos; i < productCount - 1; i++) {
        idNumber[i] = idNumber[i + 1];
        strcpy(name[i], name[i + 1]);
        cost[i] = cost[i + 1];
        category[i] = category[i + 1];
    }
    idNumber[productCount - 1] = '\0';
    strcpy(name[productCount - 1], "");
    cost[productCount - 1] = '\0';
    category[productCount - 1] = '\0';
    productCount--;
    updateFile();
    printf("DELETE SUCCESSFULLY!\n");
}
void changeCost() {
    int id;
    double newcost;
    printf("Type ID to change cost: ");
    scanf("%d", &id);
    int pos = findata(id);
    if (pos < 0) {
        printf("ID not found, FAILURE!\n");
        return;
    }
    printf("You are going to change cost the product name \"%s\", Type the new cost: ", name[pos]);
    scanf("%lf", &newcost);
    cost[pos] = newcost;
    updateFile();
    printf("UPDATE SUCCESS!\n");
}
void display() {
    printf("%10s\t%10s\t%-15s\t%s\n", "ID", "Name", "Cost", "Category");
    for (int i = 0; i < productCount; i++)
        printf("%10d\t%10s\t%-15lf\t%c\n", idNumber[i], name[i], cost[i], category[i]);
}
int menu() {
    int choice;
    printf("Please make one of the following selections\n");
    printf("1. Add new item\n2. Delete item\n");
    printf("3. Change the cost of an item\n");
    printf("4. Search for item\n");
    printf("5. Display inventory details\n");
    printf("6. Quit\nYour choice ?: ");
    scanf("%d", &choice);
    return choice;
}
void search() {
    int id, pos;
    printf("Type ID of product to serch: ");
    scanf("%d", &id);
    pos = findata(id);
    if (pos >= 0) {
        printf("_________________Product infomation_________________\n");
        printf("%10s\t%10s\t%-15s\t%s\n", "ID", "Name", "Cost", "Category");
        printf("%10d\t%10s\t%-15lf\t%c\n", idNumber[pos], name[pos], cost[pos], category[pos]);
    } else
        printf("Not found product with specified ID!\n");
}
int main() {
    FILE* f;
    getInputFile();
    int choice = 0;
    while (choice != 6) {
        system("cls");
        choice = menu();
        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                deletec();
                break;
            case 3:
                changeCost();
                break;
            case 4:
                search();
                break;
            case 5:
                display();
                break;
            case 6:
                printf("Program terminal!\n");
                break;
            default:
                printf("Choice agian!\n");
                break;
        }
        system("pause");
    }
    return 0;
}