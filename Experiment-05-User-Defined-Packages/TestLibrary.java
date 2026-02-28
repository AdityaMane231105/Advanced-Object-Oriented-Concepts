import LibraryManagement.Book;
import LibraryManagement.Member;

public class TestLibrary {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James Gosling", "12345");
        Member m = new Member("Aditya", 101);

        b.displayBook();
        m.displayMember();
    }
}