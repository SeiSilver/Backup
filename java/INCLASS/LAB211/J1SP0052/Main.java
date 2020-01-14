/*
  Name: Pham Duy Dat
  Class: SE140191
  ID: DE140191
  Status: unchecked
*/

package J1SP0052;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void pause() {

        System.out.println("\nPress Enter to Continue!");
        sc.nextLine();
    }

    public static void main(String[] args) {
        ManageEastAsiaCountries m = new ManageEastAsiaCountries();
        ArrayList<Country> countries = new ArrayList<Country>();
        int choice = 0;
        do {
            m.menu();
            choice = Validation.checkInt();
            switch (choice) {
            case 1:
                m.addCountryInformation(countries);
                break;
            case 2:
                m.displayinformation(countries);
                break;
            case 3:
                m.searchInformationByName(countries);
                break;
            case 4:
                m.sortInformationByAscendingOrder(countries);
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
            if (choice != 5)
                pause();
        } while (choice != 5);

    }
}
