package LW_03;

public class Book extends BorrowableItems {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        setAvailable(available);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + " | Author: " + author + " | ISBN: " + ISBN +
                " | Available: " + (isAvailable() ? "Yes" : "No"));
    }
}
