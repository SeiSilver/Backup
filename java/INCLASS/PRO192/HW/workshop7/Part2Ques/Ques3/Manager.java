// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191

// https://freetuts.net/hashmap-trong-java-1099.html tai lieu on tap hashmap

package HW.workshop7.Part2Ques.Ques3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Manager {

    public Scanner sc = new Scanner(System.in);
    Validation v = new Validation();

    public void menu() {
        System.out.println("===================MENU===================");
        System.out.println("| 1. Add new Word                        |");
        System.out.println("| 2. Delete word                         |");
        System.out.println("| 3. Search Word                         |");
        System.out.println("| 4. Exit                                |");
        System.out.println("==========================================");
        System.out.print("Choose option: ");
    }

    public void addNewWord(HashMap<String, String> hm) {
        System.out.print("Enter English: ");
        String english = v.checkInputString();
        if (!checkexit(hm, english)) {
            System.out.println("Do you want to add this word Y/N?");
            if (!v.checkInputYN())
                return;
        } else {
            System.out.printf("%s aready exit!\n", english);
            return;
        }
        System.out.print("Enter Vietnamese: ");
        String vietnam = v.checkInputString();
        hm.put(english, vietnam);
        System.err.println("Add successful.");

        System.out.println("Current list: ");
        TreeMap<String, String> sorted = new TreeMap<>(hm);
        sorted.forEach((key, value) -> System.out.printf("%-10s %-15s\n", key, value));
        // hm.forEach((key, value) -> System.out.printf("%-10s %-15s\n", key, value));
        // sort(hm);
    }

    // public static void sort(HashMap<String, String> hm) {
    // System.out.println("After Sorted!");
    // ArrayList<String> sortedKeys = new ArrayList<String>(hm.keySet());

    // Collections.sort(sortedKeys);
    // for (String i : sortedKeys) {
    // System.out.printf("%-10s %-15s\n", i, hm.get(i));
    // }
    // }

    public void deleteWord(HashMap<String, String> hm) {
        System.out.print("Enter english word want to delete: ");
        String english = v.checkInputString();
        if (!checkexit(hm, english)) {
            System.out.println("Word doesn't exit!");
            return;
        }
        hm.remove(english);
        System.out.println("Delete complete!");
        System.out.println("Current list: ");
        hm.forEach((key, value) -> System.out.printf("%-10s %-15s\n", key, value));
    }

    public void search(HashMap<String, String> hm) {
        System.out.print("Enter english word want to search: ");
        String english = v.checkInputString();
        for (String i : hm.keySet()) {
            if (english.equals(i)) {
                System.out.println("Vietnamese: " + hm.get(english));
                return;
            }
        }
        System.out.println("Word didn't exit!");
    }

    public Boolean checkexit(HashMap<String, String> hm, String english) {
        for (String i : hm.keySet()) {
            if (english.equalsIgnoreCase(i)) {
                return true;
            }
        }
        return false;
    }

    public void manager(HashMap<String, String> hm) {
        int choice = 0;
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                addNewWord(hm);
                break;
            case 2:
                deleteWord(hm);
                break;
            case 3:
                search(hm);
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid selection");
                break;
            }
        } while (choice != 4);
    }
}