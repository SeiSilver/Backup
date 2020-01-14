// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Courselearn.Codewar;
public class testc {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // Scanner sc = new Scanner(System.in);

        // String roads[] = { "r;e", "c;f", "f;l" };

        // for (int i = 0; i < n - 1; i++) {}

        String s = new String("r;209");
        int n = s.indexOf(';');
        int check = Integer.valueOf(s.substring(n + 1));
        // }
        System.out.println(check);

        // return prices;

        long finish = System.currentTimeMillis();
        System.out.println("\nTotal of executing time: " + (finish - start) + " ms" + " - "
                + (double) (finish - start) / 1000 + "s");

    }
}
