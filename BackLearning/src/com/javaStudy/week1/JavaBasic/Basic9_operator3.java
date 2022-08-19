package com.javaStudy.week1.JavaBasic;

public class Basic9_operator3 {
    public static void main(String[] args) {
        //与 或 非
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: "+(a && b));
        System.out.println("a || b: "+(a || b));
        System.out.println("!(a && b): "+(!(a && b)));
        System.out.println("==================================");

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);
        System.out.println(d);
        System.out.println(c);//还是5，可知c++没有运算 以上为短路运算
        System.out.println("==================================");

        //位运算
        /*
        A = 0011 1100
        B = 0000 1101
        --------------------------
        A&B = 0000 1100
        A|B = 0011 1101
        A^B = 0011 0001 取反：相同取0，相反取1
        ~B = 0000 0010 非
        按位置来的

        2*8 = 16  2*2*2*2
        <<  *2
        >>  /2

        0000 0000       0
        0000 0001       1
        0000 0010       2
        0000 0011       3
        0000 0100       4
        0000 1000       8
        0001 0000       16
         */

        System.out.println(2<<3);
    }
}
