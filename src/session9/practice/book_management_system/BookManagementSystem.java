package session9.practice.book_management_system;

public class BookManagementSystem {

    public static void main(String[] args) {
        Author alice = new Author("Alice");
        Book book = new Book("Juurney to Wonderland", alice);

        System.out.println("Book title: " + book.getTitle());
        System.out.println("Book author: " + book.getAuthorName());
    }
}
