package LibrarySystem;

import book.Book;
import utils.LoadBook;
import utils.WriteBook;

public class Library {
    LoadBook loadBook = LoadBook.getLoadBook();
    WriteBook writeBook = WriteBook.getWriteBook();

    private Book[] books;
    private Library() {
        this.books = loadBook.loadBooks();
    }
    private static final Library lobrary = new Library();

    //加载书籍
    public void loadBook() {
        this.books = loadBook.loadBooks();
    }
    //写回书籍
    public void writeBook() {
        writeBook.writeBook(this.books);
    }

    public static Library getLibrary() {
        return lobrary;
    }
}
