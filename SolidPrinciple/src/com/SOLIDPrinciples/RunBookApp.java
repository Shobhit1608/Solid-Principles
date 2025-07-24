package com.SOLIDPrinciples;
//Single-Responsibility Principle

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class BookApp {
    public void print(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}

public class RunBookApp {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin");
        BookApp printer = new BookApp(); 
        printer.print(book);             
    }
}
