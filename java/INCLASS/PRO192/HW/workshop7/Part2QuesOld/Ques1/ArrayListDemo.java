package HW.workshop7.Part2QuesOld.Ques1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: \n", i + 1);
            int input = sc.nextInt();
            arrlist.add(input);
        }
        System.out.println("==================");
        System.out.println(arrlist);
        System.out.println("After remove; ");
        arrlist.remove(3);
        System.out.println(arrlist);
        System.out.println("==================");
        for (Integer i : arrlist)
            System.out.println(i);
    }
}
