package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

public class AddOperation  implements IOperation {
    //添加书籍

    @Override
    public void work(BookList bookList) {
        System.out.println("新增书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格：");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型：");
        //nextInt 与 nextLine 不能同时使用，改为 next;
        //String type = scanner.nextLine();
        String type = scanner.next();

        Book book = new Book(name, author, price, type);

        int curSize = bookList.getUserSize();
        bookList.setBooks(curSize, book);
        bookList.setUserSize(curSize + 1);

        System.out.println("成功新增一本图书");
    }
}
