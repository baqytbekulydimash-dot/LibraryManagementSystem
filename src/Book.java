public class Book extends LibraryItem {
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        super(title);
        this.author = author;
        this.year = year;
    }

    @Override
    public String getInfo() {
        String status = isAvailable ? "Бар" : "Берілген";
        return title + " | " + author.getInfo() + " | " + year + " | " + status;
    }
}