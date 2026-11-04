
public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String id, String title, int year, String author, int pages) {
        super(id, title, year);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() { return author; }
    public int getPages() { return pages; }

    @Override
    public int getLoanDays() {
        return 14;
    }

    @Override
    public double getLateFeePerDay() {
        return 5000.0;
    }
}