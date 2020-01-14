package hackrank.day;

// Day 8: Dictionaries and Maps

import java.util.*;

public class day8 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phonelist = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int number = in.nextInt();
            phonelist.put(name, number);
        }

        while (in.hasNext()) {
            String name = in.next();
            if (phonelist.containsKey(name)) {
                int number = phonelist.get(name);
                System.out.println(name + "=" + number);
            } else
                System.out.println("Not found");
        }

        in.close();
    }
}
