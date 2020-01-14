// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package question1;

public class Book {
    private Author author;
    private String title;
    private int noOfPages;
    private boolean fiction;

    public Book(Author author, String title, int noOfPages, boolean fiction) {
        this.author = author;
        this.title = title;
        this.noOfPages = noOfPages;
        this.fiction = fiction;
    }

    public Book() {
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getnoOfPages() {
        return noOfPages;
    }

    public boolean getfiction() {
        return fiction;
    }

    @Override
    public String toString() {
        return "author = " + author + "\nfiction = " + fiction + "\nnoOfPages = " + noOfPages + "\ntitle = " + title;

    }
}
