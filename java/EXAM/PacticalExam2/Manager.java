// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

package PacticalExam2;

import java.io.*;

public class Manager {

    public void menu() {
        System.out.println("==========TOUR MANAGEMENT SYSTEM==========");
        System.out.println("1-Add new tour - 1 mark");
        System.out.println("2-Sort and display domestic tours -2 marks");
        System.out.println("3-Search minimum tour- 1 mark");
        System.out.println("4-Search tour by date- 2 marks");
        System.out.println("5-Remove the tour- 1 mark");
        System.out.println("6-Update tour information- 1.5 mark");
        System.out.println("7-Save/Load tour from file- 1.5 marks");
        System.out.println("8-Exit");
        System.out.println("==============================================");
        System.out.print("Enter your choice: ");
    }

    private void writeObjectFile(DomestticTourList tortlist) {
        try {
            FileOutputStream fo = new FileOutputStream(new File("PacticalExam2/save.txt"));
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            for (Tour i : tortlist.getTourList()) {
                oo.writeObject(i);
            }
            fo.close();
            oo.close();
            System.out.println("write to file complete!");
        } catch (IOException e) {
            System.out.println("Error!\n" + e);
        }

    }

    public void readObjectfile(String address) {
        try {
            FileInputStream f1 = new FileInputStream(new File(address));
            ObjectInputStream in = new ObjectInputStream(f1);
            Tour add = (Tour) in.readObject();
            while (add != null) {
                add.printData();
                add = (Tour) in.readObject();
            }
            f1.close();
            in.close();
        } catch (EOFException e) {
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void manager(DomestticTourList tortlist) {
        int choice = 0;
        do {
            menu();
            choice = Validation.checkInt();
            switch (choice) {
            case 1:
                tortlist.createTour();
                break;
            case 2:
                tortlist.sortanddisplay();
                break;
            case 3:
                tortlist.searchMin();
                break;
            case 4:
                tortlist.searchTour();
                break;
            case 5:
                tortlist.removeTour();
                break;
            case 6:
                tortlist.updateTour();
                break;
            case 7:
                writeObjectFile(tortlist);
                readObjectfile("PacticalExam2/save.txt");
                break;
            case 8:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
        } while (choice != 8);
    }
}