package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    //寻找书籍

    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要查找的书籍");
        String name = scanner.nextLine();

        for(int i = 0; i < bookList.getUserSize(); i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)) {
                System.out.println(book);
                System.out.println("已查找到！");
                return;
            }
        }
        System.out.println("抱歉，没有找到这本书！");
    }
}
