
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String A, String B) {
        A = A.replaceAll("\\s", ""); // uese to replace all space
        // can use [^a-zA-Z0-9] to keep all char or number other replace
        // A.replaceAll("[^a-zA-Z0-9]", "")
        B = B.replaceAll("\\s", "");

        char arrA[] = A.toLowerCase().toCharArray();
        char arrB[] = B.toLowerCase().toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        if (A.length() != B.length()) // test ttes
            return false;

        int i = 0;
        for (int j = 0; j < arrB.length; j++) {
            if (arrA[i] == arrB[i])
                i++;
            else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // String a = scan.next();
        String a = "parliament";
        // String b = scan.next();
        String b = "partial men";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
