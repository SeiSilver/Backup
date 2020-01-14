// package testvn;

// import java.util.Scanner;
// public class CountingSort{
//     public static void beginSort(int A[],int MaxA,int P[],int Sort[],int n)
//     {
//         for (int i=2;i<=MaxA;i++) P[i]+=P[i-1];
//         for (int i=1;i<=n;i++) Sort[P[A[i]]--]=A[i];
//     }
//     public static void main(String[] arr)
//     {   
        
//         int[] A=new int[10000];
//         int[] Index=new int[10000];
//         int[] Sort=new int[10000];
//         int MaxA=0;
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         for (int i=1;i<=n;i++)
//         {
//             A[i]=input.nextInt();
//             Index[A[i]]++;
//             if (MaxA<A[i]) MaxA=A[i];
//         }
//         beginSort(A,MaxA,Index,Sort,n);
//         for (int i=1;i<=n;i++) System.out.printf("%d ",Sort[i]);
//     }
// }