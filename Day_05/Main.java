package week5or6;

public class Main {
    public static void main(String[] args) {
        catalog catalog = new catalog();
        book book1 = new book(1, "Java Basics", "John Doe", "Programming", true);
        book book2 = new book(2, "Advanced Java", "Jane Smith", "Programming", true);
        catalog.addBook(book1);
        catalog.addBook(book2);
        //System.out.println("Initial Catalog:");
        catalog.display();

        user alice = new user(101, "Alice");
        alice.borrowBook(1);
        catalog.updateBookStatus(1, false);
        System.out.println("\nAfter Alice borrows Book ID 1:");
        catalog.display();
        //System.out.println(alice);

        user bob = new user(102, "Bob");
        bob.borrowBook(2);
        catalog.updateBookStatus(2, false);
        bob.returnBook(2);
        catalog.updateBookStatus(2, true);
        System.out.println("\nAfter Bob borrows & returns Book ID 2:");
        catalog.display();
        //System.out.println(bob);
    }
}
