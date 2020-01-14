#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 10

/*******************************************************************************************************************/

// Kiem tra dang nhap
int LoginCheck(char *account, char *pin) {
    char data[99];
    char *temp = (char *)malloc(99 * sizeof(char));

    FILE *f = fopen("./assigment/LongLAB/C.L.25/loginInfo.txt", "r");

    do {
        fgets(data, 99, f);
        temp = strtok(data, " ");
        if (strcmp(temp, account) == 0) {
            temp = strtok(NULL, " ");
            if (temp[strlen(temp) - 1] == '\n') temp[strlen(temp) - 1] = '\0';
            if (strcmp(temp, pin) == 0)
                return 1;
            else
                return -1;
        }
    } while (data[0] != '\0' && data[0] != '\n');
    return 0;
}

/*******************************************************************************************************************/

int AccountIdExist(char *accountId, char *accountName, char *accountBalance, char *moneyType) {
    char tempData[99];
    char x[2] = " ";
    char *temp = (char *)malloc(14 * sizeof(char));
    fflush(stdin);

    FILE *f = fopen("./assigment/LongLAB/C.L.25/accountInfo.txt", "r");
    int i = 0;
    while (fgets(tempData, 99, f) && tempData[0] != '\n' && tempData[0] != '\0') {
        temp = strtok(tempData, x);
        if (strcmp(temp, accountId) == 0) {
            temp = strtok(NULL, x);
            strcpy(accountName, temp);
            temp = strtok(NULL, x);
            strcpy(accountBalance, temp);
            temp = strtok(NULL, x);
            strcpy(moneyType, temp);
            fclose(f);
            return i;
        }
        i += 1;
    }
    if (moneyType[strlen(moneyType) - 1] == '\n') moneyType[strlen(moneyType) - 1] = '\0';
    fclose(f);
    return -1;
}

/*******************************************************************************************************************/

void FileUpdate(char *fileName, char *type, char data[][99], int stt) {
    FILE *f = fopen(fileName, type);

    for (int i = 0; i < stt; i += 1)
        if (data[i][0] != '\0' && data[i][0] != '\n') fputs(data[i], f);
    printf("Updated!\n");
    fclose(f);
}

/*******************************************************************************************************************/

int FileGetData(char *fileName, char data[][99]) {
    FILE *f = fopen(fileName, "r");
    int count = 0;

    do {
        data[count][0] = '\0';
        fgets(data[count], 99, f);
        count += 1;
    } while (data[count - 1][0] != '\n' && data[count - 1][0] != '\0');
    return count - 1;
}

/*******************************************************************************************************************/

// Kiem tra + in ra thong tin tai khoan
void accountInfo(char *accountId) {
    int locate;
    char accountName[21];
    char accountBalance[21];
    char moneyType[7];

    int stt = AccountIdExist(accountId, accountName, accountBalance, moneyType);
    if (stt == -1)
        printf("Not exist!\n");
    else {
        printf("Account ID: %s\n", accountId);
        printf("Account name: %s\n", accountName);
        printf("Account balance: %s\n", accountBalance);
        printf("Money type: %s\n", moneyType);
    }
    system("pause");
}

/*******************************************************************************************************************/

// Thay doi tong tien trong tai khoan
void withdraw(char *accountId) {
    char data[MAX][99];
    accountId[strlen(accountId)] = '\0';

    int i = FileGetData("./assigment/LongLAB/C.L.25/accountInfo.txt", data);

    char accountBalance[20];
    char accountName[20];
    char moneyType[8];

    int index = AccountIdExist(accountId, accountName, accountBalance, moneyType);

    printf("Enter money to withdraw: ");
    int withdraw;
    scanf("%d", &withdraw);

    if (withdraw > atoi(accountBalance))
        printf("Over your balance!\n");
    else {
        char tempWithdraw[2][99];
        sprintf(tempWithdraw[0], "%s %s %d %d\n", accountId, accountBalance, withdraw, atoi(accountBalance) - withdraw);
        sprintf(data[index], "%s %s %d %s\n", accountId, accountName, atoi(accountBalance) - withdraw, moneyType);
        FileUpdate("./assigment/LongLAB/C.L.25/withdrawInfo.txt", "a", tempWithdraw, 1);
        FileUpdate("./assigment/LongLAB/C.L.25/accountInfo.txt", "w+", data, i);
    }

    system("pause");
}

