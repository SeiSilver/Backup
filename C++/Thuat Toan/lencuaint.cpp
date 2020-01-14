// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
#include <conio.h>
#include <ctype.h>
#include <iostream>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <string>
#include <time.h>
using namespace std;

int main() {
    long long int num = 100000000000;
    int len = floor(log10(abs(num))) + 1;
    cout << len << "\n"
         << num << "\n";

    system("Pause");
}