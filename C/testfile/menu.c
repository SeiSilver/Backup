#include <stdio.h>
#include <math.h>
#include <stdlib.h>

float func1() {
    float x1,x2,y1,y2,dist;
    printf ("enter x1,y1: "); scanf("%lf%lf",&x1,&y1);
    printf ("enter x2,y2: "); scanf("%lf%lf",&x2,&y2);
    dist= sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)); 
    printf ("distant: %lf\n", dist);
}

int func2(int a, int b) {
    printf ("enter a: "); scanf("%d",&a);
    printf ("enter b: "); scanf("%d",&b);
    int r,s=0;
    for (int i=1;i<=5;i++) {
    r = a + rand() % (b - a);
    printf ("random %d: %d\n",i,r);
    s=s+r;
    }
    printf ("total: %d\n",s);
}

void printMinMaxDigits(int n, int *max, int *min) {
   int remainder;
   remainder = n%10;
   *min=remainder; 
   *max=remainder;
   while (n>0) {
       remainder=n%10;
       n=n/10;
       if (*min>remainder) *min=remainder; 
       if (*max<remainder) *max=remainder;
   }
   printf ("min: %d\n",*min);
   printf ("max: %d\n\n",*max);
}

int func3() { 
    int n,max,min;
    printf ("enter n: "); scanf("%d",&n);
    printMinMaxDigits(n,&max,&min);
    int i,s=0;
    while (n>0) {
        i =n%10;
        s+=i;
        n=n/10;
    }
    printf ("s= %d\n",s);
    system("pause");
}

int main()  {
    int opt,a,b;
    float x;
    do {
        system("cls");
        printf("1: func1 \n");
        printf("2: func2 \n");
        printf("3: func3 \n");
        printf("Your opt? ");    scanf("%d",&opt);
        switch(opt)  {
            case 1: func1();  break;
            case 2: func2(a,b);  break;
            case 3: func3(); break;
            default: printf("ERROR!");
        }
        if (opt==1 || opt==2) system ("pause");
    }
    while (opt>0 && opt <4);
    system ("pause");
    return 0;
}