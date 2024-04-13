// Interface for searchable items
interface Searchable {
    boolean search(String query);
}

// Base class for library resources
abstract class LibraryResource implements Searchable {
    private int id;
    private String title;
    private boolean checkedOut;

    public LibraryResource(int id, String title) {
        this.id = id;
        this.title = title;
        this.checkedOut = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void returnResource() {
        checkedOut = false;
    }
}

// Book class
class Book extends LibraryResource {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean search(String query) {
        return getTitle().contains(query) || getAuthor().contains(query);
    }

    @Override
    public void checkOut() {
        super.checkOut();
    }

    @Override
    public void returnResource() {
        super.returnResource();
    }
}

// Journal class
class Journal extends LibraryResource {
    private String publisher;

    public Journal(int id, String title, String publisher) {
        super(id, title);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public boolean search(String query) {
        return getTitle().contains(query) || getPublisher().contains(query);
    }
}

// Multimedia class
class Multimedia extends LibraryResource {
    private String format;

    public Multimedia(int id, String title, String format) {
        super(id, title);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public boolean search(String query) {
        return getTitle().contains(query) || getFormat().contains(query);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Creating library resources
        Book book = new Book(1, "Java Programming", "John Doe");
        Journal journal = new Journal(2, "Computer Science Journal", "ACM");
        Multimedia multimedia = new Multimedia(3, "Introduction to Algorithms", "Video");

        // Check out a book
        book.checkOut();

        // Search for resources
        System.out.println("Search Results:");
        System.out.println("Book: " + book.search("Java"));
        System.out.println("Journal: " + journal.search("Computer"));
        System.out.println("Multimedia: " + multimedia.search("Algorithms"));

        // Return the book
        book.returnResource();
    }
}
