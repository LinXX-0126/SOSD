package com.javaStudy.week1.JavaBasic;

public class Basic5_typeConversation {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i; //内存溢出 byte最大值为127 超过127就出问题
        //强制转换 高转低
        System.out.println(i);
        System.out.println(b);
        System.out.println("===================================");


        byte x = 12;
        int x2 = x;
        System.out.println(x);
        System.out.println(x2);
        System.out.println("===================================");

        System.out.println((int)23.7);
        System.out.println((int)-45.89f);
        System.out.println("===================================");

        char c = 'a';
        int d = c+1;
        System.out.println(d);
        System.out.println((char) d);
        System.out.println("===================================");

        //操作比较大的数时，注意溢出问题
        //JDK7新特性，数字可以用下划线分割
        int money = 10_0000_0000;
        System.out.println(money);
        int years = 20;
        int total = money*years;
        System.out.println(total);//计算时溢出了
        long total2 = money*years;
        System.out.println(total2); //默认是int，转换前已经存在问题了 是把money*years的结果转化为long
                            // 但是结果本身是int，所以计算结果值就是total的值，再把total的值转换成long而已
        long total3 = money*((long)years);//也可以在mone后面加L（l也可以但L更规范）
        System.out.println(total3);//结果正常
    }
}
