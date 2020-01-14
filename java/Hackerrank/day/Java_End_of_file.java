package hackrank.day;

// import java.io.*;
// import java.util.*;

// public class Java_End_of_file {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String string = new String();
//         Map<Integer, String> map = new HashMap<Integer, String>();

//         int i = 1;
//         while (scan.hasNextLine()) {
//             // System.out.println("enter");
//             string = scan.nextLine();
//             map.put(i, string);
//             i += 1;

//             // String s1 = scan.next();
//             // if (s1.equals("exit")) {
//             //     break;
//             // }
//         }
//         ;

//         Set<Integer> set = map.keySet();
//         for (Integer key : set)
//             System.out.println((key) + " " + (map.get(key)));

//         System.out.println("end");
//     }
// }

import java.util.Scanner;

public class Java_End_of_file {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        int i = 1;
        while (!line.equals("exit") && input.hasNext()) {
            line = input.nextLine();
            if (!line.equals("exit"))
                System.out.println(i + " " + line);
            i++;
        }
        System.out.println("end");
        input.close();
    }
}