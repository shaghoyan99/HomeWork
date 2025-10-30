package work.library;

import work.library.model.Author;
import work.library.model.Book;
import work.library.storage.AuthorStorage;
import work.library.storage.BookStorage;

import java.util.Scanner;


public class LibraryDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bs = new BookStorage();
    private static AuthorStorage as = new AuthorStorage();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Commands.command();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bs.printAllBooks();
                    break;
                case PRINT_ALL_AUTHORS:
                    as.printAllAuthors();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.print("Please input keyword - ");
                    String keyword = scanner.nextLine();
                    bs.search(keyword);
                    break;
                case SEARCH_BOOK_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                case SEARCH_BOOK_BY_PRICE_RANGE:
                    System.out.println("Please input min price");
                    double minPrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input max price");
                    double maxPrice = Double.parseDouble(scanner.nextLine());
                    bs.booksByPriceRange(minPrice, maxPrice);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    printExpensiveBook();
                    break;
                case DELETE_BOOK_BY_ID:
                    deleteById();
                    break;
                default:
                    System.err.println("Wrong commands.");
            }
        }
    }

    private static void searchBookByAuthor() {
        System.out.println("Please check author phone number - ");
        as.printAllAuthors();
        String phoneNumber = scanner.nextLine();
        Author author = as.getAuthorByPhoneNumber(phoneNumber);

        if (author != null){
            bs.searchBookByAuthor(author);
        }else {
            System.out.println("Wrong Author's phone number, please try again!!! ");
        }
    }

    private static void addAuthor() {
        System.out.print("Please input name - ");
        String name = scanner.nextLine();
        System.out.print("Please input surname - ");
        String surname = scanner.nextLine();
        System.out.print("Please input age - ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Please input phone number - ");
        String phoneNumber = scanner.nextLine();
        Author author = new Author(name, surname, age, phoneNumber);
        as.add(author);
        System.out.println("Author added successfully");
    }

    private static void deleteById() {
        bs.printAllBooks();
        System.out.print("Please input id - ");
        int id = Integer.parseInt(scanner.nextLine());
        bs.deleteById(id);
    }

    private static void addBook() {
        System.out.println("Please check author phone number");
        as.printAllAuthors();
        String phoneNumber = scanner.nextLine();
        Author author = as.getAuthorByPhoneNumber(phoneNumber);

        if (author != null) {
            System.out.print("Please input title - ");
            String title = scanner.nextLine();
            System.out.print("Please input quantity - ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Please input price - ");
            double price = Double.parseDouble(scanner.nextLine());
            Book book = new Book(title,author,quantity,price);
            bs.add(book);
            System.out.println("Book added successfully");
        }else {
            System.out.println("Wrong Author's phone number, please try again!!! ");
        }

    }

    private static void printExpensiveBook() {
        if (bs.getBookByMaxPrice() != null) {
            System.out.println(bs.getBookByMaxPrice());
        } else {
            System.err.println("There are no books");
        }
    }
}
