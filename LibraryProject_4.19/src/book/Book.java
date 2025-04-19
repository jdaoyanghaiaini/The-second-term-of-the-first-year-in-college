package book;

import java.time.LocalDate;

public class Book {
    //Book内部属性
    private int bookId;
    private String title;
    private String author;
    private String category;
    private int publishYear;
    private boolean isBorrwed;
    private int borrowCount;
    private LocalDate shelfDate;

    Book() {

    }

    Book(String title,String author,String category,int publishYear,LocalDate shelfDate) {
        this.bookId = 0;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publishYear = publishYear;
        this.isBorrwed = false;
        this.borrowCount = 0;
        this.shelfDate = shelfDate;
    }
}
