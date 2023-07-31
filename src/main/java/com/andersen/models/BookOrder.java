package com.andersen.models;

public class BookOrder {

    private Book book;
    private int amount;

    public BookOrder(Book book, int amount) {
        this.book = book;
        this.amount = amount;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BookOrder [book=" + book + ", amount=" + amount + "]";
    }
}
