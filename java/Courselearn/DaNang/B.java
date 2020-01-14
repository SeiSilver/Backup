package Courselearn.DaNang;

// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

import java.util.ArrayList;
import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        String[] keywords = { "cat", "dog", "tea", "add", "go", "test" };
        String start = "cat";
        System.out.println(longestWordChain(keywords, start));
    }

    // static StringBuffer res = new StringBuffer();
    static int count = 1;

    public static String longestWordChain(String[] keywords, String start) {
        // res.append(start);
        Arrays.sort(keywords);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < keywords.length; i++) {
            list.add(keywords[i]);
        }
        list.remove(start);

        String res = start + "-";

        for (int i = 0; i < keywords.length; i++) {
            for (String string : list) {
                if (res.charAt(res.length() - 2) == string.charAt(0)) {
                    // res += string + "-";
                    count++;
                    list.remove(string);
                    break;
                }
            }
        }
        // int dem[] = new int[6];
        // for (int i = 0; i < 6; i++) {
        // dem[i] = 1;
        // }
        // int cc = 0;

        // while (cc++ < keywords.length) {
        // for (int j = 0; j < keywords.length; j++) {
        // if (res.charAt(res.length() - 2) == keywords[j].charAt(0)) {
        // res += keywords[j] + "-";
        // count++;
        // break;
        // }
        // }
        // }

        return res;
    }
}
