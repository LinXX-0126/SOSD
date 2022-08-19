package com.javaStudy.week1.JavaOO.Demo08.src;

public class Person {
    public void feedDog(Dog d){
        System.out.println("人喂狗");
        d.eat();
    }

    public void feedCat(Cat c){
        System.out.println("人喂猫");
        c.eat();
    }

    public void feedDaxiang(Daxiang dx){
        System.out.println("人喂大象");
        dx.eat();
    }

    public void feed(Animals ani){
        System.out.print("人喂");
        ani.eat();

    }
}
