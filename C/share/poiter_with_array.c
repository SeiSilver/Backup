//// Sử dụng con trỏ đến mảng ký tự 2 chiều trong main

// #include<stdio.h>
// #include<stdlib.h>

// int main()  {
//   char *parray[10], array[10][10];
//   fflush(stdin);
//   for (int i=0; i<3; i+=1)  {
//   gets(array[i]);
//   parray[i]=array[i];
//   }
//   for (int i=0; i<3; i+=1)
//   puts(parray[i]);
// }







// /*====================================================== */
// // Con trỏ dãy số nguyên 1 chiều

// #include <stdio.h>
// #include <conio.h>

// void init(int*[]);

// int main()
// {
// int ix[10];
// int *pix[10];
// *pix=ix;
// init(pix);
// printf("x = %d\n", ix);

// }
// void init(int *pix[])
// {
// *pix[0] = 1;
// }









// /*====================================================== */
// // con trỏ mảng ký tự 2 chiều sử dụng hàm
// // chỉ có thể sử dụng scanf để nhận xâu -> chưa tối ưu

// #include <stdio.h>
// #include <conio.h>

// void init(char*[]);

// int main()  {
//     char ix[10][10], iy[10];
//     char *pix[10], *piy;
//     *pix=*ix;
//     init(pix);
//     puts(*pix);
// }
// void init(char *pix[]) {
//     scanf("%s",&*pix[0]);
// }











// /*====================================================== */
// // con trỏ mảng ký tự 2 chiều sử dụng hàm
// // sử dụng gets để lấy mảng 

// #include <stdio.h>
// #include <conio.h>

// void init(char*[]);

// int main()  {
//     char ix[10][20];
//     char *pix[10];
//     for (int i=0; i<3; i+=1){
//         *pix=ix[0];
//         init(pix);
//     }
//     for (int i=0; i<3; i+=1)
//         puts(ix[i]);
// }
// void init(char *pix[]) {
//     char *array[10];
//     // for (int i=0; i<3; i+=1)    {
//         *(array)=*(pix);
//         gets(*array);
//     // }
// }









#include <stdio.h>
#include <conio.h>

void init(char*);

int main()  {
    char ix[10][20];
    for (int i=0; i<3; i+=1){
        init(ix[i]);
    }
    for (int i=0; i<3; i+=1)
        puts(ix[i]);
}
void init(char *ix) {
    // char *array[10];
    // for (int i=0; i<3; i+=1)    {
        // *array=(ix);
        gets(ix);
    // }
}
