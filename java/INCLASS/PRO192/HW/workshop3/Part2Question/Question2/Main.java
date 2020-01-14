// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package HW.workshop3.Part2Question.Question2;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1, "Dat", 1000);
        Account acc2 = new Account(2, "Sei", 5000);
        Account acc3 = new Account(3, "Anna", 5000);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3 + "\n");

        // acc1.credit(123);
        // System.out.println(acc1 + "\n");

        // acc2.debit(600);
        acc2.transferTo(acc1, 5000);
        System.out.println(acc1 + "\n");
        System.out.println(acc2 + "\n");
        // System.out.println(acc3 + "\n");

        // acc1.transferTo(acc2, 500);
        // System.out.println(acc1);
        // System.out.println(acc2 + "\n");
    }
}
