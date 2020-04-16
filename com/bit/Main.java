package com.bit;

import com.bit.book.BookList;
import com.bit.user.AdminUser;
import com.bit.user.NormalUser;
import com.bit.user.User;

import java.util.Scanner;

public class Main {
    public static User login() {
        //输入身份
        Scanner scanner = new Scanner(System.in);
        System.out.println("姓名");
        String name = scanner.nextLine();
        System.out.println("身份：1.AdminUser 2.NormalUser");
        int num = scanner.nextInt();
        if(num == 1) {
            return new AdminUser(name);
        }else  {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        //1.准备书籍
        BookList bookList = new BookList();
        while (true) {
            //2.登录，确认身份
            User user = login();
            int choice = user.menu();
            //3.确定调用的操作方法
            user.doOperation(choice, bookList);
        }
    }
}
