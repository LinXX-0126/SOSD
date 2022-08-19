package com.javaStudy.week1.JavaOO.Demo08.src;

public class Client {

    public static void main(String[] args) {
        Person p = new Person();

        //向上转型
        Animals ani1 = new Cat();
        Animals ani2 = new Dog();
        Animals ani3 = new Daxiang();

        p.feed(ani1);
        p.feed(ani2);
        p.feed(ani3);

        //向下转型
        Cat cc = (Cat) ani1;
        ((Cat) ani1).catchmouse();



    }
}
