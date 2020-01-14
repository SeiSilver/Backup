/*
   Name: Pham Duy Dat
   Class: SE140191
   ID: DE140191
*/
package J1SP0052;

import java.util.ArrayList;
import java.util.Comparator;

public class ManageEastAsiaCountries {
    public void menu() {
        System.out.println("============================= MENU ===============================");
        System.out.printf("| 1. %-59s |\n", "Input the information of 11 countries in East Asia.");
        System.out.printf("| 2. %-59s |\n", "Display the information of country you've just input.");
        System.out.printf("| 3. %-59s |\n", "Search the information of country by user-entered name.");
        System.out.printf("| 4. %-59s |\n", "Display the information increasing with the country name.");
        System.out.printf("| 5. %-59s |\n", "Exit.");
        System.out.println("==================================================================");
        System.out.print("Choose option: ");
    }

    public void addCountryInformation(ArrayList<Country> countries) {
        while (true) {
            System.out.println("Enter code of country: ");
            String code = Validation.checkInputString();
            int stt = 0;
            for (Country i : countries) {
                if (i.getCountryCode().equalsIgnoreCase(code)) {
                    System.out.println("This country aready exist!");
                    stt = 1;
                    break;
                }
            }
            if (stt == 0) {
                System.out.println("Enter name of country: ");
                String name = Validation.checkInputString();
                System.out.println("Enter total Area: ");
                float totalArea = Validation.checkFloat();
                System.out.println("Enter terrain of country: ");
                String terrain = Validation.checkInputString();
                countries.add(new EastAsiaCountries(code, name, totalArea, terrain));
            }

            System.out.println("Want to countinue (Y/N)? ");
            if (!Validation.checkInputYN()) {
                return;
            }
        }
    }

    public void displayinformation(ArrayList<Country> countries) {
        System.out.printf("%-10s %-20s %-15s %s\n", "ID", "Name", "Total Area", "Terrian");
        for (Country i : countries) {
            i.display();
        }
    }

    public void searchInformationByName(ArrayList<Country> countries) {
        System.out.print("Enter Country Name: ");
        String search = Validation.checkInputString();
        int stt = 0;
        for (Country i : countries) {
            if (search.equalsIgnoreCase(i.getCountryName())) {

                System.out.printf("%-10s %-20s %-15s %s\n", "ID", "Name", "Total Area", "Terrian");
                i.display();
                stt = 1;
                break;

            }
        }

        if (stt == 0)
            System.out.println("This country isn't exist.");
    }

    public void sortInformationByAscendingOrder(ArrayList<Country> countries) {
        countries.sort(Comparator.comparing(Country::getCountryName));
        System.out.printf("%-10s %-20s %-15s %s\n", "ID", "Name", "Total Area", "Terrian");
        for (Country i : countries) {
            i.display();
        }
    }
}
