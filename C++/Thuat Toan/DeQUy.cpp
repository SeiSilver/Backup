
#include <iostream>
using namespace std;

int n, kq[11], dd[10], arr[] = {9, 1, 5, 3, 2, 3, 4};

void xuat() {
    for (int j = 0; j < n; j++) cout << kq[j] << " ";
    cout << endl;
}

void backtrack(int i) {
    if (i == n) xuat();
    for (int j = 0; j < 7; j++)
        if (dd[j] == 0) {
            dd[j] = 1;
            kq[i] = arr[j];
            backtrack(i + 1);
            dd[j] = 0;
        }
}

int main() {
    cin >> n;
    for (int i = 0; i < 10; i++) dd[i] = 0;
    backtrack(0);
    system("pause");
}