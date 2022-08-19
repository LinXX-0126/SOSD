package com.javaStudy.week1.JavaProcessControl;

import java.util.Scanner;

public class ProC1_Scanner {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner sc = new Scanner(System.in);
        System.out.println("Use next method to accept:");
        //判断用户有没有输入：
        if (sc.hasNext()){
            //用next接收：
            String str = sc.next();//只读取一个词 碰到空格就读取完毕
            System.out.println("输出内容为："+str);
            System.out.println();
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Use nextLine method to accept");
        //判断用户有没有输入：
        if (sc2.hasNextLine()){
            //用nextLINE接收：
            String str = sc2.nextLine();//程序会一直等待用户输入
            System.out.println("输出内容为："+str);
            System.out.println();
        }
        //Scanner用完要关掉
        sc.close();
        sc2.close();


    }
}
