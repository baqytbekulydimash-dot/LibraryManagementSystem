import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.borrow()) {
            borrowedBooks.add(book);
            System.out.println("Кітап алынды");
        } else {
            System.out.println("Қолжетімсіз");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnItem();
            borrowedBooks.remove(book);
            System.out.println("Қайтарылды");
        }
    }
}