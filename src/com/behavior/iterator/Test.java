package com.behavior.iterator;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.append(new Book("A1"));
        bookShelf.append(new Book("B2"));
        bookShelf.append(new Book("C3"));
        bookShelf.append(new Book("D4"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
