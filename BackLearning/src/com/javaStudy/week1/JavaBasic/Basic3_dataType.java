package com.javaStudy.week1.JavaBasic;

public class Basic3_dataType {
    public static void main(String[] args) {
//        String a = 10;
//        int num = "10";
        String a = "hello";
        int n = 10;
        System.out.println(a);
        System.out.println(n);

        //八大基本数据类型
        //整数类型
        int num1 = 10;//最常用
        byte num2 = 20;
        short num3 = 30;
        long num4 = 30L;//数字后加上L 用于区分long类型

        //小数：浮点数
        float num5 = 50.1F;//同long类型一样 要在后面加上F 表示是float类型
        double num6 = 3.14159265358;

        //字符 只能有一个字
        char c1 = 'A';

        //布尔值 是非
        boolean flag = true;

        //字符串 String不是关键词，是类
        String name = "xxx";

    }
}
