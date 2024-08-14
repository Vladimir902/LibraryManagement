package com.java.library.Library;

import com.java.library.Books.Book;

import java.util.ArrayList;


public class Library {

    //Assign a list of array for storing books
    private ArrayList<Book> books;


    public Library() {
        books = new ArrayList<>();
    }

    //method for adding a book
    public void addBook(Book book) {
        books.add(book);
    }

    //method for removing a book
    public void removeBook(Book book) {
        books.remove(book);
    }

    //getter method to return books
    public ArrayList<Book> getBooks() {
        return books;
    }
}