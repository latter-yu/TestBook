package com.bit.user;

import com.bit.book.BookList;
import com.bit.operation.IOperation;

abstract public class User {
    public String name;
    //此数组中保存每个对象对应操作
    public IOperation[] Operations;

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        //Operations[choice] -> 拿到数组当中元素对象
        //通过 . 调用对应操作方法
        Operations[choice].work(bookList);
    }

}
