// /* 
//    name: Pham Duy Dat
//    Class: SE1403
//  */

// #include <stdio.h>
// #include <stdlib.h>
// #include <string.h>
// #include <time.h>
// #include <ctype.h>

// int DecToBin(int n, int base)
// {
//     int arr[100] = {};
//     int dem = 0, stt = 0;

//     if (n < 0)
//     {
//         n *= -1;
//         stt = 1;
//     }

//     while (n != 0)
//     {
//         arr[dem] = n % base;
//         n = n / base;
//         dem++;
//     }

//     if (stt)
//     {
//         for (i = 0; i <= dem; i += 1)
//         {
//             if (arr[i])
//                 arr[i] = 0;
//             else
//                 arr[i] = 1;
//         }
//         for (i = 0; i <= i; i += 1)
//         {
//             if (i == 0)
//                 x[i] += 1;
//             x[i] = x[i] % 2;
//             if (!x[i])
//                 x[i + 1] += 1;
//         }
//     }


//     if (i <= 4)
//         length = 4;
//     else if (i <= 8)
//         length = 8;
//     else if (i <= 12)
//         length = 12;
//     else if (i <= 16)
//         length = 16;

//     for (i; i < length; i += 1)
//         if (stt)
//             arr[i] = 1;
//         else
//             arr[i] = 0;

//     for (int i = length - 1; i >= 0; i -= 1)
//     {
//         printf("%d", arr[i]);
//         if (i % 4 == 0)
//             printf(" ");
//     }

//     printf("\n");
// }

// int main()
// {
//     int n, base = 2;
//     int bin = 0;
//     printf("Enter number want to convert to Binary: ");
//     scanf("%d", &n);
//     DecToBin(n, base);
//     system("pause");
// }
