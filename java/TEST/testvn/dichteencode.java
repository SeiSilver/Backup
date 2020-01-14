package testvn;

import java.util.Scanner;

public class dichteencode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teenCode = scanner.nextLine(); //get string from user input
        scanner.close();
        // Convert teencode string
        String result;
        String regex = "-";
        int index = teenCode.indexOf(regex);
        result = teenCode.substring(0,index);
        result = result.replace("4", "a");
        result = result.replace("3", "e");
        result = result.replace("21", "u");
        result = result.replace("1", "i");
        result = result.replace("0", "o");
        if (result.indexOf("... ") > 0) result = result.replace("... ", "");
        result = result.trim();
        result = result.replaceAll("\\s+", " ");

        System.out.println(result);
    }

}