/*******************************************************************************************************************/

// Chuyen tien
void transfer(char *accountId) {
    char accountName[20], accountBalance[20], moneyType[8];
    char targetId[14], targetName[20], targetBalence[20], targetMoneyType[8];
    char data[MAX][99];

    int accountIndex = AccountIdExist(accountId, accountName, accountBalance, moneyType);
    if (moneyType[strlen(moneyType) - 1] == '\n') moneyType[strlen(moneyType) - 1] = '\0';

    printf("Enter other accountId to transfer: ");
    gets(targetId);

    FILE *fr = fopen("./assigment/LongLAB/C.L.25/accountInfo.txt", "r");
    int stt = 0;
    do {
        data[stt][0] = '\0';
        fgets(data[stt], 99, fr);
        stt += 1;
    } while (data[stt - 1][0] != '\0' && data[stt - 1][0] != '\n');
    fclose(fr);

    stt -= 1;

    char tempId[14];
    int targetIndex = AccountIdExist(targetId, targetName, targetBalence, targetMoneyType);
    if (targetIndex == -1)
        printf("Not found id %s\n", targetId);
    else {
        if (targetMoneyType[strlen(targetMoneyType) - 1] == '\n') targetMoneyType[strlen(targetMoneyType) - 1] = '\0';
        int balance = atoi(accountBalance);
        int money;

        printf("Your balance is: %d\n", balance);
        printf("Enter value to transfer money: ");

        scanf("%d", &money);
        if (money > balance)
            printf("Over your balance!\n");
        else {
            balance -= money;
            sprintf(data[accountIndex], "%s %s %d %s\n", accountId, accountName, balance, moneyType);
            sprintf(data[targetIndex], "%s %s %d %s\n", targetId, targetName, atoi(targetBalence) + money, targetMoneyType);
            FileUpdate("./assigment/LongLAB/C.L.25/accountInfo.txt", "w+", data, stt);
            sprintf(data[0], "%s %s %d\n", accountId, targetId, money);
            FileUpdate("./assigment/LongLAB/C.L.25/transferInfo.txt", "a", data, 1);
        }
    }
}

/*******************************************************************************************************************/

void menu(char *accountId) {
    int option;
    char accountName[20], accountBalance[20], moneyType[8];
    do {
        system("cls");
        printf("=~=~=~=~=~=~=~=~=  ~MENU~ =~=~=~=~=~=~=~=~=~=\n");
        printf("*                                           *\n");
        printf("*  1. Account info                          *\n");
        printf("*  2. Withdraw                              *\n");
        printf("*  3. Transfer                              *\n");
        printf("*  4. Exit                                  *\n");
        printf("*                                           *\n");
        printf("~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~=~\n\n");
        scanf("%d", &option);
        if (option < 1 || option > 4) printf("Invalid. Enter again");
        switch (option) {
            case 1:
                accountInfo(accountId);
                break;
            case 2:
                withdraw(accountId);
                break;
            case 3:
                transfer(accountId);
                system("pause");
        }
    } while (option != 4);
}

/*******************************************************************************************************************/

void login() {
    char accountId[15];
    char pin[7];

    printf("Login:\n");
    printf("\"Note: Account= account1    pass= 111111\"\n");
    printf("Enter account: ");
    gets(accountId);
    fflush(stdin);
    printf("Enter pin: ");
    gets(pin);
    fflush(stdin);

    int stt = LoginCheck(accountId, pin);
    if (stt == 0)
        printf("Wrong account\n");
    else if (stt == -1)
        printf("Wrong password\n");
    else
        menu(accountId);
    system("pause");
}

/*******************************************************************************************************************/

int main() {
    login();
}