// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question1;

public class bookdemo {
    public static void main(String[] args) {
        Book book = new Book();
        Author author = new Author("Pham Duy Dat");

        book.setAuthor(author);
        book.setTitle("Day la title cua book");
        book.setNoOfPages(1000);
        book.setFiction(true);

        System.out.println(book);
    }
}
