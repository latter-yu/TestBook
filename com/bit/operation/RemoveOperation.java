package com.bit.operation;

import com.bit.book.BookList;

public class RemoveOperation implements IOperation {
    //借阅书籍

    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
    }
}
