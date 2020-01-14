package HW.workshop3.Part2Question.Question6;

public class Main {

    public static void main(String[] args) {
        Customer c1 = new Customer("I001", "Dat", "m");
        Customer c2 = new Customer("I002", "Sei", "m");

        Account acc1 = new Account(100, c1);
        Account acc2 = new Account(200, c2);
        acc1.setBalance(1000);
        acc2.setBalance(2000);

        System.out.println(acc1 + "\n");

        System.out.println(acc2 + "\n");

        System.out.println("After deposit to acc1 and withdraw from acc2: \n");
        acc1.deposit(10000);
        acc2.withdraw(1500);

        System.out.println(acc1 + "\n");
        System.out.println(acc2 + "\n");

    }
}
