#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 10

// Thay doi tong tien trong tai khoan
void withdraw(char *accountId) {
    FILE *f = fopen("./assigment/LongLAB/C.L.25/accountInfo.txt", "r");

    char data[MAX * 4][21];
    accountId[strlen(accountId)] = '\0';
    int i = 0;
    int index = 0;

    do {
        data[i + 1][0] = '\0';
        fgets(data[i], 21, f);
        if (data[i][strlen(data[i]) - 1] == '\n') data[i][strlen(data[i]) - 1] = '\0';
        if (strcmp(accountId, data[i]) == 0) index = i;
        i += 1;
    } while (data[i - 1][0] != '\0');

    fclose(f);

    printf("Enter money to withdraw: ");
    int balance = atoi(data[index + 2]);
    int withdraw;
    scanf("%d", &withdraw);
    if (withdraw > balance)
        printf("Over your balance!\n");
    else {
        FILE *f = fopen("./assigment/LongLAB/C.L.25/withdrawInfo.txt", "a");
        fprintf(f, "%s\t%s\t%d\t%d\t%d\n", data[index], data[index + 1], balance, withdraw, balance - withdraw);
        balance -= withdraw;
        sprintf(data[index + 2], "%d", balance);
        printf("Your balance now: %d\n", balance);
        fclose(f);

        FILE *f2 = fopen("./assigment/LongLAB/C.L.25/accountInfo.txt", "w+");

        int j = 0;
        while (data[j][0] != '\0') {
            fprintf(f2, "%s\n", data[j]);
            j += 1;
        }
        fclose(f2);
        printf("Complete\n");
    }
}

// Kiem tra + in ra thong tin tai khoan
void accountInfo(char *accountId) {
    FILE *f = fopen("./assigment/LongLAB/C.L.25/accountInfo.txt", "r");

    char tempId[14];
    int locate;
    char accountName[21];
    int balance;
    char tempBalance[21];
    char moneyType[7];

    int i = 0;
    do {
        fgets(tempId, 15, f);
        tempId[strlen(tempId) - 1] = '\0';
        i += 1;

    } while (tempId[0] != EOF && strcmp(tempId, accountId) != 0);

    fgets(accountName, 21, f);
    if (accountName[strlen(accountName) - 1] == '\n')
        accountName[strlen(accountName) - 1] = '\0';
    fgets(tempBalance, 21, f);
    balance = atoi(tempBalance);
    fgets(moneyType, 7, f);

    printf("Account ID: %s\n", accountId);
    printf("Account name: %s\n", accountName);
    printf("Balance: %d\n", balance);
    printf("Money type: %s\n", moneyType);
}

void menu(char *accountId) {
    int option;
    do {
        system("cls");
        printf("=~=~=~=~=~=~=~=~=  ~MENU~ =~=~=~=~=~=~=~=~=~=\n");
        printf("*                                           *\n");
        printf("*  1. Account info                          *\n");
        printf("*  2. Withdraw                              *\n");
        printf("*  3. Exit                                  *\n");
        printf("*                                           *\n");
        printf("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~\n\n");
        scanf("%d", &option);
        if (option < 1 || option > 3) printf("Invalid. Enter again");
        switch (option) {
            case 1:
                accountInfo(accountId);
                break;
            case 2:
                withdraw(accountId);
                break;
        }
        system("pause");
    } while (option != 3);
}

void login() {
    char tempAccount[15];
    char tempPin[7];

    printf("Login:\n");
    printf("\"Note: Account= abc    pass= 123456\"\n");
    printf("Enter account: ");
    gets(tempAccount);
    fflush(stdin);
    printf("Enter pin: ");
    gets(tempPin);
    fflush(stdin);

    FILE *f = fopen("./assigment/LongLAB/C.L.25/loginInfo.txt", "r");
    char account[15];
    char pin[7];
    while (fgets(account, 15, f)) {
        account[strlen(account) - 1] = '\0';
        if (strcmp(account, tempAccount) == 0) {
            fgets(pin, 7, f);
            break;
        }
        fflush(stdin);
    };
    if (strcmp(account, tempAccount) != 0 || strcmp(pin, tempPin) != 0) {
        printf("Wrong account/id\n");
        system("pause");
        login();
    } else {
        system("cls");
        menu(account);
    }
    fclose(f);
}

int main() {
    login();
    system("pause");
}