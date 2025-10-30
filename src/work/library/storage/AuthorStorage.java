package work.library.storage;

import work.library.model.Author;

public class AuthorStorage {
    private Author[] authors;
    private int size;

    public AuthorStorage() {
        authors = new Author[10];
    }

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, size);
        authors = tmp;
    }

    public Author getAuthorByPhoneNumber(String phoneNumber){
        for (int i = 0; i < size; i++) {
            if (authors[i].getPhoneNumber().equals(phoneNumber)){
                return authors[i];
            }
        }
        return null;
    }

    public void printAllAuthors() {
        if (size == -1) {
            System.err.println("There are no Author's ");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }
}
