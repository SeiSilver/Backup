// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Courselearn.Codewar;

public class B {

    public static int x1 = 0, y1 = 0, x2 = 0, y2 = 0;

    public static boolean check(int x, int y, int[] b) {
        if ((x >= b[0]) && (x <= b[2]) && (y >= b[1]) && (y <= b[3]))
            return true;
        return false;
    }

    public static boolean stt1(int a[], int b[], int dai[], int rong[]) {

        if (check(a[0] + dai[0], a[1], b)) {
            x1 = a[0] + dai[0];
            y1 = a[1];
        } else if (check(a[2], a[3] + rong[0], b)) {
            x1 = a[0];
            y1 = a[3] + rong[0];
        } else
            return false;
        if (check(b[0] + dai[1], b[1], a)) {
            x2 = b[0] + dai[1];
            y2 = b[1];
        } else if (check(b[2], b[3] + rong[1], a)) {
            x2 = b[0];
            y2 = b[3] + rong[1];
        } else
            return false;
        return true;
    }

    public static int stt2(int a[], int b[]) {
        int stt = 0;
        if (check(a[0], a[1], b)) {
            x1 = a[0];
            y1 = a[1];
            stt = 1;
        } else if (check(a[2], a[3], b)) {
            x1 = a[2];
            y1 = a[3];
            stt = 1;
        }

        if (check(b[0], b[1], a)) {
            x2 = b[0];
            y2 = b[1];
            stt = 1;
        } else if (check(b[2], b[3], a)) {
            x2 = b[2];
            y2 = b[3];
            stt = 1;
        }
        return stt;
    }

    static long nonOverlappingArea(int[] a, int[] b) {

        int dai[] = new int[2];
        dai[0] = Math.abs(a[0] - a[2]);
        dai[1] = Math.abs(b[0] - b[2]);

        int rong[] = new int[2];
        rong[0] = Math.abs(a[1] - a[3]);
        rong[1] = Math.abs(b[1] - b[3]);

        int sa = dai[0] * rong[0];
        int sb = dai[1] * rong[1];

        if ((b[1] > a[3]) || (b[3] < a[1]) || (a[2] < b[0]) || (a[0] > b[2])) {
            return sa + sb - 2 * (Math.abs(x2 - x1) * Math.abs(y2 - y1));
        }

        else if (a[0] == b[0] && a[1] == b[1] && a[2] == b[2] && a[3] == b[3]) {
            return 0;
        } else if ((check(a[0], a[1], b)) && (check(a[2], a[3], b))) {
            int d;
            int r = Math.abs(a[1] - a[3]);
            if (b[0] < a[0])
                d = a[0] - b[0];
            else
                d = dai[1] - (a[0] - b[0]);
            return sa + sb - 2 * d * r;
        } else if (((check(b[0], b[1], a)) && (check(b[2], b[3], a)))) {
            int d;
            int r = Math.abs(b[1] - b[3]);
            if (a[0] < b[0])
                d = b[0] - a[0];
            else
                d = dai[1] - (b[0] - a[0]);
            return sa + sb - 2 * d * r;
        }

        else if (stt2(a, b) == 1) {
            return sa + sb - 2 * (Math.abs(x2 - x1) * Math.abs(y2 - y1));

        } else if (stt1(a, b, dai, rong)) {
            return sa + sb - 2 * (Math.abs(x2 - x1) * Math.abs(y2 - y1));

        }

        return sa + sb - 2 * (Math.abs(x2 - x1) * Math.abs(y2 - y1));
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // [-2,-1,3,3], [2,-2,6,2] 30
        // -238,3488, 328, 999998], [-999999, 927538, -2347, 8698239
        // [-2,-1,3,3], [2,-2,6,2]
        // int a[] = { -2, -1, 3, 3 };
        // int b[] = { 2, -2, 6, 4 };

        int a[] = { -238, 3488, 328, 999998 };
        int b[] = { -999999, 927538, -2347, 8698239 };

        // return res;

        System.err.println(nonOverlappingArea(a, b));
        long finish = System.currentTimeMillis();
        System.out.println("\nTotal of executing time: " + (finish - start) + " ms" + " - "
                + (double) (finish - start) / 1000 + "s");

    }
}
