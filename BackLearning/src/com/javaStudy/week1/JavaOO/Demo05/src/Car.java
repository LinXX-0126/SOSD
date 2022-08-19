package com.javaStudy.week1.JavaOO.Demo05.src;

public class Car {
    //成员变量
    String color;//颜色
    int speed;//速度
    int seat = 5;//座位

    //成员方法
    public void run(){
        System.out.println("车能跑");
    }
    public static void main(String[] args) {
        // int a = 10; //写在方法里的变量，局部变量

        //创建对象
        //在面向对象的世界里 变量是没有市场的。这种变量被称为 引用
        //java分为两种数据类型：1.基本数据类型 2.引用数据类型 String黄和我们创建的所有的类 这是非常多的 因为我们可以随意定义它
        Car c = new Car(); //创建对象 要把对象保存起来 创建了一辆车 后面想用这辆车 就要使用“c”来访问

        //让车去跑
        // 对象或者引用.方法
        c.run(); // "."表示调用
        c.color = "绿色";
        c.seat = 4;
        c.speed = 120;
        //类中没有定义的内容不可以使用

        System.out.println(c.color);
        System.out.println(c.speed);
        System.out.println(c.seat);

        Car c2 = new Car();
        c2.color = "红色";
        c2.speed = 180;

        System.out.println(c.seat);
        System.out.println(c2.seat);




    }
}
