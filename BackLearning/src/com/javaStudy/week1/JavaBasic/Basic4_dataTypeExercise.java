package com.javaStudy.week1.JavaBasic;

public class Basic4_dataTypeExercise {
    public static void main(String[] args) {
        //整数拓展： 进制      二进制0b   十进制     八进制0    十六进制0x
        int i = 10;
        int i2 = 010;   //八进制 0
        int i3 = 0x10;  //十六进制 0x   0~9 A~F
        int i4 = 0b10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("===================================");
        //=================================================================
        //浮点数拓展     银行业务怎么表示？钱
        //BigDecimal  数学工具类
        //=================================================================
        //float     有限 离散 舍入误差 大约       接近但不等于
        //double

        float f = 0.1F;
        double d = 1.0/10;
        System.out.println(f==d);
        System.out.println(f);
        System.out.println(d);

        float f1 = 2131313131321F;
        float f2 = f1+1;
        System.out.println(f1==f2);
        System.out.println("===================================");

        //=================================================================
        //字符拓展
        //=================================================================
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);

        //所有字符本质还是数字
        //编码 Unicode 2字节 65536 Excel

        char c3 = '\u0061';
        System.out.println(c3);

        //转义字符
        // \t   制表符
        // \n   换行

        System.out.println("Hello\tWorld!");
        System.out.println("==============");
        System.out.println("Hello\nWorld!");
        System.out.println("==============");

        String sa = new String("Hello world!");
        String sb = new String("Hello world!");
        System.out.println(sa==sb);

        String sc = "Hello world!";
        String sd = "Hello world!";
        System.out.println(sc==sd);

        //布尔值拓展
        boolean flag = true;
        if (flag==true){}
        if (flag) {}
        //两个if语句是一样的
    }
}


