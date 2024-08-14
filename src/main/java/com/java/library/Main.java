package com.java.library;

import com.java.library.Books.Book;
import com.java.library.Library.Library;

public class Main {
    public static void main(String[] args) {

        //creating new object for storing Book objects
        Library library = new Library();

        // Create new Book objects with title and author
        Book book1 = new Book("Adventures of Tom Sawyer", "Mark Twain");
        Book book2 = new Book("Ben Hur", "Lewis Wallace");
        Book book3 = new Book("Time Machine", "H.G. Wells");
        Book book4 = new Book("Anna Karenina", "Leo Tolstoy");

        // Add the books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Print a message to indicate the books in the library
        System.out.println("Books in the library:");
        // Iterate through the list of books in the library
        for (Book book : library.getBooks()) {
            // Print the title and author of each book
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
        System.out.println();

        // Remove a book from the library
        library.removeBook(book2);
        // Print a message to indicate the books in the library after removal
        System.out.println("Books in the library after removing " + book2.getTitle() + ":");
        System.out.println();
        // Iterate through the updated list of books in the library
        for (Book book : library.getBooks()) {
            // Print the title and author of each book
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}