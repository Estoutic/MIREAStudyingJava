package org.estoutic.solution_two.books;

public class BookTester {

    public static void main(String[] args) {

        BookShelf shelf = new BookShelf(3);

        Book book1 = new Book("Author 1", "Book 1", 2000);
        Book book2 = new Book("Author 2", "Book 2", 1991);
        Book book3 = new Book("Author 3", "Book 3", 2020);

        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);

        System.out.println("Latest book :");
        System.out.println(shelf.getLatestBook());

        System.out.println("\nEarlier Book:");
        System.out.println(shelf.getEarliestBook());

        shelf.sortBooksByYear();

        System.out.println("\nSorted books:");

        for(Book book: shelf.getBooks()){
            System.out.println(book.toString());
        }
    }
}
