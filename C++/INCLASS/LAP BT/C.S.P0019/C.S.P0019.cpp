// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

void CHECKIN(char save[], char name[][19], int number[], int& i) {
    char* tok = strtok(save, " ");
    tok = strtok(0, " ");
    int c = 0;
    for (int c = 0; c < i; c++) {
        if (number[c] == 0) {
            strcpy(name[c], tok);
            tok = strtok(0, " ");
            number[c] = atoi(tok);
            printf("%s was checked into room %d\n", name[c], c);
            break;
        }
    }
    // strcpy(name[i], tok);
    // tok = strtok(0, " ");
    // number[i] = atoi(tok);
    i++;
}

void CHECKOUT(char save[], char name[][19], int number[], int& index) {
    char* tok = strtok(save, " ");
    tok = strtok(0, " ");
    char str[19] = {};
    strcpy(str, tok);
    for (int i; i < strlen(str); i++) {
        if (str[i] == '\n') str[i] = '\0';
    }

    for (int i = 0; i < index; i++) {
        if ((strcmp(str, name[i])) == 0) {
            printf("%s was checked out of room %d.\n", name[i], i);
            strcpy(name[i], "");
            number[i] = 0;
            index--;
            return;
        }
    }
    printf("Sorry, there is no occupant named %s.\n", str);
}

void SEARCH(char save[], char name[][19], int number[], int index) {
    char* tok = strtok(save, " ");
    tok = strtok(0, " ");

    char str[19] = {};
    strcpy(str, tok);
    for (int i; i < strlen(str); i++) {
        if (str[i] == '\n') str[i] = '\0';
    }

    for (int i = 0; i < index; i++) {
        if (strcmp(str, name[i]) == 0) {
            printf("%s is currently staying in room %d\n", name[i], i);
            return;
        }
        i++;
    }
    printf("Sorry, there is no occupant named %s.\n", str);
}

void PRINTOCCUPANCY(char name[][19], int number[], int index) {
    printf("%-10s %-15s %-20s\n", "Name", "Room Number", "Number Of occupant");
    for (int i = 0; i < index - 1; i++) {
        printf("%-10s %-15d %-20d\n", name[i], i, number[i]);
    }
}

int main() {
    char path[] = "LAP BT/C.S.P0019/hotellog.txt";
    FILE* f = fopen(path, "r");
    int n = 0;
    fscanf(f, "%d", &n);
    fseek(f, 2, SEEK_CUR);
    char name[n][19] = {};
    int number[n] = {0};
    int i = 0;
    int index = 1;

    while (!feof(f) && i < n) {
        char str[19] = {};
        fgets(str, 19, f);

        char save[19] = {};
        strcpy(save, str);

        strtok(str, " ");

        if (strcmp(str, "CHECKIN") == 0)
            CHECKIN(save, name, number, index);
        else if (strcmp(str, "CHECKOUT") == 0)
            CHECKOUT(save, name, number, index);
        else if (strcmp(str, "SEARCH") == 0)
            SEARCH(save, name, number, index);
        else if (strcmp(str, "PRINTOCCUPANCY\n") == 0)
            PRINTOCCUPANCY(name, number, index);
        i++;
    }

    system("pause");
}