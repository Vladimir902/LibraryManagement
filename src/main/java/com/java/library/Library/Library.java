package com.java.library.Library;

import com.java.library.Books.Book;

import java.util.LinkedList;


public class Library {

    // Assign a LinkedList for storing books
    private LinkedList<Book> books;

    public Library() {
        books = new LinkedList<>();
    }

    // Method for adding a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method for removing a book
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Getter method to return books
    public LinkedList<Book> getBooks() {
        return books;
    }

    public boolean borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isBorrowed()) {
                book.borrow();
                return true;
            }
        }
        return false;
    }

    //method for returning books
    public boolean returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isBorrowed()) {
                book.returnBook();
                return true;
            }
        }
        return false;
    }

    //method to display the books that are in the library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - " + (book.isBorrowed() ? "Borrowed" : "Available"));
        }
    }


    //method to see if the book is borrowed or not
    public boolean isBookBorrowed(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book.isBorrowed();
            }
        }
        return false; // If the book is not found, assume it's not borrowed
    }


}
