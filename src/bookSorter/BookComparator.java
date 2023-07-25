package bookSorter;

import bookSorter.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.getPageCount(), book2.getPageCount());
    }
}

