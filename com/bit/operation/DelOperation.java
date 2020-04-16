package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    //删除书籍
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();

        int pos = 0;
        while(pos < bookList.getUserSize()) {
            Book book = bookList.getBooks(pos);
            if(book.getName().equals(name)) {
                return;
            }
            pos++;
        }
        int curSize = bookList.getUserSize();
        bookList.setBooks(pos - 1);
        bookList.setUserSize(curSize - 1);

        System.out.println("成功删除一本图书");
    }
}
