package PRO192.Employees;

// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

public class Manager {

    static void function1() {
        System.out.println("Enter number of people want to add: ");

    };

    static void function2() {
    };

    // this code use to clear the console screen only work for CMD/ visual studio
    public static void clean() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public static void pause() {
        Main.sc.nextLine();
        System.out.print("Press Enter to continue . . . ");
        Main.sc.nextLine();
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
            clean();
            menu();
            choice = Main.sc.nextInt();
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
            if (choice != 3) {
                pause();
            }
        } while (choice != 3);
    }
}