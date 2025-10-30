package work.library.storage;


import work.library.model.Author;
import work.library.model.Book;

public class BookStorage {

    private Book[] books;
    private int size;
    private int id;

    public BookStorage() {
        books = new Book[10];
        id = 1;
    }

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        book.setId(id++);
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void printAllBooks() {
        if (size == -1) {
            System.err.println("There are no books");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book getBookByMaxPrice() {
        if (size == -1) {
            return null;
        }
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void search(String keyword) {
        if (size == -1) {
            System.out.println("There are not books");
            return;
        }
        for (int i = 0; i <= size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBookByAuthor(Author author) {
        if (size == -1) {
            System.out.println("There are not books");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i]);
            }
        }
    }

    public void booksByPriceRange(double minPrice, double maxPrice) {
        if (size == -1) {
            System.out.println("There are not books");
            return;
        }
        for (int i = 0; i < size; i++) {
            double price = books[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                System.out.println(books[i]);
            }
        }
    }


    public void deleteById(int id) {
        if (size == -1) {
            System.out.println("There are not books");
            return;
        }
        int index = -1;
        int quantity = 0;
        for (int i = 0; i <= size; i++) {
            if (books[i].getId() == id) {
                quantity = books[i].getQuantity();
                index = i;
                break;
            }
        }
        if (quantity > 1) {
            books[index].setQuantity(quantity - 1);
            System.out.println("Book deleted successfully");
            return;
        }
        for (int i = index; i < size; i++) {
            books[i] = books[i + 1];
        }
        size--;
        System.out.println("Book deleted successfully");
    }
}
