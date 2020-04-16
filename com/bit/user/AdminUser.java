package com.bit.user;

import com.bit.operation.*;

import java.util.Scanner;

public class AdminUser extends User {
    //管理员用户
    public AdminUser(String name) {
        super(name);
        //数组中存放Admin的对应操作
        this.Operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };
    }
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("Hello" + this.name + " " + "欢迎进入图书系统");
        System.out.println("0.退出系统");
        System.out.println("1.查找书籍");
        System.out.println("2.新增书籍");
        System.out.println("3.删除书籍");
        System.out.println("4.打印书籍");
        System.out.println("===================");
        int choice = scanner.nextInt();
        return choice;
    }
}
