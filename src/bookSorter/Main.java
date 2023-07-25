package bookSorter;

import bookSorter.Book;
import bookSorter.BookComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Book3", 300, "Author3", new Date()));
        bookSetByName.add(new Book("Book1", 150, "Author1", new Date()));
        bookSetByName.add(new Book("Book5", 500, "Author5", new Date()));
        bookSetByName.add(new Book("Book2", 250, "Author2", new Date()));
        bookSetByName.add(new Book("Book4", 400, "Author4", new Date()));

        System.out.println("Kitaplar isme göre sıralı:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        Set<Book> bookSetByPageCount = new TreeSet<>(new BookComparator());
        bookSetByPageCount.add(new Book("Book3", 300, "Author3", new Date()));
        bookSetByPageCount.add(new Book("Book1", 150, "Author1", new Date()));
        bookSetByPageCount.add(new Book("Book5", 500, "Author5", new Date()));
        bookSetByPageCount.add(new Book("Book2", 250, "Author2", new Date()));
        bookSetByPageCount.add(new Book("Book4", 400, "Author4", new Date()));

        System.out.println("\nKitaplar sayfa sayısına göre sıralı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }

    }
}