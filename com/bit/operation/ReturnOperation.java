package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    //返还书籍

    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要归还的书籍");
        String name = scanner.nextLine();

        for(int i = 0; i < bookList.getUserSize(); i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)) {
                //找到书
                book.setIsborrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("抱歉，没有找到这本书！");
    }
}
