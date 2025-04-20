package utils;

import book.Book;
//创建一个Book[],载入后返回到Library中；
public class LoadBook {
    private static final LoadBook loadBook = new LoadBook();

    private LoadBook() {

    }

    public static LoadBook getLoadBook() {
        return loadBook;
    }

    private Book[] books;

    public Book[] loadBooks() {

        return null;
    }

}
