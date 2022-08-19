package com.javaStudy.week1.JavaBasic;

public class Basic8_operator2 {
    public static void main(String[] args) {
        // ++ -- 自增自减 一元运算符
        int a = 3;
        int b = a++;//先赋值再自增
        System.out.println(a);
        int c = ++a;//先自增再赋值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("========================");
        //幂运算 2^3=2*2*2=8
        double pow = Math.pow(3,2);
        System.out.println(pow);
    }
}
