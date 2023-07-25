package bookSorter;

import java.util.Date;

public class Book implements Comparable<Book> {
    private String bookName;
    private int pageCount;
    private String authorName;
    private Date publishDate;

    public Book(String bookName, int pageCount, String authorName, Date publishDate) {
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.bookName.compareTo(otherBook.bookName);
    }

    @Override
    public String toString() {
        return "bookSorter.Book: " + bookName + ", Page Count: " + pageCount +
                ", Author: " + authorName + ", Publish Date: " + publishDate;
    }
}

