// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void opt1(char student[][50], int &use), opt2(char student[][50], int &use),
    opt3(char student[][50], int &use), opt4(char student[][50], int &use);

void menu() {
    printf("==================================================\n");
    printf("1. Add a student name into the array\n");
    printf("2. Remove a student name.\n");
    printf("3. Search a student name.\n");
    printf("4. Output student names in ascending orders alphabetically.\n");
    printf("5. Exit\n");
    printf("==================================================\n");
}

int main() {
    int opt;
    char student[100][50] = {};
    int use = 0;
    do {
        system("cls");
        menu();
        printf("Your opt? ");
        scanf("%d", &opt);
        switch (opt) {
            case 1:
                printf("\n");
                opt1(student, use);
                break;
            case 2:
                printf("\n");
                opt2(student, use);
                break;
            case 3:
                printf("\n");
                opt3(student, use);
                break;
            case 4:
                printf("\n");
                opt4(student, use);
                break;
            case 5:
                break;
            default:
                printf("-----wrong option------\n");
        }
        if (opt != 5) {
            printf("\n\n");
            fflush(stdin);
            system("pause");
        }
    } while (opt != 5);
}

void opt1(char student[][50], int &use) {
    if (use > 100)
        printf("The list has full. It cannot add a new student!");
    else {
        int add;
        printf("How many student you wan to add: ");
        scanf("%d", &add);
        for (int i = use; i < use + add; i++) {
            fflush(stdin);
            gets(student[i]);
        }
        use += add;
        printf("Current Student list: \n");
        for (int i = 0; i < use; i++) {
            printf("%d. ", i + 1);
            puts(student[i]);
        }
    }
}

void swap(char student[][50], int &n, int start) {
    for (int i = start; i < n; i++) {
        strcpy(student[i], student[i + 1]);
    }
    n--;
}

void opt2(char student[][50], int &use) {
    int stt = 0;
    char remove[50] = {};
    printf(("Enter Student name want to remove:\n"));
    fflush(stdin);
    gets(remove);
    for (int i = 0; i < use; i++) {
        if (strcmp(student[i], remove) == 0) {
            swap(student, use, i);
            stt = 1;
        }
    }
    if (stt)
        printf("\nStudent name has been removed from list successfully!\n");
    else
        printf("\nStudent name doesnt exist in list!\n");
    printf("Current Student list: \n");
    for (int i = 0; i < use; i++) {
        printf("%d. ", i + 1);
        puts(student[i]);
    }
}

    void opt3(char student[][50], int &use) {
        int stt = 0;
        char search[50] = {};
        printf(("Enter Student name want to search:\n"));
        fflush(stdin);
        gets(search);
        for (int i = 0; i < use; i++) {
            if (strcmp(student[i], search) == 0) {
                printf("%d. %s", i + 1, search);
                stt = 1;
            }
        }
        if (stt)
            printf("\nStudent name is in the list!\n");
        else
            printf("\nStudent name doesnt exist in list!\n");
        printf("Current Student list: \n");
        for (int i = 0; i < use; i++) {
            printf("%d. ", i + 1);
            puts(student[i]);
        }
    }

    void swap(char a[], char b[]) {
        char c[50];
        strcpy(c, a);
        strcpy(a, b);
        strcpy(b, c);
    }

    void opt4(char student[][50], int &use) {
        for (int i = 0; i < use - 1; i++) {
            for (int j = i + 1; j < use; j++) {
                if (strcmp(student[i], student[j]) > 0)
                    swap(student[i], student[j]);
            }
        }
        printf("Sort complete!\n");
        printf("Current Student list: \n");
        for (int i = 0; i < use; i++) {
            printf("%d. ", i + 1);
            puts(student[i]);
        }
    }
