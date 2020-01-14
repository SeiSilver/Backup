// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop5.Part1.Ques2;

public class Main {
    public static void main(String[] args) {
        Worker wklist[] = new Worker[3];
        Worker sc = new Worker();
        for (int i = 0; i < wklist.length; i++) {
            System.out.printf("Enter wklist[%d]: \n", i + 1);
            wklist[i] = sc.input();
        }

        for (int i = 0; i < wklist.length; i++) {
            System.out.println("==========");
            System.out.printf("wklist[%d]: \n", i + 1);
            wklist[i].display();
        }
    }
}
