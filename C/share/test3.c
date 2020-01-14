#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define MAX 13

void Add(char*, char*, double, double, int );
void Search(char*, char*, double*, double*, int );
void Remove(char*, char*, double*, double*, int );
void Print(char*, char*, double*, double*, int );


int main()  {

    int option, Count=0;
    char TenNv[MAX][20];
    char MaNv[MAX][8];
    double Salary[MAX], Allowance[MAX];

    char *pTenNv[MAX];
    *pTenNv=TenNv[0];
    char *pMaNv[MAX];
    *pMaNv=MaNv[0];
    double *pSalary[MAX];
    *pSalary=&Salary[0];
    double *pAllowance[MAX];
    *pAllowance=&Allowance[0];
    int *pCount;
    pCount=&Count;
    

    do {
        system("cls");
        printf("******* MENU *******\n");
        printf("1: Add\n");
        printf("2: Search\n");
        printf("3: Remove\n");
        printf("4: Print\n");
        printf("5: Quit\n");
        printf("********************\n");
        printf("What do you want? \n");
        scanf("%d",&option);
        fflush(stdin);
        switch (option) {
            case 1: Add(TenNv[0], MaNv[0], Salary[0], Allowance[0], Count);  break;
            // case 2: Search(TenNv, MaNv, Salary, Allowance, Count);  break;
            // case 3: Remove(TenNv, MaNv, Salary, Allowance, Count);  break;
            // case 4: Print(TenNv, MaNv, Salary, Allowance, Count);  break;
            case 5: break;
            default: printf("Fail! Again!\n\n");
        }
        system("pause");
    }
    while (option!=5);
}

/*---Add---*/
void Add(char *TenNv, char *MaNv, double Salary, double Allowance, int Count)   {
    
    char GetTenNv[20];
    // int Count;
    do {
        printf("\nNhap vao ten nhan vien thu %d: ",Count+1); 
        gets(GetTenNv);
        if (GetTenNv != '\0')    {
            strcpy(TenNv,GetTenNv);
            puts(TenNv);
            

            printf("Nhap vao ma so nhan vien: ");

            gets(MaNv);
            puts(MaNv);
            
            fflush(stdin);

            printf("Nhap vao muc luong cua nhan vien: ");
            scanf("%lf",&Salary);
            // printf("%lf\n",Salary);
            fflush(stdin);

            printf("Nhap vao muc thuong cua nhan vien: ");
            scanf("%lf",&Allowance);
            // printf("%lf\n",Allowance);
            // *pCount+=1;
            Count+=1;
            fflush(stdin);
        }
    } while (GetTenNv != '\0'); 
    puts(TenNv);
    puts(MaNv);
    printf("%g\n",Salary);
    printf("%g\n",Allowance+0);
    // *pCount=Count;
}

void Search(char *TenNv, char *MaNv, double *Salary, double *Allowance, int Count)   {

}

void Remove(char *TenNv, char *MaNv, double *Salary, double *Allowance, int Count)   {

}

void Print(char *TenNv, char *MaNv, double *Salary, double *Allowance, int Count)    {
    // puts(pTenNv);
    // puts(*(pMaNv));
    // printf("%f\n",*(pSalary+0));
    // printf("%f\n",*(pAllowance+0));
}

