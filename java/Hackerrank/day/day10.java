package hackrank.day;

import java.util.*;

public class day10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int dem = 0, res = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                dem++; // số lần liên tiếp
                if (dem > res) { // nếu đếm <= max đã có như 01110111 thì pass
                    res = dem;
                }
            } else
                dem = 0; // khi gặp số 0 sẽ reset lại bộ đếm
            n = n / 2;
        }
        System.out.println(res);
    }

}
