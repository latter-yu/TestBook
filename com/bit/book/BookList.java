package com.bit.book;

public class BookList {
    private Book[] books;
    private int userSize;

    public BookList() {
        this.books = new Book[10];
        this.books[0] = new Book("西游记", "吴承恩", 35, "小说");
        this.books[1] = new Book("爱格", "爱格小编", 8, "杂志");
        this.books[2] = new Book("安妮日记", "安妮", 20, "自传");
        this.userSize = 3;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public int getUserSize() {
        return userSize;
    }

    public void setUserSize(int userSize) {
        this.userSize = userSize;
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
    }

    public void setBooks(int curSize) {
    }
}
