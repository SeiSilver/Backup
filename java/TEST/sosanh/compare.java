package sosanh;

// import java.util.Scanner;

// public class compare {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int number = scanner.nextInt(); //get number from user input

//         String value = ((number != 0) && number > 0) ? "positive" : "negative";

//         System.out.println("Number is " + value);

//         scanner.close();
//     }
// }/* 

/* import java.util.Scanner;

public class compare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); //get number from user input
        int num2 = scanner.nextInt(); //get number from user input
        int num3 = scanner.nextInt(); //get number from user input

        int max = num1;
        if (max < num2) {
            max = num2; 
        }
        if (max < num3) {
            max = num3;
        }

        System.out.println("The greatest number is " + max);
        scanner.close();
    }
}  */

/* import java.util.Scanner;

public class compare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt(); // get number from user input

        System.out.println("You are " + ((score >= 5) ? "passed" : "failed"));
        scanner.close();
    }
} */

/* import java.util.Scanner;

public class compare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); //get number from user input
        int y = scanner.nextInt(); //get number from user input

        System.out.println("This point lies in the " + ( (x > 0 && y > 0) ? "First quadrant": ((x<0 && y<0))? "Third quadrant": ((x>0 && y<0))? "Fourth quadrant" : "Second quadrant" )  );
    }
} */