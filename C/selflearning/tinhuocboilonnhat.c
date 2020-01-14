#include <stdio.h>

// caculate the gcd of two intergers

int gcd (int value1, int value2) {
    while (value1 != value2)
    if (value1>value2) value1 -=value2;
    else value2 -= value1;
    return value1;
}
// Caculate the lcm of two intergers
int lcm (int value1, int value2) { 
return (value1*value2)/ gcd (value1, value2);}

int main () 
{
    int m,n,L,G;
    while (m<=0 || n<=0) {
    printf ("Input 2 positives interger:");
    scanf ("%d%d", &m, &n);
    }
    G=gcd(m, n);
    L=lcm(m,n);
    printf ("GCD: %d, LCM: %d\n", G, L);
    getchar (); getchar ();
    return 0;
} 
