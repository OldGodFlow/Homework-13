public class Main {
    public static void main(String[] args) {
        Author akunin = new Author("Борис", "Акунин");
        Book yama = new Book("Яма", akunin, 2023);
        Author bakman = new Author("Фредерик", "Бакман");
        Book anxiousPeople = new Book("Тревожные люди", bakman, 2019);
        anxiousPeople.setYearPublished(2020);
    }
}