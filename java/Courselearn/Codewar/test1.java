package Courselearn.Codewar;
public class test1 {

    public static void main(String[] args) {

        // int a[] = { -238, 3488, 328, 999998 };
        // int b[] = { -999999, 927538, -2347, 869823 };
        // int a[] = { 1, 1, 2, 2 };
        // int b[] = { 2, 2, 6, 4 };

        // [2,-2,6,3], [-1,1,2,4]
        // [-2,-1,3,3], [2,-2,6,4]

        // int a[] = { 2, -2, 6, 3 };
        // int b[] = { -1, 1, 2, 4 };

        int a[] = { -2, -1, 3, 3 };
        int b[] = { 2, -2, 6, 4 };

        System.out.println(nonOverlappingArea(a, b));
    }

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

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }
    }

    static class Rectangle {
        private final Point topLeft;
        private final Point bottomRight;

        public Rectangle(Point topLeft, Point bottomRight) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }

        public boolean isOverLapping(Rectangle other) {
            if (this.topLeft.x > other.bottomRight.x || this.bottomRight.x < other.topLeft.x
                    || this.topLeft.y < other.bottomRight.y || this.bottomRight.y > other.topLeft.y)
                return false;

            return true;
        }
    }

    public static long nonOverlappingArea(int[] a, int[] b) {
        long area1 = (long) Math.abs(a[2] - a[0]) * Math.abs(a[3] - a[1]);

        long area2 = (long) Math.abs(b[2] - b[0]) * Math.abs(b[3] - b[1]);

        long areaI = 0;

        long res = 0;

        Point l1 = new Point(a[2], a[3]);
        Point r1 = new Point(a[0], a[1]);
        Point l2 = new Point(b[2], b[3]);
        Point r2 = new Point(b[0], b[1]);

        int dai[] = new int[2];
        dai[0] = Math.abs(a[0] - a[2]);
        dai[1] = Math.abs(b[0] - b[2]);

        int rong[] = new int[2];
        rong[0] = Math.abs(a[1] - a[3]);
        rong[1] = Math.abs(b[1] - b[3]);

        Rectangle first = new Rectangle(l1, r1);
        Rectangle second = new Rectangle(l2, r2);

        if (a[0] == b[0] && a[1] == b[1] && a[2] == b[2] && a[3] == b[3]) {
            return 0;
        }

        if (first.isOverLapping(second)) {
            System.out.println("Yes, two rectangles are intersecting with each other");

            if (stt1(a, b, dai, rong)) {
                res = (long) area1 + area2 - 2 * (Math.abs(x2 - x1) * Math.abs(y2 - y1));
            } else if (stt2(a, b) == 2) {
                res = (long) area1 + area2 - 2 * (Math.abs(x2 - x1) * Math.abs(y2 - y1));
            } else {
                areaI = (Math.min(a[2], b[2]) - Math.max(a[0], b[0])) * (Math.min(a[3], b[3]) - Math.max(a[1], a[1]));
                res = (long) (area1 + area2 - 2 * areaI);
            }

        } else {
            System.out.println("No, two rectangles are not overlapping with each other");

            res = (long) area1 + area2;
        }
        return res;
    }
}

// class GFG {

// static class Point {

// int x, y;
// }

// // Returns true if two rectangles (l1, r1) and (l2, r2) overlap
// static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
// // If one rectangle is on left side of other
// if (l1.x > r2.x || l2.x > r1.x) {
// return false;
// }

// // If one rectangle is above other
// if (l1.y < r2.y || l2.y < r1.y) {
// return false;
// }

// return true;
// }

// /* Driver program to test above function */
// public static void main(String[] args) {
// Point l1 = new Point(), r1 = new Point(), l2 = new Point(), r2 = new Point();
// l1.x = 0;
// l1.y = 10;
// r1.x = 10;
// r1.y = 0;
// l2.x = 5;
// l2.y = 5;
// r2.x = 15;
// r2.y = 0;

// if (doOverlap(l1, r1, l2, r2)) {
// System.out.println("Rectangles Overlap");
// } else {
// System.out.println("Rectangles Don't Overlap");
// }
// }
// }
