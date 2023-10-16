package org.estoutic.solution_two.books;

class BookShelf {
    private Book[] books;
    private int numBooks;

    public BookShelf(int bookShelfSize) {
        books = new Book[bookShelfSize];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Book shelf is full");
        }
    }

    public Book getLatestBook() {
        Book latestBook = null;
        int latestYear = 0;

        for (int i = 0; i < numBooks; i++) {
            if (books[i].getYear() > latestYear) {
                latestYear = books[i].getYear();
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public Book getEarliestBook() {
        Book earliestBook = null;
        int earliestYear = Integer.MAX_VALUE;

        for (int i = 0; i < numBooks; i++) {
            if (books[i].getYear() < earliestYear) {
                earliestYear = books[i].getYear();
                earliestBook = books[i];
            }
        }
        return earliestBook;
    }

    public Book[] getBooks(){
        return books;
    }

    public void sortBooksByYear() {
        for (int i = 0; i < numBooks - 1; i++) {
            for (int j = 0; j < numBooks - i - 1; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}