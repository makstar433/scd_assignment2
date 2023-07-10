package org.example;

public class Book {
    private int bookID;
    private int pages;
    private double price;

    public Book(int bookID, int pages, double price) {
        this.bookID = bookID;
        this.pages = pages;
        this.price = price;
    }

    public void show() {
        System.out.println("Book ID: " + this.bookID);
        System.out.println("Number of pages: " + this.pages);
        System.out.println("Price: " + this.price);
    }

    public void set(int bookID, int pages, double price) {
        this.bookID = bookID;
        this.pages = pages;
        this.price = price;
    }

    public int getBookID() {
        return bookID;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book(1, 100, 10.0);
        Book book2 = new Book(2, 200, 20.0);

        Book mostCostlyBook = book1.getPrice() > book2.getPrice() ? book1 : book2;
        System.out.println("Details of the most costly book:");
        mostCostlyBook.show();
    }

}
