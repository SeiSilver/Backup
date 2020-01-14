// // Name: Pham Duy Dat
// // Class: SE140191
// // ID: DE140191
// package Codewar;

// public class C {

// static int[] prices(String[] citiesList) {

// int[] prices = new int[citiesList.length];
// int n = citiesList.length;
// for (int i = 0; i < n; i++) {
// prices[i] =
// Integer.valueOf(citiesList[i].substring(citiesList[i].indexOf(';') + 1));
// }
// return prices;
// }

// static String[] getcity(String[] citiesList) {

// String[] city = new String[citiesList.length];
// int n = citiesList.length;
// for (int i = 0; i < n; i++) {
// city[i] = citiesList[i].substring(0, citiesList[i].indexOf(';'));
// }
// return city;
// }

// static String getroadA(String[] roads, int i) {
// String A = roads[i].substring(0, roads[i].indexOf(';'));

// return A;
// }

// static String getroadB(String[] roads, int i) {
// String B = roads[i].substring(roads[i].indexOf(';') + 1);
// return B;
// }

// static int[] getcount(String[] citiesList, String[] city, String roads[], int
// n, int len) {
// int[] count = new int[citiesList.length];

// for (int i = 0; i < n; i++) {
// String A = getroadA(roads, i);
// String B = getroadB(roads, i);
// for (int j = 0; j < len; j++) {
// int stt = 0;
// for (int a = 0; a < len; a++) {
// if (A.equals(city[j]) && B.equals(city[a])) {
// count[j]++;
// count[a]++;
// break;
// }
// }
// if (stt == 1)
// break;
// }
// }
// return count;
// }

// static String[] check(String[] roads, int n) {
// String store[] = new String[roads.length];
// int dem = 0;

// for (int i = 0; i < n - 1; i++) {
// String A = getroadA(roads, i);
// String B = getroadB(roads, i);

// String C = getroadA(roads, i + 1);
// String D = getroadB(roads, i + 1);
// if (A.equals(C)) {
// store[dem] = B + ";" + D;
// dem++;
// } else if (A.equals(D)) {
// store[dem] = B + ";" + C;
// dem++;
// } else if (B.equals(C)) {
// store[dem] = A + ";" + D;
// dem++;
// } else if (B.equals(D)) {
// store[dem] = A + ";" + C;
// dem++;
// } else {
// store[dem] = A + ";" + B;
// dem++;
// }

// }

// for (int i = 0; i < dem; i++) {
// System.out.println(store[i] + " ");
// }

// return store;
// }

// static int cinemasBuildingCost(String[] citiesList, String[] roads) {

// int cost[] = prices(citiesList);

// String city[] = getcity(citiesList);

// int n = roads.length;
// int len = citiesList.length;
// int sum = 0;
// int count[] = getcount(citiesList, city, roads, n, len);

// String roadRes[] = new String[roads.length];

// for (int i = 0; i < n; i++) {
// roadRes[i] = roads[i];
// }

// String Res[] = check(roads, n);

// // int dem = 0;
// // int pre = 0;

// // for (int i = 0; i < n; i++) {
// // roadRes = check(roadRes, n);
// // }

// // for (int i = 0; i < n; i++) {
// // System.out.println(roadRes[i] + " ");
// // }

// return sum;

// }

// public static void main(String[] args) {
// long start = System.currentTimeMillis();

// // ["r;209","c;671","e;427","f;980","l;207"], ["r;e","c;f","f;l"]
// // ["bacninh;1","hanoi;2"], ["bacninh;hanoi"]

// // String citiesList[] = { "p;45", "c;657", "e;184", "u;30", "f;849",
// "x;812",
// // "i;874", "y;440", "j;148",
// // "n;254" };
// // String roads[] = { "p;e", "p;y", "c;x", "c;j", "c;n", "e;f", "e;x", "e;j",
// // "u;x", "u;i", "u;y", "u;j", "f;y",
// // "f;n", "i;n", "y;j" };

// //
// ["p;45","c;657","e;184","u;30","f;849","x;812","i;874","y;440","j;148","n;254"],

// // ["p;e","p;y", = e,y 45
// // "c;x","c;j","c;n", = 254
// // "e;f","e;x","e;j","u;x",
// // "u;i","u;y","u;j",
// // "f;y","f;n","i;n","y;j"]

// // 416

// String citiesList[] = { "r;209", "c;980", "e;427", "f;671", "l;207" };
// String roads[] = { "r;e", "c;f", "f;l" };

// System.out.println(cinemasBuildingCost(citiesList, roads));

// long finish = System.currentTimeMillis();
// System.out.println("\nTotal of executing time: " + (finish - start) + " ms" +
// " - "
// + (double) (finish - start) / 1000 + "s");

// }
// }
