package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {
    //借阅书籍
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要借阅的书籍");
        String name = scanner.nextLine();

        for(int i = 0; i < bookList.getUserSize(); i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)) {
                //找到书
                if(book.isborrowed()) {
                    System.out.println("已经被借出！");
                    return;
                }
                book.setIsborrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("抱歉，没有找到这本书！");
    }
}
