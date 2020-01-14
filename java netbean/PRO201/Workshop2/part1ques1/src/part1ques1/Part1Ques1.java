// Name: Pham Duy Dat
// ID: DE140191
// Class: SE1403
package part1ques1;

public class Part1Ques1 {

    public static void main(String[] args) {

        // (a) a for loop and a continue statement.
        for( int i =2;i<=10;i++) {
            if (i%2==0) System.out.print(i+ " ");
        }
        System.out.println();

        // (b) a while loop and a boolean variable as a flag.
        int count = 2;
        while(count >=2 && count<=10) {
            if (count%2==0) System.out.print(count+ " ");
            count++;
        }
        System.out.println();
    }
}