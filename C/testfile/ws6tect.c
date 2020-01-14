// #include <Stdio.h>
// #include <conio.h>
// #include <stdlib.h>

// /* Checking whether n is a Canadian SIN or not */
// int checkCanadianSIN (int n) {
//     int N[10]; /* array contains digits in n */
//     int C[12]; /* array for checking */
//     int T1, T2, T3, total; /* temporary values */
//     int i, result=0; /* loop variable and result of the function */
//     if (n>0) { 
//         /* Compute NIi] */
//         for (i=9; i>0; i--) 
//         { N[i]= n%10;
//           n= n/10;
//         }
// /* Compute Cfij */
// C[1]=C[5]=N[2];
// C[2]=C[6]=N[4];
// C[3]=C[7]=N[6]; 
// C[4]=C[8]=N[8];
// C[9]= 2*C[1]; 
// C[10]=2*C[2]; 
// C[11]=2*C[3]; 
// C[12]=2*C[4];

// /* computer temporary values ‘*/
// T1= C[9]/10 + C[9]%10 + C[10]/10 + C[10]%10 + C[11]/10 + C[11]%10 + C[12]/10 + C[12]%10;
// T2= N[1] + N[3] + N[5] + N[7];
// total: T1+T2;
// T3=(total/10+1)*10;
// /* conclusion */
// if (T3-total ==N[9]) result =1;
// return result;
// } }

// int main() {
//     int n=193456787;
//     if (checkCanadianSIN(n)==1) puts ("vaid");
//     else puts("Invalid");
//     getchar();
// }

#include <Stdio.h>
#include <conio.h>
#include <stdlib.h>

int ISBNchecker (int n) {
    int  I[11]; /* array contains digits in n */
    int C[10]; /* array for checking */
    int t,T=0; /* temporary values */
    int i; /* loop variable and result of the function */
    if (n>0) { 
        /* Compute i[i] */
        for (i=10; i>0; i--) {
            I[i]= n%10;
            n= n/10;
        }   
    }
    // xoa khoang trong 
    for (i=0;i<11;i++) {
        if ((I[i]==' ') && (I[i+1]=' '))  
        for (int j=0;j<11;j++) {
            I[i]=I[i+1];
            i--;
        }
    }
    
    /* Compute C[i] */
    for (i=9;i>0;i--) {
        int a=1;
        C[i]=I[a]*i;
        a++;
        t=t+C[i];
    } 
        T=t+I[10];
        /* conclusion */
    if (T%11==0) return 1;
}

int main() {
    int n;
    do {
    system("cls");
    printf ("ISBN Validator \n============== \nISBN (0 to quit): "); scanf("%d",&n); 
    if (n<0) { 
        printf ("Error\n"); system("pause"); 
        }
    } while (n<0); 
    if (n!=0) { 
        if (ISBNchecker(n)==1) printf ("This is a valid ISBN\n");
        else printf ("This is Invalid ISBN\n");
    }
    system("pause");  
}
