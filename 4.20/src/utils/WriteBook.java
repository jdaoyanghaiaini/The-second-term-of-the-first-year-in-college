package utils;

import book.Book;
//将这个类封装到Library中,将传过来的books数组写回文件;
public class WriteBook {
    private WriteBook() {};
    private final static WriteBook writeBook = new WriteBook();
    public static WriteBook getWriteBook() {
        return writeBook;
    }

    public boolean writeBook(Book[] books) {
        return true;
    }
}
