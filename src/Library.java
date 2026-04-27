import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getInfo().toLowerCase().contains(title.toLowerCase())) {
                return book;
            }
        }
        return null;
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
    }
}