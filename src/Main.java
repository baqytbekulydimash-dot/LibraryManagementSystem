import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Author a1 = new Author("Абай", "KZ");
        Author a2 = new Author("Мухтар", "KZ");

        Book b1 = new Book("Абай жолы", a2, 1942);
        Book b2 = new Book("Қара сөздер", a1, 1890);

        library.addBook(b1);
        library.addBook(b2);

        User user = new User("Student");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Көру 2.Іздеу 3.Алу 4.Қайтару 0.Шығу");
            String c = sc.nextLine();

            if (c.equals("1")) library.showBooks();
            else if (c.equals("2")) {
                System.out.print("Атауы: ");
                Book b = library.searchBook(sc.nextLine());
                System.out.println(b != null ? b.getInfo() : "Жоқ");
            }
            else if (c.equals("3")) {
                Book b = library.searchBook(sc.nextLine());
                if (b != null) user.borrowBook(b);
            }
            else if (c.equals("4")) {
                Book b = library.searchBook(sc.nextLine());
                if (b != null) user.returnBook(b);
            }
            else if (c.equals("0")) break;
        }
    }
}