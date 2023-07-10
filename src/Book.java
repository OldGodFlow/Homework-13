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

    @Override
    public String toString() {
        return "Название книги : " +
                name + ", " +
                author.toString() +
                ", год публикации: " + yearPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getYearPublished() != book.getYearPublished()) return false;
        if (getName() != null ? !getName().equals(book.getName()) : book.getName() != null) return false;
        return getAuthor() != null ? getAuthor().equals(book.getAuthor()) : book.getAuthor() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + getYearPublished();
        return result;
    }
}
