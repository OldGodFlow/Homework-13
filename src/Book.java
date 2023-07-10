public class Book {
    private String name;
    private Author author;
    private int yearPublished;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.yearPublished = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
