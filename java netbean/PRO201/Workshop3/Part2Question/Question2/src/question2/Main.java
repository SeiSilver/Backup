// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question2;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1, "Dat", 1000);
        Account acc2 = new Account(2, "Sei", 5000);
        System.out.println(acc1);
        System.out.println(acc2 + "\n");

        System.out.println("After credit: ");
        acc1.credit(300);
        System.out.println(acc1 + "\n");

        System.out.println("After debit: ");
        acc1.debit(400);
        System.out.println(acc1 + "\n");

        System.out.println("Before transfer money from acc1 to acc2: ");
        System.out.println(acc1);
        System.out.println(acc2 + "\n");

        System.out.println("After transfer money from acc1 to acc2: ");
        acc1.transferTo(acc2, 500);
        System.out.println(acc1);
        System.out.println(acc2 + "\n");
    }
}
