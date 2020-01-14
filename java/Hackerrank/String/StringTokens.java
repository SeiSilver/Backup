package hackrank.String;

// Java String Tokens

import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        scan.close();

        String[] words = s.split("[^a-zA-Z]+"); // giữ lại kí tự từ a-z và A-Z

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(words.length);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
