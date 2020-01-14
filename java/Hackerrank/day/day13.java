package hackrank.day;

import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {
    int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public void display() {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %s\n", title, author, this.price);
    }
}

public class day13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}