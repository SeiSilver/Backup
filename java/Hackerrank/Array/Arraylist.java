package hackrank.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();
        // List<List<Integer>> lines = new List<List<Integer>>();
        // can use list
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> sc = new ArrayList<Integer>();

            int d = in.nextInt();
            for (int j = 0; j < d; j++) {
                sc.add(in.nextInt());
            }
            lines.add(sc);
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (y > lines.get(x - 1).size() || x < 0) {
                System.out.println("ERROR!");
            } else {
                System.out.println(lines.get(x - 1).get(y - 1));
            }
        }

        in.close();
    }
}
