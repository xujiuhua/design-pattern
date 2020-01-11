package com.behavior.iterator;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class BookShelf implements Aggregate{

    private Book[] books;
    private int last = 0;

    public BookShelf(int max) {
        this.books = new Book[max];
    }

    public Book getBookAt(int index) {
        return this.books[index];
    }

    public void append(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
