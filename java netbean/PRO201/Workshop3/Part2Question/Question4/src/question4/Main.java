// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question4;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Dat", "dat@gmail.com", 'm');
        Author a2 = new Author("Sei", "sei@gmail.com", 'm');

        Book b1 = new Book("Dat's Diary", a1, 10000);

        b1.setQty(5);
        Book b2 = new Book("Sei's Diary", a2, 100);
        b2.setQty(7);

        System.out.println(b1 + "\n");
        System.out.println(a1 + "\n");
        System.out.println(b2 + "\n");
        System.out.println(a2 + "\n");
    }
}
