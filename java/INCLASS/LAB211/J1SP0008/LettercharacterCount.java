/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
*/

package J1SP0008;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LettercharacterCount {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your content: ");
        String s = sc.nextLine();

        LinkedHashMap<String, Integer> countWord = new LinkedHashMap<String, Integer>();
        LinkedHashMap<String, Integer> countChar = new LinkedHashMap<String, Integer>();

        wordcountfunc(countWord, s);
        charcountfunc(countChar, s);

        System.out.println(countWord);
        System.out.println(countChar);
    }

    public static void wordcountfunc(LinkedHashMap<String, Integer> countWord, String s) {
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (countWord.containsKey(token))
                countWord.put(token, countWord.get(token) + 1);
            else
                countWord.put(token, 1);
        }

    }

    public static void charcountfunc(LinkedHashMap<String, Integer> countChar, String s) {
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (c.equals(" "))
                continue;
            if (countChar.containsKey(c))
                countChar.put(c, countChar.get(c) + 1);
            else
                countChar.put(c, 1);
        }
    }

}
