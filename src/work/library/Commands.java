package work.library;

public interface Commands {

    String EXIT = "0";
    String ADD_BOOK = "1";
    String PRINT_ALL_BOOKS = "2";
    String SEARCH_BOOK_BY_TITLE = "3";
    String SEARCH_BOOK_BY_PRICE_RANGE = "4";
    String PRINT_EXPENSIVE_BOOK = "5";
    String DELETE_BOOK_BY_ID = "6";

    static void command() {
        System.out.println();
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_BOOK + " for Add Book");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for Print all Books");
        System.out.println("Please input " + SEARCH_BOOK_BY_TITLE + " for Search Book by Title");
        System.out.println("Please input " + SEARCH_BOOK_BY_PRICE_RANGE + " for Search Book by Price");
        System.out.println("Please input " + PRINT_EXPENSIVE_BOOK + " for Search Expensive Book");
        System.out.println("Please input " + DELETE_BOOK_BY_ID + " for Delete Book by Id");
    }
}
