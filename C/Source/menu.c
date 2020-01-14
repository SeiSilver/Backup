#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int menu()
{
    printf("==================================================\n");
    printf("1. \n");
    printf("2. \n");
    printf("3. \n");
    printf("4. \n");
    printf("5. \n");
    printf("6. \n");
    printf("7. \n");
    printf("==================================================\n");
}

int main()
{
    int opt;
    do
    {
        system("cls");
        menu();
        printf("Your opt? ");
        scanf("%d", &opt);
        switch (opt)
        {
        // case 1: printf("\n"); opt1(); break;
        // case 2: printf("\n"); opt2(); break;
        // case 3: printf("\n"); opt3(); break;
        // case 4: printf("\n"); opt4(); break;
        // case 5: printf("\n"); opt5(); break;
        // case 6: printf("\n"); opt6(); break;
        case 7:
            break;
        default:
            printf("-----wrong option------\n");
        }
        if (opt > 0 && opt < 7)
        {
            printf("\n\n");
            fflush(stdin);
            system("pause");
        }
    } while (opt != 7);
    system("pause");
}
