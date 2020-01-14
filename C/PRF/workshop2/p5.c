#include<stdio.h>
#include<conio.h>
#include<ctype.h>
int main()
{
   char ch;
   int nvowels=0,nconsonants=0,nothers=0;
   printf("enter ch: ");
   while (ch!='\n')
   {
       ch=toupper(getchar());
       if (ch=='\n') break;
       if ((ch>='A')&&(ch<='Z'))
       {switch(ch){
           case 'A': nvowels++; break;
           case 'E': nvowels++; break;
           case 'I': nvowels++; break;
           case 'O': nvowels++; break;
           case 'U': nvowels++; break;
           default: nconsonants++;}
       }
       else nothers= nothers++;
    } 
    printf("nvowels: %d\n", nvowels);
    printf("nconsonants: %d\n", nconsonants);
    printf("nothers: %d\n", nothers);
    getchar();
    getchar();
    return 0;
   }
