#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int isPrime(int num) {
    for(int i=2; i<=num/2; i++) {
        if(num%i == 0) return 0;
    } return 1;
}

int isArmstrong(int num){
    int lastDigit, sum, originalNum, digits;
    sum = 0;
    originalNum = num;
    digits = (int)log10(num) + 1;
    while(num > 0) {
        lastDigit = num % 10;
        sum = sum + round(pow(lastDigit, digits));
        num = num / 10;
    } return (originalNum == sum);
}

int isPerfect(int num){
    int i, sum=0, n;
    n = num;
    for(i=1; i<n; i++) {
        if(n%i == 0) sum += 1; 
    } return (num == sum);
}

int func1() {
    int num;
    printf("Enter any number: "); scanf("%d", &num);
    //prime
    if(isPrime(num)) printf("%d is Prime number.\n", num);
    else printf("%d is not Prime number.\n", num);
    //armstrong
    if(isArmstrong(num)) printf("%d is Armstrong number.\n", num);
    else printf("%d is not Armstrong number.\n", num);
    //perfect
    if(isPerfect(num)) printf("%d is Perfect number.\n", num);
    else printf("%d is not Perfect number.\n", num);
}

void checkPrimeAmstrPerf(int n, int *isPr, int *isAms, int *isPer ) {
    *isAms=isArmstrong(n);
    *isPr=isPrime(n);
    *isPer=isPerfect(n);
}

int func2() {
    int n,isPr,isAms,isPer;
    printf("Enter any number: "); scanf("%d", &n);
    checkPrimeAmstrPerf(n, &isPr, &isAms, &isPer );
    //prime
    if(isPrime(n)==1) printf("%d is Prime number.\n", n);
    else printf("%d is not Prime number.\n", n);
    //armstrong
    if(isArmstrong(n)==1) printf("%d is Armstrong number.\n", n);
    else printf("%d is not Armstrong number.\n", n);
    //perfect
    if(isPerfect(n)==1) printf("%d is Perfect number.\n", n);
    else printf("%d is not Perfect number.\n", n);
}

int main()  {
    int opt;
    float x;
    do {
        system("cls");
        printf("1- check prime, Amstrong and perfect numbers \n");
        printf("2- check prime, Amstrong and perfect numbers pointer \n");
        printf("3- Quit \n");
        printf("Your opt? ");    scanf("%d",&opt);
        switch(opt)  {
            case 1: func1();  break;
            case 2: func2();  break;
            case 3: break;
            default: printf("ERROR \n");
            }
        if (opt!=3) { fflush(stdin); system("pause");}
    }
    while (opt!=3);
    system ("pause");
    return 0;
}