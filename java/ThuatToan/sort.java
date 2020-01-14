import java.util.Arrays;

// kiem tra xem string co chua gia tri giong nhau

public class sort {

    public static void main(String[] args) {
        int t[] = { 9, 5, 7, 6, 3, 2 };

        Arrays.sort(t);

        for (int number : t) {
            System.out.print(number + " ");
        }

        System.out.println("================");

        System.out.println("Convert to desc: ");
        for (int i = 0, j = t.length - 1; i < j; i++, j--) {
            int swap = t[i];
            t[i] = t[j];
            t[j] = swap;
        }

        for (int number : t) {
            System.out.print(number + " ");
        }

        // Arrays.sort(t, Collections.reverseOrder()); // using reverse must conver int
        // to interger only work for interger

        System.out.println();
        for (int number : t) {
            System.out.print(number + " ");
        }
    }
}
