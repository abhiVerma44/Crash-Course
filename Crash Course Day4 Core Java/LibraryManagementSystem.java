import java.util.*;

// Custom exception for when a book is not available
class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Class to represent a book
class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class LibraryManagementSystem {
    private ArrayList<Book> books = new ArrayList<>();
    private LinkedList<String> waitingList = new LinkedList<>();
    private Vector<String> members = new Vector<>();
    private Stack<Book> returnedBooks = new Stack<>();
    private HashSet<String> uniqueMembers = new HashSet<>();
    private LinkedHashSet<Book> borrowedBooks = new LinkedHashSet<>();
    private TreeSet<String> sortedBookTitles = new TreeSet<>();
    private HashMap<Integer, Book> bookMap = new HashMap<>();
    private LinkedHashMap<Integer, Book> checkoutHistory = new LinkedHashMap<>();
    private TreeMap<Integer, Book> sortedBooksById = new TreeMap<>();

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book.getId(), book);
        sortedBookTitles.add(book.getTitle());
        sortedBooksById.put(book.getId(), book);
    }

    // Register a new library member
    public void registerMember(String member) {
        if (!uniqueMembers.contains(member)) {
            members.add(member);
            uniqueMembers.add(member);
        }
    }

    // Check out a book
    public void checkoutBook(int bookId, String member) {
        Book book = bookMap.get(bookId);
        if (book != null && books.contains(book)) {
            borrowedBooks.add(book);
            waitingList.add(member);
            checkoutHistory.put(bookId, book);
            sortedBooksById.remove(bookId);
            System.out.println(member + " has checked out " + book.getTitle());
        } else {
            System.out.println("Book with ID " + bookId + " is not available for checkout.");
        }
    }

    // Return a book
    public void returnBook(int bookId) {
        Book book = checkoutHistory.get(bookId);
        if (book != null) {
            borrowedBooks.remove(book);
            waitingList.poll();
            returnedBooks.push(book);
            sortedBooksById.put(bookId, book);
            System.out.println(book.getTitle() + " has been returned.");
        } else {
            System.out.println("Book with ID " + bookId + " has not been checked out.");
        }
    }

    // Print list of all books in the library
    public void printAllBooks() {
        System.out.println("All Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Print list of borrowed books
    public void printBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }

    // Print list of members waiting for books
    public void printWaitingList() {
        System.out.println("Waiting List:");
        for (String member : waitingList) {
            System.out.println(member);
        }
    }

    // Main method to test the library management system
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Adding books to the library
        library.addBook(new Book(1, "Java Programming", "John Doe"));
        library.addBook(new Book(2, "Data Structures and Algorithms", "Jane Smith"));
        library.addBook(new Book(3, "Introduction to Algorithms", "Alice Johnson"));

        library.printAllBooks();
        // Registering library members
        library.registerMember("Alice");
        library.registerMember("Bob");

        // Attempt to checkout a book that's not available
        try {
            library.checkoutBook(4, "Alice");
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Checkout a book
        library.checkoutBook(1, "Alice");

        // Return the book
        library.returnBook(1);

        // Print borrowed books and waiting list
        library.printBorrowedBooks();
        library.printWaitingList();
    }
}