// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package question2;

public class Manager {

    static Atom[] atomArray = new Atom[20];
    public static int dem = 0;

    static void function1() {
        while (true) {
            System.out.print("Enter number: ");
            int number = Validation.checkInt();
            System.out.print("Enter symbol: ");
            String symbol = Validation.checkString();
            System.out.print("Enter fullname: ");
            String fullname = Validation.checkString();
            System.out.print("Enter weight: ");
            double weight = Validation.checkDouble();

            atomArray[dem] = new Atom(number, symbol, fullname, weight);
            dem++;
            System.out.print("Do you want to continue (Y/N): ");
            if (!Validation.accept()) {
                System.out.println("Add complete!");
                return;
            }

        }
    }

    static void function2() {
        for (int i = 0; i < dem; i++) {
            atomArray[i].display();
        }
    }

    public static void menu() {
        System.out.println("============================================");
        System.out.println("| Options:                |");
        System.out.println("| 1. Create Employee      |");
        System.out.println("| 2. Display Employes     |");
        System.out.println("| 3. Exit                 |");
        System.out.println("============================================");
        System.out.println("Choose option");
    }

    public static void manager() {
        int choice = 0;
        do {
            menu();
            choice = AtomsDemo.sc.nextInt();
            switch (choice) {
            case 1:
                function1();
                break;
            case 2:
                function2();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
        } while (choice != 3);
    }
}