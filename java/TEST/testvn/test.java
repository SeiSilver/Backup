// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package test;

// public class test {
//     enum Season {
//         WINTER, SPRING, SUMMER, FALL
//     }

//     public static void main(String args[]) {
//         int var1 = 42;
//         int var2 = ~var1;
//         System.out.print(var1 + " " + var2);
//     }
// }

// class AddDemo {
//     public static void main(String args[]) {
//         BigDecimal b = new BigDecimal("23.43");
//         BigDecimal br = new BigDecimal("24");
//         BigDecimal bres = b.add(new BigDecimal("450.23"));
//         System.out.println("Add: " + bres);

//         MathContext mc = new MathContext(2, RoundingMode.DOWN);
//         BigDecimal bdecMath = b.add(new BigDecimal("450.23"), mc);
//         System.out.println("Add using MathContext: " + bdecMath);
//     }
// }

// class static_out {
//     static int x;
//     static int y;

//     void add(int a, int b) {
//         x = a + b;
//         y = x + b;
//     }
// }

// class static_use {
//     public static void main(String args[]) {
//         static_out obj1 = new static_out();
//         static_out obj2 = new static_out();
//         int a = 2;
//         obj1.add(a, a + 1);
//         obj2.add(5, a);
//         System.out.println(obj1.x + " " + obj2.y);
//     }
// }
// class A {
//     private int i;
//     private int j;

//     A(int a, int b) {
//         this.i = a;
//         this.j = b;
//     }

//     public int getI() {
//         return i;
//     }

//     public void setI(int i) {
//         this.i = i;
//     }

//     public int getJ() {
//         return j;
//     }

//     public void setJ(int j) {
//         this.j = j;
//     }

// }

// class Output {
//     public static void main(String args[]) {
//         A obj1 = new A(1, 2);
//         A obj2 = new A(2, 2);
//         System.out.println(obj1.getClass().toString());
//         System.out.println(obj2.getClass().toString());
//         System.out.print(obj1.getClass().ge.equals(obj2.getClass().toString()));
//     }
// }

// class test {
//     public static void main(String[] args) {
//         int a[] = { 1, 1 };
//         int b[] = { 2, 1 };
//         int c;
//         System.out.println(a == b);
//         a = b;
//         System.out.println(b[0]);

//     }
// }
// class Sort {

//     public static void main(String[] args) {

//         List<String> list = new ArrayList<String>();

//         list.add("1");

//         list.add("123");

//         list.add("12");

//         Collections.sort(list, new Comparator<String>() {

//             @Override

//             public int compare(String o1, String o2) {

//                 return o1.length() - o2.length();

//             }

//         });

//         System.out.println(list);

//     }

// }

class Generics {

    public static void main(String[] args) {

        int n = 10, m = 20;

        System.out.println(add(n, m));

    }

    public static <T> T add(T num1, T num2) {

        return num1;
    }

}