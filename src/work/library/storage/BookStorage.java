package work.library.storage;


import work.library.model.Book;

public class BookStorage {

    private Book[] books;
    private int size;

    public BookStorage() {
        books = new Book[10];
        size = -1;
    }

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[++size] = book;
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
        for (int i = 0; i <= size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book getBookByMaxPrice() {
        if (size == -1) {
            return null;
        }
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i <= size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void search(String keyword) {
        if (size != -1) {
            for (int i = 0; i <= size; i++) {
                if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(books[i]);
                }
            }
        } else {
            System.out.println("There are no books");
        }
    }
}
