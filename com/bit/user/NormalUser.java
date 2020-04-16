package com.bit.user;

import com.bit.operation.*;

import java.util.Scanner;

public class NormalUser extends User {
    //普通用户
    public NormalUser(String name) {
        super(name);
        //存放普通用户的对应操作
        this.Operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("Hello" + this.name + " " + "欢迎进入图书系统");
        System.out.println("0.退出系统");
        System.out.println("1.查找书籍");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("===================");
        int choice = scanner.nextInt();
        return choice;
    }
}
