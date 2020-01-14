// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package PacticalExam2;

import java.util.*;

public class DomestticTourList {
    private ArrayList<Tour> tourList = new ArrayList<Tour>();

    @SuppressWarnings("all")
    public DomestticTourList() {
        Date d1, d2;
        d1 = new Date("2019/10/19");
        d2 = new Date("2019/10/26");
        tourList.add(new DomesticTour("D001", "Ho Chi Minh", 55, "Airplane", d1, d2, 2.5));
        d1 = new Date("2019/10/21");
        d2 = new Date("2019/11/05");
        tourList.add(new DomesticTour("D002", "Da Lat", 67.5, "Airplane", d1, d2, 5.2));
        d1 = new Date("2019/11/01");
        d2 = new Date("2019/11/11");
        tourList.add(new DomesticTour("D003", "Da Lat", 35.6, "Other", d1, d2, 3.1));
        d1 = new Date("2019/11/01");
        d2 = new Date("2019/11/11");
        tourList.add(new DomesticTour("D004", "Ba Lat", 35.6, "Other", d1, d2, 3.1));
    }

    public int isExist(String code) {
        for (int i = 0; i < tourList.size(); i++) {
            if (tourList.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    public void sortanddisplay() {
        tourList.sort(Comparator.comparingDouble(Tour::getPrice).thenComparing(Tour::getTitle));
        System.out.printf("%-4s %-20s %-10s  %-10s %-10s %-10s %-6s\n", "Code", "Tour's title", "Price", "Transport",
                "Start date", "End date", "Charge");
        for (Tour tour : tourList) {
            tour.printData();
        }
    }

    public void createTour() {
        while (true) {
            System.out.print("Please input tour's code to add: ");
            String code = Validation.checkInputCode();
            if (isExist(code) != -1) {
                System.err.println("This tour existed in the system");
            } else {
                System.out.print("Please input tour's title: ");
                String title = Validation.checkInputString();
                System.out.print("Please input tour's price: ");
                double price = Validation.checkDouble();
                String transport = Validation.checkInputTransport();
                System.out.print("Please input start date: ");
                Date startDate = Validation.checkInputDate();
                System.out.print("Please input end date: ");
                Date endDate = Validation.checkInputEndDate(startDate);
                System.out.print("Please input guide tip: ");
                double tip = Validation.checkDouble();
                DomesticTour dTour = new DomesticTour(code, title, price, transport, startDate, endDate, tip);
                tourList.add(dTour);
                System.err.println("Input domestic tour successful");
            }
            System.out.print("continue y/n? ");
            if (!Validation.checkInputYN()) {
                return;
            }
        }
    }

    public void printDomesticTour() {
        System.out.println("DOMESTIC TOUR: ");
        System.out.printf("%-4s %-20s %-10s  %-10s %-10s %-10s %-6s\n", "Code", "Tour's title", "Price", "Transport",
                "Start date", "End date", "Charge");
        for (int i = 0; i < tourList.size(); i++) {
            tourList.get(i).printData();
        }
    }

    public void searchTour() {
        System.out.print("Please enter start date of tour to search: ");
        Date startDate = Validation.checkInputDate();
        for (Tour i : tourList) {
            if (i.getStartDate().getTime() == startDate.getTime())
                i.printData();
        }
    }

    public void updateTour() {
        System.out.print("Please input tour's code to update: ");
        String code = Validation.checkInputString();
        int check = isExist(code);
        if (check != -1) {
            System.out.println("Please input new information for this tour");
            System.out.print("Please input tour's title: ");
            String title = Validation.checkInputString();
            System.out.print("Please input tour's price: ");
            double price = Validation.checkDouble();
            String transport = Validation.checkInputTransport();
            System.out.print("Please input start date: ");
            Date startDate = Validation.checkInputDate();
            System.out.print("Please input end date: ");
            Date endDate = Validation.checkInputEndDate(startDate);
            System.out.print("Please input guide tip: ");
            double tip = Validation.checkDouble();
            DomesticTour dTour = new DomesticTour(code, title, price, transport, startDate, endDate, tip);
            tourList.set(check, dTour);
            System.out.println("Update tour successful");
        } else
            System.out.println("Not found!");
    }

    public void removeTour() {
        System.out.print("Please enter tour's code to remove: ");
        String code = Validation.checkInputCode();
        int pos = isExist(code);
        if (pos != -1) {
            tourList.remove(pos);
            System.out.println("Remove this tour successful");
        } else
            System.out.println("Code doesnt exist!");

    }

    public void searchMin() {
        ArrayList<Tour> gest = new ArrayList<Tour>();
        System.out.print("Please enter minimum tour's charge to search: ");
        double charge = Validation.checkDouble();
        for (int i = 0; i < tourList.size(); i++) {
            // System.out.println(tourList.get(i).tourChange());
            if (tourList.get(i).tourChange() <= charge) {
                gest.add(tourList.get(i));
            }
        }
        if (gest.size() == 0)
            System.out.println("There is no tour with charge under " + charge);
        else {
            System.out.printf("%-4s %-20s %-10s  %-10s %-10s %-10s %-6s\n", "Code", "Tour's title", "Price",
                    "Transport", "Start date", "End date", "Charge");
            for (Tour i : gest) {
                i.printData();
            }
        }
    }

    public ArrayList<Tour> getTourList() {
        return tourList;
    }

}
