package com.javaStudy.week1.JavaOO.Demo06.src;

public class Car {
    String color;
    int speed;
    int seat = 5;

    public void run(){
        //默认会有一个this：当前正在执行这个方法的对象 是随动的
        //System.out.println(this);
        System.out.println(this.color);
        System.out.println(this.speed);
        System.out.println("车能跑");
    }

    public void fly(String color){
        System.out.println(color+"的车会飞");
        System.out.println(this.color+"的车会飞");
        //变量的查找顺序：先找自己方法内，如果自己没有，就去this里面找
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.color = "绿色";
        c.speed = 120;
        c.run();//在调用方法时 java会自动的把对象传递给方法，在方法中由this来接受对象
        System.out.println(c);
        //发现this和c是一样的

        Car c2 = new Car();
        c2.color = "红色";
        c2.speed = 180;
        c2.run();
        c2.fly("黑色");

        //this 可以帮助我们区分成员变量和局部变量
    }
}
