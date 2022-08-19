package com.javaStudy.week1.JavaOO.Demo07.src;

public class Car {

    String color;
    int speed;
    int seat = 5;

    //java会自动地赠送给每一个类一个无参数的构造方法
    //- public Car（）{
    //  sout
    //}

    public Car(String color,int speed){
        System.out.println("你好 我是构造方法");
    }
    public Car(String color,int speed,int seat){
        System.out.println("你好 我是构造方法重载");
    }

    public void run(){
        System.out.println(this.color+"车能跑");
    }

    public static void main(String[] args) {
        Car c1 = new Car("绿色",120,9);
      // c1.color = "绿";
        // c1.speed = 120;

        Car c2 = new Car("红色",180);
      //  c2.color = "红";
      //  c2.speed = 180;

        c1.run();
        c2.run();

        };
    }

