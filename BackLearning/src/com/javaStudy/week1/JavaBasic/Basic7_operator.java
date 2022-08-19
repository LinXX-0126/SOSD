package com.javaStudy.week1.JavaBasic;

public class Basic7_operator {
    public static void main(String[] args) {
        //二元运算符
        //ctrl+D 复制当前行到下一行
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);
        System.out.println("=========================================");

        long e = 123123123L;
        int f = 123;
        short g = 10;
        byte h = 8;

        System.out.println(e+f+g+h);//long
        System.out.println(f+g+h);//int
        System.out.println(g+h);//int
        System.out.println("=========================================");
//      System.out.println((double) g+h);
//      System.out.println((String) (g+h));
        //没有long的时候 结果都为int
        //cast 转换

        //关系运算符返回的结果： 正确  错误  布尔值
        //if
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println("=========================================");

        System.out.println(c%a);//取余 模运算

        //自增自减运算符
    }
}
