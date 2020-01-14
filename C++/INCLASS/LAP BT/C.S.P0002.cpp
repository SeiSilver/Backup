#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <conio.h>
#include <ctype.h>
#include <math.h>

void converttoword(int num) {

    const char* donvi[] = {"","one", "two","three","four","five","six","seven","eight","nine"};
    const char* chuc[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"}; 

    const char* chuc_donvi[] = {"","","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}; // 1-9
  
    const char* ti_le[] = {"hundred", "thousand", "million"};
    
    // dem do dai cua 1 interger
    int len = floor(log10(abs(num))) + 1;

    if (len == 1) printf("%s",donvi[num]);
    else if (len == 2) {
        if (num >=10 && num <=19) printf("%s",chuc[num-10]);
        else if (num !=0 && num %10 == 0) printf("%s",chuc_donvi[num/10]);
        else {
            int hangchuc = num/10;
            int sodonvi = num%10;
            printf("%s-%s",chuc_donvi[hangchuc],donvi[sodonvi]);
        }
    }

    else if (len == 3) { // 300
        int n = num/100;
        printf("%s %s ", donvi[n], ti_le[0]);
        if (num%100<=19) printf("and %s",chuc[num%100-10]);
        else printf("and %s-%s",chuc_donvi[num%100/10],donvi[num%100%10]);
    }

    else if (len == 4) { // 3620
        int nghin = num/1000;
        printf("%s %s ", donvi[nghin], ti_le[1]);
        int tram = num%1000/100;
        printf("%s %s ", donvi[tram], ti_le[1]);
        int chuct =num%100;
        if (chuct >= 10 && chuct<=19) printf("and %s",chuc[chuct-10]);
        else if (chuct !=0 && chuct %10 == 0) printf("%s",chuc_donvi[chuct/10]);
        else printf("and %s %s",chuc_donvi[chuct/10],donvi[chuct%10]);
    }

    else printf("Not available. Only from thousand or smaller number");
}

int main() {
    int num; scanf("%d",&num);
    converttoword(num);
    printf("\n");
    system("pause");
}
