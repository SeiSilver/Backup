package HW.workshop4.Part1.Question1;

// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

public class Manager {

    static Molecules mol;

    static void function1() {
        System.out.print("Enter Structure: ");
        String structure = Validation.checkString();
        System.out.print("Enter name: ");
        String name = Validation.checkString();
        System.out.print("Enter Weight: ");
        Double weight = Validation.checkDouble();

        mol = new Molecules(structure, name, weight);
    };

    static void function2() {
        mol.display();
        System.out.println();
    };

    // this code use to clear the console screen only work for CMD/ visual studio

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
            choice = MoleculesDemo.sc.nextInt();
            switch (choice) {
            case 1:
                function1();
                System.out.println("Option 1 selected");
                break;
            case 2:
                function2();
                System.out.println("Option 2 selected");
                break;
            case 3:
                System.out.println("Exit selected");
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
        } while (choice != 3);
    }
}