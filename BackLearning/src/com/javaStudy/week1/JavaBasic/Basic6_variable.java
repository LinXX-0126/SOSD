package com.javaStudy.week1.JavaBasic;

public class Basic6_variable {
    //类变量
    static double salary = 2500;
    static final double PI = 3.14;
    final static double PII = 3.14;
    //属性：变量

    //实例变量：从属于对象；如果不初始化，就是这个类型的默认值
    String name;
    int age;


//    static {
//        //代码块
//    }

    //main方法
    public static void main(String[] args) {
//        int a,b,c;
//        int a=1,b=2,c=3; //程序可读性
        int a = 1;
        int b = 2;
        int c = 3;
        String name = "xxx";
        char x = 'x';
        double pi = 3.14;

        //局部变量：必须声明和初始化值
        int i = 10;

        //变量类型 变量名 = new basic6_variable();
        Basic6_variable xx = new Basic6_variable();
        System.out.println(xx.age);
        System.out.println(xx.name);

        //类变量 static 在类中可以直接使用
        System.out.println(salary);//可以直接输出 如果把static去掉 就会报错

        System.out.println(PI);
        System.out.println(PII);
    }
    //其他方法
    public void add(){
    //没有static，属于对象 即类的实例，只有对象才可以调用，在类中不能直接使用
    }


}
