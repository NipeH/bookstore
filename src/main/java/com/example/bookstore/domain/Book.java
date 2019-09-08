package com.example.bookstore.domain;



//title, author, year, isbn, price
public class Book {

    private String model;
    private String author;
    private int year;
    private int isbn;
    private double price;


    public Book(){

        super();
        this.model = null;
        this.author = null;
        this.year = 0;
        this.isbn = 0;
        this.price = 0;

    }


    public Book(String model, String author, int year, int isbn, double price) {
        super();
        this.model = model;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "model='" + model + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}