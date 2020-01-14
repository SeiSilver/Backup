// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package Courselearn.Codewar;

public class Bcopy {

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
            stt += 1;
        } else if (check(a[2], a[3], b)) {
            x1 = a[2];
            y1 = a[3];
            stt += 1;
        }

        if (check(b[0], b[1], a)) {
            x2 = b[0];
            y2 = b[1];
            stt += 1;
        } else if (check(b[2], b[3], a)) {
            x2 = b[2];
            y2 = b[3];
            stt += 1;
        }
        if (stt == 1) {
            x1 = 0;
            y1 = 0;
            x2 = 0;
            y2 = 0;
        }
        return stt;
    }

    public static long nonOverlappingArea(int[] a, int[] b) {
        long areaI = 0;

        long area1 = (long) Math.abs(a[2] - a[0]) * Math.abs(a[3] - a[1]);

        long area2 = (long) Math.abs(b[2] - b[0]) * Math.abs(b[3] - b[1]);

        int dai[] = new int[2];
        dai[0] = Math.abs(a[0] - a[2]);
        dai[1] = Math.abs(b[0] - b[2]);

        int rong[] = new int[2];
        rong[0] = Math.abs(a[1] - a[3]);
        rong[1] = Math.abs(b[1] - b[3]);

        long res = 0;
        if ((b[1] > a[3]) || (b[3] < a[1]) || (a[2] < b[0]) || (a[0] > b[2])) {
            res = (long) area1 + area2;
            return res;
        }

        if (a[0] == b[0] && a[1] == b[1] && a[2] == b[2] && a[3] == b[3]) {
            return 0;
        } else if (stt1(a, b, dai, rong)) {
            res = (long) area1 + area2 - 2 * (Math.abs(x2 - x1) * Math.abs(y2 - y1));
        } else if (stt2(a, b) == 2) {
            res = (long) area1 + area2 - 2 * (Math.abs(x2 - x1) * Math.abs(y2 - y1));
        } else {
            areaI = (Math.min(a[2], b[2]) - Math.max(a[0], b[0])) * (Math.min(a[3], b[3]) - Math.max(a[1], a[1]));
            res = (long) (area1 + area2 - 2 * areaI);
        }
        return res;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // [-2,-1,3,3], [2,-2,6,2] 30
        // -238,3488, 328, 999998], [-999999, 927538, -2347, 8698239
        int a[] = { -238, 3488, 328, 999998 };
        int b[] = { -999999, 927538, -2347, 869823 };

        System.err.println(nonOverlappingArea(a, b));

        long finish = System.currentTimeMillis();
        System.out.println("\nTotal of executing time: " + (finish - start) + " ms" + " - "
                + (double) (finish - start) / 1000 + "s");

    }
}
