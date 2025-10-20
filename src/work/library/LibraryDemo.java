package work.library;

import work.library.model.Book;
import work.library.storage.BookStorage;

import java.util.Scanner;


public class LibraryDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bs = new BookStorage();
    private static int id = 1;

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Commands.command();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bs.printAllBooks();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.print("Please input keyword - ");
                    String keyword = scanner.nextLine();
                    bs.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    printExpensiveBook();
                    break;
                case DELETE_BOOK_BY_ID:
                    break;
                default:
                    System.err.println("Wrong commands.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Please input title - ");
        String title = scanner.nextLine();
        System.out.print("Please input authorName - ");
        String authorName = scanner.nextLine();
        System.out.print("Please input price - ");
        double price = Double.parseDouble(scanner.nextLine());
        Book book = new Book(id,title, authorName, price);
        bs.add(book);
        id++;
    }

    private static void printExpensiveBook() {
        if (bs.getBookByMaxPrice() != null) {
            System.out.println(bs.getBookByMaxPrice());
        } else {
            System.err.println("There are no books");
        }
    }
}